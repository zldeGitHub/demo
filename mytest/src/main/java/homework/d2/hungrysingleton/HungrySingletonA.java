package homework.d2.hungrysingleton;

/**
 * @author Levy Zhao
 * @since 2021-03-18 18:06
 **/
public class HungrySingletonA {

    private static final HungrySingletonA HUNGRY_SINGLETON_A = new HungrySingletonA();

    private HungrySingletonA() {

    }

    public static HungrySingletonA getInstance() {
        return HUNGRY_SINGLETON_A;
    }

}
