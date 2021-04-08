package homework.d2.containerSingleton;

import com.sun.deploy.util.StringUtils;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author Levy Zhao
 * @since 2021-03-18 18:19
 **/
public class ContainerSingletonA {

    private ContainerSingletonA() {

    }

    private static final Map<String, Object> MAP = new ConcurrentHashMap<>();

    public static Object getInstance(String name) {
        Object o = null;
        if (MAP.get(name) == null) {
            try {
                o = Class.forName(name).newInstance();
                MAP.put(name, o);
            } catch (InstantiationException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
            return o;
        }
        return MAP.get(name);
    }

    private Integer size;

    public static Integer getSize() {
        return MAP.size();
    }

    public void setSize(Integer size) {
        this.size = size;
    }
}
