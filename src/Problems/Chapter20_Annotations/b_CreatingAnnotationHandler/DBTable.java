package Problems.Chapter20_Annotations.b_CreatingAnnotationHandler;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author SashaKhyzhun on 9/3/17.
 * Page 855.
 */

@Target(ElementType.TYPE) // Applies to classes only
@Retention(RetentionPolicy.RUNTIME)
public @interface DBTable {

    String name() default "";

}
