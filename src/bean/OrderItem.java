package bean;

import java.io.Serializable;

/**
 * 订单包含的商品
 * @TableName order_item
 */
public class OrderItem implements Serializable {
    /**
     * 订单项的索引
     */
    private Integer id;

    /**
     * 订单id
     */
    private Integer ordersId;

    /**
     * 商品id
     */
    private Integer commodityId;

    /**
     * 商品数量
     */
    private Integer commodityNumber;

    /**
     * 单个订单项的价格
     */
    private Float price;

    private static final long serialVersionUID = 1L;

    /**
     * 订单项的索引
     */
    public Integer getId() {
        return id;
    }

    /**
     * 订单项的索引
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 订单id
     */
    public Integer getOrdersId() {
        return ordersId;
    }

    /**
     * 订单id
     */
    public void setOrdersId(Integer ordersId) {
        this.ordersId = ordersId;
    }

    /**
     * 商品id
     */
    public Integer getCommodityId() {
        return commodityId;
    }

    /**
     * 商品id
     */
    public void setCommodityId(Integer commodityId) {
        this.commodityId = commodityId;
    }

    /**
     * 商品数量
     */
    public Integer getCommodityNumber() {
        return commodityNumber;
    }

    /**
     * 商品数量
     */
    public void setCommodityNumber(Integer commodityNumber) {
        this.commodityNumber = commodityNumber;
    }

    /**
     * 单个订单项的价格
     */
    public Float getPrice() {
        return price;
    }

    /**
     * 单个订单项的价格
     */
    public void setPrice(Float price) {
        this.price = price;
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
        OrderItem other = (OrderItem) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getOrdersId() == null ? other.getOrdersId() == null : this.getOrdersId().equals(other.getOrdersId()))
            && (this.getCommodityId() == null ? other.getCommodityId() == null : this.getCommodityId().equals(other.getCommodityId()))
            && (this.getCommodityNumber() == null ? other.getCommodityNumber() == null : this.getCommodityNumber().equals(other.getCommodityNumber()))
            && (this.getPrice() == null ? other.getPrice() == null : this.getPrice().equals(other.getPrice()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getOrdersId() == null) ? 0 : getOrdersId().hashCode());
        result = prime * result + ((getCommodityId() == null) ? 0 : getCommodityId().hashCode());
        result = prime * result + ((getCommodityNumber() == null) ? 0 : getCommodityNumber().hashCode());
        result = prime * result + ((getPrice() == null) ? 0 : getPrice().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", ordersId=").append(ordersId);
        sb.append(", commodityId=").append(commodityId);
        sb.append(", commodityNumber=").append(commodityNumber);
        sb.append(", price=").append(price);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}