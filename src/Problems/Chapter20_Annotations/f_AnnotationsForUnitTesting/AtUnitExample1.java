package Problems.Chapter20_Annotations.f_AnnotationsForUnitTesting;

import org.junit.jupiter.api.Test;

/**
 * @author SashaKhyzhun on 9/3/17.
 * Page 869.
 * I was miss classes AtUnitExample2-n because
 * I don't want to write this classes if i haven't OSExecutor.
 */
public class AtUnitExample1 {

    public String methodOne() {
        return "this is methodOne";
    }
    public int methodTwo() {
        System.out.println("this is methodTwo");
        return 2;
    }

    //----------------------------------------------------//
    @Test boolean methodOneTest() {
        return methodOne().equals("this is methodOne");
    }
    @Test boolean m2() {
        return methodTwo() == 2;
    }
    @Test private boolean m3() {
        return true;
    }
    // Shows output for failure:
    @Test boolean failureTest() {
        return false;
    }
    @Test boolean anotherDisappointment() {
        return false;
    }

    public static void main(String[] args) {
//        OSExecute.command("java "
//                + "Problems"
//                + ".Chapter20_Annotations"
//                + ".f_AnnotationsForUnitTesting"
//                + ".AtUnitExample1");
    }


}
