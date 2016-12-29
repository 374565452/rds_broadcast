package com.cov001.rds.pojo;

import java.util.Date;

public class SysAction {
    private String uid;

    private String actionkey;

    private String actionname;

    private String actionurl;

    private Integer level;

    private String parentuid;

    private String actiontype;

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

    public String getActionkey() {
        return actionkey;
    }

    public void setActionkey(String actionkey) {
        this.actionkey = actionkey == null ? null : actionkey.trim();
    }

    public String getActionname() {
        return actionname;
    }

    public void setActionname(String actionname) {
        this.actionname = actionname == null ? null : actionname.trim();
    }

    public String getActionurl() {
        return actionurl;
    }

    public void setActionurl(String actionurl) {
        this.actionurl = actionurl == null ? null : actionurl.trim();
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public String getParentuid() {
        return parentuid;
    }

    public void setParentuid(String parentuid) {
        this.parentuid = parentuid == null ? null : parentuid.trim();
    }

    public String getActiontype() {
        return actiontype;
    }

    public void setActiontype(String actiontype) {
        this.actiontype = actiontype == null ? null : actiontype.trim();
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