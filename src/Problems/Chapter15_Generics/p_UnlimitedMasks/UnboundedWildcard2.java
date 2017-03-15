package Problems.Chapter15_Generics.p_UnlimitedMasks;

import java.util.HashMap;
import java.util.Map;

/**
 * @author SashaKhyzhun on 3/15/17. Page 556
 */
public class UnboundedWildcard2 {

    static Map map1;
    static Map<?, ?> map2;
    static Map<String, ?> map3;

    public static void setMap1(Map map1) {
        UnboundedWildcard2.map1 = map1;
    }

    public static void setMap2(Map<?, ?> map2) {
        UnboundedWildcard2.map2 = map2;
    }

    public static void setMap3(Map<String, ?> map3) {
        UnboundedWildcard2.map3 = map3;
    }

    public static void main(String[] args) {
        setMap1(new HashMap());
        setMap2(new HashMap());
        //setMap3(new HashMap()); // ne ok

        setMap1(new HashMap<String, Integer>());
        setMap2(new HashMap<String, Integer>());
        setMap3(new HashMap<String, Integer>());

    }

}
