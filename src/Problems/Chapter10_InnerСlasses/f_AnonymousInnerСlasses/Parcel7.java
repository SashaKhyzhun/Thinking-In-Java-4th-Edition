package Problems.Chapter10_InnerСlasses.f_AnonymousInnerСlasses;

import Problems.Chapter10_InnerСlasses.d_InnerClassesAndUpcast.Contents;

/**
 * Created by SashaKhyzhun on 1/18/17. Page 297
 * Анонимные внутренние классы.
 */

// Возвращение экземпляра анонимного внутреннего класса.
public class Parcel7 {

    public Contents contents() {

        return new Contents() {
            private int i = 11;
            @Override
            public int value() {
                return i;
            }

        }; // точка с запятой здесь необходима
    }

    public static void main(String[] args) {
        Parcel7 p = new Parcel7();
        Contents c = p.contents();
    }

} ///:~
