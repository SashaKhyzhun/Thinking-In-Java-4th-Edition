package Problems.Chapter10_InnerСlasses.e_InTheMethodsAndFieldsOfAction;

/**
 * Created by SashaKhyzhun on 1/18/17. Page 297
 * Вложение класса в область действия.
 */

public class Parcel6 {

    private void internalTracking(boolean b) {
        if (b) {
            class TrackingSlip {
                private String id;
                TrackingSlip(String s) {
                    id = s;
                }
                String getSlip() {
                    return id;
                }
            }
            TrackingSlip ts = new TrackingSlip("slip");
            String s = ts.getSlip();
        }
        // Здесь использовать нельзя! Вне области действия:
        // TrackingSlip ts = new TrackingSlip("x");
    }

    public void track() {
        internalTracking(true);
    }

    public static void main(String[] args) {
        Parcel6 p = new Parcel6();
        p.track();
    }

    /*
     * Класс TrackingSlip вложен в область действия команды if. Это не означает, что класс
     * создается условно, - он компилируется вместе с остальным кодом. Тем не менее этот
     * класс недоступен за пределами области действия, в которой он определяется. В
     * остальном он выглядит как самый обычный класс.
     */


}
