package Problems.Chapter15_Generics.l_BoundarySituation;

/**
 * @author SashaKhyzhun on 3/14/17. Page 537
 * Попытка использовать instanceof в классе Erased.java завершается
 * неудачей, потому что информация типа была стерта.
 *
 * Иногда эти проблемы можно обойти на программном уровне,
 * но в отдельных случаях стирание приходится компенсировать
 * введением "Метки типа".
 * Это означает явную передачу объекта Class для своего типа,
 * чтобы его можн было использовать в выражениях типов.
 */

class Building {}
class House extends Building {}

public class ClassTypeCapture<T> {

    Class<T> kind;

    public ClassTypeCapture(Class<T> kind) {
        this.kind = kind;
    }
    public boolean f(Object args) {
        return kind.isInstance(args);
    }

    public static void main(String[] args) {
        ClassTypeCapture<Building> ctt1 = new ClassTypeCapture<Building>(Building.class);

        System.out.println(ctt1.f(new Building())); // true
        System.out.println(ctt1.f(new House()));    // true

        ClassTypeCapture<House> ctt2 = new ClassTypeCapture<House>(House.class);
        System.out.println(ctt2.f(new Building())); // false .
        System.out.println(ctt2.f(new House()));    // true
    }

}
