package Problems.Chapter17_DetailsAboutContainers.a_FillingArrays;

import Problems.Chapter16_Arrays.f_CreatingTestData.RandomGenerator;

import java.util.ArrayList;
import java.util.HashSet;

/**
 * @author SashaKhyzhun on 4/24/17. Page 640.
 *
 * Все генераторы, определенные в главе 16, теперь доступны через адаптер CollectionData.
 * В следующем примере используются два из них:
 */
public class CollectionDataGeneration {

    public static void main(String[] args) {

        System.out.println(new ArrayList<String>(CollectionData.list(new RandomGenerator.String(9), 10)));

        System.out.println(new HashSet<Integer>(new CollectionData<Integer>(new RandomGenerator.Integer(), 10)));

    }

}
