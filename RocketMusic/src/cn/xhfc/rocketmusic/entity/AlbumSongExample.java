package cn.xhfc.rocketmusic.entity;

import java.util.ArrayList;
import java.util.List;

public class AlbumSongExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AlbumSongExample() {
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

        public Criteria andASIdIsNull() {
            addCriterion("a_s_id is null");
            return (Criteria) this;
        }

        public Criteria andASIdIsNotNull() {
            addCriterion("a_s_id is not null");
            return (Criteria) this;
        }

        public Criteria andASIdEqualTo(Integer value) {
            addCriterion("a_s_id =", value, "aSId");
            return (Criteria) this;
        }

        public Criteria andASIdNotEqualTo(Integer value) {
            addCriterion("a_s_id <>", value, "aSId");
            return (Criteria) this;
        }

        public Criteria andASIdGreaterThan(Integer value) {
            addCriterion("a_s_id >", value, "aSId");
            return (Criteria) this;
        }

        public Criteria andASIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("a_s_id >=", value, "aSId");
            return (Criteria) this;
        }

        public Criteria andASIdLessThan(Integer value) {
            addCriterion("a_s_id <", value, "aSId");
            return (Criteria) this;
        }

        public Criteria andASIdLessThanOrEqualTo(Integer value) {
            addCriterion("a_s_id <=", value, "aSId");
            return (Criteria) this;
        }

        public Criteria andASIdIn(List<Integer> values) {
            addCriterion("a_s_id in", values, "aSId");
            return (Criteria) this;
        }

        public Criteria andASIdNotIn(List<Integer> values) {
            addCriterion("a_s_id not in", values, "aSId");
            return (Criteria) this;
        }

        public Criteria andASIdBetween(Integer value1, Integer value2) {
            addCriterion("a_s_id between", value1, value2, "aSId");
            return (Criteria) this;
        }

        public Criteria andASIdNotBetween(Integer value1, Integer value2) {
            addCriterion("a_s_id not between", value1, value2, "aSId");
            return (Criteria) this;
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