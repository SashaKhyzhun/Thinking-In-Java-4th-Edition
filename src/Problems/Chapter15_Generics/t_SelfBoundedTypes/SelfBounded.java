package Problems.Chapter15_Generics.t_SelfBoundedTypes;

/**
 * @author SashaKhyzhun on 3/16/17. Page 567.
 *
 * Существует одна довольно заумная идиома, которая переодический
 * встечается в обобщениях в Java. Вот так оно выглядит:
 */
public class SelfBounded<T extends SelfBounded> { // ...
}

/**
 * Напоминает два зеркала, обращенных друг к другу; своего рода бесконечное отражение.
 * Класс SelfBounded получает обобщенный аргумент Т; Т ограничевается по SelfBounded,
 * получающего аргумент Т.
 */
