package Problems.Chapter13_Strings.d_Formatter;

import java.io.PrintStream;
import java.util.Formatter;

/**
 * Created by SashaKhyzhun on 3/9/17. Page 422.
 * Класс Formatter можно рассматривать как преобразователь, приводящий форматную строку и
 * данные к нужному результату. При создании объекта Formatter вы сообщаете ему, куда
 * следует выдать результат, передавая эту информацию конструтору.
 */
public class Turtle {

    private String name;
    private Formatter formatter;

    public Turtle(String name, Formatter formatter) {
        this.name = name;
        this.formatter = formatter;
    }

    public void move(int x, int y) {
        formatter.format("%s The Turtle is at (%d,%d)\n", name, x, y);
        //                 |____________________|__|________|   |  |
        //                                      |  |____________|  |
        //                                      |__________________|
    }

    public static void main(String[] args) {
        PrintStream outAlias = System.out;
        Turtle tommy = new Turtle("Tommy", new Formatter(System.out));
        Turtle terry = new Turtle("Terry", new Formatter(outAlias));

        tommy.move(0, 0);
        terry.move(4, 8);
        tommy.move(3, 4);
        terry.move(2, 5);
        tommy.move(3, 3);
        terry.move(3, 3);
    }

}
