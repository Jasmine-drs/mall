package bean;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * 订单表
 * @TableName orders
 */
public class Orders implements Serializable {
    /**
     * 订单id
     */
    private Integer id;

    /**
     * 总价,所有订单项的总和
     */
    private Float ordersPrice;

    /**
     * 购买人id
     */
    private Integer userId;

    /**
     * 备注
     */
    private String notes;

    /**
     * 送货地址
     */
    private String userAddress;

    /**
     * 订单状态，0 未付款，1 已付款，2 申请退款，3 已退款
     */
    private Integer status;

    /**
     * 
     */
    private LocalDateTime createTime;

    /**
     * 
     */
    private LocalDateTime updateTime;

    private static final long serialVersionUID = 1L;

    /**
     * 订单id
     */
    public Integer getId() {
        return id;
    }

    /**
     * 订单id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 总价,所有订单项的总和
     */
    public Float getOrdersPrice() {
        return ordersPrice;
    }

    /**
     * 总价,所有订单项的总和
     */
    public void setOrdersPrice(Float ordersPrice) {
        this.ordersPrice = ordersPrice;
    }

    /**
     * 购买人id
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * 购买人id
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * 备注
     */
    public String getNotes() {
        return notes;
    }

    /**
     * 备注
     */
    public void setNotes(String notes) {
        this.notes = notes;
    }

    /**
     * 送货地址
     */
    public String getUserAddress() {
        return userAddress;
    }

    /**
     * 送货地址
     */
    public void setUserAddress(String userAddress) {
        this.userAddress = userAddress;
    }

    /**
     * 订单状态，0 未付款，1 已付款，2 申请退款，3 已退款
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * 订单状态，0 未付款，1 已付款，2 申请退款，3 已退款
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * 
     */
    public LocalDateTime getCreateTime() {
        return createTime;
    }

    /**
     * 
     */
    public void setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
    }

    /**
     * 
     */
    public LocalDateTime getUpdateTime() {
        return updateTime;
    }

    /**
     * 
     */
    public void setUpdateTime(LocalDateTime updateTime) {
        this.updateTime = updateTime;
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        Orders other = (Orders) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getOrdersPrice() == null ? other.getOrdersPrice() == null : this.getOrdersPrice().equals(other.getOrdersPrice()))
            && (this.getUserId() == null ? other.getUserId() == null : this.getUserId().equals(other.getUserId()))
            && (this.getNotes() == null ? other.getNotes() == null : this.getNotes().equals(other.getNotes()))
            && (this.getUserAddress() == null ? other.getUserAddress() == null : this.getUserAddress().equals(other.getUserAddress()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getUpdateTime() == null ? other.getUpdateTime() == null : this.getUpdateTime().equals(other.getUpdateTime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getOrdersPrice() == null) ? 0 : getOrdersPrice().hashCode());
        result = prime * result + ((getUserId() == null) ? 0 : getUserId().hashCode());
        result = prime * result + ((getNotes() == null) ? 0 : getNotes().hashCode());
        result = prime * result + ((getUserAddress() == null) ? 0 : getUserAddress().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getUpdateTime() == null) ? 0 : getUpdateTime().hashCode());
        return result;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() +
                " [" +
                "Hash = " + hashCode() +
                ", id=" + id +
                ", ordersPrice=" + ordersPrice +
                ", userId=" + userId +
                ", notes=" + notes +
                ", userAddress=" + userAddress +
                ", status=" + status +
                ", createTime=" + createTime +
                ", updateTime=" + updateTime +
                ", serialVersionUID=" + serialVersionUID +
                "]";
    }
}