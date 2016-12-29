package com.cov001.rds.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SysActionExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SysActionExample() {
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

        public Criteria andUidIsNull() {
            addCriterion("uid is null");
            return (Criteria) this;
        }

        public Criteria andUidIsNotNull() {
            addCriterion("uid is not null");
            return (Criteria) this;
        }

        public Criteria andUidEqualTo(String value) {
            addCriterion("uid =", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotEqualTo(String value) {
            addCriterion("uid <>", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidGreaterThan(String value) {
            addCriterion("uid >", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidGreaterThanOrEqualTo(String value) {
            addCriterion("uid >=", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidLessThan(String value) {
            addCriterion("uid <", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidLessThanOrEqualTo(String value) {
            addCriterion("uid <=", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidLike(String value) {
            addCriterion("uid like", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotLike(String value) {
            addCriterion("uid not like", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidIn(List<String> values) {
            addCriterion("uid in", values, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotIn(List<String> values) {
            addCriterion("uid not in", values, "uid");
            return (Criteria) this;
        }

        public Criteria andUidBetween(String value1, String value2) {
            addCriterion("uid between", value1, value2, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotBetween(String value1, String value2) {
            addCriterion("uid not between", value1, value2, "uid");
            return (Criteria) this;
        }

        public Criteria andActionkeyIsNull() {
            addCriterion("actionKey is null");
            return (Criteria) this;
        }

        public Criteria andActionkeyIsNotNull() {
            addCriterion("actionKey is not null");
            return (Criteria) this;
        }

        public Criteria andActionkeyEqualTo(String value) {
            addCriterion("actionKey =", value, "actionkey");
            return (Criteria) this;
        }

        public Criteria andActionkeyNotEqualTo(String value) {
            addCriterion("actionKey <>", value, "actionkey");
            return (Criteria) this;
        }

        public Criteria andActionkeyGreaterThan(String value) {
            addCriterion("actionKey >", value, "actionkey");
            return (Criteria) this;
        }

        public Criteria andActionkeyGreaterThanOrEqualTo(String value) {
            addCriterion("actionKey >=", value, "actionkey");
            return (Criteria) this;
        }

        public Criteria andActionkeyLessThan(String value) {
            addCriterion("actionKey <", value, "actionkey");
            return (Criteria) this;
        }

        public Criteria andActionkeyLessThanOrEqualTo(String value) {
            addCriterion("actionKey <=", value, "actionkey");
            return (Criteria) this;
        }

        public Criteria andActionkeyLike(String value) {
            addCriterion("actionKey like", value, "actionkey");
            return (Criteria) this;
        }

        public Criteria andActionkeyNotLike(String value) {
            addCriterion("actionKey not like", value, "actionkey");
            return (Criteria) this;
        }

        public Criteria andActionkeyIn(List<String> values) {
            addCriterion("actionKey in", values, "actionkey");
            return (Criteria) this;
        }

        public Criteria andActionkeyNotIn(List<String> values) {
            addCriterion("actionKey not in", values, "actionkey");
            return (Criteria) this;
        }

        public Criteria andActionkeyBetween(String value1, String value2) {
            addCriterion("actionKey between", value1, value2, "actionkey");
            return (Criteria) this;
        }

        public Criteria andActionkeyNotBetween(String value1, String value2) {
            addCriterion("actionKey not between", value1, value2, "actionkey");
            return (Criteria) this;
        }

        public Criteria andActionnameIsNull() {
            addCriterion("actionName is null");
            return (Criteria) this;
        }

        public Criteria andActionnameIsNotNull() {
            addCriterion("actionName is not null");
            return (Criteria) this;
        }

        public Criteria andActionnameEqualTo(String value) {
            addCriterion("actionName =", value, "actionname");
            return (Criteria) this;
        }

        public Criteria andActionnameNotEqualTo(String value) {
            addCriterion("actionName <>", value, "actionname");
            return (Criteria) this;
        }

        public Criteria andActionnameGreaterThan(String value) {
            addCriterion("actionName >", value, "actionname");
            return (Criteria) this;
        }

        public Criteria andActionnameGreaterThanOrEqualTo(String value) {
            addCriterion("actionName >=", value, "actionname");
            return (Criteria) this;
        }

        public Criteria andActionnameLessThan(String value) {
            addCriterion("actionName <", value, "actionname");
            return (Criteria) this;
        }

        public Criteria andActionnameLessThanOrEqualTo(String value) {
            addCriterion("actionName <=", value, "actionname");
            return (Criteria) this;
        }

        public Criteria andActionnameLike(String value) {
            addCriterion("actionName like", value, "actionname");
            return (Criteria) this;
        }

        public Criteria andActionnameNotLike(String value) {
            addCriterion("actionName not like", value, "actionname");
            return (Criteria) this;
        }

        public Criteria andActionnameIn(List<String> values) {
            addCriterion("actionName in", values, "actionname");
            return (Criteria) this;
        }

        public Criteria andActionnameNotIn(List<String> values) {
            addCriterion("actionName not in", values, "actionname");
            return (Criteria) this;
        }

        public Criteria andActionnameBetween(String value1, String value2) {
            addCriterion("actionName between", value1, value2, "actionname");
            return (Criteria) this;
        }

        public Criteria andActionnameNotBetween(String value1, String value2) {
            addCriterion("actionName not between", value1, value2, "actionname");
            return (Criteria) this;
        }

        public Criteria andActionurlIsNull() {
            addCriterion("actionUrl is null");
            return (Criteria) this;
        }

        public Criteria andActionurlIsNotNull() {
            addCriterion("actionUrl is not null");
            return (Criteria) this;
        }

        public Criteria andActionurlEqualTo(String value) {
            addCriterion("actionUrl =", value, "actionurl");
            return (Criteria) this;
        }

        public Criteria andActionurlNotEqualTo(String value) {
            addCriterion("actionUrl <>", value, "actionurl");
            return (Criteria) this;
        }

        public Criteria andActionurlGreaterThan(String value) {
            addCriterion("actionUrl >", value, "actionurl");
            return (Criteria) this;
        }

        public Criteria andActionurlGreaterThanOrEqualTo(String value) {
            addCriterion("actionUrl >=", value, "actionurl");
            return (Criteria) this;
        }

        public Criteria andActionurlLessThan(String value) {
            addCriterion("actionUrl <", value, "actionurl");
            return (Criteria) this;
        }

        public Criteria andActionurlLessThanOrEqualTo(String value) {
            addCriterion("actionUrl <=", value, "actionurl");
            return (Criteria) this;
        }

        public Criteria andActionurlLike(String value) {
            addCriterion("actionUrl like", value, "actionurl");
            return (Criteria) this;
        }

        public Criteria andActionurlNotLike(String value) {
            addCriterion("actionUrl not like", value, "actionurl");
            return (Criteria) this;
        }

        public Criteria andActionurlIn(List<String> values) {
            addCriterion("actionUrl in", values, "actionurl");
            return (Criteria) this;
        }

        public Criteria andActionurlNotIn(List<String> values) {
            addCriterion("actionUrl not in", values, "actionurl");
            return (Criteria) this;
        }

        public Criteria andActionurlBetween(String value1, String value2) {
            addCriterion("actionUrl between", value1, value2, "actionurl");
            return (Criteria) this;
        }

        public Criteria andActionurlNotBetween(String value1, String value2) {
            addCriterion("actionUrl not between", value1, value2, "actionurl");
            return (Criteria) this;
        }

        public Criteria andLevelIsNull() {
            addCriterion("level is null");
            return (Criteria) this;
        }

        public Criteria andLevelIsNotNull() {
            addCriterion("level is not null");
            return (Criteria) this;
        }

        public Criteria andLevelEqualTo(Integer value) {
            addCriterion("level =", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelNotEqualTo(Integer value) {
            addCriterion("level <>", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelGreaterThan(Integer value) {
            addCriterion("level >", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelGreaterThanOrEqualTo(Integer value) {
            addCriterion("level >=", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelLessThan(Integer value) {
            addCriterion("level <", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelLessThanOrEqualTo(Integer value) {
            addCriterion("level <=", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelIn(List<Integer> values) {
            addCriterion("level in", values, "level");
            return (Criteria) this;
        }

        public Criteria andLevelNotIn(List<Integer> values) {
            addCriterion("level not in", values, "level");
            return (Criteria) this;
        }

        public Criteria andLevelBetween(Integer value1, Integer value2) {
            addCriterion("level between", value1, value2, "level");
            return (Criteria) this;
        }

        public Criteria andLevelNotBetween(Integer value1, Integer value2) {
            addCriterion("level not between", value1, value2, "level");
            return (Criteria) this;
        }

        public Criteria andParentuidIsNull() {
            addCriterion("parentUid is null");
            return (Criteria) this;
        }

        public Criteria andParentuidIsNotNull() {
            addCriterion("parentUid is not null");
            return (Criteria) this;
        }

        public Criteria andParentuidEqualTo(String value) {
            addCriterion("parentUid =", value, "parentuid");
            return (Criteria) this;
        }

        public Criteria andParentuidNotEqualTo(String value) {
            addCriterion("parentUid <>", value, "parentuid");
            return (Criteria) this;
        }

        public Criteria andParentuidGreaterThan(String value) {
            addCriterion("parentUid >", value, "parentuid");
            return (Criteria) this;
        }

        public Criteria andParentuidGreaterThanOrEqualTo(String value) {
            addCriterion("parentUid >=", value, "parentuid");
            return (Criteria) this;
        }

        public Criteria andParentuidLessThan(String value) {
            addCriterion("parentUid <", value, "parentuid");
            return (Criteria) this;
        }

        public Criteria andParentuidLessThanOrEqualTo(String value) {
            addCriterion("parentUid <=", value, "parentuid");
            return (Criteria) this;
        }

        public Criteria andParentuidLike(String value) {
            addCriterion("parentUid like", value, "parentuid");
            return (Criteria) this;
        }

        public Criteria andParentuidNotLike(String value) {
            addCriterion("parentUid not like", value, "parentuid");
            return (Criteria) this;
        }

        public Criteria andParentuidIn(List<String> values) {
            addCriterion("parentUid in", values, "parentuid");
            return (Criteria) this;
        }

        public Criteria andParentuidNotIn(List<String> values) {
            addCriterion("parentUid not in", values, "parentuid");
            return (Criteria) this;
        }

        public Criteria andParentuidBetween(String value1, String value2) {
            addCriterion("parentUid between", value1, value2, "parentuid");
            return (Criteria) this;
        }

        public Criteria andParentuidNotBetween(String value1, String value2) {
            addCriterion("parentUid not between", value1, value2, "parentuid");
            return (Criteria) this;
        }

        public Criteria andActiontypeIsNull() {
            addCriterion("actionType is null");
            return (Criteria) this;
        }

        public Criteria andActiontypeIsNotNull() {
            addCriterion("actionType is not null");
            return (Criteria) this;
        }

        public Criteria andActiontypeEqualTo(String value) {
            addCriterion("actionType =", value, "actiontype");
            return (Criteria) this;
        }

        public Criteria andActiontypeNotEqualTo(String value) {
            addCriterion("actionType <>", value, "actiontype");
            return (Criteria) this;
        }

        public Criteria andActiontypeGreaterThan(String value) {
            addCriterion("actionType >", value, "actiontype");
            return (Criteria) this;
        }

        public Criteria andActiontypeGreaterThanOrEqualTo(String value) {
            addCriterion("actionType >=", value, "actiontype");
            return (Criteria) this;
        }

        public Criteria andActiontypeLessThan(String value) {
            addCriterion("actionType <", value, "actiontype");
            return (Criteria) this;
        }

        public Criteria andActiontypeLessThanOrEqualTo(String value) {
            addCriterion("actionType <=", value, "actiontype");
            return (Criteria) this;
        }

        public Criteria andActiontypeLike(String value) {
            addCriterion("actionType like", value, "actiontype");
            return (Criteria) this;
        }

        public Criteria andActiontypeNotLike(String value) {
            addCriterion("actionType not like", value, "actiontype");
            return (Criteria) this;
        }

        public Criteria andActiontypeIn(List<String> values) {
            addCriterion("actionType in", values, "actiontype");
            return (Criteria) this;
        }

        public Criteria andActiontypeNotIn(List<String> values) {
            addCriterion("actionType not in", values, "actiontype");
            return (Criteria) this;
        }

        public Criteria andActiontypeBetween(String value1, String value2) {
            addCriterion("actionType between", value1, value2, "actiontype");
            return (Criteria) this;
        }

        public Criteria andActiontypeNotBetween(String value1, String value2) {
            addCriterion("actionType not between", value1, value2, "actiontype");
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

        public Criteria andCreatedateIsNull() {
            addCriterion("createDate is null");
            return (Criteria) this;
        }

        public Criteria andCreatedateIsNotNull() {
            addCriterion("createDate is not null");
            return (Criteria) this;
        }

        public Criteria andCreatedateEqualTo(Date value) {
            addCriterion("createDate =", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateNotEqualTo(Date value) {
            addCriterion("createDate <>", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateGreaterThan(Date value) {
            addCriterion("createDate >", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateGreaterThanOrEqualTo(Date value) {
            addCriterion("createDate >=", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateLessThan(Date value) {
            addCriterion("createDate <", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateLessThanOrEqualTo(Date value) {
            addCriterion("createDate <=", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateIn(List<Date> values) {
            addCriterion("createDate in", values, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateNotIn(List<Date> values) {
            addCriterion("createDate not in", values, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateBetween(Date value1, Date value2) {
            addCriterion("createDate between", value1, value2, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateNotBetween(Date value1, Date value2) {
            addCriterion("createDate not between", value1, value2, "createdate");
            return (Criteria) this;
        }

        public Criteria andUpdatedateIsNull() {
            addCriterion("updateDate is null");
            return (Criteria) this;
        }

        public Criteria andUpdatedateIsNotNull() {
            addCriterion("updateDate is not null");
            return (Criteria) this;
        }

        public Criteria andUpdatedateEqualTo(Date value) {
            addCriterion("updateDate =", value, "updatedate");
            return (Criteria) this;
        }

        public Criteria andUpdatedateNotEqualTo(Date value) {
            addCriterion("updateDate <>", value, "updatedate");
            return (Criteria) this;
        }

        public Criteria andUpdatedateGreaterThan(Date value) {
            addCriterion("updateDate >", value, "updatedate");
            return (Criteria) this;
        }

        public Criteria andUpdatedateGreaterThanOrEqualTo(Date value) {
            addCriterion("updateDate >=", value, "updatedate");
            return (Criteria) this;
        }

        public Criteria andUpdatedateLessThan(Date value) {
            addCriterion("updateDate <", value, "updatedate");
            return (Criteria) this;
        }

        public Criteria andUpdatedateLessThanOrEqualTo(Date value) {
            addCriterion("updateDate <=", value, "updatedate");
            return (Criteria) this;
        }

        public Criteria andUpdatedateIn(List<Date> values) {
            addCriterion("updateDate in", values, "updatedate");
            return (Criteria) this;
        }

        public Criteria andUpdatedateNotIn(List<Date> values) {
            addCriterion("updateDate not in", values, "updatedate");
            return (Criteria) this;
        }

        public Criteria andUpdatedateBetween(Date value1, Date value2) {
            addCriterion("updateDate between", value1, value2, "updatedate");
            return (Criteria) this;
        }

        public Criteria andUpdatedateNotBetween(Date value1, Date value2) {
            addCriterion("updateDate not between", value1, value2, "updatedate");
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