package homework.d2.containerSingleton;

import java.util.HashMap;

/**
 * @author Levy Zhao
 * @since 2021-03-18 18:27
 **/
public class Test {

    public static void main(String[] args) {
        Object instance = ContainerSingletonA.getInstance(A.class.getName());
        Object obj = ContainerSingletonA.getInstance(A.class.getName());
        System.out.println(instance == obj);

        Object instance1 = ContainerSingletonA.getInstance(B.class.getName());
        Object obj1 = ContainerSingletonA.getInstance(B.class.getName());
        System.out.println(instance1 == obj1);
        System.out.println(ContainerSingletonA.getSize());

        HashMap<String, String> map = new HashMap<>();
        map.put("1", "1");
        map.put("12", "12");
        map.put("122", "12");
        System.out.println(map.size());
    }
}
