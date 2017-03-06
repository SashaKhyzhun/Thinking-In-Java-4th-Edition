package Problems.Chapter12_Exceptions.k_ExceptionLimit;

/**
 * Created by SashaKhyzhun on 3/6/17. Page 394.
 * При переопределение метода вы вправе возбуждать только те исключения, которые
 * были описаны в методе базового класса. Это полезное ограничение ознаачет, что
 * программа, работающая с базовым классом, автоматически сможет работать и с объектом,
 * произошедшим от базового (конечно, это фундаментальный принцип ООП), включая и исключения.
 *
 * Следующий пример демонстрирует виды ограничений (во время компиляции)? наложенные на исключения:
 */

class BaseballException extends Exception {}
class Strike extends BaseballException {}
class Foul   extends BaseballException {}

abstract class Inning {
    public Inning() throws BaseballException {}
    public void event() throws BaseballException {
        // фактически возбуждать исключение не нужно
    }
    public abstract void atBat() throws Strike, Foul;
    public void walk() {} // Не возбуждает контролируемых исключений
}

class StormException extends Exception {}
class RainedOut extends StormException {}
class PopFoul extends Foul {}

interface Storm {
    public void event() throws RainedOut;
    public void rainHard() throws RainedOut;
}

class StormyInning extends Inning implements Storm {
    // можно добавлять новые исключения для конструкторов,
    // но вы должны обработать и исключения базового конструктора:
    public StormyInning() throws RainedOut, BaseballException {
        super();
    }
    public StormyInning(String s) throws RainedOut, BaseballException {}

    // обычные методы должны соответствовать правилам базового класса:
    // ! void walk() throws PopFoul {} // ошибка компиляции
    @Override
    public void walk() {
        super.walk();
    }

    // Интерфейс НЕ МОЖЕТ добавлять исключения к существующим методам базового класса:
    // ! public void event() throws RainedOut {}
    // Вы можете не возбуждать исключений вообще, даже если базовая версия это делает:
    @Override
    public void event() {}

    // Если метод не был определен в базовом классе, исключения допускается:
    public void rainHard() throws RainedOut {}

    // Переопределенные методы могут возбуждать унаследованные ислючения:
    @Override
    public void atBat() throws Strike, Foul {}

    public static void main(String[] args) {
        try {
            StormyInning si = new StormyInning();
            si.atBat();
        } catch (PopFoul e) {
            System.out.println("PopFoul");
        } catch (RainedOut e) {
            System.out.println("RainedOut");
        } catch (BaseballException e) {
            System.out.println("BaseballException");
        }

        // Strike не возбуждается в унаследованной версии.

        try {
            // Что произойдет при восходящем преобразовании???
            Inning i = new StormyInning();
            i.atBat();
            // Вы должны перехватывать исключения из базовой версии метода:
        } catch (Strike e) {
            System.out.println("Strike");
        } catch (Foul e) {
            System.out.println("Foul");
        } catch (RainedOut e) {
            System.out.println("RainedOut");
        } catch (BaseballException e) {
            System.out.println("Общее исключение");
        }


    }

}
