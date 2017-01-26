package Problems.Chapter10_InnerСlasses.m_ControlFramework;

/**
 * Created by SashaKhyzhun on 1/25/17. Page 312
 * Общение для всякого управляющего события методы.
 */


public abstract class Event {

    private long eventTime;
    protected final long delayTime;

    public Event(long delayTime) {
        this.delayTime = delayTime;
        start();
    }

    public void start() { // С возможностью перезапуска
        eventTime = System.nanoTime() + delayTime;
    }

    public boolean ready() {
        return System.nanoTime() >= eventTime;
    }

    public abstract void action();

} ///:~
