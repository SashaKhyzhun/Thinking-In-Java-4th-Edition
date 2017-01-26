package Problems.Chapter10_InnerСlasses.m_ControlFramework;

import java.util.*;

/**
 * Created by SashaKhyzhun on 1/25/17. Page 313
 * Вместе с классом Event составляет систему управления общего характера:
 */

public class Controller {
    // Класс из пакета java.util для хранения объектов Event:
    private List<Event> eventList = new ArrayList<>();

    public void addEvent(Event c) { eventList.add(c); }

    public void run() {
        while (eventList.size() > 0) {
            // Создать копию, чтобы избежать модификации списка
            // во время выборки элементов:
            for (Event e : new ArrayList<Event>(eventList)) {
                if (e.ready()) {
                    System.out.println(e);
                    e.action();
                    eventList.remove(e);
                }
            }
        }
    }
}
