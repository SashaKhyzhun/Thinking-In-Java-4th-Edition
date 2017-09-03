package Problems.Chapter20_Annotations.a_BasicSyntax;

import java.lang.annotation.*;

/**
 * @author SashaKhyzhun on 9/3/17.
 * Page 851.
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface UseCase {

    int id();
    String description() default "no description";

}

//@SuppressWarnings("ClassExplicitlyAnnotation")
//class ASdqwdz implements UseCase.useCase {
//
//    @Override
//    public int id() {
//        return 0;
//    }
//
//    @Override
//    public String description() {
//        return null;
//    }
//
//    @Override
//    public Class<? extends Annotation> annotationType() {
//        return null;
//    }
//}
