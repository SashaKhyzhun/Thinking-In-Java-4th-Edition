package Problems.Chapter10_InnerСlasses.f_AnonymousInnerСlasses;

import Problems.Chapter10_InnerСlasses.d_InnerClassesAndUpcast.Destination;

/**
 * Created by SashaKhyzhun on 1/18/17. Page 300. [Suck the tractor driver dick]
 * Использование "инициализации экземпляра" для выполнения
 * конструирования в анонимном внутреннем классе.
 */


public class Parcel10 {

    public Destination getDestination(String dest, float price) {
        return new Destination() {
            private int cost;
            // инциализация экземпляра для каждого объекта:
            {
                cost = Math.round(price);
                if (cost > 100) {
                    System.out.println("Превышение бюджета");
                }
            }

            private String label = dest;

            @Override
            public String readLabel() {
                return label;
            }
        };
    }

    public static void main(String[] args) {
        Parcel10 p = new Parcel10();
        Destination d = p.getDestination("Canada", 101.395F);
    }

}
