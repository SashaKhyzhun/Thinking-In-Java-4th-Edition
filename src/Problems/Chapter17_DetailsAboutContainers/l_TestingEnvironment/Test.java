package Problems.Chapter17_DetailsAboutContainers.l_TestingEnvironment;

/**
 * @author SashaKhyzhun on 7/30/17.
 */
public abstract class Test<C> {

    String name;

    public Test(String name) {
        this.name = name;
    }

    // Метод переопределяется для разных текстов.
    // Возвращает фактическое количество повторений теста.
    abstract int test(C container, TestParam tp);

}
