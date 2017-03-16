package Problems.Chapter15_Generics.w_GenericExceptions;

import java.util.Date;

/**
 * @author SashaKhyzhun on 3/16/17. Page 576.
 * Примеси.
 *
 * Похоже, со временем термин «примесь» (mixin) обрел много разных значений, но основной смысл
 * подразумевает смешение функциональности нескольких классов для получения итогового класса,
 * представляющего все типы примесей.
 *
 * Часто это делается в последнюю минуту, что позволяет легко и быстро объединять классы.
 * Одна из полезных особенностей примесей заключается в том, что они единообразно применяют
 * характеристики и поведение нескольких классов. Кроме того, если вы захотите что-то изменить
 * в классе примеси, эти изменения распространяются по всем классам, к которым применяется примесь.
 *
 * По этой причине примеси в определенном смысле связаны с аспектно-ориентированным
 * программированием (АОП), а аспекты часто рекомендуют для решения проблемы примесей.
 */

// Примеси с использованием интерфейсов

interface TimeStamped { long getStamp(); }
interface SerialNumbered { long getSerialNumber(); }
interface Basic { void set(String val); String get(); }

class TimeStampedImp implements TimeStamped {
    private final long timeStamp;
    public TimeStampedImp() {
        timeStamp = new Date().getTime();
    }
    @Override public long getStamp() { return timeStamp; }
}

class SerialNumberedImp implements SerialNumbered {
    private static long counter = 1;
    private final long serialNumber = counter++;
    @Override public long getSerialNumber() {
        return serialNumber;
    }
}

class BasicImp implements Basic {
    String value;
    @Override public void set(String val) { value = val; }
    @Override public String get() { return value; }
}

class Mixin extends BasicImp implements TimeStamped, SerialNumbered {
    private TimeStamped timeStamped = new TimeStampedImp();
    private SerialNumbered serialNumbered = new SerialNumberedImp();
    @Override public long getStamp() { return timeStamped.getStamp(); }
    @Override public long getSerialNumber() { return serialNumbered.getSerialNumber(); }
}
public class Mixins {
    public static void main(String[] args) {
        Mixin mixin1 = new Mixin(), mixin2 = new Mixin();
        mixin1.set("test String 1"); // мы extend-им класс BasicImp и это
        mixin2.set("test String 2"); // дает возможность дергать его методы
        System.out.println(mixin1.get() + " " + mixin1.getStamp() + " " + mixin1.getSerialNumber());
        System.out.println(mixin2.get() + " " + mixin2.getStamp() + " " + mixin2.getSerialNumber());
    }
    /**
     * Класс Mixin фактически использует делегирование, так что каждый примесный тип требует поля в Mixin,
     * и вы должны написать все необходимые методы в Mixin для передачи вызовов соответствующим объектам.
     * В этом примере используются тривиальные классы, но при более сложных примесях код быстро разрастается.
     */
}
