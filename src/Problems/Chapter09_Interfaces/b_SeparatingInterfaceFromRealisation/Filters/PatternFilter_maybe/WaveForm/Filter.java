package Problems.Chapter09_Interfaces.b_SeparatingInterfaceFromRealisation.Filters.PatternFilter_maybe.WaveForm;

/**
 * Created by SashaKhyzhun on 1/9/17.
 */

public class Filter {

    public String name() {
        return getClass().getSimpleName();
    }

    public Waveform process(Waveform input) {
        return input;
    }

    // ...
}
