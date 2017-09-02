package Problems.Chapter19_Enumerations.n_MultipleDispatchingWithSwitch;

import Problems.Chapter19_Enumerations.m_MultipleDispatching.Outcome;
import Problems.Chapter19_Enumerations.m_MultipleDispatching.RoShamBo1;

import static Problems.Chapter19_Enumerations.m_MultipleDispatching.Outcome.DRAW;
import static Problems.Chapter19_Enumerations.m_MultipleDispatching.Outcome.LOSE;
import static Problems.Chapter19_Enumerations.m_MultipleDispatching.Outcome.WIN;

/**
 * @author SashaKhyzhun on 9/2/17.
 * Page 842.
 * Doesn't work.
 * Search classes RoShamBo1-6 on GitHub
 * in project/enumerated/class.name;
 */
//public enum RoShamBo2 implements Competitor<RoShamBo2> {
//    PAPER(DRAW, LOSE, WIN),
//    SCISSORS(WIN, DRAW, LOSE),
//    ROCK(LOSE, WIN, DRAW);
//    private Outcome vPAPER, vSCISSORS, vROCK;
//    RoShamBo2(Outcome paper,Outcome scissors,Outcome rock) {
//        this.vPAPER = paper;
//        this.vSCISSORS = scissors;
//        this.vROCK = rock;
//    }
//    public Outcome compete(RoShamBo2 it) {
//        switch(it) {
//            default:
//            case PAPER: return vPAPER;
//            case SCISSORS: return vSCISSORS;
//            case ROCK: return vROCK;
//        }
//    }
//    public static void main(String[] args) {
//        RoShamBo1.play(RoShamBo2.class, 20);
//    }
//}