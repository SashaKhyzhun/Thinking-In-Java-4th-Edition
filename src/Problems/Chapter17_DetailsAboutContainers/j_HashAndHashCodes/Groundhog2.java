package Problems.Chapter17_DetailsAboutContainers.j_HashAndHashCodes;

/**
 * @author SashaKhyzhun on 5/18/17. Page 676.
 * Класс, используемый в качестве ключа HashMap,
 * должен переопределять hashCode() и equals().
 */
public class Groundhog2 extends Groundhog {

    public Groundhog2(int number) {
        super(number);
    }

    @Override
    public int hashCode() {
        return number;
    }

    @Override
    public boolean equals(Object obj) {
        return obj instanceof Groundhog2 && (number == ((Groundhog2)obj).number);
    }

}
