package bean;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * 购物车
 * @TableName cart
 */
public class Cart implements Serializable {
    /**
     * 
     */
    private Integer id;

    /**
     * 商品id
     */
    private Integer communityId;

    /**
     * 商品数量
     */
    private Integer commodityNumber;

    /**
     * 用户id
     */
    private Integer userId;

    /**
     * 插入时间
     */
    private LocalDateTime createTime;

    /**
     * 更新时间
     */
    private LocalDateTime updateTime;

    private static final long serialVersionUID = 1L;

    /**
     * 
     */
    public Integer getId() {
        return id;
    }

    /**
     * 
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 商品id
     */
    public Integer getCommunityId() {
        return communityId;
    }

    /**
     * 商品id
     */
    public void setCommunityId(Integer communityId) {
        this.communityId = communityId;
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
     * 用户id
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * 用户id
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * 插入时间
     */
    public LocalDateTime getCreateTime() {
        return createTime;
    }

    /**
     * 插入时间
     */
    public void setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
    }

    /**
     * 更新时间
     */
    public LocalDateTime getUpdateTime() {
        return updateTime;
    }

    /**
     * 更新时间
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
        Cart other = (Cart) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getCommunityId() == null ? other.getCommunityId() == null : this.getCommunityId().equals(other.getCommunityId()))
            && (this.getCommodityNumber() == null ? other.getCommodityNumber() == null : this.getCommodityNumber().equals(other.getCommodityNumber()))
            && (this.getUserId() == null ? other.getUserId() == null : this.getUserId().equals(other.getUserId()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getUpdateTime() == null ? other.getUpdateTime() == null : this.getUpdateTime().equals(other.getUpdateTime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getCommunityId() == null) ? 0 : getCommunityId().hashCode());
        result = prime * result + ((getCommodityNumber() == null) ? 0 : getCommodityNumber().hashCode());
        result = prime * result + ((getUserId() == null) ? 0 : getUserId().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getUpdateTime() == null) ? 0 : getUpdateTime().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", communityId=").append(communityId);
        sb.append(", commodityNumber=").append(commodityNumber);
        sb.append(", userId=").append(userId);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}