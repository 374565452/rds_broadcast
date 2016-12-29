package com.cov001.rds.pojo;

import java.util.Date;

public class SysDict {
    private String uid;

    private String dictvalue;

    private String dictname;

    private String dicttype;

    private String description;

    private String parentuid;

    private String createby;

    private Date createdate;

    private String updateby;

    private Date updatedate;

    private String remark;

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid == null ? null : uid.trim();
    }

    public String getDictvalue() {
        return dictvalue;
    }

    public void setDictvalue(String dictvalue) {
        this.dictvalue = dictvalue == null ? null : dictvalue.trim();
    }

    public String getDictname() {
        return dictname;
    }

    public void setDictname(String dictname) {
        this.dictname = dictname == null ? null : dictname.trim();
    }

    public String getDicttype() {
        return dicttype;
    }

    public void setDicttype(String dicttype) {
        this.dicttype = dicttype == null ? null : dicttype.trim();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public String getParentuid() {
        return parentuid;
    }

    public void setParentuid(String parentuid) {
        this.parentuid = parentuid == null ? null : parentuid.trim();
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