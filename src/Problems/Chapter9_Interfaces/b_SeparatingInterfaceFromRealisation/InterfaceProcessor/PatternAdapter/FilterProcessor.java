package Problems.Chapter9_Interfaces.b_SeparatingInterfaceFromRealisation.InterfaceProcessor.PatternAdapter;

import Problems.Chapter9_Interfaces.b_SeparatingInterfaceFromRealisation.Filters.PatternFilter_maybe.WaveForm.*;
import Problems.Chapter9_Interfaces.b_SeparatingInterfaceFromRealisation.InterfaceProcessor.Apply;
import Problems.Chapter9_Interfaces.b_SeparatingInterfaceFromRealisation.InterfaceProcessor.Processor;

/**
 * Created by SashaKhyzhun on 1/10/17.
 */

class FilterAdapter implements Processor {

    Filter filter;

    public FilterAdapter(Filter filter) {
        this.filter = filter;
    }

    @Override
    public String name() {
        return filter.name();
    }

    @Override
    public Object process(Object input) {
        return filter.process((Waveform)input);
    }
}

public class FilterProcessor {

    public static void main(String[] args) {
        Waveform w = new Waveform();
        Apply.process(new FilterAdapter(new LowPass(1.0)), w);
        Apply.process(new FilterAdapter(new HighPass(2.0)), w);
        Apply.process(new FilterAdapter(new BandPass(3.0, 4.0)), w);

    }

}
