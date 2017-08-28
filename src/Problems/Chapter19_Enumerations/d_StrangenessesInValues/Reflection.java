package Problems.Chapter19_Enumerations.d_StrangenessesInValues;

import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.Set;
import java.util.TreeSet;

/**
 * @author SashaKhyzhun on 8/28/17.
 * Page 817.
 * Странности values();
 *
 * Анализ перечислений с использованием отражения.
 */

enum Explore { HERE, THERE }


public class Reflection {

    public static Set<String> analyze(Class<?> enumClass) {
        System.out.println("----- Analyzing " + enumClass + " -----");
        System.out.println("Interfaces:");
        for (Type type : enumClass.getTypeParameters()) {
            System.out.println(type);
        }

        System.out.println("Base: " + enumClass.getSuperclass());

        System.out.println("Methods: ");
        Set<String> methods = new TreeSet<>();
        for (Method method : enumClass.getMethods()) {
            methods.add(method.getName());
        }
        System.out.println(methods);


        return  methods;
    }

    public static void main(String[] args) {
        Set<String> exploreMethods = analyze(Explore.class);
        Set<String> enumMethods = analyze(Enum.class);

        System.out.println("Explore.containsAll(Enum)? " + exploreMethods.containsAll(enumMethods));
        System.out.println("Explore.removeAll(Enum): ");

        exploreMethods.removeAll(enumMethods);
        System.out.println(exploreMethods);

        // Decompile the code for the enum:
        //OSExecute.command("javap Explore");

    }

}
