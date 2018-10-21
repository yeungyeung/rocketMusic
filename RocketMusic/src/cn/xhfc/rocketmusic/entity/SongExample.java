package cn.xhfc.rocketmusic.entity;

import java.util.ArrayList;
import java.util.List;

public class SongExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SongExample() {
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

        public Criteria andSoIdIsNull() {
            addCriterion("so_id is null");
            return (Criteria) this;
        }

        public Criteria andSoIdIsNotNull() {
            addCriterion("so_id is not null");
            return (Criteria) this;
        }

        public Criteria andSoIdEqualTo(Integer value) {
            addCriterion("so_id =", value, "soId");
            return (Criteria) this;
        }

        public Criteria andSoIdNotEqualTo(Integer value) {
            addCriterion("so_id <>", value, "soId");
            return (Criteria) this;
        }

        public Criteria andSoIdGreaterThan(Integer value) {
            addCriterion("so_id >", value, "soId");
            return (Criteria) this;
        }

        public Criteria andSoIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("so_id >=", value, "soId");
            return (Criteria) this;
        }

        public Criteria andSoIdLessThan(Integer value) {
            addCriterion("so_id <", value, "soId");
            return (Criteria) this;
        }

        public Criteria andSoIdLessThanOrEqualTo(Integer value) {
            addCriterion("so_id <=", value, "soId");
            return (Criteria) this;
        }

        public Criteria andSoIdIn(List<Integer> values) {
            addCriterion("so_id in", values, "soId");
            return (Criteria) this;
        }

        public Criteria andSoIdNotIn(List<Integer> values) {
            addCriterion("so_id not in", values, "soId");
            return (Criteria) this;
        }

        public Criteria andSoIdBetween(Integer value1, Integer value2) {
            addCriterion("so_id between", value1, value2, "soId");
            return (Criteria) this;
        }

        public Criteria andSoIdNotBetween(Integer value1, Integer value2) {
            addCriterion("so_id not between", value1, value2, "soId");
            return (Criteria) this;
        }

        public Criteria andSoNameIsNull() {
            addCriterion("so_name is null");
            return (Criteria) this;
        }

        public Criteria andSoNameIsNotNull() {
            addCriterion("so_name is not null");
            return (Criteria) this;
        }

        public Criteria andSoNameEqualTo(String value) {
            addCriterion("so_name =", value, "soName");
            return (Criteria) this;
        }

        public Criteria andSoNameNotEqualTo(String value) {
            addCriterion("so_name <>", value, "soName");
            return (Criteria) this;
        }

        public Criteria andSoNameGreaterThan(String value) {
            addCriterion("so_name >", value, "soName");
            return (Criteria) this;
        }

        public Criteria andSoNameGreaterThanOrEqualTo(String value) {
            addCriterion("so_name >=", value, "soName");
            return (Criteria) this;
        }

        public Criteria andSoNameLessThan(String value) {
            addCriterion("so_name <", value, "soName");
            return (Criteria) this;
        }

        public Criteria andSoNameLessThanOrEqualTo(String value) {
            addCriterion("so_name <=", value, "soName");
            return (Criteria) this;
        }

        public Criteria andSoNameLike(String value) {
            addCriterion("so_name like", value, "soName");
            return (Criteria) this;
        }

        public Criteria andSoNameNotLike(String value) {
            addCriterion("so_name not like", value, "soName");
            return (Criteria) this;
        }

        public Criteria andSoNameIn(List<String> values) {
            addCriterion("so_name in", values, "soName");
            return (Criteria) this;
        }

        public Criteria andSoNameNotIn(List<String> values) {
            addCriterion("so_name not in", values, "soName");
            return (Criteria) this;
        }

        public Criteria andSoNameBetween(String value1, String value2) {
            addCriterion("so_name between", value1, value2, "soName");
            return (Criteria) this;
        }

        public Criteria andSoNameNotBetween(String value1, String value2) {
            addCriterion("so_name not between", value1, value2, "soName");
            return (Criteria) this;
        }

        public Criteria andSoUrlIsNull() {
            addCriterion("so_url is null");
            return (Criteria) this;
        }

        public Criteria andSoUrlIsNotNull() {
            addCriterion("so_url is not null");
            return (Criteria) this;
        }

        public Criteria andSoUrlEqualTo(String value) {
            addCriterion("so_url =", value, "soUrl");
            return (Criteria) this;
        }

        public Criteria andSoUrlNotEqualTo(String value) {
            addCriterion("so_url <>", value, "soUrl");
            return (Criteria) this;
        }

        public Criteria andSoUrlGreaterThan(String value) {
            addCriterion("so_url >", value, "soUrl");
            return (Criteria) this;
        }

        public Criteria andSoUrlGreaterThanOrEqualTo(String value) {
            addCriterion("so_url >=", value, "soUrl");
            return (Criteria) this;
        }

        public Criteria andSoUrlLessThan(String value) {
            addCriterion("so_url <", value, "soUrl");
            return (Criteria) this;
        }

        public Criteria andSoUrlLessThanOrEqualTo(String value) {
            addCriterion("so_url <=", value, "soUrl");
            return (Criteria) this;
        }

        public Criteria andSoUrlLike(String value) {
            addCriterion("so_url like", value, "soUrl");
            return (Criteria) this;
        }

        public Criteria andSoUrlNotLike(String value) {
            addCriterion("so_url not like", value, "soUrl");
            return (Criteria) this;
        }

        public Criteria andSoUrlIn(List<String> values) {
            addCriterion("so_url in", values, "soUrl");
            return (Criteria) this;
        }

        public Criteria andSoUrlNotIn(List<String> values) {
            addCriterion("so_url not in", values, "soUrl");
            return (Criteria) this;
        }

        public Criteria andSoUrlBetween(String value1, String value2) {
            addCriterion("so_url between", value1, value2, "soUrl");
            return (Criteria) this;
        }

        public Criteria andSoUrlNotBetween(String value1, String value2) {
            addCriterion("so_url not between", value1, value2, "soUrl");
            return (Criteria) this;
        }

        public Criteria andSoSingerIsNull() {
            addCriterion("so_singer is null");
            return (Criteria) this;
        }

        public Criteria andSoSingerIsNotNull() {
            addCriterion("so_singer is not null");
            return (Criteria) this;
        }

        public Criteria andSoSingerEqualTo(Integer value) {
            addCriterion("so_singer =", value, "soSinger");
            return (Criteria) this;
        }

        public Criteria andSoSingerNotEqualTo(Integer value) {
            addCriterion("so_singer <>", value, "soSinger");
            return (Criteria) this;
        }

        public Criteria andSoSingerGreaterThan(Integer value) {
            addCriterion("so_singer >", value, "soSinger");
            return (Criteria) this;
        }

        public Criteria andSoSingerGreaterThanOrEqualTo(Integer value) {
            addCriterion("so_singer >=", value, "soSinger");
            return (Criteria) this;
        }

        public Criteria andSoSingerLessThan(Integer value) {
            addCriterion("so_singer <", value, "soSinger");
            return (Criteria) this;
        }

        public Criteria andSoSingerLessThanOrEqualTo(Integer value) {
            addCriterion("so_singer <=", value, "soSinger");
            return (Criteria) this;
        }

        public Criteria andSoSingerIn(List<Integer> values) {
            addCriterion("so_singer in", values, "soSinger");
            return (Criteria) this;
        }

        public Criteria andSoSingerNotIn(List<Integer> values) {
            addCriterion("so_singer not in", values, "soSinger");
            return (Criteria) this;
        }

        public Criteria andSoSingerBetween(Integer value1, Integer value2) {
            addCriterion("so_singer between", value1, value2, "soSinger");
            return (Criteria) this;
        }

        public Criteria andSoSingerNotBetween(Integer value1, Integer value2) {
            addCriterion("so_singer not between", value1, value2, "soSinger");
            return (Criteria) this;
        }

        public Criteria andSoLyricIsNull() {
            addCriterion("so_lyric is null");
            return (Criteria) this;
        }

        public Criteria andSoLyricIsNotNull() {
            addCriterion("so_lyric is not null");
            return (Criteria) this;
        }

        public Criteria andSoLyricEqualTo(String value) {
            addCriterion("so_lyric =", value, "soLyric");
            return (Criteria) this;
        }

        public Criteria andSoLyricNotEqualTo(String value) {
            addCriterion("so_lyric <>", value, "soLyric");
            return (Criteria) this;
        }

        public Criteria andSoLyricGreaterThan(String value) {
            addCriterion("so_lyric >", value, "soLyric");
            return (Criteria) this;
        }

        public Criteria andSoLyricGreaterThanOrEqualTo(String value) {
            addCriterion("so_lyric >=", value, "soLyric");
            return (Criteria) this;
        }

        public Criteria andSoLyricLessThan(String value) {
            addCriterion("so_lyric <", value, "soLyric");
            return (Criteria) this;
        }

        public Criteria andSoLyricLessThanOrEqualTo(String value) {
            addCriterion("so_lyric <=", value, "soLyric");
            return (Criteria) this;
        }

        public Criteria andSoLyricLike(String value) {
            addCriterion("so_lyric like", value, "soLyric");
            return (Criteria) this;
        }

        public Criteria andSoLyricNotLike(String value) {
            addCriterion("so_lyric not like", value, "soLyric");
            return (Criteria) this;
        }

        public Criteria andSoLyricIn(List<String> values) {
            addCriterion("so_lyric in", values, "soLyric");
            return (Criteria) this;
        }

        public Criteria andSoLyricNotIn(List<String> values) {
            addCriterion("so_lyric not in", values, "soLyric");
            return (Criteria) this;
        }

        public Criteria andSoLyricBetween(String value1, String value2) {
            addCriterion("so_lyric between", value1, value2, "soLyric");
            return (Criteria) this;
        }

        public Criteria andSoLyricNotBetween(String value1, String value2) {
            addCriterion("so_lyric not between", value1, value2, "soLyric");
            return (Criteria) this;
        }

        public Criteria andSoPriceIsNull() {
            addCriterion("so_price is null");
            return (Criteria) this;
        }

        public Criteria andSoPriceIsNotNull() {
            addCriterion("so_price is not null");
            return (Criteria) this;
        }

        public Criteria andSoPriceEqualTo(Float value) {
            addCriterion("so_price =", value, "soPrice");
            return (Criteria) this;
        }

        public Criteria andSoPriceNotEqualTo(Float value) {
            addCriterion("so_price <>", value, "soPrice");
            return (Criteria) this;
        }

        public Criteria andSoPriceGreaterThan(Float value) {
            addCriterion("so_price >", value, "soPrice");
            return (Criteria) this;
        }

        public Criteria andSoPriceGreaterThanOrEqualTo(Float value) {
            addCriterion("so_price >=", value, "soPrice");
            return (Criteria) this;
        }

        public Criteria andSoPriceLessThan(Float value) {
            addCriterion("so_price <", value, "soPrice");
            return (Criteria) this;
        }

        public Criteria andSoPriceLessThanOrEqualTo(Float value) {
            addCriterion("so_price <=", value, "soPrice");
            return (Criteria) this;
        }

        public Criteria andSoPriceIn(List<Float> values) {
            addCriterion("so_price in", values, "soPrice");
            return (Criteria) this;
        }

        public Criteria andSoPriceNotIn(List<Float> values) {
            addCriterion("so_price not in", values, "soPrice");
            return (Criteria) this;
        }

        public Criteria andSoPriceBetween(Float value1, Float value2) {
            addCriterion("so_price between", value1, value2, "soPrice");
            return (Criteria) this;
        }

        public Criteria andSoPriceNotBetween(Float value1, Float value2) {
            addCriterion("so_price not between", value1, value2, "soPrice");
            return (Criteria) this;
        }

        public Criteria andSoInfoIsNull() {
            addCriterion("so_info is null");
            return (Criteria) this;
        }

        public Criteria andSoInfoIsNotNull() {
            addCriterion("so_info is not null");
            return (Criteria) this;
        }

        public Criteria andSoInfoEqualTo(String value) {
            addCriterion("so_info =", value, "soInfo");
            return (Criteria) this;
        }

        public Criteria andSoInfoNotEqualTo(String value) {
            addCriterion("so_info <>", value, "soInfo");
            return (Criteria) this;
        }

        public Criteria andSoInfoGreaterThan(String value) {
            addCriterion("so_info >", value, "soInfo");
            return (Criteria) this;
        }

        public Criteria andSoInfoGreaterThanOrEqualTo(String value) {
            addCriterion("so_info >=", value, "soInfo");
            return (Criteria) this;
        }

        public Criteria andSoInfoLessThan(String value) {
            addCriterion("so_info <", value, "soInfo");
            return (Criteria) this;
        }

        public Criteria andSoInfoLessThanOrEqualTo(String value) {
            addCriterion("so_info <=", value, "soInfo");
            return (Criteria) this;
        }

        public Criteria andSoInfoLike(String value) {
            addCriterion("so_info like", value, "soInfo");
            return (Criteria) this;
        }

        public Criteria andSoInfoNotLike(String value) {
            addCriterion("so_info not like", value, "soInfo");
            return (Criteria) this;
        }

        public Criteria andSoInfoIn(List<String> values) {
            addCriterion("so_info in", values, "soInfo");
            return (Criteria) this;
        }

        public Criteria andSoInfoNotIn(List<String> values) {
            addCriterion("so_info not in", values, "soInfo");
            return (Criteria) this;
        }

        public Criteria andSoInfoBetween(String value1, String value2) {
            addCriterion("so_info between", value1, value2, "soInfo");
            return (Criteria) this;
        }

        public Criteria andSoInfoNotBetween(String value1, String value2) {
            addCriterion("so_info not between", value1, value2, "soInfo");
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