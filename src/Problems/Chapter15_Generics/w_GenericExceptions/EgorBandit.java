package Problems.Chapter15_Generics.w_GenericExceptions;

/**
 * @author SashaKhyzhun on 4/3/17.
 */
public class EgorBandit {

    private static int lolKekCheburek(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {

        System.out.println("before lol kek cheburek");

        try {
            System.out.println("before mock exception");

            int result = lolKekCheburek(228, Integer.parseInt("qwerty"));

            System.out.println("after mock exception");

        } catch (NumberFormatException e) {
            System.out.println("Cache block, allo");
            e.printStackTrace();
        } finally {
            System.out.println("finally block allo");
        }



    }

}
