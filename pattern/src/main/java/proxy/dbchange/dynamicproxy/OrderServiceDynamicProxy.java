package proxy.dbchange.dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * @author Levy Zhao
 * @since 2021-03-24 13:48
 **/
public class OrderServiceDynamicProxy implements InvocationHandler {

    private DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy");

    private Object target;

    public Object getInstance(Object o) {
        this.target = o;
        Class<?> aClass = o.getClass();
        return Proxy.newProxyInstance(aClass.getClassLoader(), aClass.getInterfaces(), this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        before(args[0]);
        Object invoke = method.invoke(target, args);
        after();
        return invoke;
    }

    private void before(Object obj) {
        try {
            LocalDateTime l = (LocalDateTime) obj.getClass().getMethod("getCreateTime").invoke(obj);
            Integer integer = Integer.valueOf(dateTimeFormatter.format(l));
            System.out.println("静态代理自动分配到【DB_" + integer + "】数据源处理数据！");
            DynamicDataSourceEntry.set(integer);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
    }

    private void after() {
        System.out.println("after proxy method!");
    }
}
