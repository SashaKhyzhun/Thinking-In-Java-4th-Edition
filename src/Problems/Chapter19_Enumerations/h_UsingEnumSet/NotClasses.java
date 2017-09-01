package Problems.Chapter19_Enumerations.h_UsingEnumSet;

/**
 * @author SashaKhyzhun on 9/1/17.
 */

enum LikeClasses {
    WINKEN {
        void behavior() {
            System.out.println("Behaviour1");
        }
    },
    BLINKEN {
        void behavior() {
            System.out.println("Behaviour1");
        }
    },
    NOD {
        void behavior() {
            System.out.println("Behaviour1");
        }
    }
}

public class NotClasses {
    // void f1(LikeClasses.WINKEN instance) {} // нет
}
