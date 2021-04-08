package homework.d1;


/**
 * @author Levy Zhao
 * @since 2021-03-18 17:27
 **/
public class InternalFactory {

    public static IInternals getInstance(Class<? extends IInternals> tClass) {
        IInternals t = null;
        try {
            t = tClass.newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        return t;
    }
}
