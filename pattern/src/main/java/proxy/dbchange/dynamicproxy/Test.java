package proxy.dbchange.dynamicproxy;

import sun.misc.ProxyGenerator;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.Month;

/**
 * @author Levy Zhao
 * @since 2021-03-24 11:36
 **/
public class Test {
    public static void main(String[] args) {
        Order order = new Order();
        order.setCreateTime(LocalDateTime.of(2015, Month.AUGUST, 13, 23, 12, 35));
        IOrderService orderService = (IOrderService) new OrderServiceDynamicProxy().getInstance(new OrderService());
        int order1 = orderService.createOrder(order);
        System.out.println(order1);

        byte[] $Proxy0s = ProxyGenerator.generateProxyClass("$Proxy0", new Class[]{IOrderService.class});
        try {
            FileOutputStream os = new FileOutputStream("D://$Proxy0");
            os.write($Proxy0s);
            os.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
