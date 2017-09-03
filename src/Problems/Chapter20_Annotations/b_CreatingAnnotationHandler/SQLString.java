package Problems.Chapter20_Annotations.b_CreatingAnnotationHandler;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author SashaKhyzhun on 9/3/17.
 * Page 856
 */

@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface SQLString {

    int value() default 0;

    String name() default "";

    Constraints constraints() default @Constraints;

}
