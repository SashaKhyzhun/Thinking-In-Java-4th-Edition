package Problems.Chapter15_Generics.l_BoundarySituation;

/**
 * @author SashaKhyzhun on 3/14/17. Page 538
 * Попытка создания экземплята new T() в Erased.java завершилась неудачей -
 * отчасти из-за стирания, отчасти из-за того, что компилятор не может
 * убедиться в наличии у T конструктора по умолячанию.
 *
 * В Java проблема решается передачей объекта-фабрики и использованием его
 * для созания нового экземпляра. В качестве фабрики удобно использовать объект
 * Class, так что при использовании метки типа для создания нового объекта этого
 * типа можно воспользоваться методом newInstance():
 */
class ClassAsFactory<T> {
    T x;
    public ClassAsFactory(Class<T> kind) {
        try {
            x = kind.newInstance();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}

class Employee {}

public class InstantiateGenericType {

    public static void main(String[] args) {
        ClassAsFactory<Employee> fe = new ClassAsFactory<Employee>(Employee.class);
        System.out.println("ClassAsFactory<Employee> succeeded");

        try {
            ClassAsFactory<Integer> fi = new ClassAsFactory<Integer>(Integer.class);
        } catch (Exception e) {
            System.out.println("ClassAsFactory<Integer> failed");
        }
    }

}
