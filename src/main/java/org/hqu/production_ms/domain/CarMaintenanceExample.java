package org.hqu.production_ms.domain;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class CarMaintenanceExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CarMaintenanceExample() {
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

        public Criteria andMaintenanceIdIsNull() {
            addCriterion("maintenance_id is null");
            return (Criteria) this;
        }

        public Criteria andMaintenanceIdIsNotNull() {
            addCriterion("maintenance_id is not null");
            return (Criteria) this;
        }

        public Criteria andMaintenanceIdEqualTo(Integer value) {
            addCriterion("maintenance_id =", value, "maintenanceId");
            return (Criteria) this;
        }

        public Criteria andMaintenanceIdNotEqualTo(Integer value) {
            addCriterion("maintenance_id <>", value, "maintenanceId");
            return (Criteria) this;
        }

        public Criteria andMaintenanceIdGreaterThan(Integer value) {
            addCriterion("maintenance_id >", value, "maintenanceId");
            return (Criteria) this;
        }

        public Criteria andMaintenanceIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("maintenance_id >=", value, "maintenanceId");
            return (Criteria) this;
        }

        public Criteria andMaintenanceIdLessThan(Integer value) {
            addCriterion("maintenance_id <", value, "maintenanceId");
            return (Criteria) this;
        }

        public Criteria andMaintenanceIdLessThanOrEqualTo(Integer value) {
            addCriterion("maintenance_id <=", value, "maintenanceId");
            return (Criteria) this;
        }

        public Criteria andMaintenanceIdIn(List<Integer> values) {
            addCriterion("maintenance_id in", values, "maintenanceId");
            return (Criteria) this;
        }

        public Criteria andMaintenanceIdNotIn(List<Integer> values) {
            addCriterion("maintenance_id not in", values, "maintenanceId");
            return (Criteria) this;
        }

        public Criteria andMaintenanceIdBetween(Integer value1, Integer value2) {
            addCriterion("maintenance_id between", value1, value2, "maintenanceId");
            return (Criteria) this;
        }

        public Criteria andMaintenanceIdNotBetween(Integer value1, Integer value2) {
            addCriterion("maintenance_id not between", value1, value2, "maintenanceId");
            return (Criteria) this;
        }

        public Criteria andKilometreIsNull() {
            addCriterion("kilometre is null");
            return (Criteria) this;
        }

        public Criteria andKilometreIsNotNull() {
            addCriterion("kilometre is not null");
            return (Criteria) this;
        }

        public Criteria andKilometreEqualTo(BigDecimal value) {
            addCriterion("kilometre =", value, "kilometre");
            return (Criteria) this;
        }

        public Criteria andKilometreNotEqualTo(BigDecimal value) {
            addCriterion("kilometre <>", value, "kilometre");
            return (Criteria) this;
        }

        public Criteria andKilometreGreaterThan(BigDecimal value) {
            addCriterion("kilometre >", value, "kilometre");
            return (Criteria) this;
        }

        public Criteria andKilometreGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("kilometre >=", value, "kilometre");
            return (Criteria) this;
        }

        public Criteria andKilometreLessThan(BigDecimal value) {
            addCriterion("kilometre <", value, "kilometre");
            return (Criteria) this;
        }

        public Criteria andKilometreLessThanOrEqualTo(BigDecimal value) {
            addCriterion("kilometre <=", value, "kilometre");
            return (Criteria) this;
        }

        public Criteria andKilometreLike(BigDecimal value) {
            addCriterion("kilometre like", value, "kilometre");
            return (Criteria) this;
        }

        public Criteria andKilometreNotLike(BigDecimal value) {
            addCriterion("kilometre not like", value, "kilometre");
            return (Criteria) this;
        }

        public Criteria andKilometreIn(List<BigDecimal> values) {
            addCriterion("kilometre in", values, "kilometre");
            return (Criteria) this;
        }

        public Criteria andKilometreNotIn(List<BigDecimal> values) {
            addCriterion("kilometre not in", values, "kilometre");
            return (Criteria) this;
        }

        public Criteria andKilometreBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("kilometre between", value1, value2, "kilometre");
            return (Criteria) this;
        }

        public Criteria andKilometreNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("kilometre not between", value1, value2, "kilometre");
            return (Criteria) this;
        }

        public Criteria andMprojectIsNull() {
            addCriterion("mProject is null");
            return (Criteria) this;
        }

        public Criteria andMprojectIsNotNull() {
            addCriterion("mProject is not null");
            return (Criteria) this;
        }

        public Criteria andMprojectEqualTo(String value) {
            addCriterion("mProject =", value, "mproject");
            return (Criteria) this;
        }

        public Criteria andMprojectNotEqualTo(String value) {
            addCriterion("mProject <>", value, "mproject");
            return (Criteria) this;
        }

        public Criteria andMprojectGreaterThan(String value) {
            addCriterion("mProject >", value, "mproject");
            return (Criteria) this;
        }

        public Criteria andMprojectGreaterThanOrEqualTo(String value) {
            addCriterion("mProject >=", value, "mproject");
            return (Criteria) this;
        }

        public Criteria andMprojectLessThan(String value) {
            addCriterion("mProject <", value, "mproject");
            return (Criteria) this;
        }

        public Criteria andMprojectLessThanOrEqualTo(String value) {
            addCriterion("mProject <=", value, "mproject");
            return (Criteria) this;
        }

        public Criteria andMprojectLike(String value) {
            addCriterion("mProject like", value, "mproject");
            return (Criteria) this;
        }

        public Criteria andMprojectNotLike(String value) {
            addCriterion("mProject not like", value, "mproject");
            return (Criteria) this;
        }

        public Criteria andMprojectIn(List<String> values) {
            addCriterion("mProject in", values, "mproject");
            return (Criteria) this;
        }

        public Criteria andMprojectNotIn(List<String> values) {
            addCriterion("mProject not in", values, "mproject");
            return (Criteria) this;
        }

        public Criteria andMprojectBetween(String value1, String value2) {
            addCriterion("mProject between", value1, value2, "mproject");
            return (Criteria) this;
        }

        public Criteria andMprojectNotBetween(String value1, String value2) {
            addCriterion("mProject not between", value1, value2, "mproject");
            return (Criteria) this;
        }

        public Criteria andTypeidIsNull() {
            addCriterion("typeId is null");
            return (Criteria) this;
        }

        public Criteria andTypeidIsNotNull() {
            addCriterion("typeId is not null");
            return (Criteria) this;
        }

        public Criteria andTypeidEqualTo(Integer value) {
            addCriterion("typeId =", value, "typeid");
            return (Criteria) this;
        }

        public Criteria andTypeidNotEqualTo(Integer value) {
            addCriterion("typeId <>", value, "typeid");
            return (Criteria) this;
        }

        public Criteria andTypeidGreaterThan(Integer value) {
            addCriterion("typeId >", value, "typeid");
            return (Criteria) this;
        }

        public Criteria andTypeidGreaterThanOrEqualTo(Integer value) {
            addCriterion("typeId >=", value, "typeid");
            return (Criteria) this;
        }

        public Criteria andTypeidLessThan(Integer value) {
            addCriterion("typeId <", value, "typeid");
            return (Criteria) this;
        }

        public Criteria andTypeidLessThanOrEqualTo(Integer value) {
            addCriterion("typeId <=", value, "typeid");
            return (Criteria) this;
        }

        public Criteria andTypeidIn(List<Integer> values) {
            addCriterion("typeId in", values, "typeid");
            return (Criteria) this;
        }

        public Criteria andTypeidNotIn(List<Integer> values) {
            addCriterion("typeId not in", values, "typeid");
            return (Criteria) this;
        }

        public Criteria andTypeidBetween(Integer value1, Integer value2) {
            addCriterion("typeId between", value1, value2, "typeid");
            return (Criteria) this;
        }

        public Criteria andTypeidNotBetween(Integer value1, Integer value2) {
            addCriterion("typeId not between", value1, value2, "typeid");
            return (Criteria) this;
        }

        public Criteria andMnameIsNull() {
            addCriterion("mname is null");
            return (Criteria) this;
        }

        public Criteria andMnameIsNotNull() {
            addCriterion("mname is not null");
            return (Criteria) this;
        }

        public Criteria andMnameEqualTo(String value) {
            addCriterion("mname =", value, "mname");
            return (Criteria) this;
        }

        public Criteria andMnameNotEqualTo(String value) {
            addCriterion("mname <>", value, "mname");
            return (Criteria) this;
        }

        public Criteria andMnameGreaterThan(String value) {
            addCriterion("mname >", value, "mname");
            return (Criteria) this;
        }

        public Criteria andMnameGreaterThanOrEqualTo(String value) {
            addCriterion("mname >=", value, "mname");
            return (Criteria) this;
        }

        public Criteria andMnameLessThan(String value) {
            addCriterion("mname <", value, "mname");
            return (Criteria) this;
        }

        public Criteria andMnameLessThanOrEqualTo(String value) {
            addCriterion("mname <=", value, "mname");
            return (Criteria) this;
        }

        public Criteria andMnameLike(String value) {
            addCriterion("mname like", value, "mname");
            return (Criteria) this;
        }

        public Criteria andMnameNotLike(String value) {
            addCriterion("mname not like", value, "mname");
            return (Criteria) this;
        }

        public Criteria andMnameIn(List<String> values) {
            addCriterion("mname in", values, "mname");
            return (Criteria) this;
        }

        public Criteria andMnameNotIn(List<String> values) {
            addCriterion("mname not in", values, "mname");
            return (Criteria) this;
        }

        public Criteria andMnameBetween(String value1, String value2) {
            addCriterion("mname between", value1, value2, "mname");
            return (Criteria) this;
        }

        public Criteria andMnameNotBetween(String value1, String value2) {
            addCriterion("mname not between", value1, value2, "mname");
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