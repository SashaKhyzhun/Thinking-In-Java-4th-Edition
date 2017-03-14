package Problems.Chapter15_Generics.l_BoundarySituation;

/**
 * @author SashaKhyzhun on 3/14/17. Page 535.
 *
 * Так как стирание удаляет информацию о типе в теле метода,
 * во время выполнения важны ГРАНИЧНЫЕ ТОЧКИ, в которых объекты
 * входят в метод и покидают его. В этих точках компилятор выполняет
 * проверку типа во время компиляции и вставляет код приведения типа.
 * Необобщенный пример:
 */
public class SimpleHolder {
    private Object object;

    public void setObject(Object object) {
        this.object = object;
    }

    public Object getObject() {
        return object;
    }

    public static void main(String[] args) {
        SimpleHolder simpleHolder = new SimpleHolder();
        simpleHolder.setObject("Item");
        //String s = simpleHolder.getObject();
        String s = (String)simpleHolder.getObject();
    }
}
