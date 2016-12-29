package com.cov001.rds.pojo;

public class SysUserrole {
    private String uid;

    private String useruid;

    private String roleuid;

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid == null ? null : uid.trim();
    }

    public String getUseruid() {
        return useruid;
    }

    public void setUseruid(String useruid) {
        this.useruid = useruid == null ? null : useruid.trim();
    }

    public String getRoleuid() {
        return roleuid;
    }

    public void setRoleuid(String roleuid) {
        this.roleuid = roleuid == null ? null : roleuid.trim();
    }
}