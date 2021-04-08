package proxy.dbchange.staticproxy;

import lombok.Data;

import java.time.LocalDateTime;

/**
 * @author Levy Zhao
 * @since 2021-03-24 11:03
 **/
@Data
public class Order {

    private String orderID;

    private String status;

    private LocalDateTime createTime;

}
