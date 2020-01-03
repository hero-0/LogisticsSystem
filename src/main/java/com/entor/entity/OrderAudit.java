package com.entor.entity;

import com.baomidou.mybatisplus.annotation.TableId;
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
public class OrderAudit implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * 货物和订单id
     */
    @TableId("Order_audit_id")
    private String orderAuditId;

    /**
     * 订单id
     */
    private String orderId;

    /**
     * 货物id
     */
    private String goodsId;

    /**
     * 审核状态0（未审核）1(审核通过)-1(审核未通过)
     */
    @TableField("Order_audit_state")
    private Integer orderAuditState;


    public String getOrderAuditId() {
        return orderAuditId;
    }

    public void setOrderAuditId(String orderAuditId) {
        this.orderAuditId = orderAuditId;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(String goodsId) {
        this.goodsId = goodsId;
    }

    public Integer getOrderAuditState() {
        return orderAuditState;
    }

    public void setOrderAuditState(Integer orderAuditState) {
        this.orderAuditState = orderAuditState;
    }

    @Override
    public String toString() {
        return "OrderAudit{" +
        "orderAuditId=" + orderAuditId +
        ", orderId=" + orderId +
        ", goodsId=" + goodsId +
        ", orderAuditState=" + orderAuditState +
        "}";
    }
}
