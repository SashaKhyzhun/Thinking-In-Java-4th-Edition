package Problems.Chapter14_InfoAboutTypes.f_RegisteredFactories;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by SashaKhyzhun on 3/10/17.
 */

class Part {
    public String toString() {
        return getClass().getSimpleName();
    }
    static List<Factory<? extends Part>> listFactory = new ArrayList<>();
    static {
        // Для Collections.addAll() выдается предупреждение
        // "неконтролируемое создание обобщенного массива".
        listFactory.add(new FuelFilter.Factory());
        listFactory.add(new AirFilter.Factory());
        listFactory.add(new OilFilter.Factory());
    }
    private static Random random = new Random(47);
    public static Part createRandom() {
        int n = random.nextInt(listFactory.size());
        return listFactory.get(n).create();
    }
}

class Filter extends Part {}

class FuelFilter extends Filter {
    // создание фабрики класса для каждого конкретного типа:
    public static class Factory implements Problems.Chapter14_InfoAboutTypes.f_RegisteredFactories.Factory<FuelFilter> {
        @Override
        public FuelFilter create() {
            return new FuelFilter();
        }
    }
}
class AirFilter extends Filter {
    public static class Factory implements Problems.Chapter14_InfoAboutTypes.f_RegisteredFactories.Factory<AirFilter> {
        @Override
        public AirFilter create() {
            return new AirFilter();
        }
    }
}
class OilFilter extends Filter {
    public static class Factory implements Problems.Chapter14_InfoAboutTypes.f_RegisteredFactories.Factory<OilFilter> {
        @Override
        public OilFilter create() {
            return new OilFilter();
        }
    }
}
public class RegisteredFactories {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println(Part.createRandom());
        }
    }
}
