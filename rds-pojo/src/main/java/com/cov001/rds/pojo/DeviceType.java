package com.cov001.rds.pojo;

import java.util.Date;

public class DeviceType {
    private String uid;

    private String devicetypename;

    private String devicetypevalue;

    private String descption;

    private Integer status;

    private Date createdate;

    private Date updatedate;

    private String remark;

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid == null ? null : uid.trim();
    }

    public String getDevicetypename() {
        return devicetypename;
    }

    public void setDevicetypename(String devicetypename) {
        this.devicetypename = devicetypename == null ? null : devicetypename.trim();
    }

    public String getDevicetypevalue() {
        return devicetypevalue;
    }

    public void setDevicetypevalue(String devicetypevalue) {
        this.devicetypevalue = devicetypevalue == null ? null : devicetypevalue.trim();
    }

    public String getDescption() {
        return descption;
    }

    public void setDescption(String descption) {
        this.descption = descption == null ? null : descption.trim();
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Date getCreatedate() {
        return createdate;
    }

    public void setCreatedate(Date createdate) {
        this.createdate = createdate;
    }

    public Date getUpdatedate() {
        return updatedate;
    }

    public void setUpdatedate(Date updatedate) {
        this.updatedate = updatedate;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }
}