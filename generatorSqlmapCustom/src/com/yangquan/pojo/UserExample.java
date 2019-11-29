package com.yangquan.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class UserExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserExample() {
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
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

        public Criteria andUserIdIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(Long value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(Long value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(Long value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(Long value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(Long value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(Long value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<Long> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<Long> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(Long value1, Long value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(Long value1, Long value2) {
            addCriterion("user_id not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andTokenIdIsNull() {
            addCriterion("token_id is null");
            return (Criteria) this;
        }

        public Criteria andTokenIdIsNotNull() {
            addCriterion("token_id is not null");
            return (Criteria) this;
        }

        public Criteria andTokenIdEqualTo(String value) {
            addCriterion("token_id =", value, "tokenId");
            return (Criteria) this;
        }

        public Criteria andTokenIdNotEqualTo(String value) {
            addCriterion("token_id <>", value, "tokenId");
            return (Criteria) this;
        }

        public Criteria andTokenIdGreaterThan(String value) {
            addCriterion("token_id >", value, "tokenId");
            return (Criteria) this;
        }

        public Criteria andTokenIdGreaterThanOrEqualTo(String value) {
            addCriterion("token_id >=", value, "tokenId");
            return (Criteria) this;
        }

        public Criteria andTokenIdLessThan(String value) {
            addCriterion("token_id <", value, "tokenId");
            return (Criteria) this;
        }

        public Criteria andTokenIdLessThanOrEqualTo(String value) {
            addCriterion("token_id <=", value, "tokenId");
            return (Criteria) this;
        }

        public Criteria andTokenIdLike(String value) {
            addCriterion("token_id like", value, "tokenId");
            return (Criteria) this;
        }

        public Criteria andTokenIdNotLike(String value) {
            addCriterion("token_id not like", value, "tokenId");
            return (Criteria) this;
        }

        public Criteria andTokenIdIn(List<String> values) {
            addCriterion("token_id in", values, "tokenId");
            return (Criteria) this;
        }

        public Criteria andTokenIdNotIn(List<String> values) {
            addCriterion("token_id not in", values, "tokenId");
            return (Criteria) this;
        }

        public Criteria andTokenIdBetween(String value1, String value2) {
            addCriterion("token_id between", value1, value2, "tokenId");
            return (Criteria) this;
        }

        public Criteria andTokenIdNotBetween(String value1, String value2) {
            addCriterion("token_id not between", value1, value2, "tokenId");
            return (Criteria) this;
        }

        public Criteria andPhoneNumberIsNull() {
            addCriterion("phone_number is null");
            return (Criteria) this;
        }

        public Criteria andPhoneNumberIsNotNull() {
            addCriterion("phone_number is not null");
            return (Criteria) this;
        }

        public Criteria andPhoneNumberEqualTo(String value) {
            addCriterion("phone_number =", value, "phoneNumber");
            return (Criteria) this;
        }

        public Criteria andPhoneNumberNotEqualTo(String value) {
            addCriterion("phone_number <>", value, "phoneNumber");
            return (Criteria) this;
        }

        public Criteria andPhoneNumberGreaterThan(String value) {
            addCriterion("phone_number >", value, "phoneNumber");
            return (Criteria) this;
        }

        public Criteria andPhoneNumberGreaterThanOrEqualTo(String value) {
            addCriterion("phone_number >=", value, "phoneNumber");
            return (Criteria) this;
        }

        public Criteria andPhoneNumberLessThan(String value) {
            addCriterion("phone_number <", value, "phoneNumber");
            return (Criteria) this;
        }

        public Criteria andPhoneNumberLessThanOrEqualTo(String value) {
            addCriterion("phone_number <=", value, "phoneNumber");
            return (Criteria) this;
        }

        public Criteria andPhoneNumberLike(String value) {
            addCriterion("phone_number like", value, "phoneNumber");
            return (Criteria) this;
        }

        public Criteria andPhoneNumberNotLike(String value) {
            addCriterion("phone_number not like", value, "phoneNumber");
            return (Criteria) this;
        }

        public Criteria andPhoneNumberIn(List<String> values) {
            addCriterion("phone_number in", values, "phoneNumber");
            return (Criteria) this;
        }

        public Criteria andPhoneNumberNotIn(List<String> values) {
            addCriterion("phone_number not in", values, "phoneNumber");
            return (Criteria) this;
        }

        public Criteria andPhoneNumberBetween(String value1, String value2) {
            addCriterion("phone_number between", value1, value2, "phoneNumber");
            return (Criteria) this;
        }

        public Criteria andPhoneNumberNotBetween(String value1, String value2) {
            addCriterion("phone_number not between", value1, value2, "phoneNumber");
            return (Criteria) this;
        }

        public Criteria andNicknameIsNull() {
            addCriterion("nickname is null");
            return (Criteria) this;
        }

        public Criteria andNicknameIsNotNull() {
            addCriterion("nickname is not null");
            return (Criteria) this;
        }

        public Criteria andNicknameEqualTo(String value) {
            addCriterion("nickname =", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameNotEqualTo(String value) {
            addCriterion("nickname <>", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameGreaterThan(String value) {
            addCriterion("nickname >", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameGreaterThanOrEqualTo(String value) {
            addCriterion("nickname >=", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameLessThan(String value) {
            addCriterion("nickname <", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameLessThanOrEqualTo(String value) {
            addCriterion("nickname <=", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameLike(String value) {
            addCriterion("nickname like", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameNotLike(String value) {
            addCriterion("nickname not like", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameIn(List<String> values) {
            addCriterion("nickname in", values, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameNotIn(List<String> values) {
            addCriterion("nickname not in", values, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameBetween(String value1, String value2) {
            addCriterion("nickname between", value1, value2, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameNotBetween(String value1, String value2) {
            addCriterion("nickname not between", value1, value2, "nickname");
            return (Criteria) this;
        }

        public Criteria andPhotoUrlIsNull() {
            addCriterion("photo_url is null");
            return (Criteria) this;
        }

        public Criteria andPhotoUrlIsNotNull() {
            addCriterion("photo_url is not null");
            return (Criteria) this;
        }

        public Criteria andPhotoUrlEqualTo(String value) {
            addCriterion("photo_url =", value, "photoUrl");
            return (Criteria) this;
        }

        public Criteria andPhotoUrlNotEqualTo(String value) {
            addCriterion("photo_url <>", value, "photoUrl");
            return (Criteria) this;
        }

        public Criteria andPhotoUrlGreaterThan(String value) {
            addCriterion("photo_url >", value, "photoUrl");
            return (Criteria) this;
        }

        public Criteria andPhotoUrlGreaterThanOrEqualTo(String value) {
            addCriterion("photo_url >=", value, "photoUrl");
            return (Criteria) this;
        }

        public Criteria andPhotoUrlLessThan(String value) {
            addCriterion("photo_url <", value, "photoUrl");
            return (Criteria) this;
        }

        public Criteria andPhotoUrlLessThanOrEqualTo(String value) {
            addCriterion("photo_url <=", value, "photoUrl");
            return (Criteria) this;
        }

        public Criteria andPhotoUrlLike(String value) {
            addCriterion("photo_url like", value, "photoUrl");
            return (Criteria) this;
        }

        public Criteria andPhotoUrlNotLike(String value) {
            addCriterion("photo_url not like", value, "photoUrl");
            return (Criteria) this;
        }

        public Criteria andPhotoUrlIn(List<String> values) {
            addCriterion("photo_url in", values, "photoUrl");
            return (Criteria) this;
        }

        public Criteria andPhotoUrlNotIn(List<String> values) {
            addCriterion("photo_url not in", values, "photoUrl");
            return (Criteria) this;
        }

        public Criteria andPhotoUrlBetween(String value1, String value2) {
            addCriterion("photo_url between", value1, value2, "photoUrl");
            return (Criteria) this;
        }

        public Criteria andPhotoUrlNotBetween(String value1, String value2) {
            addCriterion("photo_url not between", value1, value2, "photoUrl");
            return (Criteria) this;
        }

        public Criteria andUserTypeIsNull() {
            addCriterion("user_type is null");
            return (Criteria) this;
        }

        public Criteria andUserTypeIsNotNull() {
            addCriterion("user_type is not null");
            return (Criteria) this;
        }

        public Criteria andUserTypeEqualTo(Integer value) {
            addCriterion("user_type =", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeNotEqualTo(Integer value) {
            addCriterion("user_type <>", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeGreaterThan(Integer value) {
            addCriterion("user_type >", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_type >=", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeLessThan(Integer value) {
            addCriterion("user_type <", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeLessThanOrEqualTo(Integer value) {
            addCriterion("user_type <=", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeIn(List<Integer> values) {
            addCriterion("user_type in", values, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeNotIn(List<Integer> values) {
            addCriterion("user_type not in", values, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeBetween(Integer value1, Integer value2) {
            addCriterion("user_type between", value1, value2, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("user_type not between", value1, value2, "userType");
            return (Criteria) this;
        }

        public Criteria andUserCardIdUrlIsNull() {
            addCriterion("user_card_id_url is null");
            return (Criteria) this;
        }

        public Criteria andUserCardIdUrlIsNotNull() {
            addCriterion("user_card_id_url is not null");
            return (Criteria) this;
        }

        public Criteria andUserCardIdUrlEqualTo(String value) {
            addCriterion("user_card_id_url =", value, "userCardIdUrl");
            return (Criteria) this;
        }

        public Criteria andUserCardIdUrlNotEqualTo(String value) {
            addCriterion("user_card_id_url <>", value, "userCardIdUrl");
            return (Criteria) this;
        }

        public Criteria andUserCardIdUrlGreaterThan(String value) {
            addCriterion("user_card_id_url >", value, "userCardIdUrl");
            return (Criteria) this;
        }

        public Criteria andUserCardIdUrlGreaterThanOrEqualTo(String value) {
            addCriterion("user_card_id_url >=", value, "userCardIdUrl");
            return (Criteria) this;
        }

        public Criteria andUserCardIdUrlLessThan(String value) {
            addCriterion("user_card_id_url <", value, "userCardIdUrl");
            return (Criteria) this;
        }

        public Criteria andUserCardIdUrlLessThanOrEqualTo(String value) {
            addCriterion("user_card_id_url <=", value, "userCardIdUrl");
            return (Criteria) this;
        }

        public Criteria andUserCardIdUrlLike(String value) {
            addCriterion("user_card_id_url like", value, "userCardIdUrl");
            return (Criteria) this;
        }

        public Criteria andUserCardIdUrlNotLike(String value) {
            addCriterion("user_card_id_url not like", value, "userCardIdUrl");
            return (Criteria) this;
        }

        public Criteria andUserCardIdUrlIn(List<String> values) {
            addCriterion("user_card_id_url in", values, "userCardIdUrl");
            return (Criteria) this;
        }

        public Criteria andUserCardIdUrlNotIn(List<String> values) {
            addCriterion("user_card_id_url not in", values, "userCardIdUrl");
            return (Criteria) this;
        }

        public Criteria andUserCardIdUrlBetween(String value1, String value2) {
            addCriterion("user_card_id_url between", value1, value2, "userCardIdUrl");
            return (Criteria) this;
        }

        public Criteria andUserCardIdUrlNotBetween(String value1, String value2) {
            addCriterion("user_card_id_url not between", value1, value2, "userCardIdUrl");
            return (Criteria) this;
        }

        public Criteria andSexIsNull() {
            addCriterion("sex is null");
            return (Criteria) this;
        }

        public Criteria andSexIsNotNull() {
            addCriterion("sex is not null");
            return (Criteria) this;
        }

        public Criteria andSexEqualTo(Integer value) {
            addCriterion("sex =", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotEqualTo(Integer value) {
            addCriterion("sex <>", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThan(Integer value) {
            addCriterion("sex >", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThanOrEqualTo(Integer value) {
            addCriterion("sex >=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThan(Integer value) {
            addCriterion("sex <", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThanOrEqualTo(Integer value) {
            addCriterion("sex <=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexIn(List<Integer> values) {
            addCriterion("sex in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotIn(List<Integer> values) {
            addCriterion("sex not in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexBetween(Integer value1, Integer value2) {
            addCriterion("sex between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotBetween(Integer value1, Integer value2) {
            addCriterion("sex not between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andStarIsNull() {
            addCriterion("star is null");
            return (Criteria) this;
        }

        public Criteria andStarIsNotNull() {
            addCriterion("star is not null");
            return (Criteria) this;
        }

        public Criteria andStarEqualTo(Integer value) {
            addCriterion("star =", value, "star");
            return (Criteria) this;
        }

        public Criteria andStarNotEqualTo(Integer value) {
            addCriterion("star <>", value, "star");
            return (Criteria) this;
        }

        public Criteria andStarGreaterThan(Integer value) {
            addCriterion("star >", value, "star");
            return (Criteria) this;
        }

        public Criteria andStarGreaterThanOrEqualTo(Integer value) {
            addCriterion("star >=", value, "star");
            return (Criteria) this;
        }

        public Criteria andStarLessThan(Integer value) {
            addCriterion("star <", value, "star");
            return (Criteria) this;
        }

        public Criteria andStarLessThanOrEqualTo(Integer value) {
            addCriterion("star <=", value, "star");
            return (Criteria) this;
        }

        public Criteria andStarIn(List<Integer> values) {
            addCriterion("star in", values, "star");
            return (Criteria) this;
        }

        public Criteria andStarNotIn(List<Integer> values) {
            addCriterion("star not in", values, "star");
            return (Criteria) this;
        }

        public Criteria andStarBetween(Integer value1, Integer value2) {
            addCriterion("star between", value1, value2, "star");
            return (Criteria) this;
        }

        public Criteria andStarNotBetween(Integer value1, Integer value2) {
            addCriterion("star not between", value1, value2, "star");
            return (Criteria) this;
        }

        public Criteria andBirthdayIsNull() {
            addCriterion("birthday is null");
            return (Criteria) this;
        }

        public Criteria andBirthdayIsNotNull() {
            addCriterion("birthday is not null");
            return (Criteria) this;
        }

        public Criteria andBirthdayEqualTo(Date value) {
            addCriterionForJDBCDate("birthday =", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotEqualTo(Date value) {
            addCriterionForJDBCDate("birthday <>", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayGreaterThan(Date value) {
            addCriterionForJDBCDate("birthday >", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("birthday >=", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayLessThan(Date value) {
            addCriterionForJDBCDate("birthday <", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("birthday <=", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayIn(List<Date> values) {
            addCriterionForJDBCDate("birthday in", values, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotIn(List<Date> values) {
            addCriterionForJDBCDate("birthday not in", values, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("birthday between", value1, value2, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("birthday not between", value1, value2, "birthday");
            return (Criteria) this;
        }

        public Criteria andStartWorkIsNull() {
            addCriterion("start_work is null");
            return (Criteria) this;
        }

        public Criteria andStartWorkIsNotNull() {
            addCriterion("start_work is not null");
            return (Criteria) this;
        }

        public Criteria andStartWorkEqualTo(Date value) {
            addCriterionForJDBCDate("start_work =", value, "startWork");
            return (Criteria) this;
        }

        public Criteria andStartWorkNotEqualTo(Date value) {
            addCriterionForJDBCDate("start_work <>", value, "startWork");
            return (Criteria) this;
        }

        public Criteria andStartWorkGreaterThan(Date value) {
            addCriterionForJDBCDate("start_work >", value, "startWork");
            return (Criteria) this;
        }

        public Criteria andStartWorkGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("start_work >=", value, "startWork");
            return (Criteria) this;
        }

        public Criteria andStartWorkLessThan(Date value) {
            addCriterionForJDBCDate("start_work <", value, "startWork");
            return (Criteria) this;
        }

        public Criteria andStartWorkLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("start_work <=", value, "startWork");
            return (Criteria) this;
        }

        public Criteria andStartWorkIn(List<Date> values) {
            addCriterionForJDBCDate("start_work in", values, "startWork");
            return (Criteria) this;
        }

        public Criteria andStartWorkNotIn(List<Date> values) {
            addCriterionForJDBCDate("start_work not in", values, "startWork");
            return (Criteria) this;
        }

        public Criteria andStartWorkBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("start_work between", value1, value2, "startWork");
            return (Criteria) this;
        }

        public Criteria andStartWorkNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("start_work not between", value1, value2, "startWork");
            return (Criteria) this;
        }

        public Criteria andNumberIsNull() {
            addCriterion("number is null");
            return (Criteria) this;
        }

        public Criteria andNumberIsNotNull() {
            addCriterion("number is not null");
            return (Criteria) this;
        }

        public Criteria andNumberEqualTo(Integer value) {
            addCriterion("number =", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberNotEqualTo(Integer value) {
            addCriterion("number <>", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberGreaterThan(Integer value) {
            addCriterion("number >", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("number >=", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberLessThan(Integer value) {
            addCriterion("number <", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberLessThanOrEqualTo(Integer value) {
            addCriterion("number <=", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberIn(List<Integer> values) {
            addCriterion("number in", values, "number");
            return (Criteria) this;
        }

        public Criteria andNumberNotIn(List<Integer> values) {
            addCriterion("number not in", values, "number");
            return (Criteria) this;
        }

        public Criteria andNumberBetween(Integer value1, Integer value2) {
            addCriterion("number between", value1, value2, "number");
            return (Criteria) this;
        }

        public Criteria andNumberNotBetween(Integer value1, Integer value2) {
            addCriterion("number not between", value1, value2, "number");
            return (Criteria) this;
        }

        public Criteria andAddressIsNull() {
            addCriterion("address is null");
            return (Criteria) this;
        }

        public Criteria andAddressIsNotNull() {
            addCriterion("address is not null");
            return (Criteria) this;
        }

        public Criteria andAddressEqualTo(String value) {
            addCriterion("address =", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotEqualTo(String value) {
            addCriterion("address <>", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThan(String value) {
            addCriterion("address >", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThanOrEqualTo(String value) {
            addCriterion("address >=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThan(String value) {
            addCriterion("address <", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThanOrEqualTo(String value) {
            addCriterion("address <=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLike(String value) {
            addCriterion("address like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotLike(String value) {
            addCriterion("address not like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressIn(List<String> values) {
            addCriterion("address in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotIn(List<String> values) {
            addCriterion("address not in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressBetween(String value1, String value2) {
            addCriterion("address between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotBetween(String value1, String value2) {
            addCriterion("address not between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenseUrlIsNull() {
            addCriterion("business_license_url is null");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenseUrlIsNotNull() {
            addCriterion("business_license_url is not null");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenseUrlEqualTo(String value) {
            addCriterion("business_license_url =", value, "businessLicenseUrl");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenseUrlNotEqualTo(String value) {
            addCriterion("business_license_url <>", value, "businessLicenseUrl");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenseUrlGreaterThan(String value) {
            addCriterion("business_license_url >", value, "businessLicenseUrl");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenseUrlGreaterThanOrEqualTo(String value) {
            addCriterion("business_license_url >=", value, "businessLicenseUrl");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenseUrlLessThan(String value) {
            addCriterion("business_license_url <", value, "businessLicenseUrl");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenseUrlLessThanOrEqualTo(String value) {
            addCriterion("business_license_url <=", value, "businessLicenseUrl");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenseUrlLike(String value) {
            addCriterion("business_license_url like", value, "businessLicenseUrl");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenseUrlNotLike(String value) {
            addCriterion("business_license_url not like", value, "businessLicenseUrl");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenseUrlIn(List<String> values) {
            addCriterion("business_license_url in", values, "businessLicenseUrl");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenseUrlNotIn(List<String> values) {
            addCriterion("business_license_url not in", values, "businessLicenseUrl");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenseUrlBetween(String value1, String value2) {
            addCriterion("business_license_url between", value1, value2, "businessLicenseUrl");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenseUrlNotBetween(String value1, String value2) {
            addCriterion("business_license_url not between", value1, value2, "businessLicenseUrl");
            return (Criteria) this;
        }

        public Criteria andAgentBrandIsNull() {
            addCriterion("agent_brand is null");
            return (Criteria) this;
        }

        public Criteria andAgentBrandIsNotNull() {
            addCriterion("agent_brand is not null");
            return (Criteria) this;
        }

        public Criteria andAgentBrandEqualTo(String value) {
            addCriterion("agent_brand =", value, "agentBrand");
            return (Criteria) this;
        }

        public Criteria andAgentBrandNotEqualTo(String value) {
            addCriterion("agent_brand <>", value, "agentBrand");
            return (Criteria) this;
        }

        public Criteria andAgentBrandGreaterThan(String value) {
            addCriterion("agent_brand >", value, "agentBrand");
            return (Criteria) this;
        }

        public Criteria andAgentBrandGreaterThanOrEqualTo(String value) {
            addCriterion("agent_brand >=", value, "agentBrand");
            return (Criteria) this;
        }

        public Criteria andAgentBrandLessThan(String value) {
            addCriterion("agent_brand <", value, "agentBrand");
            return (Criteria) this;
        }

        public Criteria andAgentBrandLessThanOrEqualTo(String value) {
            addCriterion("agent_brand <=", value, "agentBrand");
            return (Criteria) this;
        }

        public Criteria andAgentBrandLike(String value) {
            addCriterion("agent_brand like", value, "agentBrand");
            return (Criteria) this;
        }

        public Criteria andAgentBrandNotLike(String value) {
            addCriterion("agent_brand not like", value, "agentBrand");
            return (Criteria) this;
        }

        public Criteria andAgentBrandIn(List<String> values) {
            addCriterion("agent_brand in", values, "agentBrand");
            return (Criteria) this;
        }

        public Criteria andAgentBrandNotIn(List<String> values) {
            addCriterion("agent_brand not in", values, "agentBrand");
            return (Criteria) this;
        }

        public Criteria andAgentBrandBetween(String value1, String value2) {
            addCriterion("agent_brand between", value1, value2, "agentBrand");
            return (Criteria) this;
        }

        public Criteria andAgentBrandNotBetween(String value1, String value2) {
            addCriterion("agent_brand not between", value1, value2, "agentBrand");
            return (Criteria) this;
        }

        public Criteria andQualiUploadUrlIsNull() {
            addCriterion("quali_upload_url is null");
            return (Criteria) this;
        }

        public Criteria andQualiUploadUrlIsNotNull() {
            addCriterion("quali_upload_url is not null");
            return (Criteria) this;
        }

        public Criteria andQualiUploadUrlEqualTo(String value) {
            addCriterion("quali_upload_url =", value, "qualiUploadUrl");
            return (Criteria) this;
        }

        public Criteria andQualiUploadUrlNotEqualTo(String value) {
            addCriterion("quali_upload_url <>", value, "qualiUploadUrl");
            return (Criteria) this;
        }

        public Criteria andQualiUploadUrlGreaterThan(String value) {
            addCriterion("quali_upload_url >", value, "qualiUploadUrl");
            return (Criteria) this;
        }

        public Criteria andQualiUploadUrlGreaterThanOrEqualTo(String value) {
            addCriterion("quali_upload_url >=", value, "qualiUploadUrl");
            return (Criteria) this;
        }

        public Criteria andQualiUploadUrlLessThan(String value) {
            addCriterion("quali_upload_url <", value, "qualiUploadUrl");
            return (Criteria) this;
        }

        public Criteria andQualiUploadUrlLessThanOrEqualTo(String value) {
            addCriterion("quali_upload_url <=", value, "qualiUploadUrl");
            return (Criteria) this;
        }

        public Criteria andQualiUploadUrlLike(String value) {
            addCriterion("quali_upload_url like", value, "qualiUploadUrl");
            return (Criteria) this;
        }

        public Criteria andQualiUploadUrlNotLike(String value) {
            addCriterion("quali_upload_url not like", value, "qualiUploadUrl");
            return (Criteria) this;
        }

        public Criteria andQualiUploadUrlIn(List<String> values) {
            addCriterion("quali_upload_url in", values, "qualiUploadUrl");
            return (Criteria) this;
        }

        public Criteria andQualiUploadUrlNotIn(List<String> values) {
            addCriterion("quali_upload_url not in", values, "qualiUploadUrl");
            return (Criteria) this;
        }

        public Criteria andQualiUploadUrlBetween(String value1, String value2) {
            addCriterion("quali_upload_url between", value1, value2, "qualiUploadUrl");
            return (Criteria) this;
        }

        public Criteria andQualiUploadUrlNotBetween(String value1, String value2) {
            addCriterion("quali_upload_url not between", value1, value2, "qualiUploadUrl");
            return (Criteria) this;
        }

        public Criteria andCarPicUrlIsNull() {
            addCriterion("car_pic_url is null");
            return (Criteria) this;
        }

        public Criteria andCarPicUrlIsNotNull() {
            addCriterion("car_pic_url is not null");
            return (Criteria) this;
        }

        public Criteria andCarPicUrlEqualTo(String value) {
            addCriterion("car_pic_url =", value, "carPicUrl");
            return (Criteria) this;
        }

        public Criteria andCarPicUrlNotEqualTo(String value) {
            addCriterion("car_pic_url <>", value, "carPicUrl");
            return (Criteria) this;
        }

        public Criteria andCarPicUrlGreaterThan(String value) {
            addCriterion("car_pic_url >", value, "carPicUrl");
            return (Criteria) this;
        }

        public Criteria andCarPicUrlGreaterThanOrEqualTo(String value) {
            addCriterion("car_pic_url >=", value, "carPicUrl");
            return (Criteria) this;
        }

        public Criteria andCarPicUrlLessThan(String value) {
            addCriterion("car_pic_url <", value, "carPicUrl");
            return (Criteria) this;
        }

        public Criteria andCarPicUrlLessThanOrEqualTo(String value) {
            addCriterion("car_pic_url <=", value, "carPicUrl");
            return (Criteria) this;
        }

        public Criteria andCarPicUrlLike(String value) {
            addCriterion("car_pic_url like", value, "carPicUrl");
            return (Criteria) this;
        }

        public Criteria andCarPicUrlNotLike(String value) {
            addCriterion("car_pic_url not like", value, "carPicUrl");
            return (Criteria) this;
        }

        public Criteria andCarPicUrlIn(List<String> values) {
            addCriterion("car_pic_url in", values, "carPicUrl");
            return (Criteria) this;
        }

        public Criteria andCarPicUrlNotIn(List<String> values) {
            addCriterion("car_pic_url not in", values, "carPicUrl");
            return (Criteria) this;
        }

        public Criteria andCarPicUrlBetween(String value1, String value2) {
            addCriterion("car_pic_url between", value1, value2, "carPicUrl");
            return (Criteria) this;
        }

        public Criteria andCarPicUrlNotBetween(String value1, String value2) {
            addCriterion("car_pic_url not between", value1, value2, "carPicUrl");
            return (Criteria) this;
        }

        public Criteria andMinePicUrlIsNull() {
            addCriterion("mine_pic_url is null");
            return (Criteria) this;
        }

        public Criteria andMinePicUrlIsNotNull() {
            addCriterion("mine_pic_url is not null");
            return (Criteria) this;
        }

        public Criteria andMinePicUrlEqualTo(String value) {
            addCriterion("mine_pic_url =", value, "minePicUrl");
            return (Criteria) this;
        }

        public Criteria andMinePicUrlNotEqualTo(String value) {
            addCriterion("mine_pic_url <>", value, "minePicUrl");
            return (Criteria) this;
        }

        public Criteria andMinePicUrlGreaterThan(String value) {
            addCriterion("mine_pic_url >", value, "minePicUrl");
            return (Criteria) this;
        }

        public Criteria andMinePicUrlGreaterThanOrEqualTo(String value) {
            addCriterion("mine_pic_url >=", value, "minePicUrl");
            return (Criteria) this;
        }

        public Criteria andMinePicUrlLessThan(String value) {
            addCriterion("mine_pic_url <", value, "minePicUrl");
            return (Criteria) this;
        }

        public Criteria andMinePicUrlLessThanOrEqualTo(String value) {
            addCriterion("mine_pic_url <=", value, "minePicUrl");
            return (Criteria) this;
        }

        public Criteria andMinePicUrlLike(String value) {
            addCriterion("mine_pic_url like", value, "minePicUrl");
            return (Criteria) this;
        }

        public Criteria andMinePicUrlNotLike(String value) {
            addCriterion("mine_pic_url not like", value, "minePicUrl");
            return (Criteria) this;
        }

        public Criteria andMinePicUrlIn(List<String> values) {
            addCriterion("mine_pic_url in", values, "minePicUrl");
            return (Criteria) this;
        }

        public Criteria andMinePicUrlNotIn(List<String> values) {
            addCriterion("mine_pic_url not in", values, "minePicUrl");
            return (Criteria) this;
        }

        public Criteria andMinePicUrlBetween(String value1, String value2) {
            addCriterion("mine_pic_url between", value1, value2, "minePicUrl");
            return (Criteria) this;
        }

        public Criteria andMinePicUrlNotBetween(String value1, String value2) {
            addCriterion("mine_pic_url not between", value1, value2, "minePicUrl");
            return (Criteria) this;
        }

        public Criteria andNumPlayerIsNull() {
            addCriterion("num_player is null");
            return (Criteria) this;
        }

        public Criteria andNumPlayerIsNotNull() {
            addCriterion("num_player is not null");
            return (Criteria) this;
        }

        public Criteria andNumPlayerEqualTo(Integer value) {
            addCriterion("num_player =", value, "numPlayer");
            return (Criteria) this;
        }

        public Criteria andNumPlayerNotEqualTo(Integer value) {
            addCriterion("num_player <>", value, "numPlayer");
            return (Criteria) this;
        }

        public Criteria andNumPlayerGreaterThan(Integer value) {
            addCriterion("num_player >", value, "numPlayer");
            return (Criteria) this;
        }

        public Criteria andNumPlayerGreaterThanOrEqualTo(Integer value) {
            addCriterion("num_player >=", value, "numPlayer");
            return (Criteria) this;
        }

        public Criteria andNumPlayerLessThan(Integer value) {
            addCriterion("num_player <", value, "numPlayer");
            return (Criteria) this;
        }

        public Criteria andNumPlayerLessThanOrEqualTo(Integer value) {
            addCriterion("num_player <=", value, "numPlayer");
            return (Criteria) this;
        }

        public Criteria andNumPlayerIn(List<Integer> values) {
            addCriterion("num_player in", values, "numPlayer");
            return (Criteria) this;
        }

        public Criteria andNumPlayerNotIn(List<Integer> values) {
            addCriterion("num_player not in", values, "numPlayer");
            return (Criteria) this;
        }

        public Criteria andNumPlayerBetween(Integer value1, Integer value2) {
            addCriterion("num_player between", value1, value2, "numPlayer");
            return (Criteria) this;
        }

        public Criteria andNumPlayerNotBetween(Integer value1, Integer value2) {
            addCriterion("num_player not between", value1, value2, "numPlayer");
            return (Criteria) this;
        }

        public Criteria andDockingFinanceIsNull() {
            addCriterion("docking_finance is null");
            return (Criteria) this;
        }

        public Criteria andDockingFinanceIsNotNull() {
            addCriterion("docking_finance is not null");
            return (Criteria) this;
        }

        public Criteria andDockingFinanceEqualTo(String value) {
            addCriterion("docking_finance =", value, "dockingFinance");
            return (Criteria) this;
        }

        public Criteria andDockingFinanceNotEqualTo(String value) {
            addCriterion("docking_finance <>", value, "dockingFinance");
            return (Criteria) this;
        }

        public Criteria andDockingFinanceGreaterThan(String value) {
            addCriterion("docking_finance >", value, "dockingFinance");
            return (Criteria) this;
        }

        public Criteria andDockingFinanceGreaterThanOrEqualTo(String value) {
            addCriterion("docking_finance >=", value, "dockingFinance");
            return (Criteria) this;
        }

        public Criteria andDockingFinanceLessThan(String value) {
            addCriterion("docking_finance <", value, "dockingFinance");
            return (Criteria) this;
        }

        public Criteria andDockingFinanceLessThanOrEqualTo(String value) {
            addCriterion("docking_finance <=", value, "dockingFinance");
            return (Criteria) this;
        }

        public Criteria andDockingFinanceLike(String value) {
            addCriterion("docking_finance like", value, "dockingFinance");
            return (Criteria) this;
        }

        public Criteria andDockingFinanceNotLike(String value) {
            addCriterion("docking_finance not like", value, "dockingFinance");
            return (Criteria) this;
        }

        public Criteria andDockingFinanceIn(List<String> values) {
            addCriterion("docking_finance in", values, "dockingFinance");
            return (Criteria) this;
        }

        public Criteria andDockingFinanceNotIn(List<String> values) {
            addCriterion("docking_finance not in", values, "dockingFinance");
            return (Criteria) this;
        }

        public Criteria andDockingFinanceBetween(String value1, String value2) {
            addCriterion("docking_finance between", value1, value2, "dockingFinance");
            return (Criteria) this;
        }

        public Criteria andDockingFinanceNotBetween(String value1, String value2) {
            addCriterion("docking_finance not between", value1, value2, "dockingFinance");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
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