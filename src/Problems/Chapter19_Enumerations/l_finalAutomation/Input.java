package Problems.Chapter19_Enumerations.l_finalAutomation;

import java.util.Random;

/**
 * @author SashaKhyzhun on 9/2/17.
 * Page 835.
 * Конечные автоматы.
 */
public enum Input {
    NICKEL(5), DIME(10), QUARTER(25), DOLLAR(100),
    TOOTHPASTE(200), CHIPS(75), SODA(100), SOAP(50),
    ABORT_TRANSACTION {
        public int amount() { // запрещенно
            throw new RuntimeException("ABORT.amount()");
        }
    },
    STOP { // Это должен быть последний экземпляр.
        public int amount() { // запрещенно
            throw new RuntimeException("SHUT_DOWN.amount()");
        }
    };

    int value; // в центах
    Input(int value) { this.value = value; }
    Input() {}
    int amount() {
        return value; // в центах
    }
    static Random rand = new Random(47);

    public static Input randomSelection() {
        // не включая STOP:
        return values()[rand.nextInt(values().length - 1)];
    }

}
