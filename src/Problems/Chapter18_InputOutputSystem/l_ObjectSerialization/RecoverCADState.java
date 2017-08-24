package Problems.Chapter18_InputOutputSystem.l_ObjectSerialization;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.List;

/**
 * @author SashaKhyzhun on 8/24/17.
 */
public class RecoverCADState {

    @SuppressWarnings("unchecked")
    public static void main(String[] args) throws Exception {
        ObjectInputStream in = new ObjectInputStream(new FileInputStream("CADState.out"));

        // Read in the same order they were written:
        List<Class<? extends Shape>> shapeTypes = (List<Class<? extends Shape>>)in.readObject();

        Line.deserializeStaticState(in);

        List<Shape> shapes = (List<Shape>)in.readObject();

        System.out.println(shapes);
    }

}
