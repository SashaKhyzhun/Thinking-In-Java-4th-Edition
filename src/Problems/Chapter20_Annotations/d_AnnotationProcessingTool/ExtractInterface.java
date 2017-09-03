package Problems.Chapter20_Annotations.d_AnnotationProcessingTool;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author SashaKhyzhun on 9/3/17.
 * Page 862.
 */

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.SOURCE)
public @interface ExtractInterface {

    String value();

}
