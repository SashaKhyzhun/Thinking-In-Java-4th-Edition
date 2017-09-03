package Problems.Chapter20_Annotations.a_BasicSyntax;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author SashaKhyzhun on 9/3/17.
 * Page 851.
 * Определение аннотаций.
 */
public class InitAnotation {

    @Target(ElementType.METHOD)
    @Retention(RetentionPolicy.RUNTIME)
    public @interface Test {
        //...
    }

//  @Target(ElementType.METHOD) - определяет, к чему может применяться данная аннотация
//                                (например: к методу или полю)
//
//  @Retention(RetentionPolicy.RUNTIME) - определяет, доступны ли аннотации в исходном
//                                коде (SOURCE), в файлах классов (CLASS) или во время
//                                выполнения (RUNTIME).
//

}
