package Problems.Chapter20_Annotations.a_BasicSyntax;

import org.junit.jupiter.api.Test;

/**
 * @author SashaKhyzhun on 9/3/17.
 * Page 850.
 * Базовый синтаксис.
 */
public class Testable {

    public void execute() {
        System.out.println("executing...");
    }

    @Test
    void testExecute() {
        execute();
    }

}
