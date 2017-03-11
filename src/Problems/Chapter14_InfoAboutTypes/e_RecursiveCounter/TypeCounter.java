package Problems.Chapter14_InfoAboutTypes.e_RecursiveCounter;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by SashaKhyzhun on 3/10/17.
 */
public class TypeCounter extends HashMap<Class<?>, Integer> {
    private Class<?> baseType;

    public TypeCounter(Class<?> baseType) {
        this.baseType = baseType;
    }



    public void count(Object object) {
        Class<?> type = object.getClass();
        if (baseType.isAssignableFrom(type)) {
            throw new RuntimeException(object + " неправильный тип: " + type + ", должен быть подтипом " + baseType);
        }
        countClass(type);
    }

    private void countClass(Class<?> type) {
        Integer quantity = get(type);
        put(type, quantity == null ? 1 : quantity + 1);

        Class<?> superClass = type.getSuperclass();
        if (superClass != null && baseType.isAssignableFrom(superClass)) {
            countClass(superClass); // recursive count;
        }
    }

    public String toString() {
        StringBuilder result = new StringBuilder("{");
        for (Map.Entry<Class<?>, Integer> pair : entrySet()) {
            result.append(pair.getKey().getSimpleName());
            result.append("=");
            result.append(pair.getValue());
            result.append(", ");
        }
        result.delete(result.length()-1, result.length());
        result.append("}");
        return result.toString();
    }


}
