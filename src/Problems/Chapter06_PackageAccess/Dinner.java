package Problems.Chapter06_PackageAccess;

/**
 *
 * Created by SashaKhyzhun on 1/6/17.
 */


// ez access;

class Cookie {

    public Cookie() {
        System.out.println("Cookie Constructor");
    }
    void bite() {
        System.out.println("bite");
    }

}


class Dinner {
    public static void main(String[] args) {
        Cookie x = new Cookie();
        // x.bite(); доступен только в данном паккете.
    }
}
