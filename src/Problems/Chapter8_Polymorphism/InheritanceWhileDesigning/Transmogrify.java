package Problems.Chapter8_Polymorphism.InheritanceWhileDesigning;

/**
 * Created by SashaKhyzhun on 1/5/17.
 */

// Динамическое изменение поведения объекта с помощью
// композиции (паттерн проектирования "Состояние").


class Actor {
    public void act() {}
}

class HappyActor extends Actor {
    public void act() {
        System.out.println("HappyActor");
    }
}

class SadActor extends Actor {
    public void act() {
        System.out.println("SadActor");
    }
}

class Stage {
    private Actor actor = new HappyActor();
    public void change() {
        actor = new SadActor();
    }
    public void performPlay() {
        actor.act();
    }
}

public class Transmogrify {

    public static void main(String[] args) {

        Stage stage = new Stage();
        stage.performPlay(); // happy
        stage.change(); // changing
        stage.performPlay(); // sad

    }


}
