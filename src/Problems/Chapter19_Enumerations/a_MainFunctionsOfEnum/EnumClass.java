package Problems.Chapter19_Enumerations.a_MainFunctionsOfEnum;

/**
 * @author SashaKhyzhun on 8/28/17.
 * Page 812.
 * Возможности класса Enum
 */

enum Shrubbery {
    GROUND, CRAWLING, HANGING
}
public class EnumClass {
    public static void main(String[] args) {
        for (Shrubbery shrubbery : Shrubbery.values()) {
            System.out.println(shrubbery + " ordinal: " + shrubbery.ordinal());
            System.out.println("compareTo: " + shrubbery.compareTo(Shrubbery.CRAWLING) + " ");
            System.out.println("equals: " + shrubbery.equals(Shrubbery.CRAWLING) + " ");
            System.out.println("== : " + (shrubbery == (Shrubbery.CRAWLING)));
            System.out.println("declaringClass: " + shrubbery.getDeclaringClass());
            System.out.println("name: " + shrubbery.name());
            System.out.println("-----------------------------------");
        }

        // Получить значене из перечисления по строковому имени:
        for (String s : "HANGING CRAWLING GROUND".split(" ")) {
            Shrubbery shrubbery = Enum.valueOf(Shrubbery.class, s);
            System.out.println(shrubbery);
        }
    }
}
