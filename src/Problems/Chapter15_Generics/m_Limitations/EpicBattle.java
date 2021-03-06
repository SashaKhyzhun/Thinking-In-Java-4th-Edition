package Problems.Chapter15_Generics.m_Limitations;

import java.util.List;

/**
 * @author SashaKhyzhun on 3/14/17. Page 547.
 * Demonstration bounds in Java generics.
 */

interface SuperPower {}
interface XRayVision   extends SuperPower { void seeThroughWalls();  }
interface SuperHearing extends SuperPower { void hearSubtleNoises(); }
interface SuperSmell   extends SuperPower { void trackBySmell();     }

class SuperHero<POWER extends SuperPower> {
    POWER power; // этот класс просто хранит инфу о герое.
    public SuperHero(POWER power) {
        this.power = power;
    }
    public POWER getPower() {
        return power;
    }
}

class SuperSleuth<POWER extends XRayVision> extends SuperHero<POWER> {
    //                 \                                       /
    public SuperSleuth(POWER power) {//                       /
        super(power);// <-`\_________________________________/
    }
    void see() {
        power.seeThroughWalls();
    }
}

class CanineHero<POWER extends SuperHearing & SuperSmell> extends SuperHero<POWER> {
    public CanineHero(POWER power) {
        super(power);
    }
    void hear() { power.hearSubtleNoises(); }
    void smell() { power.trackBySmell(); }
}

class SuperHearSmell implements SuperHearing, SuperSmell {
    @Override public void hearSubtleNoises() {}
    @Override public void trackBySmell() {}
}

class DogBoy extends CanineHero<SuperHearSmell> {
    DogBoy() { super(new SuperHearSmell());}
}

public class EpicBattle {
    // Ограничения в обощенных методах:
    static <POWER extends SuperHearing> void useSuperHearing(SuperHero<POWER> hero) {
        hero.getPower().hearSubtleNoises();
    }
    static <POWER extends SuperHearing & SuperSmell> void superFind(SuperHero<POWER> hero) {
        hero.getPower().hearSubtleNoises();
        hero.getPower().trackBySmell();
    }

    public static void main(String[] args) {
        DogBoy dogBoy = new DogBoy();
        useSuperHearing(dogBoy);
        superFind(dogBoy);
        // так поступить можно:
        List<? extends SuperHearing> audioBoys;
        // А так нельзя:
        //List<? extends SuperHearing & SuperSmell> dogBoys;
    }
}
