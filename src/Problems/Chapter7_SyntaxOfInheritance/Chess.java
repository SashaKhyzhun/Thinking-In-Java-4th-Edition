package Problems.Chapter7_SyntaxOfInheritance;

/**
 * Created by SashaKhyzhun on 1/6/17.
 */

// Наследование, конструкторы и аргументы.


class Game {
    Game(long elementForGame) {
        System.out.println("Game Constructor");
    }
}

class BoardGame extends Game {
    BoardGame(int elementForBoardGame) {
        super(elementForBoardGame);
        System.out.println("BoardGame Constructor");
    }
}

public class Chess extends BoardGame {
    Chess() {
        super(11);
        System.out.println("Chess Constructor");
    }

    public static void main(String[] args) {
        Chess x = new Chess();
    }

}
