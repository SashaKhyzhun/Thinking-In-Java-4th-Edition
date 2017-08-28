package Problems.Chapter19_Enumerations.e_RealizationNotExtending;

/**
 * @author SashaKhyzhun on 8/28/17.
 * Page 820.
 */

enum Activity {
    SITTING, LYING, STANDING,
    HOPPING, RUNNING, DODGING,
    JUMPING, FALLING, FLYING
}

public class RandomTest {
    public static void main(String[] args) {
        for (int i = 0; i < 20; i++) {
            System.out.print(Enums.random(Activity.class) + ", ");
        }
    }
}
