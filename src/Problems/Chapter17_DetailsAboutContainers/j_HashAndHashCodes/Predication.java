package Problems.Chapter17_DetailsAboutContainers.j_HashAndHashCodes;

import java.util.Random;

/**
 * @author SashaKhyzhun on 5/18/17. Page 675.
 * Прогнозирование погоды по поведению сурка.
 */
public class Predication {
    private static Random random = new Random(47);
    private boolean shadow = random.nextDouble() > 0.5;

    @Override
    public String toString() {
        return shadow ? "Six more weeks of Winter!" : "Early Spring!";
    }

}
