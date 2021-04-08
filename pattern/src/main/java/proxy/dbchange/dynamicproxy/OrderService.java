package proxy.dbchange.dynamicproxy;

/**
 * @author Levy Zhao
 * @since 2021-03-24 11:07
 **/
public class OrderService implements IOrderService {

    private OrderDao orderDao;

    public OrderService() {
        orderDao = new OrderDao();
    }

    @Override
    public int createOrder(Order order) {
        System.out.println("OrderService 调用 OrderDao 创建订单！");
        return orderDao.insert(order);
    }

}
