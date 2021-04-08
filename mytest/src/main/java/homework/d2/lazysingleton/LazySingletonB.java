package homework.d2.lazysingleton;

/**
 * @author Levy Zhao
 * @since 2021-03-18 18:15
 **/
public class LazySingletonB {

    private LazySingletonB() {

    }

    private static class StaticInClass {
        private static final LazySingletonB LAZY_SINGLETON_B = new LazySingletonB();
    }

    public static LazySingletonB getInstance() {
        return StaticInClass.LAZY_SINGLETON_B;
    }

}
