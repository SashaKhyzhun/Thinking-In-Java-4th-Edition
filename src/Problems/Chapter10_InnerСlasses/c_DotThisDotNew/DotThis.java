package Problems.Chapter10_InnerСlasses.c_DotThisDotNew;

/**
 * Created by SashaKhyzhun on 1/16/17. Page 292
 * .this и .new
 * Доступ к объекту внешнего класса.
 */

public class DotThis {
    void f() {
        System.out.println("DotThis.f()");
    }

    public class Inner {
        public DotThis outer() {
            return DotThis.this;
            // "this" без уточнения соответствует объекту Inner
        }
    }

    public Inner inner() { return new Inner(); }

    public static void main(String[] args) {
        DotThis dt = new DotThis();
        DotThis.Inner dti = dt.inner();
        dti.outer().f(); // lol
    }
}
