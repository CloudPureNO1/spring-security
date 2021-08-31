package com.insigma.business.persistent.mybatis.entity;

import java.io.Serializable;
import java.util.Date;

public class Ah02 implements Serializable {
    private Long aah201;

    private String aah202;

    private String aah203;

    private Date aah204;

    private Long aah205;

    private String aah206;

    private String aah207;

    private Integer aah102;

    private Integer aah103;

    private static final long serialVersionUID = 1L;

    public Long getAah201() {
        return aah201;
    }

    public void setAah201(Long aah201) {
        this.aah201 = aah201;
    }

    public String getAah202() {
        return aah202;
    }

    public void setAah202(String aah202) {
        this.aah202 = aah202 == null ? null : aah202.trim();
    }

    public String getAah203() {
        return aah203;
    }

    public void setAah203(String aah203) {
        this.aah203 = aah203 == null ? null : aah203.trim();
    }

    public Date getAah204() {
        return aah204;
    }

    public void setAah204(Date aah204) {
        this.aah204 = aah204;
    }

    public Long getAah205() {
        return aah205;
    }

    public void setAah205(Long aah205) {
        this.aah205 = aah205;
    }

    public String getAah206() {
        return aah206;
    }

    public void setAah206(String aah206) {
        this.aah206 = aah206 == null ? null : aah206.trim();
    }

    public String getAah207() {
        return aah207;
    }

    public void setAah207(String aah207) {
        this.aah207 = aah207 == null ? null : aah207.trim();
    }

    public Integer getAah102() {
        return aah102;
    }

    public void setAah102(Integer aah102) {
        this.aah102 = aah102;
    }

    public Integer getAah103() {
        return aah103;
    }

    public void setAah103(Integer aah103) {
        this.aah103 = aah103;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", aah201=").append(aah201);
        sb.append(", aah202=").append(aah202);
        sb.append(", aah203=").append(aah203);
        sb.append(", aah204=").append(aah204);
        sb.append(", aah205=").append(aah205);
        sb.append(", aah206=").append(aah206);
        sb.append(", aah207=").append(aah207);
        sb.append(", aah102=").append(aah102);
        sb.append(", aah103=").append(aah103);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}