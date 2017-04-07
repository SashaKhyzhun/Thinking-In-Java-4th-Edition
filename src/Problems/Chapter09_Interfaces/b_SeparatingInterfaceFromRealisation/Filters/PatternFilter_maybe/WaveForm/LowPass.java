package Problems.Chapter09_Interfaces.b_SeparatingInterfaceFromRealisation.Filters.PatternFilter_maybe.WaveForm;

/**
 * Created by SashaKhyzhun on 1/9/17.
 */

public class LowPass extends Filter {

    double cutoff;

    public LowPass(double cutoff) {
        this.cutoff = cutoff;
    }

    public Waveform process(Waveform input) {
        return input; // Фиктивная обработка
    }

    // ...

}
