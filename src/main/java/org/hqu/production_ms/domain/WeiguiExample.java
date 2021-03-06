package org.hqu.production_ms.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class WeiguiExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public WeiguiExample() {
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

        public Criteria andWeiguiIdIsNull() {
            addCriterion("weigui_id is null");
            return (Criteria) this;
        }

        public Criteria andWeiguiIdIsNotNull() {
            addCriterion("weigui_id is not null");
            return (Criteria) this;
        }

        public Criteria andWeiguiIdEqualTo(Integer value) {
            addCriterion("weigui_id =", value, "weiguiId");
            return (Criteria) this;
        }

        public Criteria andWeiguiIdNotEqualTo(Integer value) {
            addCriterion("weigui_id <>", value, "weiguiId");
            return (Criteria) this;
        }

        public Criteria andWeiguiIdGreaterThan(Integer value) {
            addCriterion("weigui_id >", value, "weiguiId");
            return (Criteria) this;
        }

        public Criteria andWeiguiIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("weigui_id >=", value, "weiguiId");
            return (Criteria) this;
        }

        public Criteria andWeiguiIdLessThan(Integer value) {
            addCriterion("weigui_id <", value, "weiguiId");
            return (Criteria) this;
        }

        public Criteria andWeiguiIdLessThanOrEqualTo(Integer value) {
            addCriterion("weigui_id <=", value, "weiguiId");
            return (Criteria) this;
        }

        public Criteria andWeiguiIdIn(List<Integer> values) {
            addCriterion("weigui_id in", values, "weiguiId");
            return (Criteria) this;
        }

        public Criteria andWeiguiIdNotIn(List<Integer> values) {
            addCriterion("weigui_id not in", values, "weiguiId");
            return (Criteria) this;
        }

        public Criteria andWeiguiIdBetween(Integer value1, Integer value2) {
            addCriterion("weigui_id between", value1, value2, "weiguiId");
            return (Criteria) this;
        }

        public Criteria andWeiguiIdNotBetween(Integer value1, Integer value2) {
            addCriterion("weigui_id not between", value1, value2, "weiguiId");
            return (Criteria) this;
        }

        public Criteria andCarnumbIsNull() {
            addCriterion("carnumb is null");
            return (Criteria) this;
        }

        public Criteria andCarnumbIsNotNull() {
            addCriterion("carnumb is not null");
            return (Criteria) this;
        }

        public Criteria andCarnumbEqualTo(Integer value) {
            addCriterion("carnumb =", value, "carnumb");
            return (Criteria) this;
        }

        public Criteria andCarnumbNotEqualTo(Integer value) {
            addCriterion("carnumb <>", value, "carnumb");
            return (Criteria) this;
        }

        public Criteria andCarnumbGreaterThan(Integer value) {
            addCriterion("carnumb >", value, "carnumb");
            return (Criteria) this;
        }

        public Criteria andCarnumbGreaterThanOrEqualTo(Integer value) {
            addCriterion("carnumb >=", value, "carnumb");
            return (Criteria) this;
        }

        public Criteria andCarnumbLessThan(Integer value) {
            addCriterion("carnumb <", value, "carnumb");
            return (Criteria) this;
        }

        public Criteria andCarnumbLessThanOrEqualTo(Integer value) {
            addCriterion("carnumb <=", value, "carnumb");
            return (Criteria) this;
        }

        public Criteria andCarnumbIn(List<Integer> values) {
            addCriterion("carnumb in", values, "carnumb");
            return (Criteria) this;
        }

        public Criteria andCarnumbNotIn(List<Integer> values) {
            addCriterion("carnumb not in", values, "carnumb");
            return (Criteria) this;
        }

        public Criteria andCarnumbBetween(Integer value1, Integer value2) {
            addCriterion("carnumb between", value1, value2, "carnumb");
            return (Criteria) this;
        }

        public Criteria andCarnumbNotBetween(Integer value1, Integer value2) {
            addCriterion("carnumb not between", value1, value2, "carnumb");
            return (Criteria) this;
        }

        public Criteria andWeiguitimeIsNull() {
            addCriterion("weiguitime is null");
            return (Criteria) this;
        }

        public Criteria andWeiguitimeIsNotNull() {
            addCriterion("weiguitime is not null");
            return (Criteria) this;
        }

        public Criteria andWeiguitimeEqualTo(Date value) {
            addCriterion("weiguitime =", value, "weiguitime");
            return (Criteria) this;
        }

        public Criteria andWeiguitimeNotEqualTo(Date value) {
            addCriterion("weiguitime <>", value, "weiguitime");
            return (Criteria) this;
        }

        public Criteria andWeiguitimeGreaterThan(Date value) {
            addCriterion("weiguitime >", value, "weiguitime");
            return (Criteria) this;
        }

        public Criteria andWeiguitimeGreaterThanOrEqualTo(Date value) {
            addCriterion("weiguitime >=", value, "weiguitime");
            return (Criteria) this;
        }

        public Criteria andWeiguitimeLessThan(Date value) {
            addCriterion("weiguitime <", value, "weiguitime");
            return (Criteria) this;
        }

        public Criteria andWeiguitimeLessThanOrEqualTo(Date value) {
            addCriterion("weiguitime <=", value, "weiguitime");
            return (Criteria) this;
        }

        public Criteria andWeiguitimeIn(List<Date> values) {
            addCriterion("weiguitime in", values, "weiguitime");
            return (Criteria) this;
        }

        public Criteria andWeiguitimeNotIn(List<Date> values) {
            addCriterion("weiguitime not in", values, "weiguitime");
            return (Criteria) this;
        }

        public Criteria andWeiguitimeBetween(Date value1, Date value2) {
            addCriterion("weiguitime between", value1, value2, "weiguitime");
            return (Criteria) this;
        }

        public Criteria andWeiguitimeNotBetween(Date value1, Date value2) {
            addCriterion("weiguitime not between", value1, value2, "weiguitime");
            return (Criteria) this;
        }

        public Criteria andPlaceIsNull() {
            addCriterion("place is null");
            return (Criteria) this;
        }

        public Criteria andPlaceIsNotNull() {
            addCriterion("place is not null");
            return (Criteria) this;
        }

        public Criteria andPlaceEqualTo(String value) {
            addCriterion("place =", value, "place");
            return (Criteria) this;
        }

        public Criteria andPlaceNotEqualTo(String value) {
            addCriterion("place <>", value, "place");
            return (Criteria) this;
        }

        public Criteria andPlaceGreaterThan(String value) {
            addCriterion("place >", value, "place");
            return (Criteria) this;
        }

        public Criteria andPlaceGreaterThanOrEqualTo(String value) {
            addCriterion("place >=", value, "place");
            return (Criteria) this;
        }

        public Criteria andPlaceLessThan(String value) {
            addCriterion("place <", value, "place");
            return (Criteria) this;
        }

        public Criteria andPlaceLessThanOrEqualTo(String value) {
            addCriterion("place <=", value, "place");
            return (Criteria) this;
        }

        public Criteria andPlaceLike(String value) {
            addCriterion("place like", value, "place");
            return (Criteria) this;
        }

        public Criteria andPlaceNotLike(String value) {
            addCriterion("place not like", value, "place");
            return (Criteria) this;
        }

        public Criteria andPlaceIn(List<String> values) {
            addCriterion("place in", values, "place");
            return (Criteria) this;
        }

        public Criteria andPlaceNotIn(List<String> values) {
            addCriterion("place not in", values, "place");
            return (Criteria) this;
        }

        public Criteria andPlaceBetween(String value1, String value2) {
            addCriterion("place between", value1, value2, "place");
            return (Criteria) this;
        }

        public Criteria andPlaceNotBetween(String value1, String value2) {
            addCriterion("place not between", value1, value2, "place");
            return (Criteria) this;
        }

        public Criteria andXingweiIsNull() {
            addCriterion("xingwei is null");
            return (Criteria) this;
        }

        public Criteria andXingweiIsNotNull() {
            addCriterion("xingwei is not null");
            return (Criteria) this;
        }

        public Criteria andXingweiEqualTo(String value) {
            addCriterion("xingwei =", value, "xingwei");
            return (Criteria) this;
        }

        public Criteria andXingweiNotEqualTo(String value) {
            addCriterion("xingwei <>", value, "xingwei");
            return (Criteria) this;
        }

        public Criteria andXingweiGreaterThan(String value) {
            addCriterion("xingwei >", value, "xingwei");
            return (Criteria) this;
        }

        public Criteria andXingweiGreaterThanOrEqualTo(String value) {
            addCriterion("xingwei >=", value, "xingwei");
            return (Criteria) this;
        }

        public Criteria andXingweiLessThan(String value) {
            addCriterion("xingwei <", value, "xingwei");
            return (Criteria) this;
        }

        public Criteria andXingweiLessThanOrEqualTo(String value) {
            addCriterion("xingwei <=", value, "xingwei");
            return (Criteria) this;
        }

        public Criteria andXingweiLike(String value) {
            addCriterion("xingwei like", value, "xingwei");
            return (Criteria) this;
        }

        public Criteria andXingweiNotLike(String value) {
            addCriterion("xingwei not like", value, "xingwei");
            return (Criteria) this;
        }

        public Criteria andXingweiIn(List<String> values) {
            addCriterion("xingwei in", values, "xingwei");
            return (Criteria) this;
        }

        public Criteria andXingweiNotIn(List<String> values) {
            addCriterion("xingwei not in", values, "xingwei");
            return (Criteria) this;
        }

        public Criteria andXingweiBetween(String value1, String value2) {
            addCriterion("xingwei between", value1, value2, "xingwei");
            return (Criteria) this;
        }

        public Criteria andXingweiNotBetween(String value1, String value2) {
            addCriterion("xingwei not between", value1, value2, "xingwei");
            return (Criteria) this;
        }

        public Criteria andScoreIsNull() {
            addCriterion("score is null");
            return (Criteria) this;
        }

        public Criteria andScoreIsNotNull() {
            addCriterion("score is not null");
            return (Criteria) this;
        }

        public Criteria andScoreEqualTo(String value) {
            addCriterion("score =", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreNotEqualTo(String value) {
            addCriterion("score <>", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreGreaterThan(String value) {
            addCriterion("score >", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreGreaterThanOrEqualTo(String value) {
            addCriterion("score >=", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreLessThan(String value) {
            addCriterion("score <", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreLessThanOrEqualTo(String value) {
            addCriterion("score <=", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreLike(String value) {
            addCriterion("score like", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreNotLike(String value) {
            addCriterion("score not like", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreIn(List<String> values) {
            addCriterion("score in", values, "score");
            return (Criteria) this;
        }

        public Criteria andScoreNotIn(List<String> values) {
            addCriterion("score not in", values, "score");
            return (Criteria) this;
        }

        public Criteria andScoreBetween(String value1, String value2) {
            addCriterion("score between", value1, value2, "score");
            return (Criteria) this;
        }

        public Criteria andScoreNotBetween(String value1, String value2) {
            addCriterion("score not between", value1, value2, "score");
            return (Criteria) this;
        }

        public Criteria andMoneyIsNull() {
            addCriterion("money is null");
            return (Criteria) this;
        }

        public Criteria andMoneyIsNotNull() {
            addCriterion("money is not null");
            return (Criteria) this;
        }

        public Criteria andMoneyEqualTo(String value) {
            addCriterion("money =", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyNotEqualTo(String value) {
            addCriterion("money <>", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyGreaterThan(String value) {
            addCriterion("money >", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyGreaterThanOrEqualTo(String value) {
            addCriterion("money >=", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyLessThan(String value) {
            addCriterion("money <", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyLessThanOrEqualTo(String value) {
            addCriterion("money <=", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyLike(String value) {
            addCriterion("money like", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyNotLike(String value) {
            addCriterion("money not like", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyIn(List<String> values) {
            addCriterion("money in", values, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyNotIn(List<String> values) {
            addCriterion("money not in", values, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyBetween(String value1, String value2) {
            addCriterion("money between", value1, value2, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyNotBetween(String value1, String value2) {
            addCriterion("money not between", value1, value2, "money");
            return (Criteria) this;
        }

        public Criteria andIssendIsNull() {
            addCriterion("isSend is null");
            return (Criteria) this;
        }

        public Criteria andIssendIsNotNull() {
            addCriterion("isSend is not null");
            return (Criteria) this;
        }

        public Criteria andIssendEqualTo(String value) {
            addCriterion("isSend =", value, "issend");
            return (Criteria) this;
        }

        public Criteria andIssendNotEqualTo(String value) {
            addCriterion("isSend <>", value, "issend");
            return (Criteria) this;
        }

        public Criteria andIssendGreaterThan(String value) {
            addCriterion("isSend >", value, "issend");
            return (Criteria) this;
        }

        public Criteria andIssendGreaterThanOrEqualTo(String value) {
            addCriterion("isSend >=", value, "issend");
            return (Criteria) this;
        }

        public Criteria andIssendLessThan(String value) {
            addCriterion("isSend <", value, "issend");
            return (Criteria) this;
        }

        public Criteria andIssendLessThanOrEqualTo(String value) {
            addCriterion("isSend <=", value, "issend");
            return (Criteria) this;
        }

        public Criteria andIssendLike(String value) {
            addCriterion("isSend like", value, "issend");
            return (Criteria) this;
        }

        public Criteria andIssendNotLike(String value) {
            addCriterion("isSend not like", value, "issend");
            return (Criteria) this;
        }

        public Criteria andIssendIn(List<String> values) {
            addCriterion("isSend in", values, "issend");
            return (Criteria) this;
        }

        public Criteria andIssendNotIn(List<String> values) {
            addCriterion("isSend not in", values, "issend");
            return (Criteria) this;
        }

        public Criteria andIssendBetween(String value1, String value2) {
            addCriterion("isSend between", value1, value2, "issend");
            return (Criteria) this;
        }

        public Criteria andIssendNotBetween(String value1, String value2) {
            addCriterion("isSend not between", value1, value2, "issend");
            return (Criteria) this;
        }

        public Criteria andDrivernumIsNull() {
            addCriterion("drivernum is null");
            return (Criteria) this;
        }

        public Criteria andDrivernumIsNotNull() {
            addCriterion("drivernum is not null");
            return (Criteria) this;
        }

        public Criteria andDrivernumEqualTo(String value) {
            addCriterion("drivernum =", value, "drivernum");
            return (Criteria) this;
        }

        public Criteria andDrivernumNotEqualTo(String value) {
            addCriterion("drivernum <>", value, "drivernum");
            return (Criteria) this;
        }

        public Criteria andDrivernumGreaterThan(String value) {
            addCriterion("drivernum >", value, "drivernum");
            return (Criteria) this;
        }

        public Criteria andDrivernumGreaterThanOrEqualTo(String value) {
            addCriterion("drivernum >=", value, "drivernum");
            return (Criteria) this;
        }

        public Criteria andDrivernumLessThan(String value) {
            addCriterion("drivernum <", value, "drivernum");
            return (Criteria) this;
        }

        public Criteria andDrivernumLessThanOrEqualTo(String value) {
            addCriterion("drivernum <=", value, "drivernum");
            return (Criteria) this;
        }

        public Criteria andDrivernumLike(String value) {
            addCriterion("drivernum like", value, "drivernum");
            return (Criteria) this;
        }

        public Criteria andDrivernumNotLike(String value) {
            addCriterion("drivernum not like", value, "drivernum");
            return (Criteria) this;
        }

        public Criteria andDrivernumIn(List<String> values) {
            addCriterion("drivernum in", values, "drivernum");
            return (Criteria) this;
        }

        public Criteria andDrivernumNotIn(List<String> values) {
            addCriterion("drivernum not in", values, "drivernum");
            return (Criteria) this;
        }

        public Criteria andDrivernumBetween(String value1, String value2) {
            addCriterion("drivernum between", value1, value2, "drivernum");
            return (Criteria) this;
        }

        public Criteria andDrivernumNotBetween(String value1, String value2) {
            addCriterion("drivernum not between", value1, value2, "drivernum");
            return (Criteria) this;
        }

        public Criteria andDrivernameIsNull() {
            addCriterion("drivername is null");
            return (Criteria) this;
        }

        public Criteria andDrivernameIsNotNull() {
            addCriterion("drivername is not null");
            return (Criteria) this;
        }

        public Criteria andDrivernameEqualTo(Integer value) {
            addCriterion("drivername =", value, "drivername");
            return (Criteria) this;
        }

        public Criteria andDrivernameNotEqualTo(Integer value) {
            addCriterion("drivername <>", value, "drivername");
            return (Criteria) this;
        }

        public Criteria andDrivernameGreaterThan(Integer value) {
            addCriterion("drivername >", value, "drivername");
            return (Criteria) this;
        }

        public Criteria andDrivernameGreaterThanOrEqualTo(Integer value) {
            addCriterion("drivername >=", value, "drivername");
            return (Criteria) this;
        }

        public Criteria andDrivernameLessThan(Integer value) {
            addCriterion("drivername <", value, "drivername");
            return (Criteria) this;
        }

        public Criteria andDrivernameLessThanOrEqualTo(Integer value) {
            addCriterion("drivername <=", value, "drivername");
            return (Criteria) this;
        }

        public Criteria andDrivernameIn(List<Integer> values) {
            addCriterion("drivername in", values, "drivername");
            return (Criteria) this;
        }

        public Criteria andDrivernameNotIn(List<Integer> values) {
            addCriterion("drivername not in", values, "drivername");
            return (Criteria) this;
        }

        public Criteria andDrivernameBetween(Integer value1, Integer value2) {
            addCriterion("drivername between", value1, value2, "drivername");
            return (Criteria) this;
        }

        public Criteria andDrivernameNotBetween(Integer value1, Integer value2) {
            addCriterion("drivername not between", value1, value2, "drivername");
            return (Criteria) this;
        }

        public Criteria andChulitimeIsNull() {
            addCriterion("chulitime is null");
            return (Criteria) this;
        }

        public Criteria andChulitimeIsNotNull() {
            addCriterion("chulitime is not null");
            return (Criteria) this;
        }

        public Criteria andChulitimeEqualTo(Date value) {
            addCriterion("chulitime =", value, "chulitime");
            return (Criteria) this;
        }

        public Criteria andChulitimeNotEqualTo(Date value) {
            addCriterion("chulitime <>", value, "chulitime");
            return (Criteria) this;
        }

        public Criteria andChulitimeGreaterThan(Date value) {
            addCriterion("chulitime >", value, "chulitime");
            return (Criteria) this;
        }

        public Criteria andChulitimeGreaterThanOrEqualTo(Date value) {
            addCriterion("chulitime >=", value, "chulitime");
            return (Criteria) this;
        }

        public Criteria andChulitimeLessThan(Date value) {
            addCriterion("chulitime <", value, "chulitime");
            return (Criteria) this;
        }

        public Criteria andChulitimeLessThanOrEqualTo(Date value) {
            addCriterion("chulitime <=", value, "chulitime");
            return (Criteria) this;
        }

        public Criteria andChulitimeIn(List<Date> values) {
            addCriterion("chulitime in", values, "chulitime");
            return (Criteria) this;
        }

        public Criteria andChulitimeNotIn(List<Date> values) {
            addCriterion("chulitime not in", values, "chulitime");
            return (Criteria) this;
        }

        public Criteria andChulitimeBetween(Date value1, Date value2) {
            addCriterion("chulitime between", value1, value2, "chulitime");
            return (Criteria) this;
        }

        public Criteria andChulitimeNotBetween(Date value1, Date value2) {
            addCriterion("chulitime not between", value1, value2, "chulitime");
            return (Criteria) this;
        }

        public Criteria andChulinameIsNull() {
            addCriterion("chuliname is null");
            return (Criteria) this;
        }

        public Criteria andChulinameIsNotNull() {
            addCriterion("chuliname is not null");
            return (Criteria) this;
        }

        public Criteria andChulinameEqualTo(String value) {
            addCriterion("chuliname =", value, "chuliname");
            return (Criteria) this;
        }

        public Criteria andChulinameNotEqualTo(String value) {
            addCriterion("chuliname <>", value, "chuliname");
            return (Criteria) this;
        }

        public Criteria andChulinameGreaterThan(String value) {
            addCriterion("chuliname >", value, "chuliname");
            return (Criteria) this;
        }

        public Criteria andChulinameGreaterThanOrEqualTo(String value) {
            addCriterion("chuliname >=", value, "chuliname");
            return (Criteria) this;
        }

        public Criteria andChulinameLessThan(String value) {
            addCriterion("chuliname <", value, "chuliname");
            return (Criteria) this;
        }

        public Criteria andChulinameLessThanOrEqualTo(String value) {
            addCriterion("chuliname <=", value, "chuliname");
            return (Criteria) this;
        }

        public Criteria andChulinameLike(String value) {
            addCriterion("chuliname like", value, "chuliname");
            return (Criteria) this;
        }

        public Criteria andChulinameNotLike(String value) {
            addCriterion("chuliname not like", value, "chuliname");
            return (Criteria) this;
        }

        public Criteria andChulinameIn(List<String> values) {
            addCriterion("chuliname in", values, "chuliname");
            return (Criteria) this;
        }

        public Criteria andChulinameNotIn(List<String> values) {
            addCriterion("chuliname not in", values, "chuliname");
            return (Criteria) this;
        }

        public Criteria andChulinameBetween(String value1, String value2) {
            addCriterion("chuliname between", value1, value2, "chuliname");
            return (Criteria) this;
        }

        public Criteria andChulinameNotBetween(String value1, String value2) {
            addCriterion("chuliname not between", value1, value2, "chuliname");
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