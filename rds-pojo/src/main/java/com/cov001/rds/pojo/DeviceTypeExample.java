package com.cov001.rds.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DeviceTypeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DeviceTypeExample() {
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

        public Criteria andDevicetypenameIsNull() {
            addCriterion("deviceTypeName is null");
            return (Criteria) this;
        }

        public Criteria andDevicetypenameIsNotNull() {
            addCriterion("deviceTypeName is not null");
            return (Criteria) this;
        }

        public Criteria andDevicetypenameEqualTo(String value) {
            addCriterion("deviceTypeName =", value, "devicetypename");
            return (Criteria) this;
        }

        public Criteria andDevicetypenameNotEqualTo(String value) {
            addCriterion("deviceTypeName <>", value, "devicetypename");
            return (Criteria) this;
        }

        public Criteria andDevicetypenameGreaterThan(String value) {
            addCriterion("deviceTypeName >", value, "devicetypename");
            return (Criteria) this;
        }

        public Criteria andDevicetypenameGreaterThanOrEqualTo(String value) {
            addCriterion("deviceTypeName >=", value, "devicetypename");
            return (Criteria) this;
        }

        public Criteria andDevicetypenameLessThan(String value) {
            addCriterion("deviceTypeName <", value, "devicetypename");
            return (Criteria) this;
        }

        public Criteria andDevicetypenameLessThanOrEqualTo(String value) {
            addCriterion("deviceTypeName <=", value, "devicetypename");
            return (Criteria) this;
        }

        public Criteria andDevicetypenameLike(String value) {
            addCriterion("deviceTypeName like", value, "devicetypename");
            return (Criteria) this;
        }

        public Criteria andDevicetypenameNotLike(String value) {
            addCriterion("deviceTypeName not like", value, "devicetypename");
            return (Criteria) this;
        }

        public Criteria andDevicetypenameIn(List<String> values) {
            addCriterion("deviceTypeName in", values, "devicetypename");
            return (Criteria) this;
        }

        public Criteria andDevicetypenameNotIn(List<String> values) {
            addCriterion("deviceTypeName not in", values, "devicetypename");
            return (Criteria) this;
        }

        public Criteria andDevicetypenameBetween(String value1, String value2) {
            addCriterion("deviceTypeName between", value1, value2, "devicetypename");
            return (Criteria) this;
        }

        public Criteria andDevicetypenameNotBetween(String value1, String value2) {
            addCriterion("deviceTypeName not between", value1, value2, "devicetypename");
            return (Criteria) this;
        }

        public Criteria andDevicetypevalueIsNull() {
            addCriterion("deviceTypeValue is null");
            return (Criteria) this;
        }

        public Criteria andDevicetypevalueIsNotNull() {
            addCriterion("deviceTypeValue is not null");
            return (Criteria) this;
        }

        public Criteria andDevicetypevalueEqualTo(String value) {
            addCriterion("deviceTypeValue =", value, "devicetypevalue");
            return (Criteria) this;
        }

        public Criteria andDevicetypevalueNotEqualTo(String value) {
            addCriterion("deviceTypeValue <>", value, "devicetypevalue");
            return (Criteria) this;
        }

        public Criteria andDevicetypevalueGreaterThan(String value) {
            addCriterion("deviceTypeValue >", value, "devicetypevalue");
            return (Criteria) this;
        }

        public Criteria andDevicetypevalueGreaterThanOrEqualTo(String value) {
            addCriterion("deviceTypeValue >=", value, "devicetypevalue");
            return (Criteria) this;
        }

        public Criteria andDevicetypevalueLessThan(String value) {
            addCriterion("deviceTypeValue <", value, "devicetypevalue");
            return (Criteria) this;
        }

        public Criteria andDevicetypevalueLessThanOrEqualTo(String value) {
            addCriterion("deviceTypeValue <=", value, "devicetypevalue");
            return (Criteria) this;
        }

        public Criteria andDevicetypevalueLike(String value) {
            addCriterion("deviceTypeValue like", value, "devicetypevalue");
            return (Criteria) this;
        }

        public Criteria andDevicetypevalueNotLike(String value) {
            addCriterion("deviceTypeValue not like", value, "devicetypevalue");
            return (Criteria) this;
        }

        public Criteria andDevicetypevalueIn(List<String> values) {
            addCriterion("deviceTypeValue in", values, "devicetypevalue");
            return (Criteria) this;
        }

        public Criteria andDevicetypevalueNotIn(List<String> values) {
            addCriterion("deviceTypeValue not in", values, "devicetypevalue");
            return (Criteria) this;
        }

        public Criteria andDevicetypevalueBetween(String value1, String value2) {
            addCriterion("deviceTypeValue between", value1, value2, "devicetypevalue");
            return (Criteria) this;
        }

        public Criteria andDevicetypevalueNotBetween(String value1, String value2) {
            addCriterion("deviceTypeValue not between", value1, value2, "devicetypevalue");
            return (Criteria) this;
        }

        public Criteria andDescptionIsNull() {
            addCriterion("descption is null");
            return (Criteria) this;
        }

        public Criteria andDescptionIsNotNull() {
            addCriterion("descption is not null");
            return (Criteria) this;
        }

        public Criteria andDescptionEqualTo(String value) {
            addCriterion("descption =", value, "descption");
            return (Criteria) this;
        }

        public Criteria andDescptionNotEqualTo(String value) {
            addCriterion("descption <>", value, "descption");
            return (Criteria) this;
        }

        public Criteria andDescptionGreaterThan(String value) {
            addCriterion("descption >", value, "descption");
            return (Criteria) this;
        }

        public Criteria andDescptionGreaterThanOrEqualTo(String value) {
            addCriterion("descption >=", value, "descption");
            return (Criteria) this;
        }

        public Criteria andDescptionLessThan(String value) {
            addCriterion("descption <", value, "descption");
            return (Criteria) this;
        }

        public Criteria andDescptionLessThanOrEqualTo(String value) {
            addCriterion("descption <=", value, "descption");
            return (Criteria) this;
        }

        public Criteria andDescptionLike(String value) {
            addCriterion("descption like", value, "descption");
            return (Criteria) this;
        }

        public Criteria andDescptionNotLike(String value) {
            addCriterion("descption not like", value, "descption");
            return (Criteria) this;
        }

        public Criteria andDescptionIn(List<String> values) {
            addCriterion("descption in", values, "descption");
            return (Criteria) this;
        }

        public Criteria andDescptionNotIn(List<String> values) {
            addCriterion("descption not in", values, "descption");
            return (Criteria) this;
        }

        public Criteria andDescptionBetween(String value1, String value2) {
            addCriterion("descption between", value1, value2, "descption");
            return (Criteria) this;
        }

        public Criteria andDescptionNotBetween(String value1, String value2) {
            addCriterion("descption not between", value1, value2, "descption");
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