package Problems.Chapter5_InitialisationAndFinalize;

/**
 * Created by SashaKhyzhun on 1/6/17.
 */

// Использование finalize() для выявления объекта,
// не осуществившего необходимой финализации.



class Book {
    private boolean checkedOut = false;

    Book(boolean checkOut) {
        checkedOut = checkOut;
    }

    void checkIn() {
        checkedOut = false;
    }

    public void finalize() {
        if (checkedOut) {
            System.out.println("Ошибка: checkedOut");
            // Обично это делается так:
            // Super.finalize(); // вызов версии базового класса
        }
    }

}

public class TerminationCondition {

    public static void main(String[] args) {
        Book novel = new Book(true);

        // правильная очистка:
        novel.checkIn();
        //novel.finalize();

        // Теряем ссылку, забыли про очистку:
        new Book(true);

        // Принудительная уборка мусора и финализация:
        System.gc();

    }

}
