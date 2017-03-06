package Problems.Chapter12_Exceptions.a_CustomExceptions;

/**
 * Created by SashaKhyzhun on 3/3/17. Page 371.
 * Создание собственного класса исключения.
 */

class SimpleException extends Exception {}


public class InheritingExceptions {

    public void f() throws SimpleException {
        System.out.println("Возбуждаем SimpleException из f()");
        throw new SimpleException();
    }

    public static void main(String[] args) {
        InheritingExceptions sed = new InheritingExceptions();
        try {
            sed.f();
        } catch (SimpleException e) {
            System.out.println("Перехвачено!");
        }
    }

}
