package Problems.Chapter12_Exceptions.i_FinishingWithFinally;

/**
 * Created by SashaKhyzhun on 3/6/17. Page 390.
 * Блок Finally используется, когда вам необходимо вернуть в первоначальное состояние
 * не память, а что-то другое. Это может быть к примеру открытый файл или сетевое
 * соединение, результат графического вывода на экран или даже какие-то внешние
 * операции, наподобие представленных в следующем примере:
 */
public class Switch {
    private boolean state = false;
    public boolean read() { return state; }
    public void on()  { state = true;  System.out.println(this); }
    public void off() { state = false; System.out.println(this); }
    public String toString() { return state ? "вкл" : "выкл"; }
}

class OnOffException1 extends Exception {}
class OnOffException2 extends Exception {}

class OnOffSwitch {
    private static Switch sw = new Switch();

    public static void f() throws OnOffException1, OnOffException2 {}

    public static void main(String[] args) {
        try {
            sw.on();
            // код, который может возбуждать исключения...
            f();
            sw.off();
        } catch (OnOffException1 e1) {
            System.out.println("onOffException1");
            //sw.off(); может этого исключения и не быть
        } catch (OnOffException2 e2) {
            System.out.println("onOffException1");
            //sw.off(); может этого исключения и не быть
        } finally {
            sw.off();
        }
    }
}
