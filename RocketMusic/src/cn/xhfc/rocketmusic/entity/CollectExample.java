package cn.xhfc.rocketmusic.entity;

import java.util.ArrayList;
import java.util.List;

public class CollectExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CollectExample() {
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

        public Criteria andColIdIsNull() {
            addCriterion("col_id is null");
            return (Criteria) this;
        }

        public Criteria andColIdIsNotNull() {
            addCriterion("col_id is not null");
            return (Criteria) this;
        }

        public Criteria andColIdEqualTo(Integer value) {
            addCriterion("col_id =", value, "colId");
            return (Criteria) this;
        }

        public Criteria andColIdNotEqualTo(Integer value) {
            addCriterion("col_id <>", value, "colId");
            return (Criteria) this;
        }

        public Criteria andColIdGreaterThan(Integer value) {
            addCriterion("col_id >", value, "colId");
            return (Criteria) this;
        }

        public Criteria andColIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("col_id >=", value, "colId");
            return (Criteria) this;
        }

        public Criteria andColIdLessThan(Integer value) {
            addCriterion("col_id <", value, "colId");
            return (Criteria) this;
        }

        public Criteria andColIdLessThanOrEqualTo(Integer value) {
            addCriterion("col_id <=", value, "colId");
            return (Criteria) this;
        }

        public Criteria andColIdIn(List<Integer> values) {
            addCriterion("col_id in", values, "colId");
            return (Criteria) this;
        }

        public Criteria andColIdNotIn(List<Integer> values) {
            addCriterion("col_id not in", values, "colId");
            return (Criteria) this;
        }

        public Criteria andColIdBetween(Integer value1, Integer value2) {
            addCriterion("col_id between", value1, value2, "colId");
            return (Criteria) this;
        }

        public Criteria andColIdNotBetween(Integer value1, Integer value2) {
            addCriterion("col_id not between", value1, value2, "colId");
            return (Criteria) this;
        }

        public Criteria andColUserIsNull() {
            addCriterion("col_user is null");
            return (Criteria) this;
        }

        public Criteria andColUserIsNotNull() {
            addCriterion("col_user is not null");
            return (Criteria) this;
        }

        public Criteria andColUserEqualTo(Integer value) {
            addCriterion("col_user =", value, "colUser");
            return (Criteria) this;
        }

        public Criteria andColUserNotEqualTo(Integer value) {
            addCriterion("col_user <>", value, "colUser");
            return (Criteria) this;
        }

        public Criteria andColUserGreaterThan(Integer value) {
            addCriterion("col_user >", value, "colUser");
            return (Criteria) this;
        }

        public Criteria andColUserGreaterThanOrEqualTo(Integer value) {
            addCriterion("col_user >=", value, "colUser");
            return (Criteria) this;
        }

        public Criteria andColUserLessThan(Integer value) {
            addCriterion("col_user <", value, "colUser");
            return (Criteria) this;
        }

        public Criteria andColUserLessThanOrEqualTo(Integer value) {
            addCriterion("col_user <=", value, "colUser");
            return (Criteria) this;
        }

        public Criteria andColUserIn(List<Integer> values) {
            addCriterion("col_user in", values, "colUser");
            return (Criteria) this;
        }

        public Criteria andColUserNotIn(List<Integer> values) {
            addCriterion("col_user not in", values, "colUser");
            return (Criteria) this;
        }

        public Criteria andColUserBetween(Integer value1, Integer value2) {
            addCriterion("col_user between", value1, value2, "colUser");
            return (Criteria) this;
        }

        public Criteria andColUserNotBetween(Integer value1, Integer value2) {
            addCriterion("col_user not between", value1, value2, "colUser");
            return (Criteria) this;
        }

        public Criteria andColSongIsNull() {
            addCriterion("col_song is null");
            return (Criteria) this;
        }

        public Criteria andColSongIsNotNull() {
            addCriterion("col_song is not null");
            return (Criteria) this;
        }

        public Criteria andColSongEqualTo(Integer value) {
            addCriterion("col_song =", value, "colSong");
            return (Criteria) this;
        }

        public Criteria andColSongNotEqualTo(Integer value) {
            addCriterion("col_song <>", value, "colSong");
            return (Criteria) this;
        }

        public Criteria andColSongGreaterThan(Integer value) {
            addCriterion("col_song >", value, "colSong");
            return (Criteria) this;
        }

        public Criteria andColSongGreaterThanOrEqualTo(Integer value) {
            addCriterion("col_song >=", value, "colSong");
            return (Criteria) this;
        }

        public Criteria andColSongLessThan(Integer value) {
            addCriterion("col_song <", value, "colSong");
            return (Criteria) this;
        }

        public Criteria andColSongLessThanOrEqualTo(Integer value) {
            addCriterion("col_song <=", value, "colSong");
            return (Criteria) this;
        }

        public Criteria andColSongIn(List<Integer> values) {
            addCriterion("col_song in", values, "colSong");
            return (Criteria) this;
        }

        public Criteria andColSongNotIn(List<Integer> values) {
            addCriterion("col_song not in", values, "colSong");
            return (Criteria) this;
        }

        public Criteria andColSongBetween(Integer value1, Integer value2) {
            addCriterion("col_song between", value1, value2, "colSong");
            return (Criteria) this;
        }

        public Criteria andColSongNotBetween(Integer value1, Integer value2) {
            addCriterion("col_song not between", value1, value2, "colSong");
            return (Criteria) this;
        }

        public Criteria andColAlbumIsNull() {
            addCriterion("col_album is null");
            return (Criteria) this;
        }

        public Criteria andColAlbumIsNotNull() {
            addCriterion("col_album is not null");
            return (Criteria) this;
        }

        public Criteria andColAlbumEqualTo(Integer value) {
            addCriterion("col_album =", value, "colAlbum");
            return (Criteria) this;
        }

        public Criteria andColAlbumNotEqualTo(Integer value) {
            addCriterion("col_album <>", value, "colAlbum");
            return (Criteria) this;
        }

        public Criteria andColAlbumGreaterThan(Integer value) {
            addCriterion("col_album >", value, "colAlbum");
            return (Criteria) this;
        }

        public Criteria andColAlbumGreaterThanOrEqualTo(Integer value) {
            addCriterion("col_album >=", value, "colAlbum");
            return (Criteria) this;
        }

        public Criteria andColAlbumLessThan(Integer value) {
            addCriterion("col_album <", value, "colAlbum");
            return (Criteria) this;
        }

        public Criteria andColAlbumLessThanOrEqualTo(Integer value) {
            addCriterion("col_album <=", value, "colAlbum");
            return (Criteria) this;
        }

        public Criteria andColAlbumIn(List<Integer> values) {
            addCriterion("col_album in", values, "colAlbum");
            return (Criteria) this;
        }

        public Criteria andColAlbumNotIn(List<Integer> values) {
            addCriterion("col_album not in", values, "colAlbum");
            return (Criteria) this;
        }

        public Criteria andColAlbumBetween(Integer value1, Integer value2) {
            addCriterion("col_album between", value1, value2, "colAlbum");
            return (Criteria) this;
        }

        public Criteria andColAlbumNotBetween(Integer value1, Integer value2) {
            addCriterion("col_album not between", value1, value2, "colAlbum");
            return (Criteria) this;
        }

        public Criteria andColListIsNull() {
            addCriterion("col_list is null");
            return (Criteria) this;
        }

        public Criteria andColListIsNotNull() {
            addCriterion("col_list is not null");
            return (Criteria) this;
        }

        public Criteria andColListEqualTo(Integer value) {
            addCriterion("col_list =", value, "colList");
            return (Criteria) this;
        }

        public Criteria andColListNotEqualTo(Integer value) {
            addCriterion("col_list <>", value, "colList");
            return (Criteria) this;
        }

        public Criteria andColListGreaterThan(Integer value) {
            addCriterion("col_list >", value, "colList");
            return (Criteria) this;
        }

        public Criteria andColListGreaterThanOrEqualTo(Integer value) {
            addCriterion("col_list >=", value, "colList");
            return (Criteria) this;
        }

        public Criteria andColListLessThan(Integer value) {
            addCriterion("col_list <", value, "colList");
            return (Criteria) this;
        }

        public Criteria andColListLessThanOrEqualTo(Integer value) {
            addCriterion("col_list <=", value, "colList");
            return (Criteria) this;
        }

        public Criteria andColListIn(List<Integer> values) {
            addCriterion("col_list in", values, "colList");
            return (Criteria) this;
        }

        public Criteria andColListNotIn(List<Integer> values) {
            addCriterion("col_list not in", values, "colList");
            return (Criteria) this;
        }

        public Criteria andColListBetween(Integer value1, Integer value2) {
            addCriterion("col_list between", value1, value2, "colList");
            return (Criteria) this;
        }

        public Criteria andColListNotBetween(Integer value1, Integer value2) {
            addCriterion("col_list not between", value1, value2, "colList");
            return (Criteria) this;
        }

        public Criteria andColSingerIsNull() {
            addCriterion("col_singer is null");
            return (Criteria) this;
        }

        public Criteria andColSingerIsNotNull() {
            addCriterion("col_singer is not null");
            return (Criteria) this;
        }

        public Criteria andColSingerEqualTo(Integer value) {
            addCriterion("col_singer =", value, "colSinger");
            return (Criteria) this;
        }

        public Criteria andColSingerNotEqualTo(Integer value) {
            addCriterion("col_singer <>", value, "colSinger");
            return (Criteria) this;
        }

        public Criteria andColSingerGreaterThan(Integer value) {
            addCriterion("col_singer >", value, "colSinger");
            return (Criteria) this;
        }

        public Criteria andColSingerGreaterThanOrEqualTo(Integer value) {
            addCriterion("col_singer >=", value, "colSinger");
            return (Criteria) this;
        }

        public Criteria andColSingerLessThan(Integer value) {
            addCriterion("col_singer <", value, "colSinger");
            return (Criteria) this;
        }

        public Criteria andColSingerLessThanOrEqualTo(Integer value) {
            addCriterion("col_singer <=", value, "colSinger");
            return (Criteria) this;
        }

        public Criteria andColSingerIn(List<Integer> values) {
            addCriterion("col_singer in", values, "colSinger");
            return (Criteria) this;
        }

        public Criteria andColSingerNotIn(List<Integer> values) {
            addCriterion("col_singer not in", values, "colSinger");
            return (Criteria) this;
        }

        public Criteria andColSingerBetween(Integer value1, Integer value2) {
            addCriterion("col_singer between", value1, value2, "colSinger");
            return (Criteria) this;
        }

        public Criteria andColSingerNotBetween(Integer value1, Integer value2) {
            addCriterion("col_singer not between", value1, value2, "colSinger");
            return (Criteria) this;
        }

        public Criteria andColMvIsNull() {
            addCriterion("col_mv is null");
            return (Criteria) this;
        }

        public Criteria andColMvIsNotNull() {
            addCriterion("col_mv is not null");
            return (Criteria) this;
        }

        public Criteria andColMvEqualTo(Integer value) {
            addCriterion("col_mv =", value, "colMv");
            return (Criteria) this;
        }

        public Criteria andColMvNotEqualTo(Integer value) {
            addCriterion("col_mv <>", value, "colMv");
            return (Criteria) this;
        }

        public Criteria andColMvGreaterThan(Integer value) {
            addCriterion("col_mv >", value, "colMv");
            return (Criteria) this;
        }

        public Criteria andColMvGreaterThanOrEqualTo(Integer value) {
            addCriterion("col_mv >=", value, "colMv");
            return (Criteria) this;
        }

        public Criteria andColMvLessThan(Integer value) {
            addCriterion("col_mv <", value, "colMv");
            return (Criteria) this;
        }

        public Criteria andColMvLessThanOrEqualTo(Integer value) {
            addCriterion("col_mv <=", value, "colMv");
            return (Criteria) this;
        }

        public Criteria andColMvIn(List<Integer> values) {
            addCriterion("col_mv in", values, "colMv");
            return (Criteria) this;
        }

        public Criteria andColMvNotIn(List<Integer> values) {
            addCriterion("col_mv not in", values, "colMv");
            return (Criteria) this;
        }

        public Criteria andColMvBetween(Integer value1, Integer value2) {
            addCriterion("col_mv between", value1, value2, "colMv");
            return (Criteria) this;
        }

        public Criteria andColMvNotBetween(Integer value1, Integer value2) {
            addCriterion("col_mv not between", value1, value2, "colMv");
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