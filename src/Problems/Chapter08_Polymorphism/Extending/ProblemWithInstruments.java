package Problems.Chapter08_Polymorphism.Extending;

/**
 * Created by SashaKhyzhun on 1/4/17.
 */

// Расширяемая программа 

class Instrument {
    void play(String note) { System.out.println("Instrument.play() " + note); }
    String what() { return "Instrument"; }
    void adjust() { System.out.println("Adjusting Instrument"); }
}

class Wind extends Instrument {
    void play(String note) { System.out.println("Wing.play() " + note); }
    String what() { return "Wind"; }
    void adjust() { System.out.println("Adjusting Wind"); }
}

class Percussion extends Instrument {
    void play(String note) { System.out.println("Percussion.play() " + note); }
    String what() { return "Percussion"; }
    void adjust() { System.out.println("Adjusting Percussion"); }
}

class Stringed extends Instrument {
    void play(String note) { System.out.println("Stringed.play() " + note); }
    String what() { return "Stringed"; }
    void adjust() { System.out.println("Adjusting Stringed"); }
}

class Brass extends Wind {
    void play(String note) { System.out.println("Brass.play() " + note); }
    void adjust() { System.out.println("Adjusting Brass"); }
}

class Woodwind extends Wind {
    void play(String note) { System.out.println("Woodwind.play() " + note); }
    void adjust() { System.out.println("Adjusting Woodwind"); }
}


public class ProblemWithInstruments {

    // Работа метода не зависит от фактического типа объекта, поэтому типы,
    // добавленные в систему будуть работать правильно:
    public static void tune(Instrument i) {
        //...
        i.play("Note.MIDDLE_C");
    }

    public static void tuneAll(Instrument[] e) {
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
