package com.cov001.rds.pojo;

import java.util.Date;

public class Device {
    private String uid;

    private String devicetypeuid;

    private String deviceno;

    private String devicepropvalue;

    private Double latitude;

    private Double longitude;

    private String devicestatus;

    private Integer devicefmout;

    private Integer devicefmrecv;

    private Integer devicevol;

    private String deviceip;

    private String devicegateway;

    private String devicemask;

    private String devicedns;

    private String deviceserverip;

    private String deviceserverport;

    private String createby;

    private Date createdate;

    private String updateby;

    private Integer deleted;

    private Date updatedate;

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid == null ? null : uid.trim();
    }

    public String getDevicetypeuid() {
        return devicetypeuid;
    }

    public void setDevicetypeuid(String devicetypeuid) {
        this.devicetypeuid = devicetypeuid == null ? null : devicetypeuid.trim();
    }

    public String getDeviceno() {
        return deviceno;
    }

    public void setDeviceno(String deviceno) {
        this.deviceno = deviceno == null ? null : deviceno.trim();
    }

    public String getDevicepropvalue() {
        return devicepropvalue;
    }

    public void setDevicepropvalue(String devicepropvalue) {
        this.devicepropvalue = devicepropvalue == null ? null : devicepropvalue.trim();
    }

    public Double getLatitude() {
        return latitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    public Double getLongitude() {
        return longitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    public String getDevicestatus() {
        return devicestatus;
    }

    public void setDevicestatus(String devicestatus) {
        this.devicestatus = devicestatus == null ? null : devicestatus.trim();
    }

    public Integer getDevicefmout() {
        return devicefmout;
    }

    public void setDevicefmout(Integer devicefmout) {
        this.devicefmout = devicefmout;
    }

    public Integer getDevicefmrecv() {
        return devicefmrecv;
    }

    public void setDevicefmrecv(Integer devicefmrecv) {
        this.devicefmrecv = devicefmrecv;
    }

    public Integer getDevicevol() {
        return devicevol;
    }

    public void setDevicevol(Integer devicevol) {
        this.devicevol = devicevol;
    }

    public String getDeviceip() {
        return deviceip;
    }

    public void setDeviceip(String deviceip) {
        this.deviceip = deviceip == null ? null : deviceip.trim();
    }

    public String getDevicegateway() {
        return devicegateway;
    }

    public void setDevicegateway(String devicegateway) {
        this.devicegateway = devicegateway == null ? null : devicegateway.trim();
    }

    public String getDevicemask() {
        return devicemask;
    }

    public void setDevicemask(String devicemask) {
        this.devicemask = devicemask == null ? null : devicemask.trim();
    }

    public String getDevicedns() {
        return devicedns;
    }

    public void setDevicedns(String devicedns) {
        this.devicedns = devicedns == null ? null : devicedns.trim();
    }

    public String getDeviceserverip() {
        return deviceserverip;
    }

    public void setDeviceserverip(String deviceserverip) {
        this.deviceserverip = deviceserverip == null ? null : deviceserverip.trim();
    }

    public String getDeviceserverport() {
        return deviceserverport;
    }

    public void setDeviceserverport(String deviceserverport) {
        this.deviceserverport = deviceserverport == null ? null : deviceserverport.trim();
    }

    public String getCreateby() {
        return createby;
    }

    public void setCreateby(String createby) {
        this.createby = createby == null ? null : createby.trim();
    }

    public Date getCreatedate() {
        return createdate;
    }

    public void setCreatedate(Date createdate) {
        this.createdate = createdate;
    }

    public String getUpdateby() {
        return updateby;
    }

    public void setUpdateby(String updateby) {
        this.updateby = updateby == null ? null : updateby.trim();
    }

    public Integer getDeleted() {
        return deleted;
    }

    public void setDeleted(Integer deleted) {
        this.deleted = deleted;
    }

    public Date getUpdatedate() {
        return updatedate;
    }

    public void setUpdatedate(Date updatedate) {
        this.updatedate = updatedate;
    }
}