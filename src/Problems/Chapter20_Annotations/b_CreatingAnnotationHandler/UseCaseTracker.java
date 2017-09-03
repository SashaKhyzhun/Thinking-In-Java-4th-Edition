package Problems.Chapter20_Annotations.b_CreatingAnnotationHandler;

import Problems.Chapter20_Annotations.a_BasicSyntax.PasswordUtils;
import Problems.Chapter20_Annotations.a_BasicSyntax.UseCase;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author SashaKhyzhun on 9/3/17.
 * Page 853.
 */
public class UseCaseTracker {

    public static void trackUseCases(List<Integer> useCases, Class<?> cl) {
        for (Method m : cl.getMethods()) {
            UseCase us = m.getAnnotation(UseCase.class);
            if (us != null) {
                System.out.println("Found Use Case: " + us.id()
                        + " " + us.description());
                useCases.remove(new Integer(us.id()));
            }
        }
        for (int i : useCases) {
            System.out.println("Warning: Missing use case-" + i);
        }
    }

    public static void main(String[] args) {
        List<Integer> useCases = new ArrayList<>();
        Collections.addAll(useCases, 47, 48, 49, 50);
        trackUseCases(useCases, PasswordUtils.class);
    }

}
