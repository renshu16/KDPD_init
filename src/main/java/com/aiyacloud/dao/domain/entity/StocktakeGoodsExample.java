package com.aiyacloud.dao.domain.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class StocktakeGoodsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public StocktakeGoodsExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andStocktakeMainIdIsNull() {
            addCriterion("stocktake_main_id is null");
            return (Criteria) this;
        }

        public Criteria andStocktakeMainIdIsNotNull() {
            addCriterion("stocktake_main_id is not null");
            return (Criteria) this;
        }

        public Criteria andStocktakeMainIdEqualTo(Integer value) {
            addCriterion("stocktake_main_id =", value, "stocktakeMainId");
            return (Criteria) this;
        }

        public Criteria andStocktakeMainIdNotEqualTo(Integer value) {
            addCriterion("stocktake_main_id <>", value, "stocktakeMainId");
            return (Criteria) this;
        }

        public Criteria andStocktakeMainIdGreaterThan(Integer value) {
            addCriterion("stocktake_main_id >", value, "stocktakeMainId");
            return (Criteria) this;
        }

        public Criteria andStocktakeMainIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("stocktake_main_id >=", value, "stocktakeMainId");
            return (Criteria) this;
        }

        public Criteria andStocktakeMainIdLessThan(Integer value) {
            addCriterion("stocktake_main_id <", value, "stocktakeMainId");
            return (Criteria) this;
        }

        public Criteria andStocktakeMainIdLessThanOrEqualTo(Integer value) {
            addCriterion("stocktake_main_id <=", value, "stocktakeMainId");
            return (Criteria) this;
        }

        public Criteria andStocktakeMainIdIn(List<Integer> values) {
            addCriterion("stocktake_main_id in", values, "stocktakeMainId");
            return (Criteria) this;
        }

        public Criteria andStocktakeMainIdNotIn(List<Integer> values) {
            addCriterion("stocktake_main_id not in", values, "stocktakeMainId");
            return (Criteria) this;
        }

        public Criteria andStocktakeMainIdBetween(Integer value1, Integer value2) {
            addCriterion("stocktake_main_id between", value1, value2, "stocktakeMainId");
            return (Criteria) this;
        }

        public Criteria andStocktakeMainIdNotBetween(Integer value1, Integer value2) {
            addCriterion("stocktake_main_id not between", value1, value2, "stocktakeMainId");
            return (Criteria) this;
        }

        public Criteria andWarehouseIsNull() {
            addCriterion("warehouse is null");
            return (Criteria) this;
        }

        public Criteria andWarehouseIsNotNull() {
            addCriterion("warehouse is not null");
            return (Criteria) this;
        }

        public Criteria andWarehouseEqualTo(String value) {
            addCriterion("warehouse =", value, "warehouse");
            return (Criteria) this;
        }

        public Criteria andWarehouseNotEqualTo(String value) {
            addCriterion("warehouse <>", value, "warehouse");
            return (Criteria) this;
        }

        public Criteria andWarehouseGreaterThan(String value) {
            addCriterion("warehouse >", value, "warehouse");
            return (Criteria) this;
        }

        public Criteria andWarehouseGreaterThanOrEqualTo(String value) {
            addCriterion("warehouse >=", value, "warehouse");
            return (Criteria) this;
        }

        public Criteria andWarehouseLessThan(String value) {
            addCriterion("warehouse <", value, "warehouse");
            return (Criteria) this;
        }

        public Criteria andWarehouseLessThanOrEqualTo(String value) {
            addCriterion("warehouse <=", value, "warehouse");
            return (Criteria) this;
        }

        public Criteria andWarehouseLike(String value) {
            addCriterion("warehouse like", value, "warehouse");
            return (Criteria) this;
        }

        public Criteria andWarehouseNotLike(String value) {
            addCriterion("warehouse not like", value, "warehouse");
            return (Criteria) this;
        }

        public Criteria andWarehouseIn(List<String> values) {
            addCriterion("warehouse in", values, "warehouse");
            return (Criteria) this;
        }

        public Criteria andWarehouseNotIn(List<String> values) {
            addCriterion("warehouse not in", values, "warehouse");
            return (Criteria) this;
        }

        public Criteria andWarehouseBetween(String value1, String value2) {
            addCriterion("warehouse between", value1, value2, "warehouse");
            return (Criteria) this;
        }

        public Criteria andWarehouseNotBetween(String value1, String value2) {
            addCriterion("warehouse not between", value1, value2, "warehouse");
            return (Criteria) this;
        }

        public Criteria andWarehouseCodeIsNull() {
            addCriterion("warehouse_code is null");
            return (Criteria) this;
        }

        public Criteria andWarehouseCodeIsNotNull() {
            addCriterion("warehouse_code is not null");
            return (Criteria) this;
        }

        public Criteria andWarehouseCodeEqualTo(String value) {
            addCriterion("warehouse_code =", value, "warehouseCode");
            return (Criteria) this;
        }

        public Criteria andWarehouseCodeNotEqualTo(String value) {
            addCriterion("warehouse_code <>", value, "warehouseCode");
            return (Criteria) this;
        }

        public Criteria andWarehouseCodeGreaterThan(String value) {
            addCriterion("warehouse_code >", value, "warehouseCode");
            return (Criteria) this;
        }

        public Criteria andWarehouseCodeGreaterThanOrEqualTo(String value) {
            addCriterion("warehouse_code >=", value, "warehouseCode");
            return (Criteria) this;
        }

        public Criteria andWarehouseCodeLessThan(String value) {
            addCriterion("warehouse_code <", value, "warehouseCode");
            return (Criteria) this;
        }

        public Criteria andWarehouseCodeLessThanOrEqualTo(String value) {
            addCriterion("warehouse_code <=", value, "warehouseCode");
            return (Criteria) this;
        }

        public Criteria andWarehouseCodeLike(String value) {
            addCriterion("warehouse_code like", value, "warehouseCode");
            return (Criteria) this;
        }

        public Criteria andWarehouseCodeNotLike(String value) {
            addCriterion("warehouse_code not like", value, "warehouseCode");
            return (Criteria) this;
        }

        public Criteria andWarehouseCodeIn(List<String> values) {
            addCriterion("warehouse_code in", values, "warehouseCode");
            return (Criteria) this;
        }

        public Criteria andWarehouseCodeNotIn(List<String> values) {
            addCriterion("warehouse_code not in", values, "warehouseCode");
            return (Criteria) this;
        }

        public Criteria andWarehouseCodeBetween(String value1, String value2) {
            addCriterion("warehouse_code between", value1, value2, "warehouseCode");
            return (Criteria) this;
        }

        public Criteria andWarehouseCodeNotBetween(String value1, String value2) {
            addCriterion("warehouse_code not between", value1, value2, "warehouseCode");
            return (Criteria) this;
        }

        public Criteria andPositionIsNull() {
            addCriterion("position is null");
            return (Criteria) this;
        }

        public Criteria andPositionIsNotNull() {
            addCriterion("position is not null");
            return (Criteria) this;
        }

        public Criteria andPositionEqualTo(String value) {
            addCriterion("position =", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionNotEqualTo(String value) {
            addCriterion("position <>", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionGreaterThan(String value) {
            addCriterion("position >", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionGreaterThanOrEqualTo(String value) {
            addCriterion("position >=", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionLessThan(String value) {
            addCriterion("position <", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionLessThanOrEqualTo(String value) {
            addCriterion("position <=", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionLike(String value) {
            addCriterion("position like", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionNotLike(String value) {
            addCriterion("position not like", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionIn(List<String> values) {
            addCriterion("position in", values, "position");
            return (Criteria) this;
        }

        public Criteria andPositionNotIn(List<String> values) {
            addCriterion("position not in", values, "position");
            return (Criteria) this;
        }

        public Criteria andPositionBetween(String value1, String value2) {
            addCriterion("position between", value1, value2, "position");
            return (Criteria) this;
        }

        public Criteria andPositionNotBetween(String value1, String value2) {
            addCriterion("position not between", value1, value2, "position");
            return (Criteria) this;
        }

        public Criteria andPositionCodeIsNull() {
            addCriterion("position_code is null");
            return (Criteria) this;
        }

        public Criteria andPositionCodeIsNotNull() {
            addCriterion("position_code is not null");
            return (Criteria) this;
        }

        public Criteria andPositionCodeEqualTo(String value) {
            addCriterion("position_code =", value, "positionCode");
            return (Criteria) this;
        }

        public Criteria andPositionCodeNotEqualTo(String value) {
            addCriterion("position_code <>", value, "positionCode");
            return (Criteria) this;
        }

        public Criteria andPositionCodeGreaterThan(String value) {
            addCriterion("position_code >", value, "positionCode");
            return (Criteria) this;
        }

        public Criteria andPositionCodeGreaterThanOrEqualTo(String value) {
            addCriterion("position_code >=", value, "positionCode");
            return (Criteria) this;
        }

        public Criteria andPositionCodeLessThan(String value) {
            addCriterion("position_code <", value, "positionCode");
            return (Criteria) this;
        }

        public Criteria andPositionCodeLessThanOrEqualTo(String value) {
            addCriterion("position_code <=", value, "positionCode");
            return (Criteria) this;
        }

        public Criteria andPositionCodeLike(String value) {
            addCriterion("position_code like", value, "positionCode");
            return (Criteria) this;
        }

        public Criteria andPositionCodeNotLike(String value) {
            addCriterion("position_code not like", value, "positionCode");
            return (Criteria) this;
        }

        public Criteria andPositionCodeIn(List<String> values) {
            addCriterion("position_code in", values, "positionCode");
            return (Criteria) this;
        }

        public Criteria andPositionCodeNotIn(List<String> values) {
            addCriterion("position_code not in", values, "positionCode");
            return (Criteria) this;
        }

        public Criteria andPositionCodeBetween(String value1, String value2) {
            addCriterion("position_code between", value1, value2, "positionCode");
            return (Criteria) this;
        }

        public Criteria andPositionCodeNotBetween(String value1, String value2) {
            addCriterion("position_code not between", value1, value2, "positionCode");
            return (Criteria) this;
        }

        public Criteria andGoodsCodeIsNull() {
            addCriterion("goods_code is null");
            return (Criteria) this;
        }

        public Criteria andGoodsCodeIsNotNull() {
            addCriterion("goods_code is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsCodeEqualTo(String value) {
            addCriterion("goods_code =", value, "goodsCode");
            return (Criteria) this;
        }

        public Criteria andGoodsCodeNotEqualTo(String value) {
            addCriterion("goods_code <>", value, "goodsCode");
            return (Criteria) this;
        }

        public Criteria andGoodsCodeGreaterThan(String value) {
            addCriterion("goods_code >", value, "goodsCode");
            return (Criteria) this;
        }

        public Criteria andGoodsCodeGreaterThanOrEqualTo(String value) {
            addCriterion("goods_code >=", value, "goodsCode");
            return (Criteria) this;
        }

        public Criteria andGoodsCodeLessThan(String value) {
            addCriterion("goods_code <", value, "goodsCode");
            return (Criteria) this;
        }

        public Criteria andGoodsCodeLessThanOrEqualTo(String value) {
            addCriterion("goods_code <=", value, "goodsCode");
            return (Criteria) this;
        }

        public Criteria andGoodsCodeLike(String value) {
            addCriterion("goods_code like", value, "goodsCode");
            return (Criteria) this;
        }

        public Criteria andGoodsCodeNotLike(String value) {
            addCriterion("goods_code not like", value, "goodsCode");
            return (Criteria) this;
        }

        public Criteria andGoodsCodeIn(List<String> values) {
            addCriterion("goods_code in", values, "goodsCode");
            return (Criteria) this;
        }

        public Criteria andGoodsCodeNotIn(List<String> values) {
            addCriterion("goods_code not in", values, "goodsCode");
            return (Criteria) this;
        }

        public Criteria andGoodsCodeBetween(String value1, String value2) {
            addCriterion("goods_code between", value1, value2, "goodsCode");
            return (Criteria) this;
        }

        public Criteria andGoodsCodeNotBetween(String value1, String value2) {
            addCriterion("goods_code not between", value1, value2, "goodsCode");
            return (Criteria) this;
        }

        public Criteria andGoodsNameIsNull() {
            addCriterion("goods_name is null");
            return (Criteria) this;
        }

        public Criteria andGoodsNameIsNotNull() {
            addCriterion("goods_name is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsNameEqualTo(String value) {
            addCriterion("goods_name =", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameNotEqualTo(String value) {
            addCriterion("goods_name <>", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameGreaterThan(String value) {
            addCriterion("goods_name >", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameGreaterThanOrEqualTo(String value) {
            addCriterion("goods_name >=", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameLessThan(String value) {
            addCriterion("goods_name <", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameLessThanOrEqualTo(String value) {
            addCriterion("goods_name <=", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameLike(String value) {
            addCriterion("goods_name like", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameNotLike(String value) {
            addCriterion("goods_name not like", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameIn(List<String> values) {
            addCriterion("goods_name in", values, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameNotIn(List<String> values) {
            addCriterion("goods_name not in", values, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameBetween(String value1, String value2) {
            addCriterion("goods_name between", value1, value2, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameNotBetween(String value1, String value2) {
            addCriterion("goods_name not between", value1, value2, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsSpecIsNull() {
            addCriterion("goods_spec is null");
            return (Criteria) this;
        }

        public Criteria andGoodsSpecIsNotNull() {
            addCriterion("goods_spec is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsSpecEqualTo(String value) {
            addCriterion("goods_spec =", value, "goodsSpec");
            return (Criteria) this;
        }

        public Criteria andGoodsSpecNotEqualTo(String value) {
            addCriterion("goods_spec <>", value, "goodsSpec");
            return (Criteria) this;
        }

        public Criteria andGoodsSpecGreaterThan(String value) {
            addCriterion("goods_spec >", value, "goodsSpec");
            return (Criteria) this;
        }

        public Criteria andGoodsSpecGreaterThanOrEqualTo(String value) {
            addCriterion("goods_spec >=", value, "goodsSpec");
            return (Criteria) this;
        }

        public Criteria andGoodsSpecLessThan(String value) {
            addCriterion("goods_spec <", value, "goodsSpec");
            return (Criteria) this;
        }

        public Criteria andGoodsSpecLessThanOrEqualTo(String value) {
            addCriterion("goods_spec <=", value, "goodsSpec");
            return (Criteria) this;
        }

        public Criteria andGoodsSpecLike(String value) {
            addCriterion("goods_spec like", value, "goodsSpec");
            return (Criteria) this;
        }

        public Criteria andGoodsSpecNotLike(String value) {
            addCriterion("goods_spec not like", value, "goodsSpec");
            return (Criteria) this;
        }

        public Criteria andGoodsSpecIn(List<String> values) {
            addCriterion("goods_spec in", values, "goodsSpec");
            return (Criteria) this;
        }

        public Criteria andGoodsSpecNotIn(List<String> values) {
            addCriterion("goods_spec not in", values, "goodsSpec");
            return (Criteria) this;
        }

        public Criteria andGoodsSpecBetween(String value1, String value2) {
            addCriterion("goods_spec between", value1, value2, "goodsSpec");
            return (Criteria) this;
        }

        public Criteria andGoodsSpecNotBetween(String value1, String value2) {
            addCriterion("goods_spec not between", value1, value2, "goodsSpec");
            return (Criteria) this;
        }

        public Criteria andGoodsTypeIsNull() {
            addCriterion("goods_type is null");
            return (Criteria) this;
        }

        public Criteria andGoodsTypeIsNotNull() {
            addCriterion("goods_type is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsTypeEqualTo(String value) {
            addCriterion("goods_type =", value, "goodsType");
            return (Criteria) this;
        }

        public Criteria andGoodsTypeNotEqualTo(String value) {
            addCriterion("goods_type <>", value, "goodsType");
            return (Criteria) this;
        }

        public Criteria andGoodsTypeGreaterThan(String value) {
            addCriterion("goods_type >", value, "goodsType");
            return (Criteria) this;
        }

        public Criteria andGoodsTypeGreaterThanOrEqualTo(String value) {
            addCriterion("goods_type >=", value, "goodsType");
            return (Criteria) this;
        }

        public Criteria andGoodsTypeLessThan(String value) {
            addCriterion("goods_type <", value, "goodsType");
            return (Criteria) this;
        }

        public Criteria andGoodsTypeLessThanOrEqualTo(String value) {
            addCriterion("goods_type <=", value, "goodsType");
            return (Criteria) this;
        }

        public Criteria andGoodsTypeLike(String value) {
            addCriterion("goods_type like", value, "goodsType");
            return (Criteria) this;
        }

        public Criteria andGoodsTypeNotLike(String value) {
            addCriterion("goods_type not like", value, "goodsType");
            return (Criteria) this;
        }

        public Criteria andGoodsTypeIn(List<String> values) {
            addCriterion("goods_type in", values, "goodsType");
            return (Criteria) this;
        }

        public Criteria andGoodsTypeNotIn(List<String> values) {
            addCriterion("goods_type not in", values, "goodsType");
            return (Criteria) this;
        }

        public Criteria andGoodsTypeBetween(String value1, String value2) {
            addCriterion("goods_type between", value1, value2, "goodsType");
            return (Criteria) this;
        }

        public Criteria andGoodsTypeNotBetween(String value1, String value2) {
            addCriterion("goods_type not between", value1, value2, "goodsType");
            return (Criteria) this;
        }

        public Criteria andGoodsPriceIsNull() {
            addCriterion("goods_price is null");
            return (Criteria) this;
        }

        public Criteria andGoodsPriceIsNotNull() {
            addCriterion("goods_price is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsPriceEqualTo(BigDecimal value) {
            addCriterion("goods_price =", value, "goodsPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsPriceNotEqualTo(BigDecimal value) {
            addCriterion("goods_price <>", value, "goodsPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsPriceGreaterThan(BigDecimal value) {
            addCriterion("goods_price >", value, "goodsPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("goods_price >=", value, "goodsPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsPriceLessThan(BigDecimal value) {
            addCriterion("goods_price <", value, "goodsPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("goods_price <=", value, "goodsPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsPriceIn(List<BigDecimal> values) {
            addCriterion("goods_price in", values, "goodsPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsPriceNotIn(List<BigDecimal> values) {
            addCriterion("goods_price not in", values, "goodsPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("goods_price between", value1, value2, "goodsPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("goods_price not between", value1, value2, "goodsPrice");
            return (Criteria) this;
        }

        public Criteria andBatchIsNull() {
            addCriterion("batch is null");
            return (Criteria) this;
        }

        public Criteria andBatchIsNotNull() {
            addCriterion("batch is not null");
            return (Criteria) this;
        }

        public Criteria andBatchEqualTo(String value) {
            addCriterion("batch =", value, "batch");
            return (Criteria) this;
        }

        public Criteria andBatchNotEqualTo(String value) {
            addCriterion("batch <>", value, "batch");
            return (Criteria) this;
        }

        public Criteria andBatchGreaterThan(String value) {
            addCriterion("batch >", value, "batch");
            return (Criteria) this;
        }

        public Criteria andBatchGreaterThanOrEqualTo(String value) {
            addCriterion("batch >=", value, "batch");
            return (Criteria) this;
        }

        public Criteria andBatchLessThan(String value) {
            addCriterion("batch <", value, "batch");
            return (Criteria) this;
        }

        public Criteria andBatchLessThanOrEqualTo(String value) {
            addCriterion("batch <=", value, "batch");
            return (Criteria) this;
        }

        public Criteria andBatchLike(String value) {
            addCriterion("batch like", value, "batch");
            return (Criteria) this;
        }

        public Criteria andBatchNotLike(String value) {
            addCriterion("batch not like", value, "batch");
            return (Criteria) this;
        }

        public Criteria andBatchIn(List<String> values) {
            addCriterion("batch in", values, "batch");
            return (Criteria) this;
        }

        public Criteria andBatchNotIn(List<String> values) {
            addCriterion("batch not in", values, "batch");
            return (Criteria) this;
        }

        public Criteria andBatchBetween(String value1, String value2) {
            addCriterion("batch between", value1, value2, "batch");
            return (Criteria) this;
        }

        public Criteria andBatchNotBetween(String value1, String value2) {
            addCriterion("batch not between", value1, value2, "batch");
            return (Criteria) this;
        }

        public Criteria andPurchaseDateIsNull() {
            addCriterion("purchase_date is null");
            return (Criteria) this;
        }

        public Criteria andPurchaseDateIsNotNull() {
            addCriterion("purchase_date is not null");
            return (Criteria) this;
        }

        public Criteria andPurchaseDateEqualTo(String value) {
            addCriterion("purchase_date =", value, "purchaseDate");
            return (Criteria) this;
        }

        public Criteria andPurchaseDateNotEqualTo(String value) {
            addCriterion("purchase_date <>", value, "purchaseDate");
            return (Criteria) this;
        }

        public Criteria andPurchaseDateGreaterThan(String value) {
            addCriterion("purchase_date >", value, "purchaseDate");
            return (Criteria) this;
        }

        public Criteria andPurchaseDateGreaterThanOrEqualTo(String value) {
            addCriterion("purchase_date >=", value, "purchaseDate");
            return (Criteria) this;
        }

        public Criteria andPurchaseDateLessThan(String value) {
            addCriterion("purchase_date <", value, "purchaseDate");
            return (Criteria) this;
        }

        public Criteria andPurchaseDateLessThanOrEqualTo(String value) {
            addCriterion("purchase_date <=", value, "purchaseDate");
            return (Criteria) this;
        }

        public Criteria andPurchaseDateLike(String value) {
            addCriterion("purchase_date like", value, "purchaseDate");
            return (Criteria) this;
        }

        public Criteria andPurchaseDateNotLike(String value) {
            addCriterion("purchase_date not like", value, "purchaseDate");
            return (Criteria) this;
        }

        public Criteria andPurchaseDateIn(List<String> values) {
            addCriterion("purchase_date in", values, "purchaseDate");
            return (Criteria) this;
        }

        public Criteria andPurchaseDateNotIn(List<String> values) {
            addCriterion("purchase_date not in", values, "purchaseDate");
            return (Criteria) this;
        }

        public Criteria andPurchaseDateBetween(String value1, String value2) {
            addCriterion("purchase_date between", value1, value2, "purchaseDate");
            return (Criteria) this;
        }

        public Criteria andPurchaseDateNotBetween(String value1, String value2) {
            addCriterion("purchase_date not between", value1, value2, "purchaseDate");
            return (Criteria) this;
        }

        public Criteria andQualityGuaranteePeriodIsNull() {
            addCriterion("quality_guarantee_period is null");
            return (Criteria) this;
        }

        public Criteria andQualityGuaranteePeriodIsNotNull() {
            addCriterion("quality_guarantee_period is not null");
            return (Criteria) this;
        }

        public Criteria andQualityGuaranteePeriodEqualTo(Integer value) {
            addCriterion("quality_guarantee_period =", value, "qualityGuaranteePeriod");
            return (Criteria) this;
        }

        public Criteria andQualityGuaranteePeriodNotEqualTo(Integer value) {
            addCriterion("quality_guarantee_period <>", value, "qualityGuaranteePeriod");
            return (Criteria) this;
        }

        public Criteria andQualityGuaranteePeriodGreaterThan(Integer value) {
            addCriterion("quality_guarantee_period >", value, "qualityGuaranteePeriod");
            return (Criteria) this;
        }

        public Criteria andQualityGuaranteePeriodGreaterThanOrEqualTo(Integer value) {
            addCriterion("quality_guarantee_period >=", value, "qualityGuaranteePeriod");
            return (Criteria) this;
        }

        public Criteria andQualityGuaranteePeriodLessThan(Integer value) {
            addCriterion("quality_guarantee_period <", value, "qualityGuaranteePeriod");
            return (Criteria) this;
        }

        public Criteria andQualityGuaranteePeriodLessThanOrEqualTo(Integer value) {
            addCriterion("quality_guarantee_period <=", value, "qualityGuaranteePeriod");
            return (Criteria) this;
        }

        public Criteria andQualityGuaranteePeriodIn(List<Integer> values) {
            addCriterion("quality_guarantee_period in", values, "qualityGuaranteePeriod");
            return (Criteria) this;
        }

        public Criteria andQualityGuaranteePeriodNotIn(List<Integer> values) {
            addCriterion("quality_guarantee_period not in", values, "qualityGuaranteePeriod");
            return (Criteria) this;
        }

        public Criteria andQualityGuaranteePeriodBetween(Integer value1, Integer value2) {
            addCriterion("quality_guarantee_period between", value1, value2, "qualityGuaranteePeriod");
            return (Criteria) this;
        }

        public Criteria andQualityGuaranteePeriodNotBetween(Integer value1, Integer value2) {
            addCriterion("quality_guarantee_period not between", value1, value2, "qualityGuaranteePeriod");
            return (Criteria) this;
        }

        public Criteria andBasicUnitCodeIsNull() {
            addCriterion("basic_unit_code is null");
            return (Criteria) this;
        }

        public Criteria andBasicUnitCodeIsNotNull() {
            addCriterion("basic_unit_code is not null");
            return (Criteria) this;
        }

        public Criteria andBasicUnitCodeEqualTo(String value) {
            addCriterion("basic_unit_code =", value, "basicUnitCode");
            return (Criteria) this;
        }

        public Criteria andBasicUnitCodeNotEqualTo(String value) {
            addCriterion("basic_unit_code <>", value, "basicUnitCode");
            return (Criteria) this;
        }

        public Criteria andBasicUnitCodeGreaterThan(String value) {
            addCriterion("basic_unit_code >", value, "basicUnitCode");
            return (Criteria) this;
        }

        public Criteria andBasicUnitCodeGreaterThanOrEqualTo(String value) {
            addCriterion("basic_unit_code >=", value, "basicUnitCode");
            return (Criteria) this;
        }

        public Criteria andBasicUnitCodeLessThan(String value) {
            addCriterion("basic_unit_code <", value, "basicUnitCode");
            return (Criteria) this;
        }

        public Criteria andBasicUnitCodeLessThanOrEqualTo(String value) {
            addCriterion("basic_unit_code <=", value, "basicUnitCode");
            return (Criteria) this;
        }

        public Criteria andBasicUnitCodeLike(String value) {
            addCriterion("basic_unit_code like", value, "basicUnitCode");
            return (Criteria) this;
        }

        public Criteria andBasicUnitCodeNotLike(String value) {
            addCriterion("basic_unit_code not like", value, "basicUnitCode");
            return (Criteria) this;
        }

        public Criteria andBasicUnitCodeIn(List<String> values) {
            addCriterion("basic_unit_code in", values, "basicUnitCode");
            return (Criteria) this;
        }

        public Criteria andBasicUnitCodeNotIn(List<String> values) {
            addCriterion("basic_unit_code not in", values, "basicUnitCode");
            return (Criteria) this;
        }

        public Criteria andBasicUnitCodeBetween(String value1, String value2) {
            addCriterion("basic_unit_code between", value1, value2, "basicUnitCode");
            return (Criteria) this;
        }

        public Criteria andBasicUnitCodeNotBetween(String value1, String value2) {
            addCriterion("basic_unit_code not between", value1, value2, "basicUnitCode");
            return (Criteria) this;
        }

        public Criteria andBasicUnitIsNull() {
            addCriterion("basic_unit is null");
            return (Criteria) this;
        }

        public Criteria andBasicUnitIsNotNull() {
            addCriterion("basic_unit is not null");
            return (Criteria) this;
        }

        public Criteria andBasicUnitEqualTo(String value) {
            addCriterion("basic_unit =", value, "basicUnit");
            return (Criteria) this;
        }

        public Criteria andBasicUnitNotEqualTo(String value) {
            addCriterion("basic_unit <>", value, "basicUnit");
            return (Criteria) this;
        }

        public Criteria andBasicUnitGreaterThan(String value) {
            addCriterion("basic_unit >", value, "basicUnit");
            return (Criteria) this;
        }

        public Criteria andBasicUnitGreaterThanOrEqualTo(String value) {
            addCriterion("basic_unit >=", value, "basicUnit");
            return (Criteria) this;
        }

        public Criteria andBasicUnitLessThan(String value) {
            addCriterion("basic_unit <", value, "basicUnit");
            return (Criteria) this;
        }

        public Criteria andBasicUnitLessThanOrEqualTo(String value) {
            addCriterion("basic_unit <=", value, "basicUnit");
            return (Criteria) this;
        }

        public Criteria andBasicUnitLike(String value) {
            addCriterion("basic_unit like", value, "basicUnit");
            return (Criteria) this;
        }

        public Criteria andBasicUnitNotLike(String value) {
            addCriterion("basic_unit not like", value, "basicUnit");
            return (Criteria) this;
        }

        public Criteria andBasicUnitIn(List<String> values) {
            addCriterion("basic_unit in", values, "basicUnit");
            return (Criteria) this;
        }

        public Criteria andBasicUnitNotIn(List<String> values) {
            addCriterion("basic_unit not in", values, "basicUnit");
            return (Criteria) this;
        }

        public Criteria andBasicUnitBetween(String value1, String value2) {
            addCriterion("basic_unit between", value1, value2, "basicUnit");
            return (Criteria) this;
        }

        public Criteria andBasicUnitNotBetween(String value1, String value2) {
            addCriterion("basic_unit not between", value1, value2, "basicUnit");
            return (Criteria) this;
        }

        public Criteria andBasicUnitBookNumIsNull() {
            addCriterion("basic_unit_book_num is null");
            return (Criteria) this;
        }

        public Criteria andBasicUnitBookNumIsNotNull() {
            addCriterion("basic_unit_book_num is not null");
            return (Criteria) this;
        }

        public Criteria andBasicUnitBookNumEqualTo(Integer value) {
            addCriterion("basic_unit_book_num =", value, "basicUnitBookNum");
            return (Criteria) this;
        }

        public Criteria andBasicUnitBookNumNotEqualTo(Integer value) {
            addCriterion("basic_unit_book_num <>", value, "basicUnitBookNum");
            return (Criteria) this;
        }

        public Criteria andBasicUnitBookNumGreaterThan(Integer value) {
            addCriterion("basic_unit_book_num >", value, "basicUnitBookNum");
            return (Criteria) this;
        }

        public Criteria andBasicUnitBookNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("basic_unit_book_num >=", value, "basicUnitBookNum");
            return (Criteria) this;
        }

        public Criteria andBasicUnitBookNumLessThan(Integer value) {
            addCriterion("basic_unit_book_num <", value, "basicUnitBookNum");
            return (Criteria) this;
        }

        public Criteria andBasicUnitBookNumLessThanOrEqualTo(Integer value) {
            addCriterion("basic_unit_book_num <=", value, "basicUnitBookNum");
            return (Criteria) this;
        }

        public Criteria andBasicUnitBookNumIn(List<Integer> values) {
            addCriterion("basic_unit_book_num in", values, "basicUnitBookNum");
            return (Criteria) this;
        }

        public Criteria andBasicUnitBookNumNotIn(List<Integer> values) {
            addCriterion("basic_unit_book_num not in", values, "basicUnitBookNum");
            return (Criteria) this;
        }

        public Criteria andBasicUnitBookNumBetween(Integer value1, Integer value2) {
            addCriterion("basic_unit_book_num between", value1, value2, "basicUnitBookNum");
            return (Criteria) this;
        }

        public Criteria andBasicUnitBookNumNotBetween(Integer value1, Integer value2) {
            addCriterion("basic_unit_book_num not between", value1, value2, "basicUnitBookNum");
            return (Criteria) this;
        }

        public Criteria andBasicUnitStocktakeNumIsNull() {
            addCriterion("basic_unit_stocktake_num is null");
            return (Criteria) this;
        }

        public Criteria andBasicUnitStocktakeNumIsNotNull() {
            addCriterion("basic_unit_stocktake_num is not null");
            return (Criteria) this;
        }

        public Criteria andBasicUnitStocktakeNumEqualTo(Integer value) {
            addCriterion("basic_unit_stocktake_num =", value, "basicUnitStocktakeNum");
            return (Criteria) this;
        }

        public Criteria andBasicUnitStocktakeNumNotEqualTo(Integer value) {
            addCriterion("basic_unit_stocktake_num <>", value, "basicUnitStocktakeNum");
            return (Criteria) this;
        }

        public Criteria andBasicUnitStocktakeNumGreaterThan(Integer value) {
            addCriterion("basic_unit_stocktake_num >", value, "basicUnitStocktakeNum");
            return (Criteria) this;
        }

        public Criteria andBasicUnitStocktakeNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("basic_unit_stocktake_num >=", value, "basicUnitStocktakeNum");
            return (Criteria) this;
        }

        public Criteria andBasicUnitStocktakeNumLessThan(Integer value) {
            addCriterion("basic_unit_stocktake_num <", value, "basicUnitStocktakeNum");
            return (Criteria) this;
        }

        public Criteria andBasicUnitStocktakeNumLessThanOrEqualTo(Integer value) {
            addCriterion("basic_unit_stocktake_num <=", value, "basicUnitStocktakeNum");
            return (Criteria) this;
        }

        public Criteria andBasicUnitStocktakeNumIn(List<Integer> values) {
            addCriterion("basic_unit_stocktake_num in", values, "basicUnitStocktakeNum");
            return (Criteria) this;
        }

        public Criteria andBasicUnitStocktakeNumNotIn(List<Integer> values) {
            addCriterion("basic_unit_stocktake_num not in", values, "basicUnitStocktakeNum");
            return (Criteria) this;
        }

        public Criteria andBasicUnitStocktakeNumBetween(Integer value1, Integer value2) {
            addCriterion("basic_unit_stocktake_num between", value1, value2, "basicUnitStocktakeNum");
            return (Criteria) this;
        }

        public Criteria andBasicUnitStocktakeNumNotBetween(Integer value1, Integer value2) {
            addCriterion("basic_unit_stocktake_num not between", value1, value2, "basicUnitStocktakeNum");
            return (Criteria) this;
        }

        public Criteria andUnitCodeIsNull() {
            addCriterion("unit_code is null");
            return (Criteria) this;
        }

        public Criteria andUnitCodeIsNotNull() {
            addCriterion("unit_code is not null");
            return (Criteria) this;
        }

        public Criteria andUnitCodeEqualTo(String value) {
            addCriterion("unit_code =", value, "unitCode");
            return (Criteria) this;
        }

        public Criteria andUnitCodeNotEqualTo(String value) {
            addCriterion("unit_code <>", value, "unitCode");
            return (Criteria) this;
        }

        public Criteria andUnitCodeGreaterThan(String value) {
            addCriterion("unit_code >", value, "unitCode");
            return (Criteria) this;
        }

        public Criteria andUnitCodeGreaterThanOrEqualTo(String value) {
            addCriterion("unit_code >=", value, "unitCode");
            return (Criteria) this;
        }

        public Criteria andUnitCodeLessThan(String value) {
            addCriterion("unit_code <", value, "unitCode");
            return (Criteria) this;
        }

        public Criteria andUnitCodeLessThanOrEqualTo(String value) {
            addCriterion("unit_code <=", value, "unitCode");
            return (Criteria) this;
        }

        public Criteria andUnitCodeLike(String value) {
            addCriterion("unit_code like", value, "unitCode");
            return (Criteria) this;
        }

        public Criteria andUnitCodeNotLike(String value) {
            addCriterion("unit_code not like", value, "unitCode");
            return (Criteria) this;
        }

        public Criteria andUnitCodeIn(List<String> values) {
            addCriterion("unit_code in", values, "unitCode");
            return (Criteria) this;
        }

        public Criteria andUnitCodeNotIn(List<String> values) {
            addCriterion("unit_code not in", values, "unitCode");
            return (Criteria) this;
        }

        public Criteria andUnitCodeBetween(String value1, String value2) {
            addCriterion("unit_code between", value1, value2, "unitCode");
            return (Criteria) this;
        }

        public Criteria andUnitCodeNotBetween(String value1, String value2) {
            addCriterion("unit_code not between", value1, value2, "unitCode");
            return (Criteria) this;
        }

        public Criteria andUnitIsNull() {
            addCriterion("unit is null");
            return (Criteria) this;
        }

        public Criteria andUnitIsNotNull() {
            addCriterion("unit is not null");
            return (Criteria) this;
        }

        public Criteria andUnitEqualTo(String value) {
            addCriterion("unit =", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitNotEqualTo(String value) {
            addCriterion("unit <>", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitGreaterThan(String value) {
            addCriterion("unit >", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitGreaterThanOrEqualTo(String value) {
            addCriterion("unit >=", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitLessThan(String value) {
            addCriterion("unit <", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitLessThanOrEqualTo(String value) {
            addCriterion("unit <=", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitLike(String value) {
            addCriterion("unit like", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitNotLike(String value) {
            addCriterion("unit not like", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitIn(List<String> values) {
            addCriterion("unit in", values, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitNotIn(List<String> values) {
            addCriterion("unit not in", values, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitBetween(String value1, String value2) {
            addCriterion("unit between", value1, value2, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitNotBetween(String value1, String value2) {
            addCriterion("unit not between", value1, value2, "unit");
            return (Criteria) this;
        }

        public Criteria andBrandIsNull() {
            addCriterion("brand is null");
            return (Criteria) this;
        }

        public Criteria andBrandIsNotNull() {
            addCriterion("brand is not null");
            return (Criteria) this;
        }

        public Criteria andBrandEqualTo(String value) {
            addCriterion("brand =", value, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandNotEqualTo(String value) {
            addCriterion("brand <>", value, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandGreaterThan(String value) {
            addCriterion("brand >", value, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandGreaterThanOrEqualTo(String value) {
            addCriterion("brand >=", value, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandLessThan(String value) {
            addCriterion("brand <", value, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandLessThanOrEqualTo(String value) {
            addCriterion("brand <=", value, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandLike(String value) {
            addCriterion("brand like", value, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandNotLike(String value) {
            addCriterion("brand not like", value, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandIn(List<String> values) {
            addCriterion("brand in", values, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandNotIn(List<String> values) {
            addCriterion("brand not in", values, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandBetween(String value1, String value2) {
            addCriterion("brand between", value1, value2, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandNotBetween(String value1, String value2) {
            addCriterion("brand not between", value1, value2, "brand");
            return (Criteria) this;
        }

        public Criteria andBarCodeIsNull() {
            addCriterion("bar_code is null");
            return (Criteria) this;
        }

        public Criteria andBarCodeIsNotNull() {
            addCriterion("bar_code is not null");
            return (Criteria) this;
        }

        public Criteria andBarCodeEqualTo(String value) {
            addCriterion("bar_code =", value, "barCode");
            return (Criteria) this;
        }

        public Criteria andBarCodeNotEqualTo(String value) {
            addCriterion("bar_code <>", value, "barCode");
            return (Criteria) this;
        }

        public Criteria andBarCodeGreaterThan(String value) {
            addCriterion("bar_code >", value, "barCode");
            return (Criteria) this;
        }

        public Criteria andBarCodeGreaterThanOrEqualTo(String value) {
            addCriterion("bar_code >=", value, "barCode");
            return (Criteria) this;
        }

        public Criteria andBarCodeLessThan(String value) {
            addCriterion("bar_code <", value, "barCode");
            return (Criteria) this;
        }

        public Criteria andBarCodeLessThanOrEqualTo(String value) {
            addCriterion("bar_code <=", value, "barCode");
            return (Criteria) this;
        }

        public Criteria andBarCodeLike(String value) {
            addCriterion("bar_code like", value, "barCode");
            return (Criteria) this;
        }

        public Criteria andBarCodeNotLike(String value) {
            addCriterion("bar_code not like", value, "barCode");
            return (Criteria) this;
        }

        public Criteria andBarCodeIn(List<String> values) {
            addCriterion("bar_code in", values, "barCode");
            return (Criteria) this;
        }

        public Criteria andBarCodeNotIn(List<String> values) {
            addCriterion("bar_code not in", values, "barCode");
            return (Criteria) this;
        }

        public Criteria andBarCodeBetween(String value1, String value2) {
            addCriterion("bar_code between", value1, value2, "barCode");
            return (Criteria) this;
        }

        public Criteria andBarCodeNotBetween(String value1, String value2) {
            addCriterion("bar_code not between", value1, value2, "barCode");
            return (Criteria) this;
        }

        public Criteria andBookNumIsNull() {
            addCriterion("book_num is null");
            return (Criteria) this;
        }

        public Criteria andBookNumIsNotNull() {
            addCriterion("book_num is not null");
            return (Criteria) this;
        }

        public Criteria andBookNumEqualTo(Integer value) {
            addCriterion("book_num =", value, "bookNum");
            return (Criteria) this;
        }

        public Criteria andBookNumNotEqualTo(Integer value) {
            addCriterion("book_num <>", value, "bookNum");
            return (Criteria) this;
        }

        public Criteria andBookNumGreaterThan(Integer value) {
            addCriterion("book_num >", value, "bookNum");
            return (Criteria) this;
        }

        public Criteria andBookNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("book_num >=", value, "bookNum");
            return (Criteria) this;
        }

        public Criteria andBookNumLessThan(Integer value) {
            addCriterion("book_num <", value, "bookNum");
            return (Criteria) this;
        }

        public Criteria andBookNumLessThanOrEqualTo(Integer value) {
            addCriterion("book_num <=", value, "bookNum");
            return (Criteria) this;
        }

        public Criteria andBookNumIn(List<Integer> values) {
            addCriterion("book_num in", values, "bookNum");
            return (Criteria) this;
        }

        public Criteria andBookNumNotIn(List<Integer> values) {
            addCriterion("book_num not in", values, "bookNum");
            return (Criteria) this;
        }

        public Criteria andBookNumBetween(Integer value1, Integer value2) {
            addCriterion("book_num between", value1, value2, "bookNum");
            return (Criteria) this;
        }

        public Criteria andBookNumNotBetween(Integer value1, Integer value2) {
            addCriterion("book_num not between", value1, value2, "bookNum");
            return (Criteria) this;
        }

        public Criteria andStocktakeNumIsNull() {
            addCriterion("stocktake_num is null");
            return (Criteria) this;
        }

        public Criteria andStocktakeNumIsNotNull() {
            addCriterion("stocktake_num is not null");
            return (Criteria) this;
        }

        public Criteria andStocktakeNumEqualTo(Integer value) {
            addCriterion("stocktake_num =", value, "stocktakeNum");
            return (Criteria) this;
        }

        public Criteria andStocktakeNumNotEqualTo(Integer value) {
            addCriterion("stocktake_num <>", value, "stocktakeNum");
            return (Criteria) this;
        }

        public Criteria andStocktakeNumGreaterThan(Integer value) {
            addCriterion("stocktake_num >", value, "stocktakeNum");
            return (Criteria) this;
        }

        public Criteria andStocktakeNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("stocktake_num >=", value, "stocktakeNum");
            return (Criteria) this;
        }

        public Criteria andStocktakeNumLessThan(Integer value) {
            addCriterion("stocktake_num <", value, "stocktakeNum");
            return (Criteria) this;
        }

        public Criteria andStocktakeNumLessThanOrEqualTo(Integer value) {
            addCriterion("stocktake_num <=", value, "stocktakeNum");
            return (Criteria) this;
        }

        public Criteria andStocktakeNumIn(List<Integer> values) {
            addCriterion("stocktake_num in", values, "stocktakeNum");
            return (Criteria) this;
        }

        public Criteria andStocktakeNumNotIn(List<Integer> values) {
            addCriterion("stocktake_num not in", values, "stocktakeNum");
            return (Criteria) this;
        }

        public Criteria andStocktakeNumBetween(Integer value1, Integer value2) {
            addCriterion("stocktake_num between", value1, value2, "stocktakeNum");
            return (Criteria) this;
        }

        public Criteria andStocktakeNumNotBetween(Integer value1, Integer value2) {
            addCriterion("stocktake_num not between", value1, value2, "stocktakeNum");
            return (Criteria) this;
        }

        public Criteria andDiffNumIsNull() {
            addCriterion("diff_num is null");
            return (Criteria) this;
        }

        public Criteria andDiffNumIsNotNull() {
            addCriterion("diff_num is not null");
            return (Criteria) this;
        }

        public Criteria andDiffNumEqualTo(Integer value) {
            addCriterion("diff_num =", value, "diffNum");
            return (Criteria) this;
        }

        public Criteria andDiffNumNotEqualTo(Integer value) {
            addCriterion("diff_num <>", value, "diffNum");
            return (Criteria) this;
        }

        public Criteria andDiffNumGreaterThan(Integer value) {
            addCriterion("diff_num >", value, "diffNum");
            return (Criteria) this;
        }

        public Criteria andDiffNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("diff_num >=", value, "diffNum");
            return (Criteria) this;
        }

        public Criteria andDiffNumLessThan(Integer value) {
            addCriterion("diff_num <", value, "diffNum");
            return (Criteria) this;
        }

        public Criteria andDiffNumLessThanOrEqualTo(Integer value) {
            addCriterion("diff_num <=", value, "diffNum");
            return (Criteria) this;
        }

        public Criteria andDiffNumIn(List<Integer> values) {
            addCriterion("diff_num in", values, "diffNum");
            return (Criteria) this;
        }

        public Criteria andDiffNumNotIn(List<Integer> values) {
            addCriterion("diff_num not in", values, "diffNum");
            return (Criteria) this;
        }

        public Criteria andDiffNumBetween(Integer value1, Integer value2) {
            addCriterion("diff_num between", value1, value2, "diffNum");
            return (Criteria) this;
        }

        public Criteria andDiffNumNotBetween(Integer value1, Integer value2) {
            addCriterion("diff_num not between", value1, value2, "diffNum");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}