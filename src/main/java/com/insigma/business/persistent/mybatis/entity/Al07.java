package com.insigma.business.persistent.mybatis.entity;

import java.io.Serializable;
import java.util.Date;

public class Al07 implements Serializable {
    private Long aal701;

    private Long aab101;

    private String aae101;

    private String aae201s;

    private String aae301s;

    private String aae401s;

    private String aaf101s;

    private Date aal702;

    private String aal703;

    private String aal704;

    private String aal705;

    private String aal706;

    private String aal707;

    private String aal708;

    private static final long serialVersionUID = 1L;

    public Long getAal701() {
        return aal701;
    }

    public void setAal701(Long aal701) {
        this.aal701 = aal701;
    }

    public Long getAab101() {
        return aab101;
    }

    public void setAab101(Long aab101) {
        this.aab101 = aab101;
    }

    public String getAae101() {
        return aae101;
    }

    public void setAae101(String aae101) {
        this.aae101 = aae101 == null ? null : aae101.trim();
    }

    public String getAae201s() {
        return aae201s;
    }

    public void setAae201s(String aae201s) {
        this.aae201s = aae201s == null ? null : aae201s.trim();
    }

    public String getAae301s() {
        return aae301s;
    }

    public void setAae301s(String aae301s) {
        this.aae301s = aae301s == null ? null : aae301s.trim();
    }

    public String getAae401s() {
        return aae401s;
    }

    public void setAae401s(String aae401s) {
        this.aae401s = aae401s == null ? null : aae401s.trim();
    }

    public String getAaf101s() {
        return aaf101s;
    }

    public void setAaf101s(String aaf101s) {
        this.aaf101s = aaf101s == null ? null : aaf101s.trim();
    }

    public Date getAal702() {
        return aal702;
    }

    public void setAal702(Date aal702) {
        this.aal702 = aal702;
    }

    public String getAal703() {
        return aal703;
    }

    public void setAal703(String aal703) {
        this.aal703 = aal703 == null ? null : aal703.trim();
    }

    public String getAal704() {
        return aal704;
    }

    public void setAal704(String aal704) {
        this.aal704 = aal704 == null ? null : aal704.trim();
    }

    public String getAal705() {
        return aal705;
    }

    public void setAal705(String aal705) {
        this.aal705 = aal705 == null ? null : aal705.trim();
    }

    public String getAal706() {
        return aal706;
    }

    public void setAal706(String aal706) {
        this.aal706 = aal706 == null ? null : aal706.trim();
    }

    public String getAal707() {
        return aal707;
    }

    public void setAal707(String aal707) {
        this.aal707 = aal707 == null ? null : aal707.trim();
    }

    public String getAal708() {
        return aal708;
    }

    public void setAal708(String aal708) {
        this.aal708 = aal708 == null ? null : aal708.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", aal701=").append(aal701);
        sb.append(", aab101=").append(aab101);
        sb.append(", aae101=").append(aae101);
        sb.append(", aae201s=").append(aae201s);
        sb.append(", aae301s=").append(aae301s);
        sb.append(", aae401s=").append(aae401s);
        sb.append(", aaf101s=").append(aaf101s);
        sb.append(", aal702=").append(aal702);
        sb.append(", aal703=").append(aal703);
        sb.append(", aal704=").append(aal704);
        sb.append(", aal705=").append(aal705);
        sb.append(", aal706=").append(aal706);
        sb.append(", aal707=").append(aal707);
        sb.append(", aal708=").append(aal708);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}