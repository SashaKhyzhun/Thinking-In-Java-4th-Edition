package Problems.Chapter14_InfoAboutTypes.f_RegisteredFactories;

/**
 * Created by SashaKhyzhun on 3/10/17.
 */
public interface Factory<T> {
    T create();

    //T destroy(int i);
}
