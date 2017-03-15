package Problems.Chapter15_Generics.r_Problems;

/**
 * @author SashaKhyzhun on 3/15/17. Page 563.
 * Класс не может реализовать две зановидности одного обобщенного интерфейса.
 * Из-за стирания они превратятся в один интерфейс.
 * Пример ситуации, в которой происходит такой конфликт:
 */

interface Payable<T> {}

class Employee implements Payable<Employee> { }

// Класс не компилируется, потому что стирание сокращает
// Payable<Employee> и Payable<Hourly> до одного класса Payable.
//class Hourly extends Employee implements Payable<Hourly> {}

public class MultipleInterfaceVariants {

}
