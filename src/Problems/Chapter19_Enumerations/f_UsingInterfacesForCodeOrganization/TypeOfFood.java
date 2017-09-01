package Problems.Chapter19_Enumerations.f_UsingInterfacesForCodeOrganization;

/**
 * @author SashaKhyzhun on 9/1/17.
 * Page 821.
 */
public class TypeOfFood {

    public static void main(String[] args) {

        Food food = Food.Appetizer.SALAD;
        food = Food.MainCourse.LASAGNE;
        food = Food.Dessert.GELATO;
        food = Food.Coffee.CAPPUCCINO;

    }

}
