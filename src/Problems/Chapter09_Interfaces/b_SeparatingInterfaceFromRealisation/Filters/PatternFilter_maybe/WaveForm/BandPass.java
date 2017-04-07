package Problems.Chapter09_Interfaces.b_SeparatingInterfaceFromRealisation.Filters.PatternFilter_maybe.WaveForm;

/**
 * Created by SashaKhyzhun on 1/9/17.
 */
public class BandPass extends Filter {

    double lowCutoff, highCutoff;

    public BandPass(double lowCutoff, double highCutoff) {
        this.lowCutoff  = lowCutoff;
        this.highCutoff = highCutoff;
    }

    public Waveform process(Waveform input) {
        return super.process(input);
    }

}
