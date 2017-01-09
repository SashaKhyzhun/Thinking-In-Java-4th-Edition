package Problems.Chapter9_Interfaces.c_MultiExtending;

/**
 * Created by SashaKhyzhun on 1/10/17.
 */

// Использование нескольких интерфейсов.

// Заметьте, что объявление метода fight() в интерфейса CanFight совпадает с тем, что
// имеется в классе ActionCharacter, и поэтому в классе Hero /нет/ определения метода fight().

interface CanFight {
    void fight();
}
interface CanSwim {
    void swim();
}
interface CanFly {
    void fly();
}

class ActionCharacter {
    public void fight() {}
}

class Hero extends ActionCharacter implements CanFight, CanSwim, CanFly {
    @Override
    public void swim() {}
    @Override
    public void fly() {}
}

public class Adventure {
    public static void t (CanFight x) {
        x.fight();
    }
    public static void u (CanSwim x) {
        x.swim();
    }
    public static void v (CanFly x) {
        x.fly();
    }
    public static void w (ActionCharacter x) {
        x.fight();
    }

    public static void main(String[] args) {
        Hero hero = new Hero();
        t(hero);
        u(hero);
        v(hero);
        w(hero);
        //hero.swim();
        //hero.fly();
        //hero.fight();
    }
}
