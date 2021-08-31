package com.insigma.business.persistent.mybatis.entity;

import java.io.Serializable;
import java.util.Date;

public class Ah09 implements Serializable {
    private Long aah901;

    private Long aah101;

    private String aab124;

    private String aah902;

    private String aah903;

    private Date aah904;

    private String aah905;

    private static final long serialVersionUID = 1L;

    public Long getAah901() {
        return aah901;
    }

    public void setAah901(Long aah901) {
        this.aah901 = aah901;
    }

    public Long getAah101() {
        return aah101;
    }

    public void setAah101(Long aah101) {
        this.aah101 = aah101;
    }

    public String getAab124() {
        return aab124;
    }

    public void setAab124(String aab124) {
        this.aab124 = aab124 == null ? null : aab124.trim();
    }

    public String getAah902() {
        return aah902;
    }

    public void setAah902(String aah902) {
        this.aah902 = aah902 == null ? null : aah902.trim();
    }

    public String getAah903() {
        return aah903;
    }

    public void setAah903(String aah903) {
        this.aah903 = aah903 == null ? null : aah903.trim();
    }

    public Date getAah904() {
        return aah904;
    }

    public void setAah904(Date aah904) {
        this.aah904 = aah904;
    }

    public String getAah905() {
        return aah905;
    }

    public void setAah905(String aah905) {
        this.aah905 = aah905 == null ? null : aah905.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", aah901=").append(aah901);
        sb.append(", aah101=").append(aah101);
        sb.append(", aab124=").append(aab124);
        sb.append(", aah902=").append(aah902);
        sb.append(", aah903=").append(aah903);
        sb.append(", aah904=").append(aah904);
        sb.append(", aah905=").append(aah905);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}