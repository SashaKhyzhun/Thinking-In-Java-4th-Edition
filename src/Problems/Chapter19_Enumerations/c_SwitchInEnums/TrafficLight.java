package Problems.Chapter19_Enumerations.c_SwitchInEnums;

/**
 * @author SashaKhyzhun on 8/28/17.
 * Page 816.
 * Перечисления в командах switch
 *
 * Important: свитч не жалуется на отсутствие секции Default
 * и даже не будет жаловатся на отсутствие любой секции case.
 */

enum Signal { GREEN, YELLOW, RED, }

public class TrafficLight {
    Signal color = Signal.RED;

    public void change() {
        switch (color) {
            // Обратите внимание: в секции case
            // не обязательно использовать запись Signal.RED:
            case RED:       color = Signal.GREEN;
                            break;
            case GREEN:     color = Signal.YELLOW;
                            break;
            case YELLOW:    color = Signal.RED;
                            break;
            default:        color = Signal.RED;
                            break;
        }
    }


    @Override
    public String toString() {
        return "The traffic light is " + color;
    }

    public static void main(String[] args) {
        TrafficLight t = new TrafficLight();
        for (int i = 0; i < 7; i++) {
            System.out.println(t);
            t.change();
        }
    }
}
