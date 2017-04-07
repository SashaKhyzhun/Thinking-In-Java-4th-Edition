package Problems.Chapter09_Interfaces.b_SeparatingInterfaceFromRealisation.Filters.PatternFilter_maybe.WaveForm;

/**
 * Created by SashaKhyzhun on 1/9/17.
 */
public class Waveform {

    private static long counter;
    private final long id = counter++;
    public String toString() {
        return "Waveform " + id;
    }

} // ...
