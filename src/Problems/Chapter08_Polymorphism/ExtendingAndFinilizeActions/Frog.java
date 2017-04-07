package Problems.Chapter08_Polymorphism.ExtendingAndFinilizeActions;

/**
 * Created by SashaKhyzhun on 1/5/17.
 */

/* Наследование и завершающие действия на примере метода dispose() */

/**
 * Очередность завершения должна быть обратной порядку инициализации
 * в том случаи, если объекты зависят друг от друга. И это наш случий.
 *
 * т.е.: создаем 1-2-3-4-5-6-7-8-9, а уничтожаем 9-8-7-6-5-4-3-2-1.
 */

class Characteristic {
    private String s;
    Characteristic(String s) {
        this.s = s;
        System.out.println("\nСоздаем Characteristic " + s);
    }
    protected void dispose() {
        System.out.println("\nЗавершаем Characteristic " + s);
    }
}

class Description {
    private String s;
    Description(String s) {
        this.s = s;
        System.out.println("Создаем Description " + s);
    }
    protected void dispose() {
        System.out.println("Завершаем Description " + s);
    }
}

// Живое существо
class LivingCreature {
    private Characteristic c = new Characteristic("живое существо");
    private Description    d = new Description("обычное живое существо");
    LivingCreature() {
        System.out.println("LivingCreature()");
    }
    protected void dispose() {
        System.out.println("dispose() в LivingCreature");
        c.dispose();
        d.dispose();
    }
}

// Животное
class Animal extends LivingCreature {
    private Characteristic c = new Characteristic("имеет сердце");
    private Description    d = new Description("животное, не растение");
    Animal() {
        System.out.println("Animal()");
    }
    protected void dispose() {
        System.out.println("dispose() в Animal");
        c.dispose();
        d.dispose();
        super.dispose();
    }
}

// Земноводное
class Amphibian extends Animal {
    private Characteristic c = new Characteristic("может жить в воде");
    private Description    d = new Description("и в воде, и на земле");
    Amphibian() {
        System.out.println("Amphibian()");
    }
    protected void dispose() {
        System.out.println("dispose() в Amphibian");
        c.dispose();
        d.dispose();
        super.dispose();
    }
}

// Лягушка
public class Frog extends Amphibian {
    private Characteristic c = new Characteristic("квакает");
    private Description    d = new Description("ест жуков");
    public Frog() {
        System.out.println("Frog()");
    }

    protected void dispose() {
        System.out.println("завершение Frog");
        c.dispose();
        d.dispose();
        super.dispose();
    }

    public static void main(String[] args) {
        Frog frog = new Frog();
        System.out.println("\nПока!");
        frog.dispose();
    }


}
