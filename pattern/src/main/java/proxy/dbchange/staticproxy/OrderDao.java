package proxy.dbchange.staticproxy;

/**
 * @author Levy Zhao
 * @since 2021-03-24 11:05
 **/
public class OrderDao {

    public int insert(Order order) {
        System.out.println("OrderDao 创建订单成功！");
        return 1;
    }
}
