package com.cov001.rds.pojo;

import java.util.ArrayList;
import java.util.List;

public class SysRoleactionExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SysRoleactionExample() {
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

        public Criteria andActionuidIsNull() {
            addCriterion("actionUid is null");
            return (Criteria) this;
        }

        public Criteria andActionuidIsNotNull() {
            addCriterion("actionUid is not null");
            return (Criteria) this;
        }

        public Criteria andActionuidEqualTo(String value) {
            addCriterion("actionUid =", value, "actionuid");
            return (Criteria) this;
        }

        public Criteria andActionuidNotEqualTo(String value) {
            addCriterion("actionUid <>", value, "actionuid");
            return (Criteria) this;
        }

        public Criteria andActionuidGreaterThan(String value) {
            addCriterion("actionUid >", value, "actionuid");
            return (Criteria) this;
        }

        public Criteria andActionuidGreaterThanOrEqualTo(String value) {
            addCriterion("actionUid >=", value, "actionuid");
            return (Criteria) this;
        }

        public Criteria andActionuidLessThan(String value) {
            addCriterion("actionUid <", value, "actionuid");
            return (Criteria) this;
        }

        public Criteria andActionuidLessThanOrEqualTo(String value) {
            addCriterion("actionUid <=", value, "actionuid");
            return (Criteria) this;
        }

        public Criteria andActionuidLike(String value) {
            addCriterion("actionUid like", value, "actionuid");
            return (Criteria) this;
        }

        public Criteria andActionuidNotLike(String value) {
            addCriterion("actionUid not like", value, "actionuid");
            return (Criteria) this;
        }

        public Criteria andActionuidIn(List<String> values) {
            addCriterion("actionUid in", values, "actionuid");
            return (Criteria) this;
        }

        public Criteria andActionuidNotIn(List<String> values) {
            addCriterion("actionUid not in", values, "actionuid");
            return (Criteria) this;
        }

        public Criteria andActionuidBetween(String value1, String value2) {
            addCriterion("actionUid between", value1, value2, "actionuid");
            return (Criteria) this;
        }

        public Criteria andActionuidNotBetween(String value1, String value2) {
            addCriterion("actionUid not between", value1, value2, "actionuid");
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