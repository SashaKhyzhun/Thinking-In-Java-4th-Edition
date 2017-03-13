package Problems.Chapter15_Generics.h_AnonymousInnerClasses;

import Problems.Chapter15_Generics.d_GenericInteface.Generator;
import Problems.Chapter15_Generics.f_GenericVarargs.Generators;

import java.util.*;

/**
 * @author SashaKhyzhun on 3/13/17. Page 523.
 */

// Очень простая модель кассира.

class Customer {
    private static long count = 1;
    private final long id = count++;
    private Customer() {}
    public String toString() {
        return "Customer " + id;
    }

    public static Generator<Customer> generator() {
        return new Generator<Customer>() {
            @Override
            public Customer next() {
                return new Customer();
            }
        };
    }
}

class Teller {
    private static long count = 1;
    private final long id = count++;
    private Teller() {}
    public String toString() {
        return "Teller " + id;
    }

    public static Generator<Teller> generator() {
        return new Generator<Teller>() {
            @Override
            public Teller next() {
                return new Teller();
            }
        };
    }
}

public class BankTeller {

    public static void serve(Teller t, Customer c) {
        System.out.println(t + " serves " + c);
    }

    public static void main(String[] args) {
        Random random = new Random(47);

        Queue<Customer> line = new LinkedList<Customer>();
        Generators.fill(line, Customer.generator(), 15);

        List<Teller> tellers = new ArrayList<Teller>();
        Generators.fill(tellers, Teller.generator(), 4);

        for (Customer customer : line) {
            serve(tellers.get(random.nextInt(tellers.size())), customer);
        }

    }
}

