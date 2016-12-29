package com.cov001.rds.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DeviceExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DeviceExample() {
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

        public Criteria andDevicetypeuidIsNull() {
            addCriterion("deviceTypeUid is null");
            return (Criteria) this;
        }

        public Criteria andDevicetypeuidIsNotNull() {
            addCriterion("deviceTypeUid is not null");
            return (Criteria) this;
        }

        public Criteria andDevicetypeuidEqualTo(String value) {
            addCriterion("deviceTypeUid =", value, "devicetypeuid");
            return (Criteria) this;
        }

        public Criteria andDevicetypeuidNotEqualTo(String value) {
            addCriterion("deviceTypeUid <>", value, "devicetypeuid");
            return (Criteria) this;
        }

        public Criteria andDevicetypeuidGreaterThan(String value) {
            addCriterion("deviceTypeUid >", value, "devicetypeuid");
            return (Criteria) this;
        }

        public Criteria andDevicetypeuidGreaterThanOrEqualTo(String value) {
            addCriterion("deviceTypeUid >=", value, "devicetypeuid");
            return (Criteria) this;
        }

        public Criteria andDevicetypeuidLessThan(String value) {
            addCriterion("deviceTypeUid <", value, "devicetypeuid");
            return (Criteria) this;
        }

        public Criteria andDevicetypeuidLessThanOrEqualTo(String value) {
            addCriterion("deviceTypeUid <=", value, "devicetypeuid");
            return (Criteria) this;
        }

        public Criteria andDevicetypeuidLike(String value) {
            addCriterion("deviceTypeUid like", value, "devicetypeuid");
            return (Criteria) this;
        }

        public Criteria andDevicetypeuidNotLike(String value) {
            addCriterion("deviceTypeUid not like", value, "devicetypeuid");
            return (Criteria) this;
        }

        public Criteria andDevicetypeuidIn(List<String> values) {
            addCriterion("deviceTypeUid in", values, "devicetypeuid");
            return (Criteria) this;
        }

        public Criteria andDevicetypeuidNotIn(List<String> values) {
            addCriterion("deviceTypeUid not in", values, "devicetypeuid");
            return (Criteria) this;
        }

        public Criteria andDevicetypeuidBetween(String value1, String value2) {
            addCriterion("deviceTypeUid between", value1, value2, "devicetypeuid");
            return (Criteria) this;
        }

        public Criteria andDevicetypeuidNotBetween(String value1, String value2) {
            addCriterion("deviceTypeUid not between", value1, value2, "devicetypeuid");
            return (Criteria) this;
        }

        public Criteria andDevicenoIsNull() {
            addCriterion("deviceNo is null");
            return (Criteria) this;
        }

        public Criteria andDevicenoIsNotNull() {
            addCriterion("deviceNo is not null");
            return (Criteria) this;
        }

        public Criteria andDevicenoEqualTo(String value) {
            addCriterion("deviceNo =", value, "deviceno");
            return (Criteria) this;
        }

        public Criteria andDevicenoNotEqualTo(String value) {
            addCriterion("deviceNo <>", value, "deviceno");
            return (Criteria) this;
        }

        public Criteria andDevicenoGreaterThan(String value) {
            addCriterion("deviceNo >", value, "deviceno");
            return (Criteria) this;
        }

        public Criteria andDevicenoGreaterThanOrEqualTo(String value) {
            addCriterion("deviceNo >=", value, "deviceno");
            return (Criteria) this;
        }

        public Criteria andDevicenoLessThan(String value) {
            addCriterion("deviceNo <", value, "deviceno");
            return (Criteria) this;
        }

        public Criteria andDevicenoLessThanOrEqualTo(String value) {
            addCriterion("deviceNo <=", value, "deviceno");
            return (Criteria) this;
        }

        public Criteria andDevicenoLike(String value) {
            addCriterion("deviceNo like", value, "deviceno");
            return (Criteria) this;
        }

        public Criteria andDevicenoNotLike(String value) {
            addCriterion("deviceNo not like", value, "deviceno");
            return (Criteria) this;
        }

        public Criteria andDevicenoIn(List<String> values) {
            addCriterion("deviceNo in", values, "deviceno");
            return (Criteria) this;
        }

        public Criteria andDevicenoNotIn(List<String> values) {
            addCriterion("deviceNo not in", values, "deviceno");
            return (Criteria) this;
        }

        public Criteria andDevicenoBetween(String value1, String value2) {
            addCriterion("deviceNo between", value1, value2, "deviceno");
            return (Criteria) this;
        }

        public Criteria andDevicenoNotBetween(String value1, String value2) {
            addCriterion("deviceNo not between", value1, value2, "deviceno");
            return (Criteria) this;
        }

        public Criteria andDevicepropvalueIsNull() {
            addCriterion("devicePropValue is null");
            return (Criteria) this;
        }

        public Criteria andDevicepropvalueIsNotNull() {
            addCriterion("devicePropValue is not null");
            return (Criteria) this;
        }

        public Criteria andDevicepropvalueEqualTo(String value) {
            addCriterion("devicePropValue =", value, "devicepropvalue");
            return (Criteria) this;
        }

        public Criteria andDevicepropvalueNotEqualTo(String value) {
            addCriterion("devicePropValue <>", value, "devicepropvalue");
            return (Criteria) this;
        }

        public Criteria andDevicepropvalueGreaterThan(String value) {
            addCriterion("devicePropValue >", value, "devicepropvalue");
            return (Criteria) this;
        }

        public Criteria andDevicepropvalueGreaterThanOrEqualTo(String value) {
            addCriterion("devicePropValue >=", value, "devicepropvalue");
            return (Criteria) this;
        }

        public Criteria andDevicepropvalueLessThan(String value) {
            addCriterion("devicePropValue <", value, "devicepropvalue");
            return (Criteria) this;
        }

        public Criteria andDevicepropvalueLessThanOrEqualTo(String value) {
            addCriterion("devicePropValue <=", value, "devicepropvalue");
            return (Criteria) this;
        }

        public Criteria andDevicepropvalueLike(String value) {
            addCriterion("devicePropValue like", value, "devicepropvalue");
            return (Criteria) this;
        }

        public Criteria andDevicepropvalueNotLike(String value) {
            addCriterion("devicePropValue not like", value, "devicepropvalue");
            return (Criteria) this;
        }

        public Criteria andDevicepropvalueIn(List<String> values) {
            addCriterion("devicePropValue in", values, "devicepropvalue");
            return (Criteria) this;
        }

        public Criteria andDevicepropvalueNotIn(List<String> values) {
            addCriterion("devicePropValue not in", values, "devicepropvalue");
            return (Criteria) this;
        }

        public Criteria andDevicepropvalueBetween(String value1, String value2) {
            addCriterion("devicePropValue between", value1, value2, "devicepropvalue");
            return (Criteria) this;
        }

        public Criteria andDevicepropvalueNotBetween(String value1, String value2) {
            addCriterion("devicePropValue not between", value1, value2, "devicepropvalue");
            return (Criteria) this;
        }

        public Criteria andLatitudeIsNull() {
            addCriterion("latitude is null");
            return (Criteria) this;
        }

        public Criteria andLatitudeIsNotNull() {
            addCriterion("latitude is not null");
            return (Criteria) this;
        }

        public Criteria andLatitudeEqualTo(Double value) {
            addCriterion("latitude =", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeNotEqualTo(Double value) {
            addCriterion("latitude <>", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeGreaterThan(Double value) {
            addCriterion("latitude >", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeGreaterThanOrEqualTo(Double value) {
            addCriterion("latitude >=", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeLessThan(Double value) {
            addCriterion("latitude <", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeLessThanOrEqualTo(Double value) {
            addCriterion("latitude <=", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeIn(List<Double> values) {
            addCriterion("latitude in", values, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeNotIn(List<Double> values) {
            addCriterion("latitude not in", values, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeBetween(Double value1, Double value2) {
            addCriterion("latitude between", value1, value2, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeNotBetween(Double value1, Double value2) {
            addCriterion("latitude not between", value1, value2, "latitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeIsNull() {
            addCriterion("longitude is null");
            return (Criteria) this;
        }

        public Criteria andLongitudeIsNotNull() {
            addCriterion("longitude is not null");
            return (Criteria) this;
        }

        public Criteria andLongitudeEqualTo(Double value) {
            addCriterion("longitude =", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeNotEqualTo(Double value) {
            addCriterion("longitude <>", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeGreaterThan(Double value) {
            addCriterion("longitude >", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeGreaterThanOrEqualTo(Double value) {
            addCriterion("longitude >=", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeLessThan(Double value) {
            addCriterion("longitude <", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeLessThanOrEqualTo(Double value) {
            addCriterion("longitude <=", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeIn(List<Double> values) {
            addCriterion("longitude in", values, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeNotIn(List<Double> values) {
            addCriterion("longitude not in", values, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeBetween(Double value1, Double value2) {
            addCriterion("longitude between", value1, value2, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeNotBetween(Double value1, Double value2) {
            addCriterion("longitude not between", value1, value2, "longitude");
            return (Criteria) this;
        }

        public Criteria andDevicestatusIsNull() {
            addCriterion("deviceStatus is null");
            return (Criteria) this;
        }

        public Criteria andDevicestatusIsNotNull() {
            addCriterion("deviceStatus is not null");
            return (Criteria) this;
        }

        public Criteria andDevicestatusEqualTo(String value) {
            addCriterion("deviceStatus =", value, "devicestatus");
            return (Criteria) this;
        }

        public Criteria andDevicestatusNotEqualTo(String value) {
            addCriterion("deviceStatus <>", value, "devicestatus");
            return (Criteria) this;
        }

        public Criteria andDevicestatusGreaterThan(String value) {
            addCriterion("deviceStatus >", value, "devicestatus");
            return (Criteria) this;
        }

        public Criteria andDevicestatusGreaterThanOrEqualTo(String value) {
            addCriterion("deviceStatus >=", value, "devicestatus");
            return (Criteria) this;
        }

        public Criteria andDevicestatusLessThan(String value) {
            addCriterion("deviceStatus <", value, "devicestatus");
            return (Criteria) this;
        }

        public Criteria andDevicestatusLessThanOrEqualTo(String value) {
            addCriterion("deviceStatus <=", value, "devicestatus");
            return (Criteria) this;
        }

        public Criteria andDevicestatusLike(String value) {
            addCriterion("deviceStatus like", value, "devicestatus");
            return (Criteria) this;
        }

        public Criteria andDevicestatusNotLike(String value) {
            addCriterion("deviceStatus not like", value, "devicestatus");
            return (Criteria) this;
        }

        public Criteria andDevicestatusIn(List<String> values) {
            addCriterion("deviceStatus in", values, "devicestatus");
            return (Criteria) this;
        }

        public Criteria andDevicestatusNotIn(List<String> values) {
            addCriterion("deviceStatus not in", values, "devicestatus");
            return (Criteria) this;
        }

        public Criteria andDevicestatusBetween(String value1, String value2) {
            addCriterion("deviceStatus between", value1, value2, "devicestatus");
            return (Criteria) this;
        }

        public Criteria andDevicestatusNotBetween(String value1, String value2) {
            addCriterion("deviceStatus not between", value1, value2, "devicestatus");
            return (Criteria) this;
        }

        public Criteria andDevicefmoutIsNull() {
            addCriterion("deviceFmOut is null");
            return (Criteria) this;
        }

        public Criteria andDevicefmoutIsNotNull() {
            addCriterion("deviceFmOut is not null");
            return (Criteria) this;
        }

        public Criteria andDevicefmoutEqualTo(Integer value) {
            addCriterion("deviceFmOut =", value, "devicefmout");
            return (Criteria) this;
        }

        public Criteria andDevicefmoutNotEqualTo(Integer value) {
            addCriterion("deviceFmOut <>", value, "devicefmout");
            return (Criteria) this;
        }

        public Criteria andDevicefmoutGreaterThan(Integer value) {
            addCriterion("deviceFmOut >", value, "devicefmout");
            return (Criteria) this;
        }

        public Criteria andDevicefmoutGreaterThanOrEqualTo(Integer value) {
            addCriterion("deviceFmOut >=", value, "devicefmout");
            return (Criteria) this;
        }

        public Criteria andDevicefmoutLessThan(Integer value) {
            addCriterion("deviceFmOut <", value, "devicefmout");
            return (Criteria) this;
        }

        public Criteria andDevicefmoutLessThanOrEqualTo(Integer value) {
            addCriterion("deviceFmOut <=", value, "devicefmout");
            return (Criteria) this;
        }

        public Criteria andDevicefmoutIn(List<Integer> values) {
            addCriterion("deviceFmOut in", values, "devicefmout");
            return (Criteria) this;
        }

        public Criteria andDevicefmoutNotIn(List<Integer> values) {
            addCriterion("deviceFmOut not in", values, "devicefmout");
            return (Criteria) this;
        }

        public Criteria andDevicefmoutBetween(Integer value1, Integer value2) {
            addCriterion("deviceFmOut between", value1, value2, "devicefmout");
            return (Criteria) this;
        }

        public Criteria andDevicefmoutNotBetween(Integer value1, Integer value2) {
            addCriterion("deviceFmOut not between", value1, value2, "devicefmout");
            return (Criteria) this;
        }

        public Criteria andDevicefmrecvIsNull() {
            addCriterion("deviceFmRecv is null");
            return (Criteria) this;
        }

        public Criteria andDevicefmrecvIsNotNull() {
            addCriterion("deviceFmRecv is not null");
            return (Criteria) this;
        }

        public Criteria andDevicefmrecvEqualTo(Integer value) {
            addCriterion("deviceFmRecv =", value, "devicefmrecv");
            return (Criteria) this;
        }

        public Criteria andDevicefmrecvNotEqualTo(Integer value) {
            addCriterion("deviceFmRecv <>", value, "devicefmrecv");
            return (Criteria) this;
        }

        public Criteria andDevicefmrecvGreaterThan(Integer value) {
            addCriterion("deviceFmRecv >", value, "devicefmrecv");
            return (Criteria) this;
        }

        public Criteria andDevicefmrecvGreaterThanOrEqualTo(Integer value) {
            addCriterion("deviceFmRecv >=", value, "devicefmrecv");
            return (Criteria) this;
        }

        public Criteria andDevicefmrecvLessThan(Integer value) {
            addCriterion("deviceFmRecv <", value, "devicefmrecv");
            return (Criteria) this;
        }

        public Criteria andDevicefmrecvLessThanOrEqualTo(Integer value) {
            addCriterion("deviceFmRecv <=", value, "devicefmrecv");
            return (Criteria) this;
        }

        public Criteria andDevicefmrecvIn(List<Integer> values) {
            addCriterion("deviceFmRecv in", values, "devicefmrecv");
            return (Criteria) this;
        }

        public Criteria andDevicefmrecvNotIn(List<Integer> values) {
            addCriterion("deviceFmRecv not in", values, "devicefmrecv");
            return (Criteria) this;
        }

        public Criteria andDevicefmrecvBetween(Integer value1, Integer value2) {
            addCriterion("deviceFmRecv between", value1, value2, "devicefmrecv");
            return (Criteria) this;
        }

        public Criteria andDevicefmrecvNotBetween(Integer value1, Integer value2) {
            addCriterion("deviceFmRecv not between", value1, value2, "devicefmrecv");
            return (Criteria) this;
        }

        public Criteria andDevicevolIsNull() {
            addCriterion("deviceVol is null");
            return (Criteria) this;
        }

        public Criteria andDevicevolIsNotNull() {
            addCriterion("deviceVol is not null");
            return (Criteria) this;
        }

        public Criteria andDevicevolEqualTo(Integer value) {
            addCriterion("deviceVol =", value, "devicevol");
            return (Criteria) this;
        }

        public Criteria andDevicevolNotEqualTo(Integer value) {
            addCriterion("deviceVol <>", value, "devicevol");
            return (Criteria) this;
        }

        public Criteria andDevicevolGreaterThan(Integer value) {
            addCriterion("deviceVol >", value, "devicevol");
            return (Criteria) this;
        }

        public Criteria andDevicevolGreaterThanOrEqualTo(Integer value) {
            addCriterion("deviceVol >=", value, "devicevol");
            return (Criteria) this;
        }

        public Criteria andDevicevolLessThan(Integer value) {
            addCriterion("deviceVol <", value, "devicevol");
            return (Criteria) this;
        }

        public Criteria andDevicevolLessThanOrEqualTo(Integer value) {
            addCriterion("deviceVol <=", value, "devicevol");
            return (Criteria) this;
        }

        public Criteria andDevicevolIn(List<Integer> values) {
            addCriterion("deviceVol in", values, "devicevol");
            return (Criteria) this;
        }

        public Criteria andDevicevolNotIn(List<Integer> values) {
            addCriterion("deviceVol not in", values, "devicevol");
            return (Criteria) this;
        }

        public Criteria andDevicevolBetween(Integer value1, Integer value2) {
            addCriterion("deviceVol between", value1, value2, "devicevol");
            return (Criteria) this;
        }

        public Criteria andDevicevolNotBetween(Integer value1, Integer value2) {
            addCriterion("deviceVol not between", value1, value2, "devicevol");
            return (Criteria) this;
        }

        public Criteria andDeviceipIsNull() {
            addCriterion("deviceIp is null");
            return (Criteria) this;
        }

        public Criteria andDeviceipIsNotNull() {
            addCriterion("deviceIp is not null");
            return (Criteria) this;
        }

        public Criteria andDeviceipEqualTo(String value) {
            addCriterion("deviceIp =", value, "deviceip");
            return (Criteria) this;
        }

        public Criteria andDeviceipNotEqualTo(String value) {
            addCriterion("deviceIp <>", value, "deviceip");
            return (Criteria) this;
        }

        public Criteria andDeviceipGreaterThan(String value) {
            addCriterion("deviceIp >", value, "deviceip");
            return (Criteria) this;
        }

        public Criteria andDeviceipGreaterThanOrEqualTo(String value) {
            addCriterion("deviceIp >=", value, "deviceip");
            return (Criteria) this;
        }

        public Criteria andDeviceipLessThan(String value) {
            addCriterion("deviceIp <", value, "deviceip");
            return (Criteria) this;
        }

        public Criteria andDeviceipLessThanOrEqualTo(String value) {
            addCriterion("deviceIp <=", value, "deviceip");
            return (Criteria) this;
        }

        public Criteria andDeviceipLike(String value) {
            addCriterion("deviceIp like", value, "deviceip");
            return (Criteria) this;
        }

        public Criteria andDeviceipNotLike(String value) {
            addCriterion("deviceIp not like", value, "deviceip");
            return (Criteria) this;
        }

        public Criteria andDeviceipIn(List<String> values) {
            addCriterion("deviceIp in", values, "deviceip");
            return (Criteria) this;
        }

        public Criteria andDeviceipNotIn(List<String> values) {
            addCriterion("deviceIp not in", values, "deviceip");
            return (Criteria) this;
        }

        public Criteria andDeviceipBetween(String value1, String value2) {
            addCriterion("deviceIp between", value1, value2, "deviceip");
            return (Criteria) this;
        }

        public Criteria andDeviceipNotBetween(String value1, String value2) {
            addCriterion("deviceIp not between", value1, value2, "deviceip");
            return (Criteria) this;
        }

        public Criteria andDevicegatewayIsNull() {
            addCriterion("deviceGateWay is null");
            return (Criteria) this;
        }

        public Criteria andDevicegatewayIsNotNull() {
            addCriterion("deviceGateWay is not null");
            return (Criteria) this;
        }

        public Criteria andDevicegatewayEqualTo(String value) {
            addCriterion("deviceGateWay =", value, "devicegateway");
            return (Criteria) this;
        }

        public Criteria andDevicegatewayNotEqualTo(String value) {
            addCriterion("deviceGateWay <>", value, "devicegateway");
            return (Criteria) this;
        }

        public Criteria andDevicegatewayGreaterThan(String value) {
            addCriterion("deviceGateWay >", value, "devicegateway");
            return (Criteria) this;
        }

        public Criteria andDevicegatewayGreaterThanOrEqualTo(String value) {
            addCriterion("deviceGateWay >=", value, "devicegateway");
            return (Criteria) this;
        }

        public Criteria andDevicegatewayLessThan(String value) {
            addCriterion("deviceGateWay <", value, "devicegateway");
            return (Criteria) this;
        }

        public Criteria andDevicegatewayLessThanOrEqualTo(String value) {
            addCriterion("deviceGateWay <=", value, "devicegateway");
            return (Criteria) this;
        }

        public Criteria andDevicegatewayLike(String value) {
            addCriterion("deviceGateWay like", value, "devicegateway");
            return (Criteria) this;
        }

        public Criteria andDevicegatewayNotLike(String value) {
            addCriterion("deviceGateWay not like", value, "devicegateway");
            return (Criteria) this;
        }

        public Criteria andDevicegatewayIn(List<String> values) {
            addCriterion("deviceGateWay in", values, "devicegateway");
            return (Criteria) this;
        }

        public Criteria andDevicegatewayNotIn(List<String> values) {
            addCriterion("deviceGateWay not in", values, "devicegateway");
            return (Criteria) this;
        }

        public Criteria andDevicegatewayBetween(String value1, String value2) {
            addCriterion("deviceGateWay between", value1, value2, "devicegateway");
            return (Criteria) this;
        }

        public Criteria andDevicegatewayNotBetween(String value1, String value2) {
            addCriterion("deviceGateWay not between", value1, value2, "devicegateway");
            return (Criteria) this;
        }

        public Criteria andDevicemaskIsNull() {
            addCriterion("deviceMask is null");
            return (Criteria) this;
        }

        public Criteria andDevicemaskIsNotNull() {
            addCriterion("deviceMask is not null");
            return (Criteria) this;
        }

        public Criteria andDevicemaskEqualTo(String value) {
            addCriterion("deviceMask =", value, "devicemask");
            return (Criteria) this;
        }

        public Criteria andDevicemaskNotEqualTo(String value) {
            addCriterion("deviceMask <>", value, "devicemask");
            return (Criteria) this;
        }

        public Criteria andDevicemaskGreaterThan(String value) {
            addCriterion("deviceMask >", value, "devicemask");
            return (Criteria) this;
        }

        public Criteria andDevicemaskGreaterThanOrEqualTo(String value) {
            addCriterion("deviceMask >=", value, "devicemask");
            return (Criteria) this;
        }

        public Criteria andDevicemaskLessThan(String value) {
            addCriterion("deviceMask <", value, "devicemask");
            return (Criteria) this;
        }

        public Criteria andDevicemaskLessThanOrEqualTo(String value) {
            addCriterion("deviceMask <=", value, "devicemask");
            return (Criteria) this;
        }

        public Criteria andDevicemaskLike(String value) {
            addCriterion("deviceMask like", value, "devicemask");
            return (Criteria) this;
        }

        public Criteria andDevicemaskNotLike(String value) {
            addCriterion("deviceMask not like", value, "devicemask");
            return (Criteria) this;
        }

        public Criteria andDevicemaskIn(List<String> values) {
            addCriterion("deviceMask in", values, "devicemask");
            return (Criteria) this;
        }

        public Criteria andDevicemaskNotIn(List<String> values) {
            addCriterion("deviceMask not in", values, "devicemask");
            return (Criteria) this;
        }

        public Criteria andDevicemaskBetween(String value1, String value2) {
            addCriterion("deviceMask between", value1, value2, "devicemask");
            return (Criteria) this;
        }

        public Criteria andDevicemaskNotBetween(String value1, String value2) {
            addCriterion("deviceMask not between", value1, value2, "devicemask");
            return (Criteria) this;
        }

        public Criteria andDevicednsIsNull() {
            addCriterion("deviceDns is null");
            return (Criteria) this;
        }

        public Criteria andDevicednsIsNotNull() {
            addCriterion("deviceDns is not null");
            return (Criteria) this;
        }

        public Criteria andDevicednsEqualTo(String value) {
            addCriterion("deviceDns =", value, "devicedns");
            return (Criteria) this;
        }

        public Criteria andDevicednsNotEqualTo(String value) {
            addCriterion("deviceDns <>", value, "devicedns");
            return (Criteria) this;
        }

        public Criteria andDevicednsGreaterThan(String value) {
            addCriterion("deviceDns >", value, "devicedns");
            return (Criteria) this;
        }

        public Criteria andDevicednsGreaterThanOrEqualTo(String value) {
            addCriterion("deviceDns >=", value, "devicedns");
            return (Criteria) this;
        }

        public Criteria andDevicednsLessThan(String value) {
            addCriterion("deviceDns <", value, "devicedns");
            return (Criteria) this;
        }

        public Criteria andDevicednsLessThanOrEqualTo(String value) {
            addCriterion("deviceDns <=", value, "devicedns");
            return (Criteria) this;
        }

        public Criteria andDevicednsLike(String value) {
            addCriterion("deviceDns like", value, "devicedns");
            return (Criteria) this;
        }

        public Criteria andDevicednsNotLike(String value) {
            addCriterion("deviceDns not like", value, "devicedns");
            return (Criteria) this;
        }

        public Criteria andDevicednsIn(List<String> values) {
            addCriterion("deviceDns in", values, "devicedns");
            return (Criteria) this;
        }

        public Criteria andDevicednsNotIn(List<String> values) {
            addCriterion("deviceDns not in", values, "devicedns");
            return (Criteria) this;
        }

        public Criteria andDevicednsBetween(String value1, String value2) {
            addCriterion("deviceDns between", value1, value2, "devicedns");
            return (Criteria) this;
        }

        public Criteria andDevicednsNotBetween(String value1, String value2) {
            addCriterion("deviceDns not between", value1, value2, "devicedns");
            return (Criteria) this;
        }

        public Criteria andDeviceserveripIsNull() {
            addCriterion("deviceServerIp is null");
            return (Criteria) this;
        }

        public Criteria andDeviceserveripIsNotNull() {
            addCriterion("deviceServerIp is not null");
            return (Criteria) this;
        }

        public Criteria andDeviceserveripEqualTo(String value) {
            addCriterion("deviceServerIp =", value, "deviceserverip");
            return (Criteria) this;
        }

        public Criteria andDeviceserveripNotEqualTo(String value) {
            addCriterion("deviceServerIp <>", value, "deviceserverip");
            return (Criteria) this;
        }

        public Criteria andDeviceserveripGreaterThan(String value) {
            addCriterion("deviceServerIp >", value, "deviceserverip");
            return (Criteria) this;
        }

        public Criteria andDeviceserveripGreaterThanOrEqualTo(String value) {
            addCriterion("deviceServerIp >=", value, "deviceserverip");
            return (Criteria) this;
        }

        public Criteria andDeviceserveripLessThan(String value) {
            addCriterion("deviceServerIp <", value, "deviceserverip");
            return (Criteria) this;
        }

        public Criteria andDeviceserveripLessThanOrEqualTo(String value) {
            addCriterion("deviceServerIp <=", value, "deviceserverip");
            return (Criteria) this;
        }

        public Criteria andDeviceserveripLike(String value) {
            addCriterion("deviceServerIp like", value, "deviceserverip");
            return (Criteria) this;
        }

        public Criteria andDeviceserveripNotLike(String value) {
            addCriterion("deviceServerIp not like", value, "deviceserverip");
            return (Criteria) this;
        }

        public Criteria andDeviceserveripIn(List<String> values) {
            addCriterion("deviceServerIp in", values, "deviceserverip");
            return (Criteria) this;
        }

        public Criteria andDeviceserveripNotIn(List<String> values) {
            addCriterion("deviceServerIp not in", values, "deviceserverip");
            return (Criteria) this;
        }

        public Criteria andDeviceserveripBetween(String value1, String value2) {
            addCriterion("deviceServerIp between", value1, value2, "deviceserverip");
            return (Criteria) this;
        }

        public Criteria andDeviceserveripNotBetween(String value1, String value2) {
            addCriterion("deviceServerIp not between", value1, value2, "deviceserverip");
            return (Criteria) this;
        }

        public Criteria andDeviceserverportIsNull() {
            addCriterion("deviceServerPort is null");
            return (Criteria) this;
        }

        public Criteria andDeviceserverportIsNotNull() {
            addCriterion("deviceServerPort is not null");
            return (Criteria) this;
        }

        public Criteria andDeviceserverportEqualTo(String value) {
            addCriterion("deviceServerPort =", value, "deviceserverport");
            return (Criteria) this;
        }

        public Criteria andDeviceserverportNotEqualTo(String value) {
            addCriterion("deviceServerPort <>", value, "deviceserverport");
            return (Criteria) this;
        }

        public Criteria andDeviceserverportGreaterThan(String value) {
            addCriterion("deviceServerPort >", value, "deviceserverport");
            return (Criteria) this;
        }

        public Criteria andDeviceserverportGreaterThanOrEqualTo(String value) {
            addCriterion("deviceServerPort >=", value, "deviceserverport");
            return (Criteria) this;
        }

        public Criteria andDeviceserverportLessThan(String value) {
            addCriterion("deviceServerPort <", value, "deviceserverport");
            return (Criteria) this;
        }

        public Criteria andDeviceserverportLessThanOrEqualTo(String value) {
            addCriterion("deviceServerPort <=", value, "deviceserverport");
            return (Criteria) this;
        }

        public Criteria andDeviceserverportLike(String value) {
            addCriterion("deviceServerPort like", value, "deviceserverport");
            return (Criteria) this;
        }

        public Criteria andDeviceserverportNotLike(String value) {
            addCriterion("deviceServerPort not like", value, "deviceserverport");
            return (Criteria) this;
        }

        public Criteria andDeviceserverportIn(List<String> values) {
            addCriterion("deviceServerPort in", values, "deviceserverport");
            return (Criteria) this;
        }

        public Criteria andDeviceserverportNotIn(List<String> values) {
            addCriterion("deviceServerPort not in", values, "deviceserverport");
            return (Criteria) this;
        }

        public Criteria andDeviceserverportBetween(String value1, String value2) {
            addCriterion("deviceServerPort between", value1, value2, "deviceserverport");
            return (Criteria) this;
        }

        public Criteria andDeviceserverportNotBetween(String value1, String value2) {
            addCriterion("deviceServerPort not between", value1, value2, "deviceserverport");
            return (Criteria) this;
        }

        public Criteria andCreatebyIsNull() {
            addCriterion("createBy is null");
            return (Criteria) this;
        }

        public Criteria andCreatebyIsNotNull() {
            addCriterion("createBy is not null");
            return (Criteria) this;
        }

        public Criteria andCreatebyEqualTo(String value) {
            addCriterion("createBy =", value, "createby");
            return (Criteria) this;
        }

        public Criteria andCreatebyNotEqualTo(String value) {
            addCriterion("createBy <>", value, "createby");
            return (Criteria) this;
        }

        public Criteria andCreatebyGreaterThan(String value) {
            addCriterion("createBy >", value, "createby");
            return (Criteria) this;
        }

        public Criteria andCreatebyGreaterThanOrEqualTo(String value) {
            addCriterion("createBy >=", value, "createby");
            return (Criteria) this;
        }

        public Criteria andCreatebyLessThan(String value) {
            addCriterion("createBy <", value, "createby");
            return (Criteria) this;
        }

        public Criteria andCreatebyLessThanOrEqualTo(String value) {
            addCriterion("createBy <=", value, "createby");
            return (Criteria) this;
        }

        public Criteria andCreatebyLike(String value) {
            addCriterion("createBy like", value, "createby");
            return (Criteria) this;
        }

        public Criteria andCreatebyNotLike(String value) {
            addCriterion("createBy not like", value, "createby");
            return (Criteria) this;
        }

        public Criteria andCreatebyIn(List<String> values) {
            addCriterion("createBy in", values, "createby");
            return (Criteria) this;
        }

        public Criteria andCreatebyNotIn(List<String> values) {
            addCriterion("createBy not in", values, "createby");
            return (Criteria) this;
        }

        public Criteria andCreatebyBetween(String value1, String value2) {
            addCriterion("createBy between", value1, value2, "createby");
            return (Criteria) this;
        }

        public Criteria andCreatebyNotBetween(String value1, String value2) {
            addCriterion("createBy not between", value1, value2, "createby");
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

        public Criteria andUpdatebyIsNull() {
            addCriterion("updateBy is null");
            return (Criteria) this;
        }

        public Criteria andUpdatebyIsNotNull() {
            addCriterion("updateBy is not null");
            return (Criteria) this;
        }

        public Criteria andUpdatebyEqualTo(String value) {
            addCriterion("updateBy =", value, "updateby");
            return (Criteria) this;
        }

        public Criteria andUpdatebyNotEqualTo(String value) {
            addCriterion("updateBy <>", value, "updateby");
            return (Criteria) this;
        }

        public Criteria andUpdatebyGreaterThan(String value) {
            addCriterion("updateBy >", value, "updateby");
            return (Criteria) this;
        }

        public Criteria andUpdatebyGreaterThanOrEqualTo(String value) {
            addCriterion("updateBy >=", value, "updateby");
            return (Criteria) this;
        }

        public Criteria andUpdatebyLessThan(String value) {
            addCriterion("updateBy <", value, "updateby");
            return (Criteria) this;
        }

        public Criteria andUpdatebyLessThanOrEqualTo(String value) {
            addCriterion("updateBy <=", value, "updateby");
            return (Criteria) this;
        }

        public Criteria andUpdatebyLike(String value) {
            addCriterion("updateBy like", value, "updateby");
            return (Criteria) this;
        }

        public Criteria andUpdatebyNotLike(String value) {
            addCriterion("updateBy not like", value, "updateby");
            return (Criteria) this;
        }

        public Criteria andUpdatebyIn(List<String> values) {
            addCriterion("updateBy in", values, "updateby");
            return (Criteria) this;
        }

        public Criteria andUpdatebyNotIn(List<String> values) {
            addCriterion("updateBy not in", values, "updateby");
            return (Criteria) this;
        }

        public Criteria andUpdatebyBetween(String value1, String value2) {
            addCriterion("updateBy between", value1, value2, "updateby");
            return (Criteria) this;
        }

        public Criteria andUpdatebyNotBetween(String value1, String value2) {
            addCriterion("updateBy not between", value1, value2, "updateby");
            return (Criteria) this;
        }

        public Criteria andDeletedIsNull() {
            addCriterion("deleted is null");
            return (Criteria) this;
        }

        public Criteria andDeletedIsNotNull() {
            addCriterion("deleted is not null");
            return (Criteria) this;
        }

        public Criteria andDeletedEqualTo(Integer value) {
            addCriterion("deleted =", value, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedNotEqualTo(Integer value) {
            addCriterion("deleted <>", value, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedGreaterThan(Integer value) {
            addCriterion("deleted >", value, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedGreaterThanOrEqualTo(Integer value) {
            addCriterion("deleted >=", value, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedLessThan(Integer value) {
            addCriterion("deleted <", value, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedLessThanOrEqualTo(Integer value) {
            addCriterion("deleted <=", value, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedIn(List<Integer> values) {
            addCriterion("deleted in", values, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedNotIn(List<Integer> values) {
            addCriterion("deleted not in", values, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedBetween(Integer value1, Integer value2) {
            addCriterion("deleted between", value1, value2, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedNotBetween(Integer value1, Integer value2) {
            addCriterion("deleted not between", value1, value2, "deleted");
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