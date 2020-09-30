package com.ly.shopping.dao.bo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OrdershoppExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OrdershoppExample() {
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

        public Criteria andOrderIdIsNull() {
            addCriterion("order_id is null");
            return (Criteria) this;
        }

        public Criteria andOrderIdIsNotNull() {
            addCriterion("order_id is not null");
            return (Criteria) this;
        }

        public Criteria andOrderIdEqualTo(Integer value) {
            addCriterion("order_id =", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotEqualTo(Integer value) {
            addCriterion("order_id <>", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdGreaterThan(Integer value) {
            addCriterion("order_id >", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("order_id >=", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLessThan(Integer value) {
            addCriterion("order_id <", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLessThanOrEqualTo(Integer value) {
            addCriterion("order_id <=", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdIn(List<Integer> values) {
            addCriterion("order_id in", values, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotIn(List<Integer> values) {
            addCriterion("order_id not in", values, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdBetween(Integer value1, Integer value2) {
            addCriterion("order_id between", value1, value2, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotBetween(Integer value1, Integer value2) {
            addCriterion("order_id not between", value1, value2, "orderId");
            return (Criteria) this;
        }

        public Criteria andGoodIdIsNull() {
            addCriterion("good_Id is null");
            return (Criteria) this;
        }

        public Criteria andGoodIdIsNotNull() {
            addCriterion("good_Id is not null");
            return (Criteria) this;
        }

        public Criteria andGoodIdEqualTo(Integer value) {
            addCriterion("good_Id =", value, "goodId");
            return (Criteria) this;
        }

        public Criteria andGoodIdNotEqualTo(Integer value) {
            addCriterion("good_Id <>", value, "goodId");
            return (Criteria) this;
        }

        public Criteria andGoodIdGreaterThan(Integer value) {
            addCriterion("good_Id >", value, "goodId");
            return (Criteria) this;
        }

        public Criteria andGoodIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("good_Id >=", value, "goodId");
            return (Criteria) this;
        }

        public Criteria andGoodIdLessThan(Integer value) {
            addCriterion("good_Id <", value, "goodId");
            return (Criteria) this;
        }

        public Criteria andGoodIdLessThanOrEqualTo(Integer value) {
            addCriterion("good_Id <=", value, "goodId");
            return (Criteria) this;
        }

        public Criteria andGoodIdIn(List<Integer> values) {
            addCriterion("good_Id in", values, "goodId");
            return (Criteria) this;
        }

        public Criteria andGoodIdNotIn(List<Integer> values) {
            addCriterion("good_Id not in", values, "goodId");
            return (Criteria) this;
        }

        public Criteria andGoodIdBetween(Integer value1, Integer value2) {
            addCriterion("good_Id between", value1, value2, "goodId");
            return (Criteria) this;
        }

        public Criteria andGoodIdNotBetween(Integer value1, Integer value2) {
            addCriterion("good_Id not between", value1, value2, "goodId");
            return (Criteria) this;
        }

        public Criteria andGoodNameIsNull() {
            addCriterion("good_name is null");
            return (Criteria) this;
        }

        public Criteria andGoodNameIsNotNull() {
            addCriterion("good_name is not null");
            return (Criteria) this;
        }

        public Criteria andGoodNameEqualTo(String value) {
            addCriterion("good_name =", value, "goodName");
            return (Criteria) this;
        }

        public Criteria andGoodNameNotEqualTo(String value) {
            addCriterion("good_name <>", value, "goodName");
            return (Criteria) this;
        }

        public Criteria andGoodNameGreaterThan(String value) {
            addCriterion("good_name >", value, "goodName");
            return (Criteria) this;
        }

        public Criteria andGoodNameGreaterThanOrEqualTo(String value) {
            addCriterion("good_name >=", value, "goodName");
            return (Criteria) this;
        }

        public Criteria andGoodNameLessThan(String value) {
            addCriterion("good_name <", value, "goodName");
            return (Criteria) this;
        }

        public Criteria andGoodNameLessThanOrEqualTo(String value) {
            addCriterion("good_name <=", value, "goodName");
            return (Criteria) this;
        }

        public Criteria andGoodNameLike(String value) {
            addCriterion("good_name like", value, "goodName");
            return (Criteria) this;
        }

        public Criteria andGoodNameNotLike(String value) {
            addCriterion("good_name not like", value, "goodName");
            return (Criteria) this;
        }

        public Criteria andGoodNameIn(List<String> values) {
            addCriterion("good_name in", values, "goodName");
            return (Criteria) this;
        }

        public Criteria andGoodNameNotIn(List<String> values) {
            addCriterion("good_name not in", values, "goodName");
            return (Criteria) this;
        }

        public Criteria andGoodNameBetween(String value1, String value2) {
            addCriterion("good_name between", value1, value2, "goodName");
            return (Criteria) this;
        }

        public Criteria andGoodNameNotBetween(String value1, String value2) {
            addCriterion("good_name not between", value1, value2, "goodName");
            return (Criteria) this;
        }

        public Criteria andGoodNumIsNull() {
            addCriterion("good_num is null");
            return (Criteria) this;
        }

        public Criteria andGoodNumIsNotNull() {
            addCriterion("good_num is not null");
            return (Criteria) this;
        }

        public Criteria andGoodNumEqualTo(Integer value) {
            addCriterion("good_num =", value, "goodNum");
            return (Criteria) this;
        }

        public Criteria andGoodNumNotEqualTo(Integer value) {
            addCriterion("good_num <>", value, "goodNum");
            return (Criteria) this;
        }

        public Criteria andGoodNumGreaterThan(Integer value) {
            addCriterion("good_num >", value, "goodNum");
            return (Criteria) this;
        }

        public Criteria andGoodNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("good_num >=", value, "goodNum");
            return (Criteria) this;
        }

        public Criteria andGoodNumLessThan(Integer value) {
            addCriterion("good_num <", value, "goodNum");
            return (Criteria) this;
        }

        public Criteria andGoodNumLessThanOrEqualTo(Integer value) {
            addCriterion("good_num <=", value, "goodNum");
            return (Criteria) this;
        }

        public Criteria andGoodNumIn(List<Integer> values) {
            addCriterion("good_num in", values, "goodNum");
            return (Criteria) this;
        }

        public Criteria andGoodNumNotIn(List<Integer> values) {
            addCriterion("good_num not in", values, "goodNum");
            return (Criteria) this;
        }

        public Criteria andGoodNumBetween(Integer value1, Integer value2) {
            addCriterion("good_num between", value1, value2, "goodNum");
            return (Criteria) this;
        }

        public Criteria andGoodNumNotBetween(Integer value1, Integer value2) {
            addCriterion("good_num not between", value1, value2, "goodNum");
            return (Criteria) this;
        }

        public Criteria andPriceIsNull() {
            addCriterion("price is null");
            return (Criteria) this;
        }

        public Criteria andPriceIsNotNull() {
            addCriterion("price is not null");
            return (Criteria) this;
        }

        public Criteria andPriceEqualTo(BigDecimal value) {
            addCriterion("price =", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotEqualTo(BigDecimal value) {
            addCriterion("price <>", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThan(BigDecimal value) {
            addCriterion("price >", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("price >=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThan(BigDecimal value) {
            addCriterion("price <", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("price <=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceIn(List<BigDecimal> values) {
            addCriterion("price in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotIn(List<BigDecimal> values) {
            addCriterion("price not in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("price between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("price not between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andGuigeIsNull() {
            addCriterion("guige is null");
            return (Criteria) this;
        }

        public Criteria andGuigeIsNotNull() {
            addCriterion("guige is not null");
            return (Criteria) this;
        }

        public Criteria andGuigeEqualTo(String value) {
            addCriterion("guige =", value, "guige");
            return (Criteria) this;
        }

        public Criteria andGuigeNotEqualTo(String value) {
            addCriterion("guige <>", value, "guige");
            return (Criteria) this;
        }

        public Criteria andGuigeGreaterThan(String value) {
            addCriterion("guige >", value, "guige");
            return (Criteria) this;
        }

        public Criteria andGuigeGreaterThanOrEqualTo(String value) {
            addCriterion("guige >=", value, "guige");
            return (Criteria) this;
        }

        public Criteria andGuigeLessThan(String value) {
            addCriterion("guige <", value, "guige");
            return (Criteria) this;
        }

        public Criteria andGuigeLessThanOrEqualTo(String value) {
            addCriterion("guige <=", value, "guige");
            return (Criteria) this;
        }

        public Criteria andGuigeLike(String value) {
            addCriterion("guige like", value, "guige");
            return (Criteria) this;
        }

        public Criteria andGuigeNotLike(String value) {
            addCriterion("guige not like", value, "guige");
            return (Criteria) this;
        }

        public Criteria andGuigeIn(List<String> values) {
            addCriterion("guige in", values, "guige");
            return (Criteria) this;
        }

        public Criteria andGuigeNotIn(List<String> values) {
            addCriterion("guige not in", values, "guige");
            return (Criteria) this;
        }

        public Criteria andGuigeBetween(String value1, String value2) {
            addCriterion("guige between", value1, value2, "guige");
            return (Criteria) this;
        }

        public Criteria andGuigeNotBetween(String value1, String value2) {
            addCriterion("guige not between", value1, value2, "guige");
            return (Criteria) this;
        }

        public Criteria andReciceIsNull() {
            addCriterion("recice is null");
            return (Criteria) this;
        }

        public Criteria andReciceIsNotNull() {
            addCriterion("recice is not null");
            return (Criteria) this;
        }

        public Criteria andReciceEqualTo(String value) {
            addCriterion("recice =", value, "recice");
            return (Criteria) this;
        }

        public Criteria andReciceNotEqualTo(String value) {
            addCriterion("recice <>", value, "recice");
            return (Criteria) this;
        }

        public Criteria andReciceGreaterThan(String value) {
            addCriterion("recice >", value, "recice");
            return (Criteria) this;
        }

        public Criteria andReciceGreaterThanOrEqualTo(String value) {
            addCriterion("recice >=", value, "recice");
            return (Criteria) this;
        }

        public Criteria andReciceLessThan(String value) {
            addCriterion("recice <", value, "recice");
            return (Criteria) this;
        }

        public Criteria andReciceLessThanOrEqualTo(String value) {
            addCriterion("recice <=", value, "recice");
            return (Criteria) this;
        }

        public Criteria andReciceLike(String value) {
            addCriterion("recice like", value, "recice");
            return (Criteria) this;
        }

        public Criteria andReciceNotLike(String value) {
            addCriterion("recice not like", value, "recice");
            return (Criteria) this;
        }

        public Criteria andReciceIn(List<String> values) {
            addCriterion("recice in", values, "recice");
            return (Criteria) this;
        }

        public Criteria andReciceNotIn(List<String> values) {
            addCriterion("recice not in", values, "recice");
            return (Criteria) this;
        }

        public Criteria andReciceBetween(String value1, String value2) {
            addCriterion("recice between", value1, value2, "recice");
            return (Criteria) this;
        }

        public Criteria andReciceNotBetween(String value1, String value2) {
            addCriterion("recice not between", value1, value2, "recice");
            return (Criteria) this;
        }

        public Criteria andProviceIsNull() {
            addCriterion("provice is null");
            return (Criteria) this;
        }

        public Criteria andProviceIsNotNull() {
            addCriterion("provice is not null");
            return (Criteria) this;
        }

        public Criteria andProviceEqualTo(String value) {
            addCriterion("provice =", value, "provice");
            return (Criteria) this;
        }

        public Criteria andProviceNotEqualTo(String value) {
            addCriterion("provice <>", value, "provice");
            return (Criteria) this;
        }

        public Criteria andProviceGreaterThan(String value) {
            addCriterion("provice >", value, "provice");
            return (Criteria) this;
        }

        public Criteria andProviceGreaterThanOrEqualTo(String value) {
            addCriterion("provice >=", value, "provice");
            return (Criteria) this;
        }

        public Criteria andProviceLessThan(String value) {
            addCriterion("provice <", value, "provice");
            return (Criteria) this;
        }

        public Criteria andProviceLessThanOrEqualTo(String value) {
            addCriterion("provice <=", value, "provice");
            return (Criteria) this;
        }

        public Criteria andProviceLike(String value) {
            addCriterion("provice like", value, "provice");
            return (Criteria) this;
        }

        public Criteria andProviceNotLike(String value) {
            addCriterion("provice not like", value, "provice");
            return (Criteria) this;
        }

        public Criteria andProviceIn(List<String> values) {
            addCriterion("provice in", values, "provice");
            return (Criteria) this;
        }

        public Criteria andProviceNotIn(List<String> values) {
            addCriterion("provice not in", values, "provice");
            return (Criteria) this;
        }

        public Criteria andProviceBetween(String value1, String value2) {
            addCriterion("provice between", value1, value2, "provice");
            return (Criteria) this;
        }

        public Criteria andProviceNotBetween(String value1, String value2) {
            addCriterion("provice not between", value1, value2, "provice");
            return (Criteria) this;
        }

        public Criteria andCityIsNull() {
            addCriterion("city is null");
            return (Criteria) this;
        }

        public Criteria andCityIsNotNull() {
            addCriterion("city is not null");
            return (Criteria) this;
        }

        public Criteria andCityEqualTo(String value) {
            addCriterion("city =", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotEqualTo(String value) {
            addCriterion("city <>", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityGreaterThan(String value) {
            addCriterion("city >", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityGreaterThanOrEqualTo(String value) {
            addCriterion("city >=", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityLessThan(String value) {
            addCriterion("city <", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityLessThanOrEqualTo(String value) {
            addCriterion("city <=", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityLike(String value) {
            addCriterion("city like", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotLike(String value) {
            addCriterion("city not like", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityIn(List<String> values) {
            addCriterion("city in", values, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotIn(List<String> values) {
            addCriterion("city not in", values, "city");
            return (Criteria) this;
        }

        public Criteria andCityBetween(String value1, String value2) {
            addCriterion("city between", value1, value2, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotBetween(String value1, String value2) {
            addCriterion("city not between", value1, value2, "city");
            return (Criteria) this;
        }

        public Criteria andDistiryIsNull() {
            addCriterion("distiry is null");
            return (Criteria) this;
        }

        public Criteria andDistiryIsNotNull() {
            addCriterion("distiry is not null");
            return (Criteria) this;
        }

        public Criteria andDistiryEqualTo(String value) {
            addCriterion("distiry =", value, "distiry");
            return (Criteria) this;
        }

        public Criteria andDistiryNotEqualTo(String value) {
            addCriterion("distiry <>", value, "distiry");
            return (Criteria) this;
        }

        public Criteria andDistiryGreaterThan(String value) {
            addCriterion("distiry >", value, "distiry");
            return (Criteria) this;
        }

        public Criteria andDistiryGreaterThanOrEqualTo(String value) {
            addCriterion("distiry >=", value, "distiry");
            return (Criteria) this;
        }

        public Criteria andDistiryLessThan(String value) {
            addCriterion("distiry <", value, "distiry");
            return (Criteria) this;
        }

        public Criteria andDistiryLessThanOrEqualTo(String value) {
            addCriterion("distiry <=", value, "distiry");
            return (Criteria) this;
        }

        public Criteria andDistiryLike(String value) {
            addCriterion("distiry like", value, "distiry");
            return (Criteria) this;
        }

        public Criteria andDistiryNotLike(String value) {
            addCriterion("distiry not like", value, "distiry");
            return (Criteria) this;
        }

        public Criteria andDistiryIn(List<String> values) {
            addCriterion("distiry in", values, "distiry");
            return (Criteria) this;
        }

        public Criteria andDistiryNotIn(List<String> values) {
            addCriterion("distiry not in", values, "distiry");
            return (Criteria) this;
        }

        public Criteria andDistiryBetween(String value1, String value2) {
            addCriterion("distiry between", value1, value2, "distiry");
            return (Criteria) this;
        }

        public Criteria andDistiryNotBetween(String value1, String value2) {
            addCriterion("distiry not between", value1, value2, "distiry");
            return (Criteria) this;
        }

        public Criteria andJiedaoIsNull() {
            addCriterion("jiedao is null");
            return (Criteria) this;
        }

        public Criteria andJiedaoIsNotNull() {
            addCriterion("jiedao is not null");
            return (Criteria) this;
        }

        public Criteria andJiedaoEqualTo(String value) {
            addCriterion("jiedao =", value, "jiedao");
            return (Criteria) this;
        }

        public Criteria andJiedaoNotEqualTo(String value) {
            addCriterion("jiedao <>", value, "jiedao");
            return (Criteria) this;
        }

        public Criteria andJiedaoGreaterThan(String value) {
            addCriterion("jiedao >", value, "jiedao");
            return (Criteria) this;
        }

        public Criteria andJiedaoGreaterThanOrEqualTo(String value) {
            addCriterion("jiedao >=", value, "jiedao");
            return (Criteria) this;
        }

        public Criteria andJiedaoLessThan(String value) {
            addCriterion("jiedao <", value, "jiedao");
            return (Criteria) this;
        }

        public Criteria andJiedaoLessThanOrEqualTo(String value) {
            addCriterion("jiedao <=", value, "jiedao");
            return (Criteria) this;
        }

        public Criteria andJiedaoLike(String value) {
            addCriterion("jiedao like", value, "jiedao");
            return (Criteria) this;
        }

        public Criteria andJiedaoNotLike(String value) {
            addCriterion("jiedao not like", value, "jiedao");
            return (Criteria) this;
        }

        public Criteria andJiedaoIn(List<String> values) {
            addCriterion("jiedao in", values, "jiedao");
            return (Criteria) this;
        }

        public Criteria andJiedaoNotIn(List<String> values) {
            addCriterion("jiedao not in", values, "jiedao");
            return (Criteria) this;
        }

        public Criteria andJiedaoBetween(String value1, String value2) {
            addCriterion("jiedao between", value1, value2, "jiedao");
            return (Criteria) this;
        }

        public Criteria andJiedaoNotBetween(String value1, String value2) {
            addCriterion("jiedao not between", value1, value2, "jiedao");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNull() {
            addCriterion("phone is null");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNotNull() {
            addCriterion("phone is not null");
            return (Criteria) this;
        }

        public Criteria andPhoneEqualTo(String value) {
            addCriterion("phone =", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotEqualTo(String value) {
            addCriterion("phone <>", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThan(String value) {
            addCriterion("phone >", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("phone >=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThan(String value) {
            addCriterion("phone <", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThanOrEqualTo(String value) {
            addCriterion("phone <=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLike(String value) {
            addCriterion("phone like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotLike(String value) {
            addCriterion("phone not like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneIn(List<String> values) {
            addCriterion("phone in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotIn(List<String> values) {
            addCriterion("phone not in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneBetween(String value1, String value2) {
            addCriterion("phone between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotBetween(String value1, String value2) {
            addCriterion("phone not between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andRealTimeIsNull() {
            addCriterion("real_time is null");
            return (Criteria) this;
        }

        public Criteria andRealTimeIsNotNull() {
            addCriterion("real_time is not null");
            return (Criteria) this;
        }

        public Criteria andRealTimeEqualTo(Date value) {
            addCriterion("real_time =", value, "realTime");
            return (Criteria) this;
        }

        public Criteria andRealTimeNotEqualTo(Date value) {
            addCriterion("real_time <>", value, "realTime");
            return (Criteria) this;
        }

        public Criteria andRealTimeGreaterThan(Date value) {
            addCriterion("real_time >", value, "realTime");
            return (Criteria) this;
        }

        public Criteria andRealTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("real_time >=", value, "realTime");
            return (Criteria) this;
        }

        public Criteria andRealTimeLessThan(Date value) {
            addCriterion("real_time <", value, "realTime");
            return (Criteria) this;
        }

        public Criteria andRealTimeLessThanOrEqualTo(Date value) {
            addCriterion("real_time <=", value, "realTime");
            return (Criteria) this;
        }

        public Criteria andRealTimeIn(List<Date> values) {
            addCriterion("real_time in", values, "realTime");
            return (Criteria) this;
        }

        public Criteria andRealTimeNotIn(List<Date> values) {
            addCriterion("real_time not in", values, "realTime");
            return (Criteria) this;
        }

        public Criteria andRealTimeBetween(Date value1, Date value2) {
            addCriterion("real_time between", value1, value2, "realTime");
            return (Criteria) this;
        }

        public Criteria andRealTimeNotBetween(Date value1, Date value2) {
            addCriterion("real_time not between", value1, value2, "realTime");
            return (Criteria) this;
        }

        public Criteria andLinkSrcIsNull() {
            addCriterion("link_src is null");
            return (Criteria) this;
        }

        public Criteria andLinkSrcIsNotNull() {
            addCriterion("link_src is not null");
            return (Criteria) this;
        }

        public Criteria andLinkSrcEqualTo(String value) {
            addCriterion("link_src =", value, "linkSrc");
            return (Criteria) this;
        }

        public Criteria andLinkSrcNotEqualTo(String value) {
            addCriterion("link_src <>", value, "linkSrc");
            return (Criteria) this;
        }

        public Criteria andLinkSrcGreaterThan(String value) {
            addCriterion("link_src >", value, "linkSrc");
            return (Criteria) this;
        }

        public Criteria andLinkSrcGreaterThanOrEqualTo(String value) {
            addCriterion("link_src >=", value, "linkSrc");
            return (Criteria) this;
        }

        public Criteria andLinkSrcLessThan(String value) {
            addCriterion("link_src <", value, "linkSrc");
            return (Criteria) this;
        }

        public Criteria andLinkSrcLessThanOrEqualTo(String value) {
            addCriterion("link_src <=", value, "linkSrc");
            return (Criteria) this;
        }

        public Criteria andLinkSrcLike(String value) {
            addCriterion("link_src like", value, "linkSrc");
            return (Criteria) this;
        }

        public Criteria andLinkSrcNotLike(String value) {
            addCriterion("link_src not like", value, "linkSrc");
            return (Criteria) this;
        }

        public Criteria andLinkSrcIn(List<String> values) {
            addCriterion("link_src in", values, "linkSrc");
            return (Criteria) this;
        }

        public Criteria andLinkSrcNotIn(List<String> values) {
            addCriterion("link_src not in", values, "linkSrc");
            return (Criteria) this;
        }

        public Criteria andLinkSrcBetween(String value1, String value2) {
            addCriterion("link_src between", value1, value2, "linkSrc");
            return (Criteria) this;
        }

        public Criteria andLinkSrcNotBetween(String value1, String value2) {
            addCriterion("link_src not between", value1, value2, "linkSrc");
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