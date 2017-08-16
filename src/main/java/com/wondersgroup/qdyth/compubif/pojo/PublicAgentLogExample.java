package com.wondersgroup.qdyth.compubif.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class PublicAgentLogExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PublicAgentLogExample() {
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andQidIsNull() {
            addCriterion("QID is null");
            return (Criteria) this;
        }

        public Criteria andQidIsNotNull() {
            addCriterion("QID is not null");
            return (Criteria) this;
        }

        public Criteria andQidEqualTo(Long value) {
            addCriterion("QID =", value, "qid");
            return (Criteria) this;
        }

        public Criteria andQidNotEqualTo(Long value) {
            addCriterion("QID <>", value, "qid");
            return (Criteria) this;
        }

        public Criteria andQidGreaterThan(Long value) {
            addCriterion("QID >", value, "qid");
            return (Criteria) this;
        }

        public Criteria andQidGreaterThanOrEqualTo(Long value) {
            addCriterion("QID >=", value, "qid");
            return (Criteria) this;
        }

        public Criteria andQidLessThan(Long value) {
            addCriterion("QID <", value, "qid");
            return (Criteria) this;
        }

        public Criteria andQidLessThanOrEqualTo(Long value) {
            addCriterion("QID <=", value, "qid");
            return (Criteria) this;
        }

        public Criteria andQidIn(List<Long> values) {
            addCriterion("QID in", values, "qid");
            return (Criteria) this;
        }

        public Criteria andQidNotIn(List<Long> values) {
            addCriterion("QID not in", values, "qid");
            return (Criteria) this;
        }

        public Criteria andQidBetween(Long value1, Long value2) {
            addCriterion("QID between", value1, value2, "qid");
            return (Criteria) this;
        }

        public Criteria andQidNotBetween(Long value1, Long value2) {
            addCriterion("QID not between", value1, value2, "qid");
            return (Criteria) this;
        }

        public Criteria andLoginnameIsNull() {
            addCriterion("LOGINNAME is null");
            return (Criteria) this;
        }

        public Criteria andLoginnameIsNotNull() {
            addCriterion("LOGINNAME is not null");
            return (Criteria) this;
        }

        public Criteria andLoginnameEqualTo(String value) {
            addCriterion("LOGINNAME =", value, "loginname");
            return (Criteria) this;
        }

        public Criteria andLoginnameNotEqualTo(String value) {
            addCriterion("LOGINNAME <>", value, "loginname");
            return (Criteria) this;
        }

        public Criteria andLoginnameGreaterThan(String value) {
            addCriterion("LOGINNAME >", value, "loginname");
            return (Criteria) this;
        }

        public Criteria andLoginnameGreaterThanOrEqualTo(String value) {
            addCriterion("LOGINNAME >=", value, "loginname");
            return (Criteria) this;
        }

        public Criteria andLoginnameLessThan(String value) {
            addCriterion("LOGINNAME <", value, "loginname");
            return (Criteria) this;
        }

        public Criteria andLoginnameLessThanOrEqualTo(String value) {
            addCriterion("LOGINNAME <=", value, "loginname");
            return (Criteria) this;
        }

        public Criteria andLoginnameLike(String value) {
            addCriterion("LOGINNAME like", value, "loginname");
            return (Criteria) this;
        }

        public Criteria andLoginnameNotLike(String value) {
            addCriterion("LOGINNAME not like", value, "loginname");
            return (Criteria) this;
        }

        public Criteria andLoginnameIn(List<String> values) {
            addCriterion("LOGINNAME in", values, "loginname");
            return (Criteria) this;
        }

        public Criteria andLoginnameNotIn(List<String> values) {
            addCriterion("LOGINNAME not in", values, "loginname");
            return (Criteria) this;
        }

        public Criteria andLoginnameBetween(String value1, String value2) {
            addCriterion("LOGINNAME between", value1, value2, "loginname");
            return (Criteria) this;
        }

        public Criteria andLoginnameNotBetween(String value1, String value2) {
            addCriterion("LOGINNAME not between", value1, value2, "loginname");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNull() {
            addCriterion("PASSWORD is null");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNotNull() {
            addCriterion("PASSWORD is not null");
            return (Criteria) this;
        }

        public Criteria andPasswordEqualTo(String value) {
            addCriterion("PASSWORD =", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotEqualTo(String value) {
            addCriterion("PASSWORD <>", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThan(String value) {
            addCriterion("PASSWORD >", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("PASSWORD >=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThan(String value) {
            addCriterion("PASSWORD <", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThanOrEqualTo(String value) {
            addCriterion("PASSWORD <=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLike(String value) {
            addCriterion("PASSWORD like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotLike(String value) {
            addCriterion("PASSWORD not like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordIn(List<String> values) {
            addCriterion("PASSWORD in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotIn(List<String> values) {
            addCriterion("PASSWORD not in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordBetween(String value1, String value2) {
            addCriterion("PASSWORD between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotBetween(String value1, String value2) {
            addCriterion("PASSWORD not between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andIftypeIsNull() {
            addCriterion("IFTYPE is null");
            return (Criteria) this;
        }

        public Criteria andIftypeIsNotNull() {
            addCriterion("IFTYPE is not null");
            return (Criteria) this;
        }

        public Criteria andIftypeEqualTo(String value) {
            addCriterion("IFTYPE =", value, "iftype");
            return (Criteria) this;
        }

        public Criteria andIftypeNotEqualTo(String value) {
            addCriterion("IFTYPE <>", value, "iftype");
            return (Criteria) this;
        }

        public Criteria andIftypeGreaterThan(String value) {
            addCriterion("IFTYPE >", value, "iftype");
            return (Criteria) this;
        }

        public Criteria andIftypeGreaterThanOrEqualTo(String value) {
            addCriterion("IFTYPE >=", value, "iftype");
            return (Criteria) this;
        }

        public Criteria andIftypeLessThan(String value) {
            addCriterion("IFTYPE <", value, "iftype");
            return (Criteria) this;
        }

        public Criteria andIftypeLessThanOrEqualTo(String value) {
            addCriterion("IFTYPE <=", value, "iftype");
            return (Criteria) this;
        }

        public Criteria andIftypeLike(String value) {
            addCriterion("IFTYPE like", value, "iftype");
            return (Criteria) this;
        }

        public Criteria andIftypeNotLike(String value) {
            addCriterion("IFTYPE not like", value, "iftype");
            return (Criteria) this;
        }

        public Criteria andIftypeIn(List<String> values) {
            addCriterion("IFTYPE in", values, "iftype");
            return (Criteria) this;
        }

        public Criteria andIftypeNotIn(List<String> values) {
            addCriterion("IFTYPE not in", values, "iftype");
            return (Criteria) this;
        }

        public Criteria andIftypeBetween(String value1, String value2) {
            addCriterion("IFTYPE between", value1, value2, "iftype");
            return (Criteria) this;
        }

        public Criteria andIftypeNotBetween(String value1, String value2) {
            addCriterion("IFTYPE not between", value1, value2, "iftype");
            return (Criteria) this;
        }

        public Criteria andParamjsonIsNull() {
            addCriterion("PARAMJSON is null");
            return (Criteria) this;
        }

        public Criteria andParamjsonIsNotNull() {
            addCriterion("PARAMJSON is not null");
            return (Criteria) this;
        }

        public Criteria andParamjsonEqualTo(String value) {
            addCriterion("PARAMJSON =", value, "paramjson");
            return (Criteria) this;
        }

        public Criteria andParamjsonNotEqualTo(String value) {
            addCriterion("PARAMJSON <>", value, "paramjson");
            return (Criteria) this;
        }

        public Criteria andParamjsonGreaterThan(String value) {
            addCriterion("PARAMJSON >", value, "paramjson");
            return (Criteria) this;
        }

        public Criteria andParamjsonGreaterThanOrEqualTo(String value) {
            addCriterion("PARAMJSON >=", value, "paramjson");
            return (Criteria) this;
        }

        public Criteria andParamjsonLessThan(String value) {
            addCriterion("PARAMJSON <", value, "paramjson");
            return (Criteria) this;
        }

        public Criteria andParamjsonLessThanOrEqualTo(String value) {
            addCriterion("PARAMJSON <=", value, "paramjson");
            return (Criteria) this;
        }

        public Criteria andParamjsonLike(String value) {
            addCriterion("PARAMJSON like", value, "paramjson");
            return (Criteria) this;
        }

        public Criteria andParamjsonNotLike(String value) {
            addCriterion("PARAMJSON not like", value, "paramjson");
            return (Criteria) this;
        }

        public Criteria andParamjsonIn(List<String> values) {
            addCriterion("PARAMJSON in", values, "paramjson");
            return (Criteria) this;
        }

        public Criteria andParamjsonNotIn(List<String> values) {
            addCriterion("PARAMJSON not in", values, "paramjson");
            return (Criteria) this;
        }

        public Criteria andParamjsonBetween(String value1, String value2) {
            addCriterion("PARAMJSON between", value1, value2, "paramjson");
            return (Criteria) this;
        }

        public Criteria andParamjsonNotBetween(String value1, String value2) {
            addCriterion("PARAMJSON not between", value1, value2, "paramjson");
            return (Criteria) this;
        }

        public Criteria andRetcodeIsNull() {
            addCriterion("RETCODE is null");
            return (Criteria) this;
        }

        public Criteria andRetcodeIsNotNull() {
            addCriterion("RETCODE is not null");
            return (Criteria) this;
        }

        public Criteria andRetcodeEqualTo(String value) {
            addCriterion("RETCODE =", value, "retcode");
            return (Criteria) this;
        }

        public Criteria andRetcodeNotEqualTo(String value) {
            addCriterion("RETCODE <>", value, "retcode");
            return (Criteria) this;
        }

        public Criteria andRetcodeGreaterThan(String value) {
            addCriterion("RETCODE >", value, "retcode");
            return (Criteria) this;
        }

        public Criteria andRetcodeGreaterThanOrEqualTo(String value) {
            addCriterion("RETCODE >=", value, "retcode");
            return (Criteria) this;
        }

        public Criteria andRetcodeLessThan(String value) {
            addCriterion("RETCODE <", value, "retcode");
            return (Criteria) this;
        }

        public Criteria andRetcodeLessThanOrEqualTo(String value) {
            addCriterion("RETCODE <=", value, "retcode");
            return (Criteria) this;
        }

        public Criteria andRetcodeLike(String value) {
            addCriterion("RETCODE like", value, "retcode");
            return (Criteria) this;
        }

        public Criteria andRetcodeNotLike(String value) {
            addCriterion("RETCODE not like", value, "retcode");
            return (Criteria) this;
        }

        public Criteria andRetcodeIn(List<String> values) {
            addCriterion("RETCODE in", values, "retcode");
            return (Criteria) this;
        }

        public Criteria andRetcodeNotIn(List<String> values) {
            addCriterion("RETCODE not in", values, "retcode");
            return (Criteria) this;
        }

        public Criteria andRetcodeBetween(String value1, String value2) {
            addCriterion("RETCODE between", value1, value2, "retcode");
            return (Criteria) this;
        }

        public Criteria andRetcodeNotBetween(String value1, String value2) {
            addCriterion("RETCODE not between", value1, value2, "retcode");
            return (Criteria) this;
        }

        public Criteria andRetmsgIsNull() {
            addCriterion("RETMSG is null");
            return (Criteria) this;
        }

        public Criteria andRetmsgIsNotNull() {
            addCriterion("RETMSG is not null");
            return (Criteria) this;
        }

        public Criteria andRetmsgEqualTo(String value) {
            addCriterion("RETMSG =", value, "retmsg");
            return (Criteria) this;
        }

        public Criteria andRetmsgNotEqualTo(String value) {
            addCriterion("RETMSG <>", value, "retmsg");
            return (Criteria) this;
        }

        public Criteria andRetmsgGreaterThan(String value) {
            addCriterion("RETMSG >", value, "retmsg");
            return (Criteria) this;
        }

        public Criteria andRetmsgGreaterThanOrEqualTo(String value) {
            addCriterion("RETMSG >=", value, "retmsg");
            return (Criteria) this;
        }

        public Criteria andRetmsgLessThan(String value) {
            addCriterion("RETMSG <", value, "retmsg");
            return (Criteria) this;
        }

        public Criteria andRetmsgLessThanOrEqualTo(String value) {
            addCriterion("RETMSG <=", value, "retmsg");
            return (Criteria) this;
        }

        public Criteria andRetmsgLike(String value) {
            addCriterion("RETMSG like", value, "retmsg");
            return (Criteria) this;
        }

        public Criteria andRetmsgNotLike(String value) {
            addCriterion("RETMSG not like", value, "retmsg");
            return (Criteria) this;
        }

        public Criteria andRetmsgIn(List<String> values) {
            addCriterion("RETMSG in", values, "retmsg");
            return (Criteria) this;
        }

        public Criteria andRetmsgNotIn(List<String> values) {
            addCriterion("RETMSG not in", values, "retmsg");
            return (Criteria) this;
        }

        public Criteria andRetmsgBetween(String value1, String value2) {
            addCriterion("RETMSG between", value1, value2, "retmsg");
            return (Criteria) this;
        }

        public Criteria andRetmsgNotBetween(String value1, String value2) {
            addCriterion("RETMSG not between", value1, value2, "retmsg");
            return (Criteria) this;
        }

        public Criteria andRetjsonIsNull() {
            addCriterion("RETJSON is null");
            return (Criteria) this;
        }

        public Criteria andRetjsonIsNotNull() {
            addCriterion("RETJSON is not null");
            return (Criteria) this;
        }

        public Criteria andRetjsonEqualTo(String value) {
            addCriterion("RETJSON =", value, "retjson");
            return (Criteria) this;
        }

        public Criteria andRetjsonNotEqualTo(String value) {
            addCriterion("RETJSON <>", value, "retjson");
            return (Criteria) this;
        }

        public Criteria andRetjsonGreaterThan(String value) {
            addCriterion("RETJSON >", value, "retjson");
            return (Criteria) this;
        }

        public Criteria andRetjsonGreaterThanOrEqualTo(String value) {
            addCriterion("RETJSON >=", value, "retjson");
            return (Criteria) this;
        }

        public Criteria andRetjsonLessThan(String value) {
            addCriterion("RETJSON <", value, "retjson");
            return (Criteria) this;
        }

        public Criteria andRetjsonLessThanOrEqualTo(String value) {
            addCriterion("RETJSON <=", value, "retjson");
            return (Criteria) this;
        }

        public Criteria andRetjsonLike(String value) {
            addCriterion("RETJSON like", value, "retjson");
            return (Criteria) this;
        }

        public Criteria andRetjsonNotLike(String value) {
            addCriterion("RETJSON not like", value, "retjson");
            return (Criteria) this;
        }

        public Criteria andRetjsonIn(List<String> values) {
            addCriterion("RETJSON in", values, "retjson");
            return (Criteria) this;
        }

        public Criteria andRetjsonNotIn(List<String> values) {
            addCriterion("RETJSON not in", values, "retjson");
            return (Criteria) this;
        }

        public Criteria andRetjsonBetween(String value1, String value2) {
            addCriterion("RETJSON between", value1, value2, "retjson");
            return (Criteria) this;
        }

        public Criteria andRetjsonNotBetween(String value1, String value2) {
            addCriterion("RETJSON not between", value1, value2, "retjson");
            return (Criteria) this;
        }

        public Criteria andIpIsNull() {
            addCriterion("IP is null");
            return (Criteria) this;
        }

        public Criteria andIpIsNotNull() {
            addCriterion("IP is not null");
            return (Criteria) this;
        }

        public Criteria andIpEqualTo(String value) {
            addCriterion("IP =", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpNotEqualTo(String value) {
            addCriterion("IP <>", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpGreaterThan(String value) {
            addCriterion("IP >", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpGreaterThanOrEqualTo(String value) {
            addCriterion("IP >=", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpLessThan(String value) {
            addCriterion("IP <", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpLessThanOrEqualTo(String value) {
            addCriterion("IP <=", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpLike(String value) {
            addCriterion("IP like", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpNotLike(String value) {
            addCriterion("IP not like", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpIn(List<String> values) {
            addCriterion("IP in", values, "ip");
            return (Criteria) this;
        }

        public Criteria andIpNotIn(List<String> values) {
            addCriterion("IP not in", values, "ip");
            return (Criteria) this;
        }

        public Criteria andIpBetween(String value1, String value2) {
            addCriterion("IP between", value1, value2, "ip");
            return (Criteria) this;
        }

        public Criteria andIpNotBetween(String value1, String value2) {
            addCriterion("IP not between", value1, value2, "ip");
            return (Criteria) this;
        }

        public Criteria andCalltimeIsNull() {
            addCriterion("CALLTIME is null");
            return (Criteria) this;
        }

        public Criteria andCalltimeIsNotNull() {
            addCriterion("CALLTIME is not null");
            return (Criteria) this;
        }

        public Criteria andCalltimeEqualTo(Date value) {
            addCriterionForJDBCDate("CALLTIME =", value, "calltime");
            return (Criteria) this;
        }

        public Criteria andCalltimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("CALLTIME <>", value, "calltime");
            return (Criteria) this;
        }

        public Criteria andCalltimeGreaterThan(Date value) {
            addCriterionForJDBCDate("CALLTIME >", value, "calltime");
            return (Criteria) this;
        }

        public Criteria andCalltimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("CALLTIME >=", value, "calltime");
            return (Criteria) this;
        }

        public Criteria andCalltimeLessThan(Date value) {
            addCriterionForJDBCDate("CALLTIME <", value, "calltime");
            return (Criteria) this;
        }

        public Criteria andCalltimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("CALLTIME <=", value, "calltime");
            return (Criteria) this;
        }

        public Criteria andCalltimeIn(List<Date> values) {
            addCriterionForJDBCDate("CALLTIME in", values, "calltime");
            return (Criteria) this;
        }

        public Criteria andCalltimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("CALLTIME not in", values, "calltime");
            return (Criteria) this;
        }

        public Criteria andCalltimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("CALLTIME between", value1, value2, "calltime");
            return (Criteria) this;
        }

        public Criteria andCalltimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("CALLTIME not between", value1, value2, "calltime");
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