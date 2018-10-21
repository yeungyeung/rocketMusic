package cn.xhfc.rocketmusic.entity;

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

        public Criteria andUIdIsNull() {
            addCriterion("u_id is null");
            return (Criteria) this;
        }

        public Criteria andUIdIsNotNull() {
            addCriterion("u_id is not null");
            return (Criteria) this;
        }

        public Criteria andUIdEqualTo(Integer value) {
            addCriterion("u_id =", value, "uId");
            return (Criteria) this;
        }

        public Criteria andUIdNotEqualTo(Integer value) {
            addCriterion("u_id <>", value, "uId");
            return (Criteria) this;
        }

        public Criteria andUIdGreaterThan(Integer value) {
            addCriterion("u_id >", value, "uId");
            return (Criteria) this;
        }

        public Criteria andUIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("u_id >=", value, "uId");
            return (Criteria) this;
        }

        public Criteria andUIdLessThan(Integer value) {
            addCriterion("u_id <", value, "uId");
            return (Criteria) this;
        }

        public Criteria andUIdLessThanOrEqualTo(Integer value) {
            addCriterion("u_id <=", value, "uId");
            return (Criteria) this;
        }

        public Criteria andUIdIn(List<Integer> values) {
            addCriterion("u_id in", values, "uId");
            return (Criteria) this;
        }

        public Criteria andUIdNotIn(List<Integer> values) {
            addCriterion("u_id not in", values, "uId");
            return (Criteria) this;
        }

        public Criteria andUIdBetween(Integer value1, Integer value2) {
            addCriterion("u_id between", value1, value2, "uId");
            return (Criteria) this;
        }

        public Criteria andUIdNotBetween(Integer value1, Integer value2) {
            addCriterion("u_id not between", value1, value2, "uId");
            return (Criteria) this;
        }

        public Criteria andUNameIsNull() {
            addCriterion("u_name is null");
            return (Criteria) this;
        }

        public Criteria andUNameIsNotNull() {
            addCriterion("u_name is not null");
            return (Criteria) this;
        }

        public Criteria andUNameEqualTo(String value) {
            addCriterion("u_name =", value, "uName");
            return (Criteria) this;
        }

        public Criteria andUNameNotEqualTo(String value) {
            addCriterion("u_name <>", value, "uName");
            return (Criteria) this;
        }

        public Criteria andUNameGreaterThan(String value) {
            addCriterion("u_name >", value, "uName");
            return (Criteria) this;
        }

        public Criteria andUNameGreaterThanOrEqualTo(String value) {
            addCriterion("u_name >=", value, "uName");
            return (Criteria) this;
        }

        public Criteria andUNameLessThan(String value) {
            addCriterion("u_name <", value, "uName");
            return (Criteria) this;
        }

        public Criteria andUNameLessThanOrEqualTo(String value) {
            addCriterion("u_name <=", value, "uName");
            return (Criteria) this;
        }

        public Criteria andUNameLike(String value) {
            addCriterion("u_name like", value, "uName");
            return (Criteria) this;
        }

        public Criteria andUNameNotLike(String value) {
            addCriterion("u_name not like", value, "uName");
            return (Criteria) this;
        }

        public Criteria andUNameIn(List<String> values) {
            addCriterion("u_name in", values, "uName");
            return (Criteria) this;
        }

        public Criteria andUNameNotIn(List<String> values) {
            addCriterion("u_name not in", values, "uName");
            return (Criteria) this;
        }

        public Criteria andUNameBetween(String value1, String value2) {
            addCriterion("u_name between", value1, value2, "uName");
            return (Criteria) this;
        }

        public Criteria andUNameNotBetween(String value1, String value2) {
            addCriterion("u_name not between", value1, value2, "uName");
            return (Criteria) this;
        }

        public Criteria andUPwdIsNull() {
            addCriterion("u_pwd is null");
            return (Criteria) this;
        }

        public Criteria andUPwdIsNotNull() {
            addCriterion("u_pwd is not null");
            return (Criteria) this;
        }

        public Criteria andUPwdEqualTo(String value) {
            addCriterion("u_pwd =", value, "uPwd");
            return (Criteria) this;
        }

        public Criteria andUPwdNotEqualTo(String value) {
            addCriterion("u_pwd <>", value, "uPwd");
            return (Criteria) this;
        }

        public Criteria andUPwdGreaterThan(String value) {
            addCriterion("u_pwd >", value, "uPwd");
            return (Criteria) this;
        }

        public Criteria andUPwdGreaterThanOrEqualTo(String value) {
            addCriterion("u_pwd >=", value, "uPwd");
            return (Criteria) this;
        }

        public Criteria andUPwdLessThan(String value) {
            addCriterion("u_pwd <", value, "uPwd");
            return (Criteria) this;
        }

        public Criteria andUPwdLessThanOrEqualTo(String value) {
            addCriterion("u_pwd <=", value, "uPwd");
            return (Criteria) this;
        }

        public Criteria andUPwdLike(String value) {
            addCriterion("u_pwd like", value, "uPwd");
            return (Criteria) this;
        }

        public Criteria andUPwdNotLike(String value) {
            addCriterion("u_pwd not like", value, "uPwd");
            return (Criteria) this;
        }

        public Criteria andUPwdIn(List<String> values) {
            addCriterion("u_pwd in", values, "uPwd");
            return (Criteria) this;
        }

        public Criteria andUPwdNotIn(List<String> values) {
            addCriterion("u_pwd not in", values, "uPwd");
            return (Criteria) this;
        }

        public Criteria andUPwdBetween(String value1, String value2) {
            addCriterion("u_pwd between", value1, value2, "uPwd");
            return (Criteria) this;
        }

        public Criteria andUPwdNotBetween(String value1, String value2) {
            addCriterion("u_pwd not between", value1, value2, "uPwd");
            return (Criteria) this;
        }

        public Criteria andUBirthIsNull() {
            addCriterion("u_birth is null");
            return (Criteria) this;
        }

        public Criteria andUBirthIsNotNull() {
            addCriterion("u_birth is not null");
            return (Criteria) this;
        }

        public Criteria andUBirthEqualTo(Date value) {
            addCriterionForJDBCDate("u_birth =", value, "uBirth");
            return (Criteria) this;
        }

        public Criteria andUBirthNotEqualTo(Date value) {
            addCriterionForJDBCDate("u_birth <>", value, "uBirth");
            return (Criteria) this;
        }

        public Criteria andUBirthGreaterThan(Date value) {
            addCriterionForJDBCDate("u_birth >", value, "uBirth");
            return (Criteria) this;
        }

        public Criteria andUBirthGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("u_birth >=", value, "uBirth");
            return (Criteria) this;
        }

        public Criteria andUBirthLessThan(Date value) {
            addCriterionForJDBCDate("u_birth <", value, "uBirth");
            return (Criteria) this;
        }

        public Criteria andUBirthLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("u_birth <=", value, "uBirth");
            return (Criteria) this;
        }

        public Criteria andUBirthIn(List<Date> values) {
            addCriterionForJDBCDate("u_birth in", values, "uBirth");
            return (Criteria) this;
        }

        public Criteria andUBirthNotIn(List<Date> values) {
            addCriterionForJDBCDate("u_birth not in", values, "uBirth");
            return (Criteria) this;
        }

        public Criteria andUBirthBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("u_birth between", value1, value2, "uBirth");
            return (Criteria) this;
        }

        public Criteria andUBirthNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("u_birth not between", value1, value2, "uBirth");
            return (Criteria) this;
        }

        public Criteria andUNumberIsNull() {
            addCriterion("u_number is null");
            return (Criteria) this;
        }

        public Criteria andUNumberIsNotNull() {
            addCriterion("u_number is not null");
            return (Criteria) this;
        }

        public Criteria andUNumberEqualTo(String value) {
            addCriterion("u_number =", value, "uNumber");
            return (Criteria) this;
        }

        public Criteria andUNumberNotEqualTo(String value) {
            addCriterion("u_number <>", value, "uNumber");
            return (Criteria) this;
        }

        public Criteria andUNumberGreaterThan(String value) {
            addCriterion("u_number >", value, "uNumber");
            return (Criteria) this;
        }

        public Criteria andUNumberGreaterThanOrEqualTo(String value) {
            addCriterion("u_number >=", value, "uNumber");
            return (Criteria) this;
        }

        public Criteria andUNumberLessThan(String value) {
            addCriterion("u_number <", value, "uNumber");
            return (Criteria) this;
        }

        public Criteria andUNumberLessThanOrEqualTo(String value) {
            addCriterion("u_number <=", value, "uNumber");
            return (Criteria) this;
        }

        public Criteria andUNumberLike(String value) {
            addCriterion("u_number like", value, "uNumber");
            return (Criteria) this;
        }

        public Criteria andUNumberNotLike(String value) {
            addCriterion("u_number not like", value, "uNumber");
            return (Criteria) this;
        }

        public Criteria andUNumberIn(List<String> values) {
            addCriterion("u_number in", values, "uNumber");
            return (Criteria) this;
        }

        public Criteria andUNumberNotIn(List<String> values) {
            addCriterion("u_number not in", values, "uNumber");
            return (Criteria) this;
        }

        public Criteria andUNumberBetween(String value1, String value2) {
            addCriterion("u_number between", value1, value2, "uNumber");
            return (Criteria) this;
        }

        public Criteria andUNumberNotBetween(String value1, String value2) {
            addCriterion("u_number not between", value1, value2, "uNumber");
            return (Criteria) this;
        }

        public Criteria andUIconIsNull() {
            addCriterion("u_icon is null");
            return (Criteria) this;
        }

        public Criteria andUIconIsNotNull() {
            addCriterion("u_icon is not null");
            return (Criteria) this;
        }

        public Criteria andUIconEqualTo(String value) {
            addCriterion("u_icon =", value, "uIcon");
            return (Criteria) this;
        }

        public Criteria andUIconNotEqualTo(String value) {
            addCriterion("u_icon <>", value, "uIcon");
            return (Criteria) this;
        }

        public Criteria andUIconGreaterThan(String value) {
            addCriterion("u_icon >", value, "uIcon");
            return (Criteria) this;
        }

        public Criteria andUIconGreaterThanOrEqualTo(String value) {
            addCriterion("u_icon >=", value, "uIcon");
            return (Criteria) this;
        }

        public Criteria andUIconLessThan(String value) {
            addCriterion("u_icon <", value, "uIcon");
            return (Criteria) this;
        }

        public Criteria andUIconLessThanOrEqualTo(String value) {
            addCriterion("u_icon <=", value, "uIcon");
            return (Criteria) this;
        }

        public Criteria andUIconLike(String value) {
            addCriterion("u_icon like", value, "uIcon");
            return (Criteria) this;
        }

        public Criteria andUIconNotLike(String value) {
            addCriterion("u_icon not like", value, "uIcon");
            return (Criteria) this;
        }

        public Criteria andUIconIn(List<String> values) {
            addCriterion("u_icon in", values, "uIcon");
            return (Criteria) this;
        }

        public Criteria andUIconNotIn(List<String> values) {
            addCriterion("u_icon not in", values, "uIcon");
            return (Criteria) this;
        }

        public Criteria andUIconBetween(String value1, String value2) {
            addCriterion("u_icon between", value1, value2, "uIcon");
            return (Criteria) this;
        }

        public Criteria andUIconNotBetween(String value1, String value2) {
            addCriterion("u_icon not between", value1, value2, "uIcon");
            return (Criteria) this;
        }

        public Criteria andUSexIsNull() {
            addCriterion("u_sex is null");
            return (Criteria) this;
        }

        public Criteria andUSexIsNotNull() {
            addCriterion("u_sex is not null");
            return (Criteria) this;
        }

        public Criteria andUSexEqualTo(Integer value) {
            addCriterion("u_sex =", value, "uSex");
            return (Criteria) this;
        }

        public Criteria andUSexNotEqualTo(Integer value) {
            addCriterion("u_sex <>", value, "uSex");
            return (Criteria) this;
        }

        public Criteria andUSexGreaterThan(Integer value) {
            addCriterion("u_sex >", value, "uSex");
            return (Criteria) this;
        }

        public Criteria andUSexGreaterThanOrEqualTo(Integer value) {
            addCriterion("u_sex >=", value, "uSex");
            return (Criteria) this;
        }

        public Criteria andUSexLessThan(Integer value) {
            addCriterion("u_sex <", value, "uSex");
            return (Criteria) this;
        }

        public Criteria andUSexLessThanOrEqualTo(Integer value) {
            addCriterion("u_sex <=", value, "uSex");
            return (Criteria) this;
        }

        public Criteria andUSexIn(List<Integer> values) {
            addCriterion("u_sex in", values, "uSex");
            return (Criteria) this;
        }

        public Criteria andUSexNotIn(List<Integer> values) {
            addCriterion("u_sex not in", values, "uSex");
            return (Criteria) this;
        }

        public Criteria andUSexBetween(Integer value1, Integer value2) {
            addCriterion("u_sex between", value1, value2, "uSex");
            return (Criteria) this;
        }

        public Criteria andUSexNotBetween(Integer value1, Integer value2) {
            addCriterion("u_sex not between", value1, value2, "uSex");
            return (Criteria) this;
        }

        public Criteria andUScoreIsNull() {
            addCriterion("u_score is null");
            return (Criteria) this;
        }

        public Criteria andUScoreIsNotNull() {
            addCriterion("u_score is not null");
            return (Criteria) this;
        }

        public Criteria andUScoreEqualTo(Float value) {
            addCriterion("u_score =", value, "uScore");
            return (Criteria) this;
        }

        public Criteria andUScoreNotEqualTo(Float value) {
            addCriterion("u_score <>", value, "uScore");
            return (Criteria) this;
        }

        public Criteria andUScoreGreaterThan(Float value) {
            addCriterion("u_score >", value, "uScore");
            return (Criteria) this;
        }

        public Criteria andUScoreGreaterThanOrEqualTo(Float value) {
            addCriterion("u_score >=", value, "uScore");
            return (Criteria) this;
        }

        public Criteria andUScoreLessThan(Float value) {
            addCriterion("u_score <", value, "uScore");
            return (Criteria) this;
        }

        public Criteria andUScoreLessThanOrEqualTo(Float value) {
            addCriterion("u_score <=", value, "uScore");
            return (Criteria) this;
        }

        public Criteria andUScoreIn(List<Float> values) {
            addCriterion("u_score in", values, "uScore");
            return (Criteria) this;
        }

        public Criteria andUScoreNotIn(List<Float> values) {
            addCriterion("u_score not in", values, "uScore");
            return (Criteria) this;
        }

        public Criteria andUScoreBetween(Float value1, Float value2) {
            addCriterion("u_score between", value1, value2, "uScore");
            return (Criteria) this;
        }

        public Criteria andUScoreNotBetween(Float value1, Float value2) {
            addCriterion("u_score not between", value1, value2, "uScore");
            return (Criteria) this;
        }

        public Criteria andUMoneyIsNull() {
            addCriterion("u_money is null");
            return (Criteria) this;
        }

        public Criteria andUMoneyIsNotNull() {
            addCriterion("u_money is not null");
            return (Criteria) this;
        }

        public Criteria andUMoneyEqualTo(Float value) {
            addCriterion("u_money =", value, "uMoney");
            return (Criteria) this;
        }

        public Criteria andUMoneyNotEqualTo(Float value) {
            addCriterion("u_money <>", value, "uMoney");
            return (Criteria) this;
        }

        public Criteria andUMoneyGreaterThan(Float value) {
            addCriterion("u_money >", value, "uMoney");
            return (Criteria) this;
        }

        public Criteria andUMoneyGreaterThanOrEqualTo(Float value) {
            addCriterion("u_money >=", value, "uMoney");
            return (Criteria) this;
        }

        public Criteria andUMoneyLessThan(Float value) {
            addCriterion("u_money <", value, "uMoney");
            return (Criteria) this;
        }

        public Criteria andUMoneyLessThanOrEqualTo(Float value) {
            addCriterion("u_money <=", value, "uMoney");
            return (Criteria) this;
        }

        public Criteria andUMoneyIn(List<Float> values) {
            addCriterion("u_money in", values, "uMoney");
            return (Criteria) this;
        }

        public Criteria andUMoneyNotIn(List<Float> values) {
            addCriterion("u_money not in", values, "uMoney");
            return (Criteria) this;
        }

        public Criteria andUMoneyBetween(Float value1, Float value2) {
            addCriterion("u_money between", value1, value2, "uMoney");
            return (Criteria) this;
        }

        public Criteria andUMoneyNotBetween(Float value1, Float value2) {
            addCriterion("u_money not between", value1, value2, "uMoney");
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