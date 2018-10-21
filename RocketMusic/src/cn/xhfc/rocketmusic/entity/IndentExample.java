package cn.xhfc.rocketmusic.entity;

import java.util.ArrayList;
import java.util.List;

public class IndentExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public IndentExample() {
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

        public Criteria andOrIdIsNull() {
            addCriterion("or_id is null");
            return (Criteria) this;
        }

        public Criteria andOrIdIsNotNull() {
            addCriterion("or_id is not null");
            return (Criteria) this;
        }

        public Criteria andOrIdEqualTo(Integer value) {
            addCriterion("or_id =", value, "orId");
            return (Criteria) this;
        }

        public Criteria andOrIdNotEqualTo(Integer value) {
            addCriterion("or_id <>", value, "orId");
            return (Criteria) this;
        }

        public Criteria andOrIdGreaterThan(Integer value) {
            addCriterion("or_id >", value, "orId");
            return (Criteria) this;
        }

        public Criteria andOrIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("or_id >=", value, "orId");
            return (Criteria) this;
        }

        public Criteria andOrIdLessThan(Integer value) {
            addCriterion("or_id <", value, "orId");
            return (Criteria) this;
        }

        public Criteria andOrIdLessThanOrEqualTo(Integer value) {
            addCriterion("or_id <=", value, "orId");
            return (Criteria) this;
        }

        public Criteria andOrIdIn(List<Integer> values) {
            addCriterion("or_id in", values, "orId");
            return (Criteria) this;
        }

        public Criteria andOrIdNotIn(List<Integer> values) {
            addCriterion("or_id not in", values, "orId");
            return (Criteria) this;
        }

        public Criteria andOrIdBetween(Integer value1, Integer value2) {
            addCriterion("or_id between", value1, value2, "orId");
            return (Criteria) this;
        }

        public Criteria andOrIdNotBetween(Integer value1, Integer value2) {
            addCriterion("or_id not between", value1, value2, "orId");
            return (Criteria) this;
        }

        public Criteria andOrUserIsNull() {
            addCriterion("or_user is null");
            return (Criteria) this;
        }

        public Criteria andOrUserIsNotNull() {
            addCriterion("or_user is not null");
            return (Criteria) this;
        }

        public Criteria andOrUserEqualTo(Integer value) {
            addCriterion("or_user =", value, "orUser");
            return (Criteria) this;
        }

        public Criteria andOrUserNotEqualTo(Integer value) {
            addCriterion("or_user <>", value, "orUser");
            return (Criteria) this;
        }

        public Criteria andOrUserGreaterThan(Integer value) {
            addCriterion("or_user >", value, "orUser");
            return (Criteria) this;
        }

        public Criteria andOrUserGreaterThanOrEqualTo(Integer value) {
            addCriterion("or_user >=", value, "orUser");
            return (Criteria) this;
        }

        public Criteria andOrUserLessThan(Integer value) {
            addCriterion("or_user <", value, "orUser");
            return (Criteria) this;
        }

        public Criteria andOrUserLessThanOrEqualTo(Integer value) {
            addCriterion("or_user <=", value, "orUser");
            return (Criteria) this;
        }

        public Criteria andOrUserIn(List<Integer> values) {
            addCriterion("or_user in", values, "orUser");
            return (Criteria) this;
        }

        public Criteria andOrUserNotIn(List<Integer> values) {
            addCriterion("or_user not in", values, "orUser");
            return (Criteria) this;
        }

        public Criteria andOrUserBetween(Integer value1, Integer value2) {
            addCriterion("or_user between", value1, value2, "orUser");
            return (Criteria) this;
        }

        public Criteria andOrUserNotBetween(Integer value1, Integer value2) {
            addCriterion("or_user not between", value1, value2, "orUser");
            return (Criteria) this;
        }

        public Criteria andOrSongIsNull() {
            addCriterion("or_song is null");
            return (Criteria) this;
        }

        public Criteria andOrSongIsNotNull() {
            addCriterion("or_song is not null");
            return (Criteria) this;
        }

        public Criteria andOrSongEqualTo(Integer value) {
            addCriterion("or_song =", value, "orSong");
            return (Criteria) this;
        }

        public Criteria andOrSongNotEqualTo(Integer value) {
            addCriterion("or_song <>", value, "orSong");
            return (Criteria) this;
        }

        public Criteria andOrSongGreaterThan(Integer value) {
            addCriterion("or_song >", value, "orSong");
            return (Criteria) this;
        }

        public Criteria andOrSongGreaterThanOrEqualTo(Integer value) {
            addCriterion("or_song >=", value, "orSong");
            return (Criteria) this;
        }

        public Criteria andOrSongLessThan(Integer value) {
            addCriterion("or_song <", value, "orSong");
            return (Criteria) this;
        }

        public Criteria andOrSongLessThanOrEqualTo(Integer value) {
            addCriterion("or_song <=", value, "orSong");
            return (Criteria) this;
        }

        public Criteria andOrSongIn(List<Integer> values) {
            addCriterion("or_song in", values, "orSong");
            return (Criteria) this;
        }

        public Criteria andOrSongNotIn(List<Integer> values) {
            addCriterion("or_song not in", values, "orSong");
            return (Criteria) this;
        }

        public Criteria andOrSongBetween(Integer value1, Integer value2) {
            addCriterion("or_song between", value1, value2, "orSong");
            return (Criteria) this;
        }

        public Criteria andOrSongNotBetween(Integer value1, Integer value2) {
            addCriterion("or_song not between", value1, value2, "orSong");
            return (Criteria) this;
        }

        public Criteria andOrAlbumIsNull() {
            addCriterion("or_album is null");
            return (Criteria) this;
        }

        public Criteria andOrAlbumIsNotNull() {
            addCriterion("or_album is not null");
            return (Criteria) this;
        }

        public Criteria andOrAlbumEqualTo(Integer value) {
            addCriterion("or_album =", value, "orAlbum");
            return (Criteria) this;
        }

        public Criteria andOrAlbumNotEqualTo(Integer value) {
            addCriterion("or_album <>", value, "orAlbum");
            return (Criteria) this;
        }

        public Criteria andOrAlbumGreaterThan(Integer value) {
            addCriterion("or_album >", value, "orAlbum");
            return (Criteria) this;
        }

        public Criteria andOrAlbumGreaterThanOrEqualTo(Integer value) {
            addCriterion("or_album >=", value, "orAlbum");
            return (Criteria) this;
        }

        public Criteria andOrAlbumLessThan(Integer value) {
            addCriterion("or_album <", value, "orAlbum");
            return (Criteria) this;
        }

        public Criteria andOrAlbumLessThanOrEqualTo(Integer value) {
            addCriterion("or_album <=", value, "orAlbum");
            return (Criteria) this;
        }

        public Criteria andOrAlbumIn(List<Integer> values) {
            addCriterion("or_album in", values, "orAlbum");
            return (Criteria) this;
        }

        public Criteria andOrAlbumNotIn(List<Integer> values) {
            addCriterion("or_album not in", values, "orAlbum");
            return (Criteria) this;
        }

        public Criteria andOrAlbumBetween(Integer value1, Integer value2) {
            addCriterion("or_album between", value1, value2, "orAlbum");
            return (Criteria) this;
        }

        public Criteria andOrAlbumNotBetween(Integer value1, Integer value2) {
            addCriterion("or_album not between", value1, value2, "orAlbum");
            return (Criteria) this;
        }

        public Criteria andOrPriceIsNull() {
            addCriterion("or_price is null");
            return (Criteria) this;
        }

        public Criteria andOrPriceIsNotNull() {
            addCriterion("or_price is not null");
            return (Criteria) this;
        }

        public Criteria andOrPriceEqualTo(Float value) {
            addCriterion("or_price =", value, "orPrice");
            return (Criteria) this;
        }

        public Criteria andOrPriceNotEqualTo(Float value) {
            addCriterion("or_price <>", value, "orPrice");
            return (Criteria) this;
        }

        public Criteria andOrPriceGreaterThan(Float value) {
            addCriterion("or_price >", value, "orPrice");
            return (Criteria) this;
        }

        public Criteria andOrPriceGreaterThanOrEqualTo(Float value) {
            addCriterion("or_price >=", value, "orPrice");
            return (Criteria) this;
        }

        public Criteria andOrPriceLessThan(Float value) {
            addCriterion("or_price <", value, "orPrice");
            return (Criteria) this;
        }

        public Criteria andOrPriceLessThanOrEqualTo(Float value) {
            addCriterion("or_price <=", value, "orPrice");
            return (Criteria) this;
        }

        public Criteria andOrPriceIn(List<Float> values) {
            addCriterion("or_price in", values, "orPrice");
            return (Criteria) this;
        }

        public Criteria andOrPriceNotIn(List<Float> values) {
            addCriterion("or_price not in", values, "orPrice");
            return (Criteria) this;
        }

        public Criteria andOrPriceBetween(Float value1, Float value2) {
            addCriterion("or_price between", value1, value2, "orPrice");
            return (Criteria) this;
        }

        public Criteria andOrPriceNotBetween(Float value1, Float value2) {
            addCriterion("or_price not between", value1, value2, "orPrice");
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