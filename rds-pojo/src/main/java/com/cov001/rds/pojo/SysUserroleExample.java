package com.cov001.rds.pojo;

import java.util.ArrayList;
import java.util.List;

public class SysUserroleExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SysUserroleExample() {
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

        public Criteria andUseruidIsNull() {
            addCriterion("userUid is null");
            return (Criteria) this;
        }

        public Criteria andUseruidIsNotNull() {
            addCriterion("userUid is not null");
            return (Criteria) this;
        }

        public Criteria andUseruidEqualTo(String value) {
            addCriterion("userUid =", value, "useruid");
            return (Criteria) this;
        }

        public Criteria andUseruidNotEqualTo(String value) {
            addCriterion("userUid <>", value, "useruid");
            return (Criteria) this;
        }

        public Criteria andUseruidGreaterThan(String value) {
            addCriterion("userUid >", value, "useruid");
            return (Criteria) this;
        }

        public Criteria andUseruidGreaterThanOrEqualTo(String value) {
            addCriterion("userUid >=", value, "useruid");
            return (Criteria) this;
        }

        public Criteria andUseruidLessThan(String value) {
            addCriterion("userUid <", value, "useruid");
            return (Criteria) this;
        }

        public Criteria andUseruidLessThanOrEqualTo(String value) {
            addCriterion("userUid <=", value, "useruid");
            return (Criteria) this;
        }

        public Criteria andUseruidLike(String value) {
            addCriterion("userUid like", value, "useruid");
            return (Criteria) this;
        }

        public Criteria andUseruidNotLike(String value) {
            addCriterion("userUid not like", value, "useruid");
            return (Criteria) this;
        }

        public Criteria andUseruidIn(List<String> values) {
            addCriterion("userUid in", values, "useruid");
            return (Criteria) this;
        }

        public Criteria andUseruidNotIn(List<String> values) {
            addCriterion("userUid not in", values, "useruid");
            return (Criteria) this;
        }

        public Criteria andUseruidBetween(String value1, String value2) {
            addCriterion("userUid between", value1, value2, "useruid");
            return (Criteria) this;
        }

        public Criteria andUseruidNotBetween(String value1, String value2) {
            addCriterion("userUid not between", value1, value2, "useruid");
            return (Criteria) this;
        }

        public Criteria andRoleuidIsNull() {
            addCriterion("roleUid is null");
            return (Criteria) this;
        }

        public Criteria andRoleuidIsNotNull() {
            addCriterion("roleUid is not null");
            return (Criteria) this;
        }

        public Criteria andRoleuidEqualTo(String value) {
            addCriterion("roleUid =", value, "roleuid");
            return (Criteria) this;
        }

        public Criteria andRoleuidNotEqualTo(String value) {
            addCriterion("roleUid <>", value, "roleuid");
            return (Criteria) this;
        }

        public Criteria andRoleuidGreaterThan(String value) {
            addCriterion("roleUid >", value, "roleuid");
            return (Criteria) this;
        }

        public Criteria andRoleuidGreaterThanOrEqualTo(String value) {
            addCriterion("roleUid >=", value, "roleuid");
            return (Criteria) this;
        }

        public Criteria andRoleuidLessThan(String value) {
            addCriterion("roleUid <", value, "roleuid");
            return (Criteria) this;
        }

        public Criteria andRoleuidLessThanOrEqualTo(String value) {
            addCriterion("roleUid <=", value, "roleuid");
            return (Criteria) this;
        }

        public Criteria andRoleuidLike(String value) {
            addCriterion("roleUid like", value, "roleuid");
            return (Criteria) this;
        }

        public Criteria andRoleuidNotLike(String value) {
            addCriterion("roleUid not like", value, "roleuid");
            return (Criteria) this;
        }

        public Criteria andRoleuidIn(List<String> values) {
            addCriterion("roleUid in", values, "roleuid");
            return (Criteria) this;
        }

        public Criteria andRoleuidNotIn(List<String> values) {
            addCriterion("roleUid not in", values, "roleuid");
            return (Criteria) this;
        }

        public Criteria andRoleuidBetween(String value1, String value2) {
            addCriterion("roleUid between", value1, value2, "roleuid");
            return (Criteria) this;
        }

        public Criteria andRoleuidNotBetween(String value1, String value2) {
            addCriterion("roleUid not between", value1, value2, "roleuid");
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