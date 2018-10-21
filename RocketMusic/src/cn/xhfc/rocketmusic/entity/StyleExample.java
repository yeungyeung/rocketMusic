package cn.xhfc.rocketmusic.entity;

import java.util.ArrayList;
import java.util.List;

public class StyleExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public StyleExample() {
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

        public Criteria andStIdIsNull() {
            addCriterion("st_id is null");
            return (Criteria) this;
        }

        public Criteria andStIdIsNotNull() {
            addCriterion("st_id is not null");
            return (Criteria) this;
        }

        public Criteria andStIdEqualTo(Integer value) {
            addCriterion("st_id =", value, "stId");
            return (Criteria) this;
        }

        public Criteria andStIdNotEqualTo(Integer value) {
            addCriterion("st_id <>", value, "stId");
            return (Criteria) this;
        }

        public Criteria andStIdGreaterThan(Integer value) {
            addCriterion("st_id >", value, "stId");
            return (Criteria) this;
        }

        public Criteria andStIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("st_id >=", value, "stId");
            return (Criteria) this;
        }

        public Criteria andStIdLessThan(Integer value) {
            addCriterion("st_id <", value, "stId");
            return (Criteria) this;
        }

        public Criteria andStIdLessThanOrEqualTo(Integer value) {
            addCriterion("st_id <=", value, "stId");
            return (Criteria) this;
        }

        public Criteria andStIdIn(List<Integer> values) {
            addCriterion("st_id in", values, "stId");
            return (Criteria) this;
        }

        public Criteria andStIdNotIn(List<Integer> values) {
            addCriterion("st_id not in", values, "stId");
            return (Criteria) this;
        }

        public Criteria andStIdBetween(Integer value1, Integer value2) {
            addCriterion("st_id between", value1, value2, "stId");
            return (Criteria) this;
        }

        public Criteria andStIdNotBetween(Integer value1, Integer value2) {
            addCriterion("st_id not between", value1, value2, "stId");
            return (Criteria) this;
        }

        public Criteria andStCaregoryIsNull() {
            addCriterion("st_caregory is null");
            return (Criteria) this;
        }

        public Criteria andStCaregoryIsNotNull() {
            addCriterion("st_caregory is not null");
            return (Criteria) this;
        }

        public Criteria andStCaregoryEqualTo(String value) {
            addCriterion("st_caregory =", value, "stCaregory");
            return (Criteria) this;
        }

        public Criteria andStCaregoryNotEqualTo(String value) {
            addCriterion("st_caregory <>", value, "stCaregory");
            return (Criteria) this;
        }

        public Criteria andStCaregoryGreaterThan(String value) {
            addCriterion("st_caregory >", value, "stCaregory");
            return (Criteria) this;
        }

        public Criteria andStCaregoryGreaterThanOrEqualTo(String value) {
            addCriterion("st_caregory >=", value, "stCaregory");
            return (Criteria) this;
        }

        public Criteria andStCaregoryLessThan(String value) {
            addCriterion("st_caregory <", value, "stCaregory");
            return (Criteria) this;
        }

        public Criteria andStCaregoryLessThanOrEqualTo(String value) {
            addCriterion("st_caregory <=", value, "stCaregory");
            return (Criteria) this;
        }

        public Criteria andStCaregoryLike(String value) {
            addCriterion("st_caregory like", value, "stCaregory");
            return (Criteria) this;
        }

        public Criteria andStCaregoryNotLike(String value) {
            addCriterion("st_caregory not like", value, "stCaregory");
            return (Criteria) this;
        }

        public Criteria andStCaregoryIn(List<String> values) {
            addCriterion("st_caregory in", values, "stCaregory");
            return (Criteria) this;
        }

        public Criteria andStCaregoryNotIn(List<String> values) {
            addCriterion("st_caregory not in", values, "stCaregory");
            return (Criteria) this;
        }

        public Criteria andStCaregoryBetween(String value1, String value2) {
            addCriterion("st_caregory between", value1, value2, "stCaregory");
            return (Criteria) this;
        }

        public Criteria andStCaregoryNotBetween(String value1, String value2) {
            addCriterion("st_caregory not between", value1, value2, "stCaregory");
            return (Criteria) this;
        }

        public Criteria andStCaregory2IsNull() {
            addCriterion("st_caregory2 is null");
            return (Criteria) this;
        }

        public Criteria andStCaregory2IsNotNull() {
            addCriterion("st_caregory2 is not null");
            return (Criteria) this;
        }

        public Criteria andStCaregory2EqualTo(String value) {
            addCriterion("st_caregory2 =", value, "stCaregory2");
            return (Criteria) this;
        }

        public Criteria andStCaregory2NotEqualTo(String value) {
            addCriterion("st_caregory2 <>", value, "stCaregory2");
            return (Criteria) this;
        }

        public Criteria andStCaregory2GreaterThan(String value) {
            addCriterion("st_caregory2 >", value, "stCaregory2");
            return (Criteria) this;
        }

        public Criteria andStCaregory2GreaterThanOrEqualTo(String value) {
            addCriterion("st_caregory2 >=", value, "stCaregory2");
            return (Criteria) this;
        }

        public Criteria andStCaregory2LessThan(String value) {
            addCriterion("st_caregory2 <", value, "stCaregory2");
            return (Criteria) this;
        }

        public Criteria andStCaregory2LessThanOrEqualTo(String value) {
            addCriterion("st_caregory2 <=", value, "stCaregory2");
            return (Criteria) this;
        }

        public Criteria andStCaregory2Like(String value) {
            addCriterion("st_caregory2 like", value, "stCaregory2");
            return (Criteria) this;
        }

        public Criteria andStCaregory2NotLike(String value) {
            addCriterion("st_caregory2 not like", value, "stCaregory2");
            return (Criteria) this;
        }

        public Criteria andStCaregory2In(List<String> values) {
            addCriterion("st_caregory2 in", values, "stCaregory2");
            return (Criteria) this;
        }

        public Criteria andStCaregory2NotIn(List<String> values) {
            addCriterion("st_caregory2 not in", values, "stCaregory2");
            return (Criteria) this;
        }

        public Criteria andStCaregory2Between(String value1, String value2) {
            addCriterion("st_caregory2 between", value1, value2, "stCaregory2");
            return (Criteria) this;
        }

        public Criteria andStCaregory2NotBetween(String value1, String value2) {
            addCriterion("st_caregory2 not between", value1, value2, "stCaregory2");
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