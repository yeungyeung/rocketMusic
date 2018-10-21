package cn.xhfc.rocketmusic.entity;

import java.util.ArrayList;
import java.util.List;

public class LlistExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public LlistExample() {
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

        public Criteria andLiIdIsNull() {
            addCriterion("li_id is null");
            return (Criteria) this;
        }

        public Criteria andLiIdIsNotNull() {
            addCriterion("li_id is not null");
            return (Criteria) this;
        }

        public Criteria andLiIdEqualTo(Integer value) {
            addCriterion("li_id =", value, "liId");
            return (Criteria) this;
        }

        public Criteria andLiIdNotEqualTo(Integer value) {
            addCriterion("li_id <>", value, "liId");
            return (Criteria) this;
        }

        public Criteria andLiIdGreaterThan(Integer value) {
            addCriterion("li_id >", value, "liId");
            return (Criteria) this;
        }

        public Criteria andLiIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("li_id >=", value, "liId");
            return (Criteria) this;
        }

        public Criteria andLiIdLessThan(Integer value) {
            addCriterion("li_id <", value, "liId");
            return (Criteria) this;
        }

        public Criteria andLiIdLessThanOrEqualTo(Integer value) {
            addCriterion("li_id <=", value, "liId");
            return (Criteria) this;
        }

        public Criteria andLiIdIn(List<Integer> values) {
            addCriterion("li_id in", values, "liId");
            return (Criteria) this;
        }

        public Criteria andLiIdNotIn(List<Integer> values) {
            addCriterion("li_id not in", values, "liId");
            return (Criteria) this;
        }

        public Criteria andLiIdBetween(Integer value1, Integer value2) {
            addCriterion("li_id between", value1, value2, "liId");
            return (Criteria) this;
        }

        public Criteria andLiIdNotBetween(Integer value1, Integer value2) {
            addCriterion("li_id not between", value1, value2, "liId");
            return (Criteria) this;
        }

        public Criteria andLiNameIsNull() {
            addCriterion("li_name is null");
            return (Criteria) this;
        }

        public Criteria andLiNameIsNotNull() {
            addCriterion("li_name is not null");
            return (Criteria) this;
        }

        public Criteria andLiNameEqualTo(String value) {
            addCriterion("li_name =", value, "liName");
            return (Criteria) this;
        }

        public Criteria andLiNameNotEqualTo(String value) {
            addCriterion("li_name <>", value, "liName");
            return (Criteria) this;
        }

        public Criteria andLiNameGreaterThan(String value) {
            addCriterion("li_name >", value, "liName");
            return (Criteria) this;
        }

        public Criteria andLiNameGreaterThanOrEqualTo(String value) {
            addCriterion("li_name >=", value, "liName");
            return (Criteria) this;
        }

        public Criteria andLiNameLessThan(String value) {
            addCriterion("li_name <", value, "liName");
            return (Criteria) this;
        }

        public Criteria andLiNameLessThanOrEqualTo(String value) {
            addCriterion("li_name <=", value, "liName");
            return (Criteria) this;
        }

        public Criteria andLiNameLike(String value) {
            addCriterion("li_name like", value, "liName");
            return (Criteria) this;
        }

        public Criteria andLiNameNotLike(String value) {
            addCriterion("li_name not like", value, "liName");
            return (Criteria) this;
        }

        public Criteria andLiNameIn(List<String> values) {
            addCriterion("li_name in", values, "liName");
            return (Criteria) this;
        }

        public Criteria andLiNameNotIn(List<String> values) {
            addCriterion("li_name not in", values, "liName");
            return (Criteria) this;
        }

        public Criteria andLiNameBetween(String value1, String value2) {
            addCriterion("li_name between", value1, value2, "liName");
            return (Criteria) this;
        }

        public Criteria andLiNameNotBetween(String value1, String value2) {
            addCriterion("li_name not between", value1, value2, "liName");
            return (Criteria) this;
        }

        public Criteria andLiSingerIsNull() {
            addCriterion("li_singer is null");
            return (Criteria) this;
        }

        public Criteria andLiSingerIsNotNull() {
            addCriterion("li_singer is not null");
            return (Criteria) this;
        }

        public Criteria andLiSingerEqualTo(Integer value) {
            addCriterion("li_singer =", value, "liSinger");
            return (Criteria) this;
        }

        public Criteria andLiSingerNotEqualTo(Integer value) {
            addCriterion("li_singer <>", value, "liSinger");
            return (Criteria) this;
        }

        public Criteria andLiSingerGreaterThan(Integer value) {
            addCriterion("li_singer >", value, "liSinger");
            return (Criteria) this;
        }

        public Criteria andLiSingerGreaterThanOrEqualTo(Integer value) {
            addCriterion("li_singer >=", value, "liSinger");
            return (Criteria) this;
        }

        public Criteria andLiSingerLessThan(Integer value) {
            addCriterion("li_singer <", value, "liSinger");
            return (Criteria) this;
        }

        public Criteria andLiSingerLessThanOrEqualTo(Integer value) {
            addCriterion("li_singer <=", value, "liSinger");
            return (Criteria) this;
        }

        public Criteria andLiSingerIn(List<Integer> values) {
            addCriterion("li_singer in", values, "liSinger");
            return (Criteria) this;
        }

        public Criteria andLiSingerNotIn(List<Integer> values) {
            addCriterion("li_singer not in", values, "liSinger");
            return (Criteria) this;
        }

        public Criteria andLiSingerBetween(Integer value1, Integer value2) {
            addCriterion("li_singer between", value1, value2, "liSinger");
            return (Criteria) this;
        }

        public Criteria andLiSingerNotBetween(Integer value1, Integer value2) {
            addCriterion("li_singer not between", value1, value2, "liSinger");
            return (Criteria) this;
        }

        public Criteria andLiPictureIsNull() {
            addCriterion("li_picture is null");
            return (Criteria) this;
        }

        public Criteria andLiPictureIsNotNull() {
            addCriterion("li_picture is not null");
            return (Criteria) this;
        }

        public Criteria andLiPictureEqualTo(String value) {
            addCriterion("li_picture =", value, "liPicture");
            return (Criteria) this;
        }

        public Criteria andLiPictureNotEqualTo(String value) {
            addCriterion("li_picture <>", value, "liPicture");
            return (Criteria) this;
        }

        public Criteria andLiPictureGreaterThan(String value) {
            addCriterion("li_picture >", value, "liPicture");
            return (Criteria) this;
        }

        public Criteria andLiPictureGreaterThanOrEqualTo(String value) {
            addCriterion("li_picture >=", value, "liPicture");
            return (Criteria) this;
        }

        public Criteria andLiPictureLessThan(String value) {
            addCriterion("li_picture <", value, "liPicture");
            return (Criteria) this;
        }

        public Criteria andLiPictureLessThanOrEqualTo(String value) {
            addCriterion("li_picture <=", value, "liPicture");
            return (Criteria) this;
        }

        public Criteria andLiPictureLike(String value) {
            addCriterion("li_picture like", value, "liPicture");
            return (Criteria) this;
        }

        public Criteria andLiPictureNotLike(String value) {
            addCriterion("li_picture not like", value, "liPicture");
            return (Criteria) this;
        }

        public Criteria andLiPictureIn(List<String> values) {
            addCriterion("li_picture in", values, "liPicture");
            return (Criteria) this;
        }

        public Criteria andLiPictureNotIn(List<String> values) {
            addCriterion("li_picture not in", values, "liPicture");
            return (Criteria) this;
        }

        public Criteria andLiPictureBetween(String value1, String value2) {
            addCriterion("li_picture between", value1, value2, "liPicture");
            return (Criteria) this;
        }

        public Criteria andLiPictureNotBetween(String value1, String value2) {
            addCriterion("li_picture not between", value1, value2, "liPicture");
            return (Criteria) this;
        }

        public Criteria andLiInfoIsNull() {
            addCriterion("li_info is null");
            return (Criteria) this;
        }

        public Criteria andLiInfoIsNotNull() {
            addCriterion("li_info is not null");
            return (Criteria) this;
        }

        public Criteria andLiInfoEqualTo(String value) {
            addCriterion("li_info =", value, "liInfo");
            return (Criteria) this;
        }

        public Criteria andLiInfoNotEqualTo(String value) {
            addCriterion("li_info <>", value, "liInfo");
            return (Criteria) this;
        }

        public Criteria andLiInfoGreaterThan(String value) {
            addCriterion("li_info >", value, "liInfo");
            return (Criteria) this;
        }

        public Criteria andLiInfoGreaterThanOrEqualTo(String value) {
            addCriterion("li_info >=", value, "liInfo");
            return (Criteria) this;
        }

        public Criteria andLiInfoLessThan(String value) {
            addCriterion("li_info <", value, "liInfo");
            return (Criteria) this;
        }

        public Criteria andLiInfoLessThanOrEqualTo(String value) {
            addCriterion("li_info <=", value, "liInfo");
            return (Criteria) this;
        }

        public Criteria andLiInfoLike(String value) {
            addCriterion("li_info like", value, "liInfo");
            return (Criteria) this;
        }

        public Criteria andLiInfoNotLike(String value) {
            addCriterion("li_info not like", value, "liInfo");
            return (Criteria) this;
        }

        public Criteria andLiInfoIn(List<String> values) {
            addCriterion("li_info in", values, "liInfo");
            return (Criteria) this;
        }

        public Criteria andLiInfoNotIn(List<String> values) {
            addCriterion("li_info not in", values, "liInfo");
            return (Criteria) this;
        }

        public Criteria andLiInfoBetween(String value1, String value2) {
            addCriterion("li_info between", value1, value2, "liInfo");
            return (Criteria) this;
        }

        public Criteria andLiInfoNotBetween(String value1, String value2) {
            addCriterion("li_info not between", value1, value2, "liInfo");
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