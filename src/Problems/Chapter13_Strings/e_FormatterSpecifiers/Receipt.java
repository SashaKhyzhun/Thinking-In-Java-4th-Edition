package Problems.Chapter13_Strings.e_FormatterSpecifiers;

import java.util.Formatter;

/**
 * Created by SashaKhyzhun on 3/9/17. Page 424
 * Форматные спецификаторы.
 * Для Управления интервалами и выравниванием вставляемых данных потребуются более
 * сложные форматные спецификаторы.  Общий синтаксис выглядит так:
 *
 * %[аргумент_индекс$][флаги][ширина][.точность]преобразование
 *
 * Спецификатор "ширина" управляет минимальным размером поля.
 * Поле "точность "задает максимально значение (имеет разный смысл для разних типов).
 *                        для объектов String - задает max количество выводимых символов
 *                        для вещественных чисел задает количество выводимых знаков (def: 6).
 *
 */
public class Receipt {

    private double total = 0;
    private Formatter f = new Formatter(System.out);

    public void printTitle() {
        f.format("%-15s %5s %10s\n", "Item", "Qty", "Price");
        f.format("%-15s %5s %10s\n",   "--------------------------------", "", "");
    }

    public void print(String name, int qty, double price) {
        f.format("%-15.15s %5d %10.2f\n", name, qty, price);
        total += price;
    }

    public void printTotal() {
        f.format("%-15s %5s %10s\n",   "--------------------------------", "", "");
        f.format("%-15s %5s %10.2f\n", "Tax",   "n %", total * 0.06);
        f.format("%-15s %5s %10s\n",   "--------------------------------", "", "");
        f.format("%-15s %5s %10.2f\n", "Total", "", total * 1.06);
    }

    public static void main(String[] args) {
        Receipt receipt = new Receipt();
        receipt.printTitle();
        receipt.print("Jack's Magic Beans", 4, 4.25);
        receipt.print("Princess Peas", 3, 5.1);
        receipt.print("Three Bears Porridge", 1, 14.29);
        receipt.printTotal();
    }

}
