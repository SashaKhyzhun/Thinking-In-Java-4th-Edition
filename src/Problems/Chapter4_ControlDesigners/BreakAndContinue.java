package Problems.Chapter4_ControlDesigners;



import java.util.stream.IntStream;

/**
 * Created by SashaKhyzhun on 1/6/17.
 */

// Приминение ключевых слов break и continue на примере for и foreach

public class BreakAndContinue {

    public static void main(String[] args) {

        for (int i = 0; i < 100; i++) {
            if (i == 74) break;
            if (i % 9 != 0) continue;
            System.out.print(i + " ");
        }

        System.out.println();


        /////////////////////////////////////////////////
        int[] range = new int[100];
        for (int j = 0; j <= 99; j++) { range[j] = j; }
        /////////////////////////////////////////////////

        for (int i : range) {
            if (i == 74) break;
            if (i % 9 != 0) continue;
            System.out.print(i + " ");
        }

        System.out.println();

        int i = 0;
        while (true) {
            i++;
            int j = i * 27;
            if (j == 1269) break;
            if (i % 10 != 0) continue;
            System.out.print(i + " ");
        }
    }


}
