package Problems.Chapter05_InitialisationAndFinalize.Enum;

/**
 * Created by SashaKhyzhun on 1/6/17.
 */

// Ez enum
public enum Spiciness {
    NOT, MILD, MEDIUM, HOT, FLAMING
}


class SimpleEnumUse {
    public static void main(String[] args) {
        Spiciness howHot = Spiciness.MEDIUM;
        System.out.println(howHot);
    }
}

class EnumOrder {
    public static void main(String[] args) {
        for (Spiciness s : Spiciness.values()) {
            System.out.println(s + ", ordinal " + s.ordinal());
        }
    }
}


class Burrito {
    Spiciness degree;
    public Burrito(Spiciness degree) { this.degree = degree; }
    public void describe() {
        System.out.print("This burrito is ");
        switch (degree) {
            case NOT:
                System.out.println("not spicy at all");
                break;
            case MEDIUM:
                System.out.println("a little hot" );
                break;
            default:
                System.out.println("maybe too hot.");
        }
    }

    public static void main(String[] args) {
        Burrito plain      = new Burrito(Spiciness.NOT),
                greenChile = new Burrito(Spiciness.MEDIUM),
                jalapeno   = new Burrito(Spiciness.HOT);

        plain.describe();
        greenChile.describe();
        jalapeno.describe();
    }

}
