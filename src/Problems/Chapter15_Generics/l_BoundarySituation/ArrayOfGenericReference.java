package Problems.Chapter15_Generics.l_BoundarySituation;

/**
 * @author SashaKhyzhun on 3/14/17. Page 540.
 */

class Generic<T> {}

public class ArrayOfGenericReference {
    static Generic<Integer>[] gia;
}

/**
 * Компилятор принимает этот фрагмент, не выдавая никаких предупреждений.
 * Но вам никогда не удастся создать массив этого конкретного типа (Включая
 * параметры-типы), так что это обстоятельство немного сбивает с толку.
 */
