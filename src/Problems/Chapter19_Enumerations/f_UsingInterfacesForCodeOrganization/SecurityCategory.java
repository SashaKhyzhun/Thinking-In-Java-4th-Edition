package Problems.Chapter19_Enumerations.f_UsingInterfacesForCodeOrganization;

import Problems.Chapter19_Enumerations.e_RealizationNotExtending.Enums;

/**
 * @author SashaKhyzhun on 9/1/17.
 * Page 823.
 * Более компактрый способ создания
 * категорий в перечислениях.
 */

enum SecurityCategory {
    STOCK(Security.Stock.class),
    BOND(Security.Bond.class);

    Security[] values;

    SecurityCategory(Class<? extends Security> kind) {
        values = kind.getEnumConstants();
    }

    interface Security {
        enum Stock implements Security { SHORT, LONG, MARGIN }
        enum Bond  implements Security { MUNICIPAL, JUNK }
    }
    public Security randomSelection() {
        return Enums.random(values);
    }

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            SecurityCategory category = Enums.random(SecurityCategory.class);
            System.out.println(category + ": " + category.randomSelection());
        }
    }

}