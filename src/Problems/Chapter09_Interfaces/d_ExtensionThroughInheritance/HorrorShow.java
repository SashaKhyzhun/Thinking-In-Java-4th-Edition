package Problems.Chapter09_Interfaces.d_ExtensionThroughInheritance;

// Страница 276

interface Monster {
    void menace();
}

// простое расширение интерфейса через наследование
interface DangerousMonster extends Monster {
    void destroy();
}

interface Lethal {
    void kill();
}

class DragonZilla implements DangerousMonster {
    @Override public void menace() {}
    @Override public void destroy() {}
}

interface Vampire extends DangerousMonster, Lethal {
    void drinkBlood();
}

class VeryBadVampire implements Vampire {
    @Override public void menace() {}
    @Override public void destroy() {}
    @Override public void kill() {}
    @Override public void drinkBlood() {}
}

public class HorrorShow {
    static void menace(Monster b) {
        b.menace();
    }
    static void menaceAndDestroy(DangerousMonster d) {
        d.menace();
        d.destroy();
    }
    static void kill(Lethal l) {
        l.kill();
    }

    public static void main(String[] args) {
        DangerousMonster barney = new DragonZilla(); // Восходящее преобразование
        menace(barney);
        menaceAndDestroy(barney);

        Vampire vlad = new VeryBadVampire(); // Восходящее преобразование
        menace(vlad);
        menaceAndDestroy(vlad);
        kill(vlad);

        vlad.drinkBlood();
    }


}
