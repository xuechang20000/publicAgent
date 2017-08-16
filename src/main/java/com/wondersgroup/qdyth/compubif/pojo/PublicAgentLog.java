package com.wondersgroup.qdyth.compubif.pojo;

import java.util.Date;

public class PublicAgentLog {
    private Long qid;

    private String loginname;

    private String password;

    private String iftype;

    private String paramjson;

    private String retcode;

    private String retmsg;

    private String retjson;

    private String ip;

    private Date calltime;

    public Long getQid() {
        return qid;
    }

    public void setQid(Long qid) {
        this.qid = qid;
    }

    public String getLoginname() {
        return loginname;
    }

    public void setLoginname(String loginname) {
        this.loginname = loginname == null ? null : loginname.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getIftype() {
        return iftype;
    }

    public void setIftype(String iftype) {
        this.iftype = iftype == null ? null : iftype.trim();
    }

    public String getParamjson() {
        return paramjson;
    }

    public void setParamjson(String paramjson) {
        this.paramjson = paramjson == null ? null : paramjson.trim();
    }

    public String getRetcode() {
        return retcode;
    }

    public void setRetcode(String retcode) {
        this.retcode = retcode == null ? null : retcode.trim();
    }

    public String getRetmsg() {
        return retmsg;
    }

    public void setRetmsg(String retmsg) {
        this.retmsg = retmsg == null ? null : retmsg.trim();
    }

    public String getRetjson() {
        return retjson;
    }

    public void setRetjson(String retjson) {
        this.retjson = retjson == null ? null : retjson.trim();
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip == null ? null : ip.trim();
    }

    public Date getCalltime() {
        return calltime;
    }

    public void setCalltime(Date calltime) {
        this.calltime = calltime;
    }
}