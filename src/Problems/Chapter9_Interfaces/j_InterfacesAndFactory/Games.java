package Problems.Chapter9_Interfaces.j_InterfacesAndFactory;
/**
 * Created by SashaKhyzhun on 1/14/17. Страница 286.
 * Без паттерна "Фабричный метод" вашему коду пришлось бы в каком-то месте задать
 * тип создаваемого объекта Service, чтобы он мог вызвать походящий конструктор.
 *
 * Для чего добавлять в систему лишний логический уровень?
 * Допустим, вы создаете систему настрольных игр - скажем, для шахмат и шашек,
 * в которые можно играть на одной доске (Например на твой бывшей):
 */
// Система для настольных игр с использованием Фабричного метода.
interface Game { boolean move(); }
interface GameFactory { Game getGame(); }

/*----------------------------------------------------------*/
class Checkers implements Game {
    private int moves = 0;
    private static final int MOVES = 3;
    public boolean move() {
        System.out.println("Checkers move " + moves);
        return ++moves != MOVES;
    }
}
class CheckersFactory implements GameFactory {
    public Game getGame() { return new Checkers(); }
}
/*----------------------------------------------------------*/
class Chess implements Game {
    private int moves = 0;
    private static final int MOVES = 4;
    public boolean move() {
        System.out.println("Chess move " + moves);
        return ++moves != MOVES;
    }
}
class ChessFactory implements GameFactory {
    public Game getGame() { return new Chess(); }
}
/*----------------------------------------------------------*/
public class Games {
    public static void playGame(GameFactory factory) {
        Game s = factory.getGame();
        while (s.move()) {
        }
    }

    public static void main(String[] args) {
        playGame(new CheckersFactory());
        playGame(new ChessFactory());
    }
}
