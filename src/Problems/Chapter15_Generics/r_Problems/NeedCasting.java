package Problems.Chapter15_Generics.r_Problems;


import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.List;

/**
 * @author SashaKhyzhun on 3/15/17.
 */
public class NeedCasting {

    public void f(String[] args) throws Exception {
        ObjectInputStream in = new ObjectInputStream(new FileInputStream(args[0]));

        //List<Widget> shapes = (List<Widget> in.readObject());
        // ....
    }
}
