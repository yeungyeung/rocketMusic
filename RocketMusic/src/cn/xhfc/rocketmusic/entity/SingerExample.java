package cn.xhfc.rocketmusic.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class SingerExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SingerExample() {
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

        public Criteria andSIdIsNull() {
            addCriterion("s_id is null");
            return (Criteria) this;
        }

        public Criteria andSIdIsNotNull() {
            addCriterion("s_id is not null");
            return (Criteria) this;
        }

        public Criteria andSIdEqualTo(Integer value) {
            addCriterion("s_id =", value, "sId");
            return (Criteria) this;
        }

        public Criteria andSIdNotEqualTo(Integer value) {
            addCriterion("s_id <>", value, "sId");
            return (Criteria) this;
        }

        public Criteria andSIdGreaterThan(Integer value) {
            addCriterion("s_id >", value, "sId");
            return (Criteria) this;
        }

        public Criteria andSIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("s_id >=", value, "sId");
            return (Criteria) this;
        }

        public Criteria andSIdLessThan(Integer value) {
            addCriterion("s_id <", value, "sId");
            return (Criteria) this;
        }

        public Criteria andSIdLessThanOrEqualTo(Integer value) {
            addCriterion("s_id <=", value, "sId");
            return (Criteria) this;
        }

        public Criteria andSIdIn(List<Integer> values) {
            addCriterion("s_id in", values, "sId");
            return (Criteria) this;
        }

        public Criteria andSIdNotIn(List<Integer> values) {
            addCriterion("s_id not in", values, "sId");
            return (Criteria) this;
        }

        public Criteria andSIdBetween(Integer value1, Integer value2) {
            addCriterion("s_id between", value1, value2, "sId");
            return (Criteria) this;
        }

        public Criteria andSIdNotBetween(Integer value1, Integer value2) {
            addCriterion("s_id not between", value1, value2, "sId");
            return (Criteria) this;
        }

        public Criteria andSNameIsNull() {
            addCriterion("s_name is null");
            return (Criteria) this;
        }

        public Criteria andSNameIsNotNull() {
            addCriterion("s_name is not null");
            return (Criteria) this;
        }

        public Criteria andSNameEqualTo(String value) {
            addCriterion("s_name =", value, "sName");
            return (Criteria) this;
        }

        public Criteria andSNameNotEqualTo(String value) {
            addCriterion("s_name <>", value, "sName");
            return (Criteria) this;
        }

        public Criteria andSNameGreaterThan(String value) {
            addCriterion("s_name >", value, "sName");
            return (Criteria) this;
        }

        public Criteria andSNameGreaterThanOrEqualTo(String value) {
            addCriterion("s_name >=", value, "sName");
            return (Criteria) this;
        }

        public Criteria andSNameLessThan(String value) {
            addCriterion("s_name <", value, "sName");
            return (Criteria) this;
        }

        public Criteria andSNameLessThanOrEqualTo(String value) {
            addCriterion("s_name <=", value, "sName");
            return (Criteria) this;
        }

        public Criteria andSNameLike(String value) {
            addCriterion("s_name like", value, "sName");
            return (Criteria) this;
        }

        public Criteria andSNameNotLike(String value) {
            addCriterion("s_name not like", value, "sName");
            return (Criteria) this;
        }

        public Criteria andSNameIn(List<String> values) {
            addCriterion("s_name in", values, "sName");
            return (Criteria) this;
        }

        public Criteria andSNameNotIn(List<String> values) {
            addCriterion("s_name not in", values, "sName");
            return (Criteria) this;
        }

        public Criteria andSNameBetween(String value1, String value2) {
            addCriterion("s_name between", value1, value2, "sName");
            return (Criteria) this;
        }

        public Criteria andSNameNotBetween(String value1, String value2) {
            addCriterion("s_name not between", value1, value2, "sName");
            return (Criteria) this;
        }

        public Criteria andSSexIsNull() {
            addCriterion("s_sex is null");
            return (Criteria) this;
        }

        public Criteria andSSexIsNotNull() {
            addCriterion("s_sex is not null");
            return (Criteria) this;
        }

        public Criteria andSSexEqualTo(Integer value) {
            addCriterion("s_sex =", value, "sSex");
            return (Criteria) this;
        }

        public Criteria andSSexNotEqualTo(Integer value) {
            addCriterion("s_sex <>", value, "sSex");
            return (Criteria) this;
        }

        public Criteria andSSexGreaterThan(Integer value) {
            addCriterion("s_sex >", value, "sSex");
            return (Criteria) this;
        }

        public Criteria andSSexGreaterThanOrEqualTo(Integer value) {
            addCriterion("s_sex >=", value, "sSex");
            return (Criteria) this;
        }

        public Criteria andSSexLessThan(Integer value) {
            addCriterion("s_sex <", value, "sSex");
            return (Criteria) this;
        }

        public Criteria andSSexLessThanOrEqualTo(Integer value) {
            addCriterion("s_sex <=", value, "sSex");
            return (Criteria) this;
        }

        public Criteria andSSexIn(List<Integer> values) {
            addCriterion("s_sex in", values, "sSex");
            return (Criteria) this;
        }

        public Criteria andSSexNotIn(List<Integer> values) {
            addCriterion("s_sex not in", values, "sSex");
            return (Criteria) this;
        }

        public Criteria andSSexBetween(Integer value1, Integer value2) {
            addCriterion("s_sex between", value1, value2, "sSex");
            return (Criteria) this;
        }

        public Criteria andSSexNotBetween(Integer value1, Integer value2) {
            addCriterion("s_sex not between", value1, value2, "sSex");
            return (Criteria) this;
        }

        public Criteria andSBirthIsNull() {
            addCriterion("s_birth is null");
            return (Criteria) this;
        }

        public Criteria andSBirthIsNotNull() {
            addCriterion("s_birth is not null");
            return (Criteria) this;
        }

        public Criteria andSBirthEqualTo(Date value) {
            addCriterionForJDBCDate("s_birth =", value, "sBirth");
            return (Criteria) this;
        }

        public Criteria andSBirthNotEqualTo(Date value) {
            addCriterionForJDBCDate("s_birth <>", value, "sBirth");
            return (Criteria) this;
        }

        public Criteria andSBirthGreaterThan(Date value) {
            addCriterionForJDBCDate("s_birth >", value, "sBirth");
            return (Criteria) this;
        }

        public Criteria andSBirthGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("s_birth >=", value, "sBirth");
            return (Criteria) this;
        }

        public Criteria andSBirthLessThan(Date value) {
            addCriterionForJDBCDate("s_birth <", value, "sBirth");
            return (Criteria) this;
        }

        public Criteria andSBirthLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("s_birth <=", value, "sBirth");
            return (Criteria) this;
        }

        public Criteria andSBirthIn(List<Date> values) {
            addCriterionForJDBCDate("s_birth in", values, "sBirth");
            return (Criteria) this;
        }

        public Criteria andSBirthNotIn(List<Date> values) {
            addCriterionForJDBCDate("s_birth not in", values, "sBirth");
            return (Criteria) this;
        }

        public Criteria andSBirthBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("s_birth between", value1, value2, "sBirth");
            return (Criteria) this;
        }

        public Criteria andSBirthNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("s_birth not between", value1, value2, "sBirth");
            return (Criteria) this;
        }

        public Criteria andSNationalityIsNull() {
            addCriterion("s_nationality is null");
            return (Criteria) this;
        }

        public Criteria andSNationalityIsNotNull() {
            addCriterion("s_nationality is not null");
            return (Criteria) this;
        }

        public Criteria andSNationalityEqualTo(String value) {
            addCriterion("s_nationality =", value, "sNationality");
            return (Criteria) this;
        }

        public Criteria andSNationalityNotEqualTo(String value) {
            addCriterion("s_nationality <>", value, "sNationality");
            return (Criteria) this;
        }

        public Criteria andSNationalityGreaterThan(String value) {
            addCriterion("s_nationality >", value, "sNationality");
            return (Criteria) this;
        }

        public Criteria andSNationalityGreaterThanOrEqualTo(String value) {
            addCriterion("s_nationality >=", value, "sNationality");
            return (Criteria) this;
        }

        public Criteria andSNationalityLessThan(String value) {
            addCriterion("s_nationality <", value, "sNationality");
            return (Criteria) this;
        }

        public Criteria andSNationalityLessThanOrEqualTo(String value) {
            addCriterion("s_nationality <=", value, "sNationality");
            return (Criteria) this;
        }

        public Criteria andSNationalityLike(String value) {
            addCriterion("s_nationality like", value, "sNationality");
            return (Criteria) this;
        }

        public Criteria andSNationalityNotLike(String value) {
            addCriterion("s_nationality not like", value, "sNationality");
            return (Criteria) this;
        }

        public Criteria andSNationalityIn(List<String> values) {
            addCriterion("s_nationality in", values, "sNationality");
            return (Criteria) this;
        }

        public Criteria andSNationalityNotIn(List<String> values) {
            addCriterion("s_nationality not in", values, "sNationality");
            return (Criteria) this;
        }

        public Criteria andSNationalityBetween(String value1, String value2) {
            addCriterion("s_nationality between", value1, value2, "sNationality");
            return (Criteria) this;
        }

        public Criteria andSNationalityNotBetween(String value1, String value2) {
            addCriterion("s_nationality not between", value1, value2, "sNationality");
            return (Criteria) this;
        }

        public Criteria andSIconIsNull() {
            addCriterion("s_icon is null");
            return (Criteria) this;
        }

        public Criteria andSIconIsNotNull() {
            addCriterion("s_icon is not null");
            return (Criteria) this;
        }

        public Criteria andSIconEqualTo(String value) {
            addCriterion("s_icon =", value, "sIcon");
            return (Criteria) this;
        }

        public Criteria andSIconNotEqualTo(String value) {
            addCriterion("s_icon <>", value, "sIcon");
            return (Criteria) this;
        }

        public Criteria andSIconGreaterThan(String value) {
            addCriterion("s_icon >", value, "sIcon");
            return (Criteria) this;
        }

        public Criteria andSIconGreaterThanOrEqualTo(String value) {
            addCriterion("s_icon >=", value, "sIcon");
            return (Criteria) this;
        }

        public Criteria andSIconLessThan(String value) {
            addCriterion("s_icon <", value, "sIcon");
            return (Criteria) this;
        }

        public Criteria andSIconLessThanOrEqualTo(String value) {
            addCriterion("s_icon <=", value, "sIcon");
            return (Criteria) this;
        }

        public Criteria andSIconLike(String value) {
            addCriterion("s_icon like", value, "sIcon");
            return (Criteria) this;
        }

        public Criteria andSIconNotLike(String value) {
            addCriterion("s_icon not like", value, "sIcon");
            return (Criteria) this;
        }

        public Criteria andSIconIn(List<String> values) {
            addCriterion("s_icon in", values, "sIcon");
            return (Criteria) this;
        }

        public Criteria andSIconNotIn(List<String> values) {
            addCriterion("s_icon not in", values, "sIcon");
            return (Criteria) this;
        }

        public Criteria andSIconBetween(String value1, String value2) {
            addCriterion("s_icon between", value1, value2, "sIcon");
            return (Criteria) this;
        }

        public Criteria andSIconNotBetween(String value1, String value2) {
            addCriterion("s_icon not between", value1, value2, "sIcon");
            return (Criteria) this;
        }

        public Criteria andSIdcardIsNull() {
            addCriterion("s_idcard is null");
            return (Criteria) this;
        }

        public Criteria andSIdcardIsNotNull() {
            addCriterion("s_idcard is not null");
            return (Criteria) this;
        }

        public Criteria andSIdcardEqualTo(String value) {
            addCriterion("s_idcard =", value, "sIdcard");
            return (Criteria) this;
        }

        public Criteria andSIdcardNotEqualTo(String value) {
            addCriterion("s_idcard <>", value, "sIdcard");
            return (Criteria) this;
        }

        public Criteria andSIdcardGreaterThan(String value) {
            addCriterion("s_idcard >", value, "sIdcard");
            return (Criteria) this;
        }

        public Criteria andSIdcardGreaterThanOrEqualTo(String value) {
            addCriterion("s_idcard >=", value, "sIdcard");
            return (Criteria) this;
        }

        public Criteria andSIdcardLessThan(String value) {
            addCriterion("s_idcard <", value, "sIdcard");
            return (Criteria) this;
        }

        public Criteria andSIdcardLessThanOrEqualTo(String value) {
            addCriterion("s_idcard <=", value, "sIdcard");
            return (Criteria) this;
        }

        public Criteria andSIdcardLike(String value) {
            addCriterion("s_idcard like", value, "sIdcard");
            return (Criteria) this;
        }

        public Criteria andSIdcardNotLike(String value) {
            addCriterion("s_idcard not like", value, "sIdcard");
            return (Criteria) this;
        }

        public Criteria andSIdcardIn(List<String> values) {
            addCriterion("s_idcard in", values, "sIdcard");
            return (Criteria) this;
        }

        public Criteria andSIdcardNotIn(List<String> values) {
            addCriterion("s_idcard not in", values, "sIdcard");
            return (Criteria) this;
        }

        public Criteria andSIdcardBetween(String value1, String value2) {
            addCriterion("s_idcard between", value1, value2, "sIdcard");
            return (Criteria) this;
        }

        public Criteria andSIdcardNotBetween(String value1, String value2) {
            addCriterion("s_idcard not between", value1, value2, "sIdcard");
            return (Criteria) this;
        }

        public Criteria andSInfoIsNull() {
            addCriterion("s_info is null");
            return (Criteria) this;
        }

        public Criteria andSInfoIsNotNull() {
            addCriterion("s_info is not null");
            return (Criteria) this;
        }

        public Criteria andSInfoEqualTo(String value) {
            addCriterion("s_info =", value, "sInfo");
            return (Criteria) this;
        }

        public Criteria andSInfoNotEqualTo(String value) {
            addCriterion("s_info <>", value, "sInfo");
            return (Criteria) this;
        }

        public Criteria andSInfoGreaterThan(String value) {
            addCriterion("s_info >", value, "sInfo");
            return (Criteria) this;
        }

        public Criteria andSInfoGreaterThanOrEqualTo(String value) {
            addCriterion("s_info >=", value, "sInfo");
            return (Criteria) this;
        }

        public Criteria andSInfoLessThan(String value) {
            addCriterion("s_info <", value, "sInfo");
            return (Criteria) this;
        }

        public Criteria andSInfoLessThanOrEqualTo(String value) {
            addCriterion("s_info <=", value, "sInfo");
            return (Criteria) this;
        }

        public Criteria andSInfoLike(String value) {
            addCriterion("s_info like", value, "sInfo");
            return (Criteria) this;
        }

        public Criteria andSInfoNotLike(String value) {
            addCriterion("s_info not like", value, "sInfo");
            return (Criteria) this;
        }

        public Criteria andSInfoIn(List<String> values) {
            addCriterion("s_info in", values, "sInfo");
            return (Criteria) this;
        }

        public Criteria andSInfoNotIn(List<String> values) {
            addCriterion("s_info not in", values, "sInfo");
            return (Criteria) this;
        }

        public Criteria andSInfoBetween(String value1, String value2) {
            addCriterion("s_info between", value1, value2, "sInfo");
            return (Criteria) this;
        }

        public Criteria andSInfoNotBetween(String value1, String value2) {
            addCriterion("s_info not between", value1, value2, "sInfo");
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