package bean;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * 商品表
 * @TableName commodity
 */
public class Commodity implements Serializable {
    /**
     * 索引
     */
    private Integer id;

    /**
     * 商品名
     */
    private String name;

    /**
     * 价格
     */
    private Float price;

    /**
     * 品牌
     */
    private String brand;

    /**
     * 商品库存
     */
    private Integer number;

    /**
     * 商品类别id
     */
    private Integer categoryId;

    /**
     * 折扣，取值范围0-1,0.1表示打1折，1表示不打折
     */
    private Float discount;

    /**
     * 状态，0 商品下架，1 商品上架
     */
    private Integer status;

    /**
     * 商品图片的地址，放在web/static/image中
     */
    private String imageUrl;

    /**
     * 商品说明，备注
     */
    private String illustrate;

    /**
     * 创建时间
     */
    private LocalDateTime createTime;

    /**
     * 更新时间
     */
    private LocalDateTime updateTime;

    private static final long serialVersionUID = 1L;

    /**
     * 索引
     */
    public Integer getId() {
        return id;
    }

    /**
     * 索引
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 商品名
     */
    public String getName() {
        return name;
    }

    /**
     * 商品名
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 价格
     */
    public Float getPrice() {
        return price;
    }

    /**
     * 价格
     */
    public void setPrice(Float price) {
        this.price = price;
    }

    /**
     * 品牌
     */
    public String getBrand() {
        return brand;
    }

    /**
     * 品牌
     */
    public void setBrand(String brand) {
        this.brand = brand;
    }

    /**
     * 商品库存
     */
    public Integer getNumber() {
        return number;
    }

    /**
     * 商品库存
     */
    public void setNumber(Integer number) {
        this.number = number;
    }

    /**
     * 商品类别id
     */
    public Integer getCategoryId() {
        return categoryId;
    }

    /**
     * 商品类别id
     */
    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    /**
     * 折扣，取值范围0-1,0.1表示打1折，1表示不打折
     */
    public Float getDiscount() {
        return discount;
    }

    /**
     * 折扣，取值范围0-1,0.1表示打1折，1表示不打折
     */
    public void setDiscount(Float discount) {
        this.discount = discount;
    }

    /**
     * 状态，0 商品下架，1 商品上架
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * 状态，0 商品下架，1 商品上架
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * 商品图片的地址，放在web/static/image中
     */
    public String getImageUrl() {
        return imageUrl;
    }

    /**
     * 商品图片的地址，放在web/static/image中
     */
    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    /**
     * 商品说明，备注
     */
    public String getIllustrate() {
        return illustrate;
    }

    /**
     * 商品说明，备注
     */
    public void setIllustrate(String illustrate) {
        this.illustrate = illustrate;
    }

    /**
     * 创建时间
     */
    public LocalDateTime getCreateTime() {
        return createTime;
    }

    /**
     * 创建时间
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
        Commodity other = (Commodity) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getPrice() == null ? other.getPrice() == null : this.getPrice().equals(other.getPrice()))
            && (this.getBrand() == null ? other.getBrand() == null : this.getBrand().equals(other.getBrand()))
            && (this.getNumber() == null ? other.getNumber() == null : this.getNumber().equals(other.getNumber()))
            && (this.getCategoryId() == null ? other.getCategoryId() == null : this.getCategoryId().equals(other.getCategoryId()))
            && (this.getDiscount() == null ? other.getDiscount() == null : this.getDiscount().equals(other.getDiscount()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getImageUrl() == null ? other.getImageUrl() == null : this.getImageUrl().equals(other.getImageUrl()))
            && (this.getIllustrate() == null ? other.getIllustrate() == null : this.getIllustrate().equals(other.getIllustrate()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getUpdateTime() == null ? other.getUpdateTime() == null : this.getUpdateTime().equals(other.getUpdateTime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getPrice() == null) ? 0 : getPrice().hashCode());
        result = prime * result + ((getBrand() == null) ? 0 : getBrand().hashCode());
        result = prime * result + ((getNumber() == null) ? 0 : getNumber().hashCode());
        result = prime * result + ((getCategoryId() == null) ? 0 : getCategoryId().hashCode());
        result = prime * result + ((getDiscount() == null) ? 0 : getDiscount().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getImageUrl() == null) ? 0 : getImageUrl().hashCode());
        result = prime * result + ((getIllustrate() == null) ? 0 : getIllustrate().hashCode());
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
        sb.append(", name=").append(name);
        sb.append(", price=").append(price);
        sb.append(", brand=").append(brand);
        sb.append(", number=").append(number);
        sb.append(", categoryId=").append(categoryId);
        sb.append(", discount=").append(discount);
        sb.append(", status=").append(status);
        sb.append(", imageUrl=").append(imageUrl);
        sb.append(", illustrate=").append(illustrate);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}