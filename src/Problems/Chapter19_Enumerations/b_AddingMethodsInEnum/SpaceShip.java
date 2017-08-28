package Problems.Chapter19_Enumerations.b_AddingMethodsInEnum;

/**
 * @author SashaKhyzhun on 8/28/17.
 * Page 814.
 * Переопределение методов перечисления
 */
public enum SpaceShip {
    SCOUT, CARGO, TRANSPORT, CRUISER, BATTLESHIP, MOTHERSHIP;

    @Override
    public String toString() {
        String id = name();
        String lower = id.substring(1).toLowerCase();
        System.out.println("id    == " + id);
        System.out.println("lower == " + lower);
        return id.charAt(0) + lower;
    }

    public static void main(String[] args) {
        for (SpaceShip s : values()) {
            System.out.println(s);
            System.out.println("------------------------");
        }
    }
}
