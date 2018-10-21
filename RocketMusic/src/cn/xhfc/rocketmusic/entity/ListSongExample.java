package cn.xhfc.rocketmusic.entity;

import java.util.ArrayList;
import java.util.List;

public class ListSongExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ListSongExample() {
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

        public Criteria andLSIdIsNull() {
            addCriterion("l_s_id is null");
            return (Criteria) this;
        }

        public Criteria andLSIdIsNotNull() {
            addCriterion("l_s_id is not null");
            return (Criteria) this;
        }

        public Criteria andLSIdEqualTo(Integer value) {
            addCriterion("l_s_id =", value, "lSId");
            return (Criteria) this;
        }

        public Criteria andLSIdNotEqualTo(Integer value) {
            addCriterion("l_s_id <>", value, "lSId");
            return (Criteria) this;
        }

        public Criteria andLSIdGreaterThan(Integer value) {
            addCriterion("l_s_id >", value, "lSId");
            return (Criteria) this;
        }

        public Criteria andLSIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("l_s_id >=", value, "lSId");
            return (Criteria) this;
        }

        public Criteria andLSIdLessThan(Integer value) {
            addCriterion("l_s_id <", value, "lSId");
            return (Criteria) this;
        }

        public Criteria andLSIdLessThanOrEqualTo(Integer value) {
            addCriterion("l_s_id <=", value, "lSId");
            return (Criteria) this;
        }

        public Criteria andLSIdIn(List<Integer> values) {
            addCriterion("l_s_id in", values, "lSId");
            return (Criteria) this;
        }

        public Criteria andLSIdNotIn(List<Integer> values) {
            addCriterion("l_s_id not in", values, "lSId");
            return (Criteria) this;
        }

        public Criteria andLSIdBetween(Integer value1, Integer value2) {
            addCriterion("l_s_id between", value1, value2, "lSId");
            return (Criteria) this;
        }

        public Criteria andLSIdNotBetween(Integer value1, Integer value2) {
            addCriterion("l_s_id not between", value1, value2, "lSId");
            return (Criteria) this;
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