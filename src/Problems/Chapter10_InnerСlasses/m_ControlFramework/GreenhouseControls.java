package Problems.Chapter10_InnerСlasses.m_ControlFramework;

/**
 * Created by SashaKhyzhun on 1/27/17. Page 314.
 * Внутрение классы помогают унаследовать несколько разных классов от одного базового
 * класса Event в пределах одного класса. Для каждого типа события от Event наследуется
 * новый внутренний класс, и в его методе action() записывается управляющий код.
 *
 * Пример конкретного приложения на основе системы управления, все
 * находится в одном классе. Внутренние классы дают возможность
 * инкапсулировать различную функциональность для каждого отдельного события.
 */

public class GreenhouseControls extends Controller {

    private boolean light = false;

    public class LightOn extends Event {
        public LightOn(long delayTime) { super(delayTime); }
        @Override// Поместите сюда код управления оборудованием, выполняющий вкл света.
        public void action() {
            light = true;
        }
        public String toString() { return "Свет включен"; }
    }

    public class LightOff extends Event {
        public LightOff(long delayTime) { super(delayTime); }
        @Override // Поместите сюда код управления оборудованием, выполняющий выкл света
        public void action() {
            light = false;
        }
        public String toString() { return "Свет выключен"; }
    }
    /************************/

    private boolean water = false;

    public class WaterOn extends Event {
        public WaterOn(long delayTime) {
            super(delayTime);
        }
        @Override // здесь размещается код управления оборудованием.
        public void action() {
            water = true;
        }
        public String toString() { return "Вода включена"; }
    }

    public class WaterOff extends Event {
        public WaterOff(long delayTime) {
            super(delayTime);
        }
        @Override // Здесь размещается код управления оборудованием.
        public void action() {
            water = false;
        }
        public String toString() { return "Вода выключена"; }
    }
    /************************/

    private String thermostat = "День";

    public class ThermostatNight extends Event {
        public ThermostatNight(long delayTime) {
            super(delayTime);
        }
        @Override // Здесь размещается код управления оборудованием.
        public void action() {
            thermostat = "Ночь";
        }
        public String toString() { return "Термостат использует ночной режим"; }
    }
    public class ThermostatDay extends Event {
        public ThermostatDay(long delayTime) {
            super(delayTime);
        }
        @Override // Здесь размещается код управления оборудованием.
        public void action() {
            thermostat = "День";
        }
        public String toString() { return "Термостат использует дневной режим"; }
    }
    /************************/

    // Пример метода action(), вставляющего новый экземпляр самого себя в список событий:
    public class Bell extends Event {
        public Bell(long delayTime) {
            super(delayTime);
        }
        @Override
        public void action() {
            addEvent(new Bell(delayTime));
        }
        public String toString() { return "Boom!"; }
    }
    public class Restart extends Event {
        private Event[] eventList;
        public Restart(long delayTime, Event[] eventList) {
            super(delayTime);
            this.eventList = eventList;
            for(Event e : eventList) { addEvent(e); }
        }
        @Override
        public void action() {
            for (Event e : eventList) {
                e.start(); // перезапуск каждого события
                addEvent(e);
            }
            start(); // перезапуск текущего события
            addEvent(this);
        }
        public String toString() { return "Перезапуск системы"; }
    }
    public static class Terminate extends Event {
        public Terminate(long delayTime) {
            super(delayTime);
        }
        @Override
        public void action() {
            System.exit(0);
        }
        public String toString() { return "Отключение"; }
    }

}
