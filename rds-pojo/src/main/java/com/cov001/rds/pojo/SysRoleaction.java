package com.cov001.rds.pojo;

public class SysRoleaction {
    private String uid;

    private String actionuid;

    private String roleuid;

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid == null ? null : uid.trim();
    }

    public String getActionuid() {
        return actionuid;
    }

    public void setActionuid(String actionuid) {
        this.actionuid = actionuid == null ? null : actionuid.trim();
    }

    public String getRoleuid() {
        return roleuid;
    }

    public void setRoleuid(String roleuid) {
        this.roleuid = roleuid == null ? null : roleuid.trim();
    }
}