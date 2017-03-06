package Problems.Chapter12_Exceptions.g_ChainedException;

import java.util.NoSuchElementException;

/**
 * Created by SashaKhyzhun on 3/6/17. Page 383.
 * Иногда бывает нужно перехватить одно исключение и возбудить сделующее, не теряя при этом
 * информации о первом исключении, - это называется цепочкой исключений (exception chaining).
 *
 * В следующем примере используется динамическое добавление
 * полей в объект DynamicFields во время работы программы:
 */

class DynamicFieldsException extends Exception {}

public class DynamicFields {
    private Object[][] fields;

    public DynamicFields(int initialSize) {
        fields = new Object[initialSize][2];
        for (int i = 0; i < initialSize; i++) {
            fields[i] = new Object[] { null, null };
        }
    }
    public String toString() {
        StringBuilder result = new StringBuilder();
        for (Object[] objects : fields) {
            result.append(objects[0]);
            result.append(": ");
            result.append(objects[1]);
            result.append("\n");
        }
        return result.toString();
    }
    private int hasField(String id) {
        for (int i = 0; i < fields.length; i++) {
            if (id.equals(fields[i][0])) {
                return i;
            }
        }
        return -1;
    }

    private int getFieldNumber(String id) throws NoSuchElementException {
        int fieldNum = hasField(id);
        if (fieldNum == -1) {
            throw new NoSuchElementException();
        }
        return fieldNum;
    }

    private int makeFields(String id) {
        for (int i = 0; i < fields.length; i++) {
            if (fields[i][0] == null) {
                fields[i][0] = id;
                return i;
            }
        }
        // Пустых полей нет, добавляем новоеЖ
        Object[][] tmp = new Object[fields.length + 1][2];
        for (int i = 0; i < fields.length; i++) {
            tmp[i] = fields[i];
        }
        for (int i = fields.length; i < tmp.length; i++) {
            tmp[i] = new Object[] { null, null };
        }
        fields = tmp;
        // Рекурсивный вызов с новыми полями:
        return makeFields(id);
    }
    public Object getField(String id) throws NoSuchElementException {
        return fields[getFieldNumber(id)][1];
    }
    public Object setField(String id, Object value) throws DynamicFieldsException {
        if (value == null) {
            // У большинства исключений нет конструктора, принимающего объект-причину.
            // В таких случиях следует использовать метод initCause(),
            // доступным всем подклассам Throwable
            DynamicFieldsException dfe = new DynamicFieldsException();
            dfe.initCause(new NullPointerException());
            throw dfe;
        }
        int fieldNumber = hasField(id);
        if (fieldNumber == -1) {
            fieldNumber = makeFields(id);
        }
        Object result = null;
        try {
            result = getField(id); // получаем старое значение
        } catch (NoSuchElementException e) {
            // используем конструктор с "причиной"
            throw new RuntimeException(e);
        }
        fields[fieldNumber][1] = value;
        return result;
    }

    public static void main(String[] args) {
        DynamicFields df = new DynamicFields(3);
        System.out.println(df);

        try {
            df.setField("d", "Value d");
            df.setField("number", 47);
            df.setField("number2", 48);
            System.out.println(df);

            df.setField("d", "New Value d");
            df.setField("number3", 11);
            System.out.println("df: " + df);
            System.out.println("db.getField(\"d\") : " + df.getField("d"));

            Object field = df.setField("d", null); // исключение
        } catch (NoSuchElementException | DynamicFieldsException e) {
            e.printStackTrace();
        }
    }
}
