package com.cov001.rds.pojo;

import java.util.Date;

public class DeviceStatus {
    private String uid;

    private String devicestatusname;

    private String devicestatusvalue;

    private String devicetruename;

    private String deviceerrorname;

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

    public String getDevicestatusname() {
        return devicestatusname;
    }

    public void setDevicestatusname(String devicestatusname) {
        this.devicestatusname = devicestatusname == null ? null : devicestatusname.trim();
    }

    public String getDevicestatusvalue() {
        return devicestatusvalue;
    }

    public void setDevicestatusvalue(String devicestatusvalue) {
        this.devicestatusvalue = devicestatusvalue == null ? null : devicestatusvalue.trim();
    }

    public String getDevicetruename() {
        return devicetruename;
    }

    public void setDevicetruename(String devicetruename) {
        this.devicetruename = devicetruename == null ? null : devicetruename.trim();
    }

    public String getDeviceerrorname() {
        return deviceerrorname;
    }

    public void setDeviceerrorname(String deviceerrorname) {
        this.deviceerrorname = deviceerrorname == null ? null : deviceerrorname.trim();
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