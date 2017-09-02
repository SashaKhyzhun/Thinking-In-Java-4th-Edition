package Problems.Chapter19_Enumerations.i_EnumMaps;

/**
 * @author SashaKhyzhun on 9/1/17.
 */

interface Command { void action(); }

public class EnumMap {

//    public static void main(String[] args) {
//        EnumMap<AlarmPoints,Command> em = new EnumMap<>(AlarmPoints.class);
//
//        em.put(KITCHEN, new Command() {
//            public void action() { print("Kitchen fire!"); }
//        });
//        em.put(BATHROOM, new Command() {
//            public void action() { print("Bathroom alert!"); }
//        });
//        for(Map.Entry<AlarmPoints,Command> e : em.entrySet()) {
//            print(e.getKey() + ": ");
//            e.getValue().action();
//        }
//        try { // If there's no value for a particular key:
//            em.get(UTILITY).action();
//        } catch(Exception e) {
//            print(e);
//        }
//    }

    private static void print(Object o) {
        System.out.println(o.toString());
    }

}
