package com.cov001.rds.pojo;

import java.util.Date;

public class AudioResource {
    private Integer id;

    private String name;

    private String type;

    private Integer parentId;

    private String aliasName;

    private String storageUrl;

    private Integer resourceStatusId;

    private String uploadUserId;

    private String operator;

    private Date operateDate;

    private String operateComment;

    private Date dateCreated;

    private Integer deleted;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public Integer getParentId() {
        return parentId;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    public String getAliasName() {
        return aliasName;
    }

    public void setAliasName(String aliasName) {
        this.aliasName = aliasName == null ? null : aliasName.trim();
    }

    public String getStorageUrl() {
        return storageUrl;
    }

    public void setStorageUrl(String storageUrl) {
        this.storageUrl = storageUrl == null ? null : storageUrl.trim();
    }

    public Integer getResourceStatusId() {
        return resourceStatusId;
    }

    public void setResourceStatusId(Integer resourceStatusId) {
        this.resourceStatusId = resourceStatusId;
    }

    public String getUploadUserId() {
        return uploadUserId;
    }

    public void setUploadUserId(String uploadUserId) {
        this.uploadUserId = uploadUserId == null ? null : uploadUserId.trim();
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator == null ? null : operator.trim();
    }

    public Date getOperateDate() {
        return operateDate;
    }

    public void setOperateDate(Date operateDate) {
        this.operateDate = operateDate;
    }

    public String getOperateComment() {
        return operateComment;
    }

    public void setOperateComment(String operateComment) {
        this.operateComment = operateComment == null ? null : operateComment.trim();
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }

    public Integer getDeleted() {
        return deleted;
    }

    public void setDeleted(Integer deleted) {
        this.deleted = deleted;
    }
}