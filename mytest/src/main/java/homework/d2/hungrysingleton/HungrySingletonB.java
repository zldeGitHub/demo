package homework.d2.hungrysingleton;

/**
 * @author Levy Zhao
 * @since 2021-03-18 18:07
 **/
public class HungrySingletonB {
    private static final HungrySingletonB HUNGRY_SINGLETON_B;

    static {
        HUNGRY_SINGLETON_B = new HungrySingletonB();
    }

    private HungrySingletonB() {

    }

    public static HungrySingletonB getInstance() {
        return HUNGRY_SINGLETON_B;
    }

}
