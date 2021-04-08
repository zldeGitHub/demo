package homework.d1;

/**
 * @author Levy Zhao
 * @since 2021-03-18 17:24
 **/
public class AborderFactory {

    public static IAborderPay getInstance(Class<? extends IAborderPay> tClass) {
        IAborderPay t = null;
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
