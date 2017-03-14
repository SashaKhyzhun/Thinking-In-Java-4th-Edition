package Problems.Chapter15_Generics.l_BoundarySituation;

/**
 * @author SashaKhyzhun on 3/14/17. Page 535.
 * граничная точка - это дополнительная проверка входных значений во время
 * компиляции и вставляемое приведение типа для выходных значений.
 */
public class GenericHolder<T> /* <<--- граничная точка */ {

    private T object;

    public void setObject(T /* <<--- граничная точка */ object) {
        this.object = object;
    }

    public T getObject() {
        return object;
    }

    public static void main(String[] args) {
        GenericHolder<String> holder = new GenericHolder<String>();
        holder.setObject("Item");

        //String c = (String)holder.getObject(); // не надо.
        String s = holder.getObject();
    }
}
