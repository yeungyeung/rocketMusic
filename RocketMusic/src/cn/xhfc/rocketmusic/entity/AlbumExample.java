package cn.xhfc.rocketmusic.entity;

import java.util.ArrayList;
import java.util.List;

public class AlbumExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AlbumExample() {
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

        public Criteria andAlIdIsNull() {
            addCriterion("al_id is null");
            return (Criteria) this;
        }

        public Criteria andAlIdIsNotNull() {
            addCriterion("al_id is not null");
            return (Criteria) this;
        }

        public Criteria andAlIdEqualTo(Integer value) {
            addCriterion("al_id =", value, "alId");
            return (Criteria) this;
        }

        public Criteria andAlIdNotEqualTo(Integer value) {
            addCriterion("al_id <>", value, "alId");
            return (Criteria) this;
        }

        public Criteria andAlIdGreaterThan(Integer value) {
            addCriterion("al_id >", value, "alId");
            return (Criteria) this;
        }

        public Criteria andAlIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("al_id >=", value, "alId");
            return (Criteria) this;
        }

        public Criteria andAlIdLessThan(Integer value) {
            addCriterion("al_id <", value, "alId");
            return (Criteria) this;
        }

        public Criteria andAlIdLessThanOrEqualTo(Integer value) {
            addCriterion("al_id <=", value, "alId");
            return (Criteria) this;
        }

        public Criteria andAlIdIn(List<Integer> values) {
            addCriterion("al_id in", values, "alId");
            return (Criteria) this;
        }

        public Criteria andAlIdNotIn(List<Integer> values) {
            addCriterion("al_id not in", values, "alId");
            return (Criteria) this;
        }

        public Criteria andAlIdBetween(Integer value1, Integer value2) {
            addCriterion("al_id between", value1, value2, "alId");
            return (Criteria) this;
        }

        public Criteria andAlIdNotBetween(Integer value1, Integer value2) {
            addCriterion("al_id not between", value1, value2, "alId");
            return (Criteria) this;
        }

        public Criteria andAlNameIsNull() {
            addCriterion("al_name is null");
            return (Criteria) this;
        }

        public Criteria andAlNameIsNotNull() {
            addCriterion("al_name is not null");
            return (Criteria) this;
        }

        public Criteria andAlNameEqualTo(String value) {
            addCriterion("al_name =", value, "alName");
            return (Criteria) this;
        }

        public Criteria andAlNameNotEqualTo(String value) {
            addCriterion("al_name <>", value, "alName");
            return (Criteria) this;
        }

        public Criteria andAlNameGreaterThan(String value) {
            addCriterion("al_name >", value, "alName");
            return (Criteria) this;
        }

        public Criteria andAlNameGreaterThanOrEqualTo(String value) {
            addCriterion("al_name >=", value, "alName");
            return (Criteria) this;
        }

        public Criteria andAlNameLessThan(String value) {
            addCriterion("al_name <", value, "alName");
            return (Criteria) this;
        }

        public Criteria andAlNameLessThanOrEqualTo(String value) {
            addCriterion("al_name <=", value, "alName");
            return (Criteria) this;
        }

        public Criteria andAlNameLike(String value) {
            addCriterion("al_name like", value, "alName");
            return (Criteria) this;
        }

        public Criteria andAlNameNotLike(String value) {
            addCriterion("al_name not like", value, "alName");
            return (Criteria) this;
        }

        public Criteria andAlNameIn(List<String> values) {
            addCriterion("al_name in", values, "alName");
            return (Criteria) this;
        }

        public Criteria andAlNameNotIn(List<String> values) {
            addCriterion("al_name not in", values, "alName");
            return (Criteria) this;
        }

        public Criteria andAlNameBetween(String value1, String value2) {
            addCriterion("al_name between", value1, value2, "alName");
            return (Criteria) this;
        }

        public Criteria andAlNameNotBetween(String value1, String value2) {
            addCriterion("al_name not between", value1, value2, "alName");
            return (Criteria) this;
        }

        public Criteria andAlSingerIsNull() {
            addCriterion("al_singer is null");
            return (Criteria) this;
        }

        public Criteria andAlSingerIsNotNull() {
            addCriterion("al_singer is not null");
            return (Criteria) this;
        }

        public Criteria andAlSingerEqualTo(Integer value) {
            addCriterion("al_singer =", value, "alSinger");
            return (Criteria) this;
        }

        public Criteria andAlSingerNotEqualTo(Integer value) {
            addCriterion("al_singer <>", value, "alSinger");
            return (Criteria) this;
        }

        public Criteria andAlSingerGreaterThan(Integer value) {
            addCriterion("al_singer >", value, "alSinger");
            return (Criteria) this;
        }

        public Criteria andAlSingerGreaterThanOrEqualTo(Integer value) {
            addCriterion("al_singer >=", value, "alSinger");
            return (Criteria) this;
        }

        public Criteria andAlSingerLessThan(Integer value) {
            addCriterion("al_singer <", value, "alSinger");
            return (Criteria) this;
        }

        public Criteria andAlSingerLessThanOrEqualTo(Integer value) {
            addCriterion("al_singer <=", value, "alSinger");
            return (Criteria) this;
        }

        public Criteria andAlSingerIn(List<Integer> values) {
            addCriterion("al_singer in", values, "alSinger");
            return (Criteria) this;
        }

        public Criteria andAlSingerNotIn(List<Integer> values) {
            addCriterion("al_singer not in", values, "alSinger");
            return (Criteria) this;
        }

        public Criteria andAlSingerBetween(Integer value1, Integer value2) {
            addCriterion("al_singer between", value1, value2, "alSinger");
            return (Criteria) this;
        }

        public Criteria andAlSingerNotBetween(Integer value1, Integer value2) {
            addCriterion("al_singer not between", value1, value2, "alSinger");
            return (Criteria) this;
        }

        public Criteria andAlPriceIsNull() {
            addCriterion("al_price is null");
            return (Criteria) this;
        }

        public Criteria andAlPriceIsNotNull() {
            addCriterion("al_price is not null");
            return (Criteria) this;
        }

        public Criteria andAlPriceEqualTo(Float value) {
            addCriterion("al_price =", value, "alPrice");
            return (Criteria) this;
        }

        public Criteria andAlPriceNotEqualTo(Float value) {
            addCriterion("al_price <>", value, "alPrice");
            return (Criteria) this;
        }

        public Criteria andAlPriceGreaterThan(Float value) {
            addCriterion("al_price >", value, "alPrice");
            return (Criteria) this;
        }

        public Criteria andAlPriceGreaterThanOrEqualTo(Float value) {
            addCriterion("al_price >=", value, "alPrice");
            return (Criteria) this;
        }

        public Criteria andAlPriceLessThan(Float value) {
            addCriterion("al_price <", value, "alPrice");
            return (Criteria) this;
        }

        public Criteria andAlPriceLessThanOrEqualTo(Float value) {
            addCriterion("al_price <=", value, "alPrice");
            return (Criteria) this;
        }

        public Criteria andAlPriceIn(List<Float> values) {
            addCriterion("al_price in", values, "alPrice");
            return (Criteria) this;
        }

        public Criteria andAlPriceNotIn(List<Float> values) {
            addCriterion("al_price not in", values, "alPrice");
            return (Criteria) this;
        }

        public Criteria andAlPriceBetween(Float value1, Float value2) {
            addCriterion("al_price between", value1, value2, "alPrice");
            return (Criteria) this;
        }

        public Criteria andAlPriceNotBetween(Float value1, Float value2) {
            addCriterion("al_price not between", value1, value2, "alPrice");
            return (Criteria) this;
        }

        public Criteria andAlPictureIsNull() {
            addCriterion("al_picture is null");
            return (Criteria) this;
        }

        public Criteria andAlPictureIsNotNull() {
            addCriterion("al_picture is not null");
            return (Criteria) this;
        }

        public Criteria andAlPictureEqualTo(String value) {
            addCriterion("al_picture =", value, "alPicture");
            return (Criteria) this;
        }

        public Criteria andAlPictureNotEqualTo(String value) {
            addCriterion("al_picture <>", value, "alPicture");
            return (Criteria) this;
        }

        public Criteria andAlPictureGreaterThan(String value) {
            addCriterion("al_picture >", value, "alPicture");
            return (Criteria) this;
        }

        public Criteria andAlPictureGreaterThanOrEqualTo(String value) {
            addCriterion("al_picture >=", value, "alPicture");
            return (Criteria) this;
        }

        public Criteria andAlPictureLessThan(String value) {
            addCriterion("al_picture <", value, "alPicture");
            return (Criteria) this;
        }

        public Criteria andAlPictureLessThanOrEqualTo(String value) {
            addCriterion("al_picture <=", value, "alPicture");
            return (Criteria) this;
        }

        public Criteria andAlPictureLike(String value) {
            addCriterion("al_picture like", value, "alPicture");
            return (Criteria) this;
        }

        public Criteria andAlPictureNotLike(String value) {
            addCriterion("al_picture not like", value, "alPicture");
            return (Criteria) this;
        }

        public Criteria andAlPictureIn(List<String> values) {
            addCriterion("al_picture in", values, "alPicture");
            return (Criteria) this;
        }

        public Criteria andAlPictureNotIn(List<String> values) {
            addCriterion("al_picture not in", values, "alPicture");
            return (Criteria) this;
        }

        public Criteria andAlPictureBetween(String value1, String value2) {
            addCriterion("al_picture between", value1, value2, "alPicture");
            return (Criteria) this;
        }

        public Criteria andAlPictureNotBetween(String value1, String value2) {
            addCriterion("al_picture not between", value1, value2, "alPicture");
            return (Criteria) this;
        }

        public Criteria andAlInfoIsNull() {
            addCriterion("al_info is null");
            return (Criteria) this;
        }

        public Criteria andAlInfoIsNotNull() {
            addCriterion("al_info is not null");
            return (Criteria) this;
        }

        public Criteria andAlInfoEqualTo(String value) {
            addCriterion("al_info =", value, "alInfo");
            return (Criteria) this;
        }

        public Criteria andAlInfoNotEqualTo(String value) {
            addCriterion("al_info <>", value, "alInfo");
            return (Criteria) this;
        }

        public Criteria andAlInfoGreaterThan(String value) {
            addCriterion("al_info >", value, "alInfo");
            return (Criteria) this;
        }

        public Criteria andAlInfoGreaterThanOrEqualTo(String value) {
            addCriterion("al_info >=", value, "alInfo");
            return (Criteria) this;
        }

        public Criteria andAlInfoLessThan(String value) {
            addCriterion("al_info <", value, "alInfo");
            return (Criteria) this;
        }

        public Criteria andAlInfoLessThanOrEqualTo(String value) {
            addCriterion("al_info <=", value, "alInfo");
            return (Criteria) this;
        }

        public Criteria andAlInfoLike(String value) {
            addCriterion("al_info like", value, "alInfo");
            return (Criteria) this;
        }

        public Criteria andAlInfoNotLike(String value) {
            addCriterion("al_info not like", value, "alInfo");
            return (Criteria) this;
        }

        public Criteria andAlInfoIn(List<String> values) {
            addCriterion("al_info in", values, "alInfo");
            return (Criteria) this;
        }

        public Criteria andAlInfoNotIn(List<String> values) {
            addCriterion("al_info not in", values, "alInfo");
            return (Criteria) this;
        }

        public Criteria andAlInfoBetween(String value1, String value2) {
            addCriterion("al_info between", value1, value2, "alInfo");
            return (Criteria) this;
        }

        public Criteria andAlInfoNotBetween(String value1, String value2) {
            addCriterion("al_info not between", value1, value2, "alInfo");
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