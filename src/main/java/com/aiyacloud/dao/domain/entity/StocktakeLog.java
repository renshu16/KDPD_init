package com.aiyacloud.dao.domain.entity;

import java.io.Serializable;
import java.util.Date;

public class StocktakeLog implements Serializable {
    /**  */
    private Integer id;

    /** 盘点id */
    private Integer stocktakeMainId;

    /** 物料id */
    private Integer goodsId;

    /** 盘点数量 */
    private Integer stocktakeNum;

    /** 用户id */
    private Integer userId;

    /** 提交时间 */
    private Date createAt;

    /** 是否有效 0:无 1:有 */
    private Boolean use;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getStocktakeMainId() {
        return stocktakeMainId;
    }

    public void setStocktakeMainId(Integer stocktakeMainId) {
        this.stocktakeMainId = stocktakeMainId;
    }

    public Integer getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }

    public Integer getStocktakeNum() {
        return stocktakeNum;
    }

    public void setStocktakeNum(Integer stocktakeNum) {
        this.stocktakeNum = stocktakeNum;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Date getCreateAt() {
        return createAt;
    }

    public void setCreateAt(Date createAt) {
        this.createAt = createAt;
    }

    public Boolean getUse() {
        return use;
    }

    public void setUse(Boolean use) {
        this.use = use;
    }
}