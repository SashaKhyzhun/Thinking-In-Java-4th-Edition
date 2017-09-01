package Problems.Chapter19_Enumerations.h_UsingEnumSet;

import java.util.EnumSet;

import static Problems.Chapter19_Enumerations.h_UsingEnumSet.AlarmPoints.*;

/**
 * @author SashaKhyzhun on 9/1/17.
 * Page 825.
 */
public class EnumSets {

    public static void main(String[] args) {
        EnumSet<AlarmPoints> points =
                EnumSet.noneOf(AlarmPoints.class); // пустое множество

        points.add(BATHROOM);
        System.out.println(points);

        points.addAll(EnumSet.of(STAIR1, STAIR2, KITCHEN));
        System.out.println(points);

        points.removeAll(EnumSet.of(STAIR1, STAIR2, KITCHEN));
        System.out.println(points);

        points.removeAll(EnumSet.range(OFFICE1, OFFICE4));
        System.out.println(points);

        points = EnumSet.complementOf(points);
        System.out.println(points);

    }

}
