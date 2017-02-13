package com.aiyacloud.dao.domain.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class StocktakeMainExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public StocktakeMainExample() {
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

        public Criteria andCreateAtIsNull() {
            addCriterion("create_at is null");
            return (Criteria) this;
        }

        public Criteria andCreateAtIsNotNull() {
            addCriterion("create_at is not null");
            return (Criteria) this;
        }

        public Criteria andCreateAtEqualTo(Date value) {
            addCriterion("create_at =", value, "createAt");
            return (Criteria) this;
        }

        public Criteria andCreateAtNotEqualTo(Date value) {
            addCriterion("create_at <>", value, "createAt");
            return (Criteria) this;
        }

        public Criteria andCreateAtGreaterThan(Date value) {
            addCriterion("create_at >", value, "createAt");
            return (Criteria) this;
        }

        public Criteria andCreateAtGreaterThanOrEqualTo(Date value) {
            addCriterion("create_at >=", value, "createAt");
            return (Criteria) this;
        }

        public Criteria andCreateAtLessThan(Date value) {
            addCriterion("create_at <", value, "createAt");
            return (Criteria) this;
        }

        public Criteria andCreateAtLessThanOrEqualTo(Date value) {
            addCriterion("create_at <=", value, "createAt");
            return (Criteria) this;
        }

        public Criteria andCreateAtIn(List<Date> values) {
            addCriterion("create_at in", values, "createAt");
            return (Criteria) this;
        }

        public Criteria andCreateAtNotIn(List<Date> values) {
            addCriterion("create_at not in", values, "createAt");
            return (Criteria) this;
        }

        public Criteria andCreateAtBetween(Date value1, Date value2) {
            addCriterion("create_at between", value1, value2, "createAt");
            return (Criteria) this;
        }

        public Criteria andCreateAtNotBetween(Date value1, Date value2) {
            addCriterion("create_at not between", value1, value2, "createAt");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("name not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Integer value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Integer value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Integer value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Integer value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Integer value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Integer> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Integer> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Integer value1, Integer value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("status not between", value1, value2, "status");
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

        public Criteria andBookAmountIsNull() {
            addCriterion("book_amount is null");
            return (Criteria) this;
        }

        public Criteria andBookAmountIsNotNull() {
            addCriterion("book_amount is not null");
            return (Criteria) this;
        }

        public Criteria andBookAmountEqualTo(BigDecimal value) {
            addCriterion("book_amount =", value, "bookAmount");
            return (Criteria) this;
        }

        public Criteria andBookAmountNotEqualTo(BigDecimal value) {
            addCriterion("book_amount <>", value, "bookAmount");
            return (Criteria) this;
        }

        public Criteria andBookAmountGreaterThan(BigDecimal value) {
            addCriterion("book_amount >", value, "bookAmount");
            return (Criteria) this;
        }

        public Criteria andBookAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("book_amount >=", value, "bookAmount");
            return (Criteria) this;
        }

        public Criteria andBookAmountLessThan(BigDecimal value) {
            addCriterion("book_amount <", value, "bookAmount");
            return (Criteria) this;
        }

        public Criteria andBookAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("book_amount <=", value, "bookAmount");
            return (Criteria) this;
        }

        public Criteria andBookAmountIn(List<BigDecimal> values) {
            addCriterion("book_amount in", values, "bookAmount");
            return (Criteria) this;
        }

        public Criteria andBookAmountNotIn(List<BigDecimal> values) {
            addCriterion("book_amount not in", values, "bookAmount");
            return (Criteria) this;
        }

        public Criteria andBookAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("book_amount between", value1, value2, "bookAmount");
            return (Criteria) this;
        }

        public Criteria andBookAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("book_amount not between", value1, value2, "bookAmount");
            return (Criteria) this;
        }

        public Criteria andStocktakeAmountIsNull() {
            addCriterion("stocktake_amount is null");
            return (Criteria) this;
        }

        public Criteria andStocktakeAmountIsNotNull() {
            addCriterion("stocktake_amount is not null");
            return (Criteria) this;
        }

        public Criteria andStocktakeAmountEqualTo(BigDecimal value) {
            addCriterion("stocktake_amount =", value, "stocktakeAmount");
            return (Criteria) this;
        }

        public Criteria andStocktakeAmountNotEqualTo(BigDecimal value) {
            addCriterion("stocktake_amount <>", value, "stocktakeAmount");
            return (Criteria) this;
        }

        public Criteria andStocktakeAmountGreaterThan(BigDecimal value) {
            addCriterion("stocktake_amount >", value, "stocktakeAmount");
            return (Criteria) this;
        }

        public Criteria andStocktakeAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("stocktake_amount >=", value, "stocktakeAmount");
            return (Criteria) this;
        }

        public Criteria andStocktakeAmountLessThan(BigDecimal value) {
            addCriterion("stocktake_amount <", value, "stocktakeAmount");
            return (Criteria) this;
        }

        public Criteria andStocktakeAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("stocktake_amount <=", value, "stocktakeAmount");
            return (Criteria) this;
        }

        public Criteria andStocktakeAmountIn(List<BigDecimal> values) {
            addCriterion("stocktake_amount in", values, "stocktakeAmount");
            return (Criteria) this;
        }

        public Criteria andStocktakeAmountNotIn(List<BigDecimal> values) {
            addCriterion("stocktake_amount not in", values, "stocktakeAmount");
            return (Criteria) this;
        }

        public Criteria andStocktakeAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("stocktake_amount between", value1, value2, "stocktakeAmount");
            return (Criteria) this;
        }

        public Criteria andStocktakeAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("stocktake_amount not between", value1, value2, "stocktakeAmount");
            return (Criteria) this;
        }

        public Criteria andGoodsExcelNameIsNull() {
            addCriterion("goods_excel_name is null");
            return (Criteria) this;
        }

        public Criteria andGoodsExcelNameIsNotNull() {
            addCriterion("goods_excel_name is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsExcelNameEqualTo(String value) {
            addCriterion("goods_excel_name =", value, "goodsExcelName");
            return (Criteria) this;
        }

        public Criteria andGoodsExcelNameNotEqualTo(String value) {
            addCriterion("goods_excel_name <>", value, "goodsExcelName");
            return (Criteria) this;
        }

        public Criteria andGoodsExcelNameGreaterThan(String value) {
            addCriterion("goods_excel_name >", value, "goodsExcelName");
            return (Criteria) this;
        }

        public Criteria andGoodsExcelNameGreaterThanOrEqualTo(String value) {
            addCriterion("goods_excel_name >=", value, "goodsExcelName");
            return (Criteria) this;
        }

        public Criteria andGoodsExcelNameLessThan(String value) {
            addCriterion("goods_excel_name <", value, "goodsExcelName");
            return (Criteria) this;
        }

        public Criteria andGoodsExcelNameLessThanOrEqualTo(String value) {
            addCriterion("goods_excel_name <=", value, "goodsExcelName");
            return (Criteria) this;
        }

        public Criteria andGoodsExcelNameLike(String value) {
            addCriterion("goods_excel_name like", value, "goodsExcelName");
            return (Criteria) this;
        }

        public Criteria andGoodsExcelNameNotLike(String value) {
            addCriterion("goods_excel_name not like", value, "goodsExcelName");
            return (Criteria) this;
        }

        public Criteria andGoodsExcelNameIn(List<String> values) {
            addCriterion("goods_excel_name in", values, "goodsExcelName");
            return (Criteria) this;
        }

        public Criteria andGoodsExcelNameNotIn(List<String> values) {
            addCriterion("goods_excel_name not in", values, "goodsExcelName");
            return (Criteria) this;
        }

        public Criteria andGoodsExcelNameBetween(String value1, String value2) {
            addCriterion("goods_excel_name between", value1, value2, "goodsExcelName");
            return (Criteria) this;
        }

        public Criteria andGoodsExcelNameNotBetween(String value1, String value2) {
            addCriterion("goods_excel_name not between", value1, value2, "goodsExcelName");
            return (Criteria) this;
        }

        public Criteria andPriceExcelNameIsNull() {
            addCriterion("price_excel_name is null");
            return (Criteria) this;
        }

        public Criteria andPriceExcelNameIsNotNull() {
            addCriterion("price_excel_name is not null");
            return (Criteria) this;
        }

        public Criteria andPriceExcelNameEqualTo(String value) {
            addCriterion("price_excel_name =", value, "priceExcelName");
            return (Criteria) this;
        }

        public Criteria andPriceExcelNameNotEqualTo(String value) {
            addCriterion("price_excel_name <>", value, "priceExcelName");
            return (Criteria) this;
        }

        public Criteria andPriceExcelNameGreaterThan(String value) {
            addCriterion("price_excel_name >", value, "priceExcelName");
            return (Criteria) this;
        }

        public Criteria andPriceExcelNameGreaterThanOrEqualTo(String value) {
            addCriterion("price_excel_name >=", value, "priceExcelName");
            return (Criteria) this;
        }

        public Criteria andPriceExcelNameLessThan(String value) {
            addCriterion("price_excel_name <", value, "priceExcelName");
            return (Criteria) this;
        }

        public Criteria andPriceExcelNameLessThanOrEqualTo(String value) {
            addCriterion("price_excel_name <=", value, "priceExcelName");
            return (Criteria) this;
        }

        public Criteria andPriceExcelNameLike(String value) {
            addCriterion("price_excel_name like", value, "priceExcelName");
            return (Criteria) this;
        }

        public Criteria andPriceExcelNameNotLike(String value) {
            addCriterion("price_excel_name not like", value, "priceExcelName");
            return (Criteria) this;
        }

        public Criteria andPriceExcelNameIn(List<String> values) {
            addCriterion("price_excel_name in", values, "priceExcelName");
            return (Criteria) this;
        }

        public Criteria andPriceExcelNameNotIn(List<String> values) {
            addCriterion("price_excel_name not in", values, "priceExcelName");
            return (Criteria) this;
        }

        public Criteria andPriceExcelNameBetween(String value1, String value2) {
            addCriterion("price_excel_name between", value1, value2, "priceExcelName");
            return (Criteria) this;
        }

        public Criteria andPriceExcelNameNotBetween(String value1, String value2) {
            addCriterion("price_excel_name not between", value1, value2, "priceExcelName");
            return (Criteria) this;
        }

        public Criteria andGoodsExcelPathIsNull() {
            addCriterion("goods_excel_path is null");
            return (Criteria) this;
        }

        public Criteria andGoodsExcelPathIsNotNull() {
            addCriterion("goods_excel_path is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsExcelPathEqualTo(String value) {
            addCriterion("goods_excel_path =", value, "goodsExcelPath");
            return (Criteria) this;
        }

        public Criteria andGoodsExcelPathNotEqualTo(String value) {
            addCriterion("goods_excel_path <>", value, "goodsExcelPath");
            return (Criteria) this;
        }

        public Criteria andGoodsExcelPathGreaterThan(String value) {
            addCriterion("goods_excel_path >", value, "goodsExcelPath");
            return (Criteria) this;
        }

        public Criteria andGoodsExcelPathGreaterThanOrEqualTo(String value) {
            addCriterion("goods_excel_path >=", value, "goodsExcelPath");
            return (Criteria) this;
        }

        public Criteria andGoodsExcelPathLessThan(String value) {
            addCriterion("goods_excel_path <", value, "goodsExcelPath");
            return (Criteria) this;
        }

        public Criteria andGoodsExcelPathLessThanOrEqualTo(String value) {
            addCriterion("goods_excel_path <=", value, "goodsExcelPath");
            return (Criteria) this;
        }

        public Criteria andGoodsExcelPathLike(String value) {
            addCriterion("goods_excel_path like", value, "goodsExcelPath");
            return (Criteria) this;
        }

        public Criteria andGoodsExcelPathNotLike(String value) {
            addCriterion("goods_excel_path not like", value, "goodsExcelPath");
            return (Criteria) this;
        }

        public Criteria andGoodsExcelPathIn(List<String> values) {
            addCriterion("goods_excel_path in", values, "goodsExcelPath");
            return (Criteria) this;
        }

        public Criteria andGoodsExcelPathNotIn(List<String> values) {
            addCriterion("goods_excel_path not in", values, "goodsExcelPath");
            return (Criteria) this;
        }

        public Criteria andGoodsExcelPathBetween(String value1, String value2) {
            addCriterion("goods_excel_path between", value1, value2, "goodsExcelPath");
            return (Criteria) this;
        }

        public Criteria andGoodsExcelPathNotBetween(String value1, String value2) {
            addCriterion("goods_excel_path not between", value1, value2, "goodsExcelPath");
            return (Criteria) this;
        }

        public Criteria andPriceExcelPathIsNull() {
            addCriterion("price_excel_path is null");
            return (Criteria) this;
        }

        public Criteria andPriceExcelPathIsNotNull() {
            addCriterion("price_excel_path is not null");
            return (Criteria) this;
        }

        public Criteria andPriceExcelPathEqualTo(String value) {
            addCriterion("price_excel_path =", value, "priceExcelPath");
            return (Criteria) this;
        }

        public Criteria andPriceExcelPathNotEqualTo(String value) {
            addCriterion("price_excel_path <>", value, "priceExcelPath");
            return (Criteria) this;
        }

        public Criteria andPriceExcelPathGreaterThan(String value) {
            addCriterion("price_excel_path >", value, "priceExcelPath");
            return (Criteria) this;
        }

        public Criteria andPriceExcelPathGreaterThanOrEqualTo(String value) {
            addCriterion("price_excel_path >=", value, "priceExcelPath");
            return (Criteria) this;
        }

        public Criteria andPriceExcelPathLessThan(String value) {
            addCriterion("price_excel_path <", value, "priceExcelPath");
            return (Criteria) this;
        }

        public Criteria andPriceExcelPathLessThanOrEqualTo(String value) {
            addCriterion("price_excel_path <=", value, "priceExcelPath");
            return (Criteria) this;
        }

        public Criteria andPriceExcelPathLike(String value) {
            addCriterion("price_excel_path like", value, "priceExcelPath");
            return (Criteria) this;
        }

        public Criteria andPriceExcelPathNotLike(String value) {
            addCriterion("price_excel_path not like", value, "priceExcelPath");
            return (Criteria) this;
        }

        public Criteria andPriceExcelPathIn(List<String> values) {
            addCriterion("price_excel_path in", values, "priceExcelPath");
            return (Criteria) this;
        }

        public Criteria andPriceExcelPathNotIn(List<String> values) {
            addCriterion("price_excel_path not in", values, "priceExcelPath");
            return (Criteria) this;
        }

        public Criteria andPriceExcelPathBetween(String value1, String value2) {
            addCriterion("price_excel_path between", value1, value2, "priceExcelPath");
            return (Criteria) this;
        }

        public Criteria andPriceExcelPathNotBetween(String value1, String value2) {
            addCriterion("price_excel_path not between", value1, value2, "priceExcelPath");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(Integer value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(Integer value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(Integer value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(Integer value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<Integer> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<Integer> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(Integer value1, Integer value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("user_id not between", value1, value2, "userId");
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