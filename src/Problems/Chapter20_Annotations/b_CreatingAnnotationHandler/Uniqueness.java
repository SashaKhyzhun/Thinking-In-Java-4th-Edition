package Problems.Chapter20_Annotations.b_CreatingAnnotationHandler;

/**
 * @author SashaKhyzhun on 9/3/17.
 * Page 856.
 */
public @interface Uniqueness {

    Constraints constraints() default @Constraints(unique = true);

}
