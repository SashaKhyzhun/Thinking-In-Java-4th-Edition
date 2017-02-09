package Problems.Chapter11_Collections.c_AddingGroups;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Created by SashaKhyzhun on 2/9/17. Page 330.
 * Ограничение метода Arrays.asList() заключается в том, что он пытается "угадать" итоговый
 * тип List, не обращая внимания на присвоенные значения. Иногда это создает проблемы:
 */

class Snow {}

class Powder extends Snow {}

class Light  extends Powder {}
class Heavy  extends Powder {}

class Crusty extends Snow {}
class Slush  extends Snow {}

public class AsListInference {

    public static void main(String[] args) {
        List<Snow> snow1 = Arrays.asList(new Crusty(), new Slush(), new Powder());

        // не откомпилируется:
        // List<Snow> snow2 = Arrays.asList(new Light(), new Heavy());
        // Компилятор сообщает:
        // получено  : java.util.List<Powder>
        // требуется : java.util.List<Snow>

        // у Collections.addAll() проблем нет:
        List<Snow> snow3 = new ArrayList<Snow>();
        Collections.addAll(snow3, new Light(), new Heavy());

        // Подсказка с явно указанным аргументов типа:
        List<Snow> snow4 = Arrays.<Snow>asList(new Light(), new Heavy());

    }

}
