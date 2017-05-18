package Problems.Chapter17_DetailsAboutContainers.j_HashAndHashCodes;

/**
 * @author SashaKhyzhun on 5/18/17. Page 674.
 * Хеширование и хеш-коды.
 *
 */

// выглядит весьма правдоподобно, но не работает (пример).
public class Groundhog {

    protected int number;

    public Groundhog(int number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "Groundhog #" + number;
    }

}
