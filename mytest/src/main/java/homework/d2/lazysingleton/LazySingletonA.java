package homework.d2.lazysingleton;

/**
 * @author Levy Zhao
 * @since 2021-03-18 18:09
 **/
public class LazySingletonA {

    private static LazySingletonA LAZY_SINGLETON_A;

    private LazySingletonA() {

    }

    public static LazySingletonA getInstance() {
        if (null == LAZY_SINGLETON_A) {
            synchronized (LAZY_SINGLETON_A) {
                if (null == LAZY_SINGLETON_A) {
                    LAZY_SINGLETON_A = new LazySingletonA();
                }
            }
        }
        return LAZY_SINGLETON_A;
    }


}
