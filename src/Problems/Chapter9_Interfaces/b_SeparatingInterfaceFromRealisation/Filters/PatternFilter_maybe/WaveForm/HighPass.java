package Problems.Chapter9_Interfaces.b_SeparatingInterfaceFromRealisation.Filters.PatternFilter_maybe.WaveForm;

/**
 * Created by SashaKhyzhun on 1/9/17.
 */
public class HighPass extends Filter {

    double cutoff;
    public HighPass(double cutoff) {
        this.cutoff = cutoff;
    }


    public Waveform process(Waveform input) {
        return (input);
    }

}
