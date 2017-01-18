package Problems.Chapter10_InnerСlasses.g_AgainAboutPatterFactory;

/**
 * Created by SashaKhyzhun on 1/19/17. Page 302
 * Использование анонимных внутренних классов в системе Game.
 *
 * Совет приведенный в конце предыдущей главы: в общем случае рекомендуется
 * отдавать предпочтение классам перед интерфейсами. Если в вашей архитекруте
 * нужен интерфейс, вы это поймете. В остальных случаях не используйте
 * интерфейс без необходимости.
 */
interface Game { boolean move(); }
interface GameFactory { Game getGame(); }

class Checkers implements Game {
    private Checkers() {} // private constructor
    private static final int MOVES = 3;
    private int moves = 0;
    @Override
    public boolean move() {
        System.out.println("Checkers move " + moves);
        return ++moves != MOVES;
    }
    public static GameFactory factory = new GameFactory() {
        @Override
        public Game getGame() {
            return new Checkers();
        }
    };
}
class Chess implements Game {
    private Chess() {} // private constructor;
    public static final int MOVES = 4;
    private int moves = 0;
    @Override
    public boolean move() {
        System.out.println("Chess move " + moves);
        return ++moves != MOVES;
    }
    public static GameFactory factory = new GameFactory() {
        @Override
        public Game getGame() {
            return new Chess();
        }
    };
}
public class Games {
    public static void playGame(GameFactory factory) {
        Game game = factory.getGame();
        while (game.move()) ;
    }
    public static void main(String[] args) {
        playGame(Checkers.factory);
        playGame(Chess.factory);
    }
}
