package Problems.Chapter9_Interfaces.b_SeparatingInterfaceFromRealisation.InterfaceProcessor;

import java.util.Arrays;

/**
 * Created by SashaKhyzhun on 1/9/17.
 */
public abstract class StringProcessor implements Processor {

    public String name() {
        return getClass().getSimpleName();
    }

    public abstract String process(Object input);
    public static String s = "If she weighs the same as a duck, she's made of wood";

    public static void main(String[] args) {
        Apply.process(new Uppercase(),s);
        Apply.process(new Downcase(), s);
        Apply.process(new Splitter(), s);
        Apply.process(new SwagLeet(), s);
    }

}


class Uppercase extends StringProcessor {
    // между базовым и производным классом вызывается производный =\
    public String process(Object input) {
        return ((String)input).toUpperCase();
    }
}
class Downcase extends StringProcessor {
    public String process(Object input) {
        return ((String)input).toLowerCase();
    }
}
class Splitter extends StringProcessor {
    public  String process(Object input) {
        return Arrays.toString(((String)input).split(" "));
    }
}
class SwagLeet extends StringProcessor {
    public String process(Object input) {
        return ((String)input)
                .replace("e", "3")
                .replace("i", "1")
                .replace("o", "0")
                .replace("t", "7")
                .replace("a", "4");
    }
}
