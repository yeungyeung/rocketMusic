package cn.xhfc.rocketmusic.entity;

import java.util.ArrayList;
import java.util.List;

public class MvExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MvExample() {
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

        public Criteria andMvIdIsNull() {
            addCriterion("mv_id is null");
            return (Criteria) this;
        }

        public Criteria andMvIdIsNotNull() {
            addCriterion("mv_id is not null");
            return (Criteria) this;
        }

        public Criteria andMvIdEqualTo(Integer value) {
            addCriterion("mv_id =", value, "mvId");
            return (Criteria) this;
        }

        public Criteria andMvIdNotEqualTo(Integer value) {
            addCriterion("mv_id <>", value, "mvId");
            return (Criteria) this;
        }

        public Criteria andMvIdGreaterThan(Integer value) {
            addCriterion("mv_id >", value, "mvId");
            return (Criteria) this;
        }

        public Criteria andMvIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("mv_id >=", value, "mvId");
            return (Criteria) this;
        }

        public Criteria andMvIdLessThan(Integer value) {
            addCriterion("mv_id <", value, "mvId");
            return (Criteria) this;
        }

        public Criteria andMvIdLessThanOrEqualTo(Integer value) {
            addCriterion("mv_id <=", value, "mvId");
            return (Criteria) this;
        }

        public Criteria andMvIdIn(List<Integer> values) {
            addCriterion("mv_id in", values, "mvId");
            return (Criteria) this;
        }

        public Criteria andMvIdNotIn(List<Integer> values) {
            addCriterion("mv_id not in", values, "mvId");
            return (Criteria) this;
        }

        public Criteria andMvIdBetween(Integer value1, Integer value2) {
            addCriterion("mv_id between", value1, value2, "mvId");
            return (Criteria) this;
        }

        public Criteria andMvIdNotBetween(Integer value1, Integer value2) {
            addCriterion("mv_id not between", value1, value2, "mvId");
            return (Criteria) this;
        }

        public Criteria andMvNameIsNull() {
            addCriterion("mv_name is null");
            return (Criteria) this;
        }

        public Criteria andMvNameIsNotNull() {
            addCriterion("mv_name is not null");
            return (Criteria) this;
        }

        public Criteria andMvNameEqualTo(String value) {
            addCriterion("mv_name =", value, "mvName");
            return (Criteria) this;
        }

        public Criteria andMvNameNotEqualTo(String value) {
            addCriterion("mv_name <>", value, "mvName");
            return (Criteria) this;
        }

        public Criteria andMvNameGreaterThan(String value) {
            addCriterion("mv_name >", value, "mvName");
            return (Criteria) this;
        }

        public Criteria andMvNameGreaterThanOrEqualTo(String value) {
            addCriterion("mv_name >=", value, "mvName");
            return (Criteria) this;
        }

        public Criteria andMvNameLessThan(String value) {
            addCriterion("mv_name <", value, "mvName");
            return (Criteria) this;
        }

        public Criteria andMvNameLessThanOrEqualTo(String value) {
            addCriterion("mv_name <=", value, "mvName");
            return (Criteria) this;
        }

        public Criteria andMvNameLike(String value) {
            addCriterion("mv_name like", value, "mvName");
            return (Criteria) this;
        }

        public Criteria andMvNameNotLike(String value) {
            addCriterion("mv_name not like", value, "mvName");
            return (Criteria) this;
        }

        public Criteria andMvNameIn(List<String> values) {
            addCriterion("mv_name in", values, "mvName");
            return (Criteria) this;
        }

        public Criteria andMvNameNotIn(List<String> values) {
            addCriterion("mv_name not in", values, "mvName");
            return (Criteria) this;
        }

        public Criteria andMvNameBetween(String value1, String value2) {
            addCriterion("mv_name between", value1, value2, "mvName");
            return (Criteria) this;
        }

        public Criteria andMvNameNotBetween(String value1, String value2) {
            addCriterion("mv_name not between", value1, value2, "mvName");
            return (Criteria) this;
        }

        public Criteria andMvUrlIsNull() {
            addCriterion("mv_url is null");
            return (Criteria) this;
        }

        public Criteria andMvUrlIsNotNull() {
            addCriterion("mv_url is not null");
            return (Criteria) this;
        }

        public Criteria andMvUrlEqualTo(String value) {
            addCriterion("mv_url =", value, "mvUrl");
            return (Criteria) this;
        }

        public Criteria andMvUrlNotEqualTo(String value) {
            addCriterion("mv_url <>", value, "mvUrl");
            return (Criteria) this;
        }

        public Criteria andMvUrlGreaterThan(String value) {
            addCriterion("mv_url >", value, "mvUrl");
            return (Criteria) this;
        }

        public Criteria andMvUrlGreaterThanOrEqualTo(String value) {
            addCriterion("mv_url >=", value, "mvUrl");
            return (Criteria) this;
        }

        public Criteria andMvUrlLessThan(String value) {
            addCriterion("mv_url <", value, "mvUrl");
            return (Criteria) this;
        }

        public Criteria andMvUrlLessThanOrEqualTo(String value) {
            addCriterion("mv_url <=", value, "mvUrl");
            return (Criteria) this;
        }

        public Criteria andMvUrlLike(String value) {
            addCriterion("mv_url like", value, "mvUrl");
            return (Criteria) this;
        }

        public Criteria andMvUrlNotLike(String value) {
            addCriterion("mv_url not like", value, "mvUrl");
            return (Criteria) this;
        }

        public Criteria andMvUrlIn(List<String> values) {
            addCriterion("mv_url in", values, "mvUrl");
            return (Criteria) this;
        }

        public Criteria andMvUrlNotIn(List<String> values) {
            addCriterion("mv_url not in", values, "mvUrl");
            return (Criteria) this;
        }

        public Criteria andMvUrlBetween(String value1, String value2) {
            addCriterion("mv_url between", value1, value2, "mvUrl");
            return (Criteria) this;
        }

        public Criteria andMvUrlNotBetween(String value1, String value2) {
            addCriterion("mv_url not between", value1, value2, "mvUrl");
            return (Criteria) this;
        }

        public Criteria andMvPictureIsNull() {
            addCriterion("mv_picture is null");
            return (Criteria) this;
        }

        public Criteria andMvPictureIsNotNull() {
            addCriterion("mv_picture is not null");
            return (Criteria) this;
        }

        public Criteria andMvPictureEqualTo(String value) {
            addCriterion("mv_picture =", value, "mvPicture");
            return (Criteria) this;
        }

        public Criteria andMvPictureNotEqualTo(String value) {
            addCriterion("mv_picture <>", value, "mvPicture");
            return (Criteria) this;
        }

        public Criteria andMvPictureGreaterThan(String value) {
            addCriterion("mv_picture >", value, "mvPicture");
            return (Criteria) this;
        }

        public Criteria andMvPictureGreaterThanOrEqualTo(String value) {
            addCriterion("mv_picture >=", value, "mvPicture");
            return (Criteria) this;
        }

        public Criteria andMvPictureLessThan(String value) {
            addCriterion("mv_picture <", value, "mvPicture");
            return (Criteria) this;
        }

        public Criteria andMvPictureLessThanOrEqualTo(String value) {
            addCriterion("mv_picture <=", value, "mvPicture");
            return (Criteria) this;
        }

        public Criteria andMvPictureLike(String value) {
            addCriterion("mv_picture like", value, "mvPicture");
            return (Criteria) this;
        }

        public Criteria andMvPictureNotLike(String value) {
            addCriterion("mv_picture not like", value, "mvPicture");
            return (Criteria) this;
        }

        public Criteria andMvPictureIn(List<String> values) {
            addCriterion("mv_picture in", values, "mvPicture");
            return (Criteria) this;
        }

        public Criteria andMvPictureNotIn(List<String> values) {
            addCriterion("mv_picture not in", values, "mvPicture");
            return (Criteria) this;
        }

        public Criteria andMvPictureBetween(String value1, String value2) {
            addCriterion("mv_picture between", value1, value2, "mvPicture");
            return (Criteria) this;
        }

        public Criteria andMvPictureNotBetween(String value1, String value2) {
            addCriterion("mv_picture not between", value1, value2, "mvPicture");
            return (Criteria) this;
        }

        public Criteria andMvSingerIsNull() {
            addCriterion("mv_singer is null");
            return (Criteria) this;
        }

        public Criteria andMvSingerIsNotNull() {
            addCriterion("mv_singer is not null");
            return (Criteria) this;
        }

        public Criteria andMvSingerEqualTo(Integer value) {
            addCriterion("mv_singer =", value, "mvSinger");
            return (Criteria) this;
        }

        public Criteria andMvSingerNotEqualTo(Integer value) {
            addCriterion("mv_singer <>", value, "mvSinger");
            return (Criteria) this;
        }

        public Criteria andMvSingerGreaterThan(Integer value) {
            addCriterion("mv_singer >", value, "mvSinger");
            return (Criteria) this;
        }

        public Criteria andMvSingerGreaterThanOrEqualTo(Integer value) {
            addCriterion("mv_singer >=", value, "mvSinger");
            return (Criteria) this;
        }

        public Criteria andMvSingerLessThan(Integer value) {
            addCriterion("mv_singer <", value, "mvSinger");
            return (Criteria) this;
        }

        public Criteria andMvSingerLessThanOrEqualTo(Integer value) {
            addCriterion("mv_singer <=", value, "mvSinger");
            return (Criteria) this;
        }

        public Criteria andMvSingerIn(List<Integer> values) {
            addCriterion("mv_singer in", values, "mvSinger");
            return (Criteria) this;
        }

        public Criteria andMvSingerNotIn(List<Integer> values) {
            addCriterion("mv_singer not in", values, "mvSinger");
            return (Criteria) this;
        }

        public Criteria andMvSingerBetween(Integer value1, Integer value2) {
            addCriterion("mv_singer between", value1, value2, "mvSinger");
            return (Criteria) this;
        }

        public Criteria andMvSingerNotBetween(Integer value1, Integer value2) {
            addCriterion("mv_singer not between", value1, value2, "mvSinger");
            return (Criteria) this;
        }

        public Criteria andMvInfoIsNull() {
            addCriterion("mv_info is null");
            return (Criteria) this;
        }

        public Criteria andMvInfoIsNotNull() {
            addCriterion("mv_info is not null");
            return (Criteria) this;
        }

        public Criteria andMvInfoEqualTo(String value) {
            addCriterion("mv_info =", value, "mvInfo");
            return (Criteria) this;
        }

        public Criteria andMvInfoNotEqualTo(String value) {
            addCriterion("mv_info <>", value, "mvInfo");
            return (Criteria) this;
        }

        public Criteria andMvInfoGreaterThan(String value) {
            addCriterion("mv_info >", value, "mvInfo");
            return (Criteria) this;
        }

        public Criteria andMvInfoGreaterThanOrEqualTo(String value) {
            addCriterion("mv_info >=", value, "mvInfo");
            return (Criteria) this;
        }

        public Criteria andMvInfoLessThan(String value) {
            addCriterion("mv_info <", value, "mvInfo");
            return (Criteria) this;
        }

        public Criteria andMvInfoLessThanOrEqualTo(String value) {
            addCriterion("mv_info <=", value, "mvInfo");
            return (Criteria) this;
        }

        public Criteria andMvInfoLike(String value) {
            addCriterion("mv_info like", value, "mvInfo");
            return (Criteria) this;
        }

        public Criteria andMvInfoNotLike(String value) {
            addCriterion("mv_info not like", value, "mvInfo");
            return (Criteria) this;
        }

        public Criteria andMvInfoIn(List<String> values) {
            addCriterion("mv_info in", values, "mvInfo");
            return (Criteria) this;
        }

        public Criteria andMvInfoNotIn(List<String> values) {
            addCriterion("mv_info not in", values, "mvInfo");
            return (Criteria) this;
        }

        public Criteria andMvInfoBetween(String value1, String value2) {
            addCriterion("mv_info between", value1, value2, "mvInfo");
            return (Criteria) this;
        }

        public Criteria andMvInfoNotBetween(String value1, String value2) {
            addCriterion("mv_info not between", value1, value2, "mvInfo");
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