package cn.xhfc.rocketmusic.entity;

import java.util.ArrayList;
import java.util.List;

public class CommentExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CommentExample() {
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

        public Criteria andCoIdIsNull() {
            addCriterion("co_id is null");
            return (Criteria) this;
        }

        public Criteria andCoIdIsNotNull() {
            addCriterion("co_id is not null");
            return (Criteria) this;
        }

        public Criteria andCoIdEqualTo(Integer value) {
            addCriterion("co_id =", value, "coId");
            return (Criteria) this;
        }

        public Criteria andCoIdNotEqualTo(Integer value) {
            addCriterion("co_id <>", value, "coId");
            return (Criteria) this;
        }

        public Criteria andCoIdGreaterThan(Integer value) {
            addCriterion("co_id >", value, "coId");
            return (Criteria) this;
        }

        public Criteria andCoIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("co_id >=", value, "coId");
            return (Criteria) this;
        }

        public Criteria andCoIdLessThan(Integer value) {
            addCriterion("co_id <", value, "coId");
            return (Criteria) this;
        }

        public Criteria andCoIdLessThanOrEqualTo(Integer value) {
            addCriterion("co_id <=", value, "coId");
            return (Criteria) this;
        }

        public Criteria andCoIdIn(List<Integer> values) {
            addCriterion("co_id in", values, "coId");
            return (Criteria) this;
        }

        public Criteria andCoIdNotIn(List<Integer> values) {
            addCriterion("co_id not in", values, "coId");
            return (Criteria) this;
        }

        public Criteria andCoIdBetween(Integer value1, Integer value2) {
            addCriterion("co_id between", value1, value2, "coId");
            return (Criteria) this;
        }

        public Criteria andCoIdNotBetween(Integer value1, Integer value2) {
            addCriterion("co_id not between", value1, value2, "coId");
            return (Criteria) this;
        }

        public Criteria andCoUserIsNull() {
            addCriterion("co_user is null");
            return (Criteria) this;
        }

        public Criteria andCoUserIsNotNull() {
            addCriterion("co_user is not null");
            return (Criteria) this;
        }

        public Criteria andCoUserEqualTo(Integer value) {
            addCriterion("co_user =", value, "coUser");
            return (Criteria) this;
        }

        public Criteria andCoUserNotEqualTo(Integer value) {
            addCriterion("co_user <>", value, "coUser");
            return (Criteria) this;
        }

        public Criteria andCoUserGreaterThan(Integer value) {
            addCriterion("co_user >", value, "coUser");
            return (Criteria) this;
        }

        public Criteria andCoUserGreaterThanOrEqualTo(Integer value) {
            addCriterion("co_user >=", value, "coUser");
            return (Criteria) this;
        }

        public Criteria andCoUserLessThan(Integer value) {
            addCriterion("co_user <", value, "coUser");
            return (Criteria) this;
        }

        public Criteria andCoUserLessThanOrEqualTo(Integer value) {
            addCriterion("co_user <=", value, "coUser");
            return (Criteria) this;
        }

        public Criteria andCoUserIn(List<Integer> values) {
            addCriterion("co_user in", values, "coUser");
            return (Criteria) this;
        }

        public Criteria andCoUserNotIn(List<Integer> values) {
            addCriterion("co_user not in", values, "coUser");
            return (Criteria) this;
        }

        public Criteria andCoUserBetween(Integer value1, Integer value2) {
            addCriterion("co_user between", value1, value2, "coUser");
            return (Criteria) this;
        }

        public Criteria andCoUserNotBetween(Integer value1, Integer value2) {
            addCriterion("co_user not between", value1, value2, "coUser");
            return (Criteria) this;
        }

        public Criteria andCoSongIsNull() {
            addCriterion("co_song is null");
            return (Criteria) this;
        }

        public Criteria andCoSongIsNotNull() {
            addCriterion("co_song is not null");
            return (Criteria) this;
        }

        public Criteria andCoSongEqualTo(Integer value) {
            addCriterion("co_song =", value, "coSong");
            return (Criteria) this;
        }

        public Criteria andCoSongNotEqualTo(Integer value) {
            addCriterion("co_song <>", value, "coSong");
            return (Criteria) this;
        }

        public Criteria andCoSongGreaterThan(Integer value) {
            addCriterion("co_song >", value, "coSong");
            return (Criteria) this;
        }

        public Criteria andCoSongGreaterThanOrEqualTo(Integer value) {
            addCriterion("co_song >=", value, "coSong");
            return (Criteria) this;
        }

        public Criteria andCoSongLessThan(Integer value) {
            addCriterion("co_song <", value, "coSong");
            return (Criteria) this;
        }

        public Criteria andCoSongLessThanOrEqualTo(Integer value) {
            addCriterion("co_song <=", value, "coSong");
            return (Criteria) this;
        }

        public Criteria andCoSongIn(List<Integer> values) {
            addCriterion("co_song in", values, "coSong");
            return (Criteria) this;
        }

        public Criteria andCoSongNotIn(List<Integer> values) {
            addCriterion("co_song not in", values, "coSong");
            return (Criteria) this;
        }

        public Criteria andCoSongBetween(Integer value1, Integer value2) {
            addCriterion("co_song between", value1, value2, "coSong");
            return (Criteria) this;
        }

        public Criteria andCoSongNotBetween(Integer value1, Integer value2) {
            addCriterion("co_song not between", value1, value2, "coSong");
            return (Criteria) this;
        }

        public Criteria andCoAlbumIsNull() {
            addCriterion("co_album is null");
            return (Criteria) this;
        }

        public Criteria andCoAlbumIsNotNull() {
            addCriterion("co_album is not null");
            return (Criteria) this;
        }

        public Criteria andCoAlbumEqualTo(Integer value) {
            addCriterion("co_album =", value, "coAlbum");
            return (Criteria) this;
        }

        public Criteria andCoAlbumNotEqualTo(Integer value) {
            addCriterion("co_album <>", value, "coAlbum");
            return (Criteria) this;
        }

        public Criteria andCoAlbumGreaterThan(Integer value) {
            addCriterion("co_album >", value, "coAlbum");
            return (Criteria) this;
        }

        public Criteria andCoAlbumGreaterThanOrEqualTo(Integer value) {
            addCriterion("co_album >=", value, "coAlbum");
            return (Criteria) this;
        }

        public Criteria andCoAlbumLessThan(Integer value) {
            addCriterion("co_album <", value, "coAlbum");
            return (Criteria) this;
        }

        public Criteria andCoAlbumLessThanOrEqualTo(Integer value) {
            addCriterion("co_album <=", value, "coAlbum");
            return (Criteria) this;
        }

        public Criteria andCoAlbumIn(List<Integer> values) {
            addCriterion("co_album in", values, "coAlbum");
            return (Criteria) this;
        }

        public Criteria andCoAlbumNotIn(List<Integer> values) {
            addCriterion("co_album not in", values, "coAlbum");
            return (Criteria) this;
        }

        public Criteria andCoAlbumBetween(Integer value1, Integer value2) {
            addCriterion("co_album between", value1, value2, "coAlbum");
            return (Criteria) this;
        }

        public Criteria andCoAlbumNotBetween(Integer value1, Integer value2) {
            addCriterion("co_album not between", value1, value2, "coAlbum");
            return (Criteria) this;
        }

        public Criteria andCoMvIsNull() {
            addCriterion("co_mv is null");
            return (Criteria) this;
        }

        public Criteria andCoMvIsNotNull() {
            addCriterion("co_mv is not null");
            return (Criteria) this;
        }

        public Criteria andCoMvEqualTo(Integer value) {
            addCriterion("co_mv =", value, "coMv");
            return (Criteria) this;
        }

        public Criteria andCoMvNotEqualTo(Integer value) {
            addCriterion("co_mv <>", value, "coMv");
            return (Criteria) this;
        }

        public Criteria andCoMvGreaterThan(Integer value) {
            addCriterion("co_mv >", value, "coMv");
            return (Criteria) this;
        }

        public Criteria andCoMvGreaterThanOrEqualTo(Integer value) {
            addCriterion("co_mv >=", value, "coMv");
            return (Criteria) this;
        }

        public Criteria andCoMvLessThan(Integer value) {
            addCriterion("co_mv <", value, "coMv");
            return (Criteria) this;
        }

        public Criteria andCoMvLessThanOrEqualTo(Integer value) {
            addCriterion("co_mv <=", value, "coMv");
            return (Criteria) this;
        }

        public Criteria andCoMvIn(List<Integer> values) {
            addCriterion("co_mv in", values, "coMv");
            return (Criteria) this;
        }

        public Criteria andCoMvNotIn(List<Integer> values) {
            addCriterion("co_mv not in", values, "coMv");
            return (Criteria) this;
        }

        public Criteria andCoMvBetween(Integer value1, Integer value2) {
            addCriterion("co_mv between", value1, value2, "coMv");
            return (Criteria) this;
        }

        public Criteria andCoMvNotBetween(Integer value1, Integer value2) {
            addCriterion("co_mv not between", value1, value2, "coMv");
            return (Criteria) this;
        }

        public Criteria andCoListIsNull() {
            addCriterion("co_list is null");
            return (Criteria) this;
        }

        public Criteria andCoListIsNotNull() {
            addCriterion("co_list is not null");
            return (Criteria) this;
        }

        public Criteria andCoListEqualTo(Integer value) {
            addCriterion("co_list =", value, "coList");
            return (Criteria) this;
        }

        public Criteria andCoListNotEqualTo(Integer value) {
            addCriterion("co_list <>", value, "coList");
            return (Criteria) this;
        }

        public Criteria andCoListGreaterThan(Integer value) {
            addCriterion("co_list >", value, "coList");
            return (Criteria) this;
        }

        public Criteria andCoListGreaterThanOrEqualTo(Integer value) {
            addCriterion("co_list >=", value, "coList");
            return (Criteria) this;
        }

        public Criteria andCoListLessThan(Integer value) {
            addCriterion("co_list <", value, "coList");
            return (Criteria) this;
        }

        public Criteria andCoListLessThanOrEqualTo(Integer value) {
            addCriterion("co_list <=", value, "coList");
            return (Criteria) this;
        }

        public Criteria andCoListIn(List<Integer> values) {
            addCriterion("co_list in", values, "coList");
            return (Criteria) this;
        }

        public Criteria andCoListNotIn(List<Integer> values) {
            addCriterion("co_list not in", values, "coList");
            return (Criteria) this;
        }

        public Criteria andCoListBetween(Integer value1, Integer value2) {
            addCriterion("co_list between", value1, value2, "coList");
            return (Criteria) this;
        }

        public Criteria andCoListNotBetween(Integer value1, Integer value2) {
            addCriterion("co_list not between", value1, value2, "coList");
            return (Criteria) this;
        }

        public Criteria andCoInfoIsNull() {
            addCriterion("co_info is null");
            return (Criteria) this;
        }

        public Criteria andCoInfoIsNotNull() {
            addCriterion("co_info is not null");
            return (Criteria) this;
        }

        public Criteria andCoInfoEqualTo(String value) {
            addCriterion("co_info =", value, "coInfo");
            return (Criteria) this;
        }

        public Criteria andCoInfoNotEqualTo(String value) {
            addCriterion("co_info <>", value, "coInfo");
            return (Criteria) this;
        }

        public Criteria andCoInfoGreaterThan(String value) {
            addCriterion("co_info >", value, "coInfo");
            return (Criteria) this;
        }

        public Criteria andCoInfoGreaterThanOrEqualTo(String value) {
            addCriterion("co_info >=", value, "coInfo");
            return (Criteria) this;
        }

        public Criteria andCoInfoLessThan(String value) {
            addCriterion("co_info <", value, "coInfo");
            return (Criteria) this;
        }

        public Criteria andCoInfoLessThanOrEqualTo(String value) {
            addCriterion("co_info <=", value, "coInfo");
            return (Criteria) this;
        }

        public Criteria andCoInfoLike(String value) {
            addCriterion("co_info like", value, "coInfo");
            return (Criteria) this;
        }

        public Criteria andCoInfoNotLike(String value) {
            addCriterion("co_info not like", value, "coInfo");
            return (Criteria) this;
        }

        public Criteria andCoInfoIn(List<String> values) {
            addCriterion("co_info in", values, "coInfo");
            return (Criteria) this;
        }

        public Criteria andCoInfoNotIn(List<String> values) {
            addCriterion("co_info not in", values, "coInfo");
            return (Criteria) this;
        }

        public Criteria andCoInfoBetween(String value1, String value2) {
            addCriterion("co_info between", value1, value2, "coInfo");
            return (Criteria) this;
        }

        public Criteria andCoInfoNotBetween(String value1, String value2) {
            addCriterion("co_info not between", value1, value2, "coInfo");
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