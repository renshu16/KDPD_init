package com.aiyacloud.dao.domain.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class StocktakeLogExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public StocktakeLogExample() {
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

        public Criteria andGoodsIdIsNull() {
            addCriterion("goods_id is null");
            return (Criteria) this;
        }

        public Criteria andGoodsIdIsNotNull() {
            addCriterion("goods_id is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsIdEqualTo(Integer value) {
            addCriterion("goods_id =", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdNotEqualTo(Integer value) {
            addCriterion("goods_id <>", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdGreaterThan(Integer value) {
            addCriterion("goods_id >", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("goods_id >=", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdLessThan(Integer value) {
            addCriterion("goods_id <", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdLessThanOrEqualTo(Integer value) {
            addCriterion("goods_id <=", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdIn(List<Integer> values) {
            addCriterion("goods_id in", values, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdNotIn(List<Integer> values) {
            addCriterion("goods_id not in", values, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdBetween(Integer value1, Integer value2) {
            addCriterion("goods_id between", value1, value2, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdNotBetween(Integer value1, Integer value2) {
            addCriterion("goods_id not between", value1, value2, "goodsId");
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

        public Criteria andUseIsNull() {
            addCriterion("use is null");
            return (Criteria) this;
        }

        public Criteria andUseIsNotNull() {
            addCriterion("use is not null");
            return (Criteria) this;
        }

        public Criteria andUseEqualTo(Boolean value) {
            addCriterion("use =", value, "use");
            return (Criteria) this;
        }

        public Criteria andUseNotEqualTo(Boolean value) {
            addCriterion("use <>", value, "use");
            return (Criteria) this;
        }

        public Criteria andUseGreaterThan(Boolean value) {
            addCriterion("use >", value, "use");
            return (Criteria) this;
        }

        public Criteria andUseGreaterThanOrEqualTo(Boolean value) {
            addCriterion("use >=", value, "use");
            return (Criteria) this;
        }

        public Criteria andUseLessThan(Boolean value) {
            addCriterion("use <", value, "use");
            return (Criteria) this;
        }

        public Criteria andUseLessThanOrEqualTo(Boolean value) {
            addCriterion("use <=", value, "use");
            return (Criteria) this;
        }

        public Criteria andUseIn(List<Boolean> values) {
            addCriterion("use in", values, "use");
            return (Criteria) this;
        }

        public Criteria andUseNotIn(List<Boolean> values) {
            addCriterion("use not in", values, "use");
            return (Criteria) this;
        }

        public Criteria andUseBetween(Boolean value1, Boolean value2) {
            addCriterion("use between", value1, value2, "use");
            return (Criteria) this;
        }

        public Criteria andUseNotBetween(Boolean value1, Boolean value2) {
            addCriterion("use not between", value1, value2, "use");
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