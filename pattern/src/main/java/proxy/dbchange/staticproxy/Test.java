package proxy.dbchange.staticproxy;

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

        IOrderService orderService = new OrderServiceStaticProxy(new OrderService());
        int order1 = orderService.createOrder(order);
        System.out.println(order1);
    }
}
