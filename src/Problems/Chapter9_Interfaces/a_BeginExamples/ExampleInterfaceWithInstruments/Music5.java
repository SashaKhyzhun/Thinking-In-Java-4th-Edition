package Problems.Chapter9_Interfaces.a_BeginExamples.ExampleInterfaceWithInstruments;

/**
 * Created by SashaKhyzhun on 1/8/17.
 */

// Старый пример в новом виде.
// Абстрактные классы и методы.


interface Instrument {
    // Констранта времени компиляции:
    int VALUE = 5; // является и static, и final
    // Определения методов недопустимы:
    void play (String note); // Автоматически объявлен как public
    void adjust ();
}


class Wind implements Instrument {

    public void play(String note) {
        System.out.println(this + ".play() " + note);
    }

    public String toString() { return "Wind"; }

    public void adjust() {
        System.out.println(this + ".adjust()");
    }
}

class Percussion implements Instrument {

    public void play(String note) {
        System.out.println(this + ".play() " + note);
    }

    public String toString() { return "Percussion"; }

    public void adjust() {
        System.out.println(this + ".adjust()");
    }
}

class Stringed implements Instrument {

    public void play(String note) {
        System.out.println(this + ".play() " + note);
    }

    public String toString() { return "Stringed"; }

    public void adjust() {
        System.out.println(this + ".adjust()");
    }
}

class Brass extends Wind {
   public String toString() { return "Brass"; }
}

class Woodwind extends Wind {
    public String toString () {
        return "woodwind";
    }
}


public class Music5 {
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
