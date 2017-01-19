package Problems.Chapter10_InnerСlasses.i_ClassesInsideTheInterfaces;

/**
 * Created by SashaKhyzhun on 1/20/17. Page 305
 * ReadMe.7 + Вы даже можете реализовать окружающий интерфейс во внутреннем класс
 */

// {main: ClassInterface$Test}

public interface ClassInInterface {
    void howdy();

    class Test implements ClassInInterface {
        @Override
        public void howdy() {
            System.out.println("Hello!");
        }

        public static void main(String[] args) {
            new Test().howdy();
        }
    }
}
