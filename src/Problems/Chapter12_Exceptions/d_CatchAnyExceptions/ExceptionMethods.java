package Problems.Chapter12_Exceptions.d_CatchAnyExceptions;

/**
 * Created by SashaKhyzhun on 3/6/17.
 */
public class ExceptionMethods {

    public static void main(String[] args) {
        try {
            throw new Exception("Мое исключение");
        } catch (Exception e) {
            System.out.println("Перехвачено");
            System.out.println("getMessage(): " + e.getMessage());
            System.out.println("getLocalizedMessage(): " + e.getLocalizedMessage());
            System.out.println("toString(): " + e.toString());
            System.out.println("printStackTrace(): ");
            e.printStackTrace();
        }
    }

}
