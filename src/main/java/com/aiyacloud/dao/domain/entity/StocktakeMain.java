package com.aiyacloud.dao.domain.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class StocktakeMain implements Serializable {
    /**  */
    private Integer id;

    /** 创建时间 */
    private Date createAt;

    /** 盘点名称 */
    private String name;

    /** 0:盘点中 1:已结束 */
    private Integer status;

    /** 账面数量 */
    private Integer bookNum;

    /** 盘点数量 */
    private Integer stocktakeNum;

    /** 账面金额 */
    private BigDecimal bookAmount;

    /** 盘点金额 */
    private BigDecimal stocktakeAmount;

    /** 商品excel文件名 */
    private String goodsExcelName;

    /** 价格excel文件名 */
    private String priceExcelName;

    /** 商品excel文件路径 */
    private String goodsExcelPath;

    /** 价格excel文件路径 */
    private String priceExcelPath;

    /** 负责人id */
    private Integer userId;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getCreateAt() {
        return createAt;
    }

    public void setCreateAt(Date createAt) {
        this.createAt = createAt;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getBookNum() {
        return bookNum;
    }

    public void setBookNum(Integer bookNum) {
        this.bookNum = bookNum;
    }

    public Integer getStocktakeNum() {
        return stocktakeNum;
    }

    public void setStocktakeNum(Integer stocktakeNum) {
        this.stocktakeNum = stocktakeNum;
    }

    public BigDecimal getBookAmount() {
        return bookAmount;
    }

    public void setBookAmount(BigDecimal bookAmount) {
        this.bookAmount = bookAmount;
    }

    public BigDecimal getStocktakeAmount() {
        return stocktakeAmount;
    }

    public void setStocktakeAmount(BigDecimal stocktakeAmount) {
        this.stocktakeAmount = stocktakeAmount;
    }

    public String getGoodsExcelName() {
        return goodsExcelName;
    }

    public void setGoodsExcelName(String goodsExcelName) {
        this.goodsExcelName = goodsExcelName == null ? null : goodsExcelName.trim();
    }

    public String getPriceExcelName() {
        return priceExcelName;
    }

    public void setPriceExcelName(String priceExcelName) {
        this.priceExcelName = priceExcelName == null ? null : priceExcelName.trim();
    }

    public String getGoodsExcelPath() {
        return goodsExcelPath;
    }

    public void setGoodsExcelPath(String goodsExcelPath) {
        this.goodsExcelPath = goodsExcelPath == null ? null : goodsExcelPath.trim();
    }

    public String getPriceExcelPath() {
        return priceExcelPath;
    }

    public void setPriceExcelPath(String priceExcelPath) {
        this.priceExcelPath = priceExcelPath == null ? null : priceExcelPath.trim();
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }
}