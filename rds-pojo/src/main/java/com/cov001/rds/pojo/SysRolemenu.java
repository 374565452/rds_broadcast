package com.cov001.rds.pojo;

public class SysRolemenu {
    private String uid;

    private String roleuid;

    private String menuuid;

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid == null ? null : uid.trim();
    }

    public String getRoleuid() {
        return roleuid;
    }

    public void setRoleuid(String roleuid) {
        this.roleuid = roleuid == null ? null : roleuid.trim();
    }

    public String getMenuuid() {
        return menuuid;
    }

    public void setMenuuid(String menuuid) {
        this.menuuid = menuuid == null ? null : menuuid.trim();
    }
}