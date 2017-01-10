package Problems.Chapter9_Interfaces.d_ExtensionThroughInheritance;

// Страница 276

interface Monster { void menace(); }

// простое расширение интерфейса через наследование
interface DangerousMonster extends Monster { void destroy(); }

interface Lethal { void kill(); }

class DragonZilla implements DangerousMonster {
    @Override
    public void menace() {
    }

    @Override
    public void destroy() {
    }
}

interface Vampire extends DangerousMonster, Lethal { void drinkBlood(); }

class VeryBadVampire implements Vampire {
    @Override
    public void menace() {

    }

    @Override
    public void destroy() {

    }

    @Override
    public void kill() {

    }

    @Override
    public void drinkBlood() {

    }
}

public class HorrorShow {
    static void u (Monster b) { b.menace(); }
    static void w (Lethal l) { l.kill(); }
    static void v (DangerousMonster d) {
        d.menace();
        d.destroy();
    }

    public static void main(String[] args) {
        DangerousMonster barney = new DragonZilla(); // Восходящее преобразование
        u(barney);
        v(barney);
        Vampire vlad = new VeryBadVampire(); // Восходящее преобразование
        u(vlad);
        v(vlad);
        w(vlad);

        vlad.drinkBlood();
    }


}
