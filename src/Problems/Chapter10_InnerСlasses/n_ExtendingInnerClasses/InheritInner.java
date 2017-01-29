package Problems.Chapter10_InnerСlasses.n_ExtendingInnerClasses;

/**
 * Created by SashaKhyzhun on 1/29/17. Page 317
 * Наследование от внутреннего класса.
 */

class WithInner {
    class Inner {}
}

public class InheritInner extends WithInner.Inner {
    //! InheritInner()  {} // не компилируется
    InheritInner(WithInner wi) {
        wi.super();
    }

    public static void main(String[] args) {
        WithInner wi = new WithInner();
        InheritInner ii = new InheritInner(wi);
    }

    // Здесь класс InheritInner расширяет только внутренний класс, а не внешний
    // Но когда приходит время создавать конструктор, конструктор по умолчанию не
    // подходит, и вы не можете просто передать ссылку на внешний объект.
    // Необходимо использовать синтаксис следующего вида:
    //
    // ссылкаНаВнещнийКласс.super();
    //
    // в теле конструктора. Он обеспечит недостающую ссылку, и программа скомпилируется

}
