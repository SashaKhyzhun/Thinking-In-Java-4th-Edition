package Problems.Chapter7_SyntaxOfInheritance;

/**
 * Created by SashaKhyzhun on 1/6/17.
 */


// reusing
// Делегирование


class SpaceShipControls {
    void up         (int velocity) {}
    void down       (int velocity) {}
    void left       (int velocity) {}
    void right      (int velocity) {}
    void forward    (int velocity) {}
    void back       (int velocity) {}
    void turboBoost (int velocity) {}
    //...
}

public class SpaceShip extends SpaceShipControls {
    private String name;

    SpaceShip(String name) {
        this.name = name;
    }

    public String toString() {
        return name;
    }

    public static void main(String[] args) {
        SpaceShip protector = new SpaceShip("NSEA Protector");
        protector.forward(100);
        protector.left(45);
        protector.turboBoost(228);
    }
}

///////////////////////////////////////////////////////////////////////////

class SpaceShipDelegation {

    private String name;

    private SpaceShipControls controls = new SpaceShipControls();

    SpaceShipDelegation(String name) {
        this.name = name;
    }

    /** Делегированные методы: */

    void back (int velocity) {
        controls.back(velocity);
    }

    void down (int velocity) {
        controls.down(velocity);
    }

    //...

    public static void main(String[] args) {
        SpaceShipDelegation protector = new SpaceShipDelegation("NSEA Protector");
        protector.back(100);
    }

}
