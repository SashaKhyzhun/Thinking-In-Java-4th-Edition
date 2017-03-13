package Problems.Chapter15_Generics.d_GenericInteface;

/**
 * @author SashaKhyzhun on 3/13/17.
 */
public class Fibonacci implements Generator<Integer> {

    private int count = 0;

    private int fib(int n) {
        //if (n < 2) return 1;
        //return fib(n-2) + fib(n-1);
        return (n < 2) ? 1 : fib(n-2) + fib(n-1);
    }

    @Override
    public Integer next() {
        return fib(count++);
    }

    public static void main(String[] args) {
        Fibonacci fibonacci = new Fibonacci();
        for (int i = 0; i < 18; i++) {
            System.out.print(fibonacci.next() + " ");
        }
    }

}
