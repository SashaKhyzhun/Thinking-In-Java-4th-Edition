package Problems.Chapter15_Generics.l_BoundarySituation;

/**
 * @author SashaKhyzhun on 3/14/17. Page 540.
 * Другое возможное решение основано на паттерне проектрования "Шаблонный мтеод".
 * В следующем примере get() является шаблонным методом, а create() определяется
 * в субклассе для создания объекта соответствующего типа:
 */

abstract class GenericWithCreate<T> /* T = Example class*/{
    final T element;
    GenericWithCreate() { element = create(); }
    abstract T create();
}

class Example {}

class Creator extends GenericWithCreate<Example> {
    @Override
    Example create() {
        return new Example();
    }
    void f() { System.out.println(element.getClass().getSimpleName()); }
}

public class CreatorGeneric {
    public static void main(String[] args) {
        Creator creator = new Creator();
        creator.f();
    }
}
