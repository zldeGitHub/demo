package proxy.dbchange.staticproxy;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * @author Levy Zhao
 * @since 2021-03-24 11:16
 **/
public class OrderServiceStaticProxy implements IOrderService{

    private DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy");

    private IOrderService orderService;

    public OrderServiceStaticProxy(IOrderService orderService) {
        this.orderService = orderService;
    }


    @Override
    public int createOrder(Order order) {
        before();
        LocalDateTime createTime = order.getCreateTime();
        Integer integer = Integer.valueOf(dateTimeFormatter.format(createTime));
        System.out.println("静态代理自动分配到【DB_" + integer + "】数据源处理数据！");
        DynamicDataSourceEntry.set(integer);
        int order1 = orderService.createOrder(order);
        after();
        return order1;
    }

    private void before() {
        System.out.println("Proxy before method!");
    }

    private void after() {
        System.out.println("Proxy after method!");
    }
}
