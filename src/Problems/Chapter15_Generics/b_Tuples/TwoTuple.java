package Problems.Chapter15_Generics.b_Tuples;

/**
 * @author SashaKhyzhun on 3/13/17. Page 505.
 *
 * На первый взгляд можно подумать, что такое решение нарушает основные принципы
 * безопасности при программировании на Java. Разве поля first и second не следует
 * объявить закрытыми, а для обращения к ним использовать мтеоды getFirst(), getSecond()?
 *
 * Подуйте, какая безопасность достигается в данном случае: клиент может прочитать
 * объект и сделать с ни то, что захочет, но ему не удастся присвоить first или second
 * другое значение. Объявление final обезпечивает тот же уровень безопасности, но
 * приведенная форма короче и проще.
 */
public class TwoTuple<A, B> {

    public final A first;  // обратите внимание что здесь не private
    public final B second; // обратите внимание что здесь не private

    public TwoTuple(A a, B b) { this.first = a; this.second = b; }

    public String toString() {
        return "(" + first + ", " + second + ")";
    }

}
