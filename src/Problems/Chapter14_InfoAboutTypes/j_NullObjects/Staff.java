package Problems.Chapter14_InfoAboutTypes.j_NullObjects;

import java.util.ArrayList;

/**
 * @author SashaKhyzhun on 3/10/17. page 490.
 */
public class Staff extends ArrayList<Position> {

    public Staff(String... titles) {
        add(titles);
    }

    public void add(String title, Person person) {
        add(new Position(title, person));
    }

    public void add(String... titles) {
        for (String title : titles) {
            add(new Position(title));
        }
    }

    public boolean positionAvailable(String title) {
        for (Position position : this) {
            if (position.getTitle().equals(title) && position.getPerson() == Person.NULL)
                return true;
        }
        return false;
    }

    public void fillPosition(String title, Person hire) {
        for (Position position : this) {
            if (position.getTitle().equals(title) && position.getPerson().equals(Person.NULL)) {
                position.setPerson(hire);
                return;
            }
        }
        throw new RuntimeException("Position " + title + " not available");
    }

    public static void main(String[] args) {
        Staff staff = new Staff("President", "CTO", "Marketing Manager",
                "Product Manager", "Project Lead", "Software Engineer", "Test Engineer");

        staff.fillPosition("President", new Person("Me", "Last", "Home"));
        staff.fillPosition("CTO", new Person("Janet", "Planner", "Home"));

        if (staff.positionAvailable("Software Engineer")) {
            staff.fillPosition("Software Engineer", new Person("Bob", "Lob", "Home"));
        }

        System.out.println(staff);
    }

}
