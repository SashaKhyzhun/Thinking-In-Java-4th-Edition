package Problems.Chapter14_InfoAboutTypes.d_Pattern_Facade;

/**
 * Created by SashaKhyzhun on 3/10/17.
 * Нужен он вот для чего. При написании кода программисту приходится использовать различные third-party
 * библиотеки. Часто API библиотек довольно абстрактное. Некоторые методы классов могут быть вообще не
 * нужны или содержать параметры, которые не существенны для решения конкретной задачи.
 * Далее, для получения результата могут понадобиться длинные цепочки вызовов методов или же сам
 * результат будет не совсем в подходящем виде. Худший вариант - это использование плохо
 * спроектированной библиотеки, с чем тоже иногда приходится работать.
 *
 * Все эти проблемы можно решить с помощью паттерна Facade.
 *
 * Шаблон фасад (англ. Facade) — структурный шаблон проектирования, позволяющий скрыть
 * сложность системы путём сведения всех возможных внешних вызовов к одному объекту,
 * делегирующему их соответствующим объектам системы.
 */

/* Complex Parts */
class CPU {
    public void freeze() {}
    public void jump(long position) {}
    public void execute() {}
}

class Memory {
    public void load(long position, byte[] data) {}
}

class HardDrive {
    public byte[] read(long lba, int size) { return new byte[] {0,0}; }
}


/* Facade */
class Computer {
    private CPU cpu;
    private Memory memory;
    private HardDrive hardDrive;

    public Computer() {
        this.cpu = new CPU();
        this.memory = new Memory();
        this.hardDrive = new HardDrive();
    }
    public void startComputer() {
        cpu.freeze();
        memory.load(0, hardDrive.read(0,0));
        cpu.jump(0);
        cpu.execute();
    }
}

/* Client */
public class Facade {
    public static void main(String[] args) {
        Computer computer = new Computer();
        computer.startComputer();
    }
}
