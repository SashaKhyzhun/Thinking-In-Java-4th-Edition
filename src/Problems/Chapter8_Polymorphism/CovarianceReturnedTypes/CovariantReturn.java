package Problems.Chapter8_Polymorphism.CovarianceReturnedTypes;

/**
 * Created by SashaKhyzhun on 1/5/17.
 */

/**
 * В Java SE5 появилсась концепция "ковариантрости возвращаемых типов";
 * Этот термин означает, что переопределенный метод производного класса
 * может вернуть тип, производный от типа, возвращаемого методом базового класса.
 */


class Grain {
    public String toString() { return "Grain"; }
}

class Wheat extends Grain {
    public String toString() { return "Wheat"; }
}

class Mill {
    Grain process() { return new Grain(); }
}

class WheatMill extends Mill {
    Wheat process() { return new Wheat(); }
}

public class CovariantReturn {
    public static void main(String[] args) {
        Mill m = new Mill();
        Grain g = m.process();
        System.out.println(g); // Grain

        Mill m2 = new WheatMill();
        Grain g2 = m2.process();
        System.out.println(g2); // Wheat
    }

}
