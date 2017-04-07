package Problems.Chapter09_Interfaces.a_BeginExamples.ExampleAbstractWithInstruments;

/**
 * Created by SashaKhyzhun on 1/8/17.
 */

// Старый пример в новом виде.
// Абстрактные классы и методы.


abstract class Instrument {
    private int i; // Память выделяется для каждого объекта
    public abstract void play (String note);
    public String what () { return "Instrument"; }
    public abstract void adjust ();
}



class Wind extends Instrument {

    @Override
    public void play(String note) {
        System.out.println("Wind.play() " + note);
    }

    @Override
    public void adjust() {}

    public String what () { return "Wind"; }
}

class Percussion extends Instrument {

    @Override
    public void play(String note) {
        System.out.println("Percussion.play() " + note);
    }

    @Override
    public void adjust() {

    }

    public String what () { return "Percussion"; }
}

class Stringed extends Instrument {
    @Override
    public void play(String note) {
        System.out.println("Stringed.play() " + note);
    }

    @Override
    public void adjust() {

    }

    public String what () { return "Stringed"; }
}

class Brass extends Wind {
    public void play (String note) {
        System.out.println("Brass.play() " + note);
    }
    public void adjust () {
        System.out.println("Brass.adjust()");
    }
}

class Woodwind extends Wind {
    public void play (String note) {
        System.out.println("Woodwind.play() " + note);
    }
    public String what() { return "woodwind"; }
}



public class Music4 {
    // Работа метода не зависит от фактического типа объекта, поэтому типы,
    // добавленные в систему, будуть работыть правильно.

    static void tune(Instrument i) {
        i.play("Middle_C");
    }
    static void tuneAll(Instrument[] e) {
        for (Instrument i : e) {
            tune(i);
        }
    }

    public static void main(String[] args) {
        // Восходящее преобразование при добавлении в массив:
        Instrument[] orchestra = {
                new Wind(),
                new Percussion(),
                new Stringed(),
                new Brass(),
                new Woodwind()
        };
        tuneAll(orchestra);
    }

}
