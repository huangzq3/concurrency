package com.huangzq.study.goods;

/**
 * Created by demon on 2017/6/11.
 */
public class Goods {

    private Long id;

    /**
     * 商品名称
     */
    private String name;

    /**
     * 库存
     */
    private Integer stock;

    /**
     * 版本号
     */
    private Integer version;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    @Override
    public String toString() {
        return "Goods{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", stock=" + stock +
                ", version=" + version +
                '}';
    }
}
