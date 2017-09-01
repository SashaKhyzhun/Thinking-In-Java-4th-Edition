package Problems.Chapter19_Enumerations.g_IfacesForCodeOrganization;

/**
 * @author SashaKhyzhun on 9/1/17.
 * Page 820.
 * Использование интерфейсов для организации кода
 */

public interface Food {
    enum Appetizer implements Food {
        SALAD, SOUP, SPRING_ROLLS;
    }
    enum MainCourse implements Food {
        LASAGNE, BURRITO, PAD_THAI,
        LENTILS, HUMMOUS, VIDALLO;
    }
    enum Dessert implements Food {
        TIRAMISU, GELATO, BLACK_FOREST_CAKE,
        FRUIT, CREME_CARAMEL;
    }
    enum Coffee implements Food {
        BLACK_COFFEE, DECAF, ESPRESSO,
        LATTE, CAPPUCCINO, TEA, HERB_TEA;
    }
}
