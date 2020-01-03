package com.entor.entity;

import java.util.Date;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author fzg
 * @since 2020-01-03
 */
public class Order implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * 主键
     */
    private String orderId;

    /**
     * 订单信息
     */
    private String orderInformation;

    /**
     * 发送人id
     */
    private String senderId;

    /**
     * 订单派送时间
     */
    @TableField("order_Send_out_date")
    private Date orderSendOutDate;

    /**
     * 创建时间
     */
    private Date createTime;


    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getOrderInformation() {
        return orderInformation;
    }

    public void setOrderInformation(String orderInformation) {
        this.orderInformation = orderInformation;
    }

    public String getSenderId() {
        return senderId;
    }

    public void setSenderId(String senderId) {
        this.senderId = senderId;
    }

    public Date getOrderSendOutDate() {
        return orderSendOutDate;
    }

    public void setOrderSendOutDate(Date orderSendOutDate) {
        this.orderSendOutDate = orderSendOutDate;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "Order{" +
        "orderId=" + orderId +
        ", orderInformation=" + orderInformation +
        ", senderId=" + senderId +
        ", orderSendOutDate=" + orderSendOutDate +
        ", createTime=" + createTime +
        "}";
    }
}
