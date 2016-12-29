package com.cov001.rds.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DeviceStatusExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DeviceStatusExample() {
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

        public Criteria andDevicestatusnameIsNull() {
            addCriterion("deviceStatusName is null");
            return (Criteria) this;
        }

        public Criteria andDevicestatusnameIsNotNull() {
            addCriterion("deviceStatusName is not null");
            return (Criteria) this;
        }

        public Criteria andDevicestatusnameEqualTo(String value) {
            addCriterion("deviceStatusName =", value, "devicestatusname");
            return (Criteria) this;
        }

        public Criteria andDevicestatusnameNotEqualTo(String value) {
            addCriterion("deviceStatusName <>", value, "devicestatusname");
            return (Criteria) this;
        }

        public Criteria andDevicestatusnameGreaterThan(String value) {
            addCriterion("deviceStatusName >", value, "devicestatusname");
            return (Criteria) this;
        }

        public Criteria andDevicestatusnameGreaterThanOrEqualTo(String value) {
            addCriterion("deviceStatusName >=", value, "devicestatusname");
            return (Criteria) this;
        }

        public Criteria andDevicestatusnameLessThan(String value) {
            addCriterion("deviceStatusName <", value, "devicestatusname");
            return (Criteria) this;
        }

        public Criteria andDevicestatusnameLessThanOrEqualTo(String value) {
            addCriterion("deviceStatusName <=", value, "devicestatusname");
            return (Criteria) this;
        }

        public Criteria andDevicestatusnameLike(String value) {
            addCriterion("deviceStatusName like", value, "devicestatusname");
            return (Criteria) this;
        }

        public Criteria andDevicestatusnameNotLike(String value) {
            addCriterion("deviceStatusName not like", value, "devicestatusname");
            return (Criteria) this;
        }

        public Criteria andDevicestatusnameIn(List<String> values) {
            addCriterion("deviceStatusName in", values, "devicestatusname");
            return (Criteria) this;
        }

        public Criteria andDevicestatusnameNotIn(List<String> values) {
            addCriterion("deviceStatusName not in", values, "devicestatusname");
            return (Criteria) this;
        }

        public Criteria andDevicestatusnameBetween(String value1, String value2) {
            addCriterion("deviceStatusName between", value1, value2, "devicestatusname");
            return (Criteria) this;
        }

        public Criteria andDevicestatusnameNotBetween(String value1, String value2) {
            addCriterion("deviceStatusName not between", value1, value2, "devicestatusname");
            return (Criteria) this;
        }

        public Criteria andDevicestatusvalueIsNull() {
            addCriterion("deviceStatusValue is null");
            return (Criteria) this;
        }

        public Criteria andDevicestatusvalueIsNotNull() {
            addCriterion("deviceStatusValue is not null");
            return (Criteria) this;
        }

        public Criteria andDevicestatusvalueEqualTo(String value) {
            addCriterion("deviceStatusValue =", value, "devicestatusvalue");
            return (Criteria) this;
        }

        public Criteria andDevicestatusvalueNotEqualTo(String value) {
            addCriterion("deviceStatusValue <>", value, "devicestatusvalue");
            return (Criteria) this;
        }

        public Criteria andDevicestatusvalueGreaterThan(String value) {
            addCriterion("deviceStatusValue >", value, "devicestatusvalue");
            return (Criteria) this;
        }

        public Criteria andDevicestatusvalueGreaterThanOrEqualTo(String value) {
            addCriterion("deviceStatusValue >=", value, "devicestatusvalue");
            return (Criteria) this;
        }

        public Criteria andDevicestatusvalueLessThan(String value) {
            addCriterion("deviceStatusValue <", value, "devicestatusvalue");
            return (Criteria) this;
        }

        public Criteria andDevicestatusvalueLessThanOrEqualTo(String value) {
            addCriterion("deviceStatusValue <=", value, "devicestatusvalue");
            return (Criteria) this;
        }

        public Criteria andDevicestatusvalueLike(String value) {
            addCriterion("deviceStatusValue like", value, "devicestatusvalue");
            return (Criteria) this;
        }

        public Criteria andDevicestatusvalueNotLike(String value) {
            addCriterion("deviceStatusValue not like", value, "devicestatusvalue");
            return (Criteria) this;
        }

        public Criteria andDevicestatusvalueIn(List<String> values) {
            addCriterion("deviceStatusValue in", values, "devicestatusvalue");
            return (Criteria) this;
        }

        public Criteria andDevicestatusvalueNotIn(List<String> values) {
            addCriterion("deviceStatusValue not in", values, "devicestatusvalue");
            return (Criteria) this;
        }

        public Criteria andDevicestatusvalueBetween(String value1, String value2) {
            addCriterion("deviceStatusValue between", value1, value2, "devicestatusvalue");
            return (Criteria) this;
        }

        public Criteria andDevicestatusvalueNotBetween(String value1, String value2) {
            addCriterion("deviceStatusValue not between", value1, value2, "devicestatusvalue");
            return (Criteria) this;
        }

        public Criteria andDevicetruenameIsNull() {
            addCriterion("deviceTrueName is null");
            return (Criteria) this;
        }

        public Criteria andDevicetruenameIsNotNull() {
            addCriterion("deviceTrueName is not null");
            return (Criteria) this;
        }

        public Criteria andDevicetruenameEqualTo(String value) {
            addCriterion("deviceTrueName =", value, "devicetruename");
            return (Criteria) this;
        }

        public Criteria andDevicetruenameNotEqualTo(String value) {
            addCriterion("deviceTrueName <>", value, "devicetruename");
            return (Criteria) this;
        }

        public Criteria andDevicetruenameGreaterThan(String value) {
            addCriterion("deviceTrueName >", value, "devicetruename");
            return (Criteria) this;
        }

        public Criteria andDevicetruenameGreaterThanOrEqualTo(String value) {
            addCriterion("deviceTrueName >=", value, "devicetruename");
            return (Criteria) this;
        }

        public Criteria andDevicetruenameLessThan(String value) {
            addCriterion("deviceTrueName <", value, "devicetruename");
            return (Criteria) this;
        }

        public Criteria andDevicetruenameLessThanOrEqualTo(String value) {
            addCriterion("deviceTrueName <=", value, "devicetruename");
            return (Criteria) this;
        }

        public Criteria andDevicetruenameLike(String value) {
            addCriterion("deviceTrueName like", value, "devicetruename");
            return (Criteria) this;
        }

        public Criteria andDevicetruenameNotLike(String value) {
            addCriterion("deviceTrueName not like", value, "devicetruename");
            return (Criteria) this;
        }

        public Criteria andDevicetruenameIn(List<String> values) {
            addCriterion("deviceTrueName in", values, "devicetruename");
            return (Criteria) this;
        }

        public Criteria andDevicetruenameNotIn(List<String> values) {
            addCriterion("deviceTrueName not in", values, "devicetruename");
            return (Criteria) this;
        }

        public Criteria andDevicetruenameBetween(String value1, String value2) {
            addCriterion("deviceTrueName between", value1, value2, "devicetruename");
            return (Criteria) this;
        }

        public Criteria andDevicetruenameNotBetween(String value1, String value2) {
            addCriterion("deviceTrueName not between", value1, value2, "devicetruename");
            return (Criteria) this;
        }

        public Criteria andDeviceerrornameIsNull() {
            addCriterion("deviceErrorName is null");
            return (Criteria) this;
        }

        public Criteria andDeviceerrornameIsNotNull() {
            addCriterion("deviceErrorName is not null");
            return (Criteria) this;
        }

        public Criteria andDeviceerrornameEqualTo(String value) {
            addCriterion("deviceErrorName =", value, "deviceerrorname");
            return (Criteria) this;
        }

        public Criteria andDeviceerrornameNotEqualTo(String value) {
            addCriterion("deviceErrorName <>", value, "deviceerrorname");
            return (Criteria) this;
        }

        public Criteria andDeviceerrornameGreaterThan(String value) {
            addCriterion("deviceErrorName >", value, "deviceerrorname");
            return (Criteria) this;
        }

        public Criteria andDeviceerrornameGreaterThanOrEqualTo(String value) {
            addCriterion("deviceErrorName >=", value, "deviceerrorname");
            return (Criteria) this;
        }

        public Criteria andDeviceerrornameLessThan(String value) {
            addCriterion("deviceErrorName <", value, "deviceerrorname");
            return (Criteria) this;
        }

        public Criteria andDeviceerrornameLessThanOrEqualTo(String value) {
            addCriterion("deviceErrorName <=", value, "deviceerrorname");
            return (Criteria) this;
        }

        public Criteria andDeviceerrornameLike(String value) {
            addCriterion("deviceErrorName like", value, "deviceerrorname");
            return (Criteria) this;
        }

        public Criteria andDeviceerrornameNotLike(String value) {
            addCriterion("deviceErrorName not like", value, "deviceerrorname");
            return (Criteria) this;
        }

        public Criteria andDeviceerrornameIn(List<String> values) {
            addCriterion("deviceErrorName in", values, "deviceerrorname");
            return (Criteria) this;
        }

        public Criteria andDeviceerrornameNotIn(List<String> values) {
            addCriterion("deviceErrorName not in", values, "deviceerrorname");
            return (Criteria) this;
        }

        public Criteria andDeviceerrornameBetween(String value1, String value2) {
            addCriterion("deviceErrorName between", value1, value2, "deviceerrorname");
            return (Criteria) this;
        }

        public Criteria andDeviceerrornameNotBetween(String value1, String value2) {
            addCriterion("deviceErrorName not between", value1, value2, "deviceerrorname");
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