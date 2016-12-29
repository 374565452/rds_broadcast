package com.cov001.rds.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AudioResourceExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AudioResourceExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("name not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andTypeIsNull() {
            addCriterion("type is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("type is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(String value) {
            addCriterion("type =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(String value) {
            addCriterion("type <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(String value) {
            addCriterion("type >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(String value) {
            addCriterion("type >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(String value) {
            addCriterion("type <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(String value) {
            addCriterion("type <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLike(String value) {
            addCriterion("type like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotLike(String value) {
            addCriterion("type not like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<String> values) {
            addCriterion("type in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<String> values) {
            addCriterion("type not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(String value1, String value2) {
            addCriterion("type between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(String value1, String value2) {
            addCriterion("type not between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andParentIdIsNull() {
            addCriterion("parent_id is null");
            return (Criteria) this;
        }

        public Criteria andParentIdIsNotNull() {
            addCriterion("parent_id is not null");
            return (Criteria) this;
        }

        public Criteria andParentIdEqualTo(Integer value) {
            addCriterion("parent_id =", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdNotEqualTo(Integer value) {
            addCriterion("parent_id <>", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdGreaterThan(Integer value) {
            addCriterion("parent_id >", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("parent_id >=", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdLessThan(Integer value) {
            addCriterion("parent_id <", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdLessThanOrEqualTo(Integer value) {
            addCriterion("parent_id <=", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdIn(List<Integer> values) {
            addCriterion("parent_id in", values, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdNotIn(List<Integer> values) {
            addCriterion("parent_id not in", values, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdBetween(Integer value1, Integer value2) {
            addCriterion("parent_id between", value1, value2, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdNotBetween(Integer value1, Integer value2) {
            addCriterion("parent_id not between", value1, value2, "parentId");
            return (Criteria) this;
        }

        public Criteria andAliasNameIsNull() {
            addCriterion("alias_name is null");
            return (Criteria) this;
        }

        public Criteria andAliasNameIsNotNull() {
            addCriterion("alias_name is not null");
            return (Criteria) this;
        }

        public Criteria andAliasNameEqualTo(String value) {
            addCriterion("alias_name =", value, "aliasName");
            return (Criteria) this;
        }

        public Criteria andAliasNameNotEqualTo(String value) {
            addCriterion("alias_name <>", value, "aliasName");
            return (Criteria) this;
        }

        public Criteria andAliasNameGreaterThan(String value) {
            addCriterion("alias_name >", value, "aliasName");
            return (Criteria) this;
        }

        public Criteria andAliasNameGreaterThanOrEqualTo(String value) {
            addCriterion("alias_name >=", value, "aliasName");
            return (Criteria) this;
        }

        public Criteria andAliasNameLessThan(String value) {
            addCriterion("alias_name <", value, "aliasName");
            return (Criteria) this;
        }

        public Criteria andAliasNameLessThanOrEqualTo(String value) {
            addCriterion("alias_name <=", value, "aliasName");
            return (Criteria) this;
        }

        public Criteria andAliasNameLike(String value) {
            addCriterion("alias_name like", value, "aliasName");
            return (Criteria) this;
        }

        public Criteria andAliasNameNotLike(String value) {
            addCriterion("alias_name not like", value, "aliasName");
            return (Criteria) this;
        }

        public Criteria andAliasNameIn(List<String> values) {
            addCriterion("alias_name in", values, "aliasName");
            return (Criteria) this;
        }

        public Criteria andAliasNameNotIn(List<String> values) {
            addCriterion("alias_name not in", values, "aliasName");
            return (Criteria) this;
        }

        public Criteria andAliasNameBetween(String value1, String value2) {
            addCriterion("alias_name between", value1, value2, "aliasName");
            return (Criteria) this;
        }

        public Criteria andAliasNameNotBetween(String value1, String value2) {
            addCriterion("alias_name not between", value1, value2, "aliasName");
            return (Criteria) this;
        }

        public Criteria andStorageUrlIsNull() {
            addCriterion("storage_url is null");
            return (Criteria) this;
        }

        public Criteria andStorageUrlIsNotNull() {
            addCriterion("storage_url is not null");
            return (Criteria) this;
        }

        public Criteria andStorageUrlEqualTo(String value) {
            addCriterion("storage_url =", value, "storageUrl");
            return (Criteria) this;
        }

        public Criteria andStorageUrlNotEqualTo(String value) {
            addCriterion("storage_url <>", value, "storageUrl");
            return (Criteria) this;
        }

        public Criteria andStorageUrlGreaterThan(String value) {
            addCriterion("storage_url >", value, "storageUrl");
            return (Criteria) this;
        }

        public Criteria andStorageUrlGreaterThanOrEqualTo(String value) {
            addCriterion("storage_url >=", value, "storageUrl");
            return (Criteria) this;
        }

        public Criteria andStorageUrlLessThan(String value) {
            addCriterion("storage_url <", value, "storageUrl");
            return (Criteria) this;
        }

        public Criteria andStorageUrlLessThanOrEqualTo(String value) {
            addCriterion("storage_url <=", value, "storageUrl");
            return (Criteria) this;
        }

        public Criteria andStorageUrlLike(String value) {
            addCriterion("storage_url like", value, "storageUrl");
            return (Criteria) this;
        }

        public Criteria andStorageUrlNotLike(String value) {
            addCriterion("storage_url not like", value, "storageUrl");
            return (Criteria) this;
        }

        public Criteria andStorageUrlIn(List<String> values) {
            addCriterion("storage_url in", values, "storageUrl");
            return (Criteria) this;
        }

        public Criteria andStorageUrlNotIn(List<String> values) {
            addCriterion("storage_url not in", values, "storageUrl");
            return (Criteria) this;
        }

        public Criteria andStorageUrlBetween(String value1, String value2) {
            addCriterion("storage_url between", value1, value2, "storageUrl");
            return (Criteria) this;
        }

        public Criteria andStorageUrlNotBetween(String value1, String value2) {
            addCriterion("storage_url not between", value1, value2, "storageUrl");
            return (Criteria) this;
        }

        public Criteria andResourceStatusIdIsNull() {
            addCriterion("resource_status_id is null");
            return (Criteria) this;
        }

        public Criteria andResourceStatusIdIsNotNull() {
            addCriterion("resource_status_id is not null");
            return (Criteria) this;
        }

        public Criteria andResourceStatusIdEqualTo(Integer value) {
            addCriterion("resource_status_id =", value, "resourceStatusId");
            return (Criteria) this;
        }

        public Criteria andResourceStatusIdNotEqualTo(Integer value) {
            addCriterion("resource_status_id <>", value, "resourceStatusId");
            return (Criteria) this;
        }

        public Criteria andResourceStatusIdGreaterThan(Integer value) {
            addCriterion("resource_status_id >", value, "resourceStatusId");
            return (Criteria) this;
        }

        public Criteria andResourceStatusIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("resource_status_id >=", value, "resourceStatusId");
            return (Criteria) this;
        }

        public Criteria andResourceStatusIdLessThan(Integer value) {
            addCriterion("resource_status_id <", value, "resourceStatusId");
            return (Criteria) this;
        }

        public Criteria andResourceStatusIdLessThanOrEqualTo(Integer value) {
            addCriterion("resource_status_id <=", value, "resourceStatusId");
            return (Criteria) this;
        }

        public Criteria andResourceStatusIdIn(List<Integer> values) {
            addCriterion("resource_status_id in", values, "resourceStatusId");
            return (Criteria) this;
        }

        public Criteria andResourceStatusIdNotIn(List<Integer> values) {
            addCriterion("resource_status_id not in", values, "resourceStatusId");
            return (Criteria) this;
        }

        public Criteria andResourceStatusIdBetween(Integer value1, Integer value2) {
            addCriterion("resource_status_id between", value1, value2, "resourceStatusId");
            return (Criteria) this;
        }

        public Criteria andResourceStatusIdNotBetween(Integer value1, Integer value2) {
            addCriterion("resource_status_id not between", value1, value2, "resourceStatusId");
            return (Criteria) this;
        }

        public Criteria andUploadUserIdIsNull() {
            addCriterion("upload_user_id is null");
            return (Criteria) this;
        }

        public Criteria andUploadUserIdIsNotNull() {
            addCriterion("upload_user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUploadUserIdEqualTo(String value) {
            addCriterion("upload_user_id =", value, "uploadUserId");
            return (Criteria) this;
        }

        public Criteria andUploadUserIdNotEqualTo(String value) {
            addCriterion("upload_user_id <>", value, "uploadUserId");
            return (Criteria) this;
        }

        public Criteria andUploadUserIdGreaterThan(String value) {
            addCriterion("upload_user_id >", value, "uploadUserId");
            return (Criteria) this;
        }

        public Criteria andUploadUserIdGreaterThanOrEqualTo(String value) {
            addCriterion("upload_user_id >=", value, "uploadUserId");
            return (Criteria) this;
        }

        public Criteria andUploadUserIdLessThan(String value) {
            addCriterion("upload_user_id <", value, "uploadUserId");
            return (Criteria) this;
        }

        public Criteria andUploadUserIdLessThanOrEqualTo(String value) {
            addCriterion("upload_user_id <=", value, "uploadUserId");
            return (Criteria) this;
        }

        public Criteria andUploadUserIdLike(String value) {
            addCriterion("upload_user_id like", value, "uploadUserId");
            return (Criteria) this;
        }

        public Criteria andUploadUserIdNotLike(String value) {
            addCriterion("upload_user_id not like", value, "uploadUserId");
            return (Criteria) this;
        }

        public Criteria andUploadUserIdIn(List<String> values) {
            addCriterion("upload_user_id in", values, "uploadUserId");
            return (Criteria) this;
        }

        public Criteria andUploadUserIdNotIn(List<String> values) {
            addCriterion("upload_user_id not in", values, "uploadUserId");
            return (Criteria) this;
        }

        public Criteria andUploadUserIdBetween(String value1, String value2) {
            addCriterion("upload_user_id between", value1, value2, "uploadUserId");
            return (Criteria) this;
        }

        public Criteria andUploadUserIdNotBetween(String value1, String value2) {
            addCriterion("upload_user_id not between", value1, value2, "uploadUserId");
            return (Criteria) this;
        }

        public Criteria andOperatorIsNull() {
            addCriterion("operator is null");
            return (Criteria) this;
        }

        public Criteria andOperatorIsNotNull() {
            addCriterion("operator is not null");
            return (Criteria) this;
        }

        public Criteria andOperatorEqualTo(String value) {
            addCriterion("operator =", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorNotEqualTo(String value) {
            addCriterion("operator <>", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorGreaterThan(String value) {
            addCriterion("operator >", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorGreaterThanOrEqualTo(String value) {
            addCriterion("operator >=", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorLessThan(String value) {
            addCriterion("operator <", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorLessThanOrEqualTo(String value) {
            addCriterion("operator <=", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorLike(String value) {
            addCriterion("operator like", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorNotLike(String value) {
            addCriterion("operator not like", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorIn(List<String> values) {
            addCriterion("operator in", values, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorNotIn(List<String> values) {
            addCriterion("operator not in", values, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorBetween(String value1, String value2) {
            addCriterion("operator between", value1, value2, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorNotBetween(String value1, String value2) {
            addCriterion("operator not between", value1, value2, "operator");
            return (Criteria) this;
        }

        public Criteria andOperateDateIsNull() {
            addCriterion("operate_date is null");
            return (Criteria) this;
        }

        public Criteria andOperateDateIsNotNull() {
            addCriterion("operate_date is not null");
            return (Criteria) this;
        }

        public Criteria andOperateDateEqualTo(Date value) {
            addCriterion("operate_date =", value, "operateDate");
            return (Criteria) this;
        }

        public Criteria andOperateDateNotEqualTo(Date value) {
            addCriterion("operate_date <>", value, "operateDate");
            return (Criteria) this;
        }

        public Criteria andOperateDateGreaterThan(Date value) {
            addCriterion("operate_date >", value, "operateDate");
            return (Criteria) this;
        }

        public Criteria andOperateDateGreaterThanOrEqualTo(Date value) {
            addCriterion("operate_date >=", value, "operateDate");
            return (Criteria) this;
        }

        public Criteria andOperateDateLessThan(Date value) {
            addCriterion("operate_date <", value, "operateDate");
            return (Criteria) this;
        }

        public Criteria andOperateDateLessThanOrEqualTo(Date value) {
            addCriterion("operate_date <=", value, "operateDate");
            return (Criteria) this;
        }

        public Criteria andOperateDateIn(List<Date> values) {
            addCriterion("operate_date in", values, "operateDate");
            return (Criteria) this;
        }

        public Criteria andOperateDateNotIn(List<Date> values) {
            addCriterion("operate_date not in", values, "operateDate");
            return (Criteria) this;
        }

        public Criteria andOperateDateBetween(Date value1, Date value2) {
            addCriterion("operate_date between", value1, value2, "operateDate");
            return (Criteria) this;
        }

        public Criteria andOperateDateNotBetween(Date value1, Date value2) {
            addCriterion("operate_date not between", value1, value2, "operateDate");
            return (Criteria) this;
        }

        public Criteria andOperateCommentIsNull() {
            addCriterion("operate_comment is null");
            return (Criteria) this;
        }

        public Criteria andOperateCommentIsNotNull() {
            addCriterion("operate_comment is not null");
            return (Criteria) this;
        }

        public Criteria andOperateCommentEqualTo(String value) {
            addCriterion("operate_comment =", value, "operateComment");
            return (Criteria) this;
        }

        public Criteria andOperateCommentNotEqualTo(String value) {
            addCriterion("operate_comment <>", value, "operateComment");
            return (Criteria) this;
        }

        public Criteria andOperateCommentGreaterThan(String value) {
            addCriterion("operate_comment >", value, "operateComment");
            return (Criteria) this;
        }

        public Criteria andOperateCommentGreaterThanOrEqualTo(String value) {
            addCriterion("operate_comment >=", value, "operateComment");
            return (Criteria) this;
        }

        public Criteria andOperateCommentLessThan(String value) {
            addCriterion("operate_comment <", value, "operateComment");
            return (Criteria) this;
        }

        public Criteria andOperateCommentLessThanOrEqualTo(String value) {
            addCriterion("operate_comment <=", value, "operateComment");
            return (Criteria) this;
        }

        public Criteria andOperateCommentLike(String value) {
            addCriterion("operate_comment like", value, "operateComment");
            return (Criteria) this;
        }

        public Criteria andOperateCommentNotLike(String value) {
            addCriterion("operate_comment not like", value, "operateComment");
            return (Criteria) this;
        }

        public Criteria andOperateCommentIn(List<String> values) {
            addCriterion("operate_comment in", values, "operateComment");
            return (Criteria) this;
        }

        public Criteria andOperateCommentNotIn(List<String> values) {
            addCriterion("operate_comment not in", values, "operateComment");
            return (Criteria) this;
        }

        public Criteria andOperateCommentBetween(String value1, String value2) {
            addCriterion("operate_comment between", value1, value2, "operateComment");
            return (Criteria) this;
        }

        public Criteria andOperateCommentNotBetween(String value1, String value2) {
            addCriterion("operate_comment not between", value1, value2, "operateComment");
            return (Criteria) this;
        }

        public Criteria andDateCreatedIsNull() {
            addCriterion("date_created is null");
            return (Criteria) this;
        }

        public Criteria andDateCreatedIsNotNull() {
            addCriterion("date_created is not null");
            return (Criteria) this;
        }

        public Criteria andDateCreatedEqualTo(Date value) {
            addCriterion("date_created =", value, "dateCreated");
            return (Criteria) this;
        }

        public Criteria andDateCreatedNotEqualTo(Date value) {
            addCriterion("date_created <>", value, "dateCreated");
            return (Criteria) this;
        }

        public Criteria andDateCreatedGreaterThan(Date value) {
            addCriterion("date_created >", value, "dateCreated");
            return (Criteria) this;
        }

        public Criteria andDateCreatedGreaterThanOrEqualTo(Date value) {
            addCriterion("date_created >=", value, "dateCreated");
            return (Criteria) this;
        }

        public Criteria andDateCreatedLessThan(Date value) {
            addCriterion("date_created <", value, "dateCreated");
            return (Criteria) this;
        }

        public Criteria andDateCreatedLessThanOrEqualTo(Date value) {
            addCriterion("date_created <=", value, "dateCreated");
            return (Criteria) this;
        }

        public Criteria andDateCreatedIn(List<Date> values) {
            addCriterion("date_created in", values, "dateCreated");
            return (Criteria) this;
        }

        public Criteria andDateCreatedNotIn(List<Date> values) {
            addCriterion("date_created not in", values, "dateCreated");
            return (Criteria) this;
        }

        public Criteria andDateCreatedBetween(Date value1, Date value2) {
            addCriterion("date_created between", value1, value2, "dateCreated");
            return (Criteria) this;
        }

        public Criteria andDateCreatedNotBetween(Date value1, Date value2) {
            addCriterion("date_created not between", value1, value2, "dateCreated");
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