package org.hqu.production_ms.domain;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class CarYouExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CarYouExample() {
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

        public Criteria andYouIdIsNull() {
            addCriterion("you_id is null");
            return (Criteria) this;
        }

        public Criteria andYouIdIsNotNull() {
            addCriterion("you_id is not null");
            return (Criteria) this;
        }

        public Criteria andYouIdEqualTo(Integer value) {
            addCriterion("you_id =", value, "youId");
            return (Criteria) this;
        }

        public Criteria andYouIdNotEqualTo(Integer value) {
            addCriterion("you_id <>", value, "youId");
            return (Criteria) this;
        }

        public Criteria andYouIdGreaterThan(Integer value) {
            addCriterion("you_id >", value, "youId");
            return (Criteria) this;
        }

        public Criteria andYouIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("you_id >=", value, "youId");
            return (Criteria) this;
        }

        public Criteria andYouIdLessThan(Integer value) {
            addCriterion("you_id <", value, "youId");
            return (Criteria) this;
        }

        public Criteria andYouIdLessThanOrEqualTo(Integer value) {
            addCriterion("you_id <=", value, "youId");
            return (Criteria) this;
        }

        public Criteria andYouIdIn(List<Integer> values) {
            addCriterion("you_id in", values, "youId");
            return (Criteria) this;
        }

        public Criteria andYouIdNotIn(List<Integer> values) {
            addCriterion("you_id not in", values, "youId");
            return (Criteria) this;
        }

        public Criteria andYouIdBetween(Integer value1, Integer value2) {
            addCriterion("you_id between", value1, value2, "youId");
            return (Criteria) this;
        }

        public Criteria andYouIdNotBetween(Integer value1, Integer value2) {
            addCriterion("you_id not between", value1, value2, "youId");
            return (Criteria) this;
        }

        public Criteria andYounumberIsNull() {
            addCriterion("younumber is null");
            return (Criteria) this;
        }

        public Criteria andYounumberIsNotNull() {
            addCriterion("younumber is not null");
            return (Criteria) this;
        }

        public Criteria andYounumberEqualTo(String value) {
            addCriterion("younumber =", value, "younumber");
            return (Criteria) this;
        }

        public Criteria andYounumberNotEqualTo(String value) {
            addCriterion("younumber <>", value, "younumber");
            return (Criteria) this;
        }

        public Criteria andYounumberGreaterThan(String value) {
            addCriterion("younumber >", value, "younumber");
            return (Criteria) this;
        }

        public Criteria andYounumberGreaterThanOrEqualTo(String value) {
            addCriterion("younumber >=", value, "younumber");
            return (Criteria) this;
        }

        public Criteria andYounumberLessThan(String value) {
            addCriterion("younumber <", value, "younumber");
            return (Criteria) this;
        }

        public Criteria andYounumberLessThanOrEqualTo(String value) {
            addCriterion("younumber <=", value, "younumber");
            return (Criteria) this;
        }

        public Criteria andYounumberLike(String value) {
            addCriterion("younumber like", value, "younumber");
            return (Criteria) this;
        }

        public Criteria andYounumberNotLike(String value) {
            addCriterion("younumber not like", value, "younumber");
            return (Criteria) this;
        }

        public Criteria andYounumberIn(List<String> values) {
            addCriterion("younumber in", values, "younumber");
            return (Criteria) this;
        }

        public Criteria andYounumberNotIn(List<String> values) {
            addCriterion("younumber not in", values, "younumber");
            return (Criteria) this;
        }

        public Criteria andYounumberBetween(String value1, String value2) {
            addCriterion("younumber between", value1, value2, "younumber");
            return (Criteria) this;
        }

        public Criteria andYounumberNotBetween(String value1, String value2) {
            addCriterion("younumber not between", value1, value2, "younumber");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdIsNull() {
            addCriterion("department_id is null");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdIsNotNull() {
            addCriterion("department_id is not null");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdEqualTo(String value) {
            addCriterion("department_id =", value, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdNotEqualTo(String value) {
            addCriterion("department_id <>", value, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdGreaterThan(String value) {
            addCriterion("department_id >", value, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdGreaterThanOrEqualTo(String value) {
            addCriterion("department_id >=", value, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdLessThan(String value) {
            addCriterion("department_id <", value, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdLessThanOrEqualTo(String value) {
            addCriterion("department_id <=", value, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdLike(String value) {
            addCriterion("department_id like", value, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdNotLike(String value) {
            addCriterion("department_id not like", value, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdIn(List<String> values) {
            addCriterion("department_id in", values, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdNotIn(List<String> values) {
            addCriterion("department_id not in", values, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdBetween(String value1, String value2) {
            addCriterion("department_id between", value1, value2, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdNotBetween(String value1, String value2) {
            addCriterion("department_id not between", value1, value2, "departmentId");
            return (Criteria) this;
        }

        public Criteria andBeiyong1IsNull() {
            addCriterion("beiyong1 is null");
            return (Criteria) this;
        }

        public Criteria andBeiyong1IsNotNull() {
            addCriterion("beiyong1 is not null");
            return (Criteria) this;
        }

        public Criteria andBeiyong1EqualTo(String value) {
            addCriterion("beiyong1 =", value, "beiyong1");
            return (Criteria) this;
        }

        public Criteria andBeiyong1NotEqualTo(String value) {
            addCriterion("beiyong1 <>", value, "beiyong1");
            return (Criteria) this;
        }

        public Criteria andBeiyong1GreaterThan(String value) {
            addCriterion("beiyong1 >", value, "beiyong1");
            return (Criteria) this;
        }

        public Criteria andBeiyong1GreaterThanOrEqualTo(String value) {
            addCriterion("beiyong1 >=", value, "beiyong1");
            return (Criteria) this;
        }

        public Criteria andBeiyong1LessThan(String value) {
            addCriterion("beiyong1 <", value, "beiyong1");
            return (Criteria) this;
        }

        public Criteria andBeiyong1LessThanOrEqualTo(String value) {
            addCriterion("beiyong1 <=", value, "beiyong1");
            return (Criteria) this;
        }

        public Criteria andBeiyong1Like(String value) {
            addCriterion("beiyong1 like", value, "beiyong1");
            return (Criteria) this;
        }

        public Criteria andBeiyong1NotLike(String value) {
            addCriterion("beiyong1 not like", value, "beiyong1");
            return (Criteria) this;
        }

        public Criteria andBeiyong1In(List<String> values) {
            addCriterion("beiyong1 in", values, "beiyong1");
            return (Criteria) this;
        }

        public Criteria andBeiyong1NotIn(List<String> values) {
            addCriterion("beiyong1 not in", values, "beiyong1");
            return (Criteria) this;
        }

        public Criteria andBeiyong1Between(String value1, String value2) {
            addCriterion("beiyong1 between", value1, value2, "beiyong1");
            return (Criteria) this;
        }

        public Criteria andBeiyong1NotBetween(String value1, String value2) {
            addCriterion("beiyong1 not between", value1, value2, "beiyong1");
            return (Criteria) this;
        }

        public Criteria andBeiyong2IsNull() {
            addCriterion("beiyong2 is null");
            return (Criteria) this;
        }

        public Criteria andBeiyong2IsNotNull() {
            addCriterion("beiyong2 is not null");
            return (Criteria) this;
        }

        public Criteria andBeiyong2EqualTo(BigDecimal value) {
            addCriterion("beiyong2 =", value, "beiyong2");
            return (Criteria) this;
        }

        public Criteria andBeiyong2NotEqualTo(BigDecimal value) {
            addCriterion("beiyong2 <>", value, "beiyong2");
            return (Criteria) this;
        }

        public Criteria andBeiyong2GreaterThan(BigDecimal value) {
            addCriterion("beiyong2 >", value, "beiyong2");
            return (Criteria) this;
        }

        public Criteria andBeiyong2GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("beiyong2 >=", value, "beiyong2");
            return (Criteria) this;
        }

        public Criteria andBeiyong2LessThan(BigDecimal value) {
            addCriterion("beiyong2 <", value, "beiyong2");
            return (Criteria) this;
        }

        public Criteria andBeiyong2LessThanOrEqualTo(BigDecimal value) {
            addCriterion("beiyong2 <=", value, "beiyong2");
            return (Criteria) this;
        }

        public Criteria andBeiyong2In(List<BigDecimal> values) {
            addCriterion("beiyong2 in", values, "beiyong2");
            return (Criteria) this;
        }

        public Criteria andBeiyong2NotIn(List<BigDecimal> values) {
            addCriterion("beiyong2 not in", values, "beiyong2");
            return (Criteria) this;
        }

        public Criteria andBeiyong2Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("beiyong2 between", value1, value2, "beiyong2");
            return (Criteria) this;
        }

        public Criteria andBeiyong2NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("beiyong2 not between", value1, value2, "beiyong2");
            return (Criteria) this;
        }

        public Criteria andBei1IsNull() {
            addCriterion("bei1 is null");
            return (Criteria) this;
        }

        public Criteria andBei1IsNotNull() {
            addCriterion("bei1 is not null");
            return (Criteria) this;
        }

        public Criteria andBei1EqualTo(BigDecimal value) {
            addCriterion("bei1 =", value, "bei1");
            return (Criteria) this;
        }

        public Criteria andBei1NotEqualTo(BigDecimal value) {
            addCriterion("bei1 <>", value, "bei1");
            return (Criteria) this;
        }

        public Criteria andBei1GreaterThan(BigDecimal value) {
            addCriterion("bei1 >", value, "bei1");
            return (Criteria) this;
        }

        public Criteria andBei1GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("bei1 >=", value, "bei1");
            return (Criteria) this;
        }

        public Criteria andBei1LessThan(BigDecimal value) {
            addCriterion("bei1 <", value, "bei1");
            return (Criteria) this;
        }

        public Criteria andBei1LessThanOrEqualTo(BigDecimal value) {
            addCriterion("bei1 <=", value, "bei1");
            return (Criteria) this;
        }

        public Criteria andBei1In(List<BigDecimal> values) {
            addCriterion("bei1 in", values, "bei1");
            return (Criteria) this;
        }

        public Criteria andBei1NotIn(List<BigDecimal> values) {
            addCriterion("bei1 not in", values, "bei1");
            return (Criteria) this;
        }

        public Criteria andBei1Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("bei1 between", value1, value2, "bei1");
            return (Criteria) this;
        }

        public Criteria andBei1NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("bei1 not between", value1, value2, "bei1");
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