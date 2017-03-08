package Problems.Chapter12_Exceptions.l_Constructors;

/**
 * Created by SashaKhyzhun on 3/9/17. Page 400.
 * За созданием каждого обьета, нуждающегося в завершении,
 * должна следовать конструкция try - finally.
 */

class NeedsCleanup {
    private static long counter = 1;
    private final long id = counter++;
    public void dispose() {
        System.out.println("NeedsCleanup " + id + " освобожден");
    }
}

class ConstructionException extends Exception {}

class NeedsCleanup2 extends NeedsCleanup {
    // Возможны ошибки при конструировании:
    public NeedsCleanup2() throws ConstructionException {}
}

public class CleanupIdiom {
    public static void main(String[] args) {
        // Part 1:
        NeedsCleanup nc1 = new NeedsCleanup();
        try {
            //...
        } finally {
            nc1.dispose();
        }

        // Part 2:
        // Если ошибки конструирования невозможны, объекты можно группировать:
        NeedsCleanup nc2 = new NeedsCleanup();
        NeedsCleanup nc3 = new NeedsCleanup();
        try {
            //...
        } finally {
            nc3.dispose(); // обратный порядок конструирования
            nc2.dispose();
        }

        // Part 3:
        // Если при конструировании возможны ошибки, необходимо защитить каждую операцию:
        NeedsCleanup nc4 = new NeedsCleanup();
        try {
            NeedsCleanup nc5 = new NeedsCleanup();
            try {
                //...
            } finally {
                nc5.dispose();
            }
            //} catch (ConstructionException e) { // Construction nc5
            //    System.out.println(e);

        //} catch (ConstructionException e) { // Construction nc4
        //    System.out.println(e);
        //}
        } finally {
            nc4.dispose();
        }
    }
}
