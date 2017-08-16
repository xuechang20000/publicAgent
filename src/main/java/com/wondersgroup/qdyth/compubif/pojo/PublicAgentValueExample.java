package com.wondersgroup.qdyth.compubif.pojo;

import java.util.ArrayList;
import java.util.List;

public class PublicAgentValueExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PublicAgentValueExample() {
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

        public Criteria andDataidIsNull() {
            addCriterion("DATAID is null");
            return (Criteria) this;
        }

        public Criteria andDataidIsNotNull() {
            addCriterion("DATAID is not null");
            return (Criteria) this;
        }

        public Criteria andDataidEqualTo(Long value) {
            addCriterion("DATAID =", value, "dataid");
            return (Criteria) this;
        }

        public Criteria andDataidNotEqualTo(Long value) {
            addCriterion("DATAID <>", value, "dataid");
            return (Criteria) this;
        }

        public Criteria andDataidGreaterThan(Long value) {
            addCriterion("DATAID >", value, "dataid");
            return (Criteria) this;
        }

        public Criteria andDataidGreaterThanOrEqualTo(Long value) {
            addCriterion("DATAID >=", value, "dataid");
            return (Criteria) this;
        }

        public Criteria andDataidLessThan(Long value) {
            addCriterion("DATAID <", value, "dataid");
            return (Criteria) this;
        }

        public Criteria andDataidLessThanOrEqualTo(Long value) {
            addCriterion("DATAID <=", value, "dataid");
            return (Criteria) this;
        }

        public Criteria andDataidIn(List<Long> values) {
            addCriterion("DATAID in", values, "dataid");
            return (Criteria) this;
        }

        public Criteria andDataidNotIn(List<Long> values) {
            addCriterion("DATAID not in", values, "dataid");
            return (Criteria) this;
        }

        public Criteria andDataidBetween(Long value1, Long value2) {
            addCriterion("DATAID between", value1, value2, "dataid");
            return (Criteria) this;
        }

        public Criteria andDataidNotBetween(Long value1, Long value2) {
            addCriterion("DATAID not between", value1, value2, "dataid");
            return (Criteria) this;
        }

        public Criteria andLshIsNull() {
            addCriterion("LSH is null");
            return (Criteria) this;
        }

        public Criteria andLshIsNotNull() {
            addCriterion("LSH is not null");
            return (Criteria) this;
        }

        public Criteria andLshEqualTo(Long value) {
            addCriterion("LSH =", value, "lsh");
            return (Criteria) this;
        }

        public Criteria andLshNotEqualTo(Long value) {
            addCriterion("LSH <>", value, "lsh");
            return (Criteria) this;
        }

        public Criteria andLshGreaterThan(Long value) {
            addCriterion("LSH >", value, "lsh");
            return (Criteria) this;
        }

        public Criteria andLshGreaterThanOrEqualTo(Long value) {
            addCriterion("LSH >=", value, "lsh");
            return (Criteria) this;
        }

        public Criteria andLshLessThan(Long value) {
            addCriterion("LSH <", value, "lsh");
            return (Criteria) this;
        }

        public Criteria andLshLessThanOrEqualTo(Long value) {
            addCriterion("LSH <=", value, "lsh");
            return (Criteria) this;
        }

        public Criteria andLshIn(List<Long> values) {
            addCriterion("LSH in", values, "lsh");
            return (Criteria) this;
        }

        public Criteria andLshNotIn(List<Long> values) {
            addCriterion("LSH not in", values, "lsh");
            return (Criteria) this;
        }

        public Criteria andLshBetween(Long value1, Long value2) {
            addCriterion("LSH between", value1, value2, "lsh");
            return (Criteria) this;
        }

        public Criteria andLshNotBetween(Long value1, Long value2) {
            addCriterion("LSH not between", value1, value2, "lsh");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("STATUS is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(String value) {
            addCriterion("STATUS =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(String value) {
            addCriterion("STATUS <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(String value) {
            addCriterion("STATUS >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(String value) {
            addCriterion("STATUS >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(String value) {
            addCriterion("STATUS <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(String value) {
            addCriterion("STATUS <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLike(String value) {
            addCriterion("STATUS like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotLike(String value) {
            addCriterion("STATUS not like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<String> values) {
            addCriterion("STATUS in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<String> values) {
            addCriterion("STATUS not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(String value1, String value2) {
            addCriterion("STATUS between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(String value1, String value2) {
            addCriterion("STATUS not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andData01IsNull() {
            addCriterion("DATA01 is null");
            return (Criteria) this;
        }

        public Criteria andData01IsNotNull() {
            addCriterion("DATA01 is not null");
            return (Criteria) this;
        }

        public Criteria andData01EqualTo(String value) {
            addCriterion("DATA01 =", value, "data01");
            return (Criteria) this;
        }

        public Criteria andData01NotEqualTo(String value) {
            addCriterion("DATA01 <>", value, "data01");
            return (Criteria) this;
        }

        public Criteria andData01GreaterThan(String value) {
            addCriterion("DATA01 >", value, "data01");
            return (Criteria) this;
        }

        public Criteria andData01GreaterThanOrEqualTo(String value) {
            addCriterion("DATA01 >=", value, "data01");
            return (Criteria) this;
        }

        public Criteria andData01LessThan(String value) {
            addCriterion("DATA01 <", value, "data01");
            return (Criteria) this;
        }

        public Criteria andData01LessThanOrEqualTo(String value) {
            addCriterion("DATA01 <=", value, "data01");
            return (Criteria) this;
        }

        public Criteria andData01Like(String value) {
            addCriterion("DATA01 like", value, "data01");
            return (Criteria) this;
        }

        public Criteria andData01NotLike(String value) {
            addCriterion("DATA01 not like", value, "data01");
            return (Criteria) this;
        }

        public Criteria andData01In(List<String> values) {
            addCriterion("DATA01 in", values, "data01");
            return (Criteria) this;
        }

        public Criteria andData01NotIn(List<String> values) {
            addCriterion("DATA01 not in", values, "data01");
            return (Criteria) this;
        }

        public Criteria andData01Between(String value1, String value2) {
            addCriterion("DATA01 between", value1, value2, "data01");
            return (Criteria) this;
        }

        public Criteria andData01NotBetween(String value1, String value2) {
            addCriterion("DATA01 not between", value1, value2, "data01");
            return (Criteria) this;
        }

        public Criteria andData02IsNull() {
            addCriterion("DATA02 is null");
            return (Criteria) this;
        }

        public Criteria andData02IsNotNull() {
            addCriterion("DATA02 is not null");
            return (Criteria) this;
        }

        public Criteria andData02EqualTo(String value) {
            addCriterion("DATA02 =", value, "data02");
            return (Criteria) this;
        }

        public Criteria andData02NotEqualTo(String value) {
            addCriterion("DATA02 <>", value, "data02");
            return (Criteria) this;
        }

        public Criteria andData02GreaterThan(String value) {
            addCriterion("DATA02 >", value, "data02");
            return (Criteria) this;
        }

        public Criteria andData02GreaterThanOrEqualTo(String value) {
            addCriterion("DATA02 >=", value, "data02");
            return (Criteria) this;
        }

        public Criteria andData02LessThan(String value) {
            addCriterion("DATA02 <", value, "data02");
            return (Criteria) this;
        }

        public Criteria andData02LessThanOrEqualTo(String value) {
            addCriterion("DATA02 <=", value, "data02");
            return (Criteria) this;
        }

        public Criteria andData02Like(String value) {
            addCriterion("DATA02 like", value, "data02");
            return (Criteria) this;
        }

        public Criteria andData02NotLike(String value) {
            addCriterion("DATA02 not like", value, "data02");
            return (Criteria) this;
        }

        public Criteria andData02In(List<String> values) {
            addCriterion("DATA02 in", values, "data02");
            return (Criteria) this;
        }

        public Criteria andData02NotIn(List<String> values) {
            addCriterion("DATA02 not in", values, "data02");
            return (Criteria) this;
        }

        public Criteria andData02Between(String value1, String value2) {
            addCriterion("DATA02 between", value1, value2, "data02");
            return (Criteria) this;
        }

        public Criteria andData02NotBetween(String value1, String value2) {
            addCriterion("DATA02 not between", value1, value2, "data02");
            return (Criteria) this;
        }

        public Criteria andData03IsNull() {
            addCriterion("DATA03 is null");
            return (Criteria) this;
        }

        public Criteria andData03IsNotNull() {
            addCriterion("DATA03 is not null");
            return (Criteria) this;
        }

        public Criteria andData03EqualTo(String value) {
            addCriterion("DATA03 =", value, "data03");
            return (Criteria) this;
        }

        public Criteria andData03NotEqualTo(String value) {
            addCriterion("DATA03 <>", value, "data03");
            return (Criteria) this;
        }

        public Criteria andData03GreaterThan(String value) {
            addCriterion("DATA03 >", value, "data03");
            return (Criteria) this;
        }

        public Criteria andData03GreaterThanOrEqualTo(String value) {
            addCriterion("DATA03 >=", value, "data03");
            return (Criteria) this;
        }

        public Criteria andData03LessThan(String value) {
            addCriterion("DATA03 <", value, "data03");
            return (Criteria) this;
        }

        public Criteria andData03LessThanOrEqualTo(String value) {
            addCriterion("DATA03 <=", value, "data03");
            return (Criteria) this;
        }

        public Criteria andData03Like(String value) {
            addCriterion("DATA03 like", value, "data03");
            return (Criteria) this;
        }

        public Criteria andData03NotLike(String value) {
            addCriterion("DATA03 not like", value, "data03");
            return (Criteria) this;
        }

        public Criteria andData03In(List<String> values) {
            addCriterion("DATA03 in", values, "data03");
            return (Criteria) this;
        }

        public Criteria andData03NotIn(List<String> values) {
            addCriterion("DATA03 not in", values, "data03");
            return (Criteria) this;
        }

        public Criteria andData03Between(String value1, String value2) {
            addCriterion("DATA03 between", value1, value2, "data03");
            return (Criteria) this;
        }

        public Criteria andData03NotBetween(String value1, String value2) {
            addCriterion("DATA03 not between", value1, value2, "data03");
            return (Criteria) this;
        }

        public Criteria andData04IsNull() {
            addCriterion("DATA04 is null");
            return (Criteria) this;
        }

        public Criteria andData04IsNotNull() {
            addCriterion("DATA04 is not null");
            return (Criteria) this;
        }

        public Criteria andData04EqualTo(String value) {
            addCriterion("DATA04 =", value, "data04");
            return (Criteria) this;
        }

        public Criteria andData04NotEqualTo(String value) {
            addCriterion("DATA04 <>", value, "data04");
            return (Criteria) this;
        }

        public Criteria andData04GreaterThan(String value) {
            addCriterion("DATA04 >", value, "data04");
            return (Criteria) this;
        }

        public Criteria andData04GreaterThanOrEqualTo(String value) {
            addCriterion("DATA04 >=", value, "data04");
            return (Criteria) this;
        }

        public Criteria andData04LessThan(String value) {
            addCriterion("DATA04 <", value, "data04");
            return (Criteria) this;
        }

        public Criteria andData04LessThanOrEqualTo(String value) {
            addCriterion("DATA04 <=", value, "data04");
            return (Criteria) this;
        }

        public Criteria andData04Like(String value) {
            addCriterion("DATA04 like", value, "data04");
            return (Criteria) this;
        }

        public Criteria andData04NotLike(String value) {
            addCriterion("DATA04 not like", value, "data04");
            return (Criteria) this;
        }

        public Criteria andData04In(List<String> values) {
            addCriterion("DATA04 in", values, "data04");
            return (Criteria) this;
        }

        public Criteria andData04NotIn(List<String> values) {
            addCriterion("DATA04 not in", values, "data04");
            return (Criteria) this;
        }

        public Criteria andData04Between(String value1, String value2) {
            addCriterion("DATA04 between", value1, value2, "data04");
            return (Criteria) this;
        }

        public Criteria andData04NotBetween(String value1, String value2) {
            addCriterion("DATA04 not between", value1, value2, "data04");
            return (Criteria) this;
        }

        public Criteria andData05IsNull() {
            addCriterion("DATA05 is null");
            return (Criteria) this;
        }

        public Criteria andData05IsNotNull() {
            addCriterion("DATA05 is not null");
            return (Criteria) this;
        }

        public Criteria andData05EqualTo(String value) {
            addCriterion("DATA05 =", value, "data05");
            return (Criteria) this;
        }

        public Criteria andData05NotEqualTo(String value) {
            addCriterion("DATA05 <>", value, "data05");
            return (Criteria) this;
        }

        public Criteria andData05GreaterThan(String value) {
            addCriterion("DATA05 >", value, "data05");
            return (Criteria) this;
        }

        public Criteria andData05GreaterThanOrEqualTo(String value) {
            addCriterion("DATA05 >=", value, "data05");
            return (Criteria) this;
        }

        public Criteria andData05LessThan(String value) {
            addCriterion("DATA05 <", value, "data05");
            return (Criteria) this;
        }

        public Criteria andData05LessThanOrEqualTo(String value) {
            addCriterion("DATA05 <=", value, "data05");
            return (Criteria) this;
        }

        public Criteria andData05Like(String value) {
            addCriterion("DATA05 like", value, "data05");
            return (Criteria) this;
        }

        public Criteria andData05NotLike(String value) {
            addCriterion("DATA05 not like", value, "data05");
            return (Criteria) this;
        }

        public Criteria andData05In(List<String> values) {
            addCriterion("DATA05 in", values, "data05");
            return (Criteria) this;
        }

        public Criteria andData05NotIn(List<String> values) {
            addCriterion("DATA05 not in", values, "data05");
            return (Criteria) this;
        }

        public Criteria andData05Between(String value1, String value2) {
            addCriterion("DATA05 between", value1, value2, "data05");
            return (Criteria) this;
        }

        public Criteria andData05NotBetween(String value1, String value2) {
            addCriterion("DATA05 not between", value1, value2, "data05");
            return (Criteria) this;
        }

        public Criteria andData06IsNull() {
            addCriterion("DATA06 is null");
            return (Criteria) this;
        }

        public Criteria andData06IsNotNull() {
            addCriterion("DATA06 is not null");
            return (Criteria) this;
        }

        public Criteria andData06EqualTo(String value) {
            addCriterion("DATA06 =", value, "data06");
            return (Criteria) this;
        }

        public Criteria andData06NotEqualTo(String value) {
            addCriterion("DATA06 <>", value, "data06");
            return (Criteria) this;
        }

        public Criteria andData06GreaterThan(String value) {
            addCriterion("DATA06 >", value, "data06");
            return (Criteria) this;
        }

        public Criteria andData06GreaterThanOrEqualTo(String value) {
            addCriterion("DATA06 >=", value, "data06");
            return (Criteria) this;
        }

        public Criteria andData06LessThan(String value) {
            addCriterion("DATA06 <", value, "data06");
            return (Criteria) this;
        }

        public Criteria andData06LessThanOrEqualTo(String value) {
            addCriterion("DATA06 <=", value, "data06");
            return (Criteria) this;
        }

        public Criteria andData06Like(String value) {
            addCriterion("DATA06 like", value, "data06");
            return (Criteria) this;
        }

        public Criteria andData06NotLike(String value) {
            addCriterion("DATA06 not like", value, "data06");
            return (Criteria) this;
        }

        public Criteria andData06In(List<String> values) {
            addCriterion("DATA06 in", values, "data06");
            return (Criteria) this;
        }

        public Criteria andData06NotIn(List<String> values) {
            addCriterion("DATA06 not in", values, "data06");
            return (Criteria) this;
        }

        public Criteria andData06Between(String value1, String value2) {
            addCriterion("DATA06 between", value1, value2, "data06");
            return (Criteria) this;
        }

        public Criteria andData06NotBetween(String value1, String value2) {
            addCriterion("DATA06 not between", value1, value2, "data06");
            return (Criteria) this;
        }

        public Criteria andData07IsNull() {
            addCriterion("DATA07 is null");
            return (Criteria) this;
        }

        public Criteria andData07IsNotNull() {
            addCriterion("DATA07 is not null");
            return (Criteria) this;
        }

        public Criteria andData07EqualTo(String value) {
            addCriterion("DATA07 =", value, "data07");
            return (Criteria) this;
        }

        public Criteria andData07NotEqualTo(String value) {
            addCriterion("DATA07 <>", value, "data07");
            return (Criteria) this;
        }

        public Criteria andData07GreaterThan(String value) {
            addCriterion("DATA07 >", value, "data07");
            return (Criteria) this;
        }

        public Criteria andData07GreaterThanOrEqualTo(String value) {
            addCriterion("DATA07 >=", value, "data07");
            return (Criteria) this;
        }

        public Criteria andData07LessThan(String value) {
            addCriterion("DATA07 <", value, "data07");
            return (Criteria) this;
        }

        public Criteria andData07LessThanOrEqualTo(String value) {
            addCriterion("DATA07 <=", value, "data07");
            return (Criteria) this;
        }

        public Criteria andData07Like(String value) {
            addCriterion("DATA07 like", value, "data07");
            return (Criteria) this;
        }

        public Criteria andData07NotLike(String value) {
            addCriterion("DATA07 not like", value, "data07");
            return (Criteria) this;
        }

        public Criteria andData07In(List<String> values) {
            addCriterion("DATA07 in", values, "data07");
            return (Criteria) this;
        }

        public Criteria andData07NotIn(List<String> values) {
            addCriterion("DATA07 not in", values, "data07");
            return (Criteria) this;
        }

        public Criteria andData07Between(String value1, String value2) {
            addCriterion("DATA07 between", value1, value2, "data07");
            return (Criteria) this;
        }

        public Criteria andData07NotBetween(String value1, String value2) {
            addCriterion("DATA07 not between", value1, value2, "data07");
            return (Criteria) this;
        }

        public Criteria andData08IsNull() {
            addCriterion("DATA08 is null");
            return (Criteria) this;
        }

        public Criteria andData08IsNotNull() {
            addCriterion("DATA08 is not null");
            return (Criteria) this;
        }

        public Criteria andData08EqualTo(String value) {
            addCriterion("DATA08 =", value, "data08");
            return (Criteria) this;
        }

        public Criteria andData08NotEqualTo(String value) {
            addCriterion("DATA08 <>", value, "data08");
            return (Criteria) this;
        }

        public Criteria andData08GreaterThan(String value) {
            addCriterion("DATA08 >", value, "data08");
            return (Criteria) this;
        }

        public Criteria andData08GreaterThanOrEqualTo(String value) {
            addCriterion("DATA08 >=", value, "data08");
            return (Criteria) this;
        }

        public Criteria andData08LessThan(String value) {
            addCriterion("DATA08 <", value, "data08");
            return (Criteria) this;
        }

        public Criteria andData08LessThanOrEqualTo(String value) {
            addCriterion("DATA08 <=", value, "data08");
            return (Criteria) this;
        }

        public Criteria andData08Like(String value) {
            addCriterion("DATA08 like", value, "data08");
            return (Criteria) this;
        }

        public Criteria andData08NotLike(String value) {
            addCriterion("DATA08 not like", value, "data08");
            return (Criteria) this;
        }

        public Criteria andData08In(List<String> values) {
            addCriterion("DATA08 in", values, "data08");
            return (Criteria) this;
        }

        public Criteria andData08NotIn(List<String> values) {
            addCriterion("DATA08 not in", values, "data08");
            return (Criteria) this;
        }

        public Criteria andData08Between(String value1, String value2) {
            addCriterion("DATA08 between", value1, value2, "data08");
            return (Criteria) this;
        }

        public Criteria andData08NotBetween(String value1, String value2) {
            addCriterion("DATA08 not between", value1, value2, "data08");
            return (Criteria) this;
        }

        public Criteria andData09IsNull() {
            addCriterion("DATA09 is null");
            return (Criteria) this;
        }

        public Criteria andData09IsNotNull() {
            addCriterion("DATA09 is not null");
            return (Criteria) this;
        }

        public Criteria andData09EqualTo(String value) {
            addCriterion("DATA09 =", value, "data09");
            return (Criteria) this;
        }

        public Criteria andData09NotEqualTo(String value) {
            addCriterion("DATA09 <>", value, "data09");
            return (Criteria) this;
        }

        public Criteria andData09GreaterThan(String value) {
            addCriterion("DATA09 >", value, "data09");
            return (Criteria) this;
        }

        public Criteria andData09GreaterThanOrEqualTo(String value) {
            addCriterion("DATA09 >=", value, "data09");
            return (Criteria) this;
        }

        public Criteria andData09LessThan(String value) {
            addCriterion("DATA09 <", value, "data09");
            return (Criteria) this;
        }

        public Criteria andData09LessThanOrEqualTo(String value) {
            addCriterion("DATA09 <=", value, "data09");
            return (Criteria) this;
        }

        public Criteria andData09Like(String value) {
            addCriterion("DATA09 like", value, "data09");
            return (Criteria) this;
        }

        public Criteria andData09NotLike(String value) {
            addCriterion("DATA09 not like", value, "data09");
            return (Criteria) this;
        }

        public Criteria andData09In(List<String> values) {
            addCriterion("DATA09 in", values, "data09");
            return (Criteria) this;
        }

        public Criteria andData09NotIn(List<String> values) {
            addCriterion("DATA09 not in", values, "data09");
            return (Criteria) this;
        }

        public Criteria andData09Between(String value1, String value2) {
            addCriterion("DATA09 between", value1, value2, "data09");
            return (Criteria) this;
        }

        public Criteria andData09NotBetween(String value1, String value2) {
            addCriterion("DATA09 not between", value1, value2, "data09");
            return (Criteria) this;
        }

        public Criteria andData10IsNull() {
            addCriterion("DATA10 is null");
            return (Criteria) this;
        }

        public Criteria andData10IsNotNull() {
            addCriterion("DATA10 is not null");
            return (Criteria) this;
        }

        public Criteria andData10EqualTo(String value) {
            addCriterion("DATA10 =", value, "data10");
            return (Criteria) this;
        }

        public Criteria andData10NotEqualTo(String value) {
            addCriterion("DATA10 <>", value, "data10");
            return (Criteria) this;
        }

        public Criteria andData10GreaterThan(String value) {
            addCriterion("DATA10 >", value, "data10");
            return (Criteria) this;
        }

        public Criteria andData10GreaterThanOrEqualTo(String value) {
            addCriterion("DATA10 >=", value, "data10");
            return (Criteria) this;
        }

        public Criteria andData10LessThan(String value) {
            addCriterion("DATA10 <", value, "data10");
            return (Criteria) this;
        }

        public Criteria andData10LessThanOrEqualTo(String value) {
            addCriterion("DATA10 <=", value, "data10");
            return (Criteria) this;
        }

        public Criteria andData10Like(String value) {
            addCriterion("DATA10 like", value, "data10");
            return (Criteria) this;
        }

        public Criteria andData10NotLike(String value) {
            addCriterion("DATA10 not like", value, "data10");
            return (Criteria) this;
        }

        public Criteria andData10In(List<String> values) {
            addCriterion("DATA10 in", values, "data10");
            return (Criteria) this;
        }

        public Criteria andData10NotIn(List<String> values) {
            addCriterion("DATA10 not in", values, "data10");
            return (Criteria) this;
        }

        public Criteria andData10Between(String value1, String value2) {
            addCriterion("DATA10 between", value1, value2, "data10");
            return (Criteria) this;
        }

        public Criteria andData10NotBetween(String value1, String value2) {
            addCriterion("DATA10 not between", value1, value2, "data10");
            return (Criteria) this;
        }

        public Criteria andData11IsNull() {
            addCriterion("DATA11 is null");
            return (Criteria) this;
        }

        public Criteria andData11IsNotNull() {
            addCriterion("DATA11 is not null");
            return (Criteria) this;
        }

        public Criteria andData11EqualTo(String value) {
            addCriterion("DATA11 =", value, "data11");
            return (Criteria) this;
        }

        public Criteria andData11NotEqualTo(String value) {
            addCriterion("DATA11 <>", value, "data11");
            return (Criteria) this;
        }

        public Criteria andData11GreaterThan(String value) {
            addCriterion("DATA11 >", value, "data11");
            return (Criteria) this;
        }

        public Criteria andData11GreaterThanOrEqualTo(String value) {
            addCriterion("DATA11 >=", value, "data11");
            return (Criteria) this;
        }

        public Criteria andData11LessThan(String value) {
            addCriterion("DATA11 <", value, "data11");
            return (Criteria) this;
        }

        public Criteria andData11LessThanOrEqualTo(String value) {
            addCriterion("DATA11 <=", value, "data11");
            return (Criteria) this;
        }

        public Criteria andData11Like(String value) {
            addCriterion("DATA11 like", value, "data11");
            return (Criteria) this;
        }

        public Criteria andData11NotLike(String value) {
            addCriterion("DATA11 not like", value, "data11");
            return (Criteria) this;
        }

        public Criteria andData11In(List<String> values) {
            addCriterion("DATA11 in", values, "data11");
            return (Criteria) this;
        }

        public Criteria andData11NotIn(List<String> values) {
            addCriterion("DATA11 not in", values, "data11");
            return (Criteria) this;
        }

        public Criteria andData11Between(String value1, String value2) {
            addCriterion("DATA11 between", value1, value2, "data11");
            return (Criteria) this;
        }

        public Criteria andData11NotBetween(String value1, String value2) {
            addCriterion("DATA11 not between", value1, value2, "data11");
            return (Criteria) this;
        }

        public Criteria andData12IsNull() {
            addCriterion("DATA12 is null");
            return (Criteria) this;
        }

        public Criteria andData12IsNotNull() {
            addCriterion("DATA12 is not null");
            return (Criteria) this;
        }

        public Criteria andData12EqualTo(String value) {
            addCriterion("DATA12 =", value, "data12");
            return (Criteria) this;
        }

        public Criteria andData12NotEqualTo(String value) {
            addCriterion("DATA12 <>", value, "data12");
            return (Criteria) this;
        }

        public Criteria andData12GreaterThan(String value) {
            addCriterion("DATA12 >", value, "data12");
            return (Criteria) this;
        }

        public Criteria andData12GreaterThanOrEqualTo(String value) {
            addCriterion("DATA12 >=", value, "data12");
            return (Criteria) this;
        }

        public Criteria andData12LessThan(String value) {
            addCriterion("DATA12 <", value, "data12");
            return (Criteria) this;
        }

        public Criteria andData12LessThanOrEqualTo(String value) {
            addCriterion("DATA12 <=", value, "data12");
            return (Criteria) this;
        }

        public Criteria andData12Like(String value) {
            addCriterion("DATA12 like", value, "data12");
            return (Criteria) this;
        }

        public Criteria andData12NotLike(String value) {
            addCriterion("DATA12 not like", value, "data12");
            return (Criteria) this;
        }

        public Criteria andData12In(List<String> values) {
            addCriterion("DATA12 in", values, "data12");
            return (Criteria) this;
        }

        public Criteria andData12NotIn(List<String> values) {
            addCriterion("DATA12 not in", values, "data12");
            return (Criteria) this;
        }

        public Criteria andData12Between(String value1, String value2) {
            addCriterion("DATA12 between", value1, value2, "data12");
            return (Criteria) this;
        }

        public Criteria andData12NotBetween(String value1, String value2) {
            addCriterion("DATA12 not between", value1, value2, "data12");
            return (Criteria) this;
        }

        public Criteria andData13IsNull() {
            addCriterion("DATA13 is null");
            return (Criteria) this;
        }

        public Criteria andData13IsNotNull() {
            addCriterion("DATA13 is not null");
            return (Criteria) this;
        }

        public Criteria andData13EqualTo(String value) {
            addCriterion("DATA13 =", value, "data13");
            return (Criteria) this;
        }

        public Criteria andData13NotEqualTo(String value) {
            addCriterion("DATA13 <>", value, "data13");
            return (Criteria) this;
        }

        public Criteria andData13GreaterThan(String value) {
            addCriterion("DATA13 >", value, "data13");
            return (Criteria) this;
        }

        public Criteria andData13GreaterThanOrEqualTo(String value) {
            addCriterion("DATA13 >=", value, "data13");
            return (Criteria) this;
        }

        public Criteria andData13LessThan(String value) {
            addCriterion("DATA13 <", value, "data13");
            return (Criteria) this;
        }

        public Criteria andData13LessThanOrEqualTo(String value) {
            addCriterion("DATA13 <=", value, "data13");
            return (Criteria) this;
        }

        public Criteria andData13Like(String value) {
            addCriterion("DATA13 like", value, "data13");
            return (Criteria) this;
        }

        public Criteria andData13NotLike(String value) {
            addCriterion("DATA13 not like", value, "data13");
            return (Criteria) this;
        }

        public Criteria andData13In(List<String> values) {
            addCriterion("DATA13 in", values, "data13");
            return (Criteria) this;
        }

        public Criteria andData13NotIn(List<String> values) {
            addCriterion("DATA13 not in", values, "data13");
            return (Criteria) this;
        }

        public Criteria andData13Between(String value1, String value2) {
            addCriterion("DATA13 between", value1, value2, "data13");
            return (Criteria) this;
        }

        public Criteria andData13NotBetween(String value1, String value2) {
            addCriterion("DATA13 not between", value1, value2, "data13");
            return (Criteria) this;
        }

        public Criteria andData14IsNull() {
            addCriterion("DATA14 is null");
            return (Criteria) this;
        }

        public Criteria andData14IsNotNull() {
            addCriterion("DATA14 is not null");
            return (Criteria) this;
        }

        public Criteria andData14EqualTo(String value) {
            addCriterion("DATA14 =", value, "data14");
            return (Criteria) this;
        }

        public Criteria andData14NotEqualTo(String value) {
            addCriterion("DATA14 <>", value, "data14");
            return (Criteria) this;
        }

        public Criteria andData14GreaterThan(String value) {
            addCriterion("DATA14 >", value, "data14");
            return (Criteria) this;
        }

        public Criteria andData14GreaterThanOrEqualTo(String value) {
            addCriterion("DATA14 >=", value, "data14");
            return (Criteria) this;
        }

        public Criteria andData14LessThan(String value) {
            addCriterion("DATA14 <", value, "data14");
            return (Criteria) this;
        }

        public Criteria andData14LessThanOrEqualTo(String value) {
            addCriterion("DATA14 <=", value, "data14");
            return (Criteria) this;
        }

        public Criteria andData14Like(String value) {
            addCriterion("DATA14 like", value, "data14");
            return (Criteria) this;
        }

        public Criteria andData14NotLike(String value) {
            addCriterion("DATA14 not like", value, "data14");
            return (Criteria) this;
        }

        public Criteria andData14In(List<String> values) {
            addCriterion("DATA14 in", values, "data14");
            return (Criteria) this;
        }

        public Criteria andData14NotIn(List<String> values) {
            addCriterion("DATA14 not in", values, "data14");
            return (Criteria) this;
        }

        public Criteria andData14Between(String value1, String value2) {
            addCriterion("DATA14 between", value1, value2, "data14");
            return (Criteria) this;
        }

        public Criteria andData14NotBetween(String value1, String value2) {
            addCriterion("DATA14 not between", value1, value2, "data14");
            return (Criteria) this;
        }

        public Criteria andData15IsNull() {
            addCriterion("DATA15 is null");
            return (Criteria) this;
        }

        public Criteria andData15IsNotNull() {
            addCriterion("DATA15 is not null");
            return (Criteria) this;
        }

        public Criteria andData15EqualTo(String value) {
            addCriterion("DATA15 =", value, "data15");
            return (Criteria) this;
        }

        public Criteria andData15NotEqualTo(String value) {
            addCriterion("DATA15 <>", value, "data15");
            return (Criteria) this;
        }

        public Criteria andData15GreaterThan(String value) {
            addCriterion("DATA15 >", value, "data15");
            return (Criteria) this;
        }

        public Criteria andData15GreaterThanOrEqualTo(String value) {
            addCriterion("DATA15 >=", value, "data15");
            return (Criteria) this;
        }

        public Criteria andData15LessThan(String value) {
            addCriterion("DATA15 <", value, "data15");
            return (Criteria) this;
        }

        public Criteria andData15LessThanOrEqualTo(String value) {
            addCriterion("DATA15 <=", value, "data15");
            return (Criteria) this;
        }

        public Criteria andData15Like(String value) {
            addCriterion("DATA15 like", value, "data15");
            return (Criteria) this;
        }

        public Criteria andData15NotLike(String value) {
            addCriterion("DATA15 not like", value, "data15");
            return (Criteria) this;
        }

        public Criteria andData15In(List<String> values) {
            addCriterion("DATA15 in", values, "data15");
            return (Criteria) this;
        }

        public Criteria andData15NotIn(List<String> values) {
            addCriterion("DATA15 not in", values, "data15");
            return (Criteria) this;
        }

        public Criteria andData15Between(String value1, String value2) {
            addCriterion("DATA15 between", value1, value2, "data15");
            return (Criteria) this;
        }

        public Criteria andData15NotBetween(String value1, String value2) {
            addCriterion("DATA15 not between", value1, value2, "data15");
            return (Criteria) this;
        }

        public Criteria andData16IsNull() {
            addCriterion("DATA16 is null");
            return (Criteria) this;
        }

        public Criteria andData16IsNotNull() {
            addCriterion("DATA16 is not null");
            return (Criteria) this;
        }

        public Criteria andData16EqualTo(String value) {
            addCriterion("DATA16 =", value, "data16");
            return (Criteria) this;
        }

        public Criteria andData16NotEqualTo(String value) {
            addCriterion("DATA16 <>", value, "data16");
            return (Criteria) this;
        }

        public Criteria andData16GreaterThan(String value) {
            addCriterion("DATA16 >", value, "data16");
            return (Criteria) this;
        }

        public Criteria andData16GreaterThanOrEqualTo(String value) {
            addCriterion("DATA16 >=", value, "data16");
            return (Criteria) this;
        }

        public Criteria andData16LessThan(String value) {
            addCriterion("DATA16 <", value, "data16");
            return (Criteria) this;
        }

        public Criteria andData16LessThanOrEqualTo(String value) {
            addCriterion("DATA16 <=", value, "data16");
            return (Criteria) this;
        }

        public Criteria andData16Like(String value) {
            addCriterion("DATA16 like", value, "data16");
            return (Criteria) this;
        }

        public Criteria andData16NotLike(String value) {
            addCriterion("DATA16 not like", value, "data16");
            return (Criteria) this;
        }

        public Criteria andData16In(List<String> values) {
            addCriterion("DATA16 in", values, "data16");
            return (Criteria) this;
        }

        public Criteria andData16NotIn(List<String> values) {
            addCriterion("DATA16 not in", values, "data16");
            return (Criteria) this;
        }

        public Criteria andData16Between(String value1, String value2) {
            addCriterion("DATA16 between", value1, value2, "data16");
            return (Criteria) this;
        }

        public Criteria andData16NotBetween(String value1, String value2) {
            addCriterion("DATA16 not between", value1, value2, "data16");
            return (Criteria) this;
        }

        public Criteria andData17IsNull() {
            addCriterion("DATA17 is null");
            return (Criteria) this;
        }

        public Criteria andData17IsNotNull() {
            addCriterion("DATA17 is not null");
            return (Criteria) this;
        }

        public Criteria andData17EqualTo(String value) {
            addCriterion("DATA17 =", value, "data17");
            return (Criteria) this;
        }

        public Criteria andData17NotEqualTo(String value) {
            addCriterion("DATA17 <>", value, "data17");
            return (Criteria) this;
        }

        public Criteria andData17GreaterThan(String value) {
            addCriterion("DATA17 >", value, "data17");
            return (Criteria) this;
        }

        public Criteria andData17GreaterThanOrEqualTo(String value) {
            addCriterion("DATA17 >=", value, "data17");
            return (Criteria) this;
        }

        public Criteria andData17LessThan(String value) {
            addCriterion("DATA17 <", value, "data17");
            return (Criteria) this;
        }

        public Criteria andData17LessThanOrEqualTo(String value) {
            addCriterion("DATA17 <=", value, "data17");
            return (Criteria) this;
        }

        public Criteria andData17Like(String value) {
            addCriterion("DATA17 like", value, "data17");
            return (Criteria) this;
        }

        public Criteria andData17NotLike(String value) {
            addCriterion("DATA17 not like", value, "data17");
            return (Criteria) this;
        }

        public Criteria andData17In(List<String> values) {
            addCriterion("DATA17 in", values, "data17");
            return (Criteria) this;
        }

        public Criteria andData17NotIn(List<String> values) {
            addCriterion("DATA17 not in", values, "data17");
            return (Criteria) this;
        }

        public Criteria andData17Between(String value1, String value2) {
            addCriterion("DATA17 between", value1, value2, "data17");
            return (Criteria) this;
        }

        public Criteria andData17NotBetween(String value1, String value2) {
            addCriterion("DATA17 not between", value1, value2, "data17");
            return (Criteria) this;
        }

        public Criteria andData18IsNull() {
            addCriterion("DATA18 is null");
            return (Criteria) this;
        }

        public Criteria andData18IsNotNull() {
            addCriterion("DATA18 is not null");
            return (Criteria) this;
        }

        public Criteria andData18EqualTo(String value) {
            addCriterion("DATA18 =", value, "data18");
            return (Criteria) this;
        }

        public Criteria andData18NotEqualTo(String value) {
            addCriterion("DATA18 <>", value, "data18");
            return (Criteria) this;
        }

        public Criteria andData18GreaterThan(String value) {
            addCriterion("DATA18 >", value, "data18");
            return (Criteria) this;
        }

        public Criteria andData18GreaterThanOrEqualTo(String value) {
            addCriterion("DATA18 >=", value, "data18");
            return (Criteria) this;
        }

        public Criteria andData18LessThan(String value) {
            addCriterion("DATA18 <", value, "data18");
            return (Criteria) this;
        }

        public Criteria andData18LessThanOrEqualTo(String value) {
            addCriterion("DATA18 <=", value, "data18");
            return (Criteria) this;
        }

        public Criteria andData18Like(String value) {
            addCriterion("DATA18 like", value, "data18");
            return (Criteria) this;
        }

        public Criteria andData18NotLike(String value) {
            addCriterion("DATA18 not like", value, "data18");
            return (Criteria) this;
        }

        public Criteria andData18In(List<String> values) {
            addCriterion("DATA18 in", values, "data18");
            return (Criteria) this;
        }

        public Criteria andData18NotIn(List<String> values) {
            addCriterion("DATA18 not in", values, "data18");
            return (Criteria) this;
        }

        public Criteria andData18Between(String value1, String value2) {
            addCriterion("DATA18 between", value1, value2, "data18");
            return (Criteria) this;
        }

        public Criteria andData18NotBetween(String value1, String value2) {
            addCriterion("DATA18 not between", value1, value2, "data18");
            return (Criteria) this;
        }

        public Criteria andData19IsNull() {
            addCriterion("DATA19 is null");
            return (Criteria) this;
        }

        public Criteria andData19IsNotNull() {
            addCriterion("DATA19 is not null");
            return (Criteria) this;
        }

        public Criteria andData19EqualTo(String value) {
            addCriterion("DATA19 =", value, "data19");
            return (Criteria) this;
        }

        public Criteria andData19NotEqualTo(String value) {
            addCriterion("DATA19 <>", value, "data19");
            return (Criteria) this;
        }

        public Criteria andData19GreaterThan(String value) {
            addCriterion("DATA19 >", value, "data19");
            return (Criteria) this;
        }

        public Criteria andData19GreaterThanOrEqualTo(String value) {
            addCriterion("DATA19 >=", value, "data19");
            return (Criteria) this;
        }

        public Criteria andData19LessThan(String value) {
            addCriterion("DATA19 <", value, "data19");
            return (Criteria) this;
        }

        public Criteria andData19LessThanOrEqualTo(String value) {
            addCriterion("DATA19 <=", value, "data19");
            return (Criteria) this;
        }

        public Criteria andData19Like(String value) {
            addCriterion("DATA19 like", value, "data19");
            return (Criteria) this;
        }

        public Criteria andData19NotLike(String value) {
            addCriterion("DATA19 not like", value, "data19");
            return (Criteria) this;
        }

        public Criteria andData19In(List<String> values) {
            addCriterion("DATA19 in", values, "data19");
            return (Criteria) this;
        }

        public Criteria andData19NotIn(List<String> values) {
            addCriterion("DATA19 not in", values, "data19");
            return (Criteria) this;
        }

        public Criteria andData19Between(String value1, String value2) {
            addCriterion("DATA19 between", value1, value2, "data19");
            return (Criteria) this;
        }

        public Criteria andData19NotBetween(String value1, String value2) {
            addCriterion("DATA19 not between", value1, value2, "data19");
            return (Criteria) this;
        }

        public Criteria andData20IsNull() {
            addCriterion("DATA20 is null");
            return (Criteria) this;
        }

        public Criteria andData20IsNotNull() {
            addCriterion("DATA20 is not null");
            return (Criteria) this;
        }

        public Criteria andData20EqualTo(String value) {
            addCriterion("DATA20 =", value, "data20");
            return (Criteria) this;
        }

        public Criteria andData20NotEqualTo(String value) {
            addCriterion("DATA20 <>", value, "data20");
            return (Criteria) this;
        }

        public Criteria andData20GreaterThan(String value) {
            addCriterion("DATA20 >", value, "data20");
            return (Criteria) this;
        }

        public Criteria andData20GreaterThanOrEqualTo(String value) {
            addCriterion("DATA20 >=", value, "data20");
            return (Criteria) this;
        }

        public Criteria andData20LessThan(String value) {
            addCriterion("DATA20 <", value, "data20");
            return (Criteria) this;
        }

        public Criteria andData20LessThanOrEqualTo(String value) {
            addCriterion("DATA20 <=", value, "data20");
            return (Criteria) this;
        }

        public Criteria andData20Like(String value) {
            addCriterion("DATA20 like", value, "data20");
            return (Criteria) this;
        }

        public Criteria andData20NotLike(String value) {
            addCriterion("DATA20 not like", value, "data20");
            return (Criteria) this;
        }

        public Criteria andData20In(List<String> values) {
            addCriterion("DATA20 in", values, "data20");
            return (Criteria) this;
        }

        public Criteria andData20NotIn(List<String> values) {
            addCriterion("DATA20 not in", values, "data20");
            return (Criteria) this;
        }

        public Criteria andData20Between(String value1, String value2) {
            addCriterion("DATA20 between", value1, value2, "data20");
            return (Criteria) this;
        }

        public Criteria andData20NotBetween(String value1, String value2) {
            addCriterion("DATA20 not between", value1, value2, "data20");
            return (Criteria) this;
        }

        public Criteria andData21IsNull() {
            addCriterion("DATA21 is null");
            return (Criteria) this;
        }

        public Criteria andData21IsNotNull() {
            addCriterion("DATA21 is not null");
            return (Criteria) this;
        }

        public Criteria andData21EqualTo(String value) {
            addCriterion("DATA21 =", value, "data21");
            return (Criteria) this;
        }

        public Criteria andData21NotEqualTo(String value) {
            addCriterion("DATA21 <>", value, "data21");
            return (Criteria) this;
        }

        public Criteria andData21GreaterThan(String value) {
            addCriterion("DATA21 >", value, "data21");
            return (Criteria) this;
        }

        public Criteria andData21GreaterThanOrEqualTo(String value) {
            addCriterion("DATA21 >=", value, "data21");
            return (Criteria) this;
        }

        public Criteria andData21LessThan(String value) {
            addCriterion("DATA21 <", value, "data21");
            return (Criteria) this;
        }

        public Criteria andData21LessThanOrEqualTo(String value) {
            addCriterion("DATA21 <=", value, "data21");
            return (Criteria) this;
        }

        public Criteria andData21Like(String value) {
            addCriterion("DATA21 like", value, "data21");
            return (Criteria) this;
        }

        public Criteria andData21NotLike(String value) {
            addCriterion("DATA21 not like", value, "data21");
            return (Criteria) this;
        }

        public Criteria andData21In(List<String> values) {
            addCriterion("DATA21 in", values, "data21");
            return (Criteria) this;
        }

        public Criteria andData21NotIn(List<String> values) {
            addCriterion("DATA21 not in", values, "data21");
            return (Criteria) this;
        }

        public Criteria andData21Between(String value1, String value2) {
            addCriterion("DATA21 between", value1, value2, "data21");
            return (Criteria) this;
        }

        public Criteria andData21NotBetween(String value1, String value2) {
            addCriterion("DATA21 not between", value1, value2, "data21");
            return (Criteria) this;
        }

        public Criteria andData22IsNull() {
            addCriterion("DATA22 is null");
            return (Criteria) this;
        }

        public Criteria andData22IsNotNull() {
            addCriterion("DATA22 is not null");
            return (Criteria) this;
        }

        public Criteria andData22EqualTo(String value) {
            addCriterion("DATA22 =", value, "data22");
            return (Criteria) this;
        }

        public Criteria andData22NotEqualTo(String value) {
            addCriterion("DATA22 <>", value, "data22");
            return (Criteria) this;
        }

        public Criteria andData22GreaterThan(String value) {
            addCriterion("DATA22 >", value, "data22");
            return (Criteria) this;
        }

        public Criteria andData22GreaterThanOrEqualTo(String value) {
            addCriterion("DATA22 >=", value, "data22");
            return (Criteria) this;
        }

        public Criteria andData22LessThan(String value) {
            addCriterion("DATA22 <", value, "data22");
            return (Criteria) this;
        }

        public Criteria andData22LessThanOrEqualTo(String value) {
            addCriterion("DATA22 <=", value, "data22");
            return (Criteria) this;
        }

        public Criteria andData22Like(String value) {
            addCriterion("DATA22 like", value, "data22");
            return (Criteria) this;
        }

        public Criteria andData22NotLike(String value) {
            addCriterion("DATA22 not like", value, "data22");
            return (Criteria) this;
        }

        public Criteria andData22In(List<String> values) {
            addCriterion("DATA22 in", values, "data22");
            return (Criteria) this;
        }

        public Criteria andData22NotIn(List<String> values) {
            addCriterion("DATA22 not in", values, "data22");
            return (Criteria) this;
        }

        public Criteria andData22Between(String value1, String value2) {
            addCriterion("DATA22 between", value1, value2, "data22");
            return (Criteria) this;
        }

        public Criteria andData22NotBetween(String value1, String value2) {
            addCriterion("DATA22 not between", value1, value2, "data22");
            return (Criteria) this;
        }

        public Criteria andData23IsNull() {
            addCriterion("DATA23 is null");
            return (Criteria) this;
        }

        public Criteria andData23IsNotNull() {
            addCriterion("DATA23 is not null");
            return (Criteria) this;
        }

        public Criteria andData23EqualTo(String value) {
            addCriterion("DATA23 =", value, "data23");
            return (Criteria) this;
        }

        public Criteria andData23NotEqualTo(String value) {
            addCriterion("DATA23 <>", value, "data23");
            return (Criteria) this;
        }

        public Criteria andData23GreaterThan(String value) {
            addCriterion("DATA23 >", value, "data23");
            return (Criteria) this;
        }

        public Criteria andData23GreaterThanOrEqualTo(String value) {
            addCriterion("DATA23 >=", value, "data23");
            return (Criteria) this;
        }

        public Criteria andData23LessThan(String value) {
            addCriterion("DATA23 <", value, "data23");
            return (Criteria) this;
        }

        public Criteria andData23LessThanOrEqualTo(String value) {
            addCriterion("DATA23 <=", value, "data23");
            return (Criteria) this;
        }

        public Criteria andData23Like(String value) {
            addCriterion("DATA23 like", value, "data23");
            return (Criteria) this;
        }

        public Criteria andData23NotLike(String value) {
            addCriterion("DATA23 not like", value, "data23");
            return (Criteria) this;
        }

        public Criteria andData23In(List<String> values) {
            addCriterion("DATA23 in", values, "data23");
            return (Criteria) this;
        }

        public Criteria andData23NotIn(List<String> values) {
            addCriterion("DATA23 not in", values, "data23");
            return (Criteria) this;
        }

        public Criteria andData23Between(String value1, String value2) {
            addCriterion("DATA23 between", value1, value2, "data23");
            return (Criteria) this;
        }

        public Criteria andData23NotBetween(String value1, String value2) {
            addCriterion("DATA23 not between", value1, value2, "data23");
            return (Criteria) this;
        }

        public Criteria andData24IsNull() {
            addCriterion("DATA24 is null");
            return (Criteria) this;
        }

        public Criteria andData24IsNotNull() {
            addCriterion("DATA24 is not null");
            return (Criteria) this;
        }

        public Criteria andData24EqualTo(String value) {
            addCriterion("DATA24 =", value, "data24");
            return (Criteria) this;
        }

        public Criteria andData24NotEqualTo(String value) {
            addCriterion("DATA24 <>", value, "data24");
            return (Criteria) this;
        }

        public Criteria andData24GreaterThan(String value) {
            addCriterion("DATA24 >", value, "data24");
            return (Criteria) this;
        }

        public Criteria andData24GreaterThanOrEqualTo(String value) {
            addCriterion("DATA24 >=", value, "data24");
            return (Criteria) this;
        }

        public Criteria andData24LessThan(String value) {
            addCriterion("DATA24 <", value, "data24");
            return (Criteria) this;
        }

        public Criteria andData24LessThanOrEqualTo(String value) {
            addCriterion("DATA24 <=", value, "data24");
            return (Criteria) this;
        }

        public Criteria andData24Like(String value) {
            addCriterion("DATA24 like", value, "data24");
            return (Criteria) this;
        }

        public Criteria andData24NotLike(String value) {
            addCriterion("DATA24 not like", value, "data24");
            return (Criteria) this;
        }

        public Criteria andData24In(List<String> values) {
            addCriterion("DATA24 in", values, "data24");
            return (Criteria) this;
        }

        public Criteria andData24NotIn(List<String> values) {
            addCriterion("DATA24 not in", values, "data24");
            return (Criteria) this;
        }

        public Criteria andData24Between(String value1, String value2) {
            addCriterion("DATA24 between", value1, value2, "data24");
            return (Criteria) this;
        }

        public Criteria andData24NotBetween(String value1, String value2) {
            addCriterion("DATA24 not between", value1, value2, "data24");
            return (Criteria) this;
        }

        public Criteria andData25IsNull() {
            addCriterion("DATA25 is null");
            return (Criteria) this;
        }

        public Criteria andData25IsNotNull() {
            addCriterion("DATA25 is not null");
            return (Criteria) this;
        }

        public Criteria andData25EqualTo(String value) {
            addCriterion("DATA25 =", value, "data25");
            return (Criteria) this;
        }

        public Criteria andData25NotEqualTo(String value) {
            addCriterion("DATA25 <>", value, "data25");
            return (Criteria) this;
        }

        public Criteria andData25GreaterThan(String value) {
            addCriterion("DATA25 >", value, "data25");
            return (Criteria) this;
        }

        public Criteria andData25GreaterThanOrEqualTo(String value) {
            addCriterion("DATA25 >=", value, "data25");
            return (Criteria) this;
        }

        public Criteria andData25LessThan(String value) {
            addCriterion("DATA25 <", value, "data25");
            return (Criteria) this;
        }

        public Criteria andData25LessThanOrEqualTo(String value) {
            addCriterion("DATA25 <=", value, "data25");
            return (Criteria) this;
        }

        public Criteria andData25Like(String value) {
            addCriterion("DATA25 like", value, "data25");
            return (Criteria) this;
        }

        public Criteria andData25NotLike(String value) {
            addCriterion("DATA25 not like", value, "data25");
            return (Criteria) this;
        }

        public Criteria andData25In(List<String> values) {
            addCriterion("DATA25 in", values, "data25");
            return (Criteria) this;
        }

        public Criteria andData25NotIn(List<String> values) {
            addCriterion("DATA25 not in", values, "data25");
            return (Criteria) this;
        }

        public Criteria andData25Between(String value1, String value2) {
            addCriterion("DATA25 between", value1, value2, "data25");
            return (Criteria) this;
        }

        public Criteria andData25NotBetween(String value1, String value2) {
            addCriterion("DATA25 not between", value1, value2, "data25");
            return (Criteria) this;
        }

        public Criteria andData26IsNull() {
            addCriterion("DATA26 is null");
            return (Criteria) this;
        }

        public Criteria andData26IsNotNull() {
            addCriterion("DATA26 is not null");
            return (Criteria) this;
        }

        public Criteria andData26EqualTo(String value) {
            addCriterion("DATA26 =", value, "data26");
            return (Criteria) this;
        }

        public Criteria andData26NotEqualTo(String value) {
            addCriterion("DATA26 <>", value, "data26");
            return (Criteria) this;
        }

        public Criteria andData26GreaterThan(String value) {
            addCriterion("DATA26 >", value, "data26");
            return (Criteria) this;
        }

        public Criteria andData26GreaterThanOrEqualTo(String value) {
            addCriterion("DATA26 >=", value, "data26");
            return (Criteria) this;
        }

        public Criteria andData26LessThan(String value) {
            addCriterion("DATA26 <", value, "data26");
            return (Criteria) this;
        }

        public Criteria andData26LessThanOrEqualTo(String value) {
            addCriterion("DATA26 <=", value, "data26");
            return (Criteria) this;
        }

        public Criteria andData26Like(String value) {
            addCriterion("DATA26 like", value, "data26");
            return (Criteria) this;
        }

        public Criteria andData26NotLike(String value) {
            addCriterion("DATA26 not like", value, "data26");
            return (Criteria) this;
        }

        public Criteria andData26In(List<String> values) {
            addCriterion("DATA26 in", values, "data26");
            return (Criteria) this;
        }

        public Criteria andData26NotIn(List<String> values) {
            addCriterion("DATA26 not in", values, "data26");
            return (Criteria) this;
        }

        public Criteria andData26Between(String value1, String value2) {
            addCriterion("DATA26 between", value1, value2, "data26");
            return (Criteria) this;
        }

        public Criteria andData26NotBetween(String value1, String value2) {
            addCriterion("DATA26 not between", value1, value2, "data26");
            return (Criteria) this;
        }

        public Criteria andData27IsNull() {
            addCriterion("DATA27 is null");
            return (Criteria) this;
        }

        public Criteria andData27IsNotNull() {
            addCriterion("DATA27 is not null");
            return (Criteria) this;
        }

        public Criteria andData27EqualTo(String value) {
            addCriterion("DATA27 =", value, "data27");
            return (Criteria) this;
        }

        public Criteria andData27NotEqualTo(String value) {
            addCriterion("DATA27 <>", value, "data27");
            return (Criteria) this;
        }

        public Criteria andData27GreaterThan(String value) {
            addCriterion("DATA27 >", value, "data27");
            return (Criteria) this;
        }

        public Criteria andData27GreaterThanOrEqualTo(String value) {
            addCriterion("DATA27 >=", value, "data27");
            return (Criteria) this;
        }

        public Criteria andData27LessThan(String value) {
            addCriterion("DATA27 <", value, "data27");
            return (Criteria) this;
        }

        public Criteria andData27LessThanOrEqualTo(String value) {
            addCriterion("DATA27 <=", value, "data27");
            return (Criteria) this;
        }

        public Criteria andData27Like(String value) {
            addCriterion("DATA27 like", value, "data27");
            return (Criteria) this;
        }

        public Criteria andData27NotLike(String value) {
            addCriterion("DATA27 not like", value, "data27");
            return (Criteria) this;
        }

        public Criteria andData27In(List<String> values) {
            addCriterion("DATA27 in", values, "data27");
            return (Criteria) this;
        }

        public Criteria andData27NotIn(List<String> values) {
            addCriterion("DATA27 not in", values, "data27");
            return (Criteria) this;
        }

        public Criteria andData27Between(String value1, String value2) {
            addCriterion("DATA27 between", value1, value2, "data27");
            return (Criteria) this;
        }

        public Criteria andData27NotBetween(String value1, String value2) {
            addCriterion("DATA27 not between", value1, value2, "data27");
            return (Criteria) this;
        }

        public Criteria andData28IsNull() {
            addCriterion("DATA28 is null");
            return (Criteria) this;
        }

        public Criteria andData28IsNotNull() {
            addCriterion("DATA28 is not null");
            return (Criteria) this;
        }

        public Criteria andData28EqualTo(String value) {
            addCriterion("DATA28 =", value, "data28");
            return (Criteria) this;
        }

        public Criteria andData28NotEqualTo(String value) {
            addCriterion("DATA28 <>", value, "data28");
            return (Criteria) this;
        }

        public Criteria andData28GreaterThan(String value) {
            addCriterion("DATA28 >", value, "data28");
            return (Criteria) this;
        }

        public Criteria andData28GreaterThanOrEqualTo(String value) {
            addCriterion("DATA28 >=", value, "data28");
            return (Criteria) this;
        }

        public Criteria andData28LessThan(String value) {
            addCriterion("DATA28 <", value, "data28");
            return (Criteria) this;
        }

        public Criteria andData28LessThanOrEqualTo(String value) {
            addCriterion("DATA28 <=", value, "data28");
            return (Criteria) this;
        }

        public Criteria andData28Like(String value) {
            addCriterion("DATA28 like", value, "data28");
            return (Criteria) this;
        }

        public Criteria andData28NotLike(String value) {
            addCriterion("DATA28 not like", value, "data28");
            return (Criteria) this;
        }

        public Criteria andData28In(List<String> values) {
            addCriterion("DATA28 in", values, "data28");
            return (Criteria) this;
        }

        public Criteria andData28NotIn(List<String> values) {
            addCriterion("DATA28 not in", values, "data28");
            return (Criteria) this;
        }

        public Criteria andData28Between(String value1, String value2) {
            addCriterion("DATA28 between", value1, value2, "data28");
            return (Criteria) this;
        }

        public Criteria andData28NotBetween(String value1, String value2) {
            addCriterion("DATA28 not between", value1, value2, "data28");
            return (Criteria) this;
        }

        public Criteria andData29IsNull() {
            addCriterion("DATA29 is null");
            return (Criteria) this;
        }

        public Criteria andData29IsNotNull() {
            addCriterion("DATA29 is not null");
            return (Criteria) this;
        }

        public Criteria andData29EqualTo(String value) {
            addCriterion("DATA29 =", value, "data29");
            return (Criteria) this;
        }

        public Criteria andData29NotEqualTo(String value) {
            addCriterion("DATA29 <>", value, "data29");
            return (Criteria) this;
        }

        public Criteria andData29GreaterThan(String value) {
            addCriterion("DATA29 >", value, "data29");
            return (Criteria) this;
        }

        public Criteria andData29GreaterThanOrEqualTo(String value) {
            addCriterion("DATA29 >=", value, "data29");
            return (Criteria) this;
        }

        public Criteria andData29LessThan(String value) {
            addCriterion("DATA29 <", value, "data29");
            return (Criteria) this;
        }

        public Criteria andData29LessThanOrEqualTo(String value) {
            addCriterion("DATA29 <=", value, "data29");
            return (Criteria) this;
        }

        public Criteria andData29Like(String value) {
            addCriterion("DATA29 like", value, "data29");
            return (Criteria) this;
        }

        public Criteria andData29NotLike(String value) {
            addCriterion("DATA29 not like", value, "data29");
            return (Criteria) this;
        }

        public Criteria andData29In(List<String> values) {
            addCriterion("DATA29 in", values, "data29");
            return (Criteria) this;
        }

        public Criteria andData29NotIn(List<String> values) {
            addCriterion("DATA29 not in", values, "data29");
            return (Criteria) this;
        }

        public Criteria andData29Between(String value1, String value2) {
            addCriterion("DATA29 between", value1, value2, "data29");
            return (Criteria) this;
        }

        public Criteria andData29NotBetween(String value1, String value2) {
            addCriterion("DATA29 not between", value1, value2, "data29");
            return (Criteria) this;
        }

        public Criteria andData30IsNull() {
            addCriterion("DATA30 is null");
            return (Criteria) this;
        }

        public Criteria andData30IsNotNull() {
            addCriterion("DATA30 is not null");
            return (Criteria) this;
        }

        public Criteria andData30EqualTo(String value) {
            addCriterion("DATA30 =", value, "data30");
            return (Criteria) this;
        }

        public Criteria andData30NotEqualTo(String value) {
            addCriterion("DATA30 <>", value, "data30");
            return (Criteria) this;
        }

        public Criteria andData30GreaterThan(String value) {
            addCriterion("DATA30 >", value, "data30");
            return (Criteria) this;
        }

        public Criteria andData30GreaterThanOrEqualTo(String value) {
            addCriterion("DATA30 >=", value, "data30");
            return (Criteria) this;
        }

        public Criteria andData30LessThan(String value) {
            addCriterion("DATA30 <", value, "data30");
            return (Criteria) this;
        }

        public Criteria andData30LessThanOrEqualTo(String value) {
            addCriterion("DATA30 <=", value, "data30");
            return (Criteria) this;
        }

        public Criteria andData30Like(String value) {
            addCriterion("DATA30 like", value, "data30");
            return (Criteria) this;
        }

        public Criteria andData30NotLike(String value) {
            addCriterion("DATA30 not like", value, "data30");
            return (Criteria) this;
        }

        public Criteria andData30In(List<String> values) {
            addCriterion("DATA30 in", values, "data30");
            return (Criteria) this;
        }

        public Criteria andData30NotIn(List<String> values) {
            addCriterion("DATA30 not in", values, "data30");
            return (Criteria) this;
        }

        public Criteria andData30Between(String value1, String value2) {
            addCriterion("DATA30 between", value1, value2, "data30");
            return (Criteria) this;
        }

        public Criteria andData30NotBetween(String value1, String value2) {
            addCriterion("DATA30 not between", value1, value2, "data30");
            return (Criteria) this;
        }

        public Criteria andData31IsNull() {
            addCriterion("DATA31 is null");
            return (Criteria) this;
        }

        public Criteria andData31IsNotNull() {
            addCriterion("DATA31 is not null");
            return (Criteria) this;
        }

        public Criteria andData31EqualTo(String value) {
            addCriterion("DATA31 =", value, "data31");
            return (Criteria) this;
        }

        public Criteria andData31NotEqualTo(String value) {
            addCriterion("DATA31 <>", value, "data31");
            return (Criteria) this;
        }

        public Criteria andData31GreaterThan(String value) {
            addCriterion("DATA31 >", value, "data31");
            return (Criteria) this;
        }

        public Criteria andData31GreaterThanOrEqualTo(String value) {
            addCriterion("DATA31 >=", value, "data31");
            return (Criteria) this;
        }

        public Criteria andData31LessThan(String value) {
            addCriterion("DATA31 <", value, "data31");
            return (Criteria) this;
        }

        public Criteria andData31LessThanOrEqualTo(String value) {
            addCriterion("DATA31 <=", value, "data31");
            return (Criteria) this;
        }

        public Criteria andData31Like(String value) {
            addCriterion("DATA31 like", value, "data31");
            return (Criteria) this;
        }

        public Criteria andData31NotLike(String value) {
            addCriterion("DATA31 not like", value, "data31");
            return (Criteria) this;
        }

        public Criteria andData31In(List<String> values) {
            addCriterion("DATA31 in", values, "data31");
            return (Criteria) this;
        }

        public Criteria andData31NotIn(List<String> values) {
            addCriterion("DATA31 not in", values, "data31");
            return (Criteria) this;
        }

        public Criteria andData31Between(String value1, String value2) {
            addCriterion("DATA31 between", value1, value2, "data31");
            return (Criteria) this;
        }

        public Criteria andData31NotBetween(String value1, String value2) {
            addCriterion("DATA31 not between", value1, value2, "data31");
            return (Criteria) this;
        }

        public Criteria andData32IsNull() {
            addCriterion("DATA32 is null");
            return (Criteria) this;
        }

        public Criteria andData32IsNotNull() {
            addCriterion("DATA32 is not null");
            return (Criteria) this;
        }

        public Criteria andData32EqualTo(String value) {
            addCriterion("DATA32 =", value, "data32");
            return (Criteria) this;
        }

        public Criteria andData32NotEqualTo(String value) {
            addCriterion("DATA32 <>", value, "data32");
            return (Criteria) this;
        }

        public Criteria andData32GreaterThan(String value) {
            addCriterion("DATA32 >", value, "data32");
            return (Criteria) this;
        }

        public Criteria andData32GreaterThanOrEqualTo(String value) {
            addCriterion("DATA32 >=", value, "data32");
            return (Criteria) this;
        }

        public Criteria andData32LessThan(String value) {
            addCriterion("DATA32 <", value, "data32");
            return (Criteria) this;
        }

        public Criteria andData32LessThanOrEqualTo(String value) {
            addCriterion("DATA32 <=", value, "data32");
            return (Criteria) this;
        }

        public Criteria andData32Like(String value) {
            addCriterion("DATA32 like", value, "data32");
            return (Criteria) this;
        }

        public Criteria andData32NotLike(String value) {
            addCriterion("DATA32 not like", value, "data32");
            return (Criteria) this;
        }

        public Criteria andData32In(List<String> values) {
            addCriterion("DATA32 in", values, "data32");
            return (Criteria) this;
        }

        public Criteria andData32NotIn(List<String> values) {
            addCriterion("DATA32 not in", values, "data32");
            return (Criteria) this;
        }

        public Criteria andData32Between(String value1, String value2) {
            addCriterion("DATA32 between", value1, value2, "data32");
            return (Criteria) this;
        }

        public Criteria andData32NotBetween(String value1, String value2) {
            addCriterion("DATA32 not between", value1, value2, "data32");
            return (Criteria) this;
        }

        public Criteria andData33IsNull() {
            addCriterion("DATA33 is null");
            return (Criteria) this;
        }

        public Criteria andData33IsNotNull() {
            addCriterion("DATA33 is not null");
            return (Criteria) this;
        }

        public Criteria andData33EqualTo(String value) {
            addCriterion("DATA33 =", value, "data33");
            return (Criteria) this;
        }

        public Criteria andData33NotEqualTo(String value) {
            addCriterion("DATA33 <>", value, "data33");
            return (Criteria) this;
        }

        public Criteria andData33GreaterThan(String value) {
            addCriterion("DATA33 >", value, "data33");
            return (Criteria) this;
        }

        public Criteria andData33GreaterThanOrEqualTo(String value) {
            addCriterion("DATA33 >=", value, "data33");
            return (Criteria) this;
        }

        public Criteria andData33LessThan(String value) {
            addCriterion("DATA33 <", value, "data33");
            return (Criteria) this;
        }

        public Criteria andData33LessThanOrEqualTo(String value) {
            addCriterion("DATA33 <=", value, "data33");
            return (Criteria) this;
        }

        public Criteria andData33Like(String value) {
            addCriterion("DATA33 like", value, "data33");
            return (Criteria) this;
        }

        public Criteria andData33NotLike(String value) {
            addCriterion("DATA33 not like", value, "data33");
            return (Criteria) this;
        }

        public Criteria andData33In(List<String> values) {
            addCriterion("DATA33 in", values, "data33");
            return (Criteria) this;
        }

        public Criteria andData33NotIn(List<String> values) {
            addCriterion("DATA33 not in", values, "data33");
            return (Criteria) this;
        }

        public Criteria andData33Between(String value1, String value2) {
            addCriterion("DATA33 between", value1, value2, "data33");
            return (Criteria) this;
        }

        public Criteria andData33NotBetween(String value1, String value2) {
            addCriterion("DATA33 not between", value1, value2, "data33");
            return (Criteria) this;
        }

        public Criteria andData34IsNull() {
            addCriterion("DATA34 is null");
            return (Criteria) this;
        }

        public Criteria andData34IsNotNull() {
            addCriterion("DATA34 is not null");
            return (Criteria) this;
        }

        public Criteria andData34EqualTo(String value) {
            addCriterion("DATA34 =", value, "data34");
            return (Criteria) this;
        }

        public Criteria andData34NotEqualTo(String value) {
            addCriterion("DATA34 <>", value, "data34");
            return (Criteria) this;
        }

        public Criteria andData34GreaterThan(String value) {
            addCriterion("DATA34 >", value, "data34");
            return (Criteria) this;
        }

        public Criteria andData34GreaterThanOrEqualTo(String value) {
            addCriterion("DATA34 >=", value, "data34");
            return (Criteria) this;
        }

        public Criteria andData34LessThan(String value) {
            addCriterion("DATA34 <", value, "data34");
            return (Criteria) this;
        }

        public Criteria andData34LessThanOrEqualTo(String value) {
            addCriterion("DATA34 <=", value, "data34");
            return (Criteria) this;
        }

        public Criteria andData34Like(String value) {
            addCriterion("DATA34 like", value, "data34");
            return (Criteria) this;
        }

        public Criteria andData34NotLike(String value) {
            addCriterion("DATA34 not like", value, "data34");
            return (Criteria) this;
        }

        public Criteria andData34In(List<String> values) {
            addCriterion("DATA34 in", values, "data34");
            return (Criteria) this;
        }

        public Criteria andData34NotIn(List<String> values) {
            addCriterion("DATA34 not in", values, "data34");
            return (Criteria) this;
        }

        public Criteria andData34Between(String value1, String value2) {
            addCriterion("DATA34 between", value1, value2, "data34");
            return (Criteria) this;
        }

        public Criteria andData34NotBetween(String value1, String value2) {
            addCriterion("DATA34 not between", value1, value2, "data34");
            return (Criteria) this;
        }

        public Criteria andData35IsNull() {
            addCriterion("DATA35 is null");
            return (Criteria) this;
        }

        public Criteria andData35IsNotNull() {
            addCriterion("DATA35 is not null");
            return (Criteria) this;
        }

        public Criteria andData35EqualTo(String value) {
            addCriterion("DATA35 =", value, "data35");
            return (Criteria) this;
        }

        public Criteria andData35NotEqualTo(String value) {
            addCriterion("DATA35 <>", value, "data35");
            return (Criteria) this;
        }

        public Criteria andData35GreaterThan(String value) {
            addCriterion("DATA35 >", value, "data35");
            return (Criteria) this;
        }

        public Criteria andData35GreaterThanOrEqualTo(String value) {
            addCriterion("DATA35 >=", value, "data35");
            return (Criteria) this;
        }

        public Criteria andData35LessThan(String value) {
            addCriterion("DATA35 <", value, "data35");
            return (Criteria) this;
        }

        public Criteria andData35LessThanOrEqualTo(String value) {
            addCriterion("DATA35 <=", value, "data35");
            return (Criteria) this;
        }

        public Criteria andData35Like(String value) {
            addCriterion("DATA35 like", value, "data35");
            return (Criteria) this;
        }

        public Criteria andData35NotLike(String value) {
            addCriterion("DATA35 not like", value, "data35");
            return (Criteria) this;
        }

        public Criteria andData35In(List<String> values) {
            addCriterion("DATA35 in", values, "data35");
            return (Criteria) this;
        }

        public Criteria andData35NotIn(List<String> values) {
            addCriterion("DATA35 not in", values, "data35");
            return (Criteria) this;
        }

        public Criteria andData35Between(String value1, String value2) {
            addCriterion("DATA35 between", value1, value2, "data35");
            return (Criteria) this;
        }

        public Criteria andData35NotBetween(String value1, String value2) {
            addCriterion("DATA35 not between", value1, value2, "data35");
            return (Criteria) this;
        }

        public Criteria andData36IsNull() {
            addCriterion("DATA36 is null");
            return (Criteria) this;
        }

        public Criteria andData36IsNotNull() {
            addCriterion("DATA36 is not null");
            return (Criteria) this;
        }

        public Criteria andData36EqualTo(String value) {
            addCriterion("DATA36 =", value, "data36");
            return (Criteria) this;
        }

        public Criteria andData36NotEqualTo(String value) {
            addCriterion("DATA36 <>", value, "data36");
            return (Criteria) this;
        }

        public Criteria andData36GreaterThan(String value) {
            addCriterion("DATA36 >", value, "data36");
            return (Criteria) this;
        }

        public Criteria andData36GreaterThanOrEqualTo(String value) {
            addCriterion("DATA36 >=", value, "data36");
            return (Criteria) this;
        }

        public Criteria andData36LessThan(String value) {
            addCriterion("DATA36 <", value, "data36");
            return (Criteria) this;
        }

        public Criteria andData36LessThanOrEqualTo(String value) {
            addCriterion("DATA36 <=", value, "data36");
            return (Criteria) this;
        }

        public Criteria andData36Like(String value) {
            addCriterion("DATA36 like", value, "data36");
            return (Criteria) this;
        }

        public Criteria andData36NotLike(String value) {
            addCriterion("DATA36 not like", value, "data36");
            return (Criteria) this;
        }

        public Criteria andData36In(List<String> values) {
            addCriterion("DATA36 in", values, "data36");
            return (Criteria) this;
        }

        public Criteria andData36NotIn(List<String> values) {
            addCriterion("DATA36 not in", values, "data36");
            return (Criteria) this;
        }

        public Criteria andData36Between(String value1, String value2) {
            addCriterion("DATA36 between", value1, value2, "data36");
            return (Criteria) this;
        }

        public Criteria andData36NotBetween(String value1, String value2) {
            addCriterion("DATA36 not between", value1, value2, "data36");
            return (Criteria) this;
        }

        public Criteria andData37IsNull() {
            addCriterion("DATA37 is null");
            return (Criteria) this;
        }

        public Criteria andData37IsNotNull() {
            addCriterion("DATA37 is not null");
            return (Criteria) this;
        }

        public Criteria andData37EqualTo(String value) {
            addCriterion("DATA37 =", value, "data37");
            return (Criteria) this;
        }

        public Criteria andData37NotEqualTo(String value) {
            addCriterion("DATA37 <>", value, "data37");
            return (Criteria) this;
        }

        public Criteria andData37GreaterThan(String value) {
            addCriterion("DATA37 >", value, "data37");
            return (Criteria) this;
        }

        public Criteria andData37GreaterThanOrEqualTo(String value) {
            addCriterion("DATA37 >=", value, "data37");
            return (Criteria) this;
        }

        public Criteria andData37LessThan(String value) {
            addCriterion("DATA37 <", value, "data37");
            return (Criteria) this;
        }

        public Criteria andData37LessThanOrEqualTo(String value) {
            addCriterion("DATA37 <=", value, "data37");
            return (Criteria) this;
        }

        public Criteria andData37Like(String value) {
            addCriterion("DATA37 like", value, "data37");
            return (Criteria) this;
        }

        public Criteria andData37NotLike(String value) {
            addCriterion("DATA37 not like", value, "data37");
            return (Criteria) this;
        }

        public Criteria andData37In(List<String> values) {
            addCriterion("DATA37 in", values, "data37");
            return (Criteria) this;
        }

        public Criteria andData37NotIn(List<String> values) {
            addCriterion("DATA37 not in", values, "data37");
            return (Criteria) this;
        }

        public Criteria andData37Between(String value1, String value2) {
            addCriterion("DATA37 between", value1, value2, "data37");
            return (Criteria) this;
        }

        public Criteria andData37NotBetween(String value1, String value2) {
            addCriterion("DATA37 not between", value1, value2, "data37");
            return (Criteria) this;
        }

        public Criteria andData38IsNull() {
            addCriterion("DATA38 is null");
            return (Criteria) this;
        }

        public Criteria andData38IsNotNull() {
            addCriterion("DATA38 is not null");
            return (Criteria) this;
        }

        public Criteria andData38EqualTo(String value) {
            addCriterion("DATA38 =", value, "data38");
            return (Criteria) this;
        }

        public Criteria andData38NotEqualTo(String value) {
            addCriterion("DATA38 <>", value, "data38");
            return (Criteria) this;
        }

        public Criteria andData38GreaterThan(String value) {
            addCriterion("DATA38 >", value, "data38");
            return (Criteria) this;
        }

        public Criteria andData38GreaterThanOrEqualTo(String value) {
            addCriterion("DATA38 >=", value, "data38");
            return (Criteria) this;
        }

        public Criteria andData38LessThan(String value) {
            addCriterion("DATA38 <", value, "data38");
            return (Criteria) this;
        }

        public Criteria andData38LessThanOrEqualTo(String value) {
            addCriterion("DATA38 <=", value, "data38");
            return (Criteria) this;
        }

        public Criteria andData38Like(String value) {
            addCriterion("DATA38 like", value, "data38");
            return (Criteria) this;
        }

        public Criteria andData38NotLike(String value) {
            addCriterion("DATA38 not like", value, "data38");
            return (Criteria) this;
        }

        public Criteria andData38In(List<String> values) {
            addCriterion("DATA38 in", values, "data38");
            return (Criteria) this;
        }

        public Criteria andData38NotIn(List<String> values) {
            addCriterion("DATA38 not in", values, "data38");
            return (Criteria) this;
        }

        public Criteria andData38Between(String value1, String value2) {
            addCriterion("DATA38 between", value1, value2, "data38");
            return (Criteria) this;
        }

        public Criteria andData38NotBetween(String value1, String value2) {
            addCriterion("DATA38 not between", value1, value2, "data38");
            return (Criteria) this;
        }

        public Criteria andData39IsNull() {
            addCriterion("DATA39 is null");
            return (Criteria) this;
        }

        public Criteria andData39IsNotNull() {
            addCriterion("DATA39 is not null");
            return (Criteria) this;
        }

        public Criteria andData39EqualTo(String value) {
            addCriterion("DATA39 =", value, "data39");
            return (Criteria) this;
        }

        public Criteria andData39NotEqualTo(String value) {
            addCriterion("DATA39 <>", value, "data39");
            return (Criteria) this;
        }

        public Criteria andData39GreaterThan(String value) {
            addCriterion("DATA39 >", value, "data39");
            return (Criteria) this;
        }

        public Criteria andData39GreaterThanOrEqualTo(String value) {
            addCriterion("DATA39 >=", value, "data39");
            return (Criteria) this;
        }

        public Criteria andData39LessThan(String value) {
            addCriterion("DATA39 <", value, "data39");
            return (Criteria) this;
        }

        public Criteria andData39LessThanOrEqualTo(String value) {
            addCriterion("DATA39 <=", value, "data39");
            return (Criteria) this;
        }

        public Criteria andData39Like(String value) {
            addCriterion("DATA39 like", value, "data39");
            return (Criteria) this;
        }

        public Criteria andData39NotLike(String value) {
            addCriterion("DATA39 not like", value, "data39");
            return (Criteria) this;
        }

        public Criteria andData39In(List<String> values) {
            addCriterion("DATA39 in", values, "data39");
            return (Criteria) this;
        }

        public Criteria andData39NotIn(List<String> values) {
            addCriterion("DATA39 not in", values, "data39");
            return (Criteria) this;
        }

        public Criteria andData39Between(String value1, String value2) {
            addCriterion("DATA39 between", value1, value2, "data39");
            return (Criteria) this;
        }

        public Criteria andData39NotBetween(String value1, String value2) {
            addCriterion("DATA39 not between", value1, value2, "data39");
            return (Criteria) this;
        }

        public Criteria andData40IsNull() {
            addCriterion("DATA40 is null");
            return (Criteria) this;
        }

        public Criteria andData40IsNotNull() {
            addCriterion("DATA40 is not null");
            return (Criteria) this;
        }

        public Criteria andData40EqualTo(String value) {
            addCriterion("DATA40 =", value, "data40");
            return (Criteria) this;
        }

        public Criteria andData40NotEqualTo(String value) {
            addCriterion("DATA40 <>", value, "data40");
            return (Criteria) this;
        }

        public Criteria andData40GreaterThan(String value) {
            addCriterion("DATA40 >", value, "data40");
            return (Criteria) this;
        }

        public Criteria andData40GreaterThanOrEqualTo(String value) {
            addCriterion("DATA40 >=", value, "data40");
            return (Criteria) this;
        }

        public Criteria andData40LessThan(String value) {
            addCriterion("DATA40 <", value, "data40");
            return (Criteria) this;
        }

        public Criteria andData40LessThanOrEqualTo(String value) {
            addCriterion("DATA40 <=", value, "data40");
            return (Criteria) this;
        }

        public Criteria andData40Like(String value) {
            addCriterion("DATA40 like", value, "data40");
            return (Criteria) this;
        }

        public Criteria andData40NotLike(String value) {
            addCriterion("DATA40 not like", value, "data40");
            return (Criteria) this;
        }

        public Criteria andData40In(List<String> values) {
            addCriterion("DATA40 in", values, "data40");
            return (Criteria) this;
        }

        public Criteria andData40NotIn(List<String> values) {
            addCriterion("DATA40 not in", values, "data40");
            return (Criteria) this;
        }

        public Criteria andData40Between(String value1, String value2) {
            addCriterion("DATA40 between", value1, value2, "data40");
            return (Criteria) this;
        }

        public Criteria andData40NotBetween(String value1, String value2) {
            addCriterion("DATA40 not between", value1, value2, "data40");
            return (Criteria) this;
        }

        public Criteria andData41IsNull() {
            addCriterion("DATA41 is null");
            return (Criteria) this;
        }

        public Criteria andData41IsNotNull() {
            addCriterion("DATA41 is not null");
            return (Criteria) this;
        }

        public Criteria andData41EqualTo(String value) {
            addCriterion("DATA41 =", value, "data41");
            return (Criteria) this;
        }

        public Criteria andData41NotEqualTo(String value) {
            addCriterion("DATA41 <>", value, "data41");
            return (Criteria) this;
        }

        public Criteria andData41GreaterThan(String value) {
            addCriterion("DATA41 >", value, "data41");
            return (Criteria) this;
        }

        public Criteria andData41GreaterThanOrEqualTo(String value) {
            addCriterion("DATA41 >=", value, "data41");
            return (Criteria) this;
        }

        public Criteria andData41LessThan(String value) {
            addCriterion("DATA41 <", value, "data41");
            return (Criteria) this;
        }

        public Criteria andData41LessThanOrEqualTo(String value) {
            addCriterion("DATA41 <=", value, "data41");
            return (Criteria) this;
        }

        public Criteria andData41Like(String value) {
            addCriterion("DATA41 like", value, "data41");
            return (Criteria) this;
        }

        public Criteria andData41NotLike(String value) {
            addCriterion("DATA41 not like", value, "data41");
            return (Criteria) this;
        }

        public Criteria andData41In(List<String> values) {
            addCriterion("DATA41 in", values, "data41");
            return (Criteria) this;
        }

        public Criteria andData41NotIn(List<String> values) {
            addCriterion("DATA41 not in", values, "data41");
            return (Criteria) this;
        }

        public Criteria andData41Between(String value1, String value2) {
            addCriterion("DATA41 between", value1, value2, "data41");
            return (Criteria) this;
        }

        public Criteria andData41NotBetween(String value1, String value2) {
            addCriterion("DATA41 not between", value1, value2, "data41");
            return (Criteria) this;
        }

        public Criteria andData42IsNull() {
            addCriterion("DATA42 is null");
            return (Criteria) this;
        }

        public Criteria andData42IsNotNull() {
            addCriterion("DATA42 is not null");
            return (Criteria) this;
        }

        public Criteria andData42EqualTo(String value) {
            addCriterion("DATA42 =", value, "data42");
            return (Criteria) this;
        }

        public Criteria andData42NotEqualTo(String value) {
            addCriterion("DATA42 <>", value, "data42");
            return (Criteria) this;
        }

        public Criteria andData42GreaterThan(String value) {
            addCriterion("DATA42 >", value, "data42");
            return (Criteria) this;
        }

        public Criteria andData42GreaterThanOrEqualTo(String value) {
            addCriterion("DATA42 >=", value, "data42");
            return (Criteria) this;
        }

        public Criteria andData42LessThan(String value) {
            addCriterion("DATA42 <", value, "data42");
            return (Criteria) this;
        }

        public Criteria andData42LessThanOrEqualTo(String value) {
            addCriterion("DATA42 <=", value, "data42");
            return (Criteria) this;
        }

        public Criteria andData42Like(String value) {
            addCriterion("DATA42 like", value, "data42");
            return (Criteria) this;
        }

        public Criteria andData42NotLike(String value) {
            addCriterion("DATA42 not like", value, "data42");
            return (Criteria) this;
        }

        public Criteria andData42In(List<String> values) {
            addCriterion("DATA42 in", values, "data42");
            return (Criteria) this;
        }

        public Criteria andData42NotIn(List<String> values) {
            addCriterion("DATA42 not in", values, "data42");
            return (Criteria) this;
        }

        public Criteria andData42Between(String value1, String value2) {
            addCriterion("DATA42 between", value1, value2, "data42");
            return (Criteria) this;
        }

        public Criteria andData42NotBetween(String value1, String value2) {
            addCriterion("DATA42 not between", value1, value2, "data42");
            return (Criteria) this;
        }

        public Criteria andData43IsNull() {
            addCriterion("DATA43 is null");
            return (Criteria) this;
        }

        public Criteria andData43IsNotNull() {
            addCriterion("DATA43 is not null");
            return (Criteria) this;
        }

        public Criteria andData43EqualTo(String value) {
            addCriterion("DATA43 =", value, "data43");
            return (Criteria) this;
        }

        public Criteria andData43NotEqualTo(String value) {
            addCriterion("DATA43 <>", value, "data43");
            return (Criteria) this;
        }

        public Criteria andData43GreaterThan(String value) {
            addCriterion("DATA43 >", value, "data43");
            return (Criteria) this;
        }

        public Criteria andData43GreaterThanOrEqualTo(String value) {
            addCriterion("DATA43 >=", value, "data43");
            return (Criteria) this;
        }

        public Criteria andData43LessThan(String value) {
            addCriterion("DATA43 <", value, "data43");
            return (Criteria) this;
        }

        public Criteria andData43LessThanOrEqualTo(String value) {
            addCriterion("DATA43 <=", value, "data43");
            return (Criteria) this;
        }

        public Criteria andData43Like(String value) {
            addCriterion("DATA43 like", value, "data43");
            return (Criteria) this;
        }

        public Criteria andData43NotLike(String value) {
            addCriterion("DATA43 not like", value, "data43");
            return (Criteria) this;
        }

        public Criteria andData43In(List<String> values) {
            addCriterion("DATA43 in", values, "data43");
            return (Criteria) this;
        }

        public Criteria andData43NotIn(List<String> values) {
            addCriterion("DATA43 not in", values, "data43");
            return (Criteria) this;
        }

        public Criteria andData43Between(String value1, String value2) {
            addCriterion("DATA43 between", value1, value2, "data43");
            return (Criteria) this;
        }

        public Criteria andData43NotBetween(String value1, String value2) {
            addCriterion("DATA43 not between", value1, value2, "data43");
            return (Criteria) this;
        }

        public Criteria andData44IsNull() {
            addCriterion("DATA44 is null");
            return (Criteria) this;
        }

        public Criteria andData44IsNotNull() {
            addCriterion("DATA44 is not null");
            return (Criteria) this;
        }

        public Criteria andData44EqualTo(String value) {
            addCriterion("DATA44 =", value, "data44");
            return (Criteria) this;
        }

        public Criteria andData44NotEqualTo(String value) {
            addCriterion("DATA44 <>", value, "data44");
            return (Criteria) this;
        }

        public Criteria andData44GreaterThan(String value) {
            addCriterion("DATA44 >", value, "data44");
            return (Criteria) this;
        }

        public Criteria andData44GreaterThanOrEqualTo(String value) {
            addCriterion("DATA44 >=", value, "data44");
            return (Criteria) this;
        }

        public Criteria andData44LessThan(String value) {
            addCriterion("DATA44 <", value, "data44");
            return (Criteria) this;
        }

        public Criteria andData44LessThanOrEqualTo(String value) {
            addCriterion("DATA44 <=", value, "data44");
            return (Criteria) this;
        }

        public Criteria andData44Like(String value) {
            addCriterion("DATA44 like", value, "data44");
            return (Criteria) this;
        }

        public Criteria andData44NotLike(String value) {
            addCriterion("DATA44 not like", value, "data44");
            return (Criteria) this;
        }

        public Criteria andData44In(List<String> values) {
            addCriterion("DATA44 in", values, "data44");
            return (Criteria) this;
        }

        public Criteria andData44NotIn(List<String> values) {
            addCriterion("DATA44 not in", values, "data44");
            return (Criteria) this;
        }

        public Criteria andData44Between(String value1, String value2) {
            addCriterion("DATA44 between", value1, value2, "data44");
            return (Criteria) this;
        }

        public Criteria andData44NotBetween(String value1, String value2) {
            addCriterion("DATA44 not between", value1, value2, "data44");
            return (Criteria) this;
        }

        public Criteria andData45IsNull() {
            addCriterion("DATA45 is null");
            return (Criteria) this;
        }

        public Criteria andData45IsNotNull() {
            addCriterion("DATA45 is not null");
            return (Criteria) this;
        }

        public Criteria andData45EqualTo(String value) {
            addCriterion("DATA45 =", value, "data45");
            return (Criteria) this;
        }

        public Criteria andData45NotEqualTo(String value) {
            addCriterion("DATA45 <>", value, "data45");
            return (Criteria) this;
        }

        public Criteria andData45GreaterThan(String value) {
            addCriterion("DATA45 >", value, "data45");
            return (Criteria) this;
        }

        public Criteria andData45GreaterThanOrEqualTo(String value) {
            addCriterion("DATA45 >=", value, "data45");
            return (Criteria) this;
        }

        public Criteria andData45LessThan(String value) {
            addCriterion("DATA45 <", value, "data45");
            return (Criteria) this;
        }

        public Criteria andData45LessThanOrEqualTo(String value) {
            addCriterion("DATA45 <=", value, "data45");
            return (Criteria) this;
        }

        public Criteria andData45Like(String value) {
            addCriterion("DATA45 like", value, "data45");
            return (Criteria) this;
        }

        public Criteria andData45NotLike(String value) {
            addCriterion("DATA45 not like", value, "data45");
            return (Criteria) this;
        }

        public Criteria andData45In(List<String> values) {
            addCriterion("DATA45 in", values, "data45");
            return (Criteria) this;
        }

        public Criteria andData45NotIn(List<String> values) {
            addCriterion("DATA45 not in", values, "data45");
            return (Criteria) this;
        }

        public Criteria andData45Between(String value1, String value2) {
            addCriterion("DATA45 between", value1, value2, "data45");
            return (Criteria) this;
        }

        public Criteria andData45NotBetween(String value1, String value2) {
            addCriterion("DATA45 not between", value1, value2, "data45");
            return (Criteria) this;
        }

        public Criteria andData46IsNull() {
            addCriterion("DATA46 is null");
            return (Criteria) this;
        }

        public Criteria andData46IsNotNull() {
            addCriterion("DATA46 is not null");
            return (Criteria) this;
        }

        public Criteria andData46EqualTo(String value) {
            addCriterion("DATA46 =", value, "data46");
            return (Criteria) this;
        }

        public Criteria andData46NotEqualTo(String value) {
            addCriterion("DATA46 <>", value, "data46");
            return (Criteria) this;
        }

        public Criteria andData46GreaterThan(String value) {
            addCriterion("DATA46 >", value, "data46");
            return (Criteria) this;
        }

        public Criteria andData46GreaterThanOrEqualTo(String value) {
            addCriterion("DATA46 >=", value, "data46");
            return (Criteria) this;
        }

        public Criteria andData46LessThan(String value) {
            addCriterion("DATA46 <", value, "data46");
            return (Criteria) this;
        }

        public Criteria andData46LessThanOrEqualTo(String value) {
            addCriterion("DATA46 <=", value, "data46");
            return (Criteria) this;
        }

        public Criteria andData46Like(String value) {
            addCriterion("DATA46 like", value, "data46");
            return (Criteria) this;
        }

        public Criteria andData46NotLike(String value) {
            addCriterion("DATA46 not like", value, "data46");
            return (Criteria) this;
        }

        public Criteria andData46In(List<String> values) {
            addCriterion("DATA46 in", values, "data46");
            return (Criteria) this;
        }

        public Criteria andData46NotIn(List<String> values) {
            addCriterion("DATA46 not in", values, "data46");
            return (Criteria) this;
        }

        public Criteria andData46Between(String value1, String value2) {
            addCriterion("DATA46 between", value1, value2, "data46");
            return (Criteria) this;
        }

        public Criteria andData46NotBetween(String value1, String value2) {
            addCriterion("DATA46 not between", value1, value2, "data46");
            return (Criteria) this;
        }

        public Criteria andData47IsNull() {
            addCriterion("DATA47 is null");
            return (Criteria) this;
        }

        public Criteria andData47IsNotNull() {
            addCriterion("DATA47 is not null");
            return (Criteria) this;
        }

        public Criteria andData47EqualTo(String value) {
            addCriterion("DATA47 =", value, "data47");
            return (Criteria) this;
        }

        public Criteria andData47NotEqualTo(String value) {
            addCriterion("DATA47 <>", value, "data47");
            return (Criteria) this;
        }

        public Criteria andData47GreaterThan(String value) {
            addCriterion("DATA47 >", value, "data47");
            return (Criteria) this;
        }

        public Criteria andData47GreaterThanOrEqualTo(String value) {
            addCriterion("DATA47 >=", value, "data47");
            return (Criteria) this;
        }

        public Criteria andData47LessThan(String value) {
            addCriterion("DATA47 <", value, "data47");
            return (Criteria) this;
        }

        public Criteria andData47LessThanOrEqualTo(String value) {
            addCriterion("DATA47 <=", value, "data47");
            return (Criteria) this;
        }

        public Criteria andData47Like(String value) {
            addCriterion("DATA47 like", value, "data47");
            return (Criteria) this;
        }

        public Criteria andData47NotLike(String value) {
            addCriterion("DATA47 not like", value, "data47");
            return (Criteria) this;
        }

        public Criteria andData47In(List<String> values) {
            addCriterion("DATA47 in", values, "data47");
            return (Criteria) this;
        }

        public Criteria andData47NotIn(List<String> values) {
            addCriterion("DATA47 not in", values, "data47");
            return (Criteria) this;
        }

        public Criteria andData47Between(String value1, String value2) {
            addCriterion("DATA47 between", value1, value2, "data47");
            return (Criteria) this;
        }

        public Criteria andData47NotBetween(String value1, String value2) {
            addCriterion("DATA47 not between", value1, value2, "data47");
            return (Criteria) this;
        }

        public Criteria andData48IsNull() {
            addCriterion("DATA48 is null");
            return (Criteria) this;
        }

        public Criteria andData48IsNotNull() {
            addCriterion("DATA48 is not null");
            return (Criteria) this;
        }

        public Criteria andData48EqualTo(String value) {
            addCriterion("DATA48 =", value, "data48");
            return (Criteria) this;
        }

        public Criteria andData48NotEqualTo(String value) {
            addCriterion("DATA48 <>", value, "data48");
            return (Criteria) this;
        }

        public Criteria andData48GreaterThan(String value) {
            addCriterion("DATA48 >", value, "data48");
            return (Criteria) this;
        }

        public Criteria andData48GreaterThanOrEqualTo(String value) {
            addCriterion("DATA48 >=", value, "data48");
            return (Criteria) this;
        }

        public Criteria andData48LessThan(String value) {
            addCriterion("DATA48 <", value, "data48");
            return (Criteria) this;
        }

        public Criteria andData48LessThanOrEqualTo(String value) {
            addCriterion("DATA48 <=", value, "data48");
            return (Criteria) this;
        }

        public Criteria andData48Like(String value) {
            addCriterion("DATA48 like", value, "data48");
            return (Criteria) this;
        }

        public Criteria andData48NotLike(String value) {
            addCriterion("DATA48 not like", value, "data48");
            return (Criteria) this;
        }

        public Criteria andData48In(List<String> values) {
            addCriterion("DATA48 in", values, "data48");
            return (Criteria) this;
        }

        public Criteria andData48NotIn(List<String> values) {
            addCriterion("DATA48 not in", values, "data48");
            return (Criteria) this;
        }

        public Criteria andData48Between(String value1, String value2) {
            addCriterion("DATA48 between", value1, value2, "data48");
            return (Criteria) this;
        }

        public Criteria andData48NotBetween(String value1, String value2) {
            addCriterion("DATA48 not between", value1, value2, "data48");
            return (Criteria) this;
        }

        public Criteria andData49IsNull() {
            addCriterion("DATA49 is null");
            return (Criteria) this;
        }

        public Criteria andData49IsNotNull() {
            addCriterion("DATA49 is not null");
            return (Criteria) this;
        }

        public Criteria andData49EqualTo(String value) {
            addCriterion("DATA49 =", value, "data49");
            return (Criteria) this;
        }

        public Criteria andData49NotEqualTo(String value) {
            addCriterion("DATA49 <>", value, "data49");
            return (Criteria) this;
        }

        public Criteria andData49GreaterThan(String value) {
            addCriterion("DATA49 >", value, "data49");
            return (Criteria) this;
        }

        public Criteria andData49GreaterThanOrEqualTo(String value) {
            addCriterion("DATA49 >=", value, "data49");
            return (Criteria) this;
        }

        public Criteria andData49LessThan(String value) {
            addCriterion("DATA49 <", value, "data49");
            return (Criteria) this;
        }

        public Criteria andData49LessThanOrEqualTo(String value) {
            addCriterion("DATA49 <=", value, "data49");
            return (Criteria) this;
        }

        public Criteria andData49Like(String value) {
            addCriterion("DATA49 like", value, "data49");
            return (Criteria) this;
        }

        public Criteria andData49NotLike(String value) {
            addCriterion("DATA49 not like", value, "data49");
            return (Criteria) this;
        }

        public Criteria andData49In(List<String> values) {
            addCriterion("DATA49 in", values, "data49");
            return (Criteria) this;
        }

        public Criteria andData49NotIn(List<String> values) {
            addCriterion("DATA49 not in", values, "data49");
            return (Criteria) this;
        }

        public Criteria andData49Between(String value1, String value2) {
            addCriterion("DATA49 between", value1, value2, "data49");
            return (Criteria) this;
        }

        public Criteria andData49NotBetween(String value1, String value2) {
            addCriterion("DATA49 not between", value1, value2, "data49");
            return (Criteria) this;
        }

        public Criteria andData50IsNull() {
            addCriterion("DATA50 is null");
            return (Criteria) this;
        }

        public Criteria andData50IsNotNull() {
            addCriterion("DATA50 is not null");
            return (Criteria) this;
        }

        public Criteria andData50EqualTo(String value) {
            addCriterion("DATA50 =", value, "data50");
            return (Criteria) this;
        }

        public Criteria andData50NotEqualTo(String value) {
            addCriterion("DATA50 <>", value, "data50");
            return (Criteria) this;
        }

        public Criteria andData50GreaterThan(String value) {
            addCriterion("DATA50 >", value, "data50");
            return (Criteria) this;
        }

        public Criteria andData50GreaterThanOrEqualTo(String value) {
            addCriterion("DATA50 >=", value, "data50");
            return (Criteria) this;
        }

        public Criteria andData50LessThan(String value) {
            addCriterion("DATA50 <", value, "data50");
            return (Criteria) this;
        }

        public Criteria andData50LessThanOrEqualTo(String value) {
            addCriterion("DATA50 <=", value, "data50");
            return (Criteria) this;
        }

        public Criteria andData50Like(String value) {
            addCriterion("DATA50 like", value, "data50");
            return (Criteria) this;
        }

        public Criteria andData50NotLike(String value) {
            addCriterion("DATA50 not like", value, "data50");
            return (Criteria) this;
        }

        public Criteria andData50In(List<String> values) {
            addCriterion("DATA50 in", values, "data50");
            return (Criteria) this;
        }

        public Criteria andData50NotIn(List<String> values) {
            addCriterion("DATA50 not in", values, "data50");
            return (Criteria) this;
        }

        public Criteria andData50Between(String value1, String value2) {
            addCriterion("DATA50 between", value1, value2, "data50");
            return (Criteria) this;
        }

        public Criteria andData50NotBetween(String value1, String value2) {
            addCriterion("DATA50 not between", value1, value2, "data50");
            return (Criteria) this;
        }

        public Criteria andData51IsNull() {
            addCriterion("DATA51 is null");
            return (Criteria) this;
        }

        public Criteria andData51IsNotNull() {
            addCriterion("DATA51 is not null");
            return (Criteria) this;
        }

        public Criteria andData51EqualTo(String value) {
            addCriterion("DATA51 =", value, "data51");
            return (Criteria) this;
        }

        public Criteria andData51NotEqualTo(String value) {
            addCriterion("DATA51 <>", value, "data51");
            return (Criteria) this;
        }

        public Criteria andData51GreaterThan(String value) {
            addCriterion("DATA51 >", value, "data51");
            return (Criteria) this;
        }

        public Criteria andData51GreaterThanOrEqualTo(String value) {
            addCriterion("DATA51 >=", value, "data51");
            return (Criteria) this;
        }

        public Criteria andData51LessThan(String value) {
            addCriterion("DATA51 <", value, "data51");
            return (Criteria) this;
        }

        public Criteria andData51LessThanOrEqualTo(String value) {
            addCriterion("DATA51 <=", value, "data51");
            return (Criteria) this;
        }

        public Criteria andData51Like(String value) {
            addCriterion("DATA51 like", value, "data51");
            return (Criteria) this;
        }

        public Criteria andData51NotLike(String value) {
            addCriterion("DATA51 not like", value, "data51");
            return (Criteria) this;
        }

        public Criteria andData51In(List<String> values) {
            addCriterion("DATA51 in", values, "data51");
            return (Criteria) this;
        }

        public Criteria andData51NotIn(List<String> values) {
            addCriterion("DATA51 not in", values, "data51");
            return (Criteria) this;
        }

        public Criteria andData51Between(String value1, String value2) {
            addCriterion("DATA51 between", value1, value2, "data51");
            return (Criteria) this;
        }

        public Criteria andData51NotBetween(String value1, String value2) {
            addCriterion("DATA51 not between", value1, value2, "data51");
            return (Criteria) this;
        }

        public Criteria andData52IsNull() {
            addCriterion("DATA52 is null");
            return (Criteria) this;
        }

        public Criteria andData52IsNotNull() {
            addCriterion("DATA52 is not null");
            return (Criteria) this;
        }

        public Criteria andData52EqualTo(String value) {
            addCriterion("DATA52 =", value, "data52");
            return (Criteria) this;
        }

        public Criteria andData52NotEqualTo(String value) {
            addCriterion("DATA52 <>", value, "data52");
            return (Criteria) this;
        }

        public Criteria andData52GreaterThan(String value) {
            addCriterion("DATA52 >", value, "data52");
            return (Criteria) this;
        }

        public Criteria andData52GreaterThanOrEqualTo(String value) {
            addCriterion("DATA52 >=", value, "data52");
            return (Criteria) this;
        }

        public Criteria andData52LessThan(String value) {
            addCriterion("DATA52 <", value, "data52");
            return (Criteria) this;
        }

        public Criteria andData52LessThanOrEqualTo(String value) {
            addCriterion("DATA52 <=", value, "data52");
            return (Criteria) this;
        }

        public Criteria andData52Like(String value) {
            addCriterion("DATA52 like", value, "data52");
            return (Criteria) this;
        }

        public Criteria andData52NotLike(String value) {
            addCriterion("DATA52 not like", value, "data52");
            return (Criteria) this;
        }

        public Criteria andData52In(List<String> values) {
            addCriterion("DATA52 in", values, "data52");
            return (Criteria) this;
        }

        public Criteria andData52NotIn(List<String> values) {
            addCriterion("DATA52 not in", values, "data52");
            return (Criteria) this;
        }

        public Criteria andData52Between(String value1, String value2) {
            addCriterion("DATA52 between", value1, value2, "data52");
            return (Criteria) this;
        }

        public Criteria andData52NotBetween(String value1, String value2) {
            addCriterion("DATA52 not between", value1, value2, "data52");
            return (Criteria) this;
        }

        public Criteria andData53IsNull() {
            addCriterion("DATA53 is null");
            return (Criteria) this;
        }

        public Criteria andData53IsNotNull() {
            addCriterion("DATA53 is not null");
            return (Criteria) this;
        }

        public Criteria andData53EqualTo(String value) {
            addCriterion("DATA53 =", value, "data53");
            return (Criteria) this;
        }

        public Criteria andData53NotEqualTo(String value) {
            addCriterion("DATA53 <>", value, "data53");
            return (Criteria) this;
        }

        public Criteria andData53GreaterThan(String value) {
            addCriterion("DATA53 >", value, "data53");
            return (Criteria) this;
        }

        public Criteria andData53GreaterThanOrEqualTo(String value) {
            addCriterion("DATA53 >=", value, "data53");
            return (Criteria) this;
        }

        public Criteria andData53LessThan(String value) {
            addCriterion("DATA53 <", value, "data53");
            return (Criteria) this;
        }

        public Criteria andData53LessThanOrEqualTo(String value) {
            addCriterion("DATA53 <=", value, "data53");
            return (Criteria) this;
        }

        public Criteria andData53Like(String value) {
            addCriterion("DATA53 like", value, "data53");
            return (Criteria) this;
        }

        public Criteria andData53NotLike(String value) {
            addCriterion("DATA53 not like", value, "data53");
            return (Criteria) this;
        }

        public Criteria andData53In(List<String> values) {
            addCriterion("DATA53 in", values, "data53");
            return (Criteria) this;
        }

        public Criteria andData53NotIn(List<String> values) {
            addCriterion("DATA53 not in", values, "data53");
            return (Criteria) this;
        }

        public Criteria andData53Between(String value1, String value2) {
            addCriterion("DATA53 between", value1, value2, "data53");
            return (Criteria) this;
        }

        public Criteria andData53NotBetween(String value1, String value2) {
            addCriterion("DATA53 not between", value1, value2, "data53");
            return (Criteria) this;
        }

        public Criteria andData54IsNull() {
            addCriterion("DATA54 is null");
            return (Criteria) this;
        }

        public Criteria andData54IsNotNull() {
            addCriterion("DATA54 is not null");
            return (Criteria) this;
        }

        public Criteria andData54EqualTo(String value) {
            addCriterion("DATA54 =", value, "data54");
            return (Criteria) this;
        }

        public Criteria andData54NotEqualTo(String value) {
            addCriterion("DATA54 <>", value, "data54");
            return (Criteria) this;
        }

        public Criteria andData54GreaterThan(String value) {
            addCriterion("DATA54 >", value, "data54");
            return (Criteria) this;
        }

        public Criteria andData54GreaterThanOrEqualTo(String value) {
            addCriterion("DATA54 >=", value, "data54");
            return (Criteria) this;
        }

        public Criteria andData54LessThan(String value) {
            addCriterion("DATA54 <", value, "data54");
            return (Criteria) this;
        }

        public Criteria andData54LessThanOrEqualTo(String value) {
            addCriterion("DATA54 <=", value, "data54");
            return (Criteria) this;
        }

        public Criteria andData54Like(String value) {
            addCriterion("DATA54 like", value, "data54");
            return (Criteria) this;
        }

        public Criteria andData54NotLike(String value) {
            addCriterion("DATA54 not like", value, "data54");
            return (Criteria) this;
        }

        public Criteria andData54In(List<String> values) {
            addCriterion("DATA54 in", values, "data54");
            return (Criteria) this;
        }

        public Criteria andData54NotIn(List<String> values) {
            addCriterion("DATA54 not in", values, "data54");
            return (Criteria) this;
        }

        public Criteria andData54Between(String value1, String value2) {
            addCriterion("DATA54 between", value1, value2, "data54");
            return (Criteria) this;
        }

        public Criteria andData54NotBetween(String value1, String value2) {
            addCriterion("DATA54 not between", value1, value2, "data54");
            return (Criteria) this;
        }

        public Criteria andData55IsNull() {
            addCriterion("DATA55 is null");
            return (Criteria) this;
        }

        public Criteria andData55IsNotNull() {
            addCriterion("DATA55 is not null");
            return (Criteria) this;
        }

        public Criteria andData55EqualTo(String value) {
            addCriterion("DATA55 =", value, "data55");
            return (Criteria) this;
        }

        public Criteria andData55NotEqualTo(String value) {
            addCriterion("DATA55 <>", value, "data55");
            return (Criteria) this;
        }

        public Criteria andData55GreaterThan(String value) {
            addCriterion("DATA55 >", value, "data55");
            return (Criteria) this;
        }

        public Criteria andData55GreaterThanOrEqualTo(String value) {
            addCriterion("DATA55 >=", value, "data55");
            return (Criteria) this;
        }

        public Criteria andData55LessThan(String value) {
            addCriterion("DATA55 <", value, "data55");
            return (Criteria) this;
        }

        public Criteria andData55LessThanOrEqualTo(String value) {
            addCriterion("DATA55 <=", value, "data55");
            return (Criteria) this;
        }

        public Criteria andData55Like(String value) {
            addCriterion("DATA55 like", value, "data55");
            return (Criteria) this;
        }

        public Criteria andData55NotLike(String value) {
            addCriterion("DATA55 not like", value, "data55");
            return (Criteria) this;
        }

        public Criteria andData55In(List<String> values) {
            addCriterion("DATA55 in", values, "data55");
            return (Criteria) this;
        }

        public Criteria andData55NotIn(List<String> values) {
            addCriterion("DATA55 not in", values, "data55");
            return (Criteria) this;
        }

        public Criteria andData55Between(String value1, String value2) {
            addCriterion("DATA55 between", value1, value2, "data55");
            return (Criteria) this;
        }

        public Criteria andData55NotBetween(String value1, String value2) {
            addCriterion("DATA55 not between", value1, value2, "data55");
            return (Criteria) this;
        }

        public Criteria andData56IsNull() {
            addCriterion("DATA56 is null");
            return (Criteria) this;
        }

        public Criteria andData56IsNotNull() {
            addCriterion("DATA56 is not null");
            return (Criteria) this;
        }

        public Criteria andData56EqualTo(String value) {
            addCriterion("DATA56 =", value, "data56");
            return (Criteria) this;
        }

        public Criteria andData56NotEqualTo(String value) {
            addCriterion("DATA56 <>", value, "data56");
            return (Criteria) this;
        }

        public Criteria andData56GreaterThan(String value) {
            addCriterion("DATA56 >", value, "data56");
            return (Criteria) this;
        }

        public Criteria andData56GreaterThanOrEqualTo(String value) {
            addCriterion("DATA56 >=", value, "data56");
            return (Criteria) this;
        }

        public Criteria andData56LessThan(String value) {
            addCriterion("DATA56 <", value, "data56");
            return (Criteria) this;
        }

        public Criteria andData56LessThanOrEqualTo(String value) {
            addCriterion("DATA56 <=", value, "data56");
            return (Criteria) this;
        }

        public Criteria andData56Like(String value) {
            addCriterion("DATA56 like", value, "data56");
            return (Criteria) this;
        }

        public Criteria andData56NotLike(String value) {
            addCriterion("DATA56 not like", value, "data56");
            return (Criteria) this;
        }

        public Criteria andData56In(List<String> values) {
            addCriterion("DATA56 in", values, "data56");
            return (Criteria) this;
        }

        public Criteria andData56NotIn(List<String> values) {
            addCriterion("DATA56 not in", values, "data56");
            return (Criteria) this;
        }

        public Criteria andData56Between(String value1, String value2) {
            addCriterion("DATA56 between", value1, value2, "data56");
            return (Criteria) this;
        }

        public Criteria andData56NotBetween(String value1, String value2) {
            addCriterion("DATA56 not between", value1, value2, "data56");
            return (Criteria) this;
        }

        public Criteria andData57IsNull() {
            addCriterion("DATA57 is null");
            return (Criteria) this;
        }

        public Criteria andData57IsNotNull() {
            addCriterion("DATA57 is not null");
            return (Criteria) this;
        }

        public Criteria andData57EqualTo(String value) {
            addCriterion("DATA57 =", value, "data57");
            return (Criteria) this;
        }

        public Criteria andData57NotEqualTo(String value) {
            addCriterion("DATA57 <>", value, "data57");
            return (Criteria) this;
        }

        public Criteria andData57GreaterThan(String value) {
            addCriterion("DATA57 >", value, "data57");
            return (Criteria) this;
        }

        public Criteria andData57GreaterThanOrEqualTo(String value) {
            addCriterion("DATA57 >=", value, "data57");
            return (Criteria) this;
        }

        public Criteria andData57LessThan(String value) {
            addCriterion("DATA57 <", value, "data57");
            return (Criteria) this;
        }

        public Criteria andData57LessThanOrEqualTo(String value) {
            addCriterion("DATA57 <=", value, "data57");
            return (Criteria) this;
        }

        public Criteria andData57Like(String value) {
            addCriterion("DATA57 like", value, "data57");
            return (Criteria) this;
        }

        public Criteria andData57NotLike(String value) {
            addCriterion("DATA57 not like", value, "data57");
            return (Criteria) this;
        }

        public Criteria andData57In(List<String> values) {
            addCriterion("DATA57 in", values, "data57");
            return (Criteria) this;
        }

        public Criteria andData57NotIn(List<String> values) {
            addCriterion("DATA57 not in", values, "data57");
            return (Criteria) this;
        }

        public Criteria andData57Between(String value1, String value2) {
            addCriterion("DATA57 between", value1, value2, "data57");
            return (Criteria) this;
        }

        public Criteria andData57NotBetween(String value1, String value2) {
            addCriterion("DATA57 not between", value1, value2, "data57");
            return (Criteria) this;
        }

        public Criteria andData58IsNull() {
            addCriterion("DATA58 is null");
            return (Criteria) this;
        }

        public Criteria andData58IsNotNull() {
            addCriterion("DATA58 is not null");
            return (Criteria) this;
        }

        public Criteria andData58EqualTo(String value) {
            addCriterion("DATA58 =", value, "data58");
            return (Criteria) this;
        }

        public Criteria andData58NotEqualTo(String value) {
            addCriterion("DATA58 <>", value, "data58");
            return (Criteria) this;
        }

        public Criteria andData58GreaterThan(String value) {
            addCriterion("DATA58 >", value, "data58");
            return (Criteria) this;
        }

        public Criteria andData58GreaterThanOrEqualTo(String value) {
            addCriterion("DATA58 >=", value, "data58");
            return (Criteria) this;
        }

        public Criteria andData58LessThan(String value) {
            addCriterion("DATA58 <", value, "data58");
            return (Criteria) this;
        }

        public Criteria andData58LessThanOrEqualTo(String value) {
            addCriterion("DATA58 <=", value, "data58");
            return (Criteria) this;
        }

        public Criteria andData58Like(String value) {
            addCriterion("DATA58 like", value, "data58");
            return (Criteria) this;
        }

        public Criteria andData58NotLike(String value) {
            addCriterion("DATA58 not like", value, "data58");
            return (Criteria) this;
        }

        public Criteria andData58In(List<String> values) {
            addCriterion("DATA58 in", values, "data58");
            return (Criteria) this;
        }

        public Criteria andData58NotIn(List<String> values) {
            addCriterion("DATA58 not in", values, "data58");
            return (Criteria) this;
        }

        public Criteria andData58Between(String value1, String value2) {
            addCriterion("DATA58 between", value1, value2, "data58");
            return (Criteria) this;
        }

        public Criteria andData58NotBetween(String value1, String value2) {
            addCriterion("DATA58 not between", value1, value2, "data58");
            return (Criteria) this;
        }

        public Criteria andData59IsNull() {
            addCriterion("DATA59 is null");
            return (Criteria) this;
        }

        public Criteria andData59IsNotNull() {
            addCriterion("DATA59 is not null");
            return (Criteria) this;
        }

        public Criteria andData59EqualTo(String value) {
            addCriterion("DATA59 =", value, "data59");
            return (Criteria) this;
        }

        public Criteria andData59NotEqualTo(String value) {
            addCriterion("DATA59 <>", value, "data59");
            return (Criteria) this;
        }

        public Criteria andData59GreaterThan(String value) {
            addCriterion("DATA59 >", value, "data59");
            return (Criteria) this;
        }

        public Criteria andData59GreaterThanOrEqualTo(String value) {
            addCriterion("DATA59 >=", value, "data59");
            return (Criteria) this;
        }

        public Criteria andData59LessThan(String value) {
            addCriterion("DATA59 <", value, "data59");
            return (Criteria) this;
        }

        public Criteria andData59LessThanOrEqualTo(String value) {
            addCriterion("DATA59 <=", value, "data59");
            return (Criteria) this;
        }

        public Criteria andData59Like(String value) {
            addCriterion("DATA59 like", value, "data59");
            return (Criteria) this;
        }

        public Criteria andData59NotLike(String value) {
            addCriterion("DATA59 not like", value, "data59");
            return (Criteria) this;
        }

        public Criteria andData59In(List<String> values) {
            addCriterion("DATA59 in", values, "data59");
            return (Criteria) this;
        }

        public Criteria andData59NotIn(List<String> values) {
            addCriterion("DATA59 not in", values, "data59");
            return (Criteria) this;
        }

        public Criteria andData59Between(String value1, String value2) {
            addCriterion("DATA59 between", value1, value2, "data59");
            return (Criteria) this;
        }

        public Criteria andData59NotBetween(String value1, String value2) {
            addCriterion("DATA59 not between", value1, value2, "data59");
            return (Criteria) this;
        }

        public Criteria andData60IsNull() {
            addCriterion("DATA60 is null");
            return (Criteria) this;
        }

        public Criteria andData60IsNotNull() {
            addCriterion("DATA60 is not null");
            return (Criteria) this;
        }

        public Criteria andData60EqualTo(String value) {
            addCriterion("DATA60 =", value, "data60");
            return (Criteria) this;
        }

        public Criteria andData60NotEqualTo(String value) {
            addCriterion("DATA60 <>", value, "data60");
            return (Criteria) this;
        }

        public Criteria andData60GreaterThan(String value) {
            addCriterion("DATA60 >", value, "data60");
            return (Criteria) this;
        }

        public Criteria andData60GreaterThanOrEqualTo(String value) {
            addCriterion("DATA60 >=", value, "data60");
            return (Criteria) this;
        }

        public Criteria andData60LessThan(String value) {
            addCriterion("DATA60 <", value, "data60");
            return (Criteria) this;
        }

        public Criteria andData60LessThanOrEqualTo(String value) {
            addCriterion("DATA60 <=", value, "data60");
            return (Criteria) this;
        }

        public Criteria andData60Like(String value) {
            addCriterion("DATA60 like", value, "data60");
            return (Criteria) this;
        }

        public Criteria andData60NotLike(String value) {
            addCriterion("DATA60 not like", value, "data60");
            return (Criteria) this;
        }

        public Criteria andData60In(List<String> values) {
            addCriterion("DATA60 in", values, "data60");
            return (Criteria) this;
        }

        public Criteria andData60NotIn(List<String> values) {
            addCriterion("DATA60 not in", values, "data60");
            return (Criteria) this;
        }

        public Criteria andData60Between(String value1, String value2) {
            addCriterion("DATA60 between", value1, value2, "data60");
            return (Criteria) this;
        }

        public Criteria andData60NotBetween(String value1, String value2) {
            addCriterion("DATA60 not between", value1, value2, "data60");
            return (Criteria) this;
        }

        public Criteria andData61IsNull() {
            addCriterion("DATA61 is null");
            return (Criteria) this;
        }

        public Criteria andData61IsNotNull() {
            addCriterion("DATA61 is not null");
            return (Criteria) this;
        }

        public Criteria andData61EqualTo(String value) {
            addCriterion("DATA61 =", value, "data61");
            return (Criteria) this;
        }

        public Criteria andData61NotEqualTo(String value) {
            addCriterion("DATA61 <>", value, "data61");
            return (Criteria) this;
        }

        public Criteria andData61GreaterThan(String value) {
            addCriterion("DATA61 >", value, "data61");
            return (Criteria) this;
        }

        public Criteria andData61GreaterThanOrEqualTo(String value) {
            addCriterion("DATA61 >=", value, "data61");
            return (Criteria) this;
        }

        public Criteria andData61LessThan(String value) {
            addCriterion("DATA61 <", value, "data61");
            return (Criteria) this;
        }

        public Criteria andData61LessThanOrEqualTo(String value) {
            addCriterion("DATA61 <=", value, "data61");
            return (Criteria) this;
        }

        public Criteria andData61Like(String value) {
            addCriterion("DATA61 like", value, "data61");
            return (Criteria) this;
        }

        public Criteria andData61NotLike(String value) {
            addCriterion("DATA61 not like", value, "data61");
            return (Criteria) this;
        }

        public Criteria andData61In(List<String> values) {
            addCriterion("DATA61 in", values, "data61");
            return (Criteria) this;
        }

        public Criteria andData61NotIn(List<String> values) {
            addCriterion("DATA61 not in", values, "data61");
            return (Criteria) this;
        }

        public Criteria andData61Between(String value1, String value2) {
            addCriterion("DATA61 between", value1, value2, "data61");
            return (Criteria) this;
        }

        public Criteria andData61NotBetween(String value1, String value2) {
            addCriterion("DATA61 not between", value1, value2, "data61");
            return (Criteria) this;
        }

        public Criteria andData62IsNull() {
            addCriterion("DATA62 is null");
            return (Criteria) this;
        }

        public Criteria andData62IsNotNull() {
            addCriterion("DATA62 is not null");
            return (Criteria) this;
        }

        public Criteria andData62EqualTo(String value) {
            addCriterion("DATA62 =", value, "data62");
            return (Criteria) this;
        }

        public Criteria andData62NotEqualTo(String value) {
            addCriterion("DATA62 <>", value, "data62");
            return (Criteria) this;
        }

        public Criteria andData62GreaterThan(String value) {
            addCriterion("DATA62 >", value, "data62");
            return (Criteria) this;
        }

        public Criteria andData62GreaterThanOrEqualTo(String value) {
            addCriterion("DATA62 >=", value, "data62");
            return (Criteria) this;
        }

        public Criteria andData62LessThan(String value) {
            addCriterion("DATA62 <", value, "data62");
            return (Criteria) this;
        }

        public Criteria andData62LessThanOrEqualTo(String value) {
            addCriterion("DATA62 <=", value, "data62");
            return (Criteria) this;
        }

        public Criteria andData62Like(String value) {
            addCriterion("DATA62 like", value, "data62");
            return (Criteria) this;
        }

        public Criteria andData62NotLike(String value) {
            addCriterion("DATA62 not like", value, "data62");
            return (Criteria) this;
        }

        public Criteria andData62In(List<String> values) {
            addCriterion("DATA62 in", values, "data62");
            return (Criteria) this;
        }

        public Criteria andData62NotIn(List<String> values) {
            addCriterion("DATA62 not in", values, "data62");
            return (Criteria) this;
        }

        public Criteria andData62Between(String value1, String value2) {
            addCriterion("DATA62 between", value1, value2, "data62");
            return (Criteria) this;
        }

        public Criteria andData62NotBetween(String value1, String value2) {
            addCriterion("DATA62 not between", value1, value2, "data62");
            return (Criteria) this;
        }

        public Criteria andData63IsNull() {
            addCriterion("DATA63 is null");
            return (Criteria) this;
        }

        public Criteria andData63IsNotNull() {
            addCriterion("DATA63 is not null");
            return (Criteria) this;
        }

        public Criteria andData63EqualTo(String value) {
            addCriterion("DATA63 =", value, "data63");
            return (Criteria) this;
        }

        public Criteria andData63NotEqualTo(String value) {
            addCriterion("DATA63 <>", value, "data63");
            return (Criteria) this;
        }

        public Criteria andData63GreaterThan(String value) {
            addCriterion("DATA63 >", value, "data63");
            return (Criteria) this;
        }

        public Criteria andData63GreaterThanOrEqualTo(String value) {
            addCriterion("DATA63 >=", value, "data63");
            return (Criteria) this;
        }

        public Criteria andData63LessThan(String value) {
            addCriterion("DATA63 <", value, "data63");
            return (Criteria) this;
        }

        public Criteria andData63LessThanOrEqualTo(String value) {
            addCriterion("DATA63 <=", value, "data63");
            return (Criteria) this;
        }

        public Criteria andData63Like(String value) {
            addCriterion("DATA63 like", value, "data63");
            return (Criteria) this;
        }

        public Criteria andData63NotLike(String value) {
            addCriterion("DATA63 not like", value, "data63");
            return (Criteria) this;
        }

        public Criteria andData63In(List<String> values) {
            addCriterion("DATA63 in", values, "data63");
            return (Criteria) this;
        }

        public Criteria andData63NotIn(List<String> values) {
            addCriterion("DATA63 not in", values, "data63");
            return (Criteria) this;
        }

        public Criteria andData63Between(String value1, String value2) {
            addCriterion("DATA63 between", value1, value2, "data63");
            return (Criteria) this;
        }

        public Criteria andData63NotBetween(String value1, String value2) {
            addCriterion("DATA63 not between", value1, value2, "data63");
            return (Criteria) this;
        }

        public Criteria andData64IsNull() {
            addCriterion("DATA64 is null");
            return (Criteria) this;
        }

        public Criteria andData64IsNotNull() {
            addCriterion("DATA64 is not null");
            return (Criteria) this;
        }

        public Criteria andData64EqualTo(String value) {
            addCriterion("DATA64 =", value, "data64");
            return (Criteria) this;
        }

        public Criteria andData64NotEqualTo(String value) {
            addCriterion("DATA64 <>", value, "data64");
            return (Criteria) this;
        }

        public Criteria andData64GreaterThan(String value) {
            addCriterion("DATA64 >", value, "data64");
            return (Criteria) this;
        }

        public Criteria andData64GreaterThanOrEqualTo(String value) {
            addCriterion("DATA64 >=", value, "data64");
            return (Criteria) this;
        }

        public Criteria andData64LessThan(String value) {
            addCriterion("DATA64 <", value, "data64");
            return (Criteria) this;
        }

        public Criteria andData64LessThanOrEqualTo(String value) {
            addCriterion("DATA64 <=", value, "data64");
            return (Criteria) this;
        }

        public Criteria andData64Like(String value) {
            addCriterion("DATA64 like", value, "data64");
            return (Criteria) this;
        }

        public Criteria andData64NotLike(String value) {
            addCriterion("DATA64 not like", value, "data64");
            return (Criteria) this;
        }

        public Criteria andData64In(List<String> values) {
            addCriterion("DATA64 in", values, "data64");
            return (Criteria) this;
        }

        public Criteria andData64NotIn(List<String> values) {
            addCriterion("DATA64 not in", values, "data64");
            return (Criteria) this;
        }

        public Criteria andData64Between(String value1, String value2) {
            addCriterion("DATA64 between", value1, value2, "data64");
            return (Criteria) this;
        }

        public Criteria andData64NotBetween(String value1, String value2) {
            addCriterion("DATA64 not between", value1, value2, "data64");
            return (Criteria) this;
        }

        public Criteria andData65IsNull() {
            addCriterion("DATA65 is null");
            return (Criteria) this;
        }

        public Criteria andData65IsNotNull() {
            addCriterion("DATA65 is not null");
            return (Criteria) this;
        }

        public Criteria andData65EqualTo(String value) {
            addCriterion("DATA65 =", value, "data65");
            return (Criteria) this;
        }

        public Criteria andData65NotEqualTo(String value) {
            addCriterion("DATA65 <>", value, "data65");
            return (Criteria) this;
        }

        public Criteria andData65GreaterThan(String value) {
            addCriterion("DATA65 >", value, "data65");
            return (Criteria) this;
        }

        public Criteria andData65GreaterThanOrEqualTo(String value) {
            addCriterion("DATA65 >=", value, "data65");
            return (Criteria) this;
        }

        public Criteria andData65LessThan(String value) {
            addCriterion("DATA65 <", value, "data65");
            return (Criteria) this;
        }

        public Criteria andData65LessThanOrEqualTo(String value) {
            addCriterion("DATA65 <=", value, "data65");
            return (Criteria) this;
        }

        public Criteria andData65Like(String value) {
            addCriterion("DATA65 like", value, "data65");
            return (Criteria) this;
        }

        public Criteria andData65NotLike(String value) {
            addCriterion("DATA65 not like", value, "data65");
            return (Criteria) this;
        }

        public Criteria andData65In(List<String> values) {
            addCriterion("DATA65 in", values, "data65");
            return (Criteria) this;
        }

        public Criteria andData65NotIn(List<String> values) {
            addCriterion("DATA65 not in", values, "data65");
            return (Criteria) this;
        }

        public Criteria andData65Between(String value1, String value2) {
            addCriterion("DATA65 between", value1, value2, "data65");
            return (Criteria) this;
        }

        public Criteria andData65NotBetween(String value1, String value2) {
            addCriterion("DATA65 not between", value1, value2, "data65");
            return (Criteria) this;
        }

        public Criteria andData66IsNull() {
            addCriterion("DATA66 is null");
            return (Criteria) this;
        }

        public Criteria andData66IsNotNull() {
            addCriterion("DATA66 is not null");
            return (Criteria) this;
        }

        public Criteria andData66EqualTo(String value) {
            addCriterion("DATA66 =", value, "data66");
            return (Criteria) this;
        }

        public Criteria andData66NotEqualTo(String value) {
            addCriterion("DATA66 <>", value, "data66");
            return (Criteria) this;
        }

        public Criteria andData66GreaterThan(String value) {
            addCriterion("DATA66 >", value, "data66");
            return (Criteria) this;
        }

        public Criteria andData66GreaterThanOrEqualTo(String value) {
            addCriterion("DATA66 >=", value, "data66");
            return (Criteria) this;
        }

        public Criteria andData66LessThan(String value) {
            addCriterion("DATA66 <", value, "data66");
            return (Criteria) this;
        }

        public Criteria andData66LessThanOrEqualTo(String value) {
            addCriterion("DATA66 <=", value, "data66");
            return (Criteria) this;
        }

        public Criteria andData66Like(String value) {
            addCriterion("DATA66 like", value, "data66");
            return (Criteria) this;
        }

        public Criteria andData66NotLike(String value) {
            addCriterion("DATA66 not like", value, "data66");
            return (Criteria) this;
        }

        public Criteria andData66In(List<String> values) {
            addCriterion("DATA66 in", values, "data66");
            return (Criteria) this;
        }

        public Criteria andData66NotIn(List<String> values) {
            addCriterion("DATA66 not in", values, "data66");
            return (Criteria) this;
        }

        public Criteria andData66Between(String value1, String value2) {
            addCriterion("DATA66 between", value1, value2, "data66");
            return (Criteria) this;
        }

        public Criteria andData66NotBetween(String value1, String value2) {
            addCriterion("DATA66 not between", value1, value2, "data66");
            return (Criteria) this;
        }

        public Criteria andData67IsNull() {
            addCriterion("DATA67 is null");
            return (Criteria) this;
        }

        public Criteria andData67IsNotNull() {
            addCriterion("DATA67 is not null");
            return (Criteria) this;
        }

        public Criteria andData67EqualTo(String value) {
            addCriterion("DATA67 =", value, "data67");
            return (Criteria) this;
        }

        public Criteria andData67NotEqualTo(String value) {
            addCriterion("DATA67 <>", value, "data67");
            return (Criteria) this;
        }

        public Criteria andData67GreaterThan(String value) {
            addCriterion("DATA67 >", value, "data67");
            return (Criteria) this;
        }

        public Criteria andData67GreaterThanOrEqualTo(String value) {
            addCriterion("DATA67 >=", value, "data67");
            return (Criteria) this;
        }

        public Criteria andData67LessThan(String value) {
            addCriterion("DATA67 <", value, "data67");
            return (Criteria) this;
        }

        public Criteria andData67LessThanOrEqualTo(String value) {
            addCriterion("DATA67 <=", value, "data67");
            return (Criteria) this;
        }

        public Criteria andData67Like(String value) {
            addCriterion("DATA67 like", value, "data67");
            return (Criteria) this;
        }

        public Criteria andData67NotLike(String value) {
            addCriterion("DATA67 not like", value, "data67");
            return (Criteria) this;
        }

        public Criteria andData67In(List<String> values) {
            addCriterion("DATA67 in", values, "data67");
            return (Criteria) this;
        }

        public Criteria andData67NotIn(List<String> values) {
            addCriterion("DATA67 not in", values, "data67");
            return (Criteria) this;
        }

        public Criteria andData67Between(String value1, String value2) {
            addCriterion("DATA67 between", value1, value2, "data67");
            return (Criteria) this;
        }

        public Criteria andData67NotBetween(String value1, String value2) {
            addCriterion("DATA67 not between", value1, value2, "data67");
            return (Criteria) this;
        }

        public Criteria andData68IsNull() {
            addCriterion("DATA68 is null");
            return (Criteria) this;
        }

        public Criteria andData68IsNotNull() {
            addCriterion("DATA68 is not null");
            return (Criteria) this;
        }

        public Criteria andData68EqualTo(String value) {
            addCriterion("DATA68 =", value, "data68");
            return (Criteria) this;
        }

        public Criteria andData68NotEqualTo(String value) {
            addCriterion("DATA68 <>", value, "data68");
            return (Criteria) this;
        }

        public Criteria andData68GreaterThan(String value) {
            addCriterion("DATA68 >", value, "data68");
            return (Criteria) this;
        }

        public Criteria andData68GreaterThanOrEqualTo(String value) {
            addCriterion("DATA68 >=", value, "data68");
            return (Criteria) this;
        }

        public Criteria andData68LessThan(String value) {
            addCriterion("DATA68 <", value, "data68");
            return (Criteria) this;
        }

        public Criteria andData68LessThanOrEqualTo(String value) {
            addCriterion("DATA68 <=", value, "data68");
            return (Criteria) this;
        }

        public Criteria andData68Like(String value) {
            addCriterion("DATA68 like", value, "data68");
            return (Criteria) this;
        }

        public Criteria andData68NotLike(String value) {
            addCriterion("DATA68 not like", value, "data68");
            return (Criteria) this;
        }

        public Criteria andData68In(List<String> values) {
            addCriterion("DATA68 in", values, "data68");
            return (Criteria) this;
        }

        public Criteria andData68NotIn(List<String> values) {
            addCriterion("DATA68 not in", values, "data68");
            return (Criteria) this;
        }

        public Criteria andData68Between(String value1, String value2) {
            addCriterion("DATA68 between", value1, value2, "data68");
            return (Criteria) this;
        }

        public Criteria andData68NotBetween(String value1, String value2) {
            addCriterion("DATA68 not between", value1, value2, "data68");
            return (Criteria) this;
        }

        public Criteria andData69IsNull() {
            addCriterion("DATA69 is null");
            return (Criteria) this;
        }

        public Criteria andData69IsNotNull() {
            addCriterion("DATA69 is not null");
            return (Criteria) this;
        }

        public Criteria andData69EqualTo(String value) {
            addCriterion("DATA69 =", value, "data69");
            return (Criteria) this;
        }

        public Criteria andData69NotEqualTo(String value) {
            addCriterion("DATA69 <>", value, "data69");
            return (Criteria) this;
        }

        public Criteria andData69GreaterThan(String value) {
            addCriterion("DATA69 >", value, "data69");
            return (Criteria) this;
        }

        public Criteria andData69GreaterThanOrEqualTo(String value) {
            addCriterion("DATA69 >=", value, "data69");
            return (Criteria) this;
        }

        public Criteria andData69LessThan(String value) {
            addCriterion("DATA69 <", value, "data69");
            return (Criteria) this;
        }

        public Criteria andData69LessThanOrEqualTo(String value) {
            addCriterion("DATA69 <=", value, "data69");
            return (Criteria) this;
        }

        public Criteria andData69Like(String value) {
            addCriterion("DATA69 like", value, "data69");
            return (Criteria) this;
        }

        public Criteria andData69NotLike(String value) {
            addCriterion("DATA69 not like", value, "data69");
            return (Criteria) this;
        }

        public Criteria andData69In(List<String> values) {
            addCriterion("DATA69 in", values, "data69");
            return (Criteria) this;
        }

        public Criteria andData69NotIn(List<String> values) {
            addCriterion("DATA69 not in", values, "data69");
            return (Criteria) this;
        }

        public Criteria andData69Between(String value1, String value2) {
            addCriterion("DATA69 between", value1, value2, "data69");
            return (Criteria) this;
        }

        public Criteria andData69NotBetween(String value1, String value2) {
            addCriterion("DATA69 not between", value1, value2, "data69");
            return (Criteria) this;
        }

        public Criteria andData70IsNull() {
            addCriterion("DATA70 is null");
            return (Criteria) this;
        }

        public Criteria andData70IsNotNull() {
            addCriterion("DATA70 is not null");
            return (Criteria) this;
        }

        public Criteria andData70EqualTo(String value) {
            addCriterion("DATA70 =", value, "data70");
            return (Criteria) this;
        }

        public Criteria andData70NotEqualTo(String value) {
            addCriterion("DATA70 <>", value, "data70");
            return (Criteria) this;
        }

        public Criteria andData70GreaterThan(String value) {
            addCriterion("DATA70 >", value, "data70");
            return (Criteria) this;
        }

        public Criteria andData70GreaterThanOrEqualTo(String value) {
            addCriterion("DATA70 >=", value, "data70");
            return (Criteria) this;
        }

        public Criteria andData70LessThan(String value) {
            addCriterion("DATA70 <", value, "data70");
            return (Criteria) this;
        }

        public Criteria andData70LessThanOrEqualTo(String value) {
            addCriterion("DATA70 <=", value, "data70");
            return (Criteria) this;
        }

        public Criteria andData70Like(String value) {
            addCriterion("DATA70 like", value, "data70");
            return (Criteria) this;
        }

        public Criteria andData70NotLike(String value) {
            addCriterion("DATA70 not like", value, "data70");
            return (Criteria) this;
        }

        public Criteria andData70In(List<String> values) {
            addCriterion("DATA70 in", values, "data70");
            return (Criteria) this;
        }

        public Criteria andData70NotIn(List<String> values) {
            addCriterion("DATA70 not in", values, "data70");
            return (Criteria) this;
        }

        public Criteria andData70Between(String value1, String value2) {
            addCriterion("DATA70 between", value1, value2, "data70");
            return (Criteria) this;
        }

        public Criteria andData70NotBetween(String value1, String value2) {
            addCriterion("DATA70 not between", value1, value2, "data70");
            return (Criteria) this;
        }

        public Criteria andData71IsNull() {
            addCriterion("DATA71 is null");
            return (Criteria) this;
        }

        public Criteria andData71IsNotNull() {
            addCriterion("DATA71 is not null");
            return (Criteria) this;
        }

        public Criteria andData71EqualTo(String value) {
            addCriterion("DATA71 =", value, "data71");
            return (Criteria) this;
        }

        public Criteria andData71NotEqualTo(String value) {
            addCriterion("DATA71 <>", value, "data71");
            return (Criteria) this;
        }

        public Criteria andData71GreaterThan(String value) {
            addCriterion("DATA71 >", value, "data71");
            return (Criteria) this;
        }

        public Criteria andData71GreaterThanOrEqualTo(String value) {
            addCriterion("DATA71 >=", value, "data71");
            return (Criteria) this;
        }

        public Criteria andData71LessThan(String value) {
            addCriterion("DATA71 <", value, "data71");
            return (Criteria) this;
        }

        public Criteria andData71LessThanOrEqualTo(String value) {
            addCriterion("DATA71 <=", value, "data71");
            return (Criteria) this;
        }

        public Criteria andData71Like(String value) {
            addCriterion("DATA71 like", value, "data71");
            return (Criteria) this;
        }

        public Criteria andData71NotLike(String value) {
            addCriterion("DATA71 not like", value, "data71");
            return (Criteria) this;
        }

        public Criteria andData71In(List<String> values) {
            addCriterion("DATA71 in", values, "data71");
            return (Criteria) this;
        }

        public Criteria andData71NotIn(List<String> values) {
            addCriterion("DATA71 not in", values, "data71");
            return (Criteria) this;
        }

        public Criteria andData71Between(String value1, String value2) {
            addCriterion("DATA71 between", value1, value2, "data71");
            return (Criteria) this;
        }

        public Criteria andData71NotBetween(String value1, String value2) {
            addCriterion("DATA71 not between", value1, value2, "data71");
            return (Criteria) this;
        }

        public Criteria andData72IsNull() {
            addCriterion("DATA72 is null");
            return (Criteria) this;
        }

        public Criteria andData72IsNotNull() {
            addCriterion("DATA72 is not null");
            return (Criteria) this;
        }

        public Criteria andData72EqualTo(String value) {
            addCriterion("DATA72 =", value, "data72");
            return (Criteria) this;
        }

        public Criteria andData72NotEqualTo(String value) {
            addCriterion("DATA72 <>", value, "data72");
            return (Criteria) this;
        }

        public Criteria andData72GreaterThan(String value) {
            addCriterion("DATA72 >", value, "data72");
            return (Criteria) this;
        }

        public Criteria andData72GreaterThanOrEqualTo(String value) {
            addCriterion("DATA72 >=", value, "data72");
            return (Criteria) this;
        }

        public Criteria andData72LessThan(String value) {
            addCriterion("DATA72 <", value, "data72");
            return (Criteria) this;
        }

        public Criteria andData72LessThanOrEqualTo(String value) {
            addCriterion("DATA72 <=", value, "data72");
            return (Criteria) this;
        }

        public Criteria andData72Like(String value) {
            addCriterion("DATA72 like", value, "data72");
            return (Criteria) this;
        }

        public Criteria andData72NotLike(String value) {
            addCriterion("DATA72 not like", value, "data72");
            return (Criteria) this;
        }

        public Criteria andData72In(List<String> values) {
            addCriterion("DATA72 in", values, "data72");
            return (Criteria) this;
        }

        public Criteria andData72NotIn(List<String> values) {
            addCriterion("DATA72 not in", values, "data72");
            return (Criteria) this;
        }

        public Criteria andData72Between(String value1, String value2) {
            addCriterion("DATA72 between", value1, value2, "data72");
            return (Criteria) this;
        }

        public Criteria andData72NotBetween(String value1, String value2) {
            addCriterion("DATA72 not between", value1, value2, "data72");
            return (Criteria) this;
        }

        public Criteria andData73IsNull() {
            addCriterion("DATA73 is null");
            return (Criteria) this;
        }

        public Criteria andData73IsNotNull() {
            addCriterion("DATA73 is not null");
            return (Criteria) this;
        }

        public Criteria andData73EqualTo(String value) {
            addCriterion("DATA73 =", value, "data73");
            return (Criteria) this;
        }

        public Criteria andData73NotEqualTo(String value) {
            addCriterion("DATA73 <>", value, "data73");
            return (Criteria) this;
        }

        public Criteria andData73GreaterThan(String value) {
            addCriterion("DATA73 >", value, "data73");
            return (Criteria) this;
        }

        public Criteria andData73GreaterThanOrEqualTo(String value) {
            addCriterion("DATA73 >=", value, "data73");
            return (Criteria) this;
        }

        public Criteria andData73LessThan(String value) {
            addCriterion("DATA73 <", value, "data73");
            return (Criteria) this;
        }

        public Criteria andData73LessThanOrEqualTo(String value) {
            addCriterion("DATA73 <=", value, "data73");
            return (Criteria) this;
        }

        public Criteria andData73Like(String value) {
            addCriterion("DATA73 like", value, "data73");
            return (Criteria) this;
        }

        public Criteria andData73NotLike(String value) {
            addCriterion("DATA73 not like", value, "data73");
            return (Criteria) this;
        }

        public Criteria andData73In(List<String> values) {
            addCriterion("DATA73 in", values, "data73");
            return (Criteria) this;
        }

        public Criteria andData73NotIn(List<String> values) {
            addCriterion("DATA73 not in", values, "data73");
            return (Criteria) this;
        }

        public Criteria andData73Between(String value1, String value2) {
            addCriterion("DATA73 between", value1, value2, "data73");
            return (Criteria) this;
        }

        public Criteria andData73NotBetween(String value1, String value2) {
            addCriterion("DATA73 not between", value1, value2, "data73");
            return (Criteria) this;
        }

        public Criteria andData74IsNull() {
            addCriterion("DATA74 is null");
            return (Criteria) this;
        }

        public Criteria andData74IsNotNull() {
            addCriterion("DATA74 is not null");
            return (Criteria) this;
        }

        public Criteria andData74EqualTo(String value) {
            addCriterion("DATA74 =", value, "data74");
            return (Criteria) this;
        }

        public Criteria andData74NotEqualTo(String value) {
            addCriterion("DATA74 <>", value, "data74");
            return (Criteria) this;
        }

        public Criteria andData74GreaterThan(String value) {
            addCriterion("DATA74 >", value, "data74");
            return (Criteria) this;
        }

        public Criteria andData74GreaterThanOrEqualTo(String value) {
            addCriterion("DATA74 >=", value, "data74");
            return (Criteria) this;
        }

        public Criteria andData74LessThan(String value) {
            addCriterion("DATA74 <", value, "data74");
            return (Criteria) this;
        }

        public Criteria andData74LessThanOrEqualTo(String value) {
            addCriterion("DATA74 <=", value, "data74");
            return (Criteria) this;
        }

        public Criteria andData74Like(String value) {
            addCriterion("DATA74 like", value, "data74");
            return (Criteria) this;
        }

        public Criteria andData74NotLike(String value) {
            addCriterion("DATA74 not like", value, "data74");
            return (Criteria) this;
        }

        public Criteria andData74In(List<String> values) {
            addCriterion("DATA74 in", values, "data74");
            return (Criteria) this;
        }

        public Criteria andData74NotIn(List<String> values) {
            addCriterion("DATA74 not in", values, "data74");
            return (Criteria) this;
        }

        public Criteria andData74Between(String value1, String value2) {
            addCriterion("DATA74 between", value1, value2, "data74");
            return (Criteria) this;
        }

        public Criteria andData74NotBetween(String value1, String value2) {
            addCriterion("DATA74 not between", value1, value2, "data74");
            return (Criteria) this;
        }

        public Criteria andData75IsNull() {
            addCriterion("DATA75 is null");
            return (Criteria) this;
        }

        public Criteria andData75IsNotNull() {
            addCriterion("DATA75 is not null");
            return (Criteria) this;
        }

        public Criteria andData75EqualTo(String value) {
            addCriterion("DATA75 =", value, "data75");
            return (Criteria) this;
        }

        public Criteria andData75NotEqualTo(String value) {
            addCriterion("DATA75 <>", value, "data75");
            return (Criteria) this;
        }

        public Criteria andData75GreaterThan(String value) {
            addCriterion("DATA75 >", value, "data75");
            return (Criteria) this;
        }

        public Criteria andData75GreaterThanOrEqualTo(String value) {
            addCriterion("DATA75 >=", value, "data75");
            return (Criteria) this;
        }

        public Criteria andData75LessThan(String value) {
            addCriterion("DATA75 <", value, "data75");
            return (Criteria) this;
        }

        public Criteria andData75LessThanOrEqualTo(String value) {
            addCriterion("DATA75 <=", value, "data75");
            return (Criteria) this;
        }

        public Criteria andData75Like(String value) {
            addCriterion("DATA75 like", value, "data75");
            return (Criteria) this;
        }

        public Criteria andData75NotLike(String value) {
            addCriterion("DATA75 not like", value, "data75");
            return (Criteria) this;
        }

        public Criteria andData75In(List<String> values) {
            addCriterion("DATA75 in", values, "data75");
            return (Criteria) this;
        }

        public Criteria andData75NotIn(List<String> values) {
            addCriterion("DATA75 not in", values, "data75");
            return (Criteria) this;
        }

        public Criteria andData75Between(String value1, String value2) {
            addCriterion("DATA75 between", value1, value2, "data75");
            return (Criteria) this;
        }

        public Criteria andData75NotBetween(String value1, String value2) {
            addCriterion("DATA75 not between", value1, value2, "data75");
            return (Criteria) this;
        }

        public Criteria andData76IsNull() {
            addCriterion("DATA76 is null");
            return (Criteria) this;
        }

        public Criteria andData76IsNotNull() {
            addCriterion("DATA76 is not null");
            return (Criteria) this;
        }

        public Criteria andData76EqualTo(String value) {
            addCriterion("DATA76 =", value, "data76");
            return (Criteria) this;
        }

        public Criteria andData76NotEqualTo(String value) {
            addCriterion("DATA76 <>", value, "data76");
            return (Criteria) this;
        }

        public Criteria andData76GreaterThan(String value) {
            addCriterion("DATA76 >", value, "data76");
            return (Criteria) this;
        }

        public Criteria andData76GreaterThanOrEqualTo(String value) {
            addCriterion("DATA76 >=", value, "data76");
            return (Criteria) this;
        }

        public Criteria andData76LessThan(String value) {
            addCriterion("DATA76 <", value, "data76");
            return (Criteria) this;
        }

        public Criteria andData76LessThanOrEqualTo(String value) {
            addCriterion("DATA76 <=", value, "data76");
            return (Criteria) this;
        }

        public Criteria andData76Like(String value) {
            addCriterion("DATA76 like", value, "data76");
            return (Criteria) this;
        }

        public Criteria andData76NotLike(String value) {
            addCriterion("DATA76 not like", value, "data76");
            return (Criteria) this;
        }

        public Criteria andData76In(List<String> values) {
            addCriterion("DATA76 in", values, "data76");
            return (Criteria) this;
        }

        public Criteria andData76NotIn(List<String> values) {
            addCriterion("DATA76 not in", values, "data76");
            return (Criteria) this;
        }

        public Criteria andData76Between(String value1, String value2) {
            addCriterion("DATA76 between", value1, value2, "data76");
            return (Criteria) this;
        }

        public Criteria andData76NotBetween(String value1, String value2) {
            addCriterion("DATA76 not between", value1, value2, "data76");
            return (Criteria) this;
        }

        public Criteria andData77IsNull() {
            addCriterion("DATA77 is null");
            return (Criteria) this;
        }

        public Criteria andData77IsNotNull() {
            addCriterion("DATA77 is not null");
            return (Criteria) this;
        }

        public Criteria andData77EqualTo(String value) {
            addCriterion("DATA77 =", value, "data77");
            return (Criteria) this;
        }

        public Criteria andData77NotEqualTo(String value) {
            addCriterion("DATA77 <>", value, "data77");
            return (Criteria) this;
        }

        public Criteria andData77GreaterThan(String value) {
            addCriterion("DATA77 >", value, "data77");
            return (Criteria) this;
        }

        public Criteria andData77GreaterThanOrEqualTo(String value) {
            addCriterion("DATA77 >=", value, "data77");
            return (Criteria) this;
        }

        public Criteria andData77LessThan(String value) {
            addCriterion("DATA77 <", value, "data77");
            return (Criteria) this;
        }

        public Criteria andData77LessThanOrEqualTo(String value) {
            addCriterion("DATA77 <=", value, "data77");
            return (Criteria) this;
        }

        public Criteria andData77Like(String value) {
            addCriterion("DATA77 like", value, "data77");
            return (Criteria) this;
        }

        public Criteria andData77NotLike(String value) {
            addCriterion("DATA77 not like", value, "data77");
            return (Criteria) this;
        }

        public Criteria andData77In(List<String> values) {
            addCriterion("DATA77 in", values, "data77");
            return (Criteria) this;
        }

        public Criteria andData77NotIn(List<String> values) {
            addCriterion("DATA77 not in", values, "data77");
            return (Criteria) this;
        }

        public Criteria andData77Between(String value1, String value2) {
            addCriterion("DATA77 between", value1, value2, "data77");
            return (Criteria) this;
        }

        public Criteria andData77NotBetween(String value1, String value2) {
            addCriterion("DATA77 not between", value1, value2, "data77");
            return (Criteria) this;
        }

        public Criteria andData78IsNull() {
            addCriterion("DATA78 is null");
            return (Criteria) this;
        }

        public Criteria andData78IsNotNull() {
            addCriterion("DATA78 is not null");
            return (Criteria) this;
        }

        public Criteria andData78EqualTo(String value) {
            addCriterion("DATA78 =", value, "data78");
            return (Criteria) this;
        }

        public Criteria andData78NotEqualTo(String value) {
            addCriterion("DATA78 <>", value, "data78");
            return (Criteria) this;
        }

        public Criteria andData78GreaterThan(String value) {
            addCriterion("DATA78 >", value, "data78");
            return (Criteria) this;
        }

        public Criteria andData78GreaterThanOrEqualTo(String value) {
            addCriterion("DATA78 >=", value, "data78");
            return (Criteria) this;
        }

        public Criteria andData78LessThan(String value) {
            addCriterion("DATA78 <", value, "data78");
            return (Criteria) this;
        }

        public Criteria andData78LessThanOrEqualTo(String value) {
            addCriterion("DATA78 <=", value, "data78");
            return (Criteria) this;
        }

        public Criteria andData78Like(String value) {
            addCriterion("DATA78 like", value, "data78");
            return (Criteria) this;
        }

        public Criteria andData78NotLike(String value) {
            addCriterion("DATA78 not like", value, "data78");
            return (Criteria) this;
        }

        public Criteria andData78In(List<String> values) {
            addCriterion("DATA78 in", values, "data78");
            return (Criteria) this;
        }

        public Criteria andData78NotIn(List<String> values) {
            addCriterion("DATA78 not in", values, "data78");
            return (Criteria) this;
        }

        public Criteria andData78Between(String value1, String value2) {
            addCriterion("DATA78 between", value1, value2, "data78");
            return (Criteria) this;
        }

        public Criteria andData78NotBetween(String value1, String value2) {
            addCriterion("DATA78 not between", value1, value2, "data78");
            return (Criteria) this;
        }

        public Criteria andData79IsNull() {
            addCriterion("DATA79 is null");
            return (Criteria) this;
        }

        public Criteria andData79IsNotNull() {
            addCriterion("DATA79 is not null");
            return (Criteria) this;
        }

        public Criteria andData79EqualTo(String value) {
            addCriterion("DATA79 =", value, "data79");
            return (Criteria) this;
        }

        public Criteria andData79NotEqualTo(String value) {
            addCriterion("DATA79 <>", value, "data79");
            return (Criteria) this;
        }

        public Criteria andData79GreaterThan(String value) {
            addCriterion("DATA79 >", value, "data79");
            return (Criteria) this;
        }

        public Criteria andData79GreaterThanOrEqualTo(String value) {
            addCriterion("DATA79 >=", value, "data79");
            return (Criteria) this;
        }

        public Criteria andData79LessThan(String value) {
            addCriterion("DATA79 <", value, "data79");
            return (Criteria) this;
        }

        public Criteria andData79LessThanOrEqualTo(String value) {
            addCriterion("DATA79 <=", value, "data79");
            return (Criteria) this;
        }

        public Criteria andData79Like(String value) {
            addCriterion("DATA79 like", value, "data79");
            return (Criteria) this;
        }

        public Criteria andData79NotLike(String value) {
            addCriterion("DATA79 not like", value, "data79");
            return (Criteria) this;
        }

        public Criteria andData79In(List<String> values) {
            addCriterion("DATA79 in", values, "data79");
            return (Criteria) this;
        }

        public Criteria andData79NotIn(List<String> values) {
            addCriterion("DATA79 not in", values, "data79");
            return (Criteria) this;
        }

        public Criteria andData79Between(String value1, String value2) {
            addCriterion("DATA79 between", value1, value2, "data79");
            return (Criteria) this;
        }

        public Criteria andData79NotBetween(String value1, String value2) {
            addCriterion("DATA79 not between", value1, value2, "data79");
            return (Criteria) this;
        }

        public Criteria andData80IsNull() {
            addCriterion("DATA80 is null");
            return (Criteria) this;
        }

        public Criteria andData80IsNotNull() {
            addCriterion("DATA80 is not null");
            return (Criteria) this;
        }

        public Criteria andData80EqualTo(String value) {
            addCriterion("DATA80 =", value, "data80");
            return (Criteria) this;
        }

        public Criteria andData80NotEqualTo(String value) {
            addCriterion("DATA80 <>", value, "data80");
            return (Criteria) this;
        }

        public Criteria andData80GreaterThan(String value) {
            addCriterion("DATA80 >", value, "data80");
            return (Criteria) this;
        }

        public Criteria andData80GreaterThanOrEqualTo(String value) {
            addCriterion("DATA80 >=", value, "data80");
            return (Criteria) this;
        }

        public Criteria andData80LessThan(String value) {
            addCriterion("DATA80 <", value, "data80");
            return (Criteria) this;
        }

        public Criteria andData80LessThanOrEqualTo(String value) {
            addCriterion("DATA80 <=", value, "data80");
            return (Criteria) this;
        }

        public Criteria andData80Like(String value) {
            addCriterion("DATA80 like", value, "data80");
            return (Criteria) this;
        }

        public Criteria andData80NotLike(String value) {
            addCriterion("DATA80 not like", value, "data80");
            return (Criteria) this;
        }

        public Criteria andData80In(List<String> values) {
            addCriterion("DATA80 in", values, "data80");
            return (Criteria) this;
        }

        public Criteria andData80NotIn(List<String> values) {
            addCriterion("DATA80 not in", values, "data80");
            return (Criteria) this;
        }

        public Criteria andData80Between(String value1, String value2) {
            addCriterion("DATA80 between", value1, value2, "data80");
            return (Criteria) this;
        }

        public Criteria andData80NotBetween(String value1, String value2) {
            addCriterion("DATA80 not between", value1, value2, "data80");
            return (Criteria) this;
        }

        public Criteria andData81IsNull() {
            addCriterion("DATA81 is null");
            return (Criteria) this;
        }

        public Criteria andData81IsNotNull() {
            addCriterion("DATA81 is not null");
            return (Criteria) this;
        }

        public Criteria andData81EqualTo(String value) {
            addCriterion("DATA81 =", value, "data81");
            return (Criteria) this;
        }

        public Criteria andData81NotEqualTo(String value) {
            addCriterion("DATA81 <>", value, "data81");
            return (Criteria) this;
        }

        public Criteria andData81GreaterThan(String value) {
            addCriterion("DATA81 >", value, "data81");
            return (Criteria) this;
        }

        public Criteria andData81GreaterThanOrEqualTo(String value) {
            addCriterion("DATA81 >=", value, "data81");
            return (Criteria) this;
        }

        public Criteria andData81LessThan(String value) {
            addCriterion("DATA81 <", value, "data81");
            return (Criteria) this;
        }

        public Criteria andData81LessThanOrEqualTo(String value) {
            addCriterion("DATA81 <=", value, "data81");
            return (Criteria) this;
        }

        public Criteria andData81Like(String value) {
            addCriterion("DATA81 like", value, "data81");
            return (Criteria) this;
        }

        public Criteria andData81NotLike(String value) {
            addCriterion("DATA81 not like", value, "data81");
            return (Criteria) this;
        }

        public Criteria andData81In(List<String> values) {
            addCriterion("DATA81 in", values, "data81");
            return (Criteria) this;
        }

        public Criteria andData81NotIn(List<String> values) {
            addCriterion("DATA81 not in", values, "data81");
            return (Criteria) this;
        }

        public Criteria andData81Between(String value1, String value2) {
            addCriterion("DATA81 between", value1, value2, "data81");
            return (Criteria) this;
        }

        public Criteria andData81NotBetween(String value1, String value2) {
            addCriterion("DATA81 not between", value1, value2, "data81");
            return (Criteria) this;
        }

        public Criteria andData82IsNull() {
            addCriterion("DATA82 is null");
            return (Criteria) this;
        }

        public Criteria andData82IsNotNull() {
            addCriterion("DATA82 is not null");
            return (Criteria) this;
        }

        public Criteria andData82EqualTo(String value) {
            addCriterion("DATA82 =", value, "data82");
            return (Criteria) this;
        }

        public Criteria andData82NotEqualTo(String value) {
            addCriterion("DATA82 <>", value, "data82");
            return (Criteria) this;
        }

        public Criteria andData82GreaterThan(String value) {
            addCriterion("DATA82 >", value, "data82");
            return (Criteria) this;
        }

        public Criteria andData82GreaterThanOrEqualTo(String value) {
            addCriterion("DATA82 >=", value, "data82");
            return (Criteria) this;
        }

        public Criteria andData82LessThan(String value) {
            addCriterion("DATA82 <", value, "data82");
            return (Criteria) this;
        }

        public Criteria andData82LessThanOrEqualTo(String value) {
            addCriterion("DATA82 <=", value, "data82");
            return (Criteria) this;
        }

        public Criteria andData82Like(String value) {
            addCriterion("DATA82 like", value, "data82");
            return (Criteria) this;
        }

        public Criteria andData82NotLike(String value) {
            addCriterion("DATA82 not like", value, "data82");
            return (Criteria) this;
        }

        public Criteria andData82In(List<String> values) {
            addCriterion("DATA82 in", values, "data82");
            return (Criteria) this;
        }

        public Criteria andData82NotIn(List<String> values) {
            addCriterion("DATA82 not in", values, "data82");
            return (Criteria) this;
        }

        public Criteria andData82Between(String value1, String value2) {
            addCriterion("DATA82 between", value1, value2, "data82");
            return (Criteria) this;
        }

        public Criteria andData82NotBetween(String value1, String value2) {
            addCriterion("DATA82 not between", value1, value2, "data82");
            return (Criteria) this;
        }

        public Criteria andData83IsNull() {
            addCriterion("DATA83 is null");
            return (Criteria) this;
        }

        public Criteria andData83IsNotNull() {
            addCriterion("DATA83 is not null");
            return (Criteria) this;
        }

        public Criteria andData83EqualTo(String value) {
            addCriterion("DATA83 =", value, "data83");
            return (Criteria) this;
        }

        public Criteria andData83NotEqualTo(String value) {
            addCriterion("DATA83 <>", value, "data83");
            return (Criteria) this;
        }

        public Criteria andData83GreaterThan(String value) {
            addCriterion("DATA83 >", value, "data83");
            return (Criteria) this;
        }

        public Criteria andData83GreaterThanOrEqualTo(String value) {
            addCriterion("DATA83 >=", value, "data83");
            return (Criteria) this;
        }

        public Criteria andData83LessThan(String value) {
            addCriterion("DATA83 <", value, "data83");
            return (Criteria) this;
        }

        public Criteria andData83LessThanOrEqualTo(String value) {
            addCriterion("DATA83 <=", value, "data83");
            return (Criteria) this;
        }

        public Criteria andData83Like(String value) {
            addCriterion("DATA83 like", value, "data83");
            return (Criteria) this;
        }

        public Criteria andData83NotLike(String value) {
            addCriterion("DATA83 not like", value, "data83");
            return (Criteria) this;
        }

        public Criteria andData83In(List<String> values) {
            addCriterion("DATA83 in", values, "data83");
            return (Criteria) this;
        }

        public Criteria andData83NotIn(List<String> values) {
            addCriterion("DATA83 not in", values, "data83");
            return (Criteria) this;
        }

        public Criteria andData83Between(String value1, String value2) {
            addCriterion("DATA83 between", value1, value2, "data83");
            return (Criteria) this;
        }

        public Criteria andData83NotBetween(String value1, String value2) {
            addCriterion("DATA83 not between", value1, value2, "data83");
            return (Criteria) this;
        }

        public Criteria andData84IsNull() {
            addCriterion("DATA84 is null");
            return (Criteria) this;
        }

        public Criteria andData84IsNotNull() {
            addCriterion("DATA84 is not null");
            return (Criteria) this;
        }

        public Criteria andData84EqualTo(String value) {
            addCriterion("DATA84 =", value, "data84");
            return (Criteria) this;
        }

        public Criteria andData84NotEqualTo(String value) {
            addCriterion("DATA84 <>", value, "data84");
            return (Criteria) this;
        }

        public Criteria andData84GreaterThan(String value) {
            addCriterion("DATA84 >", value, "data84");
            return (Criteria) this;
        }

        public Criteria andData84GreaterThanOrEqualTo(String value) {
            addCriterion("DATA84 >=", value, "data84");
            return (Criteria) this;
        }

        public Criteria andData84LessThan(String value) {
            addCriterion("DATA84 <", value, "data84");
            return (Criteria) this;
        }

        public Criteria andData84LessThanOrEqualTo(String value) {
            addCriterion("DATA84 <=", value, "data84");
            return (Criteria) this;
        }

        public Criteria andData84Like(String value) {
            addCriterion("DATA84 like", value, "data84");
            return (Criteria) this;
        }

        public Criteria andData84NotLike(String value) {
            addCriterion("DATA84 not like", value, "data84");
            return (Criteria) this;
        }

        public Criteria andData84In(List<String> values) {
            addCriterion("DATA84 in", values, "data84");
            return (Criteria) this;
        }

        public Criteria andData84NotIn(List<String> values) {
            addCriterion("DATA84 not in", values, "data84");
            return (Criteria) this;
        }

        public Criteria andData84Between(String value1, String value2) {
            addCriterion("DATA84 between", value1, value2, "data84");
            return (Criteria) this;
        }

        public Criteria andData84NotBetween(String value1, String value2) {
            addCriterion("DATA84 not between", value1, value2, "data84");
            return (Criteria) this;
        }

        public Criteria andData85IsNull() {
            addCriterion("DATA85 is null");
            return (Criteria) this;
        }

        public Criteria andData85IsNotNull() {
            addCriterion("DATA85 is not null");
            return (Criteria) this;
        }

        public Criteria andData85EqualTo(String value) {
            addCriterion("DATA85 =", value, "data85");
            return (Criteria) this;
        }

        public Criteria andData85NotEqualTo(String value) {
            addCriterion("DATA85 <>", value, "data85");
            return (Criteria) this;
        }

        public Criteria andData85GreaterThan(String value) {
            addCriterion("DATA85 >", value, "data85");
            return (Criteria) this;
        }

        public Criteria andData85GreaterThanOrEqualTo(String value) {
            addCriterion("DATA85 >=", value, "data85");
            return (Criteria) this;
        }

        public Criteria andData85LessThan(String value) {
            addCriterion("DATA85 <", value, "data85");
            return (Criteria) this;
        }

        public Criteria andData85LessThanOrEqualTo(String value) {
            addCriterion("DATA85 <=", value, "data85");
            return (Criteria) this;
        }

        public Criteria andData85Like(String value) {
            addCriterion("DATA85 like", value, "data85");
            return (Criteria) this;
        }

        public Criteria andData85NotLike(String value) {
            addCriterion("DATA85 not like", value, "data85");
            return (Criteria) this;
        }

        public Criteria andData85In(List<String> values) {
            addCriterion("DATA85 in", values, "data85");
            return (Criteria) this;
        }

        public Criteria andData85NotIn(List<String> values) {
            addCriterion("DATA85 not in", values, "data85");
            return (Criteria) this;
        }

        public Criteria andData85Between(String value1, String value2) {
            addCriterion("DATA85 between", value1, value2, "data85");
            return (Criteria) this;
        }

        public Criteria andData85NotBetween(String value1, String value2) {
            addCriterion("DATA85 not between", value1, value2, "data85");
            return (Criteria) this;
        }

        public Criteria andData86IsNull() {
            addCriterion("DATA86 is null");
            return (Criteria) this;
        }

        public Criteria andData86IsNotNull() {
            addCriterion("DATA86 is not null");
            return (Criteria) this;
        }

        public Criteria andData86EqualTo(String value) {
            addCriterion("DATA86 =", value, "data86");
            return (Criteria) this;
        }

        public Criteria andData86NotEqualTo(String value) {
            addCriterion("DATA86 <>", value, "data86");
            return (Criteria) this;
        }

        public Criteria andData86GreaterThan(String value) {
            addCriterion("DATA86 >", value, "data86");
            return (Criteria) this;
        }

        public Criteria andData86GreaterThanOrEqualTo(String value) {
            addCriterion("DATA86 >=", value, "data86");
            return (Criteria) this;
        }

        public Criteria andData86LessThan(String value) {
            addCriterion("DATA86 <", value, "data86");
            return (Criteria) this;
        }

        public Criteria andData86LessThanOrEqualTo(String value) {
            addCriterion("DATA86 <=", value, "data86");
            return (Criteria) this;
        }

        public Criteria andData86Like(String value) {
            addCriterion("DATA86 like", value, "data86");
            return (Criteria) this;
        }

        public Criteria andData86NotLike(String value) {
            addCriterion("DATA86 not like", value, "data86");
            return (Criteria) this;
        }

        public Criteria andData86In(List<String> values) {
            addCriterion("DATA86 in", values, "data86");
            return (Criteria) this;
        }

        public Criteria andData86NotIn(List<String> values) {
            addCriterion("DATA86 not in", values, "data86");
            return (Criteria) this;
        }

        public Criteria andData86Between(String value1, String value2) {
            addCriterion("DATA86 between", value1, value2, "data86");
            return (Criteria) this;
        }

        public Criteria andData86NotBetween(String value1, String value2) {
            addCriterion("DATA86 not between", value1, value2, "data86");
            return (Criteria) this;
        }

        public Criteria andData87IsNull() {
            addCriterion("DATA87 is null");
            return (Criteria) this;
        }

        public Criteria andData87IsNotNull() {
            addCriterion("DATA87 is not null");
            return (Criteria) this;
        }

        public Criteria andData87EqualTo(String value) {
            addCriterion("DATA87 =", value, "data87");
            return (Criteria) this;
        }

        public Criteria andData87NotEqualTo(String value) {
            addCriterion("DATA87 <>", value, "data87");
            return (Criteria) this;
        }

        public Criteria andData87GreaterThan(String value) {
            addCriterion("DATA87 >", value, "data87");
            return (Criteria) this;
        }

        public Criteria andData87GreaterThanOrEqualTo(String value) {
            addCriterion("DATA87 >=", value, "data87");
            return (Criteria) this;
        }

        public Criteria andData87LessThan(String value) {
            addCriterion("DATA87 <", value, "data87");
            return (Criteria) this;
        }

        public Criteria andData87LessThanOrEqualTo(String value) {
            addCriterion("DATA87 <=", value, "data87");
            return (Criteria) this;
        }

        public Criteria andData87Like(String value) {
            addCriterion("DATA87 like", value, "data87");
            return (Criteria) this;
        }

        public Criteria andData87NotLike(String value) {
            addCriterion("DATA87 not like", value, "data87");
            return (Criteria) this;
        }

        public Criteria andData87In(List<String> values) {
            addCriterion("DATA87 in", values, "data87");
            return (Criteria) this;
        }

        public Criteria andData87NotIn(List<String> values) {
            addCriterion("DATA87 not in", values, "data87");
            return (Criteria) this;
        }

        public Criteria andData87Between(String value1, String value2) {
            addCriterion("DATA87 between", value1, value2, "data87");
            return (Criteria) this;
        }

        public Criteria andData87NotBetween(String value1, String value2) {
            addCriterion("DATA87 not between", value1, value2, "data87");
            return (Criteria) this;
        }

        public Criteria andData88IsNull() {
            addCriterion("DATA88 is null");
            return (Criteria) this;
        }

        public Criteria andData88IsNotNull() {
            addCriterion("DATA88 is not null");
            return (Criteria) this;
        }

        public Criteria andData88EqualTo(String value) {
            addCriterion("DATA88 =", value, "data88");
            return (Criteria) this;
        }

        public Criteria andData88NotEqualTo(String value) {
            addCriterion("DATA88 <>", value, "data88");
            return (Criteria) this;
        }

        public Criteria andData88GreaterThan(String value) {
            addCriterion("DATA88 >", value, "data88");
            return (Criteria) this;
        }

        public Criteria andData88GreaterThanOrEqualTo(String value) {
            addCriterion("DATA88 >=", value, "data88");
            return (Criteria) this;
        }

        public Criteria andData88LessThan(String value) {
            addCriterion("DATA88 <", value, "data88");
            return (Criteria) this;
        }

        public Criteria andData88LessThanOrEqualTo(String value) {
            addCriterion("DATA88 <=", value, "data88");
            return (Criteria) this;
        }

        public Criteria andData88Like(String value) {
            addCriterion("DATA88 like", value, "data88");
            return (Criteria) this;
        }

        public Criteria andData88NotLike(String value) {
            addCriterion("DATA88 not like", value, "data88");
            return (Criteria) this;
        }

        public Criteria andData88In(List<String> values) {
            addCriterion("DATA88 in", values, "data88");
            return (Criteria) this;
        }

        public Criteria andData88NotIn(List<String> values) {
            addCriterion("DATA88 not in", values, "data88");
            return (Criteria) this;
        }

        public Criteria andData88Between(String value1, String value2) {
            addCriterion("DATA88 between", value1, value2, "data88");
            return (Criteria) this;
        }

        public Criteria andData88NotBetween(String value1, String value2) {
            addCriterion("DATA88 not between", value1, value2, "data88");
            return (Criteria) this;
        }

        public Criteria andData89IsNull() {
            addCriterion("DATA89 is null");
            return (Criteria) this;
        }

        public Criteria andData89IsNotNull() {
            addCriterion("DATA89 is not null");
            return (Criteria) this;
        }

        public Criteria andData89EqualTo(String value) {
            addCriterion("DATA89 =", value, "data89");
            return (Criteria) this;
        }

        public Criteria andData89NotEqualTo(String value) {
            addCriterion("DATA89 <>", value, "data89");
            return (Criteria) this;
        }

        public Criteria andData89GreaterThan(String value) {
            addCriterion("DATA89 >", value, "data89");
            return (Criteria) this;
        }

        public Criteria andData89GreaterThanOrEqualTo(String value) {
            addCriterion("DATA89 >=", value, "data89");
            return (Criteria) this;
        }

        public Criteria andData89LessThan(String value) {
            addCriterion("DATA89 <", value, "data89");
            return (Criteria) this;
        }

        public Criteria andData89LessThanOrEqualTo(String value) {
            addCriterion("DATA89 <=", value, "data89");
            return (Criteria) this;
        }

        public Criteria andData89Like(String value) {
            addCriterion("DATA89 like", value, "data89");
            return (Criteria) this;
        }

        public Criteria andData89NotLike(String value) {
            addCriterion("DATA89 not like", value, "data89");
            return (Criteria) this;
        }

        public Criteria andData89In(List<String> values) {
            addCriterion("DATA89 in", values, "data89");
            return (Criteria) this;
        }

        public Criteria andData89NotIn(List<String> values) {
            addCriterion("DATA89 not in", values, "data89");
            return (Criteria) this;
        }

        public Criteria andData89Between(String value1, String value2) {
            addCriterion("DATA89 between", value1, value2, "data89");
            return (Criteria) this;
        }

        public Criteria andData89NotBetween(String value1, String value2) {
            addCriterion("DATA89 not between", value1, value2, "data89");
            return (Criteria) this;
        }

        public Criteria andData90IsNull() {
            addCriterion("DATA90 is null");
            return (Criteria) this;
        }

        public Criteria andData90IsNotNull() {
            addCriterion("DATA90 is not null");
            return (Criteria) this;
        }

        public Criteria andData90EqualTo(String value) {
            addCriterion("DATA90 =", value, "data90");
            return (Criteria) this;
        }

        public Criteria andData90NotEqualTo(String value) {
            addCriterion("DATA90 <>", value, "data90");
            return (Criteria) this;
        }

        public Criteria andData90GreaterThan(String value) {
            addCriterion("DATA90 >", value, "data90");
            return (Criteria) this;
        }

        public Criteria andData90GreaterThanOrEqualTo(String value) {
            addCriterion("DATA90 >=", value, "data90");
            return (Criteria) this;
        }

        public Criteria andData90LessThan(String value) {
            addCriterion("DATA90 <", value, "data90");
            return (Criteria) this;
        }

        public Criteria andData90LessThanOrEqualTo(String value) {
            addCriterion("DATA90 <=", value, "data90");
            return (Criteria) this;
        }

        public Criteria andData90Like(String value) {
            addCriterion("DATA90 like", value, "data90");
            return (Criteria) this;
        }

        public Criteria andData90NotLike(String value) {
            addCriterion("DATA90 not like", value, "data90");
            return (Criteria) this;
        }

        public Criteria andData90In(List<String> values) {
            addCriterion("DATA90 in", values, "data90");
            return (Criteria) this;
        }

        public Criteria andData90NotIn(List<String> values) {
            addCriterion("DATA90 not in", values, "data90");
            return (Criteria) this;
        }

        public Criteria andData90Between(String value1, String value2) {
            addCriterion("DATA90 between", value1, value2, "data90");
            return (Criteria) this;
        }

        public Criteria andData90NotBetween(String value1, String value2) {
            addCriterion("DATA90 not between", value1, value2, "data90");
            return (Criteria) this;
        }

        public Criteria andData91IsNull() {
            addCriterion("DATA91 is null");
            return (Criteria) this;
        }

        public Criteria andData91IsNotNull() {
            addCriterion("DATA91 is not null");
            return (Criteria) this;
        }

        public Criteria andData91EqualTo(String value) {
            addCriterion("DATA91 =", value, "data91");
            return (Criteria) this;
        }

        public Criteria andData91NotEqualTo(String value) {
            addCriterion("DATA91 <>", value, "data91");
            return (Criteria) this;
        }

        public Criteria andData91GreaterThan(String value) {
            addCriterion("DATA91 >", value, "data91");
            return (Criteria) this;
        }

        public Criteria andData91GreaterThanOrEqualTo(String value) {
            addCriterion("DATA91 >=", value, "data91");
            return (Criteria) this;
        }

        public Criteria andData91LessThan(String value) {
            addCriterion("DATA91 <", value, "data91");
            return (Criteria) this;
        }

        public Criteria andData91LessThanOrEqualTo(String value) {
            addCriterion("DATA91 <=", value, "data91");
            return (Criteria) this;
        }

        public Criteria andData91Like(String value) {
            addCriterion("DATA91 like", value, "data91");
            return (Criteria) this;
        }

        public Criteria andData91NotLike(String value) {
            addCriterion("DATA91 not like", value, "data91");
            return (Criteria) this;
        }

        public Criteria andData91In(List<String> values) {
            addCriterion("DATA91 in", values, "data91");
            return (Criteria) this;
        }

        public Criteria andData91NotIn(List<String> values) {
            addCriterion("DATA91 not in", values, "data91");
            return (Criteria) this;
        }

        public Criteria andData91Between(String value1, String value2) {
            addCriterion("DATA91 between", value1, value2, "data91");
            return (Criteria) this;
        }

        public Criteria andData91NotBetween(String value1, String value2) {
            addCriterion("DATA91 not between", value1, value2, "data91");
            return (Criteria) this;
        }

        public Criteria andData92IsNull() {
            addCriterion("DATA92 is null");
            return (Criteria) this;
        }

        public Criteria andData92IsNotNull() {
            addCriterion("DATA92 is not null");
            return (Criteria) this;
        }

        public Criteria andData92EqualTo(String value) {
            addCriterion("DATA92 =", value, "data92");
            return (Criteria) this;
        }

        public Criteria andData92NotEqualTo(String value) {
            addCriterion("DATA92 <>", value, "data92");
            return (Criteria) this;
        }

        public Criteria andData92GreaterThan(String value) {
            addCriterion("DATA92 >", value, "data92");
            return (Criteria) this;
        }

        public Criteria andData92GreaterThanOrEqualTo(String value) {
            addCriterion("DATA92 >=", value, "data92");
            return (Criteria) this;
        }

        public Criteria andData92LessThan(String value) {
            addCriterion("DATA92 <", value, "data92");
            return (Criteria) this;
        }

        public Criteria andData92LessThanOrEqualTo(String value) {
            addCriterion("DATA92 <=", value, "data92");
            return (Criteria) this;
        }

        public Criteria andData92Like(String value) {
            addCriterion("DATA92 like", value, "data92");
            return (Criteria) this;
        }

        public Criteria andData92NotLike(String value) {
            addCriterion("DATA92 not like", value, "data92");
            return (Criteria) this;
        }

        public Criteria andData92In(List<String> values) {
            addCriterion("DATA92 in", values, "data92");
            return (Criteria) this;
        }

        public Criteria andData92NotIn(List<String> values) {
            addCriterion("DATA92 not in", values, "data92");
            return (Criteria) this;
        }

        public Criteria andData92Between(String value1, String value2) {
            addCriterion("DATA92 between", value1, value2, "data92");
            return (Criteria) this;
        }

        public Criteria andData92NotBetween(String value1, String value2) {
            addCriterion("DATA92 not between", value1, value2, "data92");
            return (Criteria) this;
        }

        public Criteria andData93IsNull() {
            addCriterion("DATA93 is null");
            return (Criteria) this;
        }

        public Criteria andData93IsNotNull() {
            addCriterion("DATA93 is not null");
            return (Criteria) this;
        }

        public Criteria andData93EqualTo(String value) {
            addCriterion("DATA93 =", value, "data93");
            return (Criteria) this;
        }

        public Criteria andData93NotEqualTo(String value) {
            addCriterion("DATA93 <>", value, "data93");
            return (Criteria) this;
        }

        public Criteria andData93GreaterThan(String value) {
            addCriterion("DATA93 >", value, "data93");
            return (Criteria) this;
        }

        public Criteria andData93GreaterThanOrEqualTo(String value) {
            addCriterion("DATA93 >=", value, "data93");
            return (Criteria) this;
        }

        public Criteria andData93LessThan(String value) {
            addCriterion("DATA93 <", value, "data93");
            return (Criteria) this;
        }

        public Criteria andData93LessThanOrEqualTo(String value) {
            addCriterion("DATA93 <=", value, "data93");
            return (Criteria) this;
        }

        public Criteria andData93Like(String value) {
            addCriterion("DATA93 like", value, "data93");
            return (Criteria) this;
        }

        public Criteria andData93NotLike(String value) {
            addCriterion("DATA93 not like", value, "data93");
            return (Criteria) this;
        }

        public Criteria andData93In(List<String> values) {
            addCriterion("DATA93 in", values, "data93");
            return (Criteria) this;
        }

        public Criteria andData93NotIn(List<String> values) {
            addCriterion("DATA93 not in", values, "data93");
            return (Criteria) this;
        }

        public Criteria andData93Between(String value1, String value2) {
            addCriterion("DATA93 between", value1, value2, "data93");
            return (Criteria) this;
        }

        public Criteria andData93NotBetween(String value1, String value2) {
            addCriterion("DATA93 not between", value1, value2, "data93");
            return (Criteria) this;
        }

        public Criteria andData94IsNull() {
            addCriterion("DATA94 is null");
            return (Criteria) this;
        }

        public Criteria andData94IsNotNull() {
            addCriterion("DATA94 is not null");
            return (Criteria) this;
        }

        public Criteria andData94EqualTo(String value) {
            addCriterion("DATA94 =", value, "data94");
            return (Criteria) this;
        }

        public Criteria andData94NotEqualTo(String value) {
            addCriterion("DATA94 <>", value, "data94");
            return (Criteria) this;
        }

        public Criteria andData94GreaterThan(String value) {
            addCriterion("DATA94 >", value, "data94");
            return (Criteria) this;
        }

        public Criteria andData94GreaterThanOrEqualTo(String value) {
            addCriterion("DATA94 >=", value, "data94");
            return (Criteria) this;
        }

        public Criteria andData94LessThan(String value) {
            addCriterion("DATA94 <", value, "data94");
            return (Criteria) this;
        }

        public Criteria andData94LessThanOrEqualTo(String value) {
            addCriterion("DATA94 <=", value, "data94");
            return (Criteria) this;
        }

        public Criteria andData94Like(String value) {
            addCriterion("DATA94 like", value, "data94");
            return (Criteria) this;
        }

        public Criteria andData94NotLike(String value) {
            addCriterion("DATA94 not like", value, "data94");
            return (Criteria) this;
        }

        public Criteria andData94In(List<String> values) {
            addCriterion("DATA94 in", values, "data94");
            return (Criteria) this;
        }

        public Criteria andData94NotIn(List<String> values) {
            addCriterion("DATA94 not in", values, "data94");
            return (Criteria) this;
        }

        public Criteria andData94Between(String value1, String value2) {
            addCriterion("DATA94 between", value1, value2, "data94");
            return (Criteria) this;
        }

        public Criteria andData94NotBetween(String value1, String value2) {
            addCriterion("DATA94 not between", value1, value2, "data94");
            return (Criteria) this;
        }

        public Criteria andData95IsNull() {
            addCriterion("DATA95 is null");
            return (Criteria) this;
        }

        public Criteria andData95IsNotNull() {
            addCriterion("DATA95 is not null");
            return (Criteria) this;
        }

        public Criteria andData95EqualTo(String value) {
            addCriterion("DATA95 =", value, "data95");
            return (Criteria) this;
        }

        public Criteria andData95NotEqualTo(String value) {
            addCriterion("DATA95 <>", value, "data95");
            return (Criteria) this;
        }

        public Criteria andData95GreaterThan(String value) {
            addCriterion("DATA95 >", value, "data95");
            return (Criteria) this;
        }

        public Criteria andData95GreaterThanOrEqualTo(String value) {
            addCriterion("DATA95 >=", value, "data95");
            return (Criteria) this;
        }

        public Criteria andData95LessThan(String value) {
            addCriterion("DATA95 <", value, "data95");
            return (Criteria) this;
        }

        public Criteria andData95LessThanOrEqualTo(String value) {
            addCriterion("DATA95 <=", value, "data95");
            return (Criteria) this;
        }

        public Criteria andData95Like(String value) {
            addCriterion("DATA95 like", value, "data95");
            return (Criteria) this;
        }

        public Criteria andData95NotLike(String value) {
            addCriterion("DATA95 not like", value, "data95");
            return (Criteria) this;
        }

        public Criteria andData95In(List<String> values) {
            addCriterion("DATA95 in", values, "data95");
            return (Criteria) this;
        }

        public Criteria andData95NotIn(List<String> values) {
            addCriterion("DATA95 not in", values, "data95");
            return (Criteria) this;
        }

        public Criteria andData95Between(String value1, String value2) {
            addCriterion("DATA95 between", value1, value2, "data95");
            return (Criteria) this;
        }

        public Criteria andData95NotBetween(String value1, String value2) {
            addCriterion("DATA95 not between", value1, value2, "data95");
            return (Criteria) this;
        }

        public Criteria andData96IsNull() {
            addCriterion("DATA96 is null");
            return (Criteria) this;
        }

        public Criteria andData96IsNotNull() {
            addCriterion("DATA96 is not null");
            return (Criteria) this;
        }

        public Criteria andData96EqualTo(String value) {
            addCriterion("DATA96 =", value, "data96");
            return (Criteria) this;
        }

        public Criteria andData96NotEqualTo(String value) {
            addCriterion("DATA96 <>", value, "data96");
            return (Criteria) this;
        }

        public Criteria andData96GreaterThan(String value) {
            addCriterion("DATA96 >", value, "data96");
            return (Criteria) this;
        }

        public Criteria andData96GreaterThanOrEqualTo(String value) {
            addCriterion("DATA96 >=", value, "data96");
            return (Criteria) this;
        }

        public Criteria andData96LessThan(String value) {
            addCriterion("DATA96 <", value, "data96");
            return (Criteria) this;
        }

        public Criteria andData96LessThanOrEqualTo(String value) {
            addCriterion("DATA96 <=", value, "data96");
            return (Criteria) this;
        }

        public Criteria andData96Like(String value) {
            addCriterion("DATA96 like", value, "data96");
            return (Criteria) this;
        }

        public Criteria andData96NotLike(String value) {
            addCriterion("DATA96 not like", value, "data96");
            return (Criteria) this;
        }

        public Criteria andData96In(List<String> values) {
            addCriterion("DATA96 in", values, "data96");
            return (Criteria) this;
        }

        public Criteria andData96NotIn(List<String> values) {
            addCriterion("DATA96 not in", values, "data96");
            return (Criteria) this;
        }

        public Criteria andData96Between(String value1, String value2) {
            addCriterion("DATA96 between", value1, value2, "data96");
            return (Criteria) this;
        }

        public Criteria andData96NotBetween(String value1, String value2) {
            addCriterion("DATA96 not between", value1, value2, "data96");
            return (Criteria) this;
        }

        public Criteria andData97IsNull() {
            addCriterion("DATA97 is null");
            return (Criteria) this;
        }

        public Criteria andData97IsNotNull() {
            addCriterion("DATA97 is not null");
            return (Criteria) this;
        }

        public Criteria andData97EqualTo(String value) {
            addCriterion("DATA97 =", value, "data97");
            return (Criteria) this;
        }

        public Criteria andData97NotEqualTo(String value) {
            addCriterion("DATA97 <>", value, "data97");
            return (Criteria) this;
        }

        public Criteria andData97GreaterThan(String value) {
            addCriterion("DATA97 >", value, "data97");
            return (Criteria) this;
        }

        public Criteria andData97GreaterThanOrEqualTo(String value) {
            addCriterion("DATA97 >=", value, "data97");
            return (Criteria) this;
        }

        public Criteria andData97LessThan(String value) {
            addCriterion("DATA97 <", value, "data97");
            return (Criteria) this;
        }

        public Criteria andData97LessThanOrEqualTo(String value) {
            addCriterion("DATA97 <=", value, "data97");
            return (Criteria) this;
        }

        public Criteria andData97Like(String value) {
            addCriterion("DATA97 like", value, "data97");
            return (Criteria) this;
        }

        public Criteria andData97NotLike(String value) {
            addCriterion("DATA97 not like", value, "data97");
            return (Criteria) this;
        }

        public Criteria andData97In(List<String> values) {
            addCriterion("DATA97 in", values, "data97");
            return (Criteria) this;
        }

        public Criteria andData97NotIn(List<String> values) {
            addCriterion("DATA97 not in", values, "data97");
            return (Criteria) this;
        }

        public Criteria andData97Between(String value1, String value2) {
            addCriterion("DATA97 between", value1, value2, "data97");
            return (Criteria) this;
        }

        public Criteria andData97NotBetween(String value1, String value2) {
            addCriterion("DATA97 not between", value1, value2, "data97");
            return (Criteria) this;
        }

        public Criteria andData98IsNull() {
            addCriterion("DATA98 is null");
            return (Criteria) this;
        }

        public Criteria andData98IsNotNull() {
            addCriterion("DATA98 is not null");
            return (Criteria) this;
        }

        public Criteria andData98EqualTo(String value) {
            addCriterion("DATA98 =", value, "data98");
            return (Criteria) this;
        }

        public Criteria andData98NotEqualTo(String value) {
            addCriterion("DATA98 <>", value, "data98");
            return (Criteria) this;
        }

        public Criteria andData98GreaterThan(String value) {
            addCriterion("DATA98 >", value, "data98");
            return (Criteria) this;
        }

        public Criteria andData98GreaterThanOrEqualTo(String value) {
            addCriterion("DATA98 >=", value, "data98");
            return (Criteria) this;
        }

        public Criteria andData98LessThan(String value) {
            addCriterion("DATA98 <", value, "data98");
            return (Criteria) this;
        }

        public Criteria andData98LessThanOrEqualTo(String value) {
            addCriterion("DATA98 <=", value, "data98");
            return (Criteria) this;
        }

        public Criteria andData98Like(String value) {
            addCriterion("DATA98 like", value, "data98");
            return (Criteria) this;
        }

        public Criteria andData98NotLike(String value) {
            addCriterion("DATA98 not like", value, "data98");
            return (Criteria) this;
        }

        public Criteria andData98In(List<String> values) {
            addCriterion("DATA98 in", values, "data98");
            return (Criteria) this;
        }

        public Criteria andData98NotIn(List<String> values) {
            addCriterion("DATA98 not in", values, "data98");
            return (Criteria) this;
        }

        public Criteria andData98Between(String value1, String value2) {
            addCriterion("DATA98 between", value1, value2, "data98");
            return (Criteria) this;
        }

        public Criteria andData98NotBetween(String value1, String value2) {
            addCriterion("DATA98 not between", value1, value2, "data98");
            return (Criteria) this;
        }

        public Criteria andData99IsNull() {
            addCriterion("DATA99 is null");
            return (Criteria) this;
        }

        public Criteria andData99IsNotNull() {
            addCriterion("DATA99 is not null");
            return (Criteria) this;
        }

        public Criteria andData99EqualTo(String value) {
            addCriterion("DATA99 =", value, "data99");
            return (Criteria) this;
        }

        public Criteria andData99NotEqualTo(String value) {
            addCriterion("DATA99 <>", value, "data99");
            return (Criteria) this;
        }

        public Criteria andData99GreaterThan(String value) {
            addCriterion("DATA99 >", value, "data99");
            return (Criteria) this;
        }

        public Criteria andData99GreaterThanOrEqualTo(String value) {
            addCriterion("DATA99 >=", value, "data99");
            return (Criteria) this;
        }

        public Criteria andData99LessThan(String value) {
            addCriterion("DATA99 <", value, "data99");
            return (Criteria) this;
        }

        public Criteria andData99LessThanOrEqualTo(String value) {
            addCriterion("DATA99 <=", value, "data99");
            return (Criteria) this;
        }

        public Criteria andData99Like(String value) {
            addCriterion("DATA99 like", value, "data99");
            return (Criteria) this;
        }

        public Criteria andData99NotLike(String value) {
            addCriterion("DATA99 not like", value, "data99");
            return (Criteria) this;
        }

        public Criteria andData99In(List<String> values) {
            addCriterion("DATA99 in", values, "data99");
            return (Criteria) this;
        }

        public Criteria andData99NotIn(List<String> values) {
            addCriterion("DATA99 not in", values, "data99");
            return (Criteria) this;
        }

        public Criteria andData99Between(String value1, String value2) {
            addCriterion("DATA99 between", value1, value2, "data99");
            return (Criteria) this;
        }

        public Criteria andData99NotBetween(String value1, String value2) {
            addCriterion("DATA99 not between", value1, value2, "data99");
            return (Criteria) this;
        }

        public Criteria andData100IsNull() {
            addCriterion("DATA100 is null");
            return (Criteria) this;
        }

        public Criteria andData100IsNotNull() {
            addCriterion("DATA100 is not null");
            return (Criteria) this;
        }

        public Criteria andData100EqualTo(String value) {
            addCriterion("DATA100 =", value, "data100");
            return (Criteria) this;
        }

        public Criteria andData100NotEqualTo(String value) {
            addCriterion("DATA100 <>", value, "data100");
            return (Criteria) this;
        }

        public Criteria andData100GreaterThan(String value) {
            addCriterion("DATA100 >", value, "data100");
            return (Criteria) this;
        }

        public Criteria andData100GreaterThanOrEqualTo(String value) {
            addCriterion("DATA100 >=", value, "data100");
            return (Criteria) this;
        }

        public Criteria andData100LessThan(String value) {
            addCriterion("DATA100 <", value, "data100");
            return (Criteria) this;
        }

        public Criteria andData100LessThanOrEqualTo(String value) {
            addCriterion("DATA100 <=", value, "data100");
            return (Criteria) this;
        }

        public Criteria andData100Like(String value) {
            addCriterion("DATA100 like", value, "data100");
            return (Criteria) this;
        }

        public Criteria andData100NotLike(String value) {
            addCriterion("DATA100 not like", value, "data100");
            return (Criteria) this;
        }

        public Criteria andData100In(List<String> values) {
            addCriterion("DATA100 in", values, "data100");
            return (Criteria) this;
        }

        public Criteria andData100NotIn(List<String> values) {
            addCriterion("DATA100 not in", values, "data100");
            return (Criteria) this;
        }

        public Criteria andData100Between(String value1, String value2) {
            addCriterion("DATA100 between", value1, value2, "data100");
            return (Criteria) this;
        }

        public Criteria andData100NotBetween(String value1, String value2) {
            addCriterion("DATA100 not between", value1, value2, "data100");
            return (Criteria) this;
        }

        public Criteria andData101IsNull() {
            addCriterion("DATA101 is null");
            return (Criteria) this;
        }

        public Criteria andData101IsNotNull() {
            addCriterion("DATA101 is not null");
            return (Criteria) this;
        }

        public Criteria andData101EqualTo(String value) {
            addCriterion("DATA101 =", value, "data101");
            return (Criteria) this;
        }

        public Criteria andData101NotEqualTo(String value) {
            addCriterion("DATA101 <>", value, "data101");
            return (Criteria) this;
        }

        public Criteria andData101GreaterThan(String value) {
            addCriterion("DATA101 >", value, "data101");
            return (Criteria) this;
        }

        public Criteria andData101GreaterThanOrEqualTo(String value) {
            addCriterion("DATA101 >=", value, "data101");
            return (Criteria) this;
        }

        public Criteria andData101LessThan(String value) {
            addCriterion("DATA101 <", value, "data101");
            return (Criteria) this;
        }

        public Criteria andData101LessThanOrEqualTo(String value) {
            addCriterion("DATA101 <=", value, "data101");
            return (Criteria) this;
        }

        public Criteria andData101Like(String value) {
            addCriterion("DATA101 like", value, "data101");
            return (Criteria) this;
        }

        public Criteria andData101NotLike(String value) {
            addCriterion("DATA101 not like", value, "data101");
            return (Criteria) this;
        }

        public Criteria andData101In(List<String> values) {
            addCriterion("DATA101 in", values, "data101");
            return (Criteria) this;
        }

        public Criteria andData101NotIn(List<String> values) {
            addCriterion("DATA101 not in", values, "data101");
            return (Criteria) this;
        }

        public Criteria andData101Between(String value1, String value2) {
            addCriterion("DATA101 between", value1, value2, "data101");
            return (Criteria) this;
        }

        public Criteria andData101NotBetween(String value1, String value2) {
            addCriterion("DATA101 not between", value1, value2, "data101");
            return (Criteria) this;
        }

        public Criteria andData102IsNull() {
            addCriterion("DATA102 is null");
            return (Criteria) this;
        }

        public Criteria andData102IsNotNull() {
            addCriterion("DATA102 is not null");
            return (Criteria) this;
        }

        public Criteria andData102EqualTo(String value) {
            addCriterion("DATA102 =", value, "data102");
            return (Criteria) this;
        }

        public Criteria andData102NotEqualTo(String value) {
            addCriterion("DATA102 <>", value, "data102");
            return (Criteria) this;
        }

        public Criteria andData102GreaterThan(String value) {
            addCriterion("DATA102 >", value, "data102");
            return (Criteria) this;
        }

        public Criteria andData102GreaterThanOrEqualTo(String value) {
            addCriterion("DATA102 >=", value, "data102");
            return (Criteria) this;
        }

        public Criteria andData102LessThan(String value) {
            addCriterion("DATA102 <", value, "data102");
            return (Criteria) this;
        }

        public Criteria andData102LessThanOrEqualTo(String value) {
            addCriterion("DATA102 <=", value, "data102");
            return (Criteria) this;
        }

        public Criteria andData102Like(String value) {
            addCriterion("DATA102 like", value, "data102");
            return (Criteria) this;
        }

        public Criteria andData102NotLike(String value) {
            addCriterion("DATA102 not like", value, "data102");
            return (Criteria) this;
        }

        public Criteria andData102In(List<String> values) {
            addCriterion("DATA102 in", values, "data102");
            return (Criteria) this;
        }

        public Criteria andData102NotIn(List<String> values) {
            addCriterion("DATA102 not in", values, "data102");
            return (Criteria) this;
        }

        public Criteria andData102Between(String value1, String value2) {
            addCriterion("DATA102 between", value1, value2, "data102");
            return (Criteria) this;
        }

        public Criteria andData102NotBetween(String value1, String value2) {
            addCriterion("DATA102 not between", value1, value2, "data102");
            return (Criteria) this;
        }

        public Criteria andData103IsNull() {
            addCriterion("DATA103 is null");
            return (Criteria) this;
        }

        public Criteria andData103IsNotNull() {
            addCriterion("DATA103 is not null");
            return (Criteria) this;
        }

        public Criteria andData103EqualTo(String value) {
            addCriterion("DATA103 =", value, "data103");
            return (Criteria) this;
        }

        public Criteria andData103NotEqualTo(String value) {
            addCriterion("DATA103 <>", value, "data103");
            return (Criteria) this;
        }

        public Criteria andData103GreaterThan(String value) {
            addCriterion("DATA103 >", value, "data103");
            return (Criteria) this;
        }

        public Criteria andData103GreaterThanOrEqualTo(String value) {
            addCriterion("DATA103 >=", value, "data103");
            return (Criteria) this;
        }

        public Criteria andData103LessThan(String value) {
            addCriterion("DATA103 <", value, "data103");
            return (Criteria) this;
        }

        public Criteria andData103LessThanOrEqualTo(String value) {
            addCriterion("DATA103 <=", value, "data103");
            return (Criteria) this;
        }

        public Criteria andData103Like(String value) {
            addCriterion("DATA103 like", value, "data103");
            return (Criteria) this;
        }

        public Criteria andData103NotLike(String value) {
            addCriterion("DATA103 not like", value, "data103");
            return (Criteria) this;
        }

        public Criteria andData103In(List<String> values) {
            addCriterion("DATA103 in", values, "data103");
            return (Criteria) this;
        }

        public Criteria andData103NotIn(List<String> values) {
            addCriterion("DATA103 not in", values, "data103");
            return (Criteria) this;
        }

        public Criteria andData103Between(String value1, String value2) {
            addCriterion("DATA103 between", value1, value2, "data103");
            return (Criteria) this;
        }

        public Criteria andData103NotBetween(String value1, String value2) {
            addCriterion("DATA103 not between", value1, value2, "data103");
            return (Criteria) this;
        }

        public Criteria andData104IsNull() {
            addCriterion("DATA104 is null");
            return (Criteria) this;
        }

        public Criteria andData104IsNotNull() {
            addCriterion("DATA104 is not null");
            return (Criteria) this;
        }

        public Criteria andData104EqualTo(String value) {
            addCriterion("DATA104 =", value, "data104");
            return (Criteria) this;
        }

        public Criteria andData104NotEqualTo(String value) {
            addCriterion("DATA104 <>", value, "data104");
            return (Criteria) this;
        }

        public Criteria andData104GreaterThan(String value) {
            addCriterion("DATA104 >", value, "data104");
            return (Criteria) this;
        }

        public Criteria andData104GreaterThanOrEqualTo(String value) {
            addCriterion("DATA104 >=", value, "data104");
            return (Criteria) this;
        }

        public Criteria andData104LessThan(String value) {
            addCriterion("DATA104 <", value, "data104");
            return (Criteria) this;
        }

        public Criteria andData104LessThanOrEqualTo(String value) {
            addCriterion("DATA104 <=", value, "data104");
            return (Criteria) this;
        }

        public Criteria andData104Like(String value) {
            addCriterion("DATA104 like", value, "data104");
            return (Criteria) this;
        }

        public Criteria andData104NotLike(String value) {
            addCriterion("DATA104 not like", value, "data104");
            return (Criteria) this;
        }

        public Criteria andData104In(List<String> values) {
            addCriterion("DATA104 in", values, "data104");
            return (Criteria) this;
        }

        public Criteria andData104NotIn(List<String> values) {
            addCriterion("DATA104 not in", values, "data104");
            return (Criteria) this;
        }

        public Criteria andData104Between(String value1, String value2) {
            addCriterion("DATA104 between", value1, value2, "data104");
            return (Criteria) this;
        }

        public Criteria andData104NotBetween(String value1, String value2) {
            addCriterion("DATA104 not between", value1, value2, "data104");
            return (Criteria) this;
        }

        public Criteria andData105IsNull() {
            addCriterion("DATA105 is null");
            return (Criteria) this;
        }

        public Criteria andData105IsNotNull() {
            addCriterion("DATA105 is not null");
            return (Criteria) this;
        }

        public Criteria andData105EqualTo(String value) {
            addCriterion("DATA105 =", value, "data105");
            return (Criteria) this;
        }

        public Criteria andData105NotEqualTo(String value) {
            addCriterion("DATA105 <>", value, "data105");
            return (Criteria) this;
        }

        public Criteria andData105GreaterThan(String value) {
            addCriterion("DATA105 >", value, "data105");
            return (Criteria) this;
        }

        public Criteria andData105GreaterThanOrEqualTo(String value) {
            addCriterion("DATA105 >=", value, "data105");
            return (Criteria) this;
        }

        public Criteria andData105LessThan(String value) {
            addCriterion("DATA105 <", value, "data105");
            return (Criteria) this;
        }

        public Criteria andData105LessThanOrEqualTo(String value) {
            addCriterion("DATA105 <=", value, "data105");
            return (Criteria) this;
        }

        public Criteria andData105Like(String value) {
            addCriterion("DATA105 like", value, "data105");
            return (Criteria) this;
        }

        public Criteria andData105NotLike(String value) {
            addCriterion("DATA105 not like", value, "data105");
            return (Criteria) this;
        }

        public Criteria andData105In(List<String> values) {
            addCriterion("DATA105 in", values, "data105");
            return (Criteria) this;
        }

        public Criteria andData105NotIn(List<String> values) {
            addCriterion("DATA105 not in", values, "data105");
            return (Criteria) this;
        }

        public Criteria andData105Between(String value1, String value2) {
            addCriterion("DATA105 between", value1, value2, "data105");
            return (Criteria) this;
        }

        public Criteria andData105NotBetween(String value1, String value2) {
            addCriterion("DATA105 not between", value1, value2, "data105");
            return (Criteria) this;
        }

        public Criteria andData106IsNull() {
            addCriterion("DATA106 is null");
            return (Criteria) this;
        }

        public Criteria andData106IsNotNull() {
            addCriterion("DATA106 is not null");
            return (Criteria) this;
        }

        public Criteria andData106EqualTo(String value) {
            addCriterion("DATA106 =", value, "data106");
            return (Criteria) this;
        }

        public Criteria andData106NotEqualTo(String value) {
            addCriterion("DATA106 <>", value, "data106");
            return (Criteria) this;
        }

        public Criteria andData106GreaterThan(String value) {
            addCriterion("DATA106 >", value, "data106");
            return (Criteria) this;
        }

        public Criteria andData106GreaterThanOrEqualTo(String value) {
            addCriterion("DATA106 >=", value, "data106");
            return (Criteria) this;
        }

        public Criteria andData106LessThan(String value) {
            addCriterion("DATA106 <", value, "data106");
            return (Criteria) this;
        }

        public Criteria andData106LessThanOrEqualTo(String value) {
            addCriterion("DATA106 <=", value, "data106");
            return (Criteria) this;
        }

        public Criteria andData106Like(String value) {
            addCriterion("DATA106 like", value, "data106");
            return (Criteria) this;
        }

        public Criteria andData106NotLike(String value) {
            addCriterion("DATA106 not like", value, "data106");
            return (Criteria) this;
        }

        public Criteria andData106In(List<String> values) {
            addCriterion("DATA106 in", values, "data106");
            return (Criteria) this;
        }

        public Criteria andData106NotIn(List<String> values) {
            addCriterion("DATA106 not in", values, "data106");
            return (Criteria) this;
        }

        public Criteria andData106Between(String value1, String value2) {
            addCriterion("DATA106 between", value1, value2, "data106");
            return (Criteria) this;
        }

        public Criteria andData106NotBetween(String value1, String value2) {
            addCriterion("DATA106 not between", value1, value2, "data106");
            return (Criteria) this;
        }

        public Criteria andData107IsNull() {
            addCriterion("DATA107 is null");
            return (Criteria) this;
        }

        public Criteria andData107IsNotNull() {
            addCriterion("DATA107 is not null");
            return (Criteria) this;
        }

        public Criteria andData107EqualTo(String value) {
            addCriterion("DATA107 =", value, "data107");
            return (Criteria) this;
        }

        public Criteria andData107NotEqualTo(String value) {
            addCriterion("DATA107 <>", value, "data107");
            return (Criteria) this;
        }

        public Criteria andData107GreaterThan(String value) {
            addCriterion("DATA107 >", value, "data107");
            return (Criteria) this;
        }

        public Criteria andData107GreaterThanOrEqualTo(String value) {
            addCriterion("DATA107 >=", value, "data107");
            return (Criteria) this;
        }

        public Criteria andData107LessThan(String value) {
            addCriterion("DATA107 <", value, "data107");
            return (Criteria) this;
        }

        public Criteria andData107LessThanOrEqualTo(String value) {
            addCriterion("DATA107 <=", value, "data107");
            return (Criteria) this;
        }

        public Criteria andData107Like(String value) {
            addCriterion("DATA107 like", value, "data107");
            return (Criteria) this;
        }

        public Criteria andData107NotLike(String value) {
            addCriterion("DATA107 not like", value, "data107");
            return (Criteria) this;
        }

        public Criteria andData107In(List<String> values) {
            addCriterion("DATA107 in", values, "data107");
            return (Criteria) this;
        }

        public Criteria andData107NotIn(List<String> values) {
            addCriterion("DATA107 not in", values, "data107");
            return (Criteria) this;
        }

        public Criteria andData107Between(String value1, String value2) {
            addCriterion("DATA107 between", value1, value2, "data107");
            return (Criteria) this;
        }

        public Criteria andData107NotBetween(String value1, String value2) {
            addCriterion("DATA107 not between", value1, value2, "data107");
            return (Criteria) this;
        }

        public Criteria andData108IsNull() {
            addCriterion("DATA108 is null");
            return (Criteria) this;
        }

        public Criteria andData108IsNotNull() {
            addCriterion("DATA108 is not null");
            return (Criteria) this;
        }

        public Criteria andData108EqualTo(String value) {
            addCriterion("DATA108 =", value, "data108");
            return (Criteria) this;
        }

        public Criteria andData108NotEqualTo(String value) {
            addCriterion("DATA108 <>", value, "data108");
            return (Criteria) this;
        }

        public Criteria andData108GreaterThan(String value) {
            addCriterion("DATA108 >", value, "data108");
            return (Criteria) this;
        }

        public Criteria andData108GreaterThanOrEqualTo(String value) {
            addCriterion("DATA108 >=", value, "data108");
            return (Criteria) this;
        }

        public Criteria andData108LessThan(String value) {
            addCriterion("DATA108 <", value, "data108");
            return (Criteria) this;
        }

        public Criteria andData108LessThanOrEqualTo(String value) {
            addCriterion("DATA108 <=", value, "data108");
            return (Criteria) this;
        }

        public Criteria andData108Like(String value) {
            addCriterion("DATA108 like", value, "data108");
            return (Criteria) this;
        }

        public Criteria andData108NotLike(String value) {
            addCriterion("DATA108 not like", value, "data108");
            return (Criteria) this;
        }

        public Criteria andData108In(List<String> values) {
            addCriterion("DATA108 in", values, "data108");
            return (Criteria) this;
        }

        public Criteria andData108NotIn(List<String> values) {
            addCriterion("DATA108 not in", values, "data108");
            return (Criteria) this;
        }

        public Criteria andData108Between(String value1, String value2) {
            addCriterion("DATA108 between", value1, value2, "data108");
            return (Criteria) this;
        }

        public Criteria andData108NotBetween(String value1, String value2) {
            addCriterion("DATA108 not between", value1, value2, "data108");
            return (Criteria) this;
        }

        public Criteria andData109IsNull() {
            addCriterion("DATA109 is null");
            return (Criteria) this;
        }

        public Criteria andData109IsNotNull() {
            addCriterion("DATA109 is not null");
            return (Criteria) this;
        }

        public Criteria andData109EqualTo(String value) {
            addCriterion("DATA109 =", value, "data109");
            return (Criteria) this;
        }

        public Criteria andData109NotEqualTo(String value) {
            addCriterion("DATA109 <>", value, "data109");
            return (Criteria) this;
        }

        public Criteria andData109GreaterThan(String value) {
            addCriterion("DATA109 >", value, "data109");
            return (Criteria) this;
        }

        public Criteria andData109GreaterThanOrEqualTo(String value) {
            addCriterion("DATA109 >=", value, "data109");
            return (Criteria) this;
        }

        public Criteria andData109LessThan(String value) {
            addCriterion("DATA109 <", value, "data109");
            return (Criteria) this;
        }

        public Criteria andData109LessThanOrEqualTo(String value) {
            addCriterion("DATA109 <=", value, "data109");
            return (Criteria) this;
        }

        public Criteria andData109Like(String value) {
            addCriterion("DATA109 like", value, "data109");
            return (Criteria) this;
        }

        public Criteria andData109NotLike(String value) {
            addCriterion("DATA109 not like", value, "data109");
            return (Criteria) this;
        }

        public Criteria andData109In(List<String> values) {
            addCriterion("DATA109 in", values, "data109");
            return (Criteria) this;
        }

        public Criteria andData109NotIn(List<String> values) {
            addCriterion("DATA109 not in", values, "data109");
            return (Criteria) this;
        }

        public Criteria andData109Between(String value1, String value2) {
            addCriterion("DATA109 between", value1, value2, "data109");
            return (Criteria) this;
        }

        public Criteria andData109NotBetween(String value1, String value2) {
            addCriterion("DATA109 not between", value1, value2, "data109");
            return (Criteria) this;
        }

        public Criteria andData110IsNull() {
            addCriterion("DATA110 is null");
            return (Criteria) this;
        }

        public Criteria andData110IsNotNull() {
            addCriterion("DATA110 is not null");
            return (Criteria) this;
        }

        public Criteria andData110EqualTo(String value) {
            addCriterion("DATA110 =", value, "data110");
            return (Criteria) this;
        }

        public Criteria andData110NotEqualTo(String value) {
            addCriterion("DATA110 <>", value, "data110");
            return (Criteria) this;
        }

        public Criteria andData110GreaterThan(String value) {
            addCriterion("DATA110 >", value, "data110");
            return (Criteria) this;
        }

        public Criteria andData110GreaterThanOrEqualTo(String value) {
            addCriterion("DATA110 >=", value, "data110");
            return (Criteria) this;
        }

        public Criteria andData110LessThan(String value) {
            addCriterion("DATA110 <", value, "data110");
            return (Criteria) this;
        }

        public Criteria andData110LessThanOrEqualTo(String value) {
            addCriterion("DATA110 <=", value, "data110");
            return (Criteria) this;
        }

        public Criteria andData110Like(String value) {
            addCriterion("DATA110 like", value, "data110");
            return (Criteria) this;
        }

        public Criteria andData110NotLike(String value) {
            addCriterion("DATA110 not like", value, "data110");
            return (Criteria) this;
        }

        public Criteria andData110In(List<String> values) {
            addCriterion("DATA110 in", values, "data110");
            return (Criteria) this;
        }

        public Criteria andData110NotIn(List<String> values) {
            addCriterion("DATA110 not in", values, "data110");
            return (Criteria) this;
        }

        public Criteria andData110Between(String value1, String value2) {
            addCriterion("DATA110 between", value1, value2, "data110");
            return (Criteria) this;
        }

        public Criteria andData110NotBetween(String value1, String value2) {
            addCriterion("DATA110 not between", value1, value2, "data110");
            return (Criteria) this;
        }

        public Criteria andData111IsNull() {
            addCriterion("DATA111 is null");
            return (Criteria) this;
        }

        public Criteria andData111IsNotNull() {
            addCriterion("DATA111 is not null");
            return (Criteria) this;
        }

        public Criteria andData111EqualTo(String value) {
            addCriterion("DATA111 =", value, "data111");
            return (Criteria) this;
        }

        public Criteria andData111NotEqualTo(String value) {
            addCriterion("DATA111 <>", value, "data111");
            return (Criteria) this;
        }

        public Criteria andData111GreaterThan(String value) {
            addCriterion("DATA111 >", value, "data111");
            return (Criteria) this;
        }

        public Criteria andData111GreaterThanOrEqualTo(String value) {
            addCriterion("DATA111 >=", value, "data111");
            return (Criteria) this;
        }

        public Criteria andData111LessThan(String value) {
            addCriterion("DATA111 <", value, "data111");
            return (Criteria) this;
        }

        public Criteria andData111LessThanOrEqualTo(String value) {
            addCriterion("DATA111 <=", value, "data111");
            return (Criteria) this;
        }

        public Criteria andData111Like(String value) {
            addCriterion("DATA111 like", value, "data111");
            return (Criteria) this;
        }

        public Criteria andData111NotLike(String value) {
            addCriterion("DATA111 not like", value, "data111");
            return (Criteria) this;
        }

        public Criteria andData111In(List<String> values) {
            addCriterion("DATA111 in", values, "data111");
            return (Criteria) this;
        }

        public Criteria andData111NotIn(List<String> values) {
            addCriterion("DATA111 not in", values, "data111");
            return (Criteria) this;
        }

        public Criteria andData111Between(String value1, String value2) {
            addCriterion("DATA111 between", value1, value2, "data111");
            return (Criteria) this;
        }

        public Criteria andData111NotBetween(String value1, String value2) {
            addCriterion("DATA111 not between", value1, value2, "data111");
            return (Criteria) this;
        }

        public Criteria andData112IsNull() {
            addCriterion("DATA112 is null");
            return (Criteria) this;
        }

        public Criteria andData112IsNotNull() {
            addCriterion("DATA112 is not null");
            return (Criteria) this;
        }

        public Criteria andData112EqualTo(String value) {
            addCriterion("DATA112 =", value, "data112");
            return (Criteria) this;
        }

        public Criteria andData112NotEqualTo(String value) {
            addCriterion("DATA112 <>", value, "data112");
            return (Criteria) this;
        }

        public Criteria andData112GreaterThan(String value) {
            addCriterion("DATA112 >", value, "data112");
            return (Criteria) this;
        }

        public Criteria andData112GreaterThanOrEqualTo(String value) {
            addCriterion("DATA112 >=", value, "data112");
            return (Criteria) this;
        }

        public Criteria andData112LessThan(String value) {
            addCriterion("DATA112 <", value, "data112");
            return (Criteria) this;
        }

        public Criteria andData112LessThanOrEqualTo(String value) {
            addCriterion("DATA112 <=", value, "data112");
            return (Criteria) this;
        }

        public Criteria andData112Like(String value) {
            addCriterion("DATA112 like", value, "data112");
            return (Criteria) this;
        }

        public Criteria andData112NotLike(String value) {
            addCriterion("DATA112 not like", value, "data112");
            return (Criteria) this;
        }

        public Criteria andData112In(List<String> values) {
            addCriterion("DATA112 in", values, "data112");
            return (Criteria) this;
        }

        public Criteria andData112NotIn(List<String> values) {
            addCriterion("DATA112 not in", values, "data112");
            return (Criteria) this;
        }

        public Criteria andData112Between(String value1, String value2) {
            addCriterion("DATA112 between", value1, value2, "data112");
            return (Criteria) this;
        }

        public Criteria andData112NotBetween(String value1, String value2) {
            addCriterion("DATA112 not between", value1, value2, "data112");
            return (Criteria) this;
        }

        public Criteria andData113IsNull() {
            addCriterion("DATA113 is null");
            return (Criteria) this;
        }

        public Criteria andData113IsNotNull() {
            addCriterion("DATA113 is not null");
            return (Criteria) this;
        }

        public Criteria andData113EqualTo(String value) {
            addCriterion("DATA113 =", value, "data113");
            return (Criteria) this;
        }

        public Criteria andData113NotEqualTo(String value) {
            addCriterion("DATA113 <>", value, "data113");
            return (Criteria) this;
        }

        public Criteria andData113GreaterThan(String value) {
            addCriterion("DATA113 >", value, "data113");
            return (Criteria) this;
        }

        public Criteria andData113GreaterThanOrEqualTo(String value) {
            addCriterion("DATA113 >=", value, "data113");
            return (Criteria) this;
        }

        public Criteria andData113LessThan(String value) {
            addCriterion("DATA113 <", value, "data113");
            return (Criteria) this;
        }

        public Criteria andData113LessThanOrEqualTo(String value) {
            addCriterion("DATA113 <=", value, "data113");
            return (Criteria) this;
        }

        public Criteria andData113Like(String value) {
            addCriterion("DATA113 like", value, "data113");
            return (Criteria) this;
        }

        public Criteria andData113NotLike(String value) {
            addCriterion("DATA113 not like", value, "data113");
            return (Criteria) this;
        }

        public Criteria andData113In(List<String> values) {
            addCriterion("DATA113 in", values, "data113");
            return (Criteria) this;
        }

        public Criteria andData113NotIn(List<String> values) {
            addCriterion("DATA113 not in", values, "data113");
            return (Criteria) this;
        }

        public Criteria andData113Between(String value1, String value2) {
            addCriterion("DATA113 between", value1, value2, "data113");
            return (Criteria) this;
        }

        public Criteria andData113NotBetween(String value1, String value2) {
            addCriterion("DATA113 not between", value1, value2, "data113");
            return (Criteria) this;
        }

        public Criteria andData114IsNull() {
            addCriterion("DATA114 is null");
            return (Criteria) this;
        }

        public Criteria andData114IsNotNull() {
            addCriterion("DATA114 is not null");
            return (Criteria) this;
        }

        public Criteria andData114EqualTo(String value) {
            addCriterion("DATA114 =", value, "data114");
            return (Criteria) this;
        }

        public Criteria andData114NotEqualTo(String value) {
            addCriterion("DATA114 <>", value, "data114");
            return (Criteria) this;
        }

        public Criteria andData114GreaterThan(String value) {
            addCriterion("DATA114 >", value, "data114");
            return (Criteria) this;
        }

        public Criteria andData114GreaterThanOrEqualTo(String value) {
            addCriterion("DATA114 >=", value, "data114");
            return (Criteria) this;
        }

        public Criteria andData114LessThan(String value) {
            addCriterion("DATA114 <", value, "data114");
            return (Criteria) this;
        }

        public Criteria andData114LessThanOrEqualTo(String value) {
            addCriterion("DATA114 <=", value, "data114");
            return (Criteria) this;
        }

        public Criteria andData114Like(String value) {
            addCriterion("DATA114 like", value, "data114");
            return (Criteria) this;
        }

        public Criteria andData114NotLike(String value) {
            addCriterion("DATA114 not like", value, "data114");
            return (Criteria) this;
        }

        public Criteria andData114In(List<String> values) {
            addCriterion("DATA114 in", values, "data114");
            return (Criteria) this;
        }

        public Criteria andData114NotIn(List<String> values) {
            addCriterion("DATA114 not in", values, "data114");
            return (Criteria) this;
        }

        public Criteria andData114Between(String value1, String value2) {
            addCriterion("DATA114 between", value1, value2, "data114");
            return (Criteria) this;
        }

        public Criteria andData114NotBetween(String value1, String value2) {
            addCriterion("DATA114 not between", value1, value2, "data114");
            return (Criteria) this;
        }

        public Criteria andData115IsNull() {
            addCriterion("DATA115 is null");
            return (Criteria) this;
        }

        public Criteria andData115IsNotNull() {
            addCriterion("DATA115 is not null");
            return (Criteria) this;
        }

        public Criteria andData115EqualTo(String value) {
            addCriterion("DATA115 =", value, "data115");
            return (Criteria) this;
        }

        public Criteria andData115NotEqualTo(String value) {
            addCriterion("DATA115 <>", value, "data115");
            return (Criteria) this;
        }

        public Criteria andData115GreaterThan(String value) {
            addCriterion("DATA115 >", value, "data115");
            return (Criteria) this;
        }

        public Criteria andData115GreaterThanOrEqualTo(String value) {
            addCriterion("DATA115 >=", value, "data115");
            return (Criteria) this;
        }

        public Criteria andData115LessThan(String value) {
            addCriterion("DATA115 <", value, "data115");
            return (Criteria) this;
        }

        public Criteria andData115LessThanOrEqualTo(String value) {
            addCriterion("DATA115 <=", value, "data115");
            return (Criteria) this;
        }

        public Criteria andData115Like(String value) {
            addCriterion("DATA115 like", value, "data115");
            return (Criteria) this;
        }

        public Criteria andData115NotLike(String value) {
            addCriterion("DATA115 not like", value, "data115");
            return (Criteria) this;
        }

        public Criteria andData115In(List<String> values) {
            addCriterion("DATA115 in", values, "data115");
            return (Criteria) this;
        }

        public Criteria andData115NotIn(List<String> values) {
            addCriterion("DATA115 not in", values, "data115");
            return (Criteria) this;
        }

        public Criteria andData115Between(String value1, String value2) {
            addCriterion("DATA115 between", value1, value2, "data115");
            return (Criteria) this;
        }

        public Criteria andData115NotBetween(String value1, String value2) {
            addCriterion("DATA115 not between", value1, value2, "data115");
            return (Criteria) this;
        }

        public Criteria andData116IsNull() {
            addCriterion("DATA116 is null");
            return (Criteria) this;
        }

        public Criteria andData116IsNotNull() {
            addCriterion("DATA116 is not null");
            return (Criteria) this;
        }

        public Criteria andData116EqualTo(String value) {
            addCriterion("DATA116 =", value, "data116");
            return (Criteria) this;
        }

        public Criteria andData116NotEqualTo(String value) {
            addCriterion("DATA116 <>", value, "data116");
            return (Criteria) this;
        }

        public Criteria andData116GreaterThan(String value) {
            addCriterion("DATA116 >", value, "data116");
            return (Criteria) this;
        }

        public Criteria andData116GreaterThanOrEqualTo(String value) {
            addCriterion("DATA116 >=", value, "data116");
            return (Criteria) this;
        }

        public Criteria andData116LessThan(String value) {
            addCriterion("DATA116 <", value, "data116");
            return (Criteria) this;
        }

        public Criteria andData116LessThanOrEqualTo(String value) {
            addCriterion("DATA116 <=", value, "data116");
            return (Criteria) this;
        }

        public Criteria andData116Like(String value) {
            addCriterion("DATA116 like", value, "data116");
            return (Criteria) this;
        }

        public Criteria andData116NotLike(String value) {
            addCriterion("DATA116 not like", value, "data116");
            return (Criteria) this;
        }

        public Criteria andData116In(List<String> values) {
            addCriterion("DATA116 in", values, "data116");
            return (Criteria) this;
        }

        public Criteria andData116NotIn(List<String> values) {
            addCriterion("DATA116 not in", values, "data116");
            return (Criteria) this;
        }

        public Criteria andData116Between(String value1, String value2) {
            addCriterion("DATA116 between", value1, value2, "data116");
            return (Criteria) this;
        }

        public Criteria andData116NotBetween(String value1, String value2) {
            addCriterion("DATA116 not between", value1, value2, "data116");
            return (Criteria) this;
        }

        public Criteria andData117IsNull() {
            addCriterion("DATA117 is null");
            return (Criteria) this;
        }

        public Criteria andData117IsNotNull() {
            addCriterion("DATA117 is not null");
            return (Criteria) this;
        }

        public Criteria andData117EqualTo(String value) {
            addCriterion("DATA117 =", value, "data117");
            return (Criteria) this;
        }

        public Criteria andData117NotEqualTo(String value) {
            addCriterion("DATA117 <>", value, "data117");
            return (Criteria) this;
        }

        public Criteria andData117GreaterThan(String value) {
            addCriterion("DATA117 >", value, "data117");
            return (Criteria) this;
        }

        public Criteria andData117GreaterThanOrEqualTo(String value) {
            addCriterion("DATA117 >=", value, "data117");
            return (Criteria) this;
        }

        public Criteria andData117LessThan(String value) {
            addCriterion("DATA117 <", value, "data117");
            return (Criteria) this;
        }

        public Criteria andData117LessThanOrEqualTo(String value) {
            addCriterion("DATA117 <=", value, "data117");
            return (Criteria) this;
        }

        public Criteria andData117Like(String value) {
            addCriterion("DATA117 like", value, "data117");
            return (Criteria) this;
        }

        public Criteria andData117NotLike(String value) {
            addCriterion("DATA117 not like", value, "data117");
            return (Criteria) this;
        }

        public Criteria andData117In(List<String> values) {
            addCriterion("DATA117 in", values, "data117");
            return (Criteria) this;
        }

        public Criteria andData117NotIn(List<String> values) {
            addCriterion("DATA117 not in", values, "data117");
            return (Criteria) this;
        }

        public Criteria andData117Between(String value1, String value2) {
            addCriterion("DATA117 between", value1, value2, "data117");
            return (Criteria) this;
        }

        public Criteria andData117NotBetween(String value1, String value2) {
            addCriterion("DATA117 not between", value1, value2, "data117");
            return (Criteria) this;
        }

        public Criteria andData118IsNull() {
            addCriterion("DATA118 is null");
            return (Criteria) this;
        }

        public Criteria andData118IsNotNull() {
            addCriterion("DATA118 is not null");
            return (Criteria) this;
        }

        public Criteria andData118EqualTo(String value) {
            addCriterion("DATA118 =", value, "data118");
            return (Criteria) this;
        }

        public Criteria andData118NotEqualTo(String value) {
            addCriterion("DATA118 <>", value, "data118");
            return (Criteria) this;
        }

        public Criteria andData118GreaterThan(String value) {
            addCriterion("DATA118 >", value, "data118");
            return (Criteria) this;
        }

        public Criteria andData118GreaterThanOrEqualTo(String value) {
            addCriterion("DATA118 >=", value, "data118");
            return (Criteria) this;
        }

        public Criteria andData118LessThan(String value) {
            addCriterion("DATA118 <", value, "data118");
            return (Criteria) this;
        }

        public Criteria andData118LessThanOrEqualTo(String value) {
            addCriterion("DATA118 <=", value, "data118");
            return (Criteria) this;
        }

        public Criteria andData118Like(String value) {
            addCriterion("DATA118 like", value, "data118");
            return (Criteria) this;
        }

        public Criteria andData118NotLike(String value) {
            addCriterion("DATA118 not like", value, "data118");
            return (Criteria) this;
        }

        public Criteria andData118In(List<String> values) {
            addCriterion("DATA118 in", values, "data118");
            return (Criteria) this;
        }

        public Criteria andData118NotIn(List<String> values) {
            addCriterion("DATA118 not in", values, "data118");
            return (Criteria) this;
        }

        public Criteria andData118Between(String value1, String value2) {
            addCriterion("DATA118 between", value1, value2, "data118");
            return (Criteria) this;
        }

        public Criteria andData118NotBetween(String value1, String value2) {
            addCriterion("DATA118 not between", value1, value2, "data118");
            return (Criteria) this;
        }

        public Criteria andData119IsNull() {
            addCriterion("DATA119 is null");
            return (Criteria) this;
        }

        public Criteria andData119IsNotNull() {
            addCriterion("DATA119 is not null");
            return (Criteria) this;
        }

        public Criteria andData119EqualTo(String value) {
            addCriterion("DATA119 =", value, "data119");
            return (Criteria) this;
        }

        public Criteria andData119NotEqualTo(String value) {
            addCriterion("DATA119 <>", value, "data119");
            return (Criteria) this;
        }

        public Criteria andData119GreaterThan(String value) {
            addCriterion("DATA119 >", value, "data119");
            return (Criteria) this;
        }

        public Criteria andData119GreaterThanOrEqualTo(String value) {
            addCriterion("DATA119 >=", value, "data119");
            return (Criteria) this;
        }

        public Criteria andData119LessThan(String value) {
            addCriterion("DATA119 <", value, "data119");
            return (Criteria) this;
        }

        public Criteria andData119LessThanOrEqualTo(String value) {
            addCriterion("DATA119 <=", value, "data119");
            return (Criteria) this;
        }

        public Criteria andData119Like(String value) {
            addCriterion("DATA119 like", value, "data119");
            return (Criteria) this;
        }

        public Criteria andData119NotLike(String value) {
            addCriterion("DATA119 not like", value, "data119");
            return (Criteria) this;
        }

        public Criteria andData119In(List<String> values) {
            addCriterion("DATA119 in", values, "data119");
            return (Criteria) this;
        }

        public Criteria andData119NotIn(List<String> values) {
            addCriterion("DATA119 not in", values, "data119");
            return (Criteria) this;
        }

        public Criteria andData119Between(String value1, String value2) {
            addCriterion("DATA119 between", value1, value2, "data119");
            return (Criteria) this;
        }

        public Criteria andData119NotBetween(String value1, String value2) {
            addCriterion("DATA119 not between", value1, value2, "data119");
            return (Criteria) this;
        }

        public Criteria andData120IsNull() {
            addCriterion("DATA120 is null");
            return (Criteria) this;
        }

        public Criteria andData120IsNotNull() {
            addCriterion("DATA120 is not null");
            return (Criteria) this;
        }

        public Criteria andData120EqualTo(String value) {
            addCriterion("DATA120 =", value, "data120");
            return (Criteria) this;
        }

        public Criteria andData120NotEqualTo(String value) {
            addCriterion("DATA120 <>", value, "data120");
            return (Criteria) this;
        }

        public Criteria andData120GreaterThan(String value) {
            addCriterion("DATA120 >", value, "data120");
            return (Criteria) this;
        }

        public Criteria andData120GreaterThanOrEqualTo(String value) {
            addCriterion("DATA120 >=", value, "data120");
            return (Criteria) this;
        }

        public Criteria andData120LessThan(String value) {
            addCriterion("DATA120 <", value, "data120");
            return (Criteria) this;
        }

        public Criteria andData120LessThanOrEqualTo(String value) {
            addCriterion("DATA120 <=", value, "data120");
            return (Criteria) this;
        }

        public Criteria andData120Like(String value) {
            addCriterion("DATA120 like", value, "data120");
            return (Criteria) this;
        }

        public Criteria andData120NotLike(String value) {
            addCriterion("DATA120 not like", value, "data120");
            return (Criteria) this;
        }

        public Criteria andData120In(List<String> values) {
            addCriterion("DATA120 in", values, "data120");
            return (Criteria) this;
        }

        public Criteria andData120NotIn(List<String> values) {
            addCriterion("DATA120 not in", values, "data120");
            return (Criteria) this;
        }

        public Criteria andData120Between(String value1, String value2) {
            addCriterion("DATA120 between", value1, value2, "data120");
            return (Criteria) this;
        }

        public Criteria andData120NotBetween(String value1, String value2) {
            addCriterion("DATA120 not between", value1, value2, "data120");
            return (Criteria) this;
        }

        public Criteria andData121IsNull() {
            addCriterion("DATA121 is null");
            return (Criteria) this;
        }

        public Criteria andData121IsNotNull() {
            addCriterion("DATA121 is not null");
            return (Criteria) this;
        }

        public Criteria andData121EqualTo(String value) {
            addCriterion("DATA121 =", value, "data121");
            return (Criteria) this;
        }

        public Criteria andData121NotEqualTo(String value) {
            addCriterion("DATA121 <>", value, "data121");
            return (Criteria) this;
        }

        public Criteria andData121GreaterThan(String value) {
            addCriterion("DATA121 >", value, "data121");
            return (Criteria) this;
        }

        public Criteria andData121GreaterThanOrEqualTo(String value) {
            addCriterion("DATA121 >=", value, "data121");
            return (Criteria) this;
        }

        public Criteria andData121LessThan(String value) {
            addCriterion("DATA121 <", value, "data121");
            return (Criteria) this;
        }

        public Criteria andData121LessThanOrEqualTo(String value) {
            addCriterion("DATA121 <=", value, "data121");
            return (Criteria) this;
        }

        public Criteria andData121Like(String value) {
            addCriterion("DATA121 like", value, "data121");
            return (Criteria) this;
        }

        public Criteria andData121NotLike(String value) {
            addCriterion("DATA121 not like", value, "data121");
            return (Criteria) this;
        }

        public Criteria andData121In(List<String> values) {
            addCriterion("DATA121 in", values, "data121");
            return (Criteria) this;
        }

        public Criteria andData121NotIn(List<String> values) {
            addCriterion("DATA121 not in", values, "data121");
            return (Criteria) this;
        }

        public Criteria andData121Between(String value1, String value2) {
            addCriterion("DATA121 between", value1, value2, "data121");
            return (Criteria) this;
        }

        public Criteria andData121NotBetween(String value1, String value2) {
            addCriterion("DATA121 not between", value1, value2, "data121");
            return (Criteria) this;
        }

        public Criteria andData122IsNull() {
            addCriterion("DATA122 is null");
            return (Criteria) this;
        }

        public Criteria andData122IsNotNull() {
            addCriterion("DATA122 is not null");
            return (Criteria) this;
        }

        public Criteria andData122EqualTo(String value) {
            addCriterion("DATA122 =", value, "data122");
            return (Criteria) this;
        }

        public Criteria andData122NotEqualTo(String value) {
            addCriterion("DATA122 <>", value, "data122");
            return (Criteria) this;
        }

        public Criteria andData122GreaterThan(String value) {
            addCriterion("DATA122 >", value, "data122");
            return (Criteria) this;
        }

        public Criteria andData122GreaterThanOrEqualTo(String value) {
            addCriterion("DATA122 >=", value, "data122");
            return (Criteria) this;
        }

        public Criteria andData122LessThan(String value) {
            addCriterion("DATA122 <", value, "data122");
            return (Criteria) this;
        }

        public Criteria andData122LessThanOrEqualTo(String value) {
            addCriterion("DATA122 <=", value, "data122");
            return (Criteria) this;
        }

        public Criteria andData122Like(String value) {
            addCriterion("DATA122 like", value, "data122");
            return (Criteria) this;
        }

        public Criteria andData122NotLike(String value) {
            addCriterion("DATA122 not like", value, "data122");
            return (Criteria) this;
        }

        public Criteria andData122In(List<String> values) {
            addCriterion("DATA122 in", values, "data122");
            return (Criteria) this;
        }

        public Criteria andData122NotIn(List<String> values) {
            addCriterion("DATA122 not in", values, "data122");
            return (Criteria) this;
        }

        public Criteria andData122Between(String value1, String value2) {
            addCriterion("DATA122 between", value1, value2, "data122");
            return (Criteria) this;
        }

        public Criteria andData122NotBetween(String value1, String value2) {
            addCriterion("DATA122 not between", value1, value2, "data122");
            return (Criteria) this;
        }

        public Criteria andData123IsNull() {
            addCriterion("DATA123 is null");
            return (Criteria) this;
        }

        public Criteria andData123IsNotNull() {
            addCriterion("DATA123 is not null");
            return (Criteria) this;
        }

        public Criteria andData123EqualTo(String value) {
            addCriterion("DATA123 =", value, "data123");
            return (Criteria) this;
        }

        public Criteria andData123NotEqualTo(String value) {
            addCriterion("DATA123 <>", value, "data123");
            return (Criteria) this;
        }

        public Criteria andData123GreaterThan(String value) {
            addCriterion("DATA123 >", value, "data123");
            return (Criteria) this;
        }

        public Criteria andData123GreaterThanOrEqualTo(String value) {
            addCriterion("DATA123 >=", value, "data123");
            return (Criteria) this;
        }

        public Criteria andData123LessThan(String value) {
            addCriterion("DATA123 <", value, "data123");
            return (Criteria) this;
        }

        public Criteria andData123LessThanOrEqualTo(String value) {
            addCriterion("DATA123 <=", value, "data123");
            return (Criteria) this;
        }

        public Criteria andData123Like(String value) {
            addCriterion("DATA123 like", value, "data123");
            return (Criteria) this;
        }

        public Criteria andData123NotLike(String value) {
            addCriterion("DATA123 not like", value, "data123");
            return (Criteria) this;
        }

        public Criteria andData123In(List<String> values) {
            addCriterion("DATA123 in", values, "data123");
            return (Criteria) this;
        }

        public Criteria andData123NotIn(List<String> values) {
            addCriterion("DATA123 not in", values, "data123");
            return (Criteria) this;
        }

        public Criteria andData123Between(String value1, String value2) {
            addCriterion("DATA123 between", value1, value2, "data123");
            return (Criteria) this;
        }

        public Criteria andData123NotBetween(String value1, String value2) {
            addCriterion("DATA123 not between", value1, value2, "data123");
            return (Criteria) this;
        }

        public Criteria andData124IsNull() {
            addCriterion("DATA124 is null");
            return (Criteria) this;
        }

        public Criteria andData124IsNotNull() {
            addCriterion("DATA124 is not null");
            return (Criteria) this;
        }

        public Criteria andData124EqualTo(String value) {
            addCriterion("DATA124 =", value, "data124");
            return (Criteria) this;
        }

        public Criteria andData124NotEqualTo(String value) {
            addCriterion("DATA124 <>", value, "data124");
            return (Criteria) this;
        }

        public Criteria andData124GreaterThan(String value) {
            addCriterion("DATA124 >", value, "data124");
            return (Criteria) this;
        }

        public Criteria andData124GreaterThanOrEqualTo(String value) {
            addCriterion("DATA124 >=", value, "data124");
            return (Criteria) this;
        }

        public Criteria andData124LessThan(String value) {
            addCriterion("DATA124 <", value, "data124");
            return (Criteria) this;
        }

        public Criteria andData124LessThanOrEqualTo(String value) {
            addCriterion("DATA124 <=", value, "data124");
            return (Criteria) this;
        }

        public Criteria andData124Like(String value) {
            addCriterion("DATA124 like", value, "data124");
            return (Criteria) this;
        }

        public Criteria andData124NotLike(String value) {
            addCriterion("DATA124 not like", value, "data124");
            return (Criteria) this;
        }

        public Criteria andData124In(List<String> values) {
            addCriterion("DATA124 in", values, "data124");
            return (Criteria) this;
        }

        public Criteria andData124NotIn(List<String> values) {
            addCriterion("DATA124 not in", values, "data124");
            return (Criteria) this;
        }

        public Criteria andData124Between(String value1, String value2) {
            addCriterion("DATA124 between", value1, value2, "data124");
            return (Criteria) this;
        }

        public Criteria andData124NotBetween(String value1, String value2) {
            addCriterion("DATA124 not between", value1, value2, "data124");
            return (Criteria) this;
        }

        public Criteria andData125IsNull() {
            addCriterion("DATA125 is null");
            return (Criteria) this;
        }

        public Criteria andData125IsNotNull() {
            addCriterion("DATA125 is not null");
            return (Criteria) this;
        }

        public Criteria andData125EqualTo(String value) {
            addCriterion("DATA125 =", value, "data125");
            return (Criteria) this;
        }

        public Criteria andData125NotEqualTo(String value) {
            addCriterion("DATA125 <>", value, "data125");
            return (Criteria) this;
        }

        public Criteria andData125GreaterThan(String value) {
            addCriterion("DATA125 >", value, "data125");
            return (Criteria) this;
        }

        public Criteria andData125GreaterThanOrEqualTo(String value) {
            addCriterion("DATA125 >=", value, "data125");
            return (Criteria) this;
        }

        public Criteria andData125LessThan(String value) {
            addCriterion("DATA125 <", value, "data125");
            return (Criteria) this;
        }

        public Criteria andData125LessThanOrEqualTo(String value) {
            addCriterion("DATA125 <=", value, "data125");
            return (Criteria) this;
        }

        public Criteria andData125Like(String value) {
            addCriterion("DATA125 like", value, "data125");
            return (Criteria) this;
        }

        public Criteria andData125NotLike(String value) {
            addCriterion("DATA125 not like", value, "data125");
            return (Criteria) this;
        }

        public Criteria andData125In(List<String> values) {
            addCriterion("DATA125 in", values, "data125");
            return (Criteria) this;
        }

        public Criteria andData125NotIn(List<String> values) {
            addCriterion("DATA125 not in", values, "data125");
            return (Criteria) this;
        }

        public Criteria andData125Between(String value1, String value2) {
            addCriterion("DATA125 between", value1, value2, "data125");
            return (Criteria) this;
        }

        public Criteria andData125NotBetween(String value1, String value2) {
            addCriterion("DATA125 not between", value1, value2, "data125");
            return (Criteria) this;
        }

        public Criteria andData126IsNull() {
            addCriterion("DATA126 is null");
            return (Criteria) this;
        }

        public Criteria andData126IsNotNull() {
            addCriterion("DATA126 is not null");
            return (Criteria) this;
        }

        public Criteria andData126EqualTo(String value) {
            addCriterion("DATA126 =", value, "data126");
            return (Criteria) this;
        }

        public Criteria andData126NotEqualTo(String value) {
            addCriterion("DATA126 <>", value, "data126");
            return (Criteria) this;
        }

        public Criteria andData126GreaterThan(String value) {
            addCriterion("DATA126 >", value, "data126");
            return (Criteria) this;
        }

        public Criteria andData126GreaterThanOrEqualTo(String value) {
            addCriterion("DATA126 >=", value, "data126");
            return (Criteria) this;
        }

        public Criteria andData126LessThan(String value) {
            addCriterion("DATA126 <", value, "data126");
            return (Criteria) this;
        }

        public Criteria andData126LessThanOrEqualTo(String value) {
            addCriterion("DATA126 <=", value, "data126");
            return (Criteria) this;
        }

        public Criteria andData126Like(String value) {
            addCriterion("DATA126 like", value, "data126");
            return (Criteria) this;
        }

        public Criteria andData126NotLike(String value) {
            addCriterion("DATA126 not like", value, "data126");
            return (Criteria) this;
        }

        public Criteria andData126In(List<String> values) {
            addCriterion("DATA126 in", values, "data126");
            return (Criteria) this;
        }

        public Criteria andData126NotIn(List<String> values) {
            addCriterion("DATA126 not in", values, "data126");
            return (Criteria) this;
        }

        public Criteria andData126Between(String value1, String value2) {
            addCriterion("DATA126 between", value1, value2, "data126");
            return (Criteria) this;
        }

        public Criteria andData126NotBetween(String value1, String value2) {
            addCriterion("DATA126 not between", value1, value2, "data126");
            return (Criteria) this;
        }

        public Criteria andData127IsNull() {
            addCriterion("DATA127 is null");
            return (Criteria) this;
        }

        public Criteria andData127IsNotNull() {
            addCriterion("DATA127 is not null");
            return (Criteria) this;
        }

        public Criteria andData127EqualTo(String value) {
            addCriterion("DATA127 =", value, "data127");
            return (Criteria) this;
        }

        public Criteria andData127NotEqualTo(String value) {
            addCriterion("DATA127 <>", value, "data127");
            return (Criteria) this;
        }

        public Criteria andData127GreaterThan(String value) {
            addCriterion("DATA127 >", value, "data127");
            return (Criteria) this;
        }

        public Criteria andData127GreaterThanOrEqualTo(String value) {
            addCriterion("DATA127 >=", value, "data127");
            return (Criteria) this;
        }

        public Criteria andData127LessThan(String value) {
            addCriterion("DATA127 <", value, "data127");
            return (Criteria) this;
        }

        public Criteria andData127LessThanOrEqualTo(String value) {
            addCriterion("DATA127 <=", value, "data127");
            return (Criteria) this;
        }

        public Criteria andData127Like(String value) {
            addCriterion("DATA127 like", value, "data127");
            return (Criteria) this;
        }

        public Criteria andData127NotLike(String value) {
            addCriterion("DATA127 not like", value, "data127");
            return (Criteria) this;
        }

        public Criteria andData127In(List<String> values) {
            addCriterion("DATA127 in", values, "data127");
            return (Criteria) this;
        }

        public Criteria andData127NotIn(List<String> values) {
            addCriterion("DATA127 not in", values, "data127");
            return (Criteria) this;
        }

        public Criteria andData127Between(String value1, String value2) {
            addCriterion("DATA127 between", value1, value2, "data127");
            return (Criteria) this;
        }

        public Criteria andData127NotBetween(String value1, String value2) {
            addCriterion("DATA127 not between", value1, value2, "data127");
            return (Criteria) this;
        }

        public Criteria andData128IsNull() {
            addCriterion("DATA128 is null");
            return (Criteria) this;
        }

        public Criteria andData128IsNotNull() {
            addCriterion("DATA128 is not null");
            return (Criteria) this;
        }

        public Criteria andData128EqualTo(String value) {
            addCriterion("DATA128 =", value, "data128");
            return (Criteria) this;
        }

        public Criteria andData128NotEqualTo(String value) {
            addCriterion("DATA128 <>", value, "data128");
            return (Criteria) this;
        }

        public Criteria andData128GreaterThan(String value) {
            addCriterion("DATA128 >", value, "data128");
            return (Criteria) this;
        }

        public Criteria andData128GreaterThanOrEqualTo(String value) {
            addCriterion("DATA128 >=", value, "data128");
            return (Criteria) this;
        }

        public Criteria andData128LessThan(String value) {
            addCriterion("DATA128 <", value, "data128");
            return (Criteria) this;
        }

        public Criteria andData128LessThanOrEqualTo(String value) {
            addCriterion("DATA128 <=", value, "data128");
            return (Criteria) this;
        }

        public Criteria andData128Like(String value) {
            addCriterion("DATA128 like", value, "data128");
            return (Criteria) this;
        }

        public Criteria andData128NotLike(String value) {
            addCriterion("DATA128 not like", value, "data128");
            return (Criteria) this;
        }

        public Criteria andData128In(List<String> values) {
            addCriterion("DATA128 in", values, "data128");
            return (Criteria) this;
        }

        public Criteria andData128NotIn(List<String> values) {
            addCriterion("DATA128 not in", values, "data128");
            return (Criteria) this;
        }

        public Criteria andData128Between(String value1, String value2) {
            addCriterion("DATA128 between", value1, value2, "data128");
            return (Criteria) this;
        }

        public Criteria andData128NotBetween(String value1, String value2) {
            addCriterion("DATA128 not between", value1, value2, "data128");
            return (Criteria) this;
        }

        public Criteria andData129IsNull() {
            addCriterion("DATA129 is null");
            return (Criteria) this;
        }

        public Criteria andData129IsNotNull() {
            addCriterion("DATA129 is not null");
            return (Criteria) this;
        }

        public Criteria andData129EqualTo(String value) {
            addCriterion("DATA129 =", value, "data129");
            return (Criteria) this;
        }

        public Criteria andData129NotEqualTo(String value) {
            addCriterion("DATA129 <>", value, "data129");
            return (Criteria) this;
        }

        public Criteria andData129GreaterThan(String value) {
            addCriterion("DATA129 >", value, "data129");
            return (Criteria) this;
        }

        public Criteria andData129GreaterThanOrEqualTo(String value) {
            addCriterion("DATA129 >=", value, "data129");
            return (Criteria) this;
        }

        public Criteria andData129LessThan(String value) {
            addCriterion("DATA129 <", value, "data129");
            return (Criteria) this;
        }

        public Criteria andData129LessThanOrEqualTo(String value) {
            addCriterion("DATA129 <=", value, "data129");
            return (Criteria) this;
        }

        public Criteria andData129Like(String value) {
            addCriterion("DATA129 like", value, "data129");
            return (Criteria) this;
        }

        public Criteria andData129NotLike(String value) {
            addCriterion("DATA129 not like", value, "data129");
            return (Criteria) this;
        }

        public Criteria andData129In(List<String> values) {
            addCriterion("DATA129 in", values, "data129");
            return (Criteria) this;
        }

        public Criteria andData129NotIn(List<String> values) {
            addCriterion("DATA129 not in", values, "data129");
            return (Criteria) this;
        }

        public Criteria andData129Between(String value1, String value2) {
            addCriterion("DATA129 between", value1, value2, "data129");
            return (Criteria) this;
        }

        public Criteria andData129NotBetween(String value1, String value2) {
            addCriterion("DATA129 not between", value1, value2, "data129");
            return (Criteria) this;
        }

        public Criteria andData130IsNull() {
            addCriterion("DATA130 is null");
            return (Criteria) this;
        }

        public Criteria andData130IsNotNull() {
            addCriterion("DATA130 is not null");
            return (Criteria) this;
        }

        public Criteria andData130EqualTo(String value) {
            addCriterion("DATA130 =", value, "data130");
            return (Criteria) this;
        }

        public Criteria andData130NotEqualTo(String value) {
            addCriterion("DATA130 <>", value, "data130");
            return (Criteria) this;
        }

        public Criteria andData130GreaterThan(String value) {
            addCriterion("DATA130 >", value, "data130");
            return (Criteria) this;
        }

        public Criteria andData130GreaterThanOrEqualTo(String value) {
            addCriterion("DATA130 >=", value, "data130");
            return (Criteria) this;
        }

        public Criteria andData130LessThan(String value) {
            addCriterion("DATA130 <", value, "data130");
            return (Criteria) this;
        }

        public Criteria andData130LessThanOrEqualTo(String value) {
            addCriterion("DATA130 <=", value, "data130");
            return (Criteria) this;
        }

        public Criteria andData130Like(String value) {
            addCriterion("DATA130 like", value, "data130");
            return (Criteria) this;
        }

        public Criteria andData130NotLike(String value) {
            addCriterion("DATA130 not like", value, "data130");
            return (Criteria) this;
        }

        public Criteria andData130In(List<String> values) {
            addCriterion("DATA130 in", values, "data130");
            return (Criteria) this;
        }

        public Criteria andData130NotIn(List<String> values) {
            addCriterion("DATA130 not in", values, "data130");
            return (Criteria) this;
        }

        public Criteria andData130Between(String value1, String value2) {
            addCriterion("DATA130 between", value1, value2, "data130");
            return (Criteria) this;
        }

        public Criteria andData130NotBetween(String value1, String value2) {
            addCriterion("DATA130 not between", value1, value2, "data130");
            return (Criteria) this;
        }

        public Criteria andData131IsNull() {
            addCriterion("DATA131 is null");
            return (Criteria) this;
        }

        public Criteria andData131IsNotNull() {
            addCriterion("DATA131 is not null");
            return (Criteria) this;
        }

        public Criteria andData131EqualTo(String value) {
            addCriterion("DATA131 =", value, "data131");
            return (Criteria) this;
        }

        public Criteria andData131NotEqualTo(String value) {
            addCriterion("DATA131 <>", value, "data131");
            return (Criteria) this;
        }

        public Criteria andData131GreaterThan(String value) {
            addCriterion("DATA131 >", value, "data131");
            return (Criteria) this;
        }

        public Criteria andData131GreaterThanOrEqualTo(String value) {
            addCriterion("DATA131 >=", value, "data131");
            return (Criteria) this;
        }

        public Criteria andData131LessThan(String value) {
            addCriterion("DATA131 <", value, "data131");
            return (Criteria) this;
        }

        public Criteria andData131LessThanOrEqualTo(String value) {
            addCriterion("DATA131 <=", value, "data131");
            return (Criteria) this;
        }

        public Criteria andData131Like(String value) {
            addCriterion("DATA131 like", value, "data131");
            return (Criteria) this;
        }

        public Criteria andData131NotLike(String value) {
            addCriterion("DATA131 not like", value, "data131");
            return (Criteria) this;
        }

        public Criteria andData131In(List<String> values) {
            addCriterion("DATA131 in", values, "data131");
            return (Criteria) this;
        }

        public Criteria andData131NotIn(List<String> values) {
            addCriterion("DATA131 not in", values, "data131");
            return (Criteria) this;
        }

        public Criteria andData131Between(String value1, String value2) {
            addCriterion("DATA131 between", value1, value2, "data131");
            return (Criteria) this;
        }

        public Criteria andData131NotBetween(String value1, String value2) {
            addCriterion("DATA131 not between", value1, value2, "data131");
            return (Criteria) this;
        }

        public Criteria andData132IsNull() {
            addCriterion("DATA132 is null");
            return (Criteria) this;
        }

        public Criteria andData132IsNotNull() {
            addCriterion("DATA132 is not null");
            return (Criteria) this;
        }

        public Criteria andData132EqualTo(String value) {
            addCriterion("DATA132 =", value, "data132");
            return (Criteria) this;
        }

        public Criteria andData132NotEqualTo(String value) {
            addCriterion("DATA132 <>", value, "data132");
            return (Criteria) this;
        }

        public Criteria andData132GreaterThan(String value) {
            addCriterion("DATA132 >", value, "data132");
            return (Criteria) this;
        }

        public Criteria andData132GreaterThanOrEqualTo(String value) {
            addCriterion("DATA132 >=", value, "data132");
            return (Criteria) this;
        }

        public Criteria andData132LessThan(String value) {
            addCriterion("DATA132 <", value, "data132");
            return (Criteria) this;
        }

        public Criteria andData132LessThanOrEqualTo(String value) {
            addCriterion("DATA132 <=", value, "data132");
            return (Criteria) this;
        }

        public Criteria andData132Like(String value) {
            addCriterion("DATA132 like", value, "data132");
            return (Criteria) this;
        }

        public Criteria andData132NotLike(String value) {
            addCriterion("DATA132 not like", value, "data132");
            return (Criteria) this;
        }

        public Criteria andData132In(List<String> values) {
            addCriterion("DATA132 in", values, "data132");
            return (Criteria) this;
        }

        public Criteria andData132NotIn(List<String> values) {
            addCriterion("DATA132 not in", values, "data132");
            return (Criteria) this;
        }

        public Criteria andData132Between(String value1, String value2) {
            addCriterion("DATA132 between", value1, value2, "data132");
            return (Criteria) this;
        }

        public Criteria andData132NotBetween(String value1, String value2) {
            addCriterion("DATA132 not between", value1, value2, "data132");
            return (Criteria) this;
        }

        public Criteria andData133IsNull() {
            addCriterion("DATA133 is null");
            return (Criteria) this;
        }

        public Criteria andData133IsNotNull() {
            addCriterion("DATA133 is not null");
            return (Criteria) this;
        }

        public Criteria andData133EqualTo(String value) {
            addCriterion("DATA133 =", value, "data133");
            return (Criteria) this;
        }

        public Criteria andData133NotEqualTo(String value) {
            addCriterion("DATA133 <>", value, "data133");
            return (Criteria) this;
        }

        public Criteria andData133GreaterThan(String value) {
            addCriterion("DATA133 >", value, "data133");
            return (Criteria) this;
        }

        public Criteria andData133GreaterThanOrEqualTo(String value) {
            addCriterion("DATA133 >=", value, "data133");
            return (Criteria) this;
        }

        public Criteria andData133LessThan(String value) {
            addCriterion("DATA133 <", value, "data133");
            return (Criteria) this;
        }

        public Criteria andData133LessThanOrEqualTo(String value) {
            addCriterion("DATA133 <=", value, "data133");
            return (Criteria) this;
        }

        public Criteria andData133Like(String value) {
            addCriterion("DATA133 like", value, "data133");
            return (Criteria) this;
        }

        public Criteria andData133NotLike(String value) {
            addCriterion("DATA133 not like", value, "data133");
            return (Criteria) this;
        }

        public Criteria andData133In(List<String> values) {
            addCriterion("DATA133 in", values, "data133");
            return (Criteria) this;
        }

        public Criteria andData133NotIn(List<String> values) {
            addCriterion("DATA133 not in", values, "data133");
            return (Criteria) this;
        }

        public Criteria andData133Between(String value1, String value2) {
            addCriterion("DATA133 between", value1, value2, "data133");
            return (Criteria) this;
        }

        public Criteria andData133NotBetween(String value1, String value2) {
            addCriterion("DATA133 not between", value1, value2, "data133");
            return (Criteria) this;
        }

        public Criteria andData134IsNull() {
            addCriterion("DATA134 is null");
            return (Criteria) this;
        }

        public Criteria andData134IsNotNull() {
            addCriterion("DATA134 is not null");
            return (Criteria) this;
        }

        public Criteria andData134EqualTo(String value) {
            addCriterion("DATA134 =", value, "data134");
            return (Criteria) this;
        }

        public Criteria andData134NotEqualTo(String value) {
            addCriterion("DATA134 <>", value, "data134");
            return (Criteria) this;
        }

        public Criteria andData134GreaterThan(String value) {
            addCriterion("DATA134 >", value, "data134");
            return (Criteria) this;
        }

        public Criteria andData134GreaterThanOrEqualTo(String value) {
            addCriterion("DATA134 >=", value, "data134");
            return (Criteria) this;
        }

        public Criteria andData134LessThan(String value) {
            addCriterion("DATA134 <", value, "data134");
            return (Criteria) this;
        }

        public Criteria andData134LessThanOrEqualTo(String value) {
            addCriterion("DATA134 <=", value, "data134");
            return (Criteria) this;
        }

        public Criteria andData134Like(String value) {
            addCriterion("DATA134 like", value, "data134");
            return (Criteria) this;
        }

        public Criteria andData134NotLike(String value) {
            addCriterion("DATA134 not like", value, "data134");
            return (Criteria) this;
        }

        public Criteria andData134In(List<String> values) {
            addCriterion("DATA134 in", values, "data134");
            return (Criteria) this;
        }

        public Criteria andData134NotIn(List<String> values) {
            addCriterion("DATA134 not in", values, "data134");
            return (Criteria) this;
        }

        public Criteria andData134Between(String value1, String value2) {
            addCriterion("DATA134 between", value1, value2, "data134");
            return (Criteria) this;
        }

        public Criteria andData134NotBetween(String value1, String value2) {
            addCriterion("DATA134 not between", value1, value2, "data134");
            return (Criteria) this;
        }

        public Criteria andData135IsNull() {
            addCriterion("DATA135 is null");
            return (Criteria) this;
        }

        public Criteria andData135IsNotNull() {
            addCriterion("DATA135 is not null");
            return (Criteria) this;
        }

        public Criteria andData135EqualTo(String value) {
            addCriterion("DATA135 =", value, "data135");
            return (Criteria) this;
        }

        public Criteria andData135NotEqualTo(String value) {
            addCriterion("DATA135 <>", value, "data135");
            return (Criteria) this;
        }

        public Criteria andData135GreaterThan(String value) {
            addCriterion("DATA135 >", value, "data135");
            return (Criteria) this;
        }

        public Criteria andData135GreaterThanOrEqualTo(String value) {
            addCriterion("DATA135 >=", value, "data135");
            return (Criteria) this;
        }

        public Criteria andData135LessThan(String value) {
            addCriterion("DATA135 <", value, "data135");
            return (Criteria) this;
        }

        public Criteria andData135LessThanOrEqualTo(String value) {
            addCriterion("DATA135 <=", value, "data135");
            return (Criteria) this;
        }

        public Criteria andData135Like(String value) {
            addCriterion("DATA135 like", value, "data135");
            return (Criteria) this;
        }

        public Criteria andData135NotLike(String value) {
            addCriterion("DATA135 not like", value, "data135");
            return (Criteria) this;
        }

        public Criteria andData135In(List<String> values) {
            addCriterion("DATA135 in", values, "data135");
            return (Criteria) this;
        }

        public Criteria andData135NotIn(List<String> values) {
            addCriterion("DATA135 not in", values, "data135");
            return (Criteria) this;
        }

        public Criteria andData135Between(String value1, String value2) {
            addCriterion("DATA135 between", value1, value2, "data135");
            return (Criteria) this;
        }

        public Criteria andData135NotBetween(String value1, String value2) {
            addCriterion("DATA135 not between", value1, value2, "data135");
            return (Criteria) this;
        }

        public Criteria andData136IsNull() {
            addCriterion("DATA136 is null");
            return (Criteria) this;
        }

        public Criteria andData136IsNotNull() {
            addCriterion("DATA136 is not null");
            return (Criteria) this;
        }

        public Criteria andData136EqualTo(String value) {
            addCriterion("DATA136 =", value, "data136");
            return (Criteria) this;
        }

        public Criteria andData136NotEqualTo(String value) {
            addCriterion("DATA136 <>", value, "data136");
            return (Criteria) this;
        }

        public Criteria andData136GreaterThan(String value) {
            addCriterion("DATA136 >", value, "data136");
            return (Criteria) this;
        }

        public Criteria andData136GreaterThanOrEqualTo(String value) {
            addCriterion("DATA136 >=", value, "data136");
            return (Criteria) this;
        }

        public Criteria andData136LessThan(String value) {
            addCriterion("DATA136 <", value, "data136");
            return (Criteria) this;
        }

        public Criteria andData136LessThanOrEqualTo(String value) {
            addCriterion("DATA136 <=", value, "data136");
            return (Criteria) this;
        }

        public Criteria andData136Like(String value) {
            addCriterion("DATA136 like", value, "data136");
            return (Criteria) this;
        }

        public Criteria andData136NotLike(String value) {
            addCriterion("DATA136 not like", value, "data136");
            return (Criteria) this;
        }

        public Criteria andData136In(List<String> values) {
            addCriterion("DATA136 in", values, "data136");
            return (Criteria) this;
        }

        public Criteria andData136NotIn(List<String> values) {
            addCriterion("DATA136 not in", values, "data136");
            return (Criteria) this;
        }

        public Criteria andData136Between(String value1, String value2) {
            addCriterion("DATA136 between", value1, value2, "data136");
            return (Criteria) this;
        }

        public Criteria andData136NotBetween(String value1, String value2) {
            addCriterion("DATA136 not between", value1, value2, "data136");
            return (Criteria) this;
        }

        public Criteria andData137IsNull() {
            addCriterion("DATA137 is null");
            return (Criteria) this;
        }

        public Criteria andData137IsNotNull() {
            addCriterion("DATA137 is not null");
            return (Criteria) this;
        }

        public Criteria andData137EqualTo(String value) {
            addCriterion("DATA137 =", value, "data137");
            return (Criteria) this;
        }

        public Criteria andData137NotEqualTo(String value) {
            addCriterion("DATA137 <>", value, "data137");
            return (Criteria) this;
        }

        public Criteria andData137GreaterThan(String value) {
            addCriterion("DATA137 >", value, "data137");
            return (Criteria) this;
        }

        public Criteria andData137GreaterThanOrEqualTo(String value) {
            addCriterion("DATA137 >=", value, "data137");
            return (Criteria) this;
        }

        public Criteria andData137LessThan(String value) {
            addCriterion("DATA137 <", value, "data137");
            return (Criteria) this;
        }

        public Criteria andData137LessThanOrEqualTo(String value) {
            addCriterion("DATA137 <=", value, "data137");
            return (Criteria) this;
        }

        public Criteria andData137Like(String value) {
            addCriterion("DATA137 like", value, "data137");
            return (Criteria) this;
        }

        public Criteria andData137NotLike(String value) {
            addCriterion("DATA137 not like", value, "data137");
            return (Criteria) this;
        }

        public Criteria andData137In(List<String> values) {
            addCriterion("DATA137 in", values, "data137");
            return (Criteria) this;
        }

        public Criteria andData137NotIn(List<String> values) {
            addCriterion("DATA137 not in", values, "data137");
            return (Criteria) this;
        }

        public Criteria andData137Between(String value1, String value2) {
            addCriterion("DATA137 between", value1, value2, "data137");
            return (Criteria) this;
        }

        public Criteria andData137NotBetween(String value1, String value2) {
            addCriterion("DATA137 not between", value1, value2, "data137");
            return (Criteria) this;
        }

        public Criteria andData138IsNull() {
            addCriterion("DATA138 is null");
            return (Criteria) this;
        }

        public Criteria andData138IsNotNull() {
            addCriterion("DATA138 is not null");
            return (Criteria) this;
        }

        public Criteria andData138EqualTo(String value) {
            addCriterion("DATA138 =", value, "data138");
            return (Criteria) this;
        }

        public Criteria andData138NotEqualTo(String value) {
            addCriterion("DATA138 <>", value, "data138");
            return (Criteria) this;
        }

        public Criteria andData138GreaterThan(String value) {
            addCriterion("DATA138 >", value, "data138");
            return (Criteria) this;
        }

        public Criteria andData138GreaterThanOrEqualTo(String value) {
            addCriterion("DATA138 >=", value, "data138");
            return (Criteria) this;
        }

        public Criteria andData138LessThan(String value) {
            addCriterion("DATA138 <", value, "data138");
            return (Criteria) this;
        }

        public Criteria andData138LessThanOrEqualTo(String value) {
            addCriterion("DATA138 <=", value, "data138");
            return (Criteria) this;
        }

        public Criteria andData138Like(String value) {
            addCriterion("DATA138 like", value, "data138");
            return (Criteria) this;
        }

        public Criteria andData138NotLike(String value) {
            addCriterion("DATA138 not like", value, "data138");
            return (Criteria) this;
        }

        public Criteria andData138In(List<String> values) {
            addCriterion("DATA138 in", values, "data138");
            return (Criteria) this;
        }

        public Criteria andData138NotIn(List<String> values) {
            addCriterion("DATA138 not in", values, "data138");
            return (Criteria) this;
        }

        public Criteria andData138Between(String value1, String value2) {
            addCriterion("DATA138 between", value1, value2, "data138");
            return (Criteria) this;
        }

        public Criteria andData138NotBetween(String value1, String value2) {
            addCriterion("DATA138 not between", value1, value2, "data138");
            return (Criteria) this;
        }

        public Criteria andData139IsNull() {
            addCriterion("DATA139 is null");
            return (Criteria) this;
        }

        public Criteria andData139IsNotNull() {
            addCriterion("DATA139 is not null");
            return (Criteria) this;
        }

        public Criteria andData139EqualTo(String value) {
            addCriterion("DATA139 =", value, "data139");
            return (Criteria) this;
        }

        public Criteria andData139NotEqualTo(String value) {
            addCriterion("DATA139 <>", value, "data139");
            return (Criteria) this;
        }

        public Criteria andData139GreaterThan(String value) {
            addCriterion("DATA139 >", value, "data139");
            return (Criteria) this;
        }

        public Criteria andData139GreaterThanOrEqualTo(String value) {
            addCriterion("DATA139 >=", value, "data139");
            return (Criteria) this;
        }

        public Criteria andData139LessThan(String value) {
            addCriterion("DATA139 <", value, "data139");
            return (Criteria) this;
        }

        public Criteria andData139LessThanOrEqualTo(String value) {
            addCriterion("DATA139 <=", value, "data139");
            return (Criteria) this;
        }

        public Criteria andData139Like(String value) {
            addCriterion("DATA139 like", value, "data139");
            return (Criteria) this;
        }

        public Criteria andData139NotLike(String value) {
            addCriterion("DATA139 not like", value, "data139");
            return (Criteria) this;
        }

        public Criteria andData139In(List<String> values) {
            addCriterion("DATA139 in", values, "data139");
            return (Criteria) this;
        }

        public Criteria andData139NotIn(List<String> values) {
            addCriterion("DATA139 not in", values, "data139");
            return (Criteria) this;
        }

        public Criteria andData139Between(String value1, String value2) {
            addCriterion("DATA139 between", value1, value2, "data139");
            return (Criteria) this;
        }

        public Criteria andData139NotBetween(String value1, String value2) {
            addCriterion("DATA139 not between", value1, value2, "data139");
            return (Criteria) this;
        }

        public Criteria andData140IsNull() {
            addCriterion("DATA140 is null");
            return (Criteria) this;
        }

        public Criteria andData140IsNotNull() {
            addCriterion("DATA140 is not null");
            return (Criteria) this;
        }

        public Criteria andData140EqualTo(String value) {
            addCriterion("DATA140 =", value, "data140");
            return (Criteria) this;
        }

        public Criteria andData140NotEqualTo(String value) {
            addCriterion("DATA140 <>", value, "data140");
            return (Criteria) this;
        }

        public Criteria andData140GreaterThan(String value) {
            addCriterion("DATA140 >", value, "data140");
            return (Criteria) this;
        }

        public Criteria andData140GreaterThanOrEqualTo(String value) {
            addCriterion("DATA140 >=", value, "data140");
            return (Criteria) this;
        }

        public Criteria andData140LessThan(String value) {
            addCriterion("DATA140 <", value, "data140");
            return (Criteria) this;
        }

        public Criteria andData140LessThanOrEqualTo(String value) {
            addCriterion("DATA140 <=", value, "data140");
            return (Criteria) this;
        }

        public Criteria andData140Like(String value) {
            addCriterion("DATA140 like", value, "data140");
            return (Criteria) this;
        }

        public Criteria andData140NotLike(String value) {
            addCriterion("DATA140 not like", value, "data140");
            return (Criteria) this;
        }

        public Criteria andData140In(List<String> values) {
            addCriterion("DATA140 in", values, "data140");
            return (Criteria) this;
        }

        public Criteria andData140NotIn(List<String> values) {
            addCriterion("DATA140 not in", values, "data140");
            return (Criteria) this;
        }

        public Criteria andData140Between(String value1, String value2) {
            addCriterion("DATA140 between", value1, value2, "data140");
            return (Criteria) this;
        }

        public Criteria andData140NotBetween(String value1, String value2) {
            addCriterion("DATA140 not between", value1, value2, "data140");
            return (Criteria) this;
        }

        public Criteria andData141IsNull() {
            addCriterion("DATA141 is null");
            return (Criteria) this;
        }

        public Criteria andData141IsNotNull() {
            addCriterion("DATA141 is not null");
            return (Criteria) this;
        }

        public Criteria andData141EqualTo(String value) {
            addCriterion("DATA141 =", value, "data141");
            return (Criteria) this;
        }

        public Criteria andData141NotEqualTo(String value) {
            addCriterion("DATA141 <>", value, "data141");
            return (Criteria) this;
        }

        public Criteria andData141GreaterThan(String value) {
            addCriterion("DATA141 >", value, "data141");
            return (Criteria) this;
        }

        public Criteria andData141GreaterThanOrEqualTo(String value) {
            addCriterion("DATA141 >=", value, "data141");
            return (Criteria) this;
        }

        public Criteria andData141LessThan(String value) {
            addCriterion("DATA141 <", value, "data141");
            return (Criteria) this;
        }

        public Criteria andData141LessThanOrEqualTo(String value) {
            addCriterion("DATA141 <=", value, "data141");
            return (Criteria) this;
        }

        public Criteria andData141Like(String value) {
            addCriterion("DATA141 like", value, "data141");
            return (Criteria) this;
        }

        public Criteria andData141NotLike(String value) {
            addCriterion("DATA141 not like", value, "data141");
            return (Criteria) this;
        }

        public Criteria andData141In(List<String> values) {
            addCriterion("DATA141 in", values, "data141");
            return (Criteria) this;
        }

        public Criteria andData141NotIn(List<String> values) {
            addCriterion("DATA141 not in", values, "data141");
            return (Criteria) this;
        }

        public Criteria andData141Between(String value1, String value2) {
            addCriterion("DATA141 between", value1, value2, "data141");
            return (Criteria) this;
        }

        public Criteria andData141NotBetween(String value1, String value2) {
            addCriterion("DATA141 not between", value1, value2, "data141");
            return (Criteria) this;
        }

        public Criteria andData142IsNull() {
            addCriterion("DATA142 is null");
            return (Criteria) this;
        }

        public Criteria andData142IsNotNull() {
            addCriterion("DATA142 is not null");
            return (Criteria) this;
        }

        public Criteria andData142EqualTo(String value) {
            addCriterion("DATA142 =", value, "data142");
            return (Criteria) this;
        }

        public Criteria andData142NotEqualTo(String value) {
            addCriterion("DATA142 <>", value, "data142");
            return (Criteria) this;
        }

        public Criteria andData142GreaterThan(String value) {
            addCriterion("DATA142 >", value, "data142");
            return (Criteria) this;
        }

        public Criteria andData142GreaterThanOrEqualTo(String value) {
            addCriterion("DATA142 >=", value, "data142");
            return (Criteria) this;
        }

        public Criteria andData142LessThan(String value) {
            addCriterion("DATA142 <", value, "data142");
            return (Criteria) this;
        }

        public Criteria andData142LessThanOrEqualTo(String value) {
            addCriterion("DATA142 <=", value, "data142");
            return (Criteria) this;
        }

        public Criteria andData142Like(String value) {
            addCriterion("DATA142 like", value, "data142");
            return (Criteria) this;
        }

        public Criteria andData142NotLike(String value) {
            addCriterion("DATA142 not like", value, "data142");
            return (Criteria) this;
        }

        public Criteria andData142In(List<String> values) {
            addCriterion("DATA142 in", values, "data142");
            return (Criteria) this;
        }

        public Criteria andData142NotIn(List<String> values) {
            addCriterion("DATA142 not in", values, "data142");
            return (Criteria) this;
        }

        public Criteria andData142Between(String value1, String value2) {
            addCriterion("DATA142 between", value1, value2, "data142");
            return (Criteria) this;
        }

        public Criteria andData142NotBetween(String value1, String value2) {
            addCriterion("DATA142 not between", value1, value2, "data142");
            return (Criteria) this;
        }

        public Criteria andData143IsNull() {
            addCriterion("DATA143 is null");
            return (Criteria) this;
        }

        public Criteria andData143IsNotNull() {
            addCriterion("DATA143 is not null");
            return (Criteria) this;
        }

        public Criteria andData143EqualTo(String value) {
            addCriterion("DATA143 =", value, "data143");
            return (Criteria) this;
        }

        public Criteria andData143NotEqualTo(String value) {
            addCriterion("DATA143 <>", value, "data143");
            return (Criteria) this;
        }

        public Criteria andData143GreaterThan(String value) {
            addCriterion("DATA143 >", value, "data143");
            return (Criteria) this;
        }

        public Criteria andData143GreaterThanOrEqualTo(String value) {
            addCriterion("DATA143 >=", value, "data143");
            return (Criteria) this;
        }

        public Criteria andData143LessThan(String value) {
            addCriterion("DATA143 <", value, "data143");
            return (Criteria) this;
        }

        public Criteria andData143LessThanOrEqualTo(String value) {
            addCriterion("DATA143 <=", value, "data143");
            return (Criteria) this;
        }

        public Criteria andData143Like(String value) {
            addCriterion("DATA143 like", value, "data143");
            return (Criteria) this;
        }

        public Criteria andData143NotLike(String value) {
            addCriterion("DATA143 not like", value, "data143");
            return (Criteria) this;
        }

        public Criteria andData143In(List<String> values) {
            addCriterion("DATA143 in", values, "data143");
            return (Criteria) this;
        }

        public Criteria andData143NotIn(List<String> values) {
            addCriterion("DATA143 not in", values, "data143");
            return (Criteria) this;
        }

        public Criteria andData143Between(String value1, String value2) {
            addCriterion("DATA143 between", value1, value2, "data143");
            return (Criteria) this;
        }

        public Criteria andData143NotBetween(String value1, String value2) {
            addCriterion("DATA143 not between", value1, value2, "data143");
            return (Criteria) this;
        }

        public Criteria andData144IsNull() {
            addCriterion("DATA144 is null");
            return (Criteria) this;
        }

        public Criteria andData144IsNotNull() {
            addCriterion("DATA144 is not null");
            return (Criteria) this;
        }

        public Criteria andData144EqualTo(String value) {
            addCriterion("DATA144 =", value, "data144");
            return (Criteria) this;
        }

        public Criteria andData144NotEqualTo(String value) {
            addCriterion("DATA144 <>", value, "data144");
            return (Criteria) this;
        }

        public Criteria andData144GreaterThan(String value) {
            addCriterion("DATA144 >", value, "data144");
            return (Criteria) this;
        }

        public Criteria andData144GreaterThanOrEqualTo(String value) {
            addCriterion("DATA144 >=", value, "data144");
            return (Criteria) this;
        }

        public Criteria andData144LessThan(String value) {
            addCriterion("DATA144 <", value, "data144");
            return (Criteria) this;
        }

        public Criteria andData144LessThanOrEqualTo(String value) {
            addCriterion("DATA144 <=", value, "data144");
            return (Criteria) this;
        }

        public Criteria andData144Like(String value) {
            addCriterion("DATA144 like", value, "data144");
            return (Criteria) this;
        }

        public Criteria andData144NotLike(String value) {
            addCriterion("DATA144 not like", value, "data144");
            return (Criteria) this;
        }

        public Criteria andData144In(List<String> values) {
            addCriterion("DATA144 in", values, "data144");
            return (Criteria) this;
        }

        public Criteria andData144NotIn(List<String> values) {
            addCriterion("DATA144 not in", values, "data144");
            return (Criteria) this;
        }

        public Criteria andData144Between(String value1, String value2) {
            addCriterion("DATA144 between", value1, value2, "data144");
            return (Criteria) this;
        }

        public Criteria andData144NotBetween(String value1, String value2) {
            addCriterion("DATA144 not between", value1, value2, "data144");
            return (Criteria) this;
        }

        public Criteria andData145IsNull() {
            addCriterion("DATA145 is null");
            return (Criteria) this;
        }

        public Criteria andData145IsNotNull() {
            addCriterion("DATA145 is not null");
            return (Criteria) this;
        }

        public Criteria andData145EqualTo(String value) {
            addCriterion("DATA145 =", value, "data145");
            return (Criteria) this;
        }

        public Criteria andData145NotEqualTo(String value) {
            addCriterion("DATA145 <>", value, "data145");
            return (Criteria) this;
        }

        public Criteria andData145GreaterThan(String value) {
            addCriterion("DATA145 >", value, "data145");
            return (Criteria) this;
        }

        public Criteria andData145GreaterThanOrEqualTo(String value) {
            addCriterion("DATA145 >=", value, "data145");
            return (Criteria) this;
        }

        public Criteria andData145LessThan(String value) {
            addCriterion("DATA145 <", value, "data145");
            return (Criteria) this;
        }

        public Criteria andData145LessThanOrEqualTo(String value) {
            addCriterion("DATA145 <=", value, "data145");
            return (Criteria) this;
        }

        public Criteria andData145Like(String value) {
            addCriterion("DATA145 like", value, "data145");
            return (Criteria) this;
        }

        public Criteria andData145NotLike(String value) {
            addCriterion("DATA145 not like", value, "data145");
            return (Criteria) this;
        }

        public Criteria andData145In(List<String> values) {
            addCriterion("DATA145 in", values, "data145");
            return (Criteria) this;
        }

        public Criteria andData145NotIn(List<String> values) {
            addCriterion("DATA145 not in", values, "data145");
            return (Criteria) this;
        }

        public Criteria andData145Between(String value1, String value2) {
            addCriterion("DATA145 between", value1, value2, "data145");
            return (Criteria) this;
        }

        public Criteria andData145NotBetween(String value1, String value2) {
            addCriterion("DATA145 not between", value1, value2, "data145");
            return (Criteria) this;
        }

        public Criteria andData146IsNull() {
            addCriterion("DATA146 is null");
            return (Criteria) this;
        }

        public Criteria andData146IsNotNull() {
            addCriterion("DATA146 is not null");
            return (Criteria) this;
        }

        public Criteria andData146EqualTo(String value) {
            addCriterion("DATA146 =", value, "data146");
            return (Criteria) this;
        }

        public Criteria andData146NotEqualTo(String value) {
            addCriterion("DATA146 <>", value, "data146");
            return (Criteria) this;
        }

        public Criteria andData146GreaterThan(String value) {
            addCriterion("DATA146 >", value, "data146");
            return (Criteria) this;
        }

        public Criteria andData146GreaterThanOrEqualTo(String value) {
            addCriterion("DATA146 >=", value, "data146");
            return (Criteria) this;
        }

        public Criteria andData146LessThan(String value) {
            addCriterion("DATA146 <", value, "data146");
            return (Criteria) this;
        }

        public Criteria andData146LessThanOrEqualTo(String value) {
            addCriterion("DATA146 <=", value, "data146");
            return (Criteria) this;
        }

        public Criteria andData146Like(String value) {
            addCriterion("DATA146 like", value, "data146");
            return (Criteria) this;
        }

        public Criteria andData146NotLike(String value) {
            addCriterion("DATA146 not like", value, "data146");
            return (Criteria) this;
        }

        public Criteria andData146In(List<String> values) {
            addCriterion("DATA146 in", values, "data146");
            return (Criteria) this;
        }

        public Criteria andData146NotIn(List<String> values) {
            addCriterion("DATA146 not in", values, "data146");
            return (Criteria) this;
        }

        public Criteria andData146Between(String value1, String value2) {
            addCriterion("DATA146 between", value1, value2, "data146");
            return (Criteria) this;
        }

        public Criteria andData146NotBetween(String value1, String value2) {
            addCriterion("DATA146 not between", value1, value2, "data146");
            return (Criteria) this;
        }

        public Criteria andData147IsNull() {
            addCriterion("DATA147 is null");
            return (Criteria) this;
        }

        public Criteria andData147IsNotNull() {
            addCriterion("DATA147 is not null");
            return (Criteria) this;
        }

        public Criteria andData147EqualTo(String value) {
            addCriterion("DATA147 =", value, "data147");
            return (Criteria) this;
        }

        public Criteria andData147NotEqualTo(String value) {
            addCriterion("DATA147 <>", value, "data147");
            return (Criteria) this;
        }

        public Criteria andData147GreaterThan(String value) {
            addCriterion("DATA147 >", value, "data147");
            return (Criteria) this;
        }

        public Criteria andData147GreaterThanOrEqualTo(String value) {
            addCriterion("DATA147 >=", value, "data147");
            return (Criteria) this;
        }

        public Criteria andData147LessThan(String value) {
            addCriterion("DATA147 <", value, "data147");
            return (Criteria) this;
        }

        public Criteria andData147LessThanOrEqualTo(String value) {
            addCriterion("DATA147 <=", value, "data147");
            return (Criteria) this;
        }

        public Criteria andData147Like(String value) {
            addCriterion("DATA147 like", value, "data147");
            return (Criteria) this;
        }

        public Criteria andData147NotLike(String value) {
            addCriterion("DATA147 not like", value, "data147");
            return (Criteria) this;
        }

        public Criteria andData147In(List<String> values) {
            addCriterion("DATA147 in", values, "data147");
            return (Criteria) this;
        }

        public Criteria andData147NotIn(List<String> values) {
            addCriterion("DATA147 not in", values, "data147");
            return (Criteria) this;
        }

        public Criteria andData147Between(String value1, String value2) {
            addCriterion("DATA147 between", value1, value2, "data147");
            return (Criteria) this;
        }

        public Criteria andData147NotBetween(String value1, String value2) {
            addCriterion("DATA147 not between", value1, value2, "data147");
            return (Criteria) this;
        }

        public Criteria andData148IsNull() {
            addCriterion("DATA148 is null");
            return (Criteria) this;
        }

        public Criteria andData148IsNotNull() {
            addCriterion("DATA148 is not null");
            return (Criteria) this;
        }

        public Criteria andData148EqualTo(String value) {
            addCriterion("DATA148 =", value, "data148");
            return (Criteria) this;
        }

        public Criteria andData148NotEqualTo(String value) {
            addCriterion("DATA148 <>", value, "data148");
            return (Criteria) this;
        }

        public Criteria andData148GreaterThan(String value) {
            addCriterion("DATA148 >", value, "data148");
            return (Criteria) this;
        }

        public Criteria andData148GreaterThanOrEqualTo(String value) {
            addCriterion("DATA148 >=", value, "data148");
            return (Criteria) this;
        }

        public Criteria andData148LessThan(String value) {
            addCriterion("DATA148 <", value, "data148");
            return (Criteria) this;
        }

        public Criteria andData148LessThanOrEqualTo(String value) {
            addCriterion("DATA148 <=", value, "data148");
            return (Criteria) this;
        }

        public Criteria andData148Like(String value) {
            addCriterion("DATA148 like", value, "data148");
            return (Criteria) this;
        }

        public Criteria andData148NotLike(String value) {
            addCriterion("DATA148 not like", value, "data148");
            return (Criteria) this;
        }

        public Criteria andData148In(List<String> values) {
            addCriterion("DATA148 in", values, "data148");
            return (Criteria) this;
        }

        public Criteria andData148NotIn(List<String> values) {
            addCriterion("DATA148 not in", values, "data148");
            return (Criteria) this;
        }

        public Criteria andData148Between(String value1, String value2) {
            addCriterion("DATA148 between", value1, value2, "data148");
            return (Criteria) this;
        }

        public Criteria andData148NotBetween(String value1, String value2) {
            addCriterion("DATA148 not between", value1, value2, "data148");
            return (Criteria) this;
        }

        public Criteria andData149IsNull() {
            addCriterion("DATA149 is null");
            return (Criteria) this;
        }

        public Criteria andData149IsNotNull() {
            addCriterion("DATA149 is not null");
            return (Criteria) this;
        }

        public Criteria andData149EqualTo(String value) {
            addCriterion("DATA149 =", value, "data149");
            return (Criteria) this;
        }

        public Criteria andData149NotEqualTo(String value) {
            addCriterion("DATA149 <>", value, "data149");
            return (Criteria) this;
        }

        public Criteria andData149GreaterThan(String value) {
            addCriterion("DATA149 >", value, "data149");
            return (Criteria) this;
        }

        public Criteria andData149GreaterThanOrEqualTo(String value) {
            addCriterion("DATA149 >=", value, "data149");
            return (Criteria) this;
        }

        public Criteria andData149LessThan(String value) {
            addCriterion("DATA149 <", value, "data149");
            return (Criteria) this;
        }

        public Criteria andData149LessThanOrEqualTo(String value) {
            addCriterion("DATA149 <=", value, "data149");
            return (Criteria) this;
        }

        public Criteria andData149Like(String value) {
            addCriterion("DATA149 like", value, "data149");
            return (Criteria) this;
        }

        public Criteria andData149NotLike(String value) {
            addCriterion("DATA149 not like", value, "data149");
            return (Criteria) this;
        }

        public Criteria andData149In(List<String> values) {
            addCriterion("DATA149 in", values, "data149");
            return (Criteria) this;
        }

        public Criteria andData149NotIn(List<String> values) {
            addCriterion("DATA149 not in", values, "data149");
            return (Criteria) this;
        }

        public Criteria andData149Between(String value1, String value2) {
            addCriterion("DATA149 between", value1, value2, "data149");
            return (Criteria) this;
        }

        public Criteria andData149NotBetween(String value1, String value2) {
            addCriterion("DATA149 not between", value1, value2, "data149");
            return (Criteria) this;
        }

        public Criteria andData150IsNull() {
            addCriterion("DATA150 is null");
            return (Criteria) this;
        }

        public Criteria andData150IsNotNull() {
            addCriterion("DATA150 is not null");
            return (Criteria) this;
        }

        public Criteria andData150EqualTo(String value) {
            addCriterion("DATA150 =", value, "data150");
            return (Criteria) this;
        }

        public Criteria andData150NotEqualTo(String value) {
            addCriterion("DATA150 <>", value, "data150");
            return (Criteria) this;
        }

        public Criteria andData150GreaterThan(String value) {
            addCriterion("DATA150 >", value, "data150");
            return (Criteria) this;
        }

        public Criteria andData150GreaterThanOrEqualTo(String value) {
            addCriterion("DATA150 >=", value, "data150");
            return (Criteria) this;
        }

        public Criteria andData150LessThan(String value) {
            addCriterion("DATA150 <", value, "data150");
            return (Criteria) this;
        }

        public Criteria andData150LessThanOrEqualTo(String value) {
            addCriterion("DATA150 <=", value, "data150");
            return (Criteria) this;
        }

        public Criteria andData150Like(String value) {
            addCriterion("DATA150 like", value, "data150");
            return (Criteria) this;
        }

        public Criteria andData150NotLike(String value) {
            addCriterion("DATA150 not like", value, "data150");
            return (Criteria) this;
        }

        public Criteria andData150In(List<String> values) {
            addCriterion("DATA150 in", values, "data150");
            return (Criteria) this;
        }

        public Criteria andData150NotIn(List<String> values) {
            addCriterion("DATA150 not in", values, "data150");
            return (Criteria) this;
        }

        public Criteria andData150Between(String value1, String value2) {
            addCriterion("DATA150 between", value1, value2, "data150");
            return (Criteria) this;
        }

        public Criteria andData150NotBetween(String value1, String value2) {
            addCriterion("DATA150 not between", value1, value2, "data150");
            return (Criteria) this;
        }

        public Criteria andData151IsNull() {
            addCriterion("DATA151 is null");
            return (Criteria) this;
        }

        public Criteria andData151IsNotNull() {
            addCriterion("DATA151 is not null");
            return (Criteria) this;
        }

        public Criteria andData151EqualTo(String value) {
            addCriterion("DATA151 =", value, "data151");
            return (Criteria) this;
        }

        public Criteria andData151NotEqualTo(String value) {
            addCriterion("DATA151 <>", value, "data151");
            return (Criteria) this;
        }

        public Criteria andData151GreaterThan(String value) {
            addCriterion("DATA151 >", value, "data151");
            return (Criteria) this;
        }

        public Criteria andData151GreaterThanOrEqualTo(String value) {
            addCriterion("DATA151 >=", value, "data151");
            return (Criteria) this;
        }

        public Criteria andData151LessThan(String value) {
            addCriterion("DATA151 <", value, "data151");
            return (Criteria) this;
        }

        public Criteria andData151LessThanOrEqualTo(String value) {
            addCriterion("DATA151 <=", value, "data151");
            return (Criteria) this;
        }

        public Criteria andData151Like(String value) {
            addCriterion("DATA151 like", value, "data151");
            return (Criteria) this;
        }

        public Criteria andData151NotLike(String value) {
            addCriterion("DATA151 not like", value, "data151");
            return (Criteria) this;
        }

        public Criteria andData151In(List<String> values) {
            addCriterion("DATA151 in", values, "data151");
            return (Criteria) this;
        }

        public Criteria andData151NotIn(List<String> values) {
            addCriterion("DATA151 not in", values, "data151");
            return (Criteria) this;
        }

        public Criteria andData151Between(String value1, String value2) {
            addCriterion("DATA151 between", value1, value2, "data151");
            return (Criteria) this;
        }

        public Criteria andData151NotBetween(String value1, String value2) {
            addCriterion("DATA151 not between", value1, value2, "data151");
            return (Criteria) this;
        }

        public Criteria andData152IsNull() {
            addCriterion("DATA152 is null");
            return (Criteria) this;
        }

        public Criteria andData152IsNotNull() {
            addCriterion("DATA152 is not null");
            return (Criteria) this;
        }

        public Criteria andData152EqualTo(String value) {
            addCriterion("DATA152 =", value, "data152");
            return (Criteria) this;
        }

        public Criteria andData152NotEqualTo(String value) {
            addCriterion("DATA152 <>", value, "data152");
            return (Criteria) this;
        }

        public Criteria andData152GreaterThan(String value) {
            addCriterion("DATA152 >", value, "data152");
            return (Criteria) this;
        }

        public Criteria andData152GreaterThanOrEqualTo(String value) {
            addCriterion("DATA152 >=", value, "data152");
            return (Criteria) this;
        }

        public Criteria andData152LessThan(String value) {
            addCriterion("DATA152 <", value, "data152");
            return (Criteria) this;
        }

        public Criteria andData152LessThanOrEqualTo(String value) {
            addCriterion("DATA152 <=", value, "data152");
            return (Criteria) this;
        }

        public Criteria andData152Like(String value) {
            addCriterion("DATA152 like", value, "data152");
            return (Criteria) this;
        }

        public Criteria andData152NotLike(String value) {
            addCriterion("DATA152 not like", value, "data152");
            return (Criteria) this;
        }

        public Criteria andData152In(List<String> values) {
            addCriterion("DATA152 in", values, "data152");
            return (Criteria) this;
        }

        public Criteria andData152NotIn(List<String> values) {
            addCriterion("DATA152 not in", values, "data152");
            return (Criteria) this;
        }

        public Criteria andData152Between(String value1, String value2) {
            addCriterion("DATA152 between", value1, value2, "data152");
            return (Criteria) this;
        }

        public Criteria andData152NotBetween(String value1, String value2) {
            addCriterion("DATA152 not between", value1, value2, "data152");
            return (Criteria) this;
        }

        public Criteria andData153IsNull() {
            addCriterion("DATA153 is null");
            return (Criteria) this;
        }

        public Criteria andData153IsNotNull() {
            addCriterion("DATA153 is not null");
            return (Criteria) this;
        }

        public Criteria andData153EqualTo(String value) {
            addCriterion("DATA153 =", value, "data153");
            return (Criteria) this;
        }

        public Criteria andData153NotEqualTo(String value) {
            addCriterion("DATA153 <>", value, "data153");
            return (Criteria) this;
        }

        public Criteria andData153GreaterThan(String value) {
            addCriterion("DATA153 >", value, "data153");
            return (Criteria) this;
        }

        public Criteria andData153GreaterThanOrEqualTo(String value) {
            addCriterion("DATA153 >=", value, "data153");
            return (Criteria) this;
        }

        public Criteria andData153LessThan(String value) {
            addCriterion("DATA153 <", value, "data153");
            return (Criteria) this;
        }

        public Criteria andData153LessThanOrEqualTo(String value) {
            addCriterion("DATA153 <=", value, "data153");
            return (Criteria) this;
        }

        public Criteria andData153Like(String value) {
            addCriterion("DATA153 like", value, "data153");
            return (Criteria) this;
        }

        public Criteria andData153NotLike(String value) {
            addCriterion("DATA153 not like", value, "data153");
            return (Criteria) this;
        }

        public Criteria andData153In(List<String> values) {
            addCriterion("DATA153 in", values, "data153");
            return (Criteria) this;
        }

        public Criteria andData153NotIn(List<String> values) {
            addCriterion("DATA153 not in", values, "data153");
            return (Criteria) this;
        }

        public Criteria andData153Between(String value1, String value2) {
            addCriterion("DATA153 between", value1, value2, "data153");
            return (Criteria) this;
        }

        public Criteria andData153NotBetween(String value1, String value2) {
            addCriterion("DATA153 not between", value1, value2, "data153");
            return (Criteria) this;
        }

        public Criteria andData154IsNull() {
            addCriterion("DATA154 is null");
            return (Criteria) this;
        }

        public Criteria andData154IsNotNull() {
            addCriterion("DATA154 is not null");
            return (Criteria) this;
        }

        public Criteria andData154EqualTo(String value) {
            addCriterion("DATA154 =", value, "data154");
            return (Criteria) this;
        }

        public Criteria andData154NotEqualTo(String value) {
            addCriterion("DATA154 <>", value, "data154");
            return (Criteria) this;
        }

        public Criteria andData154GreaterThan(String value) {
            addCriterion("DATA154 >", value, "data154");
            return (Criteria) this;
        }

        public Criteria andData154GreaterThanOrEqualTo(String value) {
            addCriterion("DATA154 >=", value, "data154");
            return (Criteria) this;
        }

        public Criteria andData154LessThan(String value) {
            addCriterion("DATA154 <", value, "data154");
            return (Criteria) this;
        }

        public Criteria andData154LessThanOrEqualTo(String value) {
            addCriterion("DATA154 <=", value, "data154");
            return (Criteria) this;
        }

        public Criteria andData154Like(String value) {
            addCriterion("DATA154 like", value, "data154");
            return (Criteria) this;
        }

        public Criteria andData154NotLike(String value) {
            addCriterion("DATA154 not like", value, "data154");
            return (Criteria) this;
        }

        public Criteria andData154In(List<String> values) {
            addCriterion("DATA154 in", values, "data154");
            return (Criteria) this;
        }

        public Criteria andData154NotIn(List<String> values) {
            addCriterion("DATA154 not in", values, "data154");
            return (Criteria) this;
        }

        public Criteria andData154Between(String value1, String value2) {
            addCriterion("DATA154 between", value1, value2, "data154");
            return (Criteria) this;
        }

        public Criteria andData154NotBetween(String value1, String value2) {
            addCriterion("DATA154 not between", value1, value2, "data154");
            return (Criteria) this;
        }

        public Criteria andData155IsNull() {
            addCriterion("DATA155 is null");
            return (Criteria) this;
        }

        public Criteria andData155IsNotNull() {
            addCriterion("DATA155 is not null");
            return (Criteria) this;
        }

        public Criteria andData155EqualTo(String value) {
            addCriterion("DATA155 =", value, "data155");
            return (Criteria) this;
        }

        public Criteria andData155NotEqualTo(String value) {
            addCriterion("DATA155 <>", value, "data155");
            return (Criteria) this;
        }

        public Criteria andData155GreaterThan(String value) {
            addCriterion("DATA155 >", value, "data155");
            return (Criteria) this;
        }

        public Criteria andData155GreaterThanOrEqualTo(String value) {
            addCriterion("DATA155 >=", value, "data155");
            return (Criteria) this;
        }

        public Criteria andData155LessThan(String value) {
            addCriterion("DATA155 <", value, "data155");
            return (Criteria) this;
        }

        public Criteria andData155LessThanOrEqualTo(String value) {
            addCriterion("DATA155 <=", value, "data155");
            return (Criteria) this;
        }

        public Criteria andData155Like(String value) {
            addCriterion("DATA155 like", value, "data155");
            return (Criteria) this;
        }

        public Criteria andData155NotLike(String value) {
            addCriterion("DATA155 not like", value, "data155");
            return (Criteria) this;
        }

        public Criteria andData155In(List<String> values) {
            addCriterion("DATA155 in", values, "data155");
            return (Criteria) this;
        }

        public Criteria andData155NotIn(List<String> values) {
            addCriterion("DATA155 not in", values, "data155");
            return (Criteria) this;
        }

        public Criteria andData155Between(String value1, String value2) {
            addCriterion("DATA155 between", value1, value2, "data155");
            return (Criteria) this;
        }

        public Criteria andData155NotBetween(String value1, String value2) {
            addCriterion("DATA155 not between", value1, value2, "data155");
            return (Criteria) this;
        }

        public Criteria andData156IsNull() {
            addCriterion("DATA156 is null");
            return (Criteria) this;
        }

        public Criteria andData156IsNotNull() {
            addCriterion("DATA156 is not null");
            return (Criteria) this;
        }

        public Criteria andData156EqualTo(String value) {
            addCriterion("DATA156 =", value, "data156");
            return (Criteria) this;
        }

        public Criteria andData156NotEqualTo(String value) {
            addCriterion("DATA156 <>", value, "data156");
            return (Criteria) this;
        }

        public Criteria andData156GreaterThan(String value) {
            addCriterion("DATA156 >", value, "data156");
            return (Criteria) this;
        }

        public Criteria andData156GreaterThanOrEqualTo(String value) {
            addCriterion("DATA156 >=", value, "data156");
            return (Criteria) this;
        }

        public Criteria andData156LessThan(String value) {
            addCriterion("DATA156 <", value, "data156");
            return (Criteria) this;
        }

        public Criteria andData156LessThanOrEqualTo(String value) {
            addCriterion("DATA156 <=", value, "data156");
            return (Criteria) this;
        }

        public Criteria andData156Like(String value) {
            addCriterion("DATA156 like", value, "data156");
            return (Criteria) this;
        }

        public Criteria andData156NotLike(String value) {
            addCriterion("DATA156 not like", value, "data156");
            return (Criteria) this;
        }

        public Criteria andData156In(List<String> values) {
            addCriterion("DATA156 in", values, "data156");
            return (Criteria) this;
        }

        public Criteria andData156NotIn(List<String> values) {
            addCriterion("DATA156 not in", values, "data156");
            return (Criteria) this;
        }

        public Criteria andData156Between(String value1, String value2) {
            addCriterion("DATA156 between", value1, value2, "data156");
            return (Criteria) this;
        }

        public Criteria andData156NotBetween(String value1, String value2) {
            addCriterion("DATA156 not between", value1, value2, "data156");
            return (Criteria) this;
        }

        public Criteria andData157IsNull() {
            addCriterion("DATA157 is null");
            return (Criteria) this;
        }

        public Criteria andData157IsNotNull() {
            addCriterion("DATA157 is not null");
            return (Criteria) this;
        }

        public Criteria andData157EqualTo(String value) {
            addCriterion("DATA157 =", value, "data157");
            return (Criteria) this;
        }

        public Criteria andData157NotEqualTo(String value) {
            addCriterion("DATA157 <>", value, "data157");
            return (Criteria) this;
        }

        public Criteria andData157GreaterThan(String value) {
            addCriterion("DATA157 >", value, "data157");
            return (Criteria) this;
        }

        public Criteria andData157GreaterThanOrEqualTo(String value) {
            addCriterion("DATA157 >=", value, "data157");
            return (Criteria) this;
        }

        public Criteria andData157LessThan(String value) {
            addCriterion("DATA157 <", value, "data157");
            return (Criteria) this;
        }

        public Criteria andData157LessThanOrEqualTo(String value) {
            addCriterion("DATA157 <=", value, "data157");
            return (Criteria) this;
        }

        public Criteria andData157Like(String value) {
            addCriterion("DATA157 like", value, "data157");
            return (Criteria) this;
        }

        public Criteria andData157NotLike(String value) {
            addCriterion("DATA157 not like", value, "data157");
            return (Criteria) this;
        }

        public Criteria andData157In(List<String> values) {
            addCriterion("DATA157 in", values, "data157");
            return (Criteria) this;
        }

        public Criteria andData157NotIn(List<String> values) {
            addCriterion("DATA157 not in", values, "data157");
            return (Criteria) this;
        }

        public Criteria andData157Between(String value1, String value2) {
            addCriterion("DATA157 between", value1, value2, "data157");
            return (Criteria) this;
        }

        public Criteria andData157NotBetween(String value1, String value2) {
            addCriterion("DATA157 not between", value1, value2, "data157");
            return (Criteria) this;
        }

        public Criteria andData158IsNull() {
            addCriterion("DATA158 is null");
            return (Criteria) this;
        }

        public Criteria andData158IsNotNull() {
            addCriterion("DATA158 is not null");
            return (Criteria) this;
        }

        public Criteria andData158EqualTo(String value) {
            addCriterion("DATA158 =", value, "data158");
            return (Criteria) this;
        }

        public Criteria andData158NotEqualTo(String value) {
            addCriterion("DATA158 <>", value, "data158");
            return (Criteria) this;
        }

        public Criteria andData158GreaterThan(String value) {
            addCriterion("DATA158 >", value, "data158");
            return (Criteria) this;
        }

        public Criteria andData158GreaterThanOrEqualTo(String value) {
            addCriterion("DATA158 >=", value, "data158");
            return (Criteria) this;
        }

        public Criteria andData158LessThan(String value) {
            addCriterion("DATA158 <", value, "data158");
            return (Criteria) this;
        }

        public Criteria andData158LessThanOrEqualTo(String value) {
            addCriterion("DATA158 <=", value, "data158");
            return (Criteria) this;
        }

        public Criteria andData158Like(String value) {
            addCriterion("DATA158 like", value, "data158");
            return (Criteria) this;
        }

        public Criteria andData158NotLike(String value) {
            addCriterion("DATA158 not like", value, "data158");
            return (Criteria) this;
        }

        public Criteria andData158In(List<String> values) {
            addCriterion("DATA158 in", values, "data158");
            return (Criteria) this;
        }

        public Criteria andData158NotIn(List<String> values) {
            addCriterion("DATA158 not in", values, "data158");
            return (Criteria) this;
        }

        public Criteria andData158Between(String value1, String value2) {
            addCriterion("DATA158 between", value1, value2, "data158");
            return (Criteria) this;
        }

        public Criteria andData158NotBetween(String value1, String value2) {
            addCriterion("DATA158 not between", value1, value2, "data158");
            return (Criteria) this;
        }

        public Criteria andData159IsNull() {
            addCriterion("DATA159 is null");
            return (Criteria) this;
        }

        public Criteria andData159IsNotNull() {
            addCriterion("DATA159 is not null");
            return (Criteria) this;
        }

        public Criteria andData159EqualTo(String value) {
            addCriterion("DATA159 =", value, "data159");
            return (Criteria) this;
        }

        public Criteria andData159NotEqualTo(String value) {
            addCriterion("DATA159 <>", value, "data159");
            return (Criteria) this;
        }

        public Criteria andData159GreaterThan(String value) {
            addCriterion("DATA159 >", value, "data159");
            return (Criteria) this;
        }

        public Criteria andData159GreaterThanOrEqualTo(String value) {
            addCriterion("DATA159 >=", value, "data159");
            return (Criteria) this;
        }

        public Criteria andData159LessThan(String value) {
            addCriterion("DATA159 <", value, "data159");
            return (Criteria) this;
        }

        public Criteria andData159LessThanOrEqualTo(String value) {
            addCriterion("DATA159 <=", value, "data159");
            return (Criteria) this;
        }

        public Criteria andData159Like(String value) {
            addCriterion("DATA159 like", value, "data159");
            return (Criteria) this;
        }

        public Criteria andData159NotLike(String value) {
            addCriterion("DATA159 not like", value, "data159");
            return (Criteria) this;
        }

        public Criteria andData159In(List<String> values) {
            addCriterion("DATA159 in", values, "data159");
            return (Criteria) this;
        }

        public Criteria andData159NotIn(List<String> values) {
            addCriterion("DATA159 not in", values, "data159");
            return (Criteria) this;
        }

        public Criteria andData159Between(String value1, String value2) {
            addCriterion("DATA159 between", value1, value2, "data159");
            return (Criteria) this;
        }

        public Criteria andData159NotBetween(String value1, String value2) {
            addCriterion("DATA159 not between", value1, value2, "data159");
            return (Criteria) this;
        }

        public Criteria andData160IsNull() {
            addCriterion("DATA160 is null");
            return (Criteria) this;
        }

        public Criteria andData160IsNotNull() {
            addCriterion("DATA160 is not null");
            return (Criteria) this;
        }

        public Criteria andData160EqualTo(String value) {
            addCriterion("DATA160 =", value, "data160");
            return (Criteria) this;
        }

        public Criteria andData160NotEqualTo(String value) {
            addCriterion("DATA160 <>", value, "data160");
            return (Criteria) this;
        }

        public Criteria andData160GreaterThan(String value) {
            addCriterion("DATA160 >", value, "data160");
            return (Criteria) this;
        }

        public Criteria andData160GreaterThanOrEqualTo(String value) {
            addCriterion("DATA160 >=", value, "data160");
            return (Criteria) this;
        }

        public Criteria andData160LessThan(String value) {
            addCriterion("DATA160 <", value, "data160");
            return (Criteria) this;
        }

        public Criteria andData160LessThanOrEqualTo(String value) {
            addCriterion("DATA160 <=", value, "data160");
            return (Criteria) this;
        }

        public Criteria andData160Like(String value) {
            addCriterion("DATA160 like", value, "data160");
            return (Criteria) this;
        }

        public Criteria andData160NotLike(String value) {
            addCriterion("DATA160 not like", value, "data160");
            return (Criteria) this;
        }

        public Criteria andData160In(List<String> values) {
            addCriterion("DATA160 in", values, "data160");
            return (Criteria) this;
        }

        public Criteria andData160NotIn(List<String> values) {
            addCriterion("DATA160 not in", values, "data160");
            return (Criteria) this;
        }

        public Criteria andData160Between(String value1, String value2) {
            addCriterion("DATA160 between", value1, value2, "data160");
            return (Criteria) this;
        }

        public Criteria andData160NotBetween(String value1, String value2) {
            addCriterion("DATA160 not between", value1, value2, "data160");
            return (Criteria) this;
        }

        public Criteria andData161IsNull() {
            addCriterion("DATA161 is null");
            return (Criteria) this;
        }

        public Criteria andData161IsNotNull() {
            addCriterion("DATA161 is not null");
            return (Criteria) this;
        }

        public Criteria andData161EqualTo(String value) {
            addCriterion("DATA161 =", value, "data161");
            return (Criteria) this;
        }

        public Criteria andData161NotEqualTo(String value) {
            addCriterion("DATA161 <>", value, "data161");
            return (Criteria) this;
        }

        public Criteria andData161GreaterThan(String value) {
            addCriterion("DATA161 >", value, "data161");
            return (Criteria) this;
        }

        public Criteria andData161GreaterThanOrEqualTo(String value) {
            addCriterion("DATA161 >=", value, "data161");
            return (Criteria) this;
        }

        public Criteria andData161LessThan(String value) {
            addCriterion("DATA161 <", value, "data161");
            return (Criteria) this;
        }

        public Criteria andData161LessThanOrEqualTo(String value) {
            addCriterion("DATA161 <=", value, "data161");
            return (Criteria) this;
        }

        public Criteria andData161Like(String value) {
            addCriterion("DATA161 like", value, "data161");
            return (Criteria) this;
        }

        public Criteria andData161NotLike(String value) {
            addCriterion("DATA161 not like", value, "data161");
            return (Criteria) this;
        }

        public Criteria andData161In(List<String> values) {
            addCriterion("DATA161 in", values, "data161");
            return (Criteria) this;
        }

        public Criteria andData161NotIn(List<String> values) {
            addCriterion("DATA161 not in", values, "data161");
            return (Criteria) this;
        }

        public Criteria andData161Between(String value1, String value2) {
            addCriterion("DATA161 between", value1, value2, "data161");
            return (Criteria) this;
        }

        public Criteria andData161NotBetween(String value1, String value2) {
            addCriterion("DATA161 not between", value1, value2, "data161");
            return (Criteria) this;
        }

        public Criteria andData162IsNull() {
            addCriterion("DATA162 is null");
            return (Criteria) this;
        }

        public Criteria andData162IsNotNull() {
            addCriterion("DATA162 is not null");
            return (Criteria) this;
        }

        public Criteria andData162EqualTo(String value) {
            addCriterion("DATA162 =", value, "data162");
            return (Criteria) this;
        }

        public Criteria andData162NotEqualTo(String value) {
            addCriterion("DATA162 <>", value, "data162");
            return (Criteria) this;
        }

        public Criteria andData162GreaterThan(String value) {
            addCriterion("DATA162 >", value, "data162");
            return (Criteria) this;
        }

        public Criteria andData162GreaterThanOrEqualTo(String value) {
            addCriterion("DATA162 >=", value, "data162");
            return (Criteria) this;
        }

        public Criteria andData162LessThan(String value) {
            addCriterion("DATA162 <", value, "data162");
            return (Criteria) this;
        }

        public Criteria andData162LessThanOrEqualTo(String value) {
            addCriterion("DATA162 <=", value, "data162");
            return (Criteria) this;
        }

        public Criteria andData162Like(String value) {
            addCriterion("DATA162 like", value, "data162");
            return (Criteria) this;
        }

        public Criteria andData162NotLike(String value) {
            addCriterion("DATA162 not like", value, "data162");
            return (Criteria) this;
        }

        public Criteria andData162In(List<String> values) {
            addCriterion("DATA162 in", values, "data162");
            return (Criteria) this;
        }

        public Criteria andData162NotIn(List<String> values) {
            addCriterion("DATA162 not in", values, "data162");
            return (Criteria) this;
        }

        public Criteria andData162Between(String value1, String value2) {
            addCriterion("DATA162 between", value1, value2, "data162");
            return (Criteria) this;
        }

        public Criteria andData162NotBetween(String value1, String value2) {
            addCriterion("DATA162 not between", value1, value2, "data162");
            return (Criteria) this;
        }

        public Criteria andData163IsNull() {
            addCriterion("DATA163 is null");
            return (Criteria) this;
        }

        public Criteria andData163IsNotNull() {
            addCriterion("DATA163 is not null");
            return (Criteria) this;
        }

        public Criteria andData163EqualTo(String value) {
            addCriterion("DATA163 =", value, "data163");
            return (Criteria) this;
        }

        public Criteria andData163NotEqualTo(String value) {
            addCriterion("DATA163 <>", value, "data163");
            return (Criteria) this;
        }

        public Criteria andData163GreaterThan(String value) {
            addCriterion("DATA163 >", value, "data163");
            return (Criteria) this;
        }

        public Criteria andData163GreaterThanOrEqualTo(String value) {
            addCriterion("DATA163 >=", value, "data163");
            return (Criteria) this;
        }

        public Criteria andData163LessThan(String value) {
            addCriterion("DATA163 <", value, "data163");
            return (Criteria) this;
        }

        public Criteria andData163LessThanOrEqualTo(String value) {
            addCriterion("DATA163 <=", value, "data163");
            return (Criteria) this;
        }

        public Criteria andData163Like(String value) {
            addCriterion("DATA163 like", value, "data163");
            return (Criteria) this;
        }

        public Criteria andData163NotLike(String value) {
            addCriterion("DATA163 not like", value, "data163");
            return (Criteria) this;
        }

        public Criteria andData163In(List<String> values) {
            addCriterion("DATA163 in", values, "data163");
            return (Criteria) this;
        }

        public Criteria andData163NotIn(List<String> values) {
            addCriterion("DATA163 not in", values, "data163");
            return (Criteria) this;
        }

        public Criteria andData163Between(String value1, String value2) {
            addCriterion("DATA163 between", value1, value2, "data163");
            return (Criteria) this;
        }

        public Criteria andData163NotBetween(String value1, String value2) {
            addCriterion("DATA163 not between", value1, value2, "data163");
            return (Criteria) this;
        }

        public Criteria andData164IsNull() {
            addCriterion("DATA164 is null");
            return (Criteria) this;
        }

        public Criteria andData164IsNotNull() {
            addCriterion("DATA164 is not null");
            return (Criteria) this;
        }

        public Criteria andData164EqualTo(String value) {
            addCriterion("DATA164 =", value, "data164");
            return (Criteria) this;
        }

        public Criteria andData164NotEqualTo(String value) {
            addCriterion("DATA164 <>", value, "data164");
            return (Criteria) this;
        }

        public Criteria andData164GreaterThan(String value) {
            addCriterion("DATA164 >", value, "data164");
            return (Criteria) this;
        }

        public Criteria andData164GreaterThanOrEqualTo(String value) {
            addCriterion("DATA164 >=", value, "data164");
            return (Criteria) this;
        }

        public Criteria andData164LessThan(String value) {
            addCriterion("DATA164 <", value, "data164");
            return (Criteria) this;
        }

        public Criteria andData164LessThanOrEqualTo(String value) {
            addCriterion("DATA164 <=", value, "data164");
            return (Criteria) this;
        }

        public Criteria andData164Like(String value) {
            addCriterion("DATA164 like", value, "data164");
            return (Criteria) this;
        }

        public Criteria andData164NotLike(String value) {
            addCriterion("DATA164 not like", value, "data164");
            return (Criteria) this;
        }

        public Criteria andData164In(List<String> values) {
            addCriterion("DATA164 in", values, "data164");
            return (Criteria) this;
        }

        public Criteria andData164NotIn(List<String> values) {
            addCriterion("DATA164 not in", values, "data164");
            return (Criteria) this;
        }

        public Criteria andData164Between(String value1, String value2) {
            addCriterion("DATA164 between", value1, value2, "data164");
            return (Criteria) this;
        }

        public Criteria andData164NotBetween(String value1, String value2) {
            addCriterion("DATA164 not between", value1, value2, "data164");
            return (Criteria) this;
        }

        public Criteria andData165IsNull() {
            addCriterion("DATA165 is null");
            return (Criteria) this;
        }

        public Criteria andData165IsNotNull() {
            addCriterion("DATA165 is not null");
            return (Criteria) this;
        }

        public Criteria andData165EqualTo(String value) {
            addCriterion("DATA165 =", value, "data165");
            return (Criteria) this;
        }

        public Criteria andData165NotEqualTo(String value) {
            addCriterion("DATA165 <>", value, "data165");
            return (Criteria) this;
        }

        public Criteria andData165GreaterThan(String value) {
            addCriterion("DATA165 >", value, "data165");
            return (Criteria) this;
        }

        public Criteria andData165GreaterThanOrEqualTo(String value) {
            addCriterion("DATA165 >=", value, "data165");
            return (Criteria) this;
        }

        public Criteria andData165LessThan(String value) {
            addCriterion("DATA165 <", value, "data165");
            return (Criteria) this;
        }

        public Criteria andData165LessThanOrEqualTo(String value) {
            addCriterion("DATA165 <=", value, "data165");
            return (Criteria) this;
        }

        public Criteria andData165Like(String value) {
            addCriterion("DATA165 like", value, "data165");
            return (Criteria) this;
        }

        public Criteria andData165NotLike(String value) {
            addCriterion("DATA165 not like", value, "data165");
            return (Criteria) this;
        }

        public Criteria andData165In(List<String> values) {
            addCriterion("DATA165 in", values, "data165");
            return (Criteria) this;
        }

        public Criteria andData165NotIn(List<String> values) {
            addCriterion("DATA165 not in", values, "data165");
            return (Criteria) this;
        }

        public Criteria andData165Between(String value1, String value2) {
            addCriterion("DATA165 between", value1, value2, "data165");
            return (Criteria) this;
        }

        public Criteria andData165NotBetween(String value1, String value2) {
            addCriterion("DATA165 not between", value1, value2, "data165");
            return (Criteria) this;
        }

        public Criteria andData166IsNull() {
            addCriterion("DATA166 is null");
            return (Criteria) this;
        }

        public Criteria andData166IsNotNull() {
            addCriterion("DATA166 is not null");
            return (Criteria) this;
        }

        public Criteria andData166EqualTo(String value) {
            addCriterion("DATA166 =", value, "data166");
            return (Criteria) this;
        }

        public Criteria andData166NotEqualTo(String value) {
            addCriterion("DATA166 <>", value, "data166");
            return (Criteria) this;
        }

        public Criteria andData166GreaterThan(String value) {
            addCriterion("DATA166 >", value, "data166");
            return (Criteria) this;
        }

        public Criteria andData166GreaterThanOrEqualTo(String value) {
            addCriterion("DATA166 >=", value, "data166");
            return (Criteria) this;
        }

        public Criteria andData166LessThan(String value) {
            addCriterion("DATA166 <", value, "data166");
            return (Criteria) this;
        }

        public Criteria andData166LessThanOrEqualTo(String value) {
            addCriterion("DATA166 <=", value, "data166");
            return (Criteria) this;
        }

        public Criteria andData166Like(String value) {
            addCriterion("DATA166 like", value, "data166");
            return (Criteria) this;
        }

        public Criteria andData166NotLike(String value) {
            addCriterion("DATA166 not like", value, "data166");
            return (Criteria) this;
        }

        public Criteria andData166In(List<String> values) {
            addCriterion("DATA166 in", values, "data166");
            return (Criteria) this;
        }

        public Criteria andData166NotIn(List<String> values) {
            addCriterion("DATA166 not in", values, "data166");
            return (Criteria) this;
        }

        public Criteria andData166Between(String value1, String value2) {
            addCriterion("DATA166 between", value1, value2, "data166");
            return (Criteria) this;
        }

        public Criteria andData166NotBetween(String value1, String value2) {
            addCriterion("DATA166 not between", value1, value2, "data166");
            return (Criteria) this;
        }

        public Criteria andData167IsNull() {
            addCriterion("DATA167 is null");
            return (Criteria) this;
        }

        public Criteria andData167IsNotNull() {
            addCriterion("DATA167 is not null");
            return (Criteria) this;
        }

        public Criteria andData167EqualTo(String value) {
            addCriterion("DATA167 =", value, "data167");
            return (Criteria) this;
        }

        public Criteria andData167NotEqualTo(String value) {
            addCriterion("DATA167 <>", value, "data167");
            return (Criteria) this;
        }

        public Criteria andData167GreaterThan(String value) {
            addCriterion("DATA167 >", value, "data167");
            return (Criteria) this;
        }

        public Criteria andData167GreaterThanOrEqualTo(String value) {
            addCriterion("DATA167 >=", value, "data167");
            return (Criteria) this;
        }

        public Criteria andData167LessThan(String value) {
            addCriterion("DATA167 <", value, "data167");
            return (Criteria) this;
        }

        public Criteria andData167LessThanOrEqualTo(String value) {
            addCriterion("DATA167 <=", value, "data167");
            return (Criteria) this;
        }

        public Criteria andData167Like(String value) {
            addCriterion("DATA167 like", value, "data167");
            return (Criteria) this;
        }

        public Criteria andData167NotLike(String value) {
            addCriterion("DATA167 not like", value, "data167");
            return (Criteria) this;
        }

        public Criteria andData167In(List<String> values) {
            addCriterion("DATA167 in", values, "data167");
            return (Criteria) this;
        }

        public Criteria andData167NotIn(List<String> values) {
            addCriterion("DATA167 not in", values, "data167");
            return (Criteria) this;
        }

        public Criteria andData167Between(String value1, String value2) {
            addCriterion("DATA167 between", value1, value2, "data167");
            return (Criteria) this;
        }

        public Criteria andData167NotBetween(String value1, String value2) {
            addCriterion("DATA167 not between", value1, value2, "data167");
            return (Criteria) this;
        }

        public Criteria andData168IsNull() {
            addCriterion("DATA168 is null");
            return (Criteria) this;
        }

        public Criteria andData168IsNotNull() {
            addCriterion("DATA168 is not null");
            return (Criteria) this;
        }

        public Criteria andData168EqualTo(String value) {
            addCriterion("DATA168 =", value, "data168");
            return (Criteria) this;
        }

        public Criteria andData168NotEqualTo(String value) {
            addCriterion("DATA168 <>", value, "data168");
            return (Criteria) this;
        }

        public Criteria andData168GreaterThan(String value) {
            addCriterion("DATA168 >", value, "data168");
            return (Criteria) this;
        }

        public Criteria andData168GreaterThanOrEqualTo(String value) {
            addCriterion("DATA168 >=", value, "data168");
            return (Criteria) this;
        }

        public Criteria andData168LessThan(String value) {
            addCriterion("DATA168 <", value, "data168");
            return (Criteria) this;
        }

        public Criteria andData168LessThanOrEqualTo(String value) {
            addCriterion("DATA168 <=", value, "data168");
            return (Criteria) this;
        }

        public Criteria andData168Like(String value) {
            addCriterion("DATA168 like", value, "data168");
            return (Criteria) this;
        }

        public Criteria andData168NotLike(String value) {
            addCriterion("DATA168 not like", value, "data168");
            return (Criteria) this;
        }

        public Criteria andData168In(List<String> values) {
            addCriterion("DATA168 in", values, "data168");
            return (Criteria) this;
        }

        public Criteria andData168NotIn(List<String> values) {
            addCriterion("DATA168 not in", values, "data168");
            return (Criteria) this;
        }

        public Criteria andData168Between(String value1, String value2) {
            addCriterion("DATA168 between", value1, value2, "data168");
            return (Criteria) this;
        }

        public Criteria andData168NotBetween(String value1, String value2) {
            addCriterion("DATA168 not between", value1, value2, "data168");
            return (Criteria) this;
        }

        public Criteria andData169IsNull() {
            addCriterion("DATA169 is null");
            return (Criteria) this;
        }

        public Criteria andData169IsNotNull() {
            addCriterion("DATA169 is not null");
            return (Criteria) this;
        }

        public Criteria andData169EqualTo(String value) {
            addCriterion("DATA169 =", value, "data169");
            return (Criteria) this;
        }

        public Criteria andData169NotEqualTo(String value) {
            addCriterion("DATA169 <>", value, "data169");
            return (Criteria) this;
        }

        public Criteria andData169GreaterThan(String value) {
            addCriterion("DATA169 >", value, "data169");
            return (Criteria) this;
        }

        public Criteria andData169GreaterThanOrEqualTo(String value) {
            addCriterion("DATA169 >=", value, "data169");
            return (Criteria) this;
        }

        public Criteria andData169LessThan(String value) {
            addCriterion("DATA169 <", value, "data169");
            return (Criteria) this;
        }

        public Criteria andData169LessThanOrEqualTo(String value) {
            addCriterion("DATA169 <=", value, "data169");
            return (Criteria) this;
        }

        public Criteria andData169Like(String value) {
            addCriterion("DATA169 like", value, "data169");
            return (Criteria) this;
        }

        public Criteria andData169NotLike(String value) {
            addCriterion("DATA169 not like", value, "data169");
            return (Criteria) this;
        }

        public Criteria andData169In(List<String> values) {
            addCriterion("DATA169 in", values, "data169");
            return (Criteria) this;
        }

        public Criteria andData169NotIn(List<String> values) {
            addCriterion("DATA169 not in", values, "data169");
            return (Criteria) this;
        }

        public Criteria andData169Between(String value1, String value2) {
            addCriterion("DATA169 between", value1, value2, "data169");
            return (Criteria) this;
        }

        public Criteria andData169NotBetween(String value1, String value2) {
            addCriterion("DATA169 not between", value1, value2, "data169");
            return (Criteria) this;
        }

        public Criteria andData170IsNull() {
            addCriterion("DATA170 is null");
            return (Criteria) this;
        }

        public Criteria andData170IsNotNull() {
            addCriterion("DATA170 is not null");
            return (Criteria) this;
        }

        public Criteria andData170EqualTo(String value) {
            addCriterion("DATA170 =", value, "data170");
            return (Criteria) this;
        }

        public Criteria andData170NotEqualTo(String value) {
            addCriterion("DATA170 <>", value, "data170");
            return (Criteria) this;
        }

        public Criteria andData170GreaterThan(String value) {
            addCriterion("DATA170 >", value, "data170");
            return (Criteria) this;
        }

        public Criteria andData170GreaterThanOrEqualTo(String value) {
            addCriterion("DATA170 >=", value, "data170");
            return (Criteria) this;
        }

        public Criteria andData170LessThan(String value) {
            addCriterion("DATA170 <", value, "data170");
            return (Criteria) this;
        }

        public Criteria andData170LessThanOrEqualTo(String value) {
            addCriterion("DATA170 <=", value, "data170");
            return (Criteria) this;
        }

        public Criteria andData170Like(String value) {
            addCriterion("DATA170 like", value, "data170");
            return (Criteria) this;
        }

        public Criteria andData170NotLike(String value) {
            addCriterion("DATA170 not like", value, "data170");
            return (Criteria) this;
        }

        public Criteria andData170In(List<String> values) {
            addCriterion("DATA170 in", values, "data170");
            return (Criteria) this;
        }

        public Criteria andData170NotIn(List<String> values) {
            addCriterion("DATA170 not in", values, "data170");
            return (Criteria) this;
        }

        public Criteria andData170Between(String value1, String value2) {
            addCriterion("DATA170 between", value1, value2, "data170");
            return (Criteria) this;
        }

        public Criteria andData170NotBetween(String value1, String value2) {
            addCriterion("DATA170 not between", value1, value2, "data170");
            return (Criteria) this;
        }

        public Criteria andData171IsNull() {
            addCriterion("DATA171 is null");
            return (Criteria) this;
        }

        public Criteria andData171IsNotNull() {
            addCriterion("DATA171 is not null");
            return (Criteria) this;
        }

        public Criteria andData171EqualTo(String value) {
            addCriterion("DATA171 =", value, "data171");
            return (Criteria) this;
        }

        public Criteria andData171NotEqualTo(String value) {
            addCriterion("DATA171 <>", value, "data171");
            return (Criteria) this;
        }

        public Criteria andData171GreaterThan(String value) {
            addCriterion("DATA171 >", value, "data171");
            return (Criteria) this;
        }

        public Criteria andData171GreaterThanOrEqualTo(String value) {
            addCriterion("DATA171 >=", value, "data171");
            return (Criteria) this;
        }

        public Criteria andData171LessThan(String value) {
            addCriterion("DATA171 <", value, "data171");
            return (Criteria) this;
        }

        public Criteria andData171LessThanOrEqualTo(String value) {
            addCriterion("DATA171 <=", value, "data171");
            return (Criteria) this;
        }

        public Criteria andData171Like(String value) {
            addCriterion("DATA171 like", value, "data171");
            return (Criteria) this;
        }

        public Criteria andData171NotLike(String value) {
            addCriterion("DATA171 not like", value, "data171");
            return (Criteria) this;
        }

        public Criteria andData171In(List<String> values) {
            addCriterion("DATA171 in", values, "data171");
            return (Criteria) this;
        }

        public Criteria andData171NotIn(List<String> values) {
            addCriterion("DATA171 not in", values, "data171");
            return (Criteria) this;
        }

        public Criteria andData171Between(String value1, String value2) {
            addCriterion("DATA171 between", value1, value2, "data171");
            return (Criteria) this;
        }

        public Criteria andData171NotBetween(String value1, String value2) {
            addCriterion("DATA171 not between", value1, value2, "data171");
            return (Criteria) this;
        }

        public Criteria andData172IsNull() {
            addCriterion("DATA172 is null");
            return (Criteria) this;
        }

        public Criteria andData172IsNotNull() {
            addCriterion("DATA172 is not null");
            return (Criteria) this;
        }

        public Criteria andData172EqualTo(String value) {
            addCriterion("DATA172 =", value, "data172");
            return (Criteria) this;
        }

        public Criteria andData172NotEqualTo(String value) {
            addCriterion("DATA172 <>", value, "data172");
            return (Criteria) this;
        }

        public Criteria andData172GreaterThan(String value) {
            addCriterion("DATA172 >", value, "data172");
            return (Criteria) this;
        }

        public Criteria andData172GreaterThanOrEqualTo(String value) {
            addCriterion("DATA172 >=", value, "data172");
            return (Criteria) this;
        }

        public Criteria andData172LessThan(String value) {
            addCriterion("DATA172 <", value, "data172");
            return (Criteria) this;
        }

        public Criteria andData172LessThanOrEqualTo(String value) {
            addCriterion("DATA172 <=", value, "data172");
            return (Criteria) this;
        }

        public Criteria andData172Like(String value) {
            addCriterion("DATA172 like", value, "data172");
            return (Criteria) this;
        }

        public Criteria andData172NotLike(String value) {
            addCriterion("DATA172 not like", value, "data172");
            return (Criteria) this;
        }

        public Criteria andData172In(List<String> values) {
            addCriterion("DATA172 in", values, "data172");
            return (Criteria) this;
        }

        public Criteria andData172NotIn(List<String> values) {
            addCriterion("DATA172 not in", values, "data172");
            return (Criteria) this;
        }

        public Criteria andData172Between(String value1, String value2) {
            addCriterion("DATA172 between", value1, value2, "data172");
            return (Criteria) this;
        }

        public Criteria andData172NotBetween(String value1, String value2) {
            addCriterion("DATA172 not between", value1, value2, "data172");
            return (Criteria) this;
        }

        public Criteria andData173IsNull() {
            addCriterion("DATA173 is null");
            return (Criteria) this;
        }

        public Criteria andData173IsNotNull() {
            addCriterion("DATA173 is not null");
            return (Criteria) this;
        }

        public Criteria andData173EqualTo(String value) {
            addCriterion("DATA173 =", value, "data173");
            return (Criteria) this;
        }

        public Criteria andData173NotEqualTo(String value) {
            addCriterion("DATA173 <>", value, "data173");
            return (Criteria) this;
        }

        public Criteria andData173GreaterThan(String value) {
            addCriterion("DATA173 >", value, "data173");
            return (Criteria) this;
        }

        public Criteria andData173GreaterThanOrEqualTo(String value) {
            addCriterion("DATA173 >=", value, "data173");
            return (Criteria) this;
        }

        public Criteria andData173LessThan(String value) {
            addCriterion("DATA173 <", value, "data173");
            return (Criteria) this;
        }

        public Criteria andData173LessThanOrEqualTo(String value) {
            addCriterion("DATA173 <=", value, "data173");
            return (Criteria) this;
        }

        public Criteria andData173Like(String value) {
            addCriterion("DATA173 like", value, "data173");
            return (Criteria) this;
        }

        public Criteria andData173NotLike(String value) {
            addCriterion("DATA173 not like", value, "data173");
            return (Criteria) this;
        }

        public Criteria andData173In(List<String> values) {
            addCriterion("DATA173 in", values, "data173");
            return (Criteria) this;
        }

        public Criteria andData173NotIn(List<String> values) {
            addCriterion("DATA173 not in", values, "data173");
            return (Criteria) this;
        }

        public Criteria andData173Between(String value1, String value2) {
            addCriterion("DATA173 between", value1, value2, "data173");
            return (Criteria) this;
        }

        public Criteria andData173NotBetween(String value1, String value2) {
            addCriterion("DATA173 not between", value1, value2, "data173");
            return (Criteria) this;
        }

        public Criteria andData174IsNull() {
            addCriterion("DATA174 is null");
            return (Criteria) this;
        }

        public Criteria andData174IsNotNull() {
            addCriterion("DATA174 is not null");
            return (Criteria) this;
        }

        public Criteria andData174EqualTo(String value) {
            addCriterion("DATA174 =", value, "data174");
            return (Criteria) this;
        }

        public Criteria andData174NotEqualTo(String value) {
            addCriterion("DATA174 <>", value, "data174");
            return (Criteria) this;
        }

        public Criteria andData174GreaterThan(String value) {
            addCriterion("DATA174 >", value, "data174");
            return (Criteria) this;
        }

        public Criteria andData174GreaterThanOrEqualTo(String value) {
            addCriterion("DATA174 >=", value, "data174");
            return (Criteria) this;
        }

        public Criteria andData174LessThan(String value) {
            addCriterion("DATA174 <", value, "data174");
            return (Criteria) this;
        }

        public Criteria andData174LessThanOrEqualTo(String value) {
            addCriterion("DATA174 <=", value, "data174");
            return (Criteria) this;
        }

        public Criteria andData174Like(String value) {
            addCriterion("DATA174 like", value, "data174");
            return (Criteria) this;
        }

        public Criteria andData174NotLike(String value) {
            addCriterion("DATA174 not like", value, "data174");
            return (Criteria) this;
        }

        public Criteria andData174In(List<String> values) {
            addCriterion("DATA174 in", values, "data174");
            return (Criteria) this;
        }

        public Criteria andData174NotIn(List<String> values) {
            addCriterion("DATA174 not in", values, "data174");
            return (Criteria) this;
        }

        public Criteria andData174Between(String value1, String value2) {
            addCriterion("DATA174 between", value1, value2, "data174");
            return (Criteria) this;
        }

        public Criteria andData174NotBetween(String value1, String value2) {
            addCriterion("DATA174 not between", value1, value2, "data174");
            return (Criteria) this;
        }

        public Criteria andData175IsNull() {
            addCriterion("DATA175 is null");
            return (Criteria) this;
        }

        public Criteria andData175IsNotNull() {
            addCriterion("DATA175 is not null");
            return (Criteria) this;
        }

        public Criteria andData175EqualTo(String value) {
            addCriterion("DATA175 =", value, "data175");
            return (Criteria) this;
        }

        public Criteria andData175NotEqualTo(String value) {
            addCriterion("DATA175 <>", value, "data175");
            return (Criteria) this;
        }

        public Criteria andData175GreaterThan(String value) {
            addCriterion("DATA175 >", value, "data175");
            return (Criteria) this;
        }

        public Criteria andData175GreaterThanOrEqualTo(String value) {
            addCriterion("DATA175 >=", value, "data175");
            return (Criteria) this;
        }

        public Criteria andData175LessThan(String value) {
            addCriterion("DATA175 <", value, "data175");
            return (Criteria) this;
        }

        public Criteria andData175LessThanOrEqualTo(String value) {
            addCriterion("DATA175 <=", value, "data175");
            return (Criteria) this;
        }

        public Criteria andData175Like(String value) {
            addCriterion("DATA175 like", value, "data175");
            return (Criteria) this;
        }

        public Criteria andData175NotLike(String value) {
            addCriterion("DATA175 not like", value, "data175");
            return (Criteria) this;
        }

        public Criteria andData175In(List<String> values) {
            addCriterion("DATA175 in", values, "data175");
            return (Criteria) this;
        }

        public Criteria andData175NotIn(List<String> values) {
            addCriterion("DATA175 not in", values, "data175");
            return (Criteria) this;
        }

        public Criteria andData175Between(String value1, String value2) {
            addCriterion("DATA175 between", value1, value2, "data175");
            return (Criteria) this;
        }

        public Criteria andData175NotBetween(String value1, String value2) {
            addCriterion("DATA175 not between", value1, value2, "data175");
            return (Criteria) this;
        }

        public Criteria andData176IsNull() {
            addCriterion("DATA176 is null");
            return (Criteria) this;
        }

        public Criteria andData176IsNotNull() {
            addCriterion("DATA176 is not null");
            return (Criteria) this;
        }

        public Criteria andData176EqualTo(String value) {
            addCriterion("DATA176 =", value, "data176");
            return (Criteria) this;
        }

        public Criteria andData176NotEqualTo(String value) {
            addCriterion("DATA176 <>", value, "data176");
            return (Criteria) this;
        }

        public Criteria andData176GreaterThan(String value) {
            addCriterion("DATA176 >", value, "data176");
            return (Criteria) this;
        }

        public Criteria andData176GreaterThanOrEqualTo(String value) {
            addCriterion("DATA176 >=", value, "data176");
            return (Criteria) this;
        }

        public Criteria andData176LessThan(String value) {
            addCriterion("DATA176 <", value, "data176");
            return (Criteria) this;
        }

        public Criteria andData176LessThanOrEqualTo(String value) {
            addCriterion("DATA176 <=", value, "data176");
            return (Criteria) this;
        }

        public Criteria andData176Like(String value) {
            addCriterion("DATA176 like", value, "data176");
            return (Criteria) this;
        }

        public Criteria andData176NotLike(String value) {
            addCriterion("DATA176 not like", value, "data176");
            return (Criteria) this;
        }

        public Criteria andData176In(List<String> values) {
            addCriterion("DATA176 in", values, "data176");
            return (Criteria) this;
        }

        public Criteria andData176NotIn(List<String> values) {
            addCriterion("DATA176 not in", values, "data176");
            return (Criteria) this;
        }

        public Criteria andData176Between(String value1, String value2) {
            addCriterion("DATA176 between", value1, value2, "data176");
            return (Criteria) this;
        }

        public Criteria andData176NotBetween(String value1, String value2) {
            addCriterion("DATA176 not between", value1, value2, "data176");
            return (Criteria) this;
        }

        public Criteria andData177IsNull() {
            addCriterion("DATA177 is null");
            return (Criteria) this;
        }

        public Criteria andData177IsNotNull() {
            addCriterion("DATA177 is not null");
            return (Criteria) this;
        }

        public Criteria andData177EqualTo(String value) {
            addCriterion("DATA177 =", value, "data177");
            return (Criteria) this;
        }

        public Criteria andData177NotEqualTo(String value) {
            addCriterion("DATA177 <>", value, "data177");
            return (Criteria) this;
        }

        public Criteria andData177GreaterThan(String value) {
            addCriterion("DATA177 >", value, "data177");
            return (Criteria) this;
        }

        public Criteria andData177GreaterThanOrEqualTo(String value) {
            addCriterion("DATA177 >=", value, "data177");
            return (Criteria) this;
        }

        public Criteria andData177LessThan(String value) {
            addCriterion("DATA177 <", value, "data177");
            return (Criteria) this;
        }

        public Criteria andData177LessThanOrEqualTo(String value) {
            addCriterion("DATA177 <=", value, "data177");
            return (Criteria) this;
        }

        public Criteria andData177Like(String value) {
            addCriterion("DATA177 like", value, "data177");
            return (Criteria) this;
        }

        public Criteria andData177NotLike(String value) {
            addCriterion("DATA177 not like", value, "data177");
            return (Criteria) this;
        }

        public Criteria andData177In(List<String> values) {
            addCriterion("DATA177 in", values, "data177");
            return (Criteria) this;
        }

        public Criteria andData177NotIn(List<String> values) {
            addCriterion("DATA177 not in", values, "data177");
            return (Criteria) this;
        }

        public Criteria andData177Between(String value1, String value2) {
            addCriterion("DATA177 between", value1, value2, "data177");
            return (Criteria) this;
        }

        public Criteria andData177NotBetween(String value1, String value2) {
            addCriterion("DATA177 not between", value1, value2, "data177");
            return (Criteria) this;
        }

        public Criteria andData178IsNull() {
            addCriterion("DATA178 is null");
            return (Criteria) this;
        }

        public Criteria andData178IsNotNull() {
            addCriterion("DATA178 is not null");
            return (Criteria) this;
        }

        public Criteria andData178EqualTo(String value) {
            addCriterion("DATA178 =", value, "data178");
            return (Criteria) this;
        }

        public Criteria andData178NotEqualTo(String value) {
            addCriterion("DATA178 <>", value, "data178");
            return (Criteria) this;
        }

        public Criteria andData178GreaterThan(String value) {
            addCriterion("DATA178 >", value, "data178");
            return (Criteria) this;
        }

        public Criteria andData178GreaterThanOrEqualTo(String value) {
            addCriterion("DATA178 >=", value, "data178");
            return (Criteria) this;
        }

        public Criteria andData178LessThan(String value) {
            addCriterion("DATA178 <", value, "data178");
            return (Criteria) this;
        }

        public Criteria andData178LessThanOrEqualTo(String value) {
            addCriterion("DATA178 <=", value, "data178");
            return (Criteria) this;
        }

        public Criteria andData178Like(String value) {
            addCriterion("DATA178 like", value, "data178");
            return (Criteria) this;
        }

        public Criteria andData178NotLike(String value) {
            addCriterion("DATA178 not like", value, "data178");
            return (Criteria) this;
        }

        public Criteria andData178In(List<String> values) {
            addCriterion("DATA178 in", values, "data178");
            return (Criteria) this;
        }

        public Criteria andData178NotIn(List<String> values) {
            addCriterion("DATA178 not in", values, "data178");
            return (Criteria) this;
        }

        public Criteria andData178Between(String value1, String value2) {
            addCriterion("DATA178 between", value1, value2, "data178");
            return (Criteria) this;
        }

        public Criteria andData178NotBetween(String value1, String value2) {
            addCriterion("DATA178 not between", value1, value2, "data178");
            return (Criteria) this;
        }

        public Criteria andData179IsNull() {
            addCriterion("DATA179 is null");
            return (Criteria) this;
        }

        public Criteria andData179IsNotNull() {
            addCriterion("DATA179 is not null");
            return (Criteria) this;
        }

        public Criteria andData179EqualTo(String value) {
            addCriterion("DATA179 =", value, "data179");
            return (Criteria) this;
        }

        public Criteria andData179NotEqualTo(String value) {
            addCriterion("DATA179 <>", value, "data179");
            return (Criteria) this;
        }

        public Criteria andData179GreaterThan(String value) {
            addCriterion("DATA179 >", value, "data179");
            return (Criteria) this;
        }

        public Criteria andData179GreaterThanOrEqualTo(String value) {
            addCriterion("DATA179 >=", value, "data179");
            return (Criteria) this;
        }

        public Criteria andData179LessThan(String value) {
            addCriterion("DATA179 <", value, "data179");
            return (Criteria) this;
        }

        public Criteria andData179LessThanOrEqualTo(String value) {
            addCriterion("DATA179 <=", value, "data179");
            return (Criteria) this;
        }

        public Criteria andData179Like(String value) {
            addCriterion("DATA179 like", value, "data179");
            return (Criteria) this;
        }

        public Criteria andData179NotLike(String value) {
            addCriterion("DATA179 not like", value, "data179");
            return (Criteria) this;
        }

        public Criteria andData179In(List<String> values) {
            addCriterion("DATA179 in", values, "data179");
            return (Criteria) this;
        }

        public Criteria andData179NotIn(List<String> values) {
            addCriterion("DATA179 not in", values, "data179");
            return (Criteria) this;
        }

        public Criteria andData179Between(String value1, String value2) {
            addCriterion("DATA179 between", value1, value2, "data179");
            return (Criteria) this;
        }

        public Criteria andData179NotBetween(String value1, String value2) {
            addCriterion("DATA179 not between", value1, value2, "data179");
            return (Criteria) this;
        }

        public Criteria andData180IsNull() {
            addCriterion("DATA180 is null");
            return (Criteria) this;
        }

        public Criteria andData180IsNotNull() {
            addCriterion("DATA180 is not null");
            return (Criteria) this;
        }

        public Criteria andData180EqualTo(String value) {
            addCriterion("DATA180 =", value, "data180");
            return (Criteria) this;
        }

        public Criteria andData180NotEqualTo(String value) {
            addCriterion("DATA180 <>", value, "data180");
            return (Criteria) this;
        }

        public Criteria andData180GreaterThan(String value) {
            addCriterion("DATA180 >", value, "data180");
            return (Criteria) this;
        }

        public Criteria andData180GreaterThanOrEqualTo(String value) {
            addCriterion("DATA180 >=", value, "data180");
            return (Criteria) this;
        }

        public Criteria andData180LessThan(String value) {
            addCriterion("DATA180 <", value, "data180");
            return (Criteria) this;
        }

        public Criteria andData180LessThanOrEqualTo(String value) {
            addCriterion("DATA180 <=", value, "data180");
            return (Criteria) this;
        }

        public Criteria andData180Like(String value) {
            addCriterion("DATA180 like", value, "data180");
            return (Criteria) this;
        }

        public Criteria andData180NotLike(String value) {
            addCriterion("DATA180 not like", value, "data180");
            return (Criteria) this;
        }

        public Criteria andData180In(List<String> values) {
            addCriterion("DATA180 in", values, "data180");
            return (Criteria) this;
        }

        public Criteria andData180NotIn(List<String> values) {
            addCriterion("DATA180 not in", values, "data180");
            return (Criteria) this;
        }

        public Criteria andData180Between(String value1, String value2) {
            addCriterion("DATA180 between", value1, value2, "data180");
            return (Criteria) this;
        }

        public Criteria andData180NotBetween(String value1, String value2) {
            addCriterion("DATA180 not between", value1, value2, "data180");
            return (Criteria) this;
        }

        public Criteria andData181IsNull() {
            addCriterion("DATA181 is null");
            return (Criteria) this;
        }

        public Criteria andData181IsNotNull() {
            addCriterion("DATA181 is not null");
            return (Criteria) this;
        }

        public Criteria andData181EqualTo(String value) {
            addCriterion("DATA181 =", value, "data181");
            return (Criteria) this;
        }

        public Criteria andData181NotEqualTo(String value) {
            addCriterion("DATA181 <>", value, "data181");
            return (Criteria) this;
        }

        public Criteria andData181GreaterThan(String value) {
            addCriterion("DATA181 >", value, "data181");
            return (Criteria) this;
        }

        public Criteria andData181GreaterThanOrEqualTo(String value) {
            addCriterion("DATA181 >=", value, "data181");
            return (Criteria) this;
        }

        public Criteria andData181LessThan(String value) {
            addCriterion("DATA181 <", value, "data181");
            return (Criteria) this;
        }

        public Criteria andData181LessThanOrEqualTo(String value) {
            addCriterion("DATA181 <=", value, "data181");
            return (Criteria) this;
        }

        public Criteria andData181Like(String value) {
            addCriterion("DATA181 like", value, "data181");
            return (Criteria) this;
        }

        public Criteria andData181NotLike(String value) {
            addCriterion("DATA181 not like", value, "data181");
            return (Criteria) this;
        }

        public Criteria andData181In(List<String> values) {
            addCriterion("DATA181 in", values, "data181");
            return (Criteria) this;
        }

        public Criteria andData181NotIn(List<String> values) {
            addCriterion("DATA181 not in", values, "data181");
            return (Criteria) this;
        }

        public Criteria andData181Between(String value1, String value2) {
            addCriterion("DATA181 between", value1, value2, "data181");
            return (Criteria) this;
        }

        public Criteria andData181NotBetween(String value1, String value2) {
            addCriterion("DATA181 not between", value1, value2, "data181");
            return (Criteria) this;
        }

        public Criteria andData182IsNull() {
            addCriterion("DATA182 is null");
            return (Criteria) this;
        }

        public Criteria andData182IsNotNull() {
            addCriterion("DATA182 is not null");
            return (Criteria) this;
        }

        public Criteria andData182EqualTo(String value) {
            addCriterion("DATA182 =", value, "data182");
            return (Criteria) this;
        }

        public Criteria andData182NotEqualTo(String value) {
            addCriterion("DATA182 <>", value, "data182");
            return (Criteria) this;
        }

        public Criteria andData182GreaterThan(String value) {
            addCriterion("DATA182 >", value, "data182");
            return (Criteria) this;
        }

        public Criteria andData182GreaterThanOrEqualTo(String value) {
            addCriterion("DATA182 >=", value, "data182");
            return (Criteria) this;
        }

        public Criteria andData182LessThan(String value) {
            addCriterion("DATA182 <", value, "data182");
            return (Criteria) this;
        }

        public Criteria andData182LessThanOrEqualTo(String value) {
            addCriterion("DATA182 <=", value, "data182");
            return (Criteria) this;
        }

        public Criteria andData182Like(String value) {
            addCriterion("DATA182 like", value, "data182");
            return (Criteria) this;
        }

        public Criteria andData182NotLike(String value) {
            addCriterion("DATA182 not like", value, "data182");
            return (Criteria) this;
        }

        public Criteria andData182In(List<String> values) {
            addCriterion("DATA182 in", values, "data182");
            return (Criteria) this;
        }

        public Criteria andData182NotIn(List<String> values) {
            addCriterion("DATA182 not in", values, "data182");
            return (Criteria) this;
        }

        public Criteria andData182Between(String value1, String value2) {
            addCriterion("DATA182 between", value1, value2, "data182");
            return (Criteria) this;
        }

        public Criteria andData182NotBetween(String value1, String value2) {
            addCriterion("DATA182 not between", value1, value2, "data182");
            return (Criteria) this;
        }

        public Criteria andData183IsNull() {
            addCriterion("DATA183 is null");
            return (Criteria) this;
        }

        public Criteria andData183IsNotNull() {
            addCriterion("DATA183 is not null");
            return (Criteria) this;
        }

        public Criteria andData183EqualTo(String value) {
            addCriterion("DATA183 =", value, "data183");
            return (Criteria) this;
        }

        public Criteria andData183NotEqualTo(String value) {
            addCriterion("DATA183 <>", value, "data183");
            return (Criteria) this;
        }

        public Criteria andData183GreaterThan(String value) {
            addCriterion("DATA183 >", value, "data183");
            return (Criteria) this;
        }

        public Criteria andData183GreaterThanOrEqualTo(String value) {
            addCriterion("DATA183 >=", value, "data183");
            return (Criteria) this;
        }

        public Criteria andData183LessThan(String value) {
            addCriterion("DATA183 <", value, "data183");
            return (Criteria) this;
        }

        public Criteria andData183LessThanOrEqualTo(String value) {
            addCriterion("DATA183 <=", value, "data183");
            return (Criteria) this;
        }

        public Criteria andData183Like(String value) {
            addCriterion("DATA183 like", value, "data183");
            return (Criteria) this;
        }

        public Criteria andData183NotLike(String value) {
            addCriterion("DATA183 not like", value, "data183");
            return (Criteria) this;
        }

        public Criteria andData183In(List<String> values) {
            addCriterion("DATA183 in", values, "data183");
            return (Criteria) this;
        }

        public Criteria andData183NotIn(List<String> values) {
            addCriterion("DATA183 not in", values, "data183");
            return (Criteria) this;
        }

        public Criteria andData183Between(String value1, String value2) {
            addCriterion("DATA183 between", value1, value2, "data183");
            return (Criteria) this;
        }

        public Criteria andData183NotBetween(String value1, String value2) {
            addCriterion("DATA183 not between", value1, value2, "data183");
            return (Criteria) this;
        }

        public Criteria andData184IsNull() {
            addCriterion("DATA184 is null");
            return (Criteria) this;
        }

        public Criteria andData184IsNotNull() {
            addCriterion("DATA184 is not null");
            return (Criteria) this;
        }

        public Criteria andData184EqualTo(String value) {
            addCriterion("DATA184 =", value, "data184");
            return (Criteria) this;
        }

        public Criteria andData184NotEqualTo(String value) {
            addCriterion("DATA184 <>", value, "data184");
            return (Criteria) this;
        }

        public Criteria andData184GreaterThan(String value) {
            addCriterion("DATA184 >", value, "data184");
            return (Criteria) this;
        }

        public Criteria andData184GreaterThanOrEqualTo(String value) {
            addCriterion("DATA184 >=", value, "data184");
            return (Criteria) this;
        }

        public Criteria andData184LessThan(String value) {
            addCriterion("DATA184 <", value, "data184");
            return (Criteria) this;
        }

        public Criteria andData184LessThanOrEqualTo(String value) {
            addCriterion("DATA184 <=", value, "data184");
            return (Criteria) this;
        }

        public Criteria andData184Like(String value) {
            addCriterion("DATA184 like", value, "data184");
            return (Criteria) this;
        }

        public Criteria andData184NotLike(String value) {
            addCriterion("DATA184 not like", value, "data184");
            return (Criteria) this;
        }

        public Criteria andData184In(List<String> values) {
            addCriterion("DATA184 in", values, "data184");
            return (Criteria) this;
        }

        public Criteria andData184NotIn(List<String> values) {
            addCriterion("DATA184 not in", values, "data184");
            return (Criteria) this;
        }

        public Criteria andData184Between(String value1, String value2) {
            addCriterion("DATA184 between", value1, value2, "data184");
            return (Criteria) this;
        }

        public Criteria andData184NotBetween(String value1, String value2) {
            addCriterion("DATA184 not between", value1, value2, "data184");
            return (Criteria) this;
        }

        public Criteria andData185IsNull() {
            addCriterion("DATA185 is null");
            return (Criteria) this;
        }

        public Criteria andData185IsNotNull() {
            addCriterion("DATA185 is not null");
            return (Criteria) this;
        }

        public Criteria andData185EqualTo(String value) {
            addCriterion("DATA185 =", value, "data185");
            return (Criteria) this;
        }

        public Criteria andData185NotEqualTo(String value) {
            addCriterion("DATA185 <>", value, "data185");
            return (Criteria) this;
        }

        public Criteria andData185GreaterThan(String value) {
            addCriterion("DATA185 >", value, "data185");
            return (Criteria) this;
        }

        public Criteria andData185GreaterThanOrEqualTo(String value) {
            addCriterion("DATA185 >=", value, "data185");
            return (Criteria) this;
        }

        public Criteria andData185LessThan(String value) {
            addCriterion("DATA185 <", value, "data185");
            return (Criteria) this;
        }

        public Criteria andData185LessThanOrEqualTo(String value) {
            addCriterion("DATA185 <=", value, "data185");
            return (Criteria) this;
        }

        public Criteria andData185Like(String value) {
            addCriterion("DATA185 like", value, "data185");
            return (Criteria) this;
        }

        public Criteria andData185NotLike(String value) {
            addCriterion("DATA185 not like", value, "data185");
            return (Criteria) this;
        }

        public Criteria andData185In(List<String> values) {
            addCriterion("DATA185 in", values, "data185");
            return (Criteria) this;
        }

        public Criteria andData185NotIn(List<String> values) {
            addCriterion("DATA185 not in", values, "data185");
            return (Criteria) this;
        }

        public Criteria andData185Between(String value1, String value2) {
            addCriterion("DATA185 between", value1, value2, "data185");
            return (Criteria) this;
        }

        public Criteria andData185NotBetween(String value1, String value2) {
            addCriterion("DATA185 not between", value1, value2, "data185");
            return (Criteria) this;
        }

        public Criteria andData186IsNull() {
            addCriterion("DATA186 is null");
            return (Criteria) this;
        }

        public Criteria andData186IsNotNull() {
            addCriterion("DATA186 is not null");
            return (Criteria) this;
        }

        public Criteria andData186EqualTo(String value) {
            addCriterion("DATA186 =", value, "data186");
            return (Criteria) this;
        }

        public Criteria andData186NotEqualTo(String value) {
            addCriterion("DATA186 <>", value, "data186");
            return (Criteria) this;
        }

        public Criteria andData186GreaterThan(String value) {
            addCriterion("DATA186 >", value, "data186");
            return (Criteria) this;
        }

        public Criteria andData186GreaterThanOrEqualTo(String value) {
            addCriterion("DATA186 >=", value, "data186");
            return (Criteria) this;
        }

        public Criteria andData186LessThan(String value) {
            addCriterion("DATA186 <", value, "data186");
            return (Criteria) this;
        }

        public Criteria andData186LessThanOrEqualTo(String value) {
            addCriterion("DATA186 <=", value, "data186");
            return (Criteria) this;
        }

        public Criteria andData186Like(String value) {
            addCriterion("DATA186 like", value, "data186");
            return (Criteria) this;
        }

        public Criteria andData186NotLike(String value) {
            addCriterion("DATA186 not like", value, "data186");
            return (Criteria) this;
        }

        public Criteria andData186In(List<String> values) {
            addCriterion("DATA186 in", values, "data186");
            return (Criteria) this;
        }

        public Criteria andData186NotIn(List<String> values) {
            addCriterion("DATA186 not in", values, "data186");
            return (Criteria) this;
        }

        public Criteria andData186Between(String value1, String value2) {
            addCriterion("DATA186 between", value1, value2, "data186");
            return (Criteria) this;
        }

        public Criteria andData186NotBetween(String value1, String value2) {
            addCriterion("DATA186 not between", value1, value2, "data186");
            return (Criteria) this;
        }

        public Criteria andData187IsNull() {
            addCriterion("DATA187 is null");
            return (Criteria) this;
        }

        public Criteria andData187IsNotNull() {
            addCriterion("DATA187 is not null");
            return (Criteria) this;
        }

        public Criteria andData187EqualTo(String value) {
            addCriterion("DATA187 =", value, "data187");
            return (Criteria) this;
        }

        public Criteria andData187NotEqualTo(String value) {
            addCriterion("DATA187 <>", value, "data187");
            return (Criteria) this;
        }

        public Criteria andData187GreaterThan(String value) {
            addCriterion("DATA187 >", value, "data187");
            return (Criteria) this;
        }

        public Criteria andData187GreaterThanOrEqualTo(String value) {
            addCriterion("DATA187 >=", value, "data187");
            return (Criteria) this;
        }

        public Criteria andData187LessThan(String value) {
            addCriterion("DATA187 <", value, "data187");
            return (Criteria) this;
        }

        public Criteria andData187LessThanOrEqualTo(String value) {
            addCriterion("DATA187 <=", value, "data187");
            return (Criteria) this;
        }

        public Criteria andData187Like(String value) {
            addCriterion("DATA187 like", value, "data187");
            return (Criteria) this;
        }

        public Criteria andData187NotLike(String value) {
            addCriterion("DATA187 not like", value, "data187");
            return (Criteria) this;
        }

        public Criteria andData187In(List<String> values) {
            addCriterion("DATA187 in", values, "data187");
            return (Criteria) this;
        }

        public Criteria andData187NotIn(List<String> values) {
            addCriterion("DATA187 not in", values, "data187");
            return (Criteria) this;
        }

        public Criteria andData187Between(String value1, String value2) {
            addCriterion("DATA187 between", value1, value2, "data187");
            return (Criteria) this;
        }

        public Criteria andData187NotBetween(String value1, String value2) {
            addCriterion("DATA187 not between", value1, value2, "data187");
            return (Criteria) this;
        }

        public Criteria andData188IsNull() {
            addCriterion("DATA188 is null");
            return (Criteria) this;
        }

        public Criteria andData188IsNotNull() {
            addCriterion("DATA188 is not null");
            return (Criteria) this;
        }

        public Criteria andData188EqualTo(String value) {
            addCriterion("DATA188 =", value, "data188");
            return (Criteria) this;
        }

        public Criteria andData188NotEqualTo(String value) {
            addCriterion("DATA188 <>", value, "data188");
            return (Criteria) this;
        }

        public Criteria andData188GreaterThan(String value) {
            addCriterion("DATA188 >", value, "data188");
            return (Criteria) this;
        }

        public Criteria andData188GreaterThanOrEqualTo(String value) {
            addCriterion("DATA188 >=", value, "data188");
            return (Criteria) this;
        }

        public Criteria andData188LessThan(String value) {
            addCriterion("DATA188 <", value, "data188");
            return (Criteria) this;
        }

        public Criteria andData188LessThanOrEqualTo(String value) {
            addCriterion("DATA188 <=", value, "data188");
            return (Criteria) this;
        }

        public Criteria andData188Like(String value) {
            addCriterion("DATA188 like", value, "data188");
            return (Criteria) this;
        }

        public Criteria andData188NotLike(String value) {
            addCriterion("DATA188 not like", value, "data188");
            return (Criteria) this;
        }

        public Criteria andData188In(List<String> values) {
            addCriterion("DATA188 in", values, "data188");
            return (Criteria) this;
        }

        public Criteria andData188NotIn(List<String> values) {
            addCriterion("DATA188 not in", values, "data188");
            return (Criteria) this;
        }

        public Criteria andData188Between(String value1, String value2) {
            addCriterion("DATA188 between", value1, value2, "data188");
            return (Criteria) this;
        }

        public Criteria andData188NotBetween(String value1, String value2) {
            addCriterion("DATA188 not between", value1, value2, "data188");
            return (Criteria) this;
        }

        public Criteria andData189IsNull() {
            addCriterion("DATA189 is null");
            return (Criteria) this;
        }

        public Criteria andData189IsNotNull() {
            addCriterion("DATA189 is not null");
            return (Criteria) this;
        }

        public Criteria andData189EqualTo(String value) {
            addCriterion("DATA189 =", value, "data189");
            return (Criteria) this;
        }

        public Criteria andData189NotEqualTo(String value) {
            addCriterion("DATA189 <>", value, "data189");
            return (Criteria) this;
        }

        public Criteria andData189GreaterThan(String value) {
            addCriterion("DATA189 >", value, "data189");
            return (Criteria) this;
        }

        public Criteria andData189GreaterThanOrEqualTo(String value) {
            addCriterion("DATA189 >=", value, "data189");
            return (Criteria) this;
        }

        public Criteria andData189LessThan(String value) {
            addCriterion("DATA189 <", value, "data189");
            return (Criteria) this;
        }

        public Criteria andData189LessThanOrEqualTo(String value) {
            addCriterion("DATA189 <=", value, "data189");
            return (Criteria) this;
        }

        public Criteria andData189Like(String value) {
            addCriterion("DATA189 like", value, "data189");
            return (Criteria) this;
        }

        public Criteria andData189NotLike(String value) {
            addCriterion("DATA189 not like", value, "data189");
            return (Criteria) this;
        }

        public Criteria andData189In(List<String> values) {
            addCriterion("DATA189 in", values, "data189");
            return (Criteria) this;
        }

        public Criteria andData189NotIn(List<String> values) {
            addCriterion("DATA189 not in", values, "data189");
            return (Criteria) this;
        }

        public Criteria andData189Between(String value1, String value2) {
            addCriterion("DATA189 between", value1, value2, "data189");
            return (Criteria) this;
        }

        public Criteria andData189NotBetween(String value1, String value2) {
            addCriterion("DATA189 not between", value1, value2, "data189");
            return (Criteria) this;
        }

        public Criteria andData190IsNull() {
            addCriterion("DATA190 is null");
            return (Criteria) this;
        }

        public Criteria andData190IsNotNull() {
            addCriterion("DATA190 is not null");
            return (Criteria) this;
        }

        public Criteria andData190EqualTo(String value) {
            addCriterion("DATA190 =", value, "data190");
            return (Criteria) this;
        }

        public Criteria andData190NotEqualTo(String value) {
            addCriterion("DATA190 <>", value, "data190");
            return (Criteria) this;
        }

        public Criteria andData190GreaterThan(String value) {
            addCriterion("DATA190 >", value, "data190");
            return (Criteria) this;
        }

        public Criteria andData190GreaterThanOrEqualTo(String value) {
            addCriterion("DATA190 >=", value, "data190");
            return (Criteria) this;
        }

        public Criteria andData190LessThan(String value) {
            addCriterion("DATA190 <", value, "data190");
            return (Criteria) this;
        }

        public Criteria andData190LessThanOrEqualTo(String value) {
            addCriterion("DATA190 <=", value, "data190");
            return (Criteria) this;
        }

        public Criteria andData190Like(String value) {
            addCriterion("DATA190 like", value, "data190");
            return (Criteria) this;
        }

        public Criteria andData190NotLike(String value) {
            addCriterion("DATA190 not like", value, "data190");
            return (Criteria) this;
        }

        public Criteria andData190In(List<String> values) {
            addCriterion("DATA190 in", values, "data190");
            return (Criteria) this;
        }

        public Criteria andData190NotIn(List<String> values) {
            addCriterion("DATA190 not in", values, "data190");
            return (Criteria) this;
        }

        public Criteria andData190Between(String value1, String value2) {
            addCriterion("DATA190 between", value1, value2, "data190");
            return (Criteria) this;
        }

        public Criteria andData190NotBetween(String value1, String value2) {
            addCriterion("DATA190 not between", value1, value2, "data190");
            return (Criteria) this;
        }

        public Criteria andData191IsNull() {
            addCriterion("DATA191 is null");
            return (Criteria) this;
        }

        public Criteria andData191IsNotNull() {
            addCriterion("DATA191 is not null");
            return (Criteria) this;
        }

        public Criteria andData191EqualTo(String value) {
            addCriterion("DATA191 =", value, "data191");
            return (Criteria) this;
        }

        public Criteria andData191NotEqualTo(String value) {
            addCriterion("DATA191 <>", value, "data191");
            return (Criteria) this;
        }

        public Criteria andData191GreaterThan(String value) {
            addCriterion("DATA191 >", value, "data191");
            return (Criteria) this;
        }

        public Criteria andData191GreaterThanOrEqualTo(String value) {
            addCriterion("DATA191 >=", value, "data191");
            return (Criteria) this;
        }

        public Criteria andData191LessThan(String value) {
            addCriterion("DATA191 <", value, "data191");
            return (Criteria) this;
        }

        public Criteria andData191LessThanOrEqualTo(String value) {
            addCriterion("DATA191 <=", value, "data191");
            return (Criteria) this;
        }

        public Criteria andData191Like(String value) {
            addCriterion("DATA191 like", value, "data191");
            return (Criteria) this;
        }

        public Criteria andData191NotLike(String value) {
            addCriterion("DATA191 not like", value, "data191");
            return (Criteria) this;
        }

        public Criteria andData191In(List<String> values) {
            addCriterion("DATA191 in", values, "data191");
            return (Criteria) this;
        }

        public Criteria andData191NotIn(List<String> values) {
            addCriterion("DATA191 not in", values, "data191");
            return (Criteria) this;
        }

        public Criteria andData191Between(String value1, String value2) {
            addCriterion("DATA191 between", value1, value2, "data191");
            return (Criteria) this;
        }

        public Criteria andData191NotBetween(String value1, String value2) {
            addCriterion("DATA191 not between", value1, value2, "data191");
            return (Criteria) this;
        }

        public Criteria andData192IsNull() {
            addCriterion("DATA192 is null");
            return (Criteria) this;
        }

        public Criteria andData192IsNotNull() {
            addCriterion("DATA192 is not null");
            return (Criteria) this;
        }

        public Criteria andData192EqualTo(String value) {
            addCriterion("DATA192 =", value, "data192");
            return (Criteria) this;
        }

        public Criteria andData192NotEqualTo(String value) {
            addCriterion("DATA192 <>", value, "data192");
            return (Criteria) this;
        }

        public Criteria andData192GreaterThan(String value) {
            addCriterion("DATA192 >", value, "data192");
            return (Criteria) this;
        }

        public Criteria andData192GreaterThanOrEqualTo(String value) {
            addCriterion("DATA192 >=", value, "data192");
            return (Criteria) this;
        }

        public Criteria andData192LessThan(String value) {
            addCriterion("DATA192 <", value, "data192");
            return (Criteria) this;
        }

        public Criteria andData192LessThanOrEqualTo(String value) {
            addCriterion("DATA192 <=", value, "data192");
            return (Criteria) this;
        }

        public Criteria andData192Like(String value) {
            addCriterion("DATA192 like", value, "data192");
            return (Criteria) this;
        }

        public Criteria andData192NotLike(String value) {
            addCriterion("DATA192 not like", value, "data192");
            return (Criteria) this;
        }

        public Criteria andData192In(List<String> values) {
            addCriterion("DATA192 in", values, "data192");
            return (Criteria) this;
        }

        public Criteria andData192NotIn(List<String> values) {
            addCriterion("DATA192 not in", values, "data192");
            return (Criteria) this;
        }

        public Criteria andData192Between(String value1, String value2) {
            addCriterion("DATA192 between", value1, value2, "data192");
            return (Criteria) this;
        }

        public Criteria andData192NotBetween(String value1, String value2) {
            addCriterion("DATA192 not between", value1, value2, "data192");
            return (Criteria) this;
        }

        public Criteria andData193IsNull() {
            addCriterion("DATA193 is null");
            return (Criteria) this;
        }

        public Criteria andData193IsNotNull() {
            addCriterion("DATA193 is not null");
            return (Criteria) this;
        }

        public Criteria andData193EqualTo(String value) {
            addCriterion("DATA193 =", value, "data193");
            return (Criteria) this;
        }

        public Criteria andData193NotEqualTo(String value) {
            addCriterion("DATA193 <>", value, "data193");
            return (Criteria) this;
        }

        public Criteria andData193GreaterThan(String value) {
            addCriterion("DATA193 >", value, "data193");
            return (Criteria) this;
        }

        public Criteria andData193GreaterThanOrEqualTo(String value) {
            addCriterion("DATA193 >=", value, "data193");
            return (Criteria) this;
        }

        public Criteria andData193LessThan(String value) {
            addCriterion("DATA193 <", value, "data193");
            return (Criteria) this;
        }

        public Criteria andData193LessThanOrEqualTo(String value) {
            addCriterion("DATA193 <=", value, "data193");
            return (Criteria) this;
        }

        public Criteria andData193Like(String value) {
            addCriterion("DATA193 like", value, "data193");
            return (Criteria) this;
        }

        public Criteria andData193NotLike(String value) {
            addCriterion("DATA193 not like", value, "data193");
            return (Criteria) this;
        }

        public Criteria andData193In(List<String> values) {
            addCriterion("DATA193 in", values, "data193");
            return (Criteria) this;
        }

        public Criteria andData193NotIn(List<String> values) {
            addCriterion("DATA193 not in", values, "data193");
            return (Criteria) this;
        }

        public Criteria andData193Between(String value1, String value2) {
            addCriterion("DATA193 between", value1, value2, "data193");
            return (Criteria) this;
        }

        public Criteria andData193NotBetween(String value1, String value2) {
            addCriterion("DATA193 not between", value1, value2, "data193");
            return (Criteria) this;
        }

        public Criteria andData194IsNull() {
            addCriterion("DATA194 is null");
            return (Criteria) this;
        }

        public Criteria andData194IsNotNull() {
            addCriterion("DATA194 is not null");
            return (Criteria) this;
        }

        public Criteria andData194EqualTo(String value) {
            addCriterion("DATA194 =", value, "data194");
            return (Criteria) this;
        }

        public Criteria andData194NotEqualTo(String value) {
            addCriterion("DATA194 <>", value, "data194");
            return (Criteria) this;
        }

        public Criteria andData194GreaterThan(String value) {
            addCriterion("DATA194 >", value, "data194");
            return (Criteria) this;
        }

        public Criteria andData194GreaterThanOrEqualTo(String value) {
            addCriterion("DATA194 >=", value, "data194");
            return (Criteria) this;
        }

        public Criteria andData194LessThan(String value) {
            addCriterion("DATA194 <", value, "data194");
            return (Criteria) this;
        }

        public Criteria andData194LessThanOrEqualTo(String value) {
            addCriterion("DATA194 <=", value, "data194");
            return (Criteria) this;
        }

        public Criteria andData194Like(String value) {
            addCriterion("DATA194 like", value, "data194");
            return (Criteria) this;
        }

        public Criteria andData194NotLike(String value) {
            addCriterion("DATA194 not like", value, "data194");
            return (Criteria) this;
        }

        public Criteria andData194In(List<String> values) {
            addCriterion("DATA194 in", values, "data194");
            return (Criteria) this;
        }

        public Criteria andData194NotIn(List<String> values) {
            addCriterion("DATA194 not in", values, "data194");
            return (Criteria) this;
        }

        public Criteria andData194Between(String value1, String value2) {
            addCriterion("DATA194 between", value1, value2, "data194");
            return (Criteria) this;
        }

        public Criteria andData194NotBetween(String value1, String value2) {
            addCriterion("DATA194 not between", value1, value2, "data194");
            return (Criteria) this;
        }

        public Criteria andData195IsNull() {
            addCriterion("DATA195 is null");
            return (Criteria) this;
        }

        public Criteria andData195IsNotNull() {
            addCriterion("DATA195 is not null");
            return (Criteria) this;
        }

        public Criteria andData195EqualTo(String value) {
            addCriterion("DATA195 =", value, "data195");
            return (Criteria) this;
        }

        public Criteria andData195NotEqualTo(String value) {
            addCriterion("DATA195 <>", value, "data195");
            return (Criteria) this;
        }

        public Criteria andData195GreaterThan(String value) {
            addCriterion("DATA195 >", value, "data195");
            return (Criteria) this;
        }

        public Criteria andData195GreaterThanOrEqualTo(String value) {
            addCriterion("DATA195 >=", value, "data195");
            return (Criteria) this;
        }

        public Criteria andData195LessThan(String value) {
            addCriterion("DATA195 <", value, "data195");
            return (Criteria) this;
        }

        public Criteria andData195LessThanOrEqualTo(String value) {
            addCriterion("DATA195 <=", value, "data195");
            return (Criteria) this;
        }

        public Criteria andData195Like(String value) {
            addCriterion("DATA195 like", value, "data195");
            return (Criteria) this;
        }

        public Criteria andData195NotLike(String value) {
            addCriterion("DATA195 not like", value, "data195");
            return (Criteria) this;
        }

        public Criteria andData195In(List<String> values) {
            addCriterion("DATA195 in", values, "data195");
            return (Criteria) this;
        }

        public Criteria andData195NotIn(List<String> values) {
            addCriterion("DATA195 not in", values, "data195");
            return (Criteria) this;
        }

        public Criteria andData195Between(String value1, String value2) {
            addCriterion("DATA195 between", value1, value2, "data195");
            return (Criteria) this;
        }

        public Criteria andData195NotBetween(String value1, String value2) {
            addCriterion("DATA195 not between", value1, value2, "data195");
            return (Criteria) this;
        }

        public Criteria andData196IsNull() {
            addCriterion("DATA196 is null");
            return (Criteria) this;
        }

        public Criteria andData196IsNotNull() {
            addCriterion("DATA196 is not null");
            return (Criteria) this;
        }

        public Criteria andData196EqualTo(String value) {
            addCriterion("DATA196 =", value, "data196");
            return (Criteria) this;
        }

        public Criteria andData196NotEqualTo(String value) {
            addCriterion("DATA196 <>", value, "data196");
            return (Criteria) this;
        }

        public Criteria andData196GreaterThan(String value) {
            addCriterion("DATA196 >", value, "data196");
            return (Criteria) this;
        }

        public Criteria andData196GreaterThanOrEqualTo(String value) {
            addCriterion("DATA196 >=", value, "data196");
            return (Criteria) this;
        }

        public Criteria andData196LessThan(String value) {
            addCriterion("DATA196 <", value, "data196");
            return (Criteria) this;
        }

        public Criteria andData196LessThanOrEqualTo(String value) {
            addCriterion("DATA196 <=", value, "data196");
            return (Criteria) this;
        }

        public Criteria andData196Like(String value) {
            addCriterion("DATA196 like", value, "data196");
            return (Criteria) this;
        }

        public Criteria andData196NotLike(String value) {
            addCriterion("DATA196 not like", value, "data196");
            return (Criteria) this;
        }

        public Criteria andData196In(List<String> values) {
            addCriterion("DATA196 in", values, "data196");
            return (Criteria) this;
        }

        public Criteria andData196NotIn(List<String> values) {
            addCriterion("DATA196 not in", values, "data196");
            return (Criteria) this;
        }

        public Criteria andData196Between(String value1, String value2) {
            addCriterion("DATA196 between", value1, value2, "data196");
            return (Criteria) this;
        }

        public Criteria andData196NotBetween(String value1, String value2) {
            addCriterion("DATA196 not between", value1, value2, "data196");
            return (Criteria) this;
        }

        public Criteria andData197IsNull() {
            addCriterion("DATA197 is null");
            return (Criteria) this;
        }

        public Criteria andData197IsNotNull() {
            addCriterion("DATA197 is not null");
            return (Criteria) this;
        }

        public Criteria andData197EqualTo(String value) {
            addCriterion("DATA197 =", value, "data197");
            return (Criteria) this;
        }

        public Criteria andData197NotEqualTo(String value) {
            addCriterion("DATA197 <>", value, "data197");
            return (Criteria) this;
        }

        public Criteria andData197GreaterThan(String value) {
            addCriterion("DATA197 >", value, "data197");
            return (Criteria) this;
        }

        public Criteria andData197GreaterThanOrEqualTo(String value) {
            addCriterion("DATA197 >=", value, "data197");
            return (Criteria) this;
        }

        public Criteria andData197LessThan(String value) {
            addCriterion("DATA197 <", value, "data197");
            return (Criteria) this;
        }

        public Criteria andData197LessThanOrEqualTo(String value) {
            addCriterion("DATA197 <=", value, "data197");
            return (Criteria) this;
        }

        public Criteria andData197Like(String value) {
            addCriterion("DATA197 like", value, "data197");
            return (Criteria) this;
        }

        public Criteria andData197NotLike(String value) {
            addCriterion("DATA197 not like", value, "data197");
            return (Criteria) this;
        }

        public Criteria andData197In(List<String> values) {
            addCriterion("DATA197 in", values, "data197");
            return (Criteria) this;
        }

        public Criteria andData197NotIn(List<String> values) {
            addCriterion("DATA197 not in", values, "data197");
            return (Criteria) this;
        }

        public Criteria andData197Between(String value1, String value2) {
            addCriterion("DATA197 between", value1, value2, "data197");
            return (Criteria) this;
        }

        public Criteria andData197NotBetween(String value1, String value2) {
            addCriterion("DATA197 not between", value1, value2, "data197");
            return (Criteria) this;
        }

        public Criteria andData198IsNull() {
            addCriterion("DATA198 is null");
            return (Criteria) this;
        }

        public Criteria andData198IsNotNull() {
            addCriterion("DATA198 is not null");
            return (Criteria) this;
        }

        public Criteria andData198EqualTo(String value) {
            addCriterion("DATA198 =", value, "data198");
            return (Criteria) this;
        }

        public Criteria andData198NotEqualTo(String value) {
            addCriterion("DATA198 <>", value, "data198");
            return (Criteria) this;
        }

        public Criteria andData198GreaterThan(String value) {
            addCriterion("DATA198 >", value, "data198");
            return (Criteria) this;
        }

        public Criteria andData198GreaterThanOrEqualTo(String value) {
            addCriterion("DATA198 >=", value, "data198");
            return (Criteria) this;
        }

        public Criteria andData198LessThan(String value) {
            addCriterion("DATA198 <", value, "data198");
            return (Criteria) this;
        }

        public Criteria andData198LessThanOrEqualTo(String value) {
            addCriterion("DATA198 <=", value, "data198");
            return (Criteria) this;
        }

        public Criteria andData198Like(String value) {
            addCriterion("DATA198 like", value, "data198");
            return (Criteria) this;
        }

        public Criteria andData198NotLike(String value) {
            addCriterion("DATA198 not like", value, "data198");
            return (Criteria) this;
        }

        public Criteria andData198In(List<String> values) {
            addCriterion("DATA198 in", values, "data198");
            return (Criteria) this;
        }

        public Criteria andData198NotIn(List<String> values) {
            addCriterion("DATA198 not in", values, "data198");
            return (Criteria) this;
        }

        public Criteria andData198Between(String value1, String value2) {
            addCriterion("DATA198 between", value1, value2, "data198");
            return (Criteria) this;
        }

        public Criteria andData198NotBetween(String value1, String value2) {
            addCriterion("DATA198 not between", value1, value2, "data198");
            return (Criteria) this;
        }

        public Criteria andData199IsNull() {
            addCriterion("DATA199 is null");
            return (Criteria) this;
        }

        public Criteria andData199IsNotNull() {
            addCriterion("DATA199 is not null");
            return (Criteria) this;
        }

        public Criteria andData199EqualTo(String value) {
            addCriterion("DATA199 =", value, "data199");
            return (Criteria) this;
        }

        public Criteria andData199NotEqualTo(String value) {
            addCriterion("DATA199 <>", value, "data199");
            return (Criteria) this;
        }

        public Criteria andData199GreaterThan(String value) {
            addCriterion("DATA199 >", value, "data199");
            return (Criteria) this;
        }

        public Criteria andData199GreaterThanOrEqualTo(String value) {
            addCriterion("DATA199 >=", value, "data199");
            return (Criteria) this;
        }

        public Criteria andData199LessThan(String value) {
            addCriterion("DATA199 <", value, "data199");
            return (Criteria) this;
        }

        public Criteria andData199LessThanOrEqualTo(String value) {
            addCriterion("DATA199 <=", value, "data199");
            return (Criteria) this;
        }

        public Criteria andData199Like(String value) {
            addCriterion("DATA199 like", value, "data199");
            return (Criteria) this;
        }

        public Criteria andData199NotLike(String value) {
            addCriterion("DATA199 not like", value, "data199");
            return (Criteria) this;
        }

        public Criteria andData199In(List<String> values) {
            addCriterion("DATA199 in", values, "data199");
            return (Criteria) this;
        }

        public Criteria andData199NotIn(List<String> values) {
            addCriterion("DATA199 not in", values, "data199");
            return (Criteria) this;
        }

        public Criteria andData199Between(String value1, String value2) {
            addCriterion("DATA199 between", value1, value2, "data199");
            return (Criteria) this;
        }

        public Criteria andData199NotBetween(String value1, String value2) {
            addCriterion("DATA199 not between", value1, value2, "data199");
            return (Criteria) this;
        }

        public Criteria andData200IsNull() {
            addCriterion("DATA200 is null");
            return (Criteria) this;
        }

        public Criteria andData200IsNotNull() {
            addCriterion("DATA200 is not null");
            return (Criteria) this;
        }

        public Criteria andData200EqualTo(String value) {
            addCriterion("DATA200 =", value, "data200");
            return (Criteria) this;
        }

        public Criteria andData200NotEqualTo(String value) {
            addCriterion("DATA200 <>", value, "data200");
            return (Criteria) this;
        }

        public Criteria andData200GreaterThan(String value) {
            addCriterion("DATA200 >", value, "data200");
            return (Criteria) this;
        }

        public Criteria andData200GreaterThanOrEqualTo(String value) {
            addCriterion("DATA200 >=", value, "data200");
            return (Criteria) this;
        }

        public Criteria andData200LessThan(String value) {
            addCriterion("DATA200 <", value, "data200");
            return (Criteria) this;
        }

        public Criteria andData200LessThanOrEqualTo(String value) {
            addCriterion("DATA200 <=", value, "data200");
            return (Criteria) this;
        }

        public Criteria andData200Like(String value) {
            addCriterion("DATA200 like", value, "data200");
            return (Criteria) this;
        }

        public Criteria andData200NotLike(String value) {
            addCriterion("DATA200 not like", value, "data200");
            return (Criteria) this;
        }

        public Criteria andData200In(List<String> values) {
            addCriterion("DATA200 in", values, "data200");
            return (Criteria) this;
        }

        public Criteria andData200NotIn(List<String> values) {
            addCriterion("DATA200 not in", values, "data200");
            return (Criteria) this;
        }

        public Criteria andData200Between(String value1, String value2) {
            addCriterion("DATA200 between", value1, value2, "data200");
            return (Criteria) this;
        }

        public Criteria andData200NotBetween(String value1, String value2) {
            addCriterion("DATA200 not between", value1, value2, "data200");
            return (Criteria) this;
        }

        public Criteria andData201IsNull() {
            addCriterion("DATA201 is null");
            return (Criteria) this;
        }

        public Criteria andData201IsNotNull() {
            addCriterion("DATA201 is not null");
            return (Criteria) this;
        }

        public Criteria andData201EqualTo(String value) {
            addCriterion("DATA201 =", value, "data201");
            return (Criteria) this;
        }

        public Criteria andData201NotEqualTo(String value) {
            addCriterion("DATA201 <>", value, "data201");
            return (Criteria) this;
        }

        public Criteria andData201GreaterThan(String value) {
            addCriterion("DATA201 >", value, "data201");
            return (Criteria) this;
        }

        public Criteria andData201GreaterThanOrEqualTo(String value) {
            addCriterion("DATA201 >=", value, "data201");
            return (Criteria) this;
        }

        public Criteria andData201LessThan(String value) {
            addCriterion("DATA201 <", value, "data201");
            return (Criteria) this;
        }

        public Criteria andData201LessThanOrEqualTo(String value) {
            addCriterion("DATA201 <=", value, "data201");
            return (Criteria) this;
        }

        public Criteria andData201Like(String value) {
            addCriterion("DATA201 like", value, "data201");
            return (Criteria) this;
        }

        public Criteria andData201NotLike(String value) {
            addCriterion("DATA201 not like", value, "data201");
            return (Criteria) this;
        }

        public Criteria andData201In(List<String> values) {
            addCriterion("DATA201 in", values, "data201");
            return (Criteria) this;
        }

        public Criteria andData201NotIn(List<String> values) {
            addCriterion("DATA201 not in", values, "data201");
            return (Criteria) this;
        }

        public Criteria andData201Between(String value1, String value2) {
            addCriterion("DATA201 between", value1, value2, "data201");
            return (Criteria) this;
        }

        public Criteria andData201NotBetween(String value1, String value2) {
            addCriterion("DATA201 not between", value1, value2, "data201");
            return (Criteria) this;
        }

        public Criteria andData202IsNull() {
            addCriterion("DATA202 is null");
            return (Criteria) this;
        }

        public Criteria andData202IsNotNull() {
            addCriterion("DATA202 is not null");
            return (Criteria) this;
        }

        public Criteria andData202EqualTo(String value) {
            addCriterion("DATA202 =", value, "data202");
            return (Criteria) this;
        }

        public Criteria andData202NotEqualTo(String value) {
            addCriterion("DATA202 <>", value, "data202");
            return (Criteria) this;
        }

        public Criteria andData202GreaterThan(String value) {
            addCriterion("DATA202 >", value, "data202");
            return (Criteria) this;
        }

        public Criteria andData202GreaterThanOrEqualTo(String value) {
            addCriterion("DATA202 >=", value, "data202");
            return (Criteria) this;
        }

        public Criteria andData202LessThan(String value) {
            addCriterion("DATA202 <", value, "data202");
            return (Criteria) this;
        }

        public Criteria andData202LessThanOrEqualTo(String value) {
            addCriterion("DATA202 <=", value, "data202");
            return (Criteria) this;
        }

        public Criteria andData202Like(String value) {
            addCriterion("DATA202 like", value, "data202");
            return (Criteria) this;
        }

        public Criteria andData202NotLike(String value) {
            addCriterion("DATA202 not like", value, "data202");
            return (Criteria) this;
        }

        public Criteria andData202In(List<String> values) {
            addCriterion("DATA202 in", values, "data202");
            return (Criteria) this;
        }

        public Criteria andData202NotIn(List<String> values) {
            addCriterion("DATA202 not in", values, "data202");
            return (Criteria) this;
        }

        public Criteria andData202Between(String value1, String value2) {
            addCriterion("DATA202 between", value1, value2, "data202");
            return (Criteria) this;
        }

        public Criteria andData202NotBetween(String value1, String value2) {
            addCriterion("DATA202 not between", value1, value2, "data202");
            return (Criteria) this;
        }

        public Criteria andData203IsNull() {
            addCriterion("DATA203 is null");
            return (Criteria) this;
        }

        public Criteria andData203IsNotNull() {
            addCriterion("DATA203 is not null");
            return (Criteria) this;
        }

        public Criteria andData203EqualTo(String value) {
            addCriterion("DATA203 =", value, "data203");
            return (Criteria) this;
        }

        public Criteria andData203NotEqualTo(String value) {
            addCriterion("DATA203 <>", value, "data203");
            return (Criteria) this;
        }

        public Criteria andData203GreaterThan(String value) {
            addCriterion("DATA203 >", value, "data203");
            return (Criteria) this;
        }

        public Criteria andData203GreaterThanOrEqualTo(String value) {
            addCriterion("DATA203 >=", value, "data203");
            return (Criteria) this;
        }

        public Criteria andData203LessThan(String value) {
            addCriterion("DATA203 <", value, "data203");
            return (Criteria) this;
        }

        public Criteria andData203LessThanOrEqualTo(String value) {
            addCriterion("DATA203 <=", value, "data203");
            return (Criteria) this;
        }

        public Criteria andData203Like(String value) {
            addCriterion("DATA203 like", value, "data203");
            return (Criteria) this;
        }

        public Criteria andData203NotLike(String value) {
            addCriterion("DATA203 not like", value, "data203");
            return (Criteria) this;
        }

        public Criteria andData203In(List<String> values) {
            addCriterion("DATA203 in", values, "data203");
            return (Criteria) this;
        }

        public Criteria andData203NotIn(List<String> values) {
            addCriterion("DATA203 not in", values, "data203");
            return (Criteria) this;
        }

        public Criteria andData203Between(String value1, String value2) {
            addCriterion("DATA203 between", value1, value2, "data203");
            return (Criteria) this;
        }

        public Criteria andData203NotBetween(String value1, String value2) {
            addCriterion("DATA203 not between", value1, value2, "data203");
            return (Criteria) this;
        }

        public Criteria andData204IsNull() {
            addCriterion("DATA204 is null");
            return (Criteria) this;
        }

        public Criteria andData204IsNotNull() {
            addCriterion("DATA204 is not null");
            return (Criteria) this;
        }

        public Criteria andData204EqualTo(String value) {
            addCriterion("DATA204 =", value, "data204");
            return (Criteria) this;
        }

        public Criteria andData204NotEqualTo(String value) {
            addCriterion("DATA204 <>", value, "data204");
            return (Criteria) this;
        }

        public Criteria andData204GreaterThan(String value) {
            addCriterion("DATA204 >", value, "data204");
            return (Criteria) this;
        }

        public Criteria andData204GreaterThanOrEqualTo(String value) {
            addCriterion("DATA204 >=", value, "data204");
            return (Criteria) this;
        }

        public Criteria andData204LessThan(String value) {
            addCriterion("DATA204 <", value, "data204");
            return (Criteria) this;
        }

        public Criteria andData204LessThanOrEqualTo(String value) {
            addCriterion("DATA204 <=", value, "data204");
            return (Criteria) this;
        }

        public Criteria andData204Like(String value) {
            addCriterion("DATA204 like", value, "data204");
            return (Criteria) this;
        }

        public Criteria andData204NotLike(String value) {
            addCriterion("DATA204 not like", value, "data204");
            return (Criteria) this;
        }

        public Criteria andData204In(List<String> values) {
            addCriterion("DATA204 in", values, "data204");
            return (Criteria) this;
        }

        public Criteria andData204NotIn(List<String> values) {
            addCriterion("DATA204 not in", values, "data204");
            return (Criteria) this;
        }

        public Criteria andData204Between(String value1, String value2) {
            addCriterion("DATA204 between", value1, value2, "data204");
            return (Criteria) this;
        }

        public Criteria andData204NotBetween(String value1, String value2) {
            addCriterion("DATA204 not between", value1, value2, "data204");
            return (Criteria) this;
        }

        public Criteria andData205IsNull() {
            addCriterion("DATA205 is null");
            return (Criteria) this;
        }

        public Criteria andData205IsNotNull() {
            addCriterion("DATA205 is not null");
            return (Criteria) this;
        }

        public Criteria andData205EqualTo(String value) {
            addCriterion("DATA205 =", value, "data205");
            return (Criteria) this;
        }

        public Criteria andData205NotEqualTo(String value) {
            addCriterion("DATA205 <>", value, "data205");
            return (Criteria) this;
        }

        public Criteria andData205GreaterThan(String value) {
            addCriterion("DATA205 >", value, "data205");
            return (Criteria) this;
        }

        public Criteria andData205GreaterThanOrEqualTo(String value) {
            addCriterion("DATA205 >=", value, "data205");
            return (Criteria) this;
        }

        public Criteria andData205LessThan(String value) {
            addCriterion("DATA205 <", value, "data205");
            return (Criteria) this;
        }

        public Criteria andData205LessThanOrEqualTo(String value) {
            addCriterion("DATA205 <=", value, "data205");
            return (Criteria) this;
        }

        public Criteria andData205Like(String value) {
            addCriterion("DATA205 like", value, "data205");
            return (Criteria) this;
        }

        public Criteria andData205NotLike(String value) {
            addCriterion("DATA205 not like", value, "data205");
            return (Criteria) this;
        }

        public Criteria andData205In(List<String> values) {
            addCriterion("DATA205 in", values, "data205");
            return (Criteria) this;
        }

        public Criteria andData205NotIn(List<String> values) {
            addCriterion("DATA205 not in", values, "data205");
            return (Criteria) this;
        }

        public Criteria andData205Between(String value1, String value2) {
            addCriterion("DATA205 between", value1, value2, "data205");
            return (Criteria) this;
        }

        public Criteria andData205NotBetween(String value1, String value2) {
            addCriterion("DATA205 not between", value1, value2, "data205");
            return (Criteria) this;
        }

        public Criteria andData206IsNull() {
            addCriterion("DATA206 is null");
            return (Criteria) this;
        }

        public Criteria andData206IsNotNull() {
            addCriterion("DATA206 is not null");
            return (Criteria) this;
        }

        public Criteria andData206EqualTo(String value) {
            addCriterion("DATA206 =", value, "data206");
            return (Criteria) this;
        }

        public Criteria andData206NotEqualTo(String value) {
            addCriterion("DATA206 <>", value, "data206");
            return (Criteria) this;
        }

        public Criteria andData206GreaterThan(String value) {
            addCriterion("DATA206 >", value, "data206");
            return (Criteria) this;
        }

        public Criteria andData206GreaterThanOrEqualTo(String value) {
            addCriterion("DATA206 >=", value, "data206");
            return (Criteria) this;
        }

        public Criteria andData206LessThan(String value) {
            addCriterion("DATA206 <", value, "data206");
            return (Criteria) this;
        }

        public Criteria andData206LessThanOrEqualTo(String value) {
            addCriterion("DATA206 <=", value, "data206");
            return (Criteria) this;
        }

        public Criteria andData206Like(String value) {
            addCriterion("DATA206 like", value, "data206");
            return (Criteria) this;
        }

        public Criteria andData206NotLike(String value) {
            addCriterion("DATA206 not like", value, "data206");
            return (Criteria) this;
        }

        public Criteria andData206In(List<String> values) {
            addCriterion("DATA206 in", values, "data206");
            return (Criteria) this;
        }

        public Criteria andData206NotIn(List<String> values) {
            addCriterion("DATA206 not in", values, "data206");
            return (Criteria) this;
        }

        public Criteria andData206Between(String value1, String value2) {
            addCriterion("DATA206 between", value1, value2, "data206");
            return (Criteria) this;
        }

        public Criteria andData206NotBetween(String value1, String value2) {
            addCriterion("DATA206 not between", value1, value2, "data206");
            return (Criteria) this;
        }

        public Criteria andData207IsNull() {
            addCriterion("DATA207 is null");
            return (Criteria) this;
        }

        public Criteria andData207IsNotNull() {
            addCriterion("DATA207 is not null");
            return (Criteria) this;
        }

        public Criteria andData207EqualTo(String value) {
            addCriterion("DATA207 =", value, "data207");
            return (Criteria) this;
        }

        public Criteria andData207NotEqualTo(String value) {
            addCriterion("DATA207 <>", value, "data207");
            return (Criteria) this;
        }

        public Criteria andData207GreaterThan(String value) {
            addCriterion("DATA207 >", value, "data207");
            return (Criteria) this;
        }

        public Criteria andData207GreaterThanOrEqualTo(String value) {
            addCriterion("DATA207 >=", value, "data207");
            return (Criteria) this;
        }

        public Criteria andData207LessThan(String value) {
            addCriterion("DATA207 <", value, "data207");
            return (Criteria) this;
        }

        public Criteria andData207LessThanOrEqualTo(String value) {
            addCriterion("DATA207 <=", value, "data207");
            return (Criteria) this;
        }

        public Criteria andData207Like(String value) {
            addCriterion("DATA207 like", value, "data207");
            return (Criteria) this;
        }

        public Criteria andData207NotLike(String value) {
            addCriterion("DATA207 not like", value, "data207");
            return (Criteria) this;
        }

        public Criteria andData207In(List<String> values) {
            addCriterion("DATA207 in", values, "data207");
            return (Criteria) this;
        }

        public Criteria andData207NotIn(List<String> values) {
            addCriterion("DATA207 not in", values, "data207");
            return (Criteria) this;
        }

        public Criteria andData207Between(String value1, String value2) {
            addCriterion("DATA207 between", value1, value2, "data207");
            return (Criteria) this;
        }

        public Criteria andData207NotBetween(String value1, String value2) {
            addCriterion("DATA207 not between", value1, value2, "data207");
            return (Criteria) this;
        }

        public Criteria andData208IsNull() {
            addCriterion("DATA208 is null");
            return (Criteria) this;
        }

        public Criteria andData208IsNotNull() {
            addCriterion("DATA208 is not null");
            return (Criteria) this;
        }

        public Criteria andData208EqualTo(String value) {
            addCriterion("DATA208 =", value, "data208");
            return (Criteria) this;
        }

        public Criteria andData208NotEqualTo(String value) {
            addCriterion("DATA208 <>", value, "data208");
            return (Criteria) this;
        }

        public Criteria andData208GreaterThan(String value) {
            addCriterion("DATA208 >", value, "data208");
            return (Criteria) this;
        }

        public Criteria andData208GreaterThanOrEqualTo(String value) {
            addCriterion("DATA208 >=", value, "data208");
            return (Criteria) this;
        }

        public Criteria andData208LessThan(String value) {
            addCriterion("DATA208 <", value, "data208");
            return (Criteria) this;
        }

        public Criteria andData208LessThanOrEqualTo(String value) {
            addCriterion("DATA208 <=", value, "data208");
            return (Criteria) this;
        }

        public Criteria andData208Like(String value) {
            addCriterion("DATA208 like", value, "data208");
            return (Criteria) this;
        }

        public Criteria andData208NotLike(String value) {
            addCriterion("DATA208 not like", value, "data208");
            return (Criteria) this;
        }

        public Criteria andData208In(List<String> values) {
            addCriterion("DATA208 in", values, "data208");
            return (Criteria) this;
        }

        public Criteria andData208NotIn(List<String> values) {
            addCriterion("DATA208 not in", values, "data208");
            return (Criteria) this;
        }

        public Criteria andData208Between(String value1, String value2) {
            addCriterion("DATA208 between", value1, value2, "data208");
            return (Criteria) this;
        }

        public Criteria andData208NotBetween(String value1, String value2) {
            addCriterion("DATA208 not between", value1, value2, "data208");
            return (Criteria) this;
        }

        public Criteria andData209IsNull() {
            addCriterion("DATA209 is null");
            return (Criteria) this;
        }

        public Criteria andData209IsNotNull() {
            addCriterion("DATA209 is not null");
            return (Criteria) this;
        }

        public Criteria andData209EqualTo(String value) {
            addCriterion("DATA209 =", value, "data209");
            return (Criteria) this;
        }

        public Criteria andData209NotEqualTo(String value) {
            addCriterion("DATA209 <>", value, "data209");
            return (Criteria) this;
        }

        public Criteria andData209GreaterThan(String value) {
            addCriterion("DATA209 >", value, "data209");
            return (Criteria) this;
        }

        public Criteria andData209GreaterThanOrEqualTo(String value) {
            addCriterion("DATA209 >=", value, "data209");
            return (Criteria) this;
        }

        public Criteria andData209LessThan(String value) {
            addCriterion("DATA209 <", value, "data209");
            return (Criteria) this;
        }

        public Criteria andData209LessThanOrEqualTo(String value) {
            addCriterion("DATA209 <=", value, "data209");
            return (Criteria) this;
        }

        public Criteria andData209Like(String value) {
            addCriterion("DATA209 like", value, "data209");
            return (Criteria) this;
        }

        public Criteria andData209NotLike(String value) {
            addCriterion("DATA209 not like", value, "data209");
            return (Criteria) this;
        }

        public Criteria andData209In(List<String> values) {
            addCriterion("DATA209 in", values, "data209");
            return (Criteria) this;
        }

        public Criteria andData209NotIn(List<String> values) {
            addCriterion("DATA209 not in", values, "data209");
            return (Criteria) this;
        }

        public Criteria andData209Between(String value1, String value2) {
            addCriterion("DATA209 between", value1, value2, "data209");
            return (Criteria) this;
        }

        public Criteria andData209NotBetween(String value1, String value2) {
            addCriterion("DATA209 not between", value1, value2, "data209");
            return (Criteria) this;
        }

        public Criteria andData210IsNull() {
            addCriterion("DATA210 is null");
            return (Criteria) this;
        }

        public Criteria andData210IsNotNull() {
            addCriterion("DATA210 is not null");
            return (Criteria) this;
        }

        public Criteria andData210EqualTo(String value) {
            addCriterion("DATA210 =", value, "data210");
            return (Criteria) this;
        }

        public Criteria andData210NotEqualTo(String value) {
            addCriterion("DATA210 <>", value, "data210");
            return (Criteria) this;
        }

        public Criteria andData210GreaterThan(String value) {
            addCriterion("DATA210 >", value, "data210");
            return (Criteria) this;
        }

        public Criteria andData210GreaterThanOrEqualTo(String value) {
            addCriterion("DATA210 >=", value, "data210");
            return (Criteria) this;
        }

        public Criteria andData210LessThan(String value) {
            addCriterion("DATA210 <", value, "data210");
            return (Criteria) this;
        }

        public Criteria andData210LessThanOrEqualTo(String value) {
            addCriterion("DATA210 <=", value, "data210");
            return (Criteria) this;
        }

        public Criteria andData210Like(String value) {
            addCriterion("DATA210 like", value, "data210");
            return (Criteria) this;
        }

        public Criteria andData210NotLike(String value) {
            addCriterion("DATA210 not like", value, "data210");
            return (Criteria) this;
        }

        public Criteria andData210In(List<String> values) {
            addCriterion("DATA210 in", values, "data210");
            return (Criteria) this;
        }

        public Criteria andData210NotIn(List<String> values) {
            addCriterion("DATA210 not in", values, "data210");
            return (Criteria) this;
        }

        public Criteria andData210Between(String value1, String value2) {
            addCriterion("DATA210 between", value1, value2, "data210");
            return (Criteria) this;
        }

        public Criteria andData210NotBetween(String value1, String value2) {
            addCriterion("DATA210 not between", value1, value2, "data210");
            return (Criteria) this;
        }

        public Criteria andData211IsNull() {
            addCriterion("DATA211 is null");
            return (Criteria) this;
        }

        public Criteria andData211IsNotNull() {
            addCriterion("DATA211 is not null");
            return (Criteria) this;
        }

        public Criteria andData211EqualTo(String value) {
            addCriterion("DATA211 =", value, "data211");
            return (Criteria) this;
        }

        public Criteria andData211NotEqualTo(String value) {
            addCriterion("DATA211 <>", value, "data211");
            return (Criteria) this;
        }

        public Criteria andData211GreaterThan(String value) {
            addCriterion("DATA211 >", value, "data211");
            return (Criteria) this;
        }

        public Criteria andData211GreaterThanOrEqualTo(String value) {
            addCriterion("DATA211 >=", value, "data211");
            return (Criteria) this;
        }

        public Criteria andData211LessThan(String value) {
            addCriterion("DATA211 <", value, "data211");
            return (Criteria) this;
        }

        public Criteria andData211LessThanOrEqualTo(String value) {
            addCriterion("DATA211 <=", value, "data211");
            return (Criteria) this;
        }

        public Criteria andData211Like(String value) {
            addCriterion("DATA211 like", value, "data211");
            return (Criteria) this;
        }

        public Criteria andData211NotLike(String value) {
            addCriterion("DATA211 not like", value, "data211");
            return (Criteria) this;
        }

        public Criteria andData211In(List<String> values) {
            addCriterion("DATA211 in", values, "data211");
            return (Criteria) this;
        }

        public Criteria andData211NotIn(List<String> values) {
            addCriterion("DATA211 not in", values, "data211");
            return (Criteria) this;
        }

        public Criteria andData211Between(String value1, String value2) {
            addCriterion("DATA211 between", value1, value2, "data211");
            return (Criteria) this;
        }

        public Criteria andData211NotBetween(String value1, String value2) {
            addCriterion("DATA211 not between", value1, value2, "data211");
            return (Criteria) this;
        }

        public Criteria andData212IsNull() {
            addCriterion("DATA212 is null");
            return (Criteria) this;
        }

        public Criteria andData212IsNotNull() {
            addCriterion("DATA212 is not null");
            return (Criteria) this;
        }

        public Criteria andData212EqualTo(String value) {
            addCriterion("DATA212 =", value, "data212");
            return (Criteria) this;
        }

        public Criteria andData212NotEqualTo(String value) {
            addCriterion("DATA212 <>", value, "data212");
            return (Criteria) this;
        }

        public Criteria andData212GreaterThan(String value) {
            addCriterion("DATA212 >", value, "data212");
            return (Criteria) this;
        }

        public Criteria andData212GreaterThanOrEqualTo(String value) {
            addCriterion("DATA212 >=", value, "data212");
            return (Criteria) this;
        }

        public Criteria andData212LessThan(String value) {
            addCriterion("DATA212 <", value, "data212");
            return (Criteria) this;
        }

        public Criteria andData212LessThanOrEqualTo(String value) {
            addCriterion("DATA212 <=", value, "data212");
            return (Criteria) this;
        }

        public Criteria andData212Like(String value) {
            addCriterion("DATA212 like", value, "data212");
            return (Criteria) this;
        }

        public Criteria andData212NotLike(String value) {
            addCriterion("DATA212 not like", value, "data212");
            return (Criteria) this;
        }

        public Criteria andData212In(List<String> values) {
            addCriterion("DATA212 in", values, "data212");
            return (Criteria) this;
        }

        public Criteria andData212NotIn(List<String> values) {
            addCriterion("DATA212 not in", values, "data212");
            return (Criteria) this;
        }

        public Criteria andData212Between(String value1, String value2) {
            addCriterion("DATA212 between", value1, value2, "data212");
            return (Criteria) this;
        }

        public Criteria andData212NotBetween(String value1, String value2) {
            addCriterion("DATA212 not between", value1, value2, "data212");
            return (Criteria) this;
        }

        public Criteria andData213IsNull() {
            addCriterion("DATA213 is null");
            return (Criteria) this;
        }

        public Criteria andData213IsNotNull() {
            addCriterion("DATA213 is not null");
            return (Criteria) this;
        }

        public Criteria andData213EqualTo(String value) {
            addCriterion("DATA213 =", value, "data213");
            return (Criteria) this;
        }

        public Criteria andData213NotEqualTo(String value) {
            addCriterion("DATA213 <>", value, "data213");
            return (Criteria) this;
        }

        public Criteria andData213GreaterThan(String value) {
            addCriterion("DATA213 >", value, "data213");
            return (Criteria) this;
        }

        public Criteria andData213GreaterThanOrEqualTo(String value) {
            addCriterion("DATA213 >=", value, "data213");
            return (Criteria) this;
        }

        public Criteria andData213LessThan(String value) {
            addCriterion("DATA213 <", value, "data213");
            return (Criteria) this;
        }

        public Criteria andData213LessThanOrEqualTo(String value) {
            addCriterion("DATA213 <=", value, "data213");
            return (Criteria) this;
        }

        public Criteria andData213Like(String value) {
            addCriterion("DATA213 like", value, "data213");
            return (Criteria) this;
        }

        public Criteria andData213NotLike(String value) {
            addCriterion("DATA213 not like", value, "data213");
            return (Criteria) this;
        }

        public Criteria andData213In(List<String> values) {
            addCriterion("DATA213 in", values, "data213");
            return (Criteria) this;
        }

        public Criteria andData213NotIn(List<String> values) {
            addCriterion("DATA213 not in", values, "data213");
            return (Criteria) this;
        }

        public Criteria andData213Between(String value1, String value2) {
            addCriterion("DATA213 between", value1, value2, "data213");
            return (Criteria) this;
        }

        public Criteria andData213NotBetween(String value1, String value2) {
            addCriterion("DATA213 not between", value1, value2, "data213");
            return (Criteria) this;
        }

        public Criteria andData214IsNull() {
            addCriterion("DATA214 is null");
            return (Criteria) this;
        }

        public Criteria andData214IsNotNull() {
            addCriterion("DATA214 is not null");
            return (Criteria) this;
        }

        public Criteria andData214EqualTo(String value) {
            addCriterion("DATA214 =", value, "data214");
            return (Criteria) this;
        }

        public Criteria andData214NotEqualTo(String value) {
            addCriterion("DATA214 <>", value, "data214");
            return (Criteria) this;
        }

        public Criteria andData214GreaterThan(String value) {
            addCriterion("DATA214 >", value, "data214");
            return (Criteria) this;
        }

        public Criteria andData214GreaterThanOrEqualTo(String value) {
            addCriterion("DATA214 >=", value, "data214");
            return (Criteria) this;
        }

        public Criteria andData214LessThan(String value) {
            addCriterion("DATA214 <", value, "data214");
            return (Criteria) this;
        }

        public Criteria andData214LessThanOrEqualTo(String value) {
            addCriterion("DATA214 <=", value, "data214");
            return (Criteria) this;
        }

        public Criteria andData214Like(String value) {
            addCriterion("DATA214 like", value, "data214");
            return (Criteria) this;
        }

        public Criteria andData214NotLike(String value) {
            addCriterion("DATA214 not like", value, "data214");
            return (Criteria) this;
        }

        public Criteria andData214In(List<String> values) {
            addCriterion("DATA214 in", values, "data214");
            return (Criteria) this;
        }

        public Criteria andData214NotIn(List<String> values) {
            addCriterion("DATA214 not in", values, "data214");
            return (Criteria) this;
        }

        public Criteria andData214Between(String value1, String value2) {
            addCriterion("DATA214 between", value1, value2, "data214");
            return (Criteria) this;
        }

        public Criteria andData214NotBetween(String value1, String value2) {
            addCriterion("DATA214 not between", value1, value2, "data214");
            return (Criteria) this;
        }

        public Criteria andData215IsNull() {
            addCriterion("DATA215 is null");
            return (Criteria) this;
        }

        public Criteria andData215IsNotNull() {
            addCriterion("DATA215 is not null");
            return (Criteria) this;
        }

        public Criteria andData215EqualTo(String value) {
            addCriterion("DATA215 =", value, "data215");
            return (Criteria) this;
        }

        public Criteria andData215NotEqualTo(String value) {
            addCriterion("DATA215 <>", value, "data215");
            return (Criteria) this;
        }

        public Criteria andData215GreaterThan(String value) {
            addCriterion("DATA215 >", value, "data215");
            return (Criteria) this;
        }

        public Criteria andData215GreaterThanOrEqualTo(String value) {
            addCriterion("DATA215 >=", value, "data215");
            return (Criteria) this;
        }

        public Criteria andData215LessThan(String value) {
            addCriterion("DATA215 <", value, "data215");
            return (Criteria) this;
        }

        public Criteria andData215LessThanOrEqualTo(String value) {
            addCriterion("DATA215 <=", value, "data215");
            return (Criteria) this;
        }

        public Criteria andData215Like(String value) {
            addCriterion("DATA215 like", value, "data215");
            return (Criteria) this;
        }

        public Criteria andData215NotLike(String value) {
            addCriterion("DATA215 not like", value, "data215");
            return (Criteria) this;
        }

        public Criteria andData215In(List<String> values) {
            addCriterion("DATA215 in", values, "data215");
            return (Criteria) this;
        }

        public Criteria andData215NotIn(List<String> values) {
            addCriterion("DATA215 not in", values, "data215");
            return (Criteria) this;
        }

        public Criteria andData215Between(String value1, String value2) {
            addCriterion("DATA215 between", value1, value2, "data215");
            return (Criteria) this;
        }

        public Criteria andData215NotBetween(String value1, String value2) {
            addCriterion("DATA215 not between", value1, value2, "data215");
            return (Criteria) this;
        }

        public Criteria andData216IsNull() {
            addCriterion("DATA216 is null");
            return (Criteria) this;
        }

        public Criteria andData216IsNotNull() {
            addCriterion("DATA216 is not null");
            return (Criteria) this;
        }

        public Criteria andData216EqualTo(String value) {
            addCriterion("DATA216 =", value, "data216");
            return (Criteria) this;
        }

        public Criteria andData216NotEqualTo(String value) {
            addCriterion("DATA216 <>", value, "data216");
            return (Criteria) this;
        }

        public Criteria andData216GreaterThan(String value) {
            addCriterion("DATA216 >", value, "data216");
            return (Criteria) this;
        }

        public Criteria andData216GreaterThanOrEqualTo(String value) {
            addCriterion("DATA216 >=", value, "data216");
            return (Criteria) this;
        }

        public Criteria andData216LessThan(String value) {
            addCriterion("DATA216 <", value, "data216");
            return (Criteria) this;
        }

        public Criteria andData216LessThanOrEqualTo(String value) {
            addCriterion("DATA216 <=", value, "data216");
            return (Criteria) this;
        }

        public Criteria andData216Like(String value) {
            addCriterion("DATA216 like", value, "data216");
            return (Criteria) this;
        }

        public Criteria andData216NotLike(String value) {
            addCriterion("DATA216 not like", value, "data216");
            return (Criteria) this;
        }

        public Criteria andData216In(List<String> values) {
            addCriterion("DATA216 in", values, "data216");
            return (Criteria) this;
        }

        public Criteria andData216NotIn(List<String> values) {
            addCriterion("DATA216 not in", values, "data216");
            return (Criteria) this;
        }

        public Criteria andData216Between(String value1, String value2) {
            addCriterion("DATA216 between", value1, value2, "data216");
            return (Criteria) this;
        }

        public Criteria andData216NotBetween(String value1, String value2) {
            addCriterion("DATA216 not between", value1, value2, "data216");
            return (Criteria) this;
        }

        public Criteria andData217IsNull() {
            addCriterion("DATA217 is null");
            return (Criteria) this;
        }

        public Criteria andData217IsNotNull() {
            addCriterion("DATA217 is not null");
            return (Criteria) this;
        }

        public Criteria andData217EqualTo(String value) {
            addCriterion("DATA217 =", value, "data217");
            return (Criteria) this;
        }

        public Criteria andData217NotEqualTo(String value) {
            addCriterion("DATA217 <>", value, "data217");
            return (Criteria) this;
        }

        public Criteria andData217GreaterThan(String value) {
            addCriterion("DATA217 >", value, "data217");
            return (Criteria) this;
        }

        public Criteria andData217GreaterThanOrEqualTo(String value) {
            addCriterion("DATA217 >=", value, "data217");
            return (Criteria) this;
        }

        public Criteria andData217LessThan(String value) {
            addCriterion("DATA217 <", value, "data217");
            return (Criteria) this;
        }

        public Criteria andData217LessThanOrEqualTo(String value) {
            addCriterion("DATA217 <=", value, "data217");
            return (Criteria) this;
        }

        public Criteria andData217Like(String value) {
            addCriterion("DATA217 like", value, "data217");
            return (Criteria) this;
        }

        public Criteria andData217NotLike(String value) {
            addCriterion("DATA217 not like", value, "data217");
            return (Criteria) this;
        }

        public Criteria andData217In(List<String> values) {
            addCriterion("DATA217 in", values, "data217");
            return (Criteria) this;
        }

        public Criteria andData217NotIn(List<String> values) {
            addCriterion("DATA217 not in", values, "data217");
            return (Criteria) this;
        }

        public Criteria andData217Between(String value1, String value2) {
            addCriterion("DATA217 between", value1, value2, "data217");
            return (Criteria) this;
        }

        public Criteria andData217NotBetween(String value1, String value2) {
            addCriterion("DATA217 not between", value1, value2, "data217");
            return (Criteria) this;
        }

        public Criteria andData218IsNull() {
            addCriterion("DATA218 is null");
            return (Criteria) this;
        }

        public Criteria andData218IsNotNull() {
            addCriterion("DATA218 is not null");
            return (Criteria) this;
        }

        public Criteria andData218EqualTo(String value) {
            addCriterion("DATA218 =", value, "data218");
            return (Criteria) this;
        }

        public Criteria andData218NotEqualTo(String value) {
            addCriterion("DATA218 <>", value, "data218");
            return (Criteria) this;
        }

        public Criteria andData218GreaterThan(String value) {
            addCriterion("DATA218 >", value, "data218");
            return (Criteria) this;
        }

        public Criteria andData218GreaterThanOrEqualTo(String value) {
            addCriterion("DATA218 >=", value, "data218");
            return (Criteria) this;
        }

        public Criteria andData218LessThan(String value) {
            addCriterion("DATA218 <", value, "data218");
            return (Criteria) this;
        }

        public Criteria andData218LessThanOrEqualTo(String value) {
            addCriterion("DATA218 <=", value, "data218");
            return (Criteria) this;
        }

        public Criteria andData218Like(String value) {
            addCriterion("DATA218 like", value, "data218");
            return (Criteria) this;
        }

        public Criteria andData218NotLike(String value) {
            addCriterion("DATA218 not like", value, "data218");
            return (Criteria) this;
        }

        public Criteria andData218In(List<String> values) {
            addCriterion("DATA218 in", values, "data218");
            return (Criteria) this;
        }

        public Criteria andData218NotIn(List<String> values) {
            addCriterion("DATA218 not in", values, "data218");
            return (Criteria) this;
        }

        public Criteria andData218Between(String value1, String value2) {
            addCriterion("DATA218 between", value1, value2, "data218");
            return (Criteria) this;
        }

        public Criteria andData218NotBetween(String value1, String value2) {
            addCriterion("DATA218 not between", value1, value2, "data218");
            return (Criteria) this;
        }

        public Criteria andData219IsNull() {
            addCriterion("DATA219 is null");
            return (Criteria) this;
        }

        public Criteria andData219IsNotNull() {
            addCriterion("DATA219 is not null");
            return (Criteria) this;
        }

        public Criteria andData219EqualTo(String value) {
            addCriterion("DATA219 =", value, "data219");
            return (Criteria) this;
        }

        public Criteria andData219NotEqualTo(String value) {
            addCriterion("DATA219 <>", value, "data219");
            return (Criteria) this;
        }

        public Criteria andData219GreaterThan(String value) {
            addCriterion("DATA219 >", value, "data219");
            return (Criteria) this;
        }

        public Criteria andData219GreaterThanOrEqualTo(String value) {
            addCriterion("DATA219 >=", value, "data219");
            return (Criteria) this;
        }

        public Criteria andData219LessThan(String value) {
            addCriterion("DATA219 <", value, "data219");
            return (Criteria) this;
        }

        public Criteria andData219LessThanOrEqualTo(String value) {
            addCriterion("DATA219 <=", value, "data219");
            return (Criteria) this;
        }

        public Criteria andData219Like(String value) {
            addCriterion("DATA219 like", value, "data219");
            return (Criteria) this;
        }

        public Criteria andData219NotLike(String value) {
            addCriterion("DATA219 not like", value, "data219");
            return (Criteria) this;
        }

        public Criteria andData219In(List<String> values) {
            addCriterion("DATA219 in", values, "data219");
            return (Criteria) this;
        }

        public Criteria andData219NotIn(List<String> values) {
            addCriterion("DATA219 not in", values, "data219");
            return (Criteria) this;
        }

        public Criteria andData219Between(String value1, String value2) {
            addCriterion("DATA219 between", value1, value2, "data219");
            return (Criteria) this;
        }

        public Criteria andData219NotBetween(String value1, String value2) {
            addCriterion("DATA219 not between", value1, value2, "data219");
            return (Criteria) this;
        }

        public Criteria andData220IsNull() {
            addCriterion("DATA220 is null");
            return (Criteria) this;
        }

        public Criteria andData220IsNotNull() {
            addCriterion("DATA220 is not null");
            return (Criteria) this;
        }

        public Criteria andData220EqualTo(String value) {
            addCriterion("DATA220 =", value, "data220");
            return (Criteria) this;
        }

        public Criteria andData220NotEqualTo(String value) {
            addCriterion("DATA220 <>", value, "data220");
            return (Criteria) this;
        }

        public Criteria andData220GreaterThan(String value) {
            addCriterion("DATA220 >", value, "data220");
            return (Criteria) this;
        }

        public Criteria andData220GreaterThanOrEqualTo(String value) {
            addCriterion("DATA220 >=", value, "data220");
            return (Criteria) this;
        }

        public Criteria andData220LessThan(String value) {
            addCriterion("DATA220 <", value, "data220");
            return (Criteria) this;
        }

        public Criteria andData220LessThanOrEqualTo(String value) {
            addCriterion("DATA220 <=", value, "data220");
            return (Criteria) this;
        }

        public Criteria andData220Like(String value) {
            addCriterion("DATA220 like", value, "data220");
            return (Criteria) this;
        }

        public Criteria andData220NotLike(String value) {
            addCriterion("DATA220 not like", value, "data220");
            return (Criteria) this;
        }

        public Criteria andData220In(List<String> values) {
            addCriterion("DATA220 in", values, "data220");
            return (Criteria) this;
        }

        public Criteria andData220NotIn(List<String> values) {
            addCriterion("DATA220 not in", values, "data220");
            return (Criteria) this;
        }

        public Criteria andData220Between(String value1, String value2) {
            addCriterion("DATA220 between", value1, value2, "data220");
            return (Criteria) this;
        }

        public Criteria andData220NotBetween(String value1, String value2) {
            addCriterion("DATA220 not between", value1, value2, "data220");
            return (Criteria) this;
        }

        public Criteria andData221IsNull() {
            addCriterion("DATA221 is null");
            return (Criteria) this;
        }

        public Criteria andData221IsNotNull() {
            addCriterion("DATA221 is not null");
            return (Criteria) this;
        }

        public Criteria andData221EqualTo(String value) {
            addCriterion("DATA221 =", value, "data221");
            return (Criteria) this;
        }

        public Criteria andData221NotEqualTo(String value) {
            addCriterion("DATA221 <>", value, "data221");
            return (Criteria) this;
        }

        public Criteria andData221GreaterThan(String value) {
            addCriterion("DATA221 >", value, "data221");
            return (Criteria) this;
        }

        public Criteria andData221GreaterThanOrEqualTo(String value) {
            addCriterion("DATA221 >=", value, "data221");
            return (Criteria) this;
        }

        public Criteria andData221LessThan(String value) {
            addCriterion("DATA221 <", value, "data221");
            return (Criteria) this;
        }

        public Criteria andData221LessThanOrEqualTo(String value) {
            addCriterion("DATA221 <=", value, "data221");
            return (Criteria) this;
        }

        public Criteria andData221Like(String value) {
            addCriterion("DATA221 like", value, "data221");
            return (Criteria) this;
        }

        public Criteria andData221NotLike(String value) {
            addCriterion("DATA221 not like", value, "data221");
            return (Criteria) this;
        }

        public Criteria andData221In(List<String> values) {
            addCriterion("DATA221 in", values, "data221");
            return (Criteria) this;
        }

        public Criteria andData221NotIn(List<String> values) {
            addCriterion("DATA221 not in", values, "data221");
            return (Criteria) this;
        }

        public Criteria andData221Between(String value1, String value2) {
            addCriterion("DATA221 between", value1, value2, "data221");
            return (Criteria) this;
        }

        public Criteria andData221NotBetween(String value1, String value2) {
            addCriterion("DATA221 not between", value1, value2, "data221");
            return (Criteria) this;
        }

        public Criteria andData222IsNull() {
            addCriterion("DATA222 is null");
            return (Criteria) this;
        }

        public Criteria andData222IsNotNull() {
            addCriterion("DATA222 is not null");
            return (Criteria) this;
        }

        public Criteria andData222EqualTo(String value) {
            addCriterion("DATA222 =", value, "data222");
            return (Criteria) this;
        }

        public Criteria andData222NotEqualTo(String value) {
            addCriterion("DATA222 <>", value, "data222");
            return (Criteria) this;
        }

        public Criteria andData222GreaterThan(String value) {
            addCriterion("DATA222 >", value, "data222");
            return (Criteria) this;
        }

        public Criteria andData222GreaterThanOrEqualTo(String value) {
            addCriterion("DATA222 >=", value, "data222");
            return (Criteria) this;
        }

        public Criteria andData222LessThan(String value) {
            addCriterion("DATA222 <", value, "data222");
            return (Criteria) this;
        }

        public Criteria andData222LessThanOrEqualTo(String value) {
            addCriterion("DATA222 <=", value, "data222");
            return (Criteria) this;
        }

        public Criteria andData222Like(String value) {
            addCriterion("DATA222 like", value, "data222");
            return (Criteria) this;
        }

        public Criteria andData222NotLike(String value) {
            addCriterion("DATA222 not like", value, "data222");
            return (Criteria) this;
        }

        public Criteria andData222In(List<String> values) {
            addCriterion("DATA222 in", values, "data222");
            return (Criteria) this;
        }

        public Criteria andData222NotIn(List<String> values) {
            addCriterion("DATA222 not in", values, "data222");
            return (Criteria) this;
        }

        public Criteria andData222Between(String value1, String value2) {
            addCriterion("DATA222 between", value1, value2, "data222");
            return (Criteria) this;
        }

        public Criteria andData222NotBetween(String value1, String value2) {
            addCriterion("DATA222 not between", value1, value2, "data222");
            return (Criteria) this;
        }

        public Criteria andData223IsNull() {
            addCriterion("DATA223 is null");
            return (Criteria) this;
        }

        public Criteria andData223IsNotNull() {
            addCriterion("DATA223 is not null");
            return (Criteria) this;
        }

        public Criteria andData223EqualTo(String value) {
            addCriterion("DATA223 =", value, "data223");
            return (Criteria) this;
        }

        public Criteria andData223NotEqualTo(String value) {
            addCriterion("DATA223 <>", value, "data223");
            return (Criteria) this;
        }

        public Criteria andData223GreaterThan(String value) {
            addCriterion("DATA223 >", value, "data223");
            return (Criteria) this;
        }

        public Criteria andData223GreaterThanOrEqualTo(String value) {
            addCriterion("DATA223 >=", value, "data223");
            return (Criteria) this;
        }

        public Criteria andData223LessThan(String value) {
            addCriterion("DATA223 <", value, "data223");
            return (Criteria) this;
        }

        public Criteria andData223LessThanOrEqualTo(String value) {
            addCriterion("DATA223 <=", value, "data223");
            return (Criteria) this;
        }

        public Criteria andData223Like(String value) {
            addCriterion("DATA223 like", value, "data223");
            return (Criteria) this;
        }

        public Criteria andData223NotLike(String value) {
            addCriterion("DATA223 not like", value, "data223");
            return (Criteria) this;
        }

        public Criteria andData223In(List<String> values) {
            addCriterion("DATA223 in", values, "data223");
            return (Criteria) this;
        }

        public Criteria andData223NotIn(List<String> values) {
            addCriterion("DATA223 not in", values, "data223");
            return (Criteria) this;
        }

        public Criteria andData223Between(String value1, String value2) {
            addCriterion("DATA223 between", value1, value2, "data223");
            return (Criteria) this;
        }

        public Criteria andData223NotBetween(String value1, String value2) {
            addCriterion("DATA223 not between", value1, value2, "data223");
            return (Criteria) this;
        }

        public Criteria andData224IsNull() {
            addCriterion("DATA224 is null");
            return (Criteria) this;
        }

        public Criteria andData224IsNotNull() {
            addCriterion("DATA224 is not null");
            return (Criteria) this;
        }

        public Criteria andData224EqualTo(String value) {
            addCriterion("DATA224 =", value, "data224");
            return (Criteria) this;
        }

        public Criteria andData224NotEqualTo(String value) {
            addCriterion("DATA224 <>", value, "data224");
            return (Criteria) this;
        }

        public Criteria andData224GreaterThan(String value) {
            addCriterion("DATA224 >", value, "data224");
            return (Criteria) this;
        }

        public Criteria andData224GreaterThanOrEqualTo(String value) {
            addCriterion("DATA224 >=", value, "data224");
            return (Criteria) this;
        }

        public Criteria andData224LessThan(String value) {
            addCriterion("DATA224 <", value, "data224");
            return (Criteria) this;
        }

        public Criteria andData224LessThanOrEqualTo(String value) {
            addCriterion("DATA224 <=", value, "data224");
            return (Criteria) this;
        }

        public Criteria andData224Like(String value) {
            addCriterion("DATA224 like", value, "data224");
            return (Criteria) this;
        }

        public Criteria andData224NotLike(String value) {
            addCriterion("DATA224 not like", value, "data224");
            return (Criteria) this;
        }

        public Criteria andData224In(List<String> values) {
            addCriterion("DATA224 in", values, "data224");
            return (Criteria) this;
        }

        public Criteria andData224NotIn(List<String> values) {
            addCriterion("DATA224 not in", values, "data224");
            return (Criteria) this;
        }

        public Criteria andData224Between(String value1, String value2) {
            addCriterion("DATA224 between", value1, value2, "data224");
            return (Criteria) this;
        }

        public Criteria andData224NotBetween(String value1, String value2) {
            addCriterion("DATA224 not between", value1, value2, "data224");
            return (Criteria) this;
        }

        public Criteria andData225IsNull() {
            addCriterion("DATA225 is null");
            return (Criteria) this;
        }

        public Criteria andData225IsNotNull() {
            addCriterion("DATA225 is not null");
            return (Criteria) this;
        }

        public Criteria andData225EqualTo(String value) {
            addCriterion("DATA225 =", value, "data225");
            return (Criteria) this;
        }

        public Criteria andData225NotEqualTo(String value) {
            addCriterion("DATA225 <>", value, "data225");
            return (Criteria) this;
        }

        public Criteria andData225GreaterThan(String value) {
            addCriterion("DATA225 >", value, "data225");
            return (Criteria) this;
        }

        public Criteria andData225GreaterThanOrEqualTo(String value) {
            addCriterion("DATA225 >=", value, "data225");
            return (Criteria) this;
        }

        public Criteria andData225LessThan(String value) {
            addCriterion("DATA225 <", value, "data225");
            return (Criteria) this;
        }

        public Criteria andData225LessThanOrEqualTo(String value) {
            addCriterion("DATA225 <=", value, "data225");
            return (Criteria) this;
        }

        public Criteria andData225Like(String value) {
            addCriterion("DATA225 like", value, "data225");
            return (Criteria) this;
        }

        public Criteria andData225NotLike(String value) {
            addCriterion("DATA225 not like", value, "data225");
            return (Criteria) this;
        }

        public Criteria andData225In(List<String> values) {
            addCriterion("DATA225 in", values, "data225");
            return (Criteria) this;
        }

        public Criteria andData225NotIn(List<String> values) {
            addCriterion("DATA225 not in", values, "data225");
            return (Criteria) this;
        }

        public Criteria andData225Between(String value1, String value2) {
            addCriterion("DATA225 between", value1, value2, "data225");
            return (Criteria) this;
        }

        public Criteria andData225NotBetween(String value1, String value2) {
            addCriterion("DATA225 not between", value1, value2, "data225");
            return (Criteria) this;
        }

        public Criteria andData226IsNull() {
            addCriterion("DATA226 is null");
            return (Criteria) this;
        }

        public Criteria andData226IsNotNull() {
            addCriterion("DATA226 is not null");
            return (Criteria) this;
        }

        public Criteria andData226EqualTo(String value) {
            addCriterion("DATA226 =", value, "data226");
            return (Criteria) this;
        }

        public Criteria andData226NotEqualTo(String value) {
            addCriterion("DATA226 <>", value, "data226");
            return (Criteria) this;
        }

        public Criteria andData226GreaterThan(String value) {
            addCriterion("DATA226 >", value, "data226");
            return (Criteria) this;
        }

        public Criteria andData226GreaterThanOrEqualTo(String value) {
            addCriterion("DATA226 >=", value, "data226");
            return (Criteria) this;
        }

        public Criteria andData226LessThan(String value) {
            addCriterion("DATA226 <", value, "data226");
            return (Criteria) this;
        }

        public Criteria andData226LessThanOrEqualTo(String value) {
            addCriterion("DATA226 <=", value, "data226");
            return (Criteria) this;
        }

        public Criteria andData226Like(String value) {
            addCriterion("DATA226 like", value, "data226");
            return (Criteria) this;
        }

        public Criteria andData226NotLike(String value) {
            addCriterion("DATA226 not like", value, "data226");
            return (Criteria) this;
        }

        public Criteria andData226In(List<String> values) {
            addCriterion("DATA226 in", values, "data226");
            return (Criteria) this;
        }

        public Criteria andData226NotIn(List<String> values) {
            addCriterion("DATA226 not in", values, "data226");
            return (Criteria) this;
        }

        public Criteria andData226Between(String value1, String value2) {
            addCriterion("DATA226 between", value1, value2, "data226");
            return (Criteria) this;
        }

        public Criteria andData226NotBetween(String value1, String value2) {
            addCriterion("DATA226 not between", value1, value2, "data226");
            return (Criteria) this;
        }

        public Criteria andData227IsNull() {
            addCriterion("DATA227 is null");
            return (Criteria) this;
        }

        public Criteria andData227IsNotNull() {
            addCriterion("DATA227 is not null");
            return (Criteria) this;
        }

        public Criteria andData227EqualTo(String value) {
            addCriterion("DATA227 =", value, "data227");
            return (Criteria) this;
        }

        public Criteria andData227NotEqualTo(String value) {
            addCriterion("DATA227 <>", value, "data227");
            return (Criteria) this;
        }

        public Criteria andData227GreaterThan(String value) {
            addCriterion("DATA227 >", value, "data227");
            return (Criteria) this;
        }

        public Criteria andData227GreaterThanOrEqualTo(String value) {
            addCriterion("DATA227 >=", value, "data227");
            return (Criteria) this;
        }

        public Criteria andData227LessThan(String value) {
            addCriterion("DATA227 <", value, "data227");
            return (Criteria) this;
        }

        public Criteria andData227LessThanOrEqualTo(String value) {
            addCriterion("DATA227 <=", value, "data227");
            return (Criteria) this;
        }

        public Criteria andData227Like(String value) {
            addCriterion("DATA227 like", value, "data227");
            return (Criteria) this;
        }

        public Criteria andData227NotLike(String value) {
            addCriterion("DATA227 not like", value, "data227");
            return (Criteria) this;
        }

        public Criteria andData227In(List<String> values) {
            addCriterion("DATA227 in", values, "data227");
            return (Criteria) this;
        }

        public Criteria andData227NotIn(List<String> values) {
            addCriterion("DATA227 not in", values, "data227");
            return (Criteria) this;
        }

        public Criteria andData227Between(String value1, String value2) {
            addCriterion("DATA227 between", value1, value2, "data227");
            return (Criteria) this;
        }

        public Criteria andData227NotBetween(String value1, String value2) {
            addCriterion("DATA227 not between", value1, value2, "data227");
            return (Criteria) this;
        }

        public Criteria andData228IsNull() {
            addCriterion("DATA228 is null");
            return (Criteria) this;
        }

        public Criteria andData228IsNotNull() {
            addCriterion("DATA228 is not null");
            return (Criteria) this;
        }

        public Criteria andData228EqualTo(String value) {
            addCriterion("DATA228 =", value, "data228");
            return (Criteria) this;
        }

        public Criteria andData228NotEqualTo(String value) {
            addCriterion("DATA228 <>", value, "data228");
            return (Criteria) this;
        }

        public Criteria andData228GreaterThan(String value) {
            addCriterion("DATA228 >", value, "data228");
            return (Criteria) this;
        }

        public Criteria andData228GreaterThanOrEqualTo(String value) {
            addCriterion("DATA228 >=", value, "data228");
            return (Criteria) this;
        }

        public Criteria andData228LessThan(String value) {
            addCriterion("DATA228 <", value, "data228");
            return (Criteria) this;
        }

        public Criteria andData228LessThanOrEqualTo(String value) {
            addCriterion("DATA228 <=", value, "data228");
            return (Criteria) this;
        }

        public Criteria andData228Like(String value) {
            addCriterion("DATA228 like", value, "data228");
            return (Criteria) this;
        }

        public Criteria andData228NotLike(String value) {
            addCriterion("DATA228 not like", value, "data228");
            return (Criteria) this;
        }

        public Criteria andData228In(List<String> values) {
            addCriterion("DATA228 in", values, "data228");
            return (Criteria) this;
        }

        public Criteria andData228NotIn(List<String> values) {
            addCriterion("DATA228 not in", values, "data228");
            return (Criteria) this;
        }

        public Criteria andData228Between(String value1, String value2) {
            addCriterion("DATA228 between", value1, value2, "data228");
            return (Criteria) this;
        }

        public Criteria andData228NotBetween(String value1, String value2) {
            addCriterion("DATA228 not between", value1, value2, "data228");
            return (Criteria) this;
        }

        public Criteria andData229IsNull() {
            addCriterion("DATA229 is null");
            return (Criteria) this;
        }

        public Criteria andData229IsNotNull() {
            addCriterion("DATA229 is not null");
            return (Criteria) this;
        }

        public Criteria andData229EqualTo(String value) {
            addCriterion("DATA229 =", value, "data229");
            return (Criteria) this;
        }

        public Criteria andData229NotEqualTo(String value) {
            addCriterion("DATA229 <>", value, "data229");
            return (Criteria) this;
        }

        public Criteria andData229GreaterThan(String value) {
            addCriterion("DATA229 >", value, "data229");
            return (Criteria) this;
        }

        public Criteria andData229GreaterThanOrEqualTo(String value) {
            addCriterion("DATA229 >=", value, "data229");
            return (Criteria) this;
        }

        public Criteria andData229LessThan(String value) {
            addCriterion("DATA229 <", value, "data229");
            return (Criteria) this;
        }

        public Criteria andData229LessThanOrEqualTo(String value) {
            addCriterion("DATA229 <=", value, "data229");
            return (Criteria) this;
        }

        public Criteria andData229Like(String value) {
            addCriterion("DATA229 like", value, "data229");
            return (Criteria) this;
        }

        public Criteria andData229NotLike(String value) {
            addCriterion("DATA229 not like", value, "data229");
            return (Criteria) this;
        }

        public Criteria andData229In(List<String> values) {
            addCriterion("DATA229 in", values, "data229");
            return (Criteria) this;
        }

        public Criteria andData229NotIn(List<String> values) {
            addCriterion("DATA229 not in", values, "data229");
            return (Criteria) this;
        }

        public Criteria andData229Between(String value1, String value2) {
            addCriterion("DATA229 between", value1, value2, "data229");
            return (Criteria) this;
        }

        public Criteria andData229NotBetween(String value1, String value2) {
            addCriterion("DATA229 not between", value1, value2, "data229");
            return (Criteria) this;
        }

        public Criteria andData230IsNull() {
            addCriterion("DATA230 is null");
            return (Criteria) this;
        }

        public Criteria andData230IsNotNull() {
            addCriterion("DATA230 is not null");
            return (Criteria) this;
        }

        public Criteria andData230EqualTo(String value) {
            addCriterion("DATA230 =", value, "data230");
            return (Criteria) this;
        }

        public Criteria andData230NotEqualTo(String value) {
            addCriterion("DATA230 <>", value, "data230");
            return (Criteria) this;
        }

        public Criteria andData230GreaterThan(String value) {
            addCriterion("DATA230 >", value, "data230");
            return (Criteria) this;
        }

        public Criteria andData230GreaterThanOrEqualTo(String value) {
            addCriterion("DATA230 >=", value, "data230");
            return (Criteria) this;
        }

        public Criteria andData230LessThan(String value) {
            addCriterion("DATA230 <", value, "data230");
            return (Criteria) this;
        }

        public Criteria andData230LessThanOrEqualTo(String value) {
            addCriterion("DATA230 <=", value, "data230");
            return (Criteria) this;
        }

        public Criteria andData230Like(String value) {
            addCriterion("DATA230 like", value, "data230");
            return (Criteria) this;
        }

        public Criteria andData230NotLike(String value) {
            addCriterion("DATA230 not like", value, "data230");
            return (Criteria) this;
        }

        public Criteria andData230In(List<String> values) {
            addCriterion("DATA230 in", values, "data230");
            return (Criteria) this;
        }

        public Criteria andData230NotIn(List<String> values) {
            addCriterion("DATA230 not in", values, "data230");
            return (Criteria) this;
        }

        public Criteria andData230Between(String value1, String value2) {
            addCriterion("DATA230 between", value1, value2, "data230");
            return (Criteria) this;
        }

        public Criteria andData230NotBetween(String value1, String value2) {
            addCriterion("DATA230 not between", value1, value2, "data230");
            return (Criteria) this;
        }

        public Criteria andData231IsNull() {
            addCriterion("DATA231 is null");
            return (Criteria) this;
        }

        public Criteria andData231IsNotNull() {
            addCriterion("DATA231 is not null");
            return (Criteria) this;
        }

        public Criteria andData231EqualTo(String value) {
            addCriterion("DATA231 =", value, "data231");
            return (Criteria) this;
        }

        public Criteria andData231NotEqualTo(String value) {
            addCriterion("DATA231 <>", value, "data231");
            return (Criteria) this;
        }

        public Criteria andData231GreaterThan(String value) {
            addCriterion("DATA231 >", value, "data231");
            return (Criteria) this;
        }

        public Criteria andData231GreaterThanOrEqualTo(String value) {
            addCriterion("DATA231 >=", value, "data231");
            return (Criteria) this;
        }

        public Criteria andData231LessThan(String value) {
            addCriterion("DATA231 <", value, "data231");
            return (Criteria) this;
        }

        public Criteria andData231LessThanOrEqualTo(String value) {
            addCriterion("DATA231 <=", value, "data231");
            return (Criteria) this;
        }

        public Criteria andData231Like(String value) {
            addCriterion("DATA231 like", value, "data231");
            return (Criteria) this;
        }

        public Criteria andData231NotLike(String value) {
            addCriterion("DATA231 not like", value, "data231");
            return (Criteria) this;
        }

        public Criteria andData231In(List<String> values) {
            addCriterion("DATA231 in", values, "data231");
            return (Criteria) this;
        }

        public Criteria andData231NotIn(List<String> values) {
            addCriterion("DATA231 not in", values, "data231");
            return (Criteria) this;
        }

        public Criteria andData231Between(String value1, String value2) {
            addCriterion("DATA231 between", value1, value2, "data231");
            return (Criteria) this;
        }

        public Criteria andData231NotBetween(String value1, String value2) {
            addCriterion("DATA231 not between", value1, value2, "data231");
            return (Criteria) this;
        }

        public Criteria andData232IsNull() {
            addCriterion("DATA232 is null");
            return (Criteria) this;
        }

        public Criteria andData232IsNotNull() {
            addCriterion("DATA232 is not null");
            return (Criteria) this;
        }

        public Criteria andData232EqualTo(String value) {
            addCriterion("DATA232 =", value, "data232");
            return (Criteria) this;
        }

        public Criteria andData232NotEqualTo(String value) {
            addCriterion("DATA232 <>", value, "data232");
            return (Criteria) this;
        }

        public Criteria andData232GreaterThan(String value) {
            addCriterion("DATA232 >", value, "data232");
            return (Criteria) this;
        }

        public Criteria andData232GreaterThanOrEqualTo(String value) {
            addCriterion("DATA232 >=", value, "data232");
            return (Criteria) this;
        }

        public Criteria andData232LessThan(String value) {
            addCriterion("DATA232 <", value, "data232");
            return (Criteria) this;
        }

        public Criteria andData232LessThanOrEqualTo(String value) {
            addCriterion("DATA232 <=", value, "data232");
            return (Criteria) this;
        }

        public Criteria andData232Like(String value) {
            addCriterion("DATA232 like", value, "data232");
            return (Criteria) this;
        }

        public Criteria andData232NotLike(String value) {
            addCriterion("DATA232 not like", value, "data232");
            return (Criteria) this;
        }

        public Criteria andData232In(List<String> values) {
            addCriterion("DATA232 in", values, "data232");
            return (Criteria) this;
        }

        public Criteria andData232NotIn(List<String> values) {
            addCriterion("DATA232 not in", values, "data232");
            return (Criteria) this;
        }

        public Criteria andData232Between(String value1, String value2) {
            addCriterion("DATA232 between", value1, value2, "data232");
            return (Criteria) this;
        }

        public Criteria andData232NotBetween(String value1, String value2) {
            addCriterion("DATA232 not between", value1, value2, "data232");
            return (Criteria) this;
        }

        public Criteria andData233IsNull() {
            addCriterion("DATA233 is null");
            return (Criteria) this;
        }

        public Criteria andData233IsNotNull() {
            addCriterion("DATA233 is not null");
            return (Criteria) this;
        }

        public Criteria andData233EqualTo(String value) {
            addCriterion("DATA233 =", value, "data233");
            return (Criteria) this;
        }

        public Criteria andData233NotEqualTo(String value) {
            addCriterion("DATA233 <>", value, "data233");
            return (Criteria) this;
        }

        public Criteria andData233GreaterThan(String value) {
            addCriterion("DATA233 >", value, "data233");
            return (Criteria) this;
        }

        public Criteria andData233GreaterThanOrEqualTo(String value) {
            addCriterion("DATA233 >=", value, "data233");
            return (Criteria) this;
        }

        public Criteria andData233LessThan(String value) {
            addCriterion("DATA233 <", value, "data233");
            return (Criteria) this;
        }

        public Criteria andData233LessThanOrEqualTo(String value) {
            addCriterion("DATA233 <=", value, "data233");
            return (Criteria) this;
        }

        public Criteria andData233Like(String value) {
            addCriterion("DATA233 like", value, "data233");
            return (Criteria) this;
        }

        public Criteria andData233NotLike(String value) {
            addCriterion("DATA233 not like", value, "data233");
            return (Criteria) this;
        }

        public Criteria andData233In(List<String> values) {
            addCriterion("DATA233 in", values, "data233");
            return (Criteria) this;
        }

        public Criteria andData233NotIn(List<String> values) {
            addCriterion("DATA233 not in", values, "data233");
            return (Criteria) this;
        }

        public Criteria andData233Between(String value1, String value2) {
            addCriterion("DATA233 between", value1, value2, "data233");
            return (Criteria) this;
        }

        public Criteria andData233NotBetween(String value1, String value2) {
            addCriterion("DATA233 not between", value1, value2, "data233");
            return (Criteria) this;
        }

        public Criteria andData234IsNull() {
            addCriterion("DATA234 is null");
            return (Criteria) this;
        }

        public Criteria andData234IsNotNull() {
            addCriterion("DATA234 is not null");
            return (Criteria) this;
        }

        public Criteria andData234EqualTo(String value) {
            addCriterion("DATA234 =", value, "data234");
            return (Criteria) this;
        }

        public Criteria andData234NotEqualTo(String value) {
            addCriterion("DATA234 <>", value, "data234");
            return (Criteria) this;
        }

        public Criteria andData234GreaterThan(String value) {
            addCriterion("DATA234 >", value, "data234");
            return (Criteria) this;
        }

        public Criteria andData234GreaterThanOrEqualTo(String value) {
            addCriterion("DATA234 >=", value, "data234");
            return (Criteria) this;
        }

        public Criteria andData234LessThan(String value) {
            addCriterion("DATA234 <", value, "data234");
            return (Criteria) this;
        }

        public Criteria andData234LessThanOrEqualTo(String value) {
            addCriterion("DATA234 <=", value, "data234");
            return (Criteria) this;
        }

        public Criteria andData234Like(String value) {
            addCriterion("DATA234 like", value, "data234");
            return (Criteria) this;
        }

        public Criteria andData234NotLike(String value) {
            addCriterion("DATA234 not like", value, "data234");
            return (Criteria) this;
        }

        public Criteria andData234In(List<String> values) {
            addCriterion("DATA234 in", values, "data234");
            return (Criteria) this;
        }

        public Criteria andData234NotIn(List<String> values) {
            addCriterion("DATA234 not in", values, "data234");
            return (Criteria) this;
        }

        public Criteria andData234Between(String value1, String value2) {
            addCriterion("DATA234 between", value1, value2, "data234");
            return (Criteria) this;
        }

        public Criteria andData234NotBetween(String value1, String value2) {
            addCriterion("DATA234 not between", value1, value2, "data234");
            return (Criteria) this;
        }

        public Criteria andData235IsNull() {
            addCriterion("DATA235 is null");
            return (Criteria) this;
        }

        public Criteria andData235IsNotNull() {
            addCriterion("DATA235 is not null");
            return (Criteria) this;
        }

        public Criteria andData235EqualTo(String value) {
            addCriterion("DATA235 =", value, "data235");
            return (Criteria) this;
        }

        public Criteria andData235NotEqualTo(String value) {
            addCriterion("DATA235 <>", value, "data235");
            return (Criteria) this;
        }

        public Criteria andData235GreaterThan(String value) {
            addCriterion("DATA235 >", value, "data235");
            return (Criteria) this;
        }

        public Criteria andData235GreaterThanOrEqualTo(String value) {
            addCriterion("DATA235 >=", value, "data235");
            return (Criteria) this;
        }

        public Criteria andData235LessThan(String value) {
            addCriterion("DATA235 <", value, "data235");
            return (Criteria) this;
        }

        public Criteria andData235LessThanOrEqualTo(String value) {
            addCriterion("DATA235 <=", value, "data235");
            return (Criteria) this;
        }

        public Criteria andData235Like(String value) {
            addCriterion("DATA235 like", value, "data235");
            return (Criteria) this;
        }

        public Criteria andData235NotLike(String value) {
            addCriterion("DATA235 not like", value, "data235");
            return (Criteria) this;
        }

        public Criteria andData235In(List<String> values) {
            addCriterion("DATA235 in", values, "data235");
            return (Criteria) this;
        }

        public Criteria andData235NotIn(List<String> values) {
            addCriterion("DATA235 not in", values, "data235");
            return (Criteria) this;
        }

        public Criteria andData235Between(String value1, String value2) {
            addCriterion("DATA235 between", value1, value2, "data235");
            return (Criteria) this;
        }

        public Criteria andData235NotBetween(String value1, String value2) {
            addCriterion("DATA235 not between", value1, value2, "data235");
            return (Criteria) this;
        }

        public Criteria andData236IsNull() {
            addCriterion("DATA236 is null");
            return (Criteria) this;
        }

        public Criteria andData236IsNotNull() {
            addCriterion("DATA236 is not null");
            return (Criteria) this;
        }

        public Criteria andData236EqualTo(String value) {
            addCriterion("DATA236 =", value, "data236");
            return (Criteria) this;
        }

        public Criteria andData236NotEqualTo(String value) {
            addCriterion("DATA236 <>", value, "data236");
            return (Criteria) this;
        }

        public Criteria andData236GreaterThan(String value) {
            addCriterion("DATA236 >", value, "data236");
            return (Criteria) this;
        }

        public Criteria andData236GreaterThanOrEqualTo(String value) {
            addCriterion("DATA236 >=", value, "data236");
            return (Criteria) this;
        }

        public Criteria andData236LessThan(String value) {
            addCriterion("DATA236 <", value, "data236");
            return (Criteria) this;
        }

        public Criteria andData236LessThanOrEqualTo(String value) {
            addCriterion("DATA236 <=", value, "data236");
            return (Criteria) this;
        }

        public Criteria andData236Like(String value) {
            addCriterion("DATA236 like", value, "data236");
            return (Criteria) this;
        }

        public Criteria andData236NotLike(String value) {
            addCriterion("DATA236 not like", value, "data236");
            return (Criteria) this;
        }

        public Criteria andData236In(List<String> values) {
            addCriterion("DATA236 in", values, "data236");
            return (Criteria) this;
        }

        public Criteria andData236NotIn(List<String> values) {
            addCriterion("DATA236 not in", values, "data236");
            return (Criteria) this;
        }

        public Criteria andData236Between(String value1, String value2) {
            addCriterion("DATA236 between", value1, value2, "data236");
            return (Criteria) this;
        }

        public Criteria andData236NotBetween(String value1, String value2) {
            addCriterion("DATA236 not between", value1, value2, "data236");
            return (Criteria) this;
        }

        public Criteria andData237IsNull() {
            addCriterion("DATA237 is null");
            return (Criteria) this;
        }

        public Criteria andData237IsNotNull() {
            addCriterion("DATA237 is not null");
            return (Criteria) this;
        }

        public Criteria andData237EqualTo(String value) {
            addCriterion("DATA237 =", value, "data237");
            return (Criteria) this;
        }

        public Criteria andData237NotEqualTo(String value) {
            addCriterion("DATA237 <>", value, "data237");
            return (Criteria) this;
        }

        public Criteria andData237GreaterThan(String value) {
            addCriterion("DATA237 >", value, "data237");
            return (Criteria) this;
        }

        public Criteria andData237GreaterThanOrEqualTo(String value) {
            addCriterion("DATA237 >=", value, "data237");
            return (Criteria) this;
        }

        public Criteria andData237LessThan(String value) {
            addCriterion("DATA237 <", value, "data237");
            return (Criteria) this;
        }

        public Criteria andData237LessThanOrEqualTo(String value) {
            addCriterion("DATA237 <=", value, "data237");
            return (Criteria) this;
        }

        public Criteria andData237Like(String value) {
            addCriterion("DATA237 like", value, "data237");
            return (Criteria) this;
        }

        public Criteria andData237NotLike(String value) {
            addCriterion("DATA237 not like", value, "data237");
            return (Criteria) this;
        }

        public Criteria andData237In(List<String> values) {
            addCriterion("DATA237 in", values, "data237");
            return (Criteria) this;
        }

        public Criteria andData237NotIn(List<String> values) {
            addCriterion("DATA237 not in", values, "data237");
            return (Criteria) this;
        }

        public Criteria andData237Between(String value1, String value2) {
            addCriterion("DATA237 between", value1, value2, "data237");
            return (Criteria) this;
        }

        public Criteria andData237NotBetween(String value1, String value2) {
            addCriterion("DATA237 not between", value1, value2, "data237");
            return (Criteria) this;
        }

        public Criteria andData238IsNull() {
            addCriterion("DATA238 is null");
            return (Criteria) this;
        }

        public Criteria andData238IsNotNull() {
            addCriterion("DATA238 is not null");
            return (Criteria) this;
        }

        public Criteria andData238EqualTo(String value) {
            addCriterion("DATA238 =", value, "data238");
            return (Criteria) this;
        }

        public Criteria andData238NotEqualTo(String value) {
            addCriterion("DATA238 <>", value, "data238");
            return (Criteria) this;
        }

        public Criteria andData238GreaterThan(String value) {
            addCriterion("DATA238 >", value, "data238");
            return (Criteria) this;
        }

        public Criteria andData238GreaterThanOrEqualTo(String value) {
            addCriterion("DATA238 >=", value, "data238");
            return (Criteria) this;
        }

        public Criteria andData238LessThan(String value) {
            addCriterion("DATA238 <", value, "data238");
            return (Criteria) this;
        }

        public Criteria andData238LessThanOrEqualTo(String value) {
            addCriterion("DATA238 <=", value, "data238");
            return (Criteria) this;
        }

        public Criteria andData238Like(String value) {
            addCriterion("DATA238 like", value, "data238");
            return (Criteria) this;
        }

        public Criteria andData238NotLike(String value) {
            addCriterion("DATA238 not like", value, "data238");
            return (Criteria) this;
        }

        public Criteria andData238In(List<String> values) {
            addCriterion("DATA238 in", values, "data238");
            return (Criteria) this;
        }

        public Criteria andData238NotIn(List<String> values) {
            addCriterion("DATA238 not in", values, "data238");
            return (Criteria) this;
        }

        public Criteria andData238Between(String value1, String value2) {
            addCriterion("DATA238 between", value1, value2, "data238");
            return (Criteria) this;
        }

        public Criteria andData238NotBetween(String value1, String value2) {
            addCriterion("DATA238 not between", value1, value2, "data238");
            return (Criteria) this;
        }

        public Criteria andData239IsNull() {
            addCriterion("DATA239 is null");
            return (Criteria) this;
        }

        public Criteria andData239IsNotNull() {
            addCriterion("DATA239 is not null");
            return (Criteria) this;
        }

        public Criteria andData239EqualTo(String value) {
            addCriterion("DATA239 =", value, "data239");
            return (Criteria) this;
        }

        public Criteria andData239NotEqualTo(String value) {
            addCriterion("DATA239 <>", value, "data239");
            return (Criteria) this;
        }

        public Criteria andData239GreaterThan(String value) {
            addCriterion("DATA239 >", value, "data239");
            return (Criteria) this;
        }

        public Criteria andData239GreaterThanOrEqualTo(String value) {
            addCriterion("DATA239 >=", value, "data239");
            return (Criteria) this;
        }

        public Criteria andData239LessThan(String value) {
            addCriterion("DATA239 <", value, "data239");
            return (Criteria) this;
        }

        public Criteria andData239LessThanOrEqualTo(String value) {
            addCriterion("DATA239 <=", value, "data239");
            return (Criteria) this;
        }

        public Criteria andData239Like(String value) {
            addCriterion("DATA239 like", value, "data239");
            return (Criteria) this;
        }

        public Criteria andData239NotLike(String value) {
            addCriterion("DATA239 not like", value, "data239");
            return (Criteria) this;
        }

        public Criteria andData239In(List<String> values) {
            addCriterion("DATA239 in", values, "data239");
            return (Criteria) this;
        }

        public Criteria andData239NotIn(List<String> values) {
            addCriterion("DATA239 not in", values, "data239");
            return (Criteria) this;
        }

        public Criteria andData239Between(String value1, String value2) {
            addCriterion("DATA239 between", value1, value2, "data239");
            return (Criteria) this;
        }

        public Criteria andData239NotBetween(String value1, String value2) {
            addCriterion("DATA239 not between", value1, value2, "data239");
            return (Criteria) this;
        }

        public Criteria andData240IsNull() {
            addCriterion("DATA240 is null");
            return (Criteria) this;
        }

        public Criteria andData240IsNotNull() {
            addCriterion("DATA240 is not null");
            return (Criteria) this;
        }

        public Criteria andData240EqualTo(String value) {
            addCriterion("DATA240 =", value, "data240");
            return (Criteria) this;
        }

        public Criteria andData240NotEqualTo(String value) {
            addCriterion("DATA240 <>", value, "data240");
            return (Criteria) this;
        }

        public Criteria andData240GreaterThan(String value) {
            addCriterion("DATA240 >", value, "data240");
            return (Criteria) this;
        }

        public Criteria andData240GreaterThanOrEqualTo(String value) {
            addCriterion("DATA240 >=", value, "data240");
            return (Criteria) this;
        }

        public Criteria andData240LessThan(String value) {
            addCriterion("DATA240 <", value, "data240");
            return (Criteria) this;
        }

        public Criteria andData240LessThanOrEqualTo(String value) {
            addCriterion("DATA240 <=", value, "data240");
            return (Criteria) this;
        }

        public Criteria andData240Like(String value) {
            addCriterion("DATA240 like", value, "data240");
            return (Criteria) this;
        }

        public Criteria andData240NotLike(String value) {
            addCriterion("DATA240 not like", value, "data240");
            return (Criteria) this;
        }

        public Criteria andData240In(List<String> values) {
            addCriterion("DATA240 in", values, "data240");
            return (Criteria) this;
        }

        public Criteria andData240NotIn(List<String> values) {
            addCriterion("DATA240 not in", values, "data240");
            return (Criteria) this;
        }

        public Criteria andData240Between(String value1, String value2) {
            addCriterion("DATA240 between", value1, value2, "data240");
            return (Criteria) this;
        }

        public Criteria andData240NotBetween(String value1, String value2) {
            addCriterion("DATA240 not between", value1, value2, "data240");
            return (Criteria) this;
        }

        public Criteria andData241IsNull() {
            addCriterion("DATA241 is null");
            return (Criteria) this;
        }

        public Criteria andData241IsNotNull() {
            addCriterion("DATA241 is not null");
            return (Criteria) this;
        }

        public Criteria andData241EqualTo(String value) {
            addCriterion("DATA241 =", value, "data241");
            return (Criteria) this;
        }

        public Criteria andData241NotEqualTo(String value) {
            addCriterion("DATA241 <>", value, "data241");
            return (Criteria) this;
        }

        public Criteria andData241GreaterThan(String value) {
            addCriterion("DATA241 >", value, "data241");
            return (Criteria) this;
        }

        public Criteria andData241GreaterThanOrEqualTo(String value) {
            addCriterion("DATA241 >=", value, "data241");
            return (Criteria) this;
        }

        public Criteria andData241LessThan(String value) {
            addCriterion("DATA241 <", value, "data241");
            return (Criteria) this;
        }

        public Criteria andData241LessThanOrEqualTo(String value) {
            addCriterion("DATA241 <=", value, "data241");
            return (Criteria) this;
        }

        public Criteria andData241Like(String value) {
            addCriterion("DATA241 like", value, "data241");
            return (Criteria) this;
        }

        public Criteria andData241NotLike(String value) {
            addCriterion("DATA241 not like", value, "data241");
            return (Criteria) this;
        }

        public Criteria andData241In(List<String> values) {
            addCriterion("DATA241 in", values, "data241");
            return (Criteria) this;
        }

        public Criteria andData241NotIn(List<String> values) {
            addCriterion("DATA241 not in", values, "data241");
            return (Criteria) this;
        }

        public Criteria andData241Between(String value1, String value2) {
            addCriterion("DATA241 between", value1, value2, "data241");
            return (Criteria) this;
        }

        public Criteria andData241NotBetween(String value1, String value2) {
            addCriterion("DATA241 not between", value1, value2, "data241");
            return (Criteria) this;
        }

        public Criteria andData242IsNull() {
            addCriterion("DATA242 is null");
            return (Criteria) this;
        }

        public Criteria andData242IsNotNull() {
            addCriterion("DATA242 is not null");
            return (Criteria) this;
        }

        public Criteria andData242EqualTo(String value) {
            addCriterion("DATA242 =", value, "data242");
            return (Criteria) this;
        }

        public Criteria andData242NotEqualTo(String value) {
            addCriterion("DATA242 <>", value, "data242");
            return (Criteria) this;
        }

        public Criteria andData242GreaterThan(String value) {
            addCriterion("DATA242 >", value, "data242");
            return (Criteria) this;
        }

        public Criteria andData242GreaterThanOrEqualTo(String value) {
            addCriterion("DATA242 >=", value, "data242");
            return (Criteria) this;
        }

        public Criteria andData242LessThan(String value) {
            addCriterion("DATA242 <", value, "data242");
            return (Criteria) this;
        }

        public Criteria andData242LessThanOrEqualTo(String value) {
            addCriterion("DATA242 <=", value, "data242");
            return (Criteria) this;
        }

        public Criteria andData242Like(String value) {
            addCriterion("DATA242 like", value, "data242");
            return (Criteria) this;
        }

        public Criteria andData242NotLike(String value) {
            addCriterion("DATA242 not like", value, "data242");
            return (Criteria) this;
        }

        public Criteria andData242In(List<String> values) {
            addCriterion("DATA242 in", values, "data242");
            return (Criteria) this;
        }

        public Criteria andData242NotIn(List<String> values) {
            addCriterion("DATA242 not in", values, "data242");
            return (Criteria) this;
        }

        public Criteria andData242Between(String value1, String value2) {
            addCriterion("DATA242 between", value1, value2, "data242");
            return (Criteria) this;
        }

        public Criteria andData242NotBetween(String value1, String value2) {
            addCriterion("DATA242 not between", value1, value2, "data242");
            return (Criteria) this;
        }

        public Criteria andData243IsNull() {
            addCriterion("DATA243 is null");
            return (Criteria) this;
        }

        public Criteria andData243IsNotNull() {
            addCriterion("DATA243 is not null");
            return (Criteria) this;
        }

        public Criteria andData243EqualTo(String value) {
            addCriterion("DATA243 =", value, "data243");
            return (Criteria) this;
        }

        public Criteria andData243NotEqualTo(String value) {
            addCriterion("DATA243 <>", value, "data243");
            return (Criteria) this;
        }

        public Criteria andData243GreaterThan(String value) {
            addCriterion("DATA243 >", value, "data243");
            return (Criteria) this;
        }

        public Criteria andData243GreaterThanOrEqualTo(String value) {
            addCriterion("DATA243 >=", value, "data243");
            return (Criteria) this;
        }

        public Criteria andData243LessThan(String value) {
            addCriterion("DATA243 <", value, "data243");
            return (Criteria) this;
        }

        public Criteria andData243LessThanOrEqualTo(String value) {
            addCriterion("DATA243 <=", value, "data243");
            return (Criteria) this;
        }

        public Criteria andData243Like(String value) {
            addCriterion("DATA243 like", value, "data243");
            return (Criteria) this;
        }

        public Criteria andData243NotLike(String value) {
            addCriterion("DATA243 not like", value, "data243");
            return (Criteria) this;
        }

        public Criteria andData243In(List<String> values) {
            addCriterion("DATA243 in", values, "data243");
            return (Criteria) this;
        }

        public Criteria andData243NotIn(List<String> values) {
            addCriterion("DATA243 not in", values, "data243");
            return (Criteria) this;
        }

        public Criteria andData243Between(String value1, String value2) {
            addCriterion("DATA243 between", value1, value2, "data243");
            return (Criteria) this;
        }

        public Criteria andData243NotBetween(String value1, String value2) {
            addCriterion("DATA243 not between", value1, value2, "data243");
            return (Criteria) this;
        }

        public Criteria andData244IsNull() {
            addCriterion("DATA244 is null");
            return (Criteria) this;
        }

        public Criteria andData244IsNotNull() {
            addCriterion("DATA244 is not null");
            return (Criteria) this;
        }

        public Criteria andData244EqualTo(String value) {
            addCriterion("DATA244 =", value, "data244");
            return (Criteria) this;
        }

        public Criteria andData244NotEqualTo(String value) {
            addCriterion("DATA244 <>", value, "data244");
            return (Criteria) this;
        }

        public Criteria andData244GreaterThan(String value) {
            addCriterion("DATA244 >", value, "data244");
            return (Criteria) this;
        }

        public Criteria andData244GreaterThanOrEqualTo(String value) {
            addCriterion("DATA244 >=", value, "data244");
            return (Criteria) this;
        }

        public Criteria andData244LessThan(String value) {
            addCriterion("DATA244 <", value, "data244");
            return (Criteria) this;
        }

        public Criteria andData244LessThanOrEqualTo(String value) {
            addCriterion("DATA244 <=", value, "data244");
            return (Criteria) this;
        }

        public Criteria andData244Like(String value) {
            addCriterion("DATA244 like", value, "data244");
            return (Criteria) this;
        }

        public Criteria andData244NotLike(String value) {
            addCriterion("DATA244 not like", value, "data244");
            return (Criteria) this;
        }

        public Criteria andData244In(List<String> values) {
            addCriterion("DATA244 in", values, "data244");
            return (Criteria) this;
        }

        public Criteria andData244NotIn(List<String> values) {
            addCriterion("DATA244 not in", values, "data244");
            return (Criteria) this;
        }

        public Criteria andData244Between(String value1, String value2) {
            addCriterion("DATA244 between", value1, value2, "data244");
            return (Criteria) this;
        }

        public Criteria andData244NotBetween(String value1, String value2) {
            addCriterion("DATA244 not between", value1, value2, "data244");
            return (Criteria) this;
        }

        public Criteria andData245IsNull() {
            addCriterion("DATA245 is null");
            return (Criteria) this;
        }

        public Criteria andData245IsNotNull() {
            addCriterion("DATA245 is not null");
            return (Criteria) this;
        }

        public Criteria andData245EqualTo(String value) {
            addCriterion("DATA245 =", value, "data245");
            return (Criteria) this;
        }

        public Criteria andData245NotEqualTo(String value) {
            addCriterion("DATA245 <>", value, "data245");
            return (Criteria) this;
        }

        public Criteria andData245GreaterThan(String value) {
            addCriterion("DATA245 >", value, "data245");
            return (Criteria) this;
        }

        public Criteria andData245GreaterThanOrEqualTo(String value) {
            addCriterion("DATA245 >=", value, "data245");
            return (Criteria) this;
        }

        public Criteria andData245LessThan(String value) {
            addCriterion("DATA245 <", value, "data245");
            return (Criteria) this;
        }

        public Criteria andData245LessThanOrEqualTo(String value) {
            addCriterion("DATA245 <=", value, "data245");
            return (Criteria) this;
        }

        public Criteria andData245Like(String value) {
            addCriterion("DATA245 like", value, "data245");
            return (Criteria) this;
        }

        public Criteria andData245NotLike(String value) {
            addCriterion("DATA245 not like", value, "data245");
            return (Criteria) this;
        }

        public Criteria andData245In(List<String> values) {
            addCriterion("DATA245 in", values, "data245");
            return (Criteria) this;
        }

        public Criteria andData245NotIn(List<String> values) {
            addCriterion("DATA245 not in", values, "data245");
            return (Criteria) this;
        }

        public Criteria andData245Between(String value1, String value2) {
            addCriterion("DATA245 between", value1, value2, "data245");
            return (Criteria) this;
        }

        public Criteria andData245NotBetween(String value1, String value2) {
            addCriterion("DATA245 not between", value1, value2, "data245");
            return (Criteria) this;
        }

        public Criteria andData246IsNull() {
            addCriterion("DATA246 is null");
            return (Criteria) this;
        }

        public Criteria andData246IsNotNull() {
            addCriterion("DATA246 is not null");
            return (Criteria) this;
        }

        public Criteria andData246EqualTo(String value) {
            addCriterion("DATA246 =", value, "data246");
            return (Criteria) this;
        }

        public Criteria andData246NotEqualTo(String value) {
            addCriterion("DATA246 <>", value, "data246");
            return (Criteria) this;
        }

        public Criteria andData246GreaterThan(String value) {
            addCriterion("DATA246 >", value, "data246");
            return (Criteria) this;
        }

        public Criteria andData246GreaterThanOrEqualTo(String value) {
            addCriterion("DATA246 >=", value, "data246");
            return (Criteria) this;
        }

        public Criteria andData246LessThan(String value) {
            addCriterion("DATA246 <", value, "data246");
            return (Criteria) this;
        }

        public Criteria andData246LessThanOrEqualTo(String value) {
            addCriterion("DATA246 <=", value, "data246");
            return (Criteria) this;
        }

        public Criteria andData246Like(String value) {
            addCriterion("DATA246 like", value, "data246");
            return (Criteria) this;
        }

        public Criteria andData246NotLike(String value) {
            addCriterion("DATA246 not like", value, "data246");
            return (Criteria) this;
        }

        public Criteria andData246In(List<String> values) {
            addCriterion("DATA246 in", values, "data246");
            return (Criteria) this;
        }

        public Criteria andData246NotIn(List<String> values) {
            addCriterion("DATA246 not in", values, "data246");
            return (Criteria) this;
        }

        public Criteria andData246Between(String value1, String value2) {
            addCriterion("DATA246 between", value1, value2, "data246");
            return (Criteria) this;
        }

        public Criteria andData246NotBetween(String value1, String value2) {
            addCriterion("DATA246 not between", value1, value2, "data246");
            return (Criteria) this;
        }

        public Criteria andData247IsNull() {
            addCriterion("DATA247 is null");
            return (Criteria) this;
        }

        public Criteria andData247IsNotNull() {
            addCriterion("DATA247 is not null");
            return (Criteria) this;
        }

        public Criteria andData247EqualTo(String value) {
            addCriterion("DATA247 =", value, "data247");
            return (Criteria) this;
        }

        public Criteria andData247NotEqualTo(String value) {
            addCriterion("DATA247 <>", value, "data247");
            return (Criteria) this;
        }

        public Criteria andData247GreaterThan(String value) {
            addCriterion("DATA247 >", value, "data247");
            return (Criteria) this;
        }

        public Criteria andData247GreaterThanOrEqualTo(String value) {
            addCriterion("DATA247 >=", value, "data247");
            return (Criteria) this;
        }

        public Criteria andData247LessThan(String value) {
            addCriterion("DATA247 <", value, "data247");
            return (Criteria) this;
        }

        public Criteria andData247LessThanOrEqualTo(String value) {
            addCriterion("DATA247 <=", value, "data247");
            return (Criteria) this;
        }

        public Criteria andData247Like(String value) {
            addCriterion("DATA247 like", value, "data247");
            return (Criteria) this;
        }

        public Criteria andData247NotLike(String value) {
            addCriterion("DATA247 not like", value, "data247");
            return (Criteria) this;
        }

        public Criteria andData247In(List<String> values) {
            addCriterion("DATA247 in", values, "data247");
            return (Criteria) this;
        }

        public Criteria andData247NotIn(List<String> values) {
            addCriterion("DATA247 not in", values, "data247");
            return (Criteria) this;
        }

        public Criteria andData247Between(String value1, String value2) {
            addCriterion("DATA247 between", value1, value2, "data247");
            return (Criteria) this;
        }

        public Criteria andData247NotBetween(String value1, String value2) {
            addCriterion("DATA247 not between", value1, value2, "data247");
            return (Criteria) this;
        }

        public Criteria andData248IsNull() {
            addCriterion("DATA248 is null");
            return (Criteria) this;
        }

        public Criteria andData248IsNotNull() {
            addCriterion("DATA248 is not null");
            return (Criteria) this;
        }

        public Criteria andData248EqualTo(String value) {
            addCriterion("DATA248 =", value, "data248");
            return (Criteria) this;
        }

        public Criteria andData248NotEqualTo(String value) {
            addCriterion("DATA248 <>", value, "data248");
            return (Criteria) this;
        }

        public Criteria andData248GreaterThan(String value) {
            addCriterion("DATA248 >", value, "data248");
            return (Criteria) this;
        }

        public Criteria andData248GreaterThanOrEqualTo(String value) {
            addCriterion("DATA248 >=", value, "data248");
            return (Criteria) this;
        }

        public Criteria andData248LessThan(String value) {
            addCriterion("DATA248 <", value, "data248");
            return (Criteria) this;
        }

        public Criteria andData248LessThanOrEqualTo(String value) {
            addCriterion("DATA248 <=", value, "data248");
            return (Criteria) this;
        }

        public Criteria andData248Like(String value) {
            addCriterion("DATA248 like", value, "data248");
            return (Criteria) this;
        }

        public Criteria andData248NotLike(String value) {
            addCriterion("DATA248 not like", value, "data248");
            return (Criteria) this;
        }

        public Criteria andData248In(List<String> values) {
            addCriterion("DATA248 in", values, "data248");
            return (Criteria) this;
        }

        public Criteria andData248NotIn(List<String> values) {
            addCriterion("DATA248 not in", values, "data248");
            return (Criteria) this;
        }

        public Criteria andData248Between(String value1, String value2) {
            addCriterion("DATA248 between", value1, value2, "data248");
            return (Criteria) this;
        }

        public Criteria andData248NotBetween(String value1, String value2) {
            addCriterion("DATA248 not between", value1, value2, "data248");
            return (Criteria) this;
        }

        public Criteria andData249IsNull() {
            addCriterion("DATA249 is null");
            return (Criteria) this;
        }

        public Criteria andData249IsNotNull() {
            addCriterion("DATA249 is not null");
            return (Criteria) this;
        }

        public Criteria andData249EqualTo(String value) {
            addCriterion("DATA249 =", value, "data249");
            return (Criteria) this;
        }

        public Criteria andData249NotEqualTo(String value) {
            addCriterion("DATA249 <>", value, "data249");
            return (Criteria) this;
        }

        public Criteria andData249GreaterThan(String value) {
            addCriterion("DATA249 >", value, "data249");
            return (Criteria) this;
        }

        public Criteria andData249GreaterThanOrEqualTo(String value) {
            addCriterion("DATA249 >=", value, "data249");
            return (Criteria) this;
        }

        public Criteria andData249LessThan(String value) {
            addCriterion("DATA249 <", value, "data249");
            return (Criteria) this;
        }

        public Criteria andData249LessThanOrEqualTo(String value) {
            addCriterion("DATA249 <=", value, "data249");
            return (Criteria) this;
        }

        public Criteria andData249Like(String value) {
            addCriterion("DATA249 like", value, "data249");
            return (Criteria) this;
        }

        public Criteria andData249NotLike(String value) {
            addCriterion("DATA249 not like", value, "data249");
            return (Criteria) this;
        }

        public Criteria andData249In(List<String> values) {
            addCriterion("DATA249 in", values, "data249");
            return (Criteria) this;
        }

        public Criteria andData249NotIn(List<String> values) {
            addCriterion("DATA249 not in", values, "data249");
            return (Criteria) this;
        }

        public Criteria andData249Between(String value1, String value2) {
            addCriterion("DATA249 between", value1, value2, "data249");
            return (Criteria) this;
        }

        public Criteria andData249NotBetween(String value1, String value2) {
            addCriterion("DATA249 not between", value1, value2, "data249");
            return (Criteria) this;
        }

        public Criteria andData250IsNull() {
            addCriterion("DATA250 is null");
            return (Criteria) this;
        }

        public Criteria andData250IsNotNull() {
            addCriterion("DATA250 is not null");
            return (Criteria) this;
        }

        public Criteria andData250EqualTo(String value) {
            addCriterion("DATA250 =", value, "data250");
            return (Criteria) this;
        }

        public Criteria andData250NotEqualTo(String value) {
            addCriterion("DATA250 <>", value, "data250");
            return (Criteria) this;
        }

        public Criteria andData250GreaterThan(String value) {
            addCriterion("DATA250 >", value, "data250");
            return (Criteria) this;
        }

        public Criteria andData250GreaterThanOrEqualTo(String value) {
            addCriterion("DATA250 >=", value, "data250");
            return (Criteria) this;
        }

        public Criteria andData250LessThan(String value) {
            addCriterion("DATA250 <", value, "data250");
            return (Criteria) this;
        }

        public Criteria andData250LessThanOrEqualTo(String value) {
            addCriterion("DATA250 <=", value, "data250");
            return (Criteria) this;
        }

        public Criteria andData250Like(String value) {
            addCriterion("DATA250 like", value, "data250");
            return (Criteria) this;
        }

        public Criteria andData250NotLike(String value) {
            addCriterion("DATA250 not like", value, "data250");
            return (Criteria) this;
        }

        public Criteria andData250In(List<String> values) {
            addCriterion("DATA250 in", values, "data250");
            return (Criteria) this;
        }

        public Criteria andData250NotIn(List<String> values) {
            addCriterion("DATA250 not in", values, "data250");
            return (Criteria) this;
        }

        public Criteria andData250Between(String value1, String value2) {
            addCriterion("DATA250 between", value1, value2, "data250");
            return (Criteria) this;
        }

        public Criteria andData250NotBetween(String value1, String value2) {
            addCriterion("DATA250 not between", value1, value2, "data250");
            return (Criteria) this;
        }

        public Criteria andData251IsNull() {
            addCriterion("DATA251 is null");
            return (Criteria) this;
        }

        public Criteria andData251IsNotNull() {
            addCriterion("DATA251 is not null");
            return (Criteria) this;
        }

        public Criteria andData251EqualTo(String value) {
            addCriterion("DATA251 =", value, "data251");
            return (Criteria) this;
        }

        public Criteria andData251NotEqualTo(String value) {
            addCriterion("DATA251 <>", value, "data251");
            return (Criteria) this;
        }

        public Criteria andData251GreaterThan(String value) {
            addCriterion("DATA251 >", value, "data251");
            return (Criteria) this;
        }

        public Criteria andData251GreaterThanOrEqualTo(String value) {
            addCriterion("DATA251 >=", value, "data251");
            return (Criteria) this;
        }

        public Criteria andData251LessThan(String value) {
            addCriterion("DATA251 <", value, "data251");
            return (Criteria) this;
        }

        public Criteria andData251LessThanOrEqualTo(String value) {
            addCriterion("DATA251 <=", value, "data251");
            return (Criteria) this;
        }

        public Criteria andData251Like(String value) {
            addCriterion("DATA251 like", value, "data251");
            return (Criteria) this;
        }

        public Criteria andData251NotLike(String value) {
            addCriterion("DATA251 not like", value, "data251");
            return (Criteria) this;
        }

        public Criteria andData251In(List<String> values) {
            addCriterion("DATA251 in", values, "data251");
            return (Criteria) this;
        }

        public Criteria andData251NotIn(List<String> values) {
            addCriterion("DATA251 not in", values, "data251");
            return (Criteria) this;
        }

        public Criteria andData251Between(String value1, String value2) {
            addCriterion("DATA251 between", value1, value2, "data251");
            return (Criteria) this;
        }

        public Criteria andData251NotBetween(String value1, String value2) {
            addCriterion("DATA251 not between", value1, value2, "data251");
            return (Criteria) this;
        }

        public Criteria andData252IsNull() {
            addCriterion("DATA252 is null");
            return (Criteria) this;
        }

        public Criteria andData252IsNotNull() {
            addCriterion("DATA252 is not null");
            return (Criteria) this;
        }

        public Criteria andData252EqualTo(String value) {
            addCriterion("DATA252 =", value, "data252");
            return (Criteria) this;
        }

        public Criteria andData252NotEqualTo(String value) {
            addCriterion("DATA252 <>", value, "data252");
            return (Criteria) this;
        }

        public Criteria andData252GreaterThan(String value) {
            addCriterion("DATA252 >", value, "data252");
            return (Criteria) this;
        }

        public Criteria andData252GreaterThanOrEqualTo(String value) {
            addCriterion("DATA252 >=", value, "data252");
            return (Criteria) this;
        }

        public Criteria andData252LessThan(String value) {
            addCriterion("DATA252 <", value, "data252");
            return (Criteria) this;
        }

        public Criteria andData252LessThanOrEqualTo(String value) {
            addCriterion("DATA252 <=", value, "data252");
            return (Criteria) this;
        }

        public Criteria andData252Like(String value) {
            addCriterion("DATA252 like", value, "data252");
            return (Criteria) this;
        }

        public Criteria andData252NotLike(String value) {
            addCriterion("DATA252 not like", value, "data252");
            return (Criteria) this;
        }

        public Criteria andData252In(List<String> values) {
            addCriterion("DATA252 in", values, "data252");
            return (Criteria) this;
        }

        public Criteria andData252NotIn(List<String> values) {
            addCriterion("DATA252 not in", values, "data252");
            return (Criteria) this;
        }

        public Criteria andData252Between(String value1, String value2) {
            addCriterion("DATA252 between", value1, value2, "data252");
            return (Criteria) this;
        }

        public Criteria andData252NotBetween(String value1, String value2) {
            addCriterion("DATA252 not between", value1, value2, "data252");
            return (Criteria) this;
        }

        public Criteria andData253IsNull() {
            addCriterion("DATA253 is null");
            return (Criteria) this;
        }

        public Criteria andData253IsNotNull() {
            addCriterion("DATA253 is not null");
            return (Criteria) this;
        }

        public Criteria andData253EqualTo(String value) {
            addCriterion("DATA253 =", value, "data253");
            return (Criteria) this;
        }

        public Criteria andData253NotEqualTo(String value) {
            addCriterion("DATA253 <>", value, "data253");
            return (Criteria) this;
        }

        public Criteria andData253GreaterThan(String value) {
            addCriterion("DATA253 >", value, "data253");
            return (Criteria) this;
        }

        public Criteria andData253GreaterThanOrEqualTo(String value) {
            addCriterion("DATA253 >=", value, "data253");
            return (Criteria) this;
        }

        public Criteria andData253LessThan(String value) {
            addCriterion("DATA253 <", value, "data253");
            return (Criteria) this;
        }

        public Criteria andData253LessThanOrEqualTo(String value) {
            addCriterion("DATA253 <=", value, "data253");
            return (Criteria) this;
        }

        public Criteria andData253Like(String value) {
            addCriterion("DATA253 like", value, "data253");
            return (Criteria) this;
        }

        public Criteria andData253NotLike(String value) {
            addCriterion("DATA253 not like", value, "data253");
            return (Criteria) this;
        }

        public Criteria andData253In(List<String> values) {
            addCriterion("DATA253 in", values, "data253");
            return (Criteria) this;
        }

        public Criteria andData253NotIn(List<String> values) {
            addCriterion("DATA253 not in", values, "data253");
            return (Criteria) this;
        }

        public Criteria andData253Between(String value1, String value2) {
            addCriterion("DATA253 between", value1, value2, "data253");
            return (Criteria) this;
        }

        public Criteria andData253NotBetween(String value1, String value2) {
            addCriterion("DATA253 not between", value1, value2, "data253");
            return (Criteria) this;
        }

        public Criteria andData254IsNull() {
            addCriterion("DATA254 is null");
            return (Criteria) this;
        }

        public Criteria andData254IsNotNull() {
            addCriterion("DATA254 is not null");
            return (Criteria) this;
        }

        public Criteria andData254EqualTo(String value) {
            addCriterion("DATA254 =", value, "data254");
            return (Criteria) this;
        }

        public Criteria andData254NotEqualTo(String value) {
            addCriterion("DATA254 <>", value, "data254");
            return (Criteria) this;
        }

        public Criteria andData254GreaterThan(String value) {
            addCriterion("DATA254 >", value, "data254");
            return (Criteria) this;
        }

        public Criteria andData254GreaterThanOrEqualTo(String value) {
            addCriterion("DATA254 >=", value, "data254");
            return (Criteria) this;
        }

        public Criteria andData254LessThan(String value) {
            addCriterion("DATA254 <", value, "data254");
            return (Criteria) this;
        }

        public Criteria andData254LessThanOrEqualTo(String value) {
            addCriterion("DATA254 <=", value, "data254");
            return (Criteria) this;
        }

        public Criteria andData254Like(String value) {
            addCriterion("DATA254 like", value, "data254");
            return (Criteria) this;
        }

        public Criteria andData254NotLike(String value) {
            addCriterion("DATA254 not like", value, "data254");
            return (Criteria) this;
        }

        public Criteria andData254In(List<String> values) {
            addCriterion("DATA254 in", values, "data254");
            return (Criteria) this;
        }

        public Criteria andData254NotIn(List<String> values) {
            addCriterion("DATA254 not in", values, "data254");
            return (Criteria) this;
        }

        public Criteria andData254Between(String value1, String value2) {
            addCriterion("DATA254 between", value1, value2, "data254");
            return (Criteria) this;
        }

        public Criteria andData254NotBetween(String value1, String value2) {
            addCriterion("DATA254 not between", value1, value2, "data254");
            return (Criteria) this;
        }

        public Criteria andData255IsNull() {
            addCriterion("DATA255 is null");
            return (Criteria) this;
        }

        public Criteria andData255IsNotNull() {
            addCriterion("DATA255 is not null");
            return (Criteria) this;
        }

        public Criteria andData255EqualTo(String value) {
            addCriterion("DATA255 =", value, "data255");
            return (Criteria) this;
        }

        public Criteria andData255NotEqualTo(String value) {
            addCriterion("DATA255 <>", value, "data255");
            return (Criteria) this;
        }

        public Criteria andData255GreaterThan(String value) {
            addCriterion("DATA255 >", value, "data255");
            return (Criteria) this;
        }

        public Criteria andData255GreaterThanOrEqualTo(String value) {
            addCriterion("DATA255 >=", value, "data255");
            return (Criteria) this;
        }

        public Criteria andData255LessThan(String value) {
            addCriterion("DATA255 <", value, "data255");
            return (Criteria) this;
        }

        public Criteria andData255LessThanOrEqualTo(String value) {
            addCriterion("DATA255 <=", value, "data255");
            return (Criteria) this;
        }

        public Criteria andData255Like(String value) {
            addCriterion("DATA255 like", value, "data255");
            return (Criteria) this;
        }

        public Criteria andData255NotLike(String value) {
            addCriterion("DATA255 not like", value, "data255");
            return (Criteria) this;
        }

        public Criteria andData255In(List<String> values) {
            addCriterion("DATA255 in", values, "data255");
            return (Criteria) this;
        }

        public Criteria andData255NotIn(List<String> values) {
            addCriterion("DATA255 not in", values, "data255");
            return (Criteria) this;
        }

        public Criteria andData255Between(String value1, String value2) {
            addCriterion("DATA255 between", value1, value2, "data255");
            return (Criteria) this;
        }

        public Criteria andData255NotBetween(String value1, String value2) {
            addCriterion("DATA255 not between", value1, value2, "data255");
            return (Criteria) this;
        }

        public Criteria andData256IsNull() {
            addCriterion("DATA256 is null");
            return (Criteria) this;
        }

        public Criteria andData256IsNotNull() {
            addCriterion("DATA256 is not null");
            return (Criteria) this;
        }

        public Criteria andData256EqualTo(String value) {
            addCriterion("DATA256 =", value, "data256");
            return (Criteria) this;
        }

        public Criteria andData256NotEqualTo(String value) {
            addCriterion("DATA256 <>", value, "data256");
            return (Criteria) this;
        }

        public Criteria andData256GreaterThan(String value) {
            addCriterion("DATA256 >", value, "data256");
            return (Criteria) this;
        }

        public Criteria andData256GreaterThanOrEqualTo(String value) {
            addCriterion("DATA256 >=", value, "data256");
            return (Criteria) this;
        }

        public Criteria andData256LessThan(String value) {
            addCriterion("DATA256 <", value, "data256");
            return (Criteria) this;
        }

        public Criteria andData256LessThanOrEqualTo(String value) {
            addCriterion("DATA256 <=", value, "data256");
            return (Criteria) this;
        }

        public Criteria andData256Like(String value) {
            addCriterion("DATA256 like", value, "data256");
            return (Criteria) this;
        }

        public Criteria andData256NotLike(String value) {
            addCriterion("DATA256 not like", value, "data256");
            return (Criteria) this;
        }

        public Criteria andData256In(List<String> values) {
            addCriterion("DATA256 in", values, "data256");
            return (Criteria) this;
        }

        public Criteria andData256NotIn(List<String> values) {
            addCriterion("DATA256 not in", values, "data256");
            return (Criteria) this;
        }

        public Criteria andData256Between(String value1, String value2) {
            addCriterion("DATA256 between", value1, value2, "data256");
            return (Criteria) this;
        }

        public Criteria andData256NotBetween(String value1, String value2) {
            addCriterion("DATA256 not between", value1, value2, "data256");
            return (Criteria) this;
        }

        public Criteria andData257IsNull() {
            addCriterion("DATA257 is null");
            return (Criteria) this;
        }

        public Criteria andData257IsNotNull() {
            addCriterion("DATA257 is not null");
            return (Criteria) this;
        }

        public Criteria andData257EqualTo(String value) {
            addCriterion("DATA257 =", value, "data257");
            return (Criteria) this;
        }

        public Criteria andData257NotEqualTo(String value) {
            addCriterion("DATA257 <>", value, "data257");
            return (Criteria) this;
        }

        public Criteria andData257GreaterThan(String value) {
            addCriterion("DATA257 >", value, "data257");
            return (Criteria) this;
        }

        public Criteria andData257GreaterThanOrEqualTo(String value) {
            addCriterion("DATA257 >=", value, "data257");
            return (Criteria) this;
        }

        public Criteria andData257LessThan(String value) {
            addCriterion("DATA257 <", value, "data257");
            return (Criteria) this;
        }

        public Criteria andData257LessThanOrEqualTo(String value) {
            addCriterion("DATA257 <=", value, "data257");
            return (Criteria) this;
        }

        public Criteria andData257Like(String value) {
            addCriterion("DATA257 like", value, "data257");
            return (Criteria) this;
        }

        public Criteria andData257NotLike(String value) {
            addCriterion("DATA257 not like", value, "data257");
            return (Criteria) this;
        }

        public Criteria andData257In(List<String> values) {
            addCriterion("DATA257 in", values, "data257");
            return (Criteria) this;
        }

        public Criteria andData257NotIn(List<String> values) {
            addCriterion("DATA257 not in", values, "data257");
            return (Criteria) this;
        }

        public Criteria andData257Between(String value1, String value2) {
            addCriterion("DATA257 between", value1, value2, "data257");
            return (Criteria) this;
        }

        public Criteria andData257NotBetween(String value1, String value2) {
            addCriterion("DATA257 not between", value1, value2, "data257");
            return (Criteria) this;
        }

        public Criteria andData258IsNull() {
            addCriterion("DATA258 is null");
            return (Criteria) this;
        }

        public Criteria andData258IsNotNull() {
            addCriterion("DATA258 is not null");
            return (Criteria) this;
        }

        public Criteria andData258EqualTo(String value) {
            addCriterion("DATA258 =", value, "data258");
            return (Criteria) this;
        }

        public Criteria andData258NotEqualTo(String value) {
            addCriterion("DATA258 <>", value, "data258");
            return (Criteria) this;
        }

        public Criteria andData258GreaterThan(String value) {
            addCriterion("DATA258 >", value, "data258");
            return (Criteria) this;
        }

        public Criteria andData258GreaterThanOrEqualTo(String value) {
            addCriterion("DATA258 >=", value, "data258");
            return (Criteria) this;
        }

        public Criteria andData258LessThan(String value) {
            addCriterion("DATA258 <", value, "data258");
            return (Criteria) this;
        }

        public Criteria andData258LessThanOrEqualTo(String value) {
            addCriterion("DATA258 <=", value, "data258");
            return (Criteria) this;
        }

        public Criteria andData258Like(String value) {
            addCriterion("DATA258 like", value, "data258");
            return (Criteria) this;
        }

        public Criteria andData258NotLike(String value) {
            addCriterion("DATA258 not like", value, "data258");
            return (Criteria) this;
        }

        public Criteria andData258In(List<String> values) {
            addCriterion("DATA258 in", values, "data258");
            return (Criteria) this;
        }

        public Criteria andData258NotIn(List<String> values) {
            addCriterion("DATA258 not in", values, "data258");
            return (Criteria) this;
        }

        public Criteria andData258Between(String value1, String value2) {
            addCriterion("DATA258 between", value1, value2, "data258");
            return (Criteria) this;
        }

        public Criteria andData258NotBetween(String value1, String value2) {
            addCriterion("DATA258 not between", value1, value2, "data258");
            return (Criteria) this;
        }

        public Criteria andData259IsNull() {
            addCriterion("DATA259 is null");
            return (Criteria) this;
        }

        public Criteria andData259IsNotNull() {
            addCriterion("DATA259 is not null");
            return (Criteria) this;
        }

        public Criteria andData259EqualTo(String value) {
            addCriterion("DATA259 =", value, "data259");
            return (Criteria) this;
        }

        public Criteria andData259NotEqualTo(String value) {
            addCriterion("DATA259 <>", value, "data259");
            return (Criteria) this;
        }

        public Criteria andData259GreaterThan(String value) {
            addCriterion("DATA259 >", value, "data259");
            return (Criteria) this;
        }

        public Criteria andData259GreaterThanOrEqualTo(String value) {
            addCriterion("DATA259 >=", value, "data259");
            return (Criteria) this;
        }

        public Criteria andData259LessThan(String value) {
            addCriterion("DATA259 <", value, "data259");
            return (Criteria) this;
        }

        public Criteria andData259LessThanOrEqualTo(String value) {
            addCriterion("DATA259 <=", value, "data259");
            return (Criteria) this;
        }

        public Criteria andData259Like(String value) {
            addCriterion("DATA259 like", value, "data259");
            return (Criteria) this;
        }

        public Criteria andData259NotLike(String value) {
            addCriterion("DATA259 not like", value, "data259");
            return (Criteria) this;
        }

        public Criteria andData259In(List<String> values) {
            addCriterion("DATA259 in", values, "data259");
            return (Criteria) this;
        }

        public Criteria andData259NotIn(List<String> values) {
            addCriterion("DATA259 not in", values, "data259");
            return (Criteria) this;
        }

        public Criteria andData259Between(String value1, String value2) {
            addCriterion("DATA259 between", value1, value2, "data259");
            return (Criteria) this;
        }

        public Criteria andData259NotBetween(String value1, String value2) {
            addCriterion("DATA259 not between", value1, value2, "data259");
            return (Criteria) this;
        }

        public Criteria andData260IsNull() {
            addCriterion("DATA260 is null");
            return (Criteria) this;
        }

        public Criteria andData260IsNotNull() {
            addCriterion("DATA260 is not null");
            return (Criteria) this;
        }

        public Criteria andData260EqualTo(String value) {
            addCriterion("DATA260 =", value, "data260");
            return (Criteria) this;
        }

        public Criteria andData260NotEqualTo(String value) {
            addCriterion("DATA260 <>", value, "data260");
            return (Criteria) this;
        }

        public Criteria andData260GreaterThan(String value) {
            addCriterion("DATA260 >", value, "data260");
            return (Criteria) this;
        }

        public Criteria andData260GreaterThanOrEqualTo(String value) {
            addCriterion("DATA260 >=", value, "data260");
            return (Criteria) this;
        }

        public Criteria andData260LessThan(String value) {
            addCriterion("DATA260 <", value, "data260");
            return (Criteria) this;
        }

        public Criteria andData260LessThanOrEqualTo(String value) {
            addCriterion("DATA260 <=", value, "data260");
            return (Criteria) this;
        }

        public Criteria andData260Like(String value) {
            addCriterion("DATA260 like", value, "data260");
            return (Criteria) this;
        }

        public Criteria andData260NotLike(String value) {
            addCriterion("DATA260 not like", value, "data260");
            return (Criteria) this;
        }

        public Criteria andData260In(List<String> values) {
            addCriterion("DATA260 in", values, "data260");
            return (Criteria) this;
        }

        public Criteria andData260NotIn(List<String> values) {
            addCriterion("DATA260 not in", values, "data260");
            return (Criteria) this;
        }

        public Criteria andData260Between(String value1, String value2) {
            addCriterion("DATA260 between", value1, value2, "data260");
            return (Criteria) this;
        }

        public Criteria andData260NotBetween(String value1, String value2) {
            addCriterion("DATA260 not between", value1, value2, "data260");
            return (Criteria) this;
        }

        public Criteria andData261IsNull() {
            addCriterion("DATA261 is null");
            return (Criteria) this;
        }

        public Criteria andData261IsNotNull() {
            addCriterion("DATA261 is not null");
            return (Criteria) this;
        }

        public Criteria andData261EqualTo(String value) {
            addCriterion("DATA261 =", value, "data261");
            return (Criteria) this;
        }

        public Criteria andData261NotEqualTo(String value) {
            addCriterion("DATA261 <>", value, "data261");
            return (Criteria) this;
        }

        public Criteria andData261GreaterThan(String value) {
            addCriterion("DATA261 >", value, "data261");
            return (Criteria) this;
        }

        public Criteria andData261GreaterThanOrEqualTo(String value) {
            addCriterion("DATA261 >=", value, "data261");
            return (Criteria) this;
        }

        public Criteria andData261LessThan(String value) {
            addCriterion("DATA261 <", value, "data261");
            return (Criteria) this;
        }

        public Criteria andData261LessThanOrEqualTo(String value) {
            addCriterion("DATA261 <=", value, "data261");
            return (Criteria) this;
        }

        public Criteria andData261Like(String value) {
            addCriterion("DATA261 like", value, "data261");
            return (Criteria) this;
        }

        public Criteria andData261NotLike(String value) {
            addCriterion("DATA261 not like", value, "data261");
            return (Criteria) this;
        }

        public Criteria andData261In(List<String> values) {
            addCriterion("DATA261 in", values, "data261");
            return (Criteria) this;
        }

        public Criteria andData261NotIn(List<String> values) {
            addCriterion("DATA261 not in", values, "data261");
            return (Criteria) this;
        }

        public Criteria andData261Between(String value1, String value2) {
            addCriterion("DATA261 between", value1, value2, "data261");
            return (Criteria) this;
        }

        public Criteria andData261NotBetween(String value1, String value2) {
            addCriterion("DATA261 not between", value1, value2, "data261");
            return (Criteria) this;
        }

        public Criteria andData262IsNull() {
            addCriterion("DATA262 is null");
            return (Criteria) this;
        }

        public Criteria andData262IsNotNull() {
            addCriterion("DATA262 is not null");
            return (Criteria) this;
        }

        public Criteria andData262EqualTo(String value) {
            addCriterion("DATA262 =", value, "data262");
            return (Criteria) this;
        }

        public Criteria andData262NotEqualTo(String value) {
            addCriterion("DATA262 <>", value, "data262");
            return (Criteria) this;
        }

        public Criteria andData262GreaterThan(String value) {
            addCriterion("DATA262 >", value, "data262");
            return (Criteria) this;
        }

        public Criteria andData262GreaterThanOrEqualTo(String value) {
            addCriterion("DATA262 >=", value, "data262");
            return (Criteria) this;
        }

        public Criteria andData262LessThan(String value) {
            addCriterion("DATA262 <", value, "data262");
            return (Criteria) this;
        }

        public Criteria andData262LessThanOrEqualTo(String value) {
            addCriterion("DATA262 <=", value, "data262");
            return (Criteria) this;
        }

        public Criteria andData262Like(String value) {
            addCriterion("DATA262 like", value, "data262");
            return (Criteria) this;
        }

        public Criteria andData262NotLike(String value) {
            addCriterion("DATA262 not like", value, "data262");
            return (Criteria) this;
        }

        public Criteria andData262In(List<String> values) {
            addCriterion("DATA262 in", values, "data262");
            return (Criteria) this;
        }

        public Criteria andData262NotIn(List<String> values) {
            addCriterion("DATA262 not in", values, "data262");
            return (Criteria) this;
        }

        public Criteria andData262Between(String value1, String value2) {
            addCriterion("DATA262 between", value1, value2, "data262");
            return (Criteria) this;
        }

        public Criteria andData262NotBetween(String value1, String value2) {
            addCriterion("DATA262 not between", value1, value2, "data262");
            return (Criteria) this;
        }

        public Criteria andData263IsNull() {
            addCriterion("DATA263 is null");
            return (Criteria) this;
        }

        public Criteria andData263IsNotNull() {
            addCriterion("DATA263 is not null");
            return (Criteria) this;
        }

        public Criteria andData263EqualTo(String value) {
            addCriterion("DATA263 =", value, "data263");
            return (Criteria) this;
        }

        public Criteria andData263NotEqualTo(String value) {
            addCriterion("DATA263 <>", value, "data263");
            return (Criteria) this;
        }

        public Criteria andData263GreaterThan(String value) {
            addCriterion("DATA263 >", value, "data263");
            return (Criteria) this;
        }

        public Criteria andData263GreaterThanOrEqualTo(String value) {
            addCriterion("DATA263 >=", value, "data263");
            return (Criteria) this;
        }

        public Criteria andData263LessThan(String value) {
            addCriterion("DATA263 <", value, "data263");
            return (Criteria) this;
        }

        public Criteria andData263LessThanOrEqualTo(String value) {
            addCriterion("DATA263 <=", value, "data263");
            return (Criteria) this;
        }

        public Criteria andData263Like(String value) {
            addCriterion("DATA263 like", value, "data263");
            return (Criteria) this;
        }

        public Criteria andData263NotLike(String value) {
            addCriterion("DATA263 not like", value, "data263");
            return (Criteria) this;
        }

        public Criteria andData263In(List<String> values) {
            addCriterion("DATA263 in", values, "data263");
            return (Criteria) this;
        }

        public Criteria andData263NotIn(List<String> values) {
            addCriterion("DATA263 not in", values, "data263");
            return (Criteria) this;
        }

        public Criteria andData263Between(String value1, String value2) {
            addCriterion("DATA263 between", value1, value2, "data263");
            return (Criteria) this;
        }

        public Criteria andData263NotBetween(String value1, String value2) {
            addCriterion("DATA263 not between", value1, value2, "data263");
            return (Criteria) this;
        }

        public Criteria andData264IsNull() {
            addCriterion("DATA264 is null");
            return (Criteria) this;
        }

        public Criteria andData264IsNotNull() {
            addCriterion("DATA264 is not null");
            return (Criteria) this;
        }

        public Criteria andData264EqualTo(String value) {
            addCriterion("DATA264 =", value, "data264");
            return (Criteria) this;
        }

        public Criteria andData264NotEqualTo(String value) {
            addCriterion("DATA264 <>", value, "data264");
            return (Criteria) this;
        }

        public Criteria andData264GreaterThan(String value) {
            addCriterion("DATA264 >", value, "data264");
            return (Criteria) this;
        }

        public Criteria andData264GreaterThanOrEqualTo(String value) {
            addCriterion("DATA264 >=", value, "data264");
            return (Criteria) this;
        }

        public Criteria andData264LessThan(String value) {
            addCriterion("DATA264 <", value, "data264");
            return (Criteria) this;
        }

        public Criteria andData264LessThanOrEqualTo(String value) {
            addCriterion("DATA264 <=", value, "data264");
            return (Criteria) this;
        }

        public Criteria andData264Like(String value) {
            addCriterion("DATA264 like", value, "data264");
            return (Criteria) this;
        }

        public Criteria andData264NotLike(String value) {
            addCriterion("DATA264 not like", value, "data264");
            return (Criteria) this;
        }

        public Criteria andData264In(List<String> values) {
            addCriterion("DATA264 in", values, "data264");
            return (Criteria) this;
        }

        public Criteria andData264NotIn(List<String> values) {
            addCriterion("DATA264 not in", values, "data264");
            return (Criteria) this;
        }

        public Criteria andData264Between(String value1, String value2) {
            addCriterion("DATA264 between", value1, value2, "data264");
            return (Criteria) this;
        }

        public Criteria andData264NotBetween(String value1, String value2) {
            addCriterion("DATA264 not between", value1, value2, "data264");
            return (Criteria) this;
        }

        public Criteria andData265IsNull() {
            addCriterion("DATA265 is null");
            return (Criteria) this;
        }

        public Criteria andData265IsNotNull() {
            addCriterion("DATA265 is not null");
            return (Criteria) this;
        }

        public Criteria andData265EqualTo(String value) {
            addCriterion("DATA265 =", value, "data265");
            return (Criteria) this;
        }

        public Criteria andData265NotEqualTo(String value) {
            addCriterion("DATA265 <>", value, "data265");
            return (Criteria) this;
        }

        public Criteria andData265GreaterThan(String value) {
            addCriterion("DATA265 >", value, "data265");
            return (Criteria) this;
        }

        public Criteria andData265GreaterThanOrEqualTo(String value) {
            addCriterion("DATA265 >=", value, "data265");
            return (Criteria) this;
        }

        public Criteria andData265LessThan(String value) {
            addCriterion("DATA265 <", value, "data265");
            return (Criteria) this;
        }

        public Criteria andData265LessThanOrEqualTo(String value) {
            addCriterion("DATA265 <=", value, "data265");
            return (Criteria) this;
        }

        public Criteria andData265Like(String value) {
            addCriterion("DATA265 like", value, "data265");
            return (Criteria) this;
        }

        public Criteria andData265NotLike(String value) {
            addCriterion("DATA265 not like", value, "data265");
            return (Criteria) this;
        }

        public Criteria andData265In(List<String> values) {
            addCriterion("DATA265 in", values, "data265");
            return (Criteria) this;
        }

        public Criteria andData265NotIn(List<String> values) {
            addCriterion("DATA265 not in", values, "data265");
            return (Criteria) this;
        }

        public Criteria andData265Between(String value1, String value2) {
            addCriterion("DATA265 between", value1, value2, "data265");
            return (Criteria) this;
        }

        public Criteria andData265NotBetween(String value1, String value2) {
            addCriterion("DATA265 not between", value1, value2, "data265");
            return (Criteria) this;
        }

        public Criteria andData266IsNull() {
            addCriterion("DATA266 is null");
            return (Criteria) this;
        }

        public Criteria andData266IsNotNull() {
            addCriterion("DATA266 is not null");
            return (Criteria) this;
        }

        public Criteria andData266EqualTo(String value) {
            addCriterion("DATA266 =", value, "data266");
            return (Criteria) this;
        }

        public Criteria andData266NotEqualTo(String value) {
            addCriterion("DATA266 <>", value, "data266");
            return (Criteria) this;
        }

        public Criteria andData266GreaterThan(String value) {
            addCriterion("DATA266 >", value, "data266");
            return (Criteria) this;
        }

        public Criteria andData266GreaterThanOrEqualTo(String value) {
            addCriterion("DATA266 >=", value, "data266");
            return (Criteria) this;
        }

        public Criteria andData266LessThan(String value) {
            addCriterion("DATA266 <", value, "data266");
            return (Criteria) this;
        }

        public Criteria andData266LessThanOrEqualTo(String value) {
            addCriterion("DATA266 <=", value, "data266");
            return (Criteria) this;
        }

        public Criteria andData266Like(String value) {
            addCriterion("DATA266 like", value, "data266");
            return (Criteria) this;
        }

        public Criteria andData266NotLike(String value) {
            addCriterion("DATA266 not like", value, "data266");
            return (Criteria) this;
        }

        public Criteria andData266In(List<String> values) {
            addCriterion("DATA266 in", values, "data266");
            return (Criteria) this;
        }

        public Criteria andData266NotIn(List<String> values) {
            addCriterion("DATA266 not in", values, "data266");
            return (Criteria) this;
        }

        public Criteria andData266Between(String value1, String value2) {
            addCriterion("DATA266 between", value1, value2, "data266");
            return (Criteria) this;
        }

        public Criteria andData266NotBetween(String value1, String value2) {
            addCriterion("DATA266 not between", value1, value2, "data266");
            return (Criteria) this;
        }

        public Criteria andData267IsNull() {
            addCriterion("DATA267 is null");
            return (Criteria) this;
        }

        public Criteria andData267IsNotNull() {
            addCriterion("DATA267 is not null");
            return (Criteria) this;
        }

        public Criteria andData267EqualTo(String value) {
            addCriterion("DATA267 =", value, "data267");
            return (Criteria) this;
        }

        public Criteria andData267NotEqualTo(String value) {
            addCriterion("DATA267 <>", value, "data267");
            return (Criteria) this;
        }

        public Criteria andData267GreaterThan(String value) {
            addCriterion("DATA267 >", value, "data267");
            return (Criteria) this;
        }

        public Criteria andData267GreaterThanOrEqualTo(String value) {
            addCriterion("DATA267 >=", value, "data267");
            return (Criteria) this;
        }

        public Criteria andData267LessThan(String value) {
            addCriterion("DATA267 <", value, "data267");
            return (Criteria) this;
        }

        public Criteria andData267LessThanOrEqualTo(String value) {
            addCriterion("DATA267 <=", value, "data267");
            return (Criteria) this;
        }

        public Criteria andData267Like(String value) {
            addCriterion("DATA267 like", value, "data267");
            return (Criteria) this;
        }

        public Criteria andData267NotLike(String value) {
            addCriterion("DATA267 not like", value, "data267");
            return (Criteria) this;
        }

        public Criteria andData267In(List<String> values) {
            addCriterion("DATA267 in", values, "data267");
            return (Criteria) this;
        }

        public Criteria andData267NotIn(List<String> values) {
            addCriterion("DATA267 not in", values, "data267");
            return (Criteria) this;
        }

        public Criteria andData267Between(String value1, String value2) {
            addCriterion("DATA267 between", value1, value2, "data267");
            return (Criteria) this;
        }

        public Criteria andData267NotBetween(String value1, String value2) {
            addCriterion("DATA267 not between", value1, value2, "data267");
            return (Criteria) this;
        }

        public Criteria andData268IsNull() {
            addCriterion("DATA268 is null");
            return (Criteria) this;
        }

        public Criteria andData268IsNotNull() {
            addCriterion("DATA268 is not null");
            return (Criteria) this;
        }

        public Criteria andData268EqualTo(String value) {
            addCriterion("DATA268 =", value, "data268");
            return (Criteria) this;
        }

        public Criteria andData268NotEqualTo(String value) {
            addCriterion("DATA268 <>", value, "data268");
            return (Criteria) this;
        }

        public Criteria andData268GreaterThan(String value) {
            addCriterion("DATA268 >", value, "data268");
            return (Criteria) this;
        }

        public Criteria andData268GreaterThanOrEqualTo(String value) {
            addCriterion("DATA268 >=", value, "data268");
            return (Criteria) this;
        }

        public Criteria andData268LessThan(String value) {
            addCriterion("DATA268 <", value, "data268");
            return (Criteria) this;
        }

        public Criteria andData268LessThanOrEqualTo(String value) {
            addCriterion("DATA268 <=", value, "data268");
            return (Criteria) this;
        }

        public Criteria andData268Like(String value) {
            addCriterion("DATA268 like", value, "data268");
            return (Criteria) this;
        }

        public Criteria andData268NotLike(String value) {
            addCriterion("DATA268 not like", value, "data268");
            return (Criteria) this;
        }

        public Criteria andData268In(List<String> values) {
            addCriterion("DATA268 in", values, "data268");
            return (Criteria) this;
        }

        public Criteria andData268NotIn(List<String> values) {
            addCriterion("DATA268 not in", values, "data268");
            return (Criteria) this;
        }

        public Criteria andData268Between(String value1, String value2) {
            addCriterion("DATA268 between", value1, value2, "data268");
            return (Criteria) this;
        }

        public Criteria andData268NotBetween(String value1, String value2) {
            addCriterion("DATA268 not between", value1, value2, "data268");
            return (Criteria) this;
        }

        public Criteria andData269IsNull() {
            addCriterion("DATA269 is null");
            return (Criteria) this;
        }

        public Criteria andData269IsNotNull() {
            addCriterion("DATA269 is not null");
            return (Criteria) this;
        }

        public Criteria andData269EqualTo(String value) {
            addCriterion("DATA269 =", value, "data269");
            return (Criteria) this;
        }

        public Criteria andData269NotEqualTo(String value) {
            addCriterion("DATA269 <>", value, "data269");
            return (Criteria) this;
        }

        public Criteria andData269GreaterThan(String value) {
            addCriterion("DATA269 >", value, "data269");
            return (Criteria) this;
        }

        public Criteria andData269GreaterThanOrEqualTo(String value) {
            addCriterion("DATA269 >=", value, "data269");
            return (Criteria) this;
        }

        public Criteria andData269LessThan(String value) {
            addCriterion("DATA269 <", value, "data269");
            return (Criteria) this;
        }

        public Criteria andData269LessThanOrEqualTo(String value) {
            addCriterion("DATA269 <=", value, "data269");
            return (Criteria) this;
        }

        public Criteria andData269Like(String value) {
            addCriterion("DATA269 like", value, "data269");
            return (Criteria) this;
        }

        public Criteria andData269NotLike(String value) {
            addCriterion("DATA269 not like", value, "data269");
            return (Criteria) this;
        }

        public Criteria andData269In(List<String> values) {
            addCriterion("DATA269 in", values, "data269");
            return (Criteria) this;
        }

        public Criteria andData269NotIn(List<String> values) {
            addCriterion("DATA269 not in", values, "data269");
            return (Criteria) this;
        }

        public Criteria andData269Between(String value1, String value2) {
            addCriterion("DATA269 between", value1, value2, "data269");
            return (Criteria) this;
        }

        public Criteria andData269NotBetween(String value1, String value2) {
            addCriterion("DATA269 not between", value1, value2, "data269");
            return (Criteria) this;
        }

        public Criteria andData270IsNull() {
            addCriterion("DATA270 is null");
            return (Criteria) this;
        }

        public Criteria andData270IsNotNull() {
            addCriterion("DATA270 is not null");
            return (Criteria) this;
        }

        public Criteria andData270EqualTo(String value) {
            addCriterion("DATA270 =", value, "data270");
            return (Criteria) this;
        }

        public Criteria andData270NotEqualTo(String value) {
            addCriterion("DATA270 <>", value, "data270");
            return (Criteria) this;
        }

        public Criteria andData270GreaterThan(String value) {
            addCriterion("DATA270 >", value, "data270");
            return (Criteria) this;
        }

        public Criteria andData270GreaterThanOrEqualTo(String value) {
            addCriterion("DATA270 >=", value, "data270");
            return (Criteria) this;
        }

        public Criteria andData270LessThan(String value) {
            addCriterion("DATA270 <", value, "data270");
            return (Criteria) this;
        }

        public Criteria andData270LessThanOrEqualTo(String value) {
            addCriterion("DATA270 <=", value, "data270");
            return (Criteria) this;
        }

        public Criteria andData270Like(String value) {
            addCriterion("DATA270 like", value, "data270");
            return (Criteria) this;
        }

        public Criteria andData270NotLike(String value) {
            addCriterion("DATA270 not like", value, "data270");
            return (Criteria) this;
        }

        public Criteria andData270In(List<String> values) {
            addCriterion("DATA270 in", values, "data270");
            return (Criteria) this;
        }

        public Criteria andData270NotIn(List<String> values) {
            addCriterion("DATA270 not in", values, "data270");
            return (Criteria) this;
        }

        public Criteria andData270Between(String value1, String value2) {
            addCriterion("DATA270 between", value1, value2, "data270");
            return (Criteria) this;
        }

        public Criteria andData270NotBetween(String value1, String value2) {
            addCriterion("DATA270 not between", value1, value2, "data270");
            return (Criteria) this;
        }

        public Criteria andData271IsNull() {
            addCriterion("DATA271 is null");
            return (Criteria) this;
        }

        public Criteria andData271IsNotNull() {
            addCriterion("DATA271 is not null");
            return (Criteria) this;
        }

        public Criteria andData271EqualTo(String value) {
            addCriterion("DATA271 =", value, "data271");
            return (Criteria) this;
        }

        public Criteria andData271NotEqualTo(String value) {
            addCriterion("DATA271 <>", value, "data271");
            return (Criteria) this;
        }

        public Criteria andData271GreaterThan(String value) {
            addCriterion("DATA271 >", value, "data271");
            return (Criteria) this;
        }

        public Criteria andData271GreaterThanOrEqualTo(String value) {
            addCriterion("DATA271 >=", value, "data271");
            return (Criteria) this;
        }

        public Criteria andData271LessThan(String value) {
            addCriterion("DATA271 <", value, "data271");
            return (Criteria) this;
        }

        public Criteria andData271LessThanOrEqualTo(String value) {
            addCriterion("DATA271 <=", value, "data271");
            return (Criteria) this;
        }

        public Criteria andData271Like(String value) {
            addCriterion("DATA271 like", value, "data271");
            return (Criteria) this;
        }

        public Criteria andData271NotLike(String value) {
            addCriterion("DATA271 not like", value, "data271");
            return (Criteria) this;
        }

        public Criteria andData271In(List<String> values) {
            addCriterion("DATA271 in", values, "data271");
            return (Criteria) this;
        }

        public Criteria andData271NotIn(List<String> values) {
            addCriterion("DATA271 not in", values, "data271");
            return (Criteria) this;
        }

        public Criteria andData271Between(String value1, String value2) {
            addCriterion("DATA271 between", value1, value2, "data271");
            return (Criteria) this;
        }

        public Criteria andData271NotBetween(String value1, String value2) {
            addCriterion("DATA271 not between", value1, value2, "data271");
            return (Criteria) this;
        }

        public Criteria andData272IsNull() {
            addCriterion("DATA272 is null");
            return (Criteria) this;
        }

        public Criteria andData272IsNotNull() {
            addCriterion("DATA272 is not null");
            return (Criteria) this;
        }

        public Criteria andData272EqualTo(String value) {
            addCriterion("DATA272 =", value, "data272");
            return (Criteria) this;
        }

        public Criteria andData272NotEqualTo(String value) {
            addCriterion("DATA272 <>", value, "data272");
            return (Criteria) this;
        }

        public Criteria andData272GreaterThan(String value) {
            addCriterion("DATA272 >", value, "data272");
            return (Criteria) this;
        }

        public Criteria andData272GreaterThanOrEqualTo(String value) {
            addCriterion("DATA272 >=", value, "data272");
            return (Criteria) this;
        }

        public Criteria andData272LessThan(String value) {
            addCriterion("DATA272 <", value, "data272");
            return (Criteria) this;
        }

        public Criteria andData272LessThanOrEqualTo(String value) {
            addCriterion("DATA272 <=", value, "data272");
            return (Criteria) this;
        }

        public Criteria andData272Like(String value) {
            addCriterion("DATA272 like", value, "data272");
            return (Criteria) this;
        }

        public Criteria andData272NotLike(String value) {
            addCriterion("DATA272 not like", value, "data272");
            return (Criteria) this;
        }

        public Criteria andData272In(List<String> values) {
            addCriterion("DATA272 in", values, "data272");
            return (Criteria) this;
        }

        public Criteria andData272NotIn(List<String> values) {
            addCriterion("DATA272 not in", values, "data272");
            return (Criteria) this;
        }

        public Criteria andData272Between(String value1, String value2) {
            addCriterion("DATA272 between", value1, value2, "data272");
            return (Criteria) this;
        }

        public Criteria andData272NotBetween(String value1, String value2) {
            addCriterion("DATA272 not between", value1, value2, "data272");
            return (Criteria) this;
        }

        public Criteria andData273IsNull() {
            addCriterion("DATA273 is null");
            return (Criteria) this;
        }

        public Criteria andData273IsNotNull() {
            addCriterion("DATA273 is not null");
            return (Criteria) this;
        }

        public Criteria andData273EqualTo(String value) {
            addCriterion("DATA273 =", value, "data273");
            return (Criteria) this;
        }

        public Criteria andData273NotEqualTo(String value) {
            addCriterion("DATA273 <>", value, "data273");
            return (Criteria) this;
        }

        public Criteria andData273GreaterThan(String value) {
            addCriterion("DATA273 >", value, "data273");
            return (Criteria) this;
        }

        public Criteria andData273GreaterThanOrEqualTo(String value) {
            addCriterion("DATA273 >=", value, "data273");
            return (Criteria) this;
        }

        public Criteria andData273LessThan(String value) {
            addCriterion("DATA273 <", value, "data273");
            return (Criteria) this;
        }

        public Criteria andData273LessThanOrEqualTo(String value) {
            addCriterion("DATA273 <=", value, "data273");
            return (Criteria) this;
        }

        public Criteria andData273Like(String value) {
            addCriterion("DATA273 like", value, "data273");
            return (Criteria) this;
        }

        public Criteria andData273NotLike(String value) {
            addCriterion("DATA273 not like", value, "data273");
            return (Criteria) this;
        }

        public Criteria andData273In(List<String> values) {
            addCriterion("DATA273 in", values, "data273");
            return (Criteria) this;
        }

        public Criteria andData273NotIn(List<String> values) {
            addCriterion("DATA273 not in", values, "data273");
            return (Criteria) this;
        }

        public Criteria andData273Between(String value1, String value2) {
            addCriterion("DATA273 between", value1, value2, "data273");
            return (Criteria) this;
        }

        public Criteria andData273NotBetween(String value1, String value2) {
            addCriterion("DATA273 not between", value1, value2, "data273");
            return (Criteria) this;
        }

        public Criteria andData274IsNull() {
            addCriterion("DATA274 is null");
            return (Criteria) this;
        }

        public Criteria andData274IsNotNull() {
            addCriterion("DATA274 is not null");
            return (Criteria) this;
        }

        public Criteria andData274EqualTo(String value) {
            addCriterion("DATA274 =", value, "data274");
            return (Criteria) this;
        }

        public Criteria andData274NotEqualTo(String value) {
            addCriterion("DATA274 <>", value, "data274");
            return (Criteria) this;
        }

        public Criteria andData274GreaterThan(String value) {
            addCriterion("DATA274 >", value, "data274");
            return (Criteria) this;
        }

        public Criteria andData274GreaterThanOrEqualTo(String value) {
            addCriterion("DATA274 >=", value, "data274");
            return (Criteria) this;
        }

        public Criteria andData274LessThan(String value) {
            addCriterion("DATA274 <", value, "data274");
            return (Criteria) this;
        }

        public Criteria andData274LessThanOrEqualTo(String value) {
            addCriterion("DATA274 <=", value, "data274");
            return (Criteria) this;
        }

        public Criteria andData274Like(String value) {
            addCriterion("DATA274 like", value, "data274");
            return (Criteria) this;
        }

        public Criteria andData274NotLike(String value) {
            addCriterion("DATA274 not like", value, "data274");
            return (Criteria) this;
        }

        public Criteria andData274In(List<String> values) {
            addCriterion("DATA274 in", values, "data274");
            return (Criteria) this;
        }

        public Criteria andData274NotIn(List<String> values) {
            addCriterion("DATA274 not in", values, "data274");
            return (Criteria) this;
        }

        public Criteria andData274Between(String value1, String value2) {
            addCriterion("DATA274 between", value1, value2, "data274");
            return (Criteria) this;
        }

        public Criteria andData274NotBetween(String value1, String value2) {
            addCriterion("DATA274 not between", value1, value2, "data274");
            return (Criteria) this;
        }

        public Criteria andData275IsNull() {
            addCriterion("DATA275 is null");
            return (Criteria) this;
        }

        public Criteria andData275IsNotNull() {
            addCriterion("DATA275 is not null");
            return (Criteria) this;
        }

        public Criteria andData275EqualTo(String value) {
            addCriterion("DATA275 =", value, "data275");
            return (Criteria) this;
        }

        public Criteria andData275NotEqualTo(String value) {
            addCriterion("DATA275 <>", value, "data275");
            return (Criteria) this;
        }

        public Criteria andData275GreaterThan(String value) {
            addCriterion("DATA275 >", value, "data275");
            return (Criteria) this;
        }

        public Criteria andData275GreaterThanOrEqualTo(String value) {
            addCriterion("DATA275 >=", value, "data275");
            return (Criteria) this;
        }

        public Criteria andData275LessThan(String value) {
            addCriterion("DATA275 <", value, "data275");
            return (Criteria) this;
        }

        public Criteria andData275LessThanOrEqualTo(String value) {
            addCriterion("DATA275 <=", value, "data275");
            return (Criteria) this;
        }

        public Criteria andData275Like(String value) {
            addCriterion("DATA275 like", value, "data275");
            return (Criteria) this;
        }

        public Criteria andData275NotLike(String value) {
            addCriterion("DATA275 not like", value, "data275");
            return (Criteria) this;
        }

        public Criteria andData275In(List<String> values) {
            addCriterion("DATA275 in", values, "data275");
            return (Criteria) this;
        }

        public Criteria andData275NotIn(List<String> values) {
            addCriterion("DATA275 not in", values, "data275");
            return (Criteria) this;
        }

        public Criteria andData275Between(String value1, String value2) {
            addCriterion("DATA275 between", value1, value2, "data275");
            return (Criteria) this;
        }

        public Criteria andData275NotBetween(String value1, String value2) {
            addCriterion("DATA275 not between", value1, value2, "data275");
            return (Criteria) this;
        }

        public Criteria andData276IsNull() {
            addCriterion("DATA276 is null");
            return (Criteria) this;
        }

        public Criteria andData276IsNotNull() {
            addCriterion("DATA276 is not null");
            return (Criteria) this;
        }

        public Criteria andData276EqualTo(String value) {
            addCriterion("DATA276 =", value, "data276");
            return (Criteria) this;
        }

        public Criteria andData276NotEqualTo(String value) {
            addCriterion("DATA276 <>", value, "data276");
            return (Criteria) this;
        }

        public Criteria andData276GreaterThan(String value) {
            addCriterion("DATA276 >", value, "data276");
            return (Criteria) this;
        }

        public Criteria andData276GreaterThanOrEqualTo(String value) {
            addCriterion("DATA276 >=", value, "data276");
            return (Criteria) this;
        }

        public Criteria andData276LessThan(String value) {
            addCriterion("DATA276 <", value, "data276");
            return (Criteria) this;
        }

        public Criteria andData276LessThanOrEqualTo(String value) {
            addCriterion("DATA276 <=", value, "data276");
            return (Criteria) this;
        }

        public Criteria andData276Like(String value) {
            addCriterion("DATA276 like", value, "data276");
            return (Criteria) this;
        }

        public Criteria andData276NotLike(String value) {
            addCriterion("DATA276 not like", value, "data276");
            return (Criteria) this;
        }

        public Criteria andData276In(List<String> values) {
            addCriterion("DATA276 in", values, "data276");
            return (Criteria) this;
        }

        public Criteria andData276NotIn(List<String> values) {
            addCriterion("DATA276 not in", values, "data276");
            return (Criteria) this;
        }

        public Criteria andData276Between(String value1, String value2) {
            addCriterion("DATA276 between", value1, value2, "data276");
            return (Criteria) this;
        }

        public Criteria andData276NotBetween(String value1, String value2) {
            addCriterion("DATA276 not between", value1, value2, "data276");
            return (Criteria) this;
        }

        public Criteria andData277IsNull() {
            addCriterion("DATA277 is null");
            return (Criteria) this;
        }

        public Criteria andData277IsNotNull() {
            addCriterion("DATA277 is not null");
            return (Criteria) this;
        }

        public Criteria andData277EqualTo(String value) {
            addCriterion("DATA277 =", value, "data277");
            return (Criteria) this;
        }

        public Criteria andData277NotEqualTo(String value) {
            addCriterion("DATA277 <>", value, "data277");
            return (Criteria) this;
        }

        public Criteria andData277GreaterThan(String value) {
            addCriterion("DATA277 >", value, "data277");
            return (Criteria) this;
        }

        public Criteria andData277GreaterThanOrEqualTo(String value) {
            addCriterion("DATA277 >=", value, "data277");
            return (Criteria) this;
        }

        public Criteria andData277LessThan(String value) {
            addCriterion("DATA277 <", value, "data277");
            return (Criteria) this;
        }

        public Criteria andData277LessThanOrEqualTo(String value) {
            addCriterion("DATA277 <=", value, "data277");
            return (Criteria) this;
        }

        public Criteria andData277Like(String value) {
            addCriterion("DATA277 like", value, "data277");
            return (Criteria) this;
        }

        public Criteria andData277NotLike(String value) {
            addCriterion("DATA277 not like", value, "data277");
            return (Criteria) this;
        }

        public Criteria andData277In(List<String> values) {
            addCriterion("DATA277 in", values, "data277");
            return (Criteria) this;
        }

        public Criteria andData277NotIn(List<String> values) {
            addCriterion("DATA277 not in", values, "data277");
            return (Criteria) this;
        }

        public Criteria andData277Between(String value1, String value2) {
            addCriterion("DATA277 between", value1, value2, "data277");
            return (Criteria) this;
        }

        public Criteria andData277NotBetween(String value1, String value2) {
            addCriterion("DATA277 not between", value1, value2, "data277");
            return (Criteria) this;
        }

        public Criteria andData278IsNull() {
            addCriterion("DATA278 is null");
            return (Criteria) this;
        }

        public Criteria andData278IsNotNull() {
            addCriterion("DATA278 is not null");
            return (Criteria) this;
        }

        public Criteria andData278EqualTo(String value) {
            addCriterion("DATA278 =", value, "data278");
            return (Criteria) this;
        }

        public Criteria andData278NotEqualTo(String value) {
            addCriterion("DATA278 <>", value, "data278");
            return (Criteria) this;
        }

        public Criteria andData278GreaterThan(String value) {
            addCriterion("DATA278 >", value, "data278");
            return (Criteria) this;
        }

        public Criteria andData278GreaterThanOrEqualTo(String value) {
            addCriterion("DATA278 >=", value, "data278");
            return (Criteria) this;
        }

        public Criteria andData278LessThan(String value) {
            addCriterion("DATA278 <", value, "data278");
            return (Criteria) this;
        }

        public Criteria andData278LessThanOrEqualTo(String value) {
            addCriterion("DATA278 <=", value, "data278");
            return (Criteria) this;
        }

        public Criteria andData278Like(String value) {
            addCriterion("DATA278 like", value, "data278");
            return (Criteria) this;
        }

        public Criteria andData278NotLike(String value) {
            addCriterion("DATA278 not like", value, "data278");
            return (Criteria) this;
        }

        public Criteria andData278In(List<String> values) {
            addCriterion("DATA278 in", values, "data278");
            return (Criteria) this;
        }

        public Criteria andData278NotIn(List<String> values) {
            addCriterion("DATA278 not in", values, "data278");
            return (Criteria) this;
        }

        public Criteria andData278Between(String value1, String value2) {
            addCriterion("DATA278 between", value1, value2, "data278");
            return (Criteria) this;
        }

        public Criteria andData278NotBetween(String value1, String value2) {
            addCriterion("DATA278 not between", value1, value2, "data278");
            return (Criteria) this;
        }

        public Criteria andData279IsNull() {
            addCriterion("DATA279 is null");
            return (Criteria) this;
        }

        public Criteria andData279IsNotNull() {
            addCriterion("DATA279 is not null");
            return (Criteria) this;
        }

        public Criteria andData279EqualTo(String value) {
            addCriterion("DATA279 =", value, "data279");
            return (Criteria) this;
        }

        public Criteria andData279NotEqualTo(String value) {
            addCriterion("DATA279 <>", value, "data279");
            return (Criteria) this;
        }

        public Criteria andData279GreaterThan(String value) {
            addCriterion("DATA279 >", value, "data279");
            return (Criteria) this;
        }

        public Criteria andData279GreaterThanOrEqualTo(String value) {
            addCriterion("DATA279 >=", value, "data279");
            return (Criteria) this;
        }

        public Criteria andData279LessThan(String value) {
            addCriterion("DATA279 <", value, "data279");
            return (Criteria) this;
        }

        public Criteria andData279LessThanOrEqualTo(String value) {
            addCriterion("DATA279 <=", value, "data279");
            return (Criteria) this;
        }

        public Criteria andData279Like(String value) {
            addCriterion("DATA279 like", value, "data279");
            return (Criteria) this;
        }

        public Criteria andData279NotLike(String value) {
            addCriterion("DATA279 not like", value, "data279");
            return (Criteria) this;
        }

        public Criteria andData279In(List<String> values) {
            addCriterion("DATA279 in", values, "data279");
            return (Criteria) this;
        }

        public Criteria andData279NotIn(List<String> values) {
            addCriterion("DATA279 not in", values, "data279");
            return (Criteria) this;
        }

        public Criteria andData279Between(String value1, String value2) {
            addCriterion("DATA279 between", value1, value2, "data279");
            return (Criteria) this;
        }

        public Criteria andData279NotBetween(String value1, String value2) {
            addCriterion("DATA279 not between", value1, value2, "data279");
            return (Criteria) this;
        }

        public Criteria andData280IsNull() {
            addCriterion("DATA280 is null");
            return (Criteria) this;
        }

        public Criteria andData280IsNotNull() {
            addCriterion("DATA280 is not null");
            return (Criteria) this;
        }

        public Criteria andData280EqualTo(String value) {
            addCriterion("DATA280 =", value, "data280");
            return (Criteria) this;
        }

        public Criteria andData280NotEqualTo(String value) {
            addCriterion("DATA280 <>", value, "data280");
            return (Criteria) this;
        }

        public Criteria andData280GreaterThan(String value) {
            addCriterion("DATA280 >", value, "data280");
            return (Criteria) this;
        }

        public Criteria andData280GreaterThanOrEqualTo(String value) {
            addCriterion("DATA280 >=", value, "data280");
            return (Criteria) this;
        }

        public Criteria andData280LessThan(String value) {
            addCriterion("DATA280 <", value, "data280");
            return (Criteria) this;
        }

        public Criteria andData280LessThanOrEqualTo(String value) {
            addCriterion("DATA280 <=", value, "data280");
            return (Criteria) this;
        }

        public Criteria andData280Like(String value) {
            addCriterion("DATA280 like", value, "data280");
            return (Criteria) this;
        }

        public Criteria andData280NotLike(String value) {
            addCriterion("DATA280 not like", value, "data280");
            return (Criteria) this;
        }

        public Criteria andData280In(List<String> values) {
            addCriterion("DATA280 in", values, "data280");
            return (Criteria) this;
        }

        public Criteria andData280NotIn(List<String> values) {
            addCriterion("DATA280 not in", values, "data280");
            return (Criteria) this;
        }

        public Criteria andData280Between(String value1, String value2) {
            addCriterion("DATA280 between", value1, value2, "data280");
            return (Criteria) this;
        }

        public Criteria andData280NotBetween(String value1, String value2) {
            addCriterion("DATA280 not between", value1, value2, "data280");
            return (Criteria) this;
        }

        public Criteria andData281IsNull() {
            addCriterion("DATA281 is null");
            return (Criteria) this;
        }

        public Criteria andData281IsNotNull() {
            addCriterion("DATA281 is not null");
            return (Criteria) this;
        }

        public Criteria andData281EqualTo(String value) {
            addCriterion("DATA281 =", value, "data281");
            return (Criteria) this;
        }

        public Criteria andData281NotEqualTo(String value) {
            addCriterion("DATA281 <>", value, "data281");
            return (Criteria) this;
        }

        public Criteria andData281GreaterThan(String value) {
            addCriterion("DATA281 >", value, "data281");
            return (Criteria) this;
        }

        public Criteria andData281GreaterThanOrEqualTo(String value) {
            addCriterion("DATA281 >=", value, "data281");
            return (Criteria) this;
        }

        public Criteria andData281LessThan(String value) {
            addCriterion("DATA281 <", value, "data281");
            return (Criteria) this;
        }

        public Criteria andData281LessThanOrEqualTo(String value) {
            addCriterion("DATA281 <=", value, "data281");
            return (Criteria) this;
        }

        public Criteria andData281Like(String value) {
            addCriterion("DATA281 like", value, "data281");
            return (Criteria) this;
        }

        public Criteria andData281NotLike(String value) {
            addCriterion("DATA281 not like", value, "data281");
            return (Criteria) this;
        }

        public Criteria andData281In(List<String> values) {
            addCriterion("DATA281 in", values, "data281");
            return (Criteria) this;
        }

        public Criteria andData281NotIn(List<String> values) {
            addCriterion("DATA281 not in", values, "data281");
            return (Criteria) this;
        }

        public Criteria andData281Between(String value1, String value2) {
            addCriterion("DATA281 between", value1, value2, "data281");
            return (Criteria) this;
        }

        public Criteria andData281NotBetween(String value1, String value2) {
            addCriterion("DATA281 not between", value1, value2, "data281");
            return (Criteria) this;
        }

        public Criteria andData282IsNull() {
            addCriterion("DATA282 is null");
            return (Criteria) this;
        }

        public Criteria andData282IsNotNull() {
            addCriterion("DATA282 is not null");
            return (Criteria) this;
        }

        public Criteria andData282EqualTo(String value) {
            addCriterion("DATA282 =", value, "data282");
            return (Criteria) this;
        }

        public Criteria andData282NotEqualTo(String value) {
            addCriterion("DATA282 <>", value, "data282");
            return (Criteria) this;
        }

        public Criteria andData282GreaterThan(String value) {
            addCriterion("DATA282 >", value, "data282");
            return (Criteria) this;
        }

        public Criteria andData282GreaterThanOrEqualTo(String value) {
            addCriterion("DATA282 >=", value, "data282");
            return (Criteria) this;
        }

        public Criteria andData282LessThan(String value) {
            addCriterion("DATA282 <", value, "data282");
            return (Criteria) this;
        }

        public Criteria andData282LessThanOrEqualTo(String value) {
            addCriterion("DATA282 <=", value, "data282");
            return (Criteria) this;
        }

        public Criteria andData282Like(String value) {
            addCriterion("DATA282 like", value, "data282");
            return (Criteria) this;
        }

        public Criteria andData282NotLike(String value) {
            addCriterion("DATA282 not like", value, "data282");
            return (Criteria) this;
        }

        public Criteria andData282In(List<String> values) {
            addCriterion("DATA282 in", values, "data282");
            return (Criteria) this;
        }

        public Criteria andData282NotIn(List<String> values) {
            addCriterion("DATA282 not in", values, "data282");
            return (Criteria) this;
        }

        public Criteria andData282Between(String value1, String value2) {
            addCriterion("DATA282 between", value1, value2, "data282");
            return (Criteria) this;
        }

        public Criteria andData282NotBetween(String value1, String value2) {
            addCriterion("DATA282 not between", value1, value2, "data282");
            return (Criteria) this;
        }

        public Criteria andData283IsNull() {
            addCriterion("DATA283 is null");
            return (Criteria) this;
        }

        public Criteria andData283IsNotNull() {
            addCriterion("DATA283 is not null");
            return (Criteria) this;
        }

        public Criteria andData283EqualTo(String value) {
            addCriterion("DATA283 =", value, "data283");
            return (Criteria) this;
        }

        public Criteria andData283NotEqualTo(String value) {
            addCriterion("DATA283 <>", value, "data283");
            return (Criteria) this;
        }

        public Criteria andData283GreaterThan(String value) {
            addCriterion("DATA283 >", value, "data283");
            return (Criteria) this;
        }

        public Criteria andData283GreaterThanOrEqualTo(String value) {
            addCriterion("DATA283 >=", value, "data283");
            return (Criteria) this;
        }

        public Criteria andData283LessThan(String value) {
            addCriterion("DATA283 <", value, "data283");
            return (Criteria) this;
        }

        public Criteria andData283LessThanOrEqualTo(String value) {
            addCriterion("DATA283 <=", value, "data283");
            return (Criteria) this;
        }

        public Criteria andData283Like(String value) {
            addCriterion("DATA283 like", value, "data283");
            return (Criteria) this;
        }

        public Criteria andData283NotLike(String value) {
            addCriterion("DATA283 not like", value, "data283");
            return (Criteria) this;
        }

        public Criteria andData283In(List<String> values) {
            addCriterion("DATA283 in", values, "data283");
            return (Criteria) this;
        }

        public Criteria andData283NotIn(List<String> values) {
            addCriterion("DATA283 not in", values, "data283");
            return (Criteria) this;
        }

        public Criteria andData283Between(String value1, String value2) {
            addCriterion("DATA283 between", value1, value2, "data283");
            return (Criteria) this;
        }

        public Criteria andData283NotBetween(String value1, String value2) {
            addCriterion("DATA283 not between", value1, value2, "data283");
            return (Criteria) this;
        }

        public Criteria andData284IsNull() {
            addCriterion("DATA284 is null");
            return (Criteria) this;
        }

        public Criteria andData284IsNotNull() {
            addCriterion("DATA284 is not null");
            return (Criteria) this;
        }

        public Criteria andData284EqualTo(String value) {
            addCriterion("DATA284 =", value, "data284");
            return (Criteria) this;
        }

        public Criteria andData284NotEqualTo(String value) {
            addCriterion("DATA284 <>", value, "data284");
            return (Criteria) this;
        }

        public Criteria andData284GreaterThan(String value) {
            addCriterion("DATA284 >", value, "data284");
            return (Criteria) this;
        }

        public Criteria andData284GreaterThanOrEqualTo(String value) {
            addCriterion("DATA284 >=", value, "data284");
            return (Criteria) this;
        }

        public Criteria andData284LessThan(String value) {
            addCriterion("DATA284 <", value, "data284");
            return (Criteria) this;
        }

        public Criteria andData284LessThanOrEqualTo(String value) {
            addCriterion("DATA284 <=", value, "data284");
            return (Criteria) this;
        }

        public Criteria andData284Like(String value) {
            addCriterion("DATA284 like", value, "data284");
            return (Criteria) this;
        }

        public Criteria andData284NotLike(String value) {
            addCriterion("DATA284 not like", value, "data284");
            return (Criteria) this;
        }

        public Criteria andData284In(List<String> values) {
            addCriterion("DATA284 in", values, "data284");
            return (Criteria) this;
        }

        public Criteria andData284NotIn(List<String> values) {
            addCriterion("DATA284 not in", values, "data284");
            return (Criteria) this;
        }

        public Criteria andData284Between(String value1, String value2) {
            addCriterion("DATA284 between", value1, value2, "data284");
            return (Criteria) this;
        }

        public Criteria andData284NotBetween(String value1, String value2) {
            addCriterion("DATA284 not between", value1, value2, "data284");
            return (Criteria) this;
        }

        public Criteria andData285IsNull() {
            addCriterion("DATA285 is null");
            return (Criteria) this;
        }

        public Criteria andData285IsNotNull() {
            addCriterion("DATA285 is not null");
            return (Criteria) this;
        }

        public Criteria andData285EqualTo(String value) {
            addCriterion("DATA285 =", value, "data285");
            return (Criteria) this;
        }

        public Criteria andData285NotEqualTo(String value) {
            addCriterion("DATA285 <>", value, "data285");
            return (Criteria) this;
        }

        public Criteria andData285GreaterThan(String value) {
            addCriterion("DATA285 >", value, "data285");
            return (Criteria) this;
        }

        public Criteria andData285GreaterThanOrEqualTo(String value) {
            addCriterion("DATA285 >=", value, "data285");
            return (Criteria) this;
        }

        public Criteria andData285LessThan(String value) {
            addCriterion("DATA285 <", value, "data285");
            return (Criteria) this;
        }

        public Criteria andData285LessThanOrEqualTo(String value) {
            addCriterion("DATA285 <=", value, "data285");
            return (Criteria) this;
        }

        public Criteria andData285Like(String value) {
            addCriterion("DATA285 like", value, "data285");
            return (Criteria) this;
        }

        public Criteria andData285NotLike(String value) {
            addCriterion("DATA285 not like", value, "data285");
            return (Criteria) this;
        }

        public Criteria andData285In(List<String> values) {
            addCriterion("DATA285 in", values, "data285");
            return (Criteria) this;
        }

        public Criteria andData285NotIn(List<String> values) {
            addCriterion("DATA285 not in", values, "data285");
            return (Criteria) this;
        }

        public Criteria andData285Between(String value1, String value2) {
            addCriterion("DATA285 between", value1, value2, "data285");
            return (Criteria) this;
        }

        public Criteria andData285NotBetween(String value1, String value2) {
            addCriterion("DATA285 not between", value1, value2, "data285");
            return (Criteria) this;
        }

        public Criteria andData286IsNull() {
            addCriterion("DATA286 is null");
            return (Criteria) this;
        }

        public Criteria andData286IsNotNull() {
            addCriterion("DATA286 is not null");
            return (Criteria) this;
        }

        public Criteria andData286EqualTo(String value) {
            addCriterion("DATA286 =", value, "data286");
            return (Criteria) this;
        }

        public Criteria andData286NotEqualTo(String value) {
            addCriterion("DATA286 <>", value, "data286");
            return (Criteria) this;
        }

        public Criteria andData286GreaterThan(String value) {
            addCriterion("DATA286 >", value, "data286");
            return (Criteria) this;
        }

        public Criteria andData286GreaterThanOrEqualTo(String value) {
            addCriterion("DATA286 >=", value, "data286");
            return (Criteria) this;
        }

        public Criteria andData286LessThan(String value) {
            addCriterion("DATA286 <", value, "data286");
            return (Criteria) this;
        }

        public Criteria andData286LessThanOrEqualTo(String value) {
            addCriterion("DATA286 <=", value, "data286");
            return (Criteria) this;
        }

        public Criteria andData286Like(String value) {
            addCriterion("DATA286 like", value, "data286");
            return (Criteria) this;
        }

        public Criteria andData286NotLike(String value) {
            addCriterion("DATA286 not like", value, "data286");
            return (Criteria) this;
        }

        public Criteria andData286In(List<String> values) {
            addCriterion("DATA286 in", values, "data286");
            return (Criteria) this;
        }

        public Criteria andData286NotIn(List<String> values) {
            addCriterion("DATA286 not in", values, "data286");
            return (Criteria) this;
        }

        public Criteria andData286Between(String value1, String value2) {
            addCriterion("DATA286 between", value1, value2, "data286");
            return (Criteria) this;
        }

        public Criteria andData286NotBetween(String value1, String value2) {
            addCriterion("DATA286 not between", value1, value2, "data286");
            return (Criteria) this;
        }

        public Criteria andData287IsNull() {
            addCriterion("DATA287 is null");
            return (Criteria) this;
        }

        public Criteria andData287IsNotNull() {
            addCriterion("DATA287 is not null");
            return (Criteria) this;
        }

        public Criteria andData287EqualTo(String value) {
            addCriterion("DATA287 =", value, "data287");
            return (Criteria) this;
        }

        public Criteria andData287NotEqualTo(String value) {
            addCriterion("DATA287 <>", value, "data287");
            return (Criteria) this;
        }

        public Criteria andData287GreaterThan(String value) {
            addCriterion("DATA287 >", value, "data287");
            return (Criteria) this;
        }

        public Criteria andData287GreaterThanOrEqualTo(String value) {
            addCriterion("DATA287 >=", value, "data287");
            return (Criteria) this;
        }

        public Criteria andData287LessThan(String value) {
            addCriterion("DATA287 <", value, "data287");
            return (Criteria) this;
        }

        public Criteria andData287LessThanOrEqualTo(String value) {
            addCriterion("DATA287 <=", value, "data287");
            return (Criteria) this;
        }

        public Criteria andData287Like(String value) {
            addCriterion("DATA287 like", value, "data287");
            return (Criteria) this;
        }

        public Criteria andData287NotLike(String value) {
            addCriterion("DATA287 not like", value, "data287");
            return (Criteria) this;
        }

        public Criteria andData287In(List<String> values) {
            addCriterion("DATA287 in", values, "data287");
            return (Criteria) this;
        }

        public Criteria andData287NotIn(List<String> values) {
            addCriterion("DATA287 not in", values, "data287");
            return (Criteria) this;
        }

        public Criteria andData287Between(String value1, String value2) {
            addCriterion("DATA287 between", value1, value2, "data287");
            return (Criteria) this;
        }

        public Criteria andData287NotBetween(String value1, String value2) {
            addCriterion("DATA287 not between", value1, value2, "data287");
            return (Criteria) this;
        }

        public Criteria andData288IsNull() {
            addCriterion("DATA288 is null");
            return (Criteria) this;
        }

        public Criteria andData288IsNotNull() {
            addCriterion("DATA288 is not null");
            return (Criteria) this;
        }

        public Criteria andData288EqualTo(String value) {
            addCriterion("DATA288 =", value, "data288");
            return (Criteria) this;
        }

        public Criteria andData288NotEqualTo(String value) {
            addCriterion("DATA288 <>", value, "data288");
            return (Criteria) this;
        }

        public Criteria andData288GreaterThan(String value) {
            addCriterion("DATA288 >", value, "data288");
            return (Criteria) this;
        }

        public Criteria andData288GreaterThanOrEqualTo(String value) {
            addCriterion("DATA288 >=", value, "data288");
            return (Criteria) this;
        }

        public Criteria andData288LessThan(String value) {
            addCriterion("DATA288 <", value, "data288");
            return (Criteria) this;
        }

        public Criteria andData288LessThanOrEqualTo(String value) {
            addCriterion("DATA288 <=", value, "data288");
            return (Criteria) this;
        }

        public Criteria andData288Like(String value) {
            addCriterion("DATA288 like", value, "data288");
            return (Criteria) this;
        }

        public Criteria andData288NotLike(String value) {
            addCriterion("DATA288 not like", value, "data288");
            return (Criteria) this;
        }

        public Criteria andData288In(List<String> values) {
            addCriterion("DATA288 in", values, "data288");
            return (Criteria) this;
        }

        public Criteria andData288NotIn(List<String> values) {
            addCriterion("DATA288 not in", values, "data288");
            return (Criteria) this;
        }

        public Criteria andData288Between(String value1, String value2) {
            addCriterion("DATA288 between", value1, value2, "data288");
            return (Criteria) this;
        }

        public Criteria andData288NotBetween(String value1, String value2) {
            addCriterion("DATA288 not between", value1, value2, "data288");
            return (Criteria) this;
        }

        public Criteria andData289IsNull() {
            addCriterion("DATA289 is null");
            return (Criteria) this;
        }

        public Criteria andData289IsNotNull() {
            addCriterion("DATA289 is not null");
            return (Criteria) this;
        }

        public Criteria andData289EqualTo(String value) {
            addCriterion("DATA289 =", value, "data289");
            return (Criteria) this;
        }

        public Criteria andData289NotEqualTo(String value) {
            addCriterion("DATA289 <>", value, "data289");
            return (Criteria) this;
        }

        public Criteria andData289GreaterThan(String value) {
            addCriterion("DATA289 >", value, "data289");
            return (Criteria) this;
        }

        public Criteria andData289GreaterThanOrEqualTo(String value) {
            addCriterion("DATA289 >=", value, "data289");
            return (Criteria) this;
        }

        public Criteria andData289LessThan(String value) {
            addCriterion("DATA289 <", value, "data289");
            return (Criteria) this;
        }

        public Criteria andData289LessThanOrEqualTo(String value) {
            addCriterion("DATA289 <=", value, "data289");
            return (Criteria) this;
        }

        public Criteria andData289Like(String value) {
            addCriterion("DATA289 like", value, "data289");
            return (Criteria) this;
        }

        public Criteria andData289NotLike(String value) {
            addCriterion("DATA289 not like", value, "data289");
            return (Criteria) this;
        }

        public Criteria andData289In(List<String> values) {
            addCriterion("DATA289 in", values, "data289");
            return (Criteria) this;
        }

        public Criteria andData289NotIn(List<String> values) {
            addCriterion("DATA289 not in", values, "data289");
            return (Criteria) this;
        }

        public Criteria andData289Between(String value1, String value2) {
            addCriterion("DATA289 between", value1, value2, "data289");
            return (Criteria) this;
        }

        public Criteria andData289NotBetween(String value1, String value2) {
            addCriterion("DATA289 not between", value1, value2, "data289");
            return (Criteria) this;
        }

        public Criteria andData290IsNull() {
            addCriterion("DATA290 is null");
            return (Criteria) this;
        }

        public Criteria andData290IsNotNull() {
            addCriterion("DATA290 is not null");
            return (Criteria) this;
        }

        public Criteria andData290EqualTo(String value) {
            addCriterion("DATA290 =", value, "data290");
            return (Criteria) this;
        }

        public Criteria andData290NotEqualTo(String value) {
            addCriterion("DATA290 <>", value, "data290");
            return (Criteria) this;
        }

        public Criteria andData290GreaterThan(String value) {
            addCriterion("DATA290 >", value, "data290");
            return (Criteria) this;
        }

        public Criteria andData290GreaterThanOrEqualTo(String value) {
            addCriterion("DATA290 >=", value, "data290");
            return (Criteria) this;
        }

        public Criteria andData290LessThan(String value) {
            addCriterion("DATA290 <", value, "data290");
            return (Criteria) this;
        }

        public Criteria andData290LessThanOrEqualTo(String value) {
            addCriterion("DATA290 <=", value, "data290");
            return (Criteria) this;
        }

        public Criteria andData290Like(String value) {
            addCriterion("DATA290 like", value, "data290");
            return (Criteria) this;
        }

        public Criteria andData290NotLike(String value) {
            addCriterion("DATA290 not like", value, "data290");
            return (Criteria) this;
        }

        public Criteria andData290In(List<String> values) {
            addCriterion("DATA290 in", values, "data290");
            return (Criteria) this;
        }

        public Criteria andData290NotIn(List<String> values) {
            addCriterion("DATA290 not in", values, "data290");
            return (Criteria) this;
        }

        public Criteria andData290Between(String value1, String value2) {
            addCriterion("DATA290 between", value1, value2, "data290");
            return (Criteria) this;
        }

        public Criteria andData290NotBetween(String value1, String value2) {
            addCriterion("DATA290 not between", value1, value2, "data290");
            return (Criteria) this;
        }

        public Criteria andData291IsNull() {
            addCriterion("DATA291 is null");
            return (Criteria) this;
        }

        public Criteria andData291IsNotNull() {
            addCriterion("DATA291 is not null");
            return (Criteria) this;
        }

        public Criteria andData291EqualTo(String value) {
            addCriterion("DATA291 =", value, "data291");
            return (Criteria) this;
        }

        public Criteria andData291NotEqualTo(String value) {
            addCriterion("DATA291 <>", value, "data291");
            return (Criteria) this;
        }

        public Criteria andData291GreaterThan(String value) {
            addCriterion("DATA291 >", value, "data291");
            return (Criteria) this;
        }

        public Criteria andData291GreaterThanOrEqualTo(String value) {
            addCriterion("DATA291 >=", value, "data291");
            return (Criteria) this;
        }

        public Criteria andData291LessThan(String value) {
            addCriterion("DATA291 <", value, "data291");
            return (Criteria) this;
        }

        public Criteria andData291LessThanOrEqualTo(String value) {
            addCriterion("DATA291 <=", value, "data291");
            return (Criteria) this;
        }

        public Criteria andData291Like(String value) {
            addCriterion("DATA291 like", value, "data291");
            return (Criteria) this;
        }

        public Criteria andData291NotLike(String value) {
            addCriterion("DATA291 not like", value, "data291");
            return (Criteria) this;
        }

        public Criteria andData291In(List<String> values) {
            addCriterion("DATA291 in", values, "data291");
            return (Criteria) this;
        }

        public Criteria andData291NotIn(List<String> values) {
            addCriterion("DATA291 not in", values, "data291");
            return (Criteria) this;
        }

        public Criteria andData291Between(String value1, String value2) {
            addCriterion("DATA291 between", value1, value2, "data291");
            return (Criteria) this;
        }

        public Criteria andData291NotBetween(String value1, String value2) {
            addCriterion("DATA291 not between", value1, value2, "data291");
            return (Criteria) this;
        }

        public Criteria andData292IsNull() {
            addCriterion("DATA292 is null");
            return (Criteria) this;
        }

        public Criteria andData292IsNotNull() {
            addCriterion("DATA292 is not null");
            return (Criteria) this;
        }

        public Criteria andData292EqualTo(String value) {
            addCriterion("DATA292 =", value, "data292");
            return (Criteria) this;
        }

        public Criteria andData292NotEqualTo(String value) {
            addCriterion("DATA292 <>", value, "data292");
            return (Criteria) this;
        }

        public Criteria andData292GreaterThan(String value) {
            addCriterion("DATA292 >", value, "data292");
            return (Criteria) this;
        }

        public Criteria andData292GreaterThanOrEqualTo(String value) {
            addCriterion("DATA292 >=", value, "data292");
            return (Criteria) this;
        }

        public Criteria andData292LessThan(String value) {
            addCriterion("DATA292 <", value, "data292");
            return (Criteria) this;
        }

        public Criteria andData292LessThanOrEqualTo(String value) {
            addCriterion("DATA292 <=", value, "data292");
            return (Criteria) this;
        }

        public Criteria andData292Like(String value) {
            addCriterion("DATA292 like", value, "data292");
            return (Criteria) this;
        }

        public Criteria andData292NotLike(String value) {
            addCriterion("DATA292 not like", value, "data292");
            return (Criteria) this;
        }

        public Criteria andData292In(List<String> values) {
            addCriterion("DATA292 in", values, "data292");
            return (Criteria) this;
        }

        public Criteria andData292NotIn(List<String> values) {
            addCriterion("DATA292 not in", values, "data292");
            return (Criteria) this;
        }

        public Criteria andData292Between(String value1, String value2) {
            addCriterion("DATA292 between", value1, value2, "data292");
            return (Criteria) this;
        }

        public Criteria andData292NotBetween(String value1, String value2) {
            addCriterion("DATA292 not between", value1, value2, "data292");
            return (Criteria) this;
        }

        public Criteria andData293IsNull() {
            addCriterion("DATA293 is null");
            return (Criteria) this;
        }

        public Criteria andData293IsNotNull() {
            addCriterion("DATA293 is not null");
            return (Criteria) this;
        }

        public Criteria andData293EqualTo(String value) {
            addCriterion("DATA293 =", value, "data293");
            return (Criteria) this;
        }

        public Criteria andData293NotEqualTo(String value) {
            addCriterion("DATA293 <>", value, "data293");
            return (Criteria) this;
        }

        public Criteria andData293GreaterThan(String value) {
            addCriterion("DATA293 >", value, "data293");
            return (Criteria) this;
        }

        public Criteria andData293GreaterThanOrEqualTo(String value) {
            addCriterion("DATA293 >=", value, "data293");
            return (Criteria) this;
        }

        public Criteria andData293LessThan(String value) {
            addCriterion("DATA293 <", value, "data293");
            return (Criteria) this;
        }

        public Criteria andData293LessThanOrEqualTo(String value) {
            addCriterion("DATA293 <=", value, "data293");
            return (Criteria) this;
        }

        public Criteria andData293Like(String value) {
            addCriterion("DATA293 like", value, "data293");
            return (Criteria) this;
        }

        public Criteria andData293NotLike(String value) {
            addCriterion("DATA293 not like", value, "data293");
            return (Criteria) this;
        }

        public Criteria andData293In(List<String> values) {
            addCriterion("DATA293 in", values, "data293");
            return (Criteria) this;
        }

        public Criteria andData293NotIn(List<String> values) {
            addCriterion("DATA293 not in", values, "data293");
            return (Criteria) this;
        }

        public Criteria andData293Between(String value1, String value2) {
            addCriterion("DATA293 between", value1, value2, "data293");
            return (Criteria) this;
        }

        public Criteria andData293NotBetween(String value1, String value2) {
            addCriterion("DATA293 not between", value1, value2, "data293");
            return (Criteria) this;
        }

        public Criteria andData294IsNull() {
            addCriterion("DATA294 is null");
            return (Criteria) this;
        }

        public Criteria andData294IsNotNull() {
            addCriterion("DATA294 is not null");
            return (Criteria) this;
        }

        public Criteria andData294EqualTo(String value) {
            addCriterion("DATA294 =", value, "data294");
            return (Criteria) this;
        }

        public Criteria andData294NotEqualTo(String value) {
            addCriterion("DATA294 <>", value, "data294");
            return (Criteria) this;
        }

        public Criteria andData294GreaterThan(String value) {
            addCriterion("DATA294 >", value, "data294");
            return (Criteria) this;
        }

        public Criteria andData294GreaterThanOrEqualTo(String value) {
            addCriterion("DATA294 >=", value, "data294");
            return (Criteria) this;
        }

        public Criteria andData294LessThan(String value) {
            addCriterion("DATA294 <", value, "data294");
            return (Criteria) this;
        }

        public Criteria andData294LessThanOrEqualTo(String value) {
            addCriterion("DATA294 <=", value, "data294");
            return (Criteria) this;
        }

        public Criteria andData294Like(String value) {
            addCriterion("DATA294 like", value, "data294");
            return (Criteria) this;
        }

        public Criteria andData294NotLike(String value) {
            addCriterion("DATA294 not like", value, "data294");
            return (Criteria) this;
        }

        public Criteria andData294In(List<String> values) {
            addCriterion("DATA294 in", values, "data294");
            return (Criteria) this;
        }

        public Criteria andData294NotIn(List<String> values) {
            addCriterion("DATA294 not in", values, "data294");
            return (Criteria) this;
        }

        public Criteria andData294Between(String value1, String value2) {
            addCriterion("DATA294 between", value1, value2, "data294");
            return (Criteria) this;
        }

        public Criteria andData294NotBetween(String value1, String value2) {
            addCriterion("DATA294 not between", value1, value2, "data294");
            return (Criteria) this;
        }

        public Criteria andData295IsNull() {
            addCriterion("DATA295 is null");
            return (Criteria) this;
        }

        public Criteria andData295IsNotNull() {
            addCriterion("DATA295 is not null");
            return (Criteria) this;
        }

        public Criteria andData295EqualTo(String value) {
            addCriterion("DATA295 =", value, "data295");
            return (Criteria) this;
        }

        public Criteria andData295NotEqualTo(String value) {
            addCriterion("DATA295 <>", value, "data295");
            return (Criteria) this;
        }

        public Criteria andData295GreaterThan(String value) {
            addCriterion("DATA295 >", value, "data295");
            return (Criteria) this;
        }

        public Criteria andData295GreaterThanOrEqualTo(String value) {
            addCriterion("DATA295 >=", value, "data295");
            return (Criteria) this;
        }

        public Criteria andData295LessThan(String value) {
            addCriterion("DATA295 <", value, "data295");
            return (Criteria) this;
        }

        public Criteria andData295LessThanOrEqualTo(String value) {
            addCriterion("DATA295 <=", value, "data295");
            return (Criteria) this;
        }

        public Criteria andData295Like(String value) {
            addCriterion("DATA295 like", value, "data295");
            return (Criteria) this;
        }

        public Criteria andData295NotLike(String value) {
            addCriterion("DATA295 not like", value, "data295");
            return (Criteria) this;
        }

        public Criteria andData295In(List<String> values) {
            addCriterion("DATA295 in", values, "data295");
            return (Criteria) this;
        }

        public Criteria andData295NotIn(List<String> values) {
            addCriterion("DATA295 not in", values, "data295");
            return (Criteria) this;
        }

        public Criteria andData295Between(String value1, String value2) {
            addCriterion("DATA295 between", value1, value2, "data295");
            return (Criteria) this;
        }

        public Criteria andData295NotBetween(String value1, String value2) {
            addCriterion("DATA295 not between", value1, value2, "data295");
            return (Criteria) this;
        }

        public Criteria andData296IsNull() {
            addCriterion("DATA296 is null");
            return (Criteria) this;
        }

        public Criteria andData296IsNotNull() {
            addCriterion("DATA296 is not null");
            return (Criteria) this;
        }

        public Criteria andData296EqualTo(String value) {
            addCriterion("DATA296 =", value, "data296");
            return (Criteria) this;
        }

        public Criteria andData296NotEqualTo(String value) {
            addCriterion("DATA296 <>", value, "data296");
            return (Criteria) this;
        }

        public Criteria andData296GreaterThan(String value) {
            addCriterion("DATA296 >", value, "data296");
            return (Criteria) this;
        }

        public Criteria andData296GreaterThanOrEqualTo(String value) {
            addCriterion("DATA296 >=", value, "data296");
            return (Criteria) this;
        }

        public Criteria andData296LessThan(String value) {
            addCriterion("DATA296 <", value, "data296");
            return (Criteria) this;
        }

        public Criteria andData296LessThanOrEqualTo(String value) {
            addCriterion("DATA296 <=", value, "data296");
            return (Criteria) this;
        }

        public Criteria andData296Like(String value) {
            addCriterion("DATA296 like", value, "data296");
            return (Criteria) this;
        }

        public Criteria andData296NotLike(String value) {
            addCriterion("DATA296 not like", value, "data296");
            return (Criteria) this;
        }

        public Criteria andData296In(List<String> values) {
            addCriterion("DATA296 in", values, "data296");
            return (Criteria) this;
        }

        public Criteria andData296NotIn(List<String> values) {
            addCriterion("DATA296 not in", values, "data296");
            return (Criteria) this;
        }

        public Criteria andData296Between(String value1, String value2) {
            addCriterion("DATA296 between", value1, value2, "data296");
            return (Criteria) this;
        }

        public Criteria andData296NotBetween(String value1, String value2) {
            addCriterion("DATA296 not between", value1, value2, "data296");
            return (Criteria) this;
        }

        public Criteria andData297IsNull() {
            addCriterion("DATA297 is null");
            return (Criteria) this;
        }

        public Criteria andData297IsNotNull() {
            addCriterion("DATA297 is not null");
            return (Criteria) this;
        }

        public Criteria andData297EqualTo(String value) {
            addCriterion("DATA297 =", value, "data297");
            return (Criteria) this;
        }

        public Criteria andData297NotEqualTo(String value) {
            addCriterion("DATA297 <>", value, "data297");
            return (Criteria) this;
        }

        public Criteria andData297GreaterThan(String value) {
            addCriterion("DATA297 >", value, "data297");
            return (Criteria) this;
        }

        public Criteria andData297GreaterThanOrEqualTo(String value) {
            addCriterion("DATA297 >=", value, "data297");
            return (Criteria) this;
        }

        public Criteria andData297LessThan(String value) {
            addCriterion("DATA297 <", value, "data297");
            return (Criteria) this;
        }

        public Criteria andData297LessThanOrEqualTo(String value) {
            addCriterion("DATA297 <=", value, "data297");
            return (Criteria) this;
        }

        public Criteria andData297Like(String value) {
            addCriterion("DATA297 like", value, "data297");
            return (Criteria) this;
        }

        public Criteria andData297NotLike(String value) {
            addCriterion("DATA297 not like", value, "data297");
            return (Criteria) this;
        }

        public Criteria andData297In(List<String> values) {
            addCriterion("DATA297 in", values, "data297");
            return (Criteria) this;
        }

        public Criteria andData297NotIn(List<String> values) {
            addCriterion("DATA297 not in", values, "data297");
            return (Criteria) this;
        }

        public Criteria andData297Between(String value1, String value2) {
            addCriterion("DATA297 between", value1, value2, "data297");
            return (Criteria) this;
        }

        public Criteria andData297NotBetween(String value1, String value2) {
            addCriterion("DATA297 not between", value1, value2, "data297");
            return (Criteria) this;
        }

        public Criteria andData298IsNull() {
            addCriterion("DATA298 is null");
            return (Criteria) this;
        }

        public Criteria andData298IsNotNull() {
            addCriterion("DATA298 is not null");
            return (Criteria) this;
        }

        public Criteria andData298EqualTo(String value) {
            addCriterion("DATA298 =", value, "data298");
            return (Criteria) this;
        }

        public Criteria andData298NotEqualTo(String value) {
            addCriterion("DATA298 <>", value, "data298");
            return (Criteria) this;
        }

        public Criteria andData298GreaterThan(String value) {
            addCriterion("DATA298 >", value, "data298");
            return (Criteria) this;
        }

        public Criteria andData298GreaterThanOrEqualTo(String value) {
            addCriterion("DATA298 >=", value, "data298");
            return (Criteria) this;
        }

        public Criteria andData298LessThan(String value) {
            addCriterion("DATA298 <", value, "data298");
            return (Criteria) this;
        }

        public Criteria andData298LessThanOrEqualTo(String value) {
            addCriterion("DATA298 <=", value, "data298");
            return (Criteria) this;
        }

        public Criteria andData298Like(String value) {
            addCriterion("DATA298 like", value, "data298");
            return (Criteria) this;
        }

        public Criteria andData298NotLike(String value) {
            addCriterion("DATA298 not like", value, "data298");
            return (Criteria) this;
        }

        public Criteria andData298In(List<String> values) {
            addCriterion("DATA298 in", values, "data298");
            return (Criteria) this;
        }

        public Criteria andData298NotIn(List<String> values) {
            addCriterion("DATA298 not in", values, "data298");
            return (Criteria) this;
        }

        public Criteria andData298Between(String value1, String value2) {
            addCriterion("DATA298 between", value1, value2, "data298");
            return (Criteria) this;
        }

        public Criteria andData298NotBetween(String value1, String value2) {
            addCriterion("DATA298 not between", value1, value2, "data298");
            return (Criteria) this;
        }

        public Criteria andData299IsNull() {
            addCriterion("DATA299 is null");
            return (Criteria) this;
        }

        public Criteria andData299IsNotNull() {
            addCriterion("DATA299 is not null");
            return (Criteria) this;
        }

        public Criteria andData299EqualTo(String value) {
            addCriterion("DATA299 =", value, "data299");
            return (Criteria) this;
        }

        public Criteria andData299NotEqualTo(String value) {
            addCriterion("DATA299 <>", value, "data299");
            return (Criteria) this;
        }

        public Criteria andData299GreaterThan(String value) {
            addCriterion("DATA299 >", value, "data299");
            return (Criteria) this;
        }

        public Criteria andData299GreaterThanOrEqualTo(String value) {
            addCriterion("DATA299 >=", value, "data299");
            return (Criteria) this;
        }

        public Criteria andData299LessThan(String value) {
            addCriterion("DATA299 <", value, "data299");
            return (Criteria) this;
        }

        public Criteria andData299LessThanOrEqualTo(String value) {
            addCriterion("DATA299 <=", value, "data299");
            return (Criteria) this;
        }

        public Criteria andData299Like(String value) {
            addCriterion("DATA299 like", value, "data299");
            return (Criteria) this;
        }

        public Criteria andData299NotLike(String value) {
            addCriterion("DATA299 not like", value, "data299");
            return (Criteria) this;
        }

        public Criteria andData299In(List<String> values) {
            addCriterion("DATA299 in", values, "data299");
            return (Criteria) this;
        }

        public Criteria andData299NotIn(List<String> values) {
            addCriterion("DATA299 not in", values, "data299");
            return (Criteria) this;
        }

        public Criteria andData299Between(String value1, String value2) {
            addCriterion("DATA299 between", value1, value2, "data299");
            return (Criteria) this;
        }

        public Criteria andData299NotBetween(String value1, String value2) {
            addCriterion("DATA299 not between", value1, value2, "data299");
            return (Criteria) this;
        }

        public Criteria andData300IsNull() {
            addCriterion("DATA300 is null");
            return (Criteria) this;
        }

        public Criteria andData300IsNotNull() {
            addCriterion("DATA300 is not null");
            return (Criteria) this;
        }

        public Criteria andData300EqualTo(String value) {
            addCriterion("DATA300 =", value, "data300");
            return (Criteria) this;
        }

        public Criteria andData300NotEqualTo(String value) {
            addCriterion("DATA300 <>", value, "data300");
            return (Criteria) this;
        }

        public Criteria andData300GreaterThan(String value) {
            addCriterion("DATA300 >", value, "data300");
            return (Criteria) this;
        }

        public Criteria andData300GreaterThanOrEqualTo(String value) {
            addCriterion("DATA300 >=", value, "data300");
            return (Criteria) this;
        }

        public Criteria andData300LessThan(String value) {
            addCriterion("DATA300 <", value, "data300");
            return (Criteria) this;
        }

        public Criteria andData300LessThanOrEqualTo(String value) {
            addCriterion("DATA300 <=", value, "data300");
            return (Criteria) this;
        }

        public Criteria andData300Like(String value) {
            addCriterion("DATA300 like", value, "data300");
            return (Criteria) this;
        }

        public Criteria andData300NotLike(String value) {
            addCriterion("DATA300 not like", value, "data300");
            return (Criteria) this;
        }

        public Criteria andData300In(List<String> values) {
            addCriterion("DATA300 in", values, "data300");
            return (Criteria) this;
        }

        public Criteria andData300NotIn(List<String> values) {
            addCriterion("DATA300 not in", values, "data300");
            return (Criteria) this;
        }

        public Criteria andData300Between(String value1, String value2) {
            addCriterion("DATA300 between", value1, value2, "data300");
            return (Criteria) this;
        }

        public Criteria andData300NotBetween(String value1, String value2) {
            addCriterion("DATA300 not between", value1, value2, "data300");
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