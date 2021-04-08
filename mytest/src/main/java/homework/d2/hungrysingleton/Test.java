package homework.d2.hungrysingleton;

/**
 * @author Levy Zhao
 * @since 2021-03-18 18:10
 **/
public class Test {

    public static void main(String[] args) {
        HungrySingletonA instance = HungrySingletonA.getInstance();
        System.out.println(instance);
    }
}
