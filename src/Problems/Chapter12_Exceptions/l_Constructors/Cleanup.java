package Problems.Chapter12_Exceptions.l_Constructors;

/**
 * Created by SashaKhyzhun on 3/9/17. Page 399.
 * Самый безопасный смопосб использования класса, который может выдавать исключения
 * во время выполнения конструктора и требует завершающих действий, заключается в
 * использовании вложенных блоков try:
 */
public class Cleanup {

    public static void main(String[] args) {
        try {
            InputFile in = new InputFile("Cleanup.java");

            try {
                String s;
                int i = 1;
                while ((s = in.getLine()) != null)
                    ; // обработка данных по строкам
            } catch (Exception e) {
                System.out.println("Перехвачено исключение Exception в main");
                e.printStackTrace(System.out);
            } finally {
                in.dispose();
            }



        } catch (Exception e) {
            System.out.println("Ошибка при конструировании InputFile");
        }


    }
}
