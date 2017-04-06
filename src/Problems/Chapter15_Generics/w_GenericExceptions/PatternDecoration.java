package Problems.Chapter15_Generics.w_GenericExceptions;

import java.util.Date;

/**
 * @author SashaKhyzhun on 3/16/17. Page 579.
 * Использование паттерна "Декоратор".
 *
 * Если посмотреть на способ использования, концепция примеси кажется тесно связанной с паттерном
 * проектирования "Декоратор". Декораторы часто используются в ситуациях, когда для обеспечения всех
 * возможных комбинаций простое субклассирование порождает столько классов, что становится непрактичным.
 *
 * Паттерн <Декоратор> использует иерархию объектов для динамического и прозрачного добавления обязанностей
 * в отдельные объекты. Он определяет, что все объекты, являющиеся <обертками> для вашего исходного объекта,
 * обладают единым базовым интерфейсом.
 *
 * Имеется декорируемый объект, а вы наращиваете его функциональность посредством добавления «оберток».
 * Это делает использование декораторов прозрачным - имеется общий набор сообщений, которые могут отправляться
 * объекту независимо от того, был он декорирован или нет. Декорирующий класс может добавлять методы, но,
 * как вы вскоре увидите, в этом его возможности ограниченны.
 *
 * Декораторы реализуются с использованием композиции и формальных структур (иерархия
 * декорируемый объект/декоратор), тогда как примеси основываются на наследовании.
 *
 * Таким образом, примеси, основанные на параметризованном типе, можно рассматривать как
 * обобщенный механизм декораторов, не требующий структуры наследования паттерна «Декоратор.
 */

class BasicYO {
    private String value;
    public void set(String value) {
        this.value = value;
    }
    public String get() {return value;}
}
class Decorator extends BasicYO {
    protected BasicYO basic;
    public Decorator(BasicYO basic) {
        this.basic = basic;
    }
    public void set(String val) {
        basic.set(val);
    }
    public String get() {
        return basic.get();
    }
}
class TimeStampedYO extends Decorator {
    private final long timeStamp;
    public TimeStampedYO(BasicYO basic) {
        super(basic);
        timeStamp = new Date().getTime();
    }
    public long getStamp() { return timeStamp; }
}

class SerialNumberedYO extends Decorator {
    private static long count = 1;
    private final long serialNumber = count++;
    public SerialNumberedYO(BasicYO basic) {
        super(basic);
    }
    public long getSerialNumber() { return serialNumber; }
}

public class PatternDecoration {

    public static void main(String[] args) {
        // с помощю декоратора доступны только методы посделнего уровня (BasicYO)
        TimeStampedYO t = new TimeStampedYO(new BasicYO());
        TimeStampedYO t2 = new TimeStampedYO(new SerialNumberedYO(new BasicYO()));
        //! t2.getSerialNumbered(); // не доступно

        SerialNumberedYO s = new SerialNumberedYO(new BasicYO());
        SerialNumberedYO s2 = new SerialNumberedYO(new TimeStampedYO(new BasicYO()));
        //! s2.getStamp(); // не доступно

    }


}
