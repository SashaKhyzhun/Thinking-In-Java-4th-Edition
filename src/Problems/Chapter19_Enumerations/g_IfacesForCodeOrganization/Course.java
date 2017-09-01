package Problems.Chapter19_Enumerations.g_IfacesForCodeOrganization;

import Problems.Chapter19_Enumerations.f_RandomChoice.Enums;

/**
 * @author SashaKhyzhun on 9/1/17.
 * Page 821.
 */
public enum Course {
    APPETIZER(Food.Appetizer.class),
    MAINCOURSE(Food.MainCourse.class),
    DESSERT(Food.Dessert.class),
    COFFEE(Food.Coffee.class);

    private Food[] values;

    private Course(Class<? extends Food> kind) {
        values = kind.getEnumConstants();
    }

    public Food randomSelection() {
        return Enums.random(values);
    }
}
