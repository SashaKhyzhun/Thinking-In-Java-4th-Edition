package Problems.Chapter13_Strings.k_ScanningTheText;

import java.util.Scanner;

/**
 * Created by SashaKhyzhun on 3/10/17.
 */
public class BetterRead {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(SimpleRead.input);

        System.out.println("What is your name?");
        String name = scanner.nextLine();
        System.out.println(name);

        System.out.println("How old are you? What is your favorite double?");
        int age = scanner.nextInt();
        double favorite = scanner.nextDouble();
        System.out.println(age);
        System.out.println(favorite);

        System.out.printf("Hi %s.\n", name);
        System.out.printf("In 5 years you will be %d.\n", age + 5);
        System.out.printf("My favorite double is %f.", favorite / 2);

    }
}
