package com.aiyacloud.dao.domain.entity;

import java.io.Serializable;
import java.math.BigDecimal;

public class StocktakeGoods implements Serializable {
    /**  */
    private Integer id;

    /** 盘点id */
    private Integer stocktakeMainId;

    /** 仓库 */
    private String warehouse;

    /** 仓库代码 */
    private String warehouseCode;

    /** 仓位 */
    private String position;

    /** 仓位代码 */
    private String positionCode;

    /** 物料代码 */
    private String goodsCode;

    /** 物料名称 */
    private String goodsName;

    /** 规格型号 */
    private String goodsSpec;

    /** 商品类别 */
    private String goodsType;

    /** 单价 */
    private BigDecimal goodsPrice;

    /** 批次 */
    private String batch;

    /** 生产/采购日期 */
    private String purchaseDate;

    /** 保质期(天) */
    private Integer qualityGuaranteePeriod;

    /** 基本单位代码 */
    private String basicUnitCode;

    /** 基本单位 */
    private String basicUnit;

    /** 基本单位帐存数量 */
    private Integer basicUnitBookNum;

    /** 基本单位盘点数量 */
    private Integer basicUnitStocktakeNum;

    /** 单位代码 */
    private String unitCode;

    /** 单位 */
    private String unit;

    /** 品牌 */
    private String brand;

    /** 条形码 */
    private String barCode;

    /** 帐存数量 */
    private Integer bookNum;

    /** 盘点数量 */
    private Integer stocktakeNum;

    /** 调整数量 */
    private Integer diffNum;

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

    public String getWarehouse() {
        return warehouse;
    }

    public void setWarehouse(String warehouse) {
        this.warehouse = warehouse == null ? null : warehouse.trim();
    }

    public String getWarehouseCode() {
        return warehouseCode;
    }

    public void setWarehouseCode(String warehouseCode) {
        this.warehouseCode = warehouseCode == null ? null : warehouseCode.trim();
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position == null ? null : position.trim();
    }

    public String getPositionCode() {
        return positionCode;
    }

    public void setPositionCode(String positionCode) {
        this.positionCode = positionCode == null ? null : positionCode.trim();
    }

    public String getGoodsCode() {
        return goodsCode;
    }

    public void setGoodsCode(String goodsCode) {
        this.goodsCode = goodsCode == null ? null : goodsCode.trim();
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName == null ? null : goodsName.trim();
    }

    public String getGoodsSpec() {
        return goodsSpec;
    }

    public void setGoodsSpec(String goodsSpec) {
        this.goodsSpec = goodsSpec == null ? null : goodsSpec.trim();
    }

    public String getGoodsType() {
        return goodsType;
    }

    public void setGoodsType(String goodsType) {
        this.goodsType = goodsType == null ? null : goodsType.trim();
    }

    public BigDecimal getGoodsPrice() {
        return goodsPrice;
    }

    public void setGoodsPrice(BigDecimal goodsPrice) {
        this.goodsPrice = goodsPrice;
    }

    public String getBatch() {
        return batch;
    }

    public void setBatch(String batch) {
        this.batch = batch == null ? null : batch.trim();
    }

    public String getPurchaseDate() {
        return purchaseDate;
    }

    public void setPurchaseDate(String purchaseDate) {
        this.purchaseDate = purchaseDate == null ? null : purchaseDate.trim();
    }

    public Integer getQualityGuaranteePeriod() {
        return qualityGuaranteePeriod;
    }

    public void setQualityGuaranteePeriod(Integer qualityGuaranteePeriod) {
        this.qualityGuaranteePeriod = qualityGuaranteePeriod;
    }

    public String getBasicUnitCode() {
        return basicUnitCode;
    }

    public void setBasicUnitCode(String basicUnitCode) {
        this.basicUnitCode = basicUnitCode == null ? null : basicUnitCode.trim();
    }

    public String getBasicUnit() {
        return basicUnit;
    }

    public void setBasicUnit(String basicUnit) {
        this.basicUnit = basicUnit == null ? null : basicUnit.trim();
    }

    public Integer getBasicUnitBookNum() {
        return basicUnitBookNum;
    }

    public void setBasicUnitBookNum(Integer basicUnitBookNum) {
        this.basicUnitBookNum = basicUnitBookNum;
    }

    public Integer getBasicUnitStocktakeNum() {
        return basicUnitStocktakeNum;
    }

    public void setBasicUnitStocktakeNum(Integer basicUnitStocktakeNum) {
        this.basicUnitStocktakeNum = basicUnitStocktakeNum;
    }

    public String getUnitCode() {
        return unitCode;
    }

    public void setUnitCode(String unitCode) {
        this.unitCode = unitCode == null ? null : unitCode.trim();
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit == null ? null : unit.trim();
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand == null ? null : brand.trim();
    }

    public String getBarCode() {
        return barCode;
    }

    public void setBarCode(String barCode) {
        this.barCode = barCode == null ? null : barCode.trim();
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

    public Integer getDiffNum() {
        return diffNum;
    }

    public void setDiffNum(Integer diffNum) {
        this.diffNum = diffNum;
    }
}