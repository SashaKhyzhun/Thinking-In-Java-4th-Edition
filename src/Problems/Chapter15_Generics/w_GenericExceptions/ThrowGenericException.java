package Problems.Chapter15_Generics.w_GenericExceptions;

import java.util.ArrayList;
import java.util.List;

/**
 * @author SashaKhyzhun on 3/16/17. Page 575.
 * Исключения.
 *
 * Из-за стирания возможности использования обобщений с исключениями сильно ограниченны.
 * Блок catch не может перехватывать исключение обобщенного типа, потому что тип исключения должен
 * быть известен и во время компиляции, и во время выполнения. Кроме того, обобщенный класс не может
 * прямо или косвенно наследовать от ThrowaЫe (это препятствует определению обобщенных исключений, которые
 * невозможно перехватить).
 *
 * Однако параметрытипы могут использоваться в секции throws объявления метода.
 * Это позволяет писать обобщенный код, изменяемый по типу контролируемого исключения:
 */
interface Processor<T, E extends Exception> {
    void process(List<T> resultCollector) throws E;
}
class Failure1 extends Exception {}
class Failure2 extends Exception {}

class ProcessRunner<T, E extends Exception> extends ArrayList<Processor<T, E>> {

    List<T> processAll() throws E {
        List<T> resultCollector = new ArrayList<T>();
        for (Processor<T, E> processor : this) {
            processor.process(resultCollector);
        }
        return resultCollector;
    }
}

class Processor1 implements Processor<String, Failure1> {
    static int count = 3;
    @Override
    public void process(List<String> resultCollector) throws Failure1 {
        if (count-- > 1) {
            resultCollector.add("HEP!");
        } else {
            resultCollector.add("HOP!");
        }
        if (count < 0) { throw new Failure1(); }
    }
}

class Processor2 implements Processor<Integer, Failure2> {
    static int count = 2;
    @Override
    public void process(List<Integer> resultCollector) throws Failure2 {
        if (count-- == 0) {
            resultCollector.add(47);
        } else {
            resultCollector.add(11);
        }
        if (count < 0) { throw new Failure2(); }
    }
}

public class ThrowGenericException {
    public static void main(String[] args) {
        ProcessRunner<String, Failure1> runner = new ProcessRunner<String, Failure1>();
        for (int i = 0; i < 3; i++) {
            runner.add(new Processor1());
        }
        try {
            System.out.println(runner.processAll());
        } catch (Failure1 e) { System.out.println(e); }


        ProcessRunner<Integer, Failure2> runner2 = new ProcessRunner<Integer, Failure2>();
        for (int i = 0; i < 3; i++) {
            runner2.add(new Processor2());
        }
        try {
            System.out.println(runner2.processAll());
        } catch (Failure2 e) { System.out.println(e); }

    }
}
