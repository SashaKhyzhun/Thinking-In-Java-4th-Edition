package Problems.Chapter19_Enumerations.h_UsingEnumSet;

/**
 * @author SashaKhyzhun on 9/1/17.
 * Page 830.
 */
public enum OverrideConstantSpecific {
    NUT,
    BOLT,
    WASHER {
        @Override void f() { System.out.println("Overridden method"); }
    };

    void f() { System.out.println("default behavior"); }

    public static void main(String[] args) {
        for(OverrideConstantSpecific ocs : values()) {
            System.out.println(ocs + ": ");
            ocs.f();
        }
    }
}
