package com.insigma.business.persistent.mybatis.entity;

import java.io.Serializable;
import java.util.Date;

public class Al08 implements Serializable {
    private Long aal801;

    private Long aab101;

    private String aae101s;

    private Long aae601;

    private Date aal802;

    private String aal803;

    private String aal804;

    private String aal805;

    private String aal806;

    private String aal807;

    private String aal808;

    private static final long serialVersionUID = 1L;

    public Long getAal801() {
        return aal801;
    }

    public void setAal801(Long aal801) {
        this.aal801 = aal801;
    }

    public Long getAab101() {
        return aab101;
    }

    public void setAab101(Long aab101) {
        this.aab101 = aab101;
    }

    public String getAae101s() {
        return aae101s;
    }

    public void setAae101s(String aae101s) {
        this.aae101s = aae101s == null ? null : aae101s.trim();
    }

    public Long getAae601() {
        return aae601;
    }

    public void setAae601(Long aae601) {
        this.aae601 = aae601;
    }

    public Date getAal802() {
        return aal802;
    }

    public void setAal802(Date aal802) {
        this.aal802 = aal802;
    }

    public String getAal803() {
        return aal803;
    }

    public void setAal803(String aal803) {
        this.aal803 = aal803 == null ? null : aal803.trim();
    }

    public String getAal804() {
        return aal804;
    }

    public void setAal804(String aal804) {
        this.aal804 = aal804 == null ? null : aal804.trim();
    }

    public String getAal805() {
        return aal805;
    }

    public void setAal805(String aal805) {
        this.aal805 = aal805 == null ? null : aal805.trim();
    }

    public String getAal806() {
        return aal806;
    }

    public void setAal806(String aal806) {
        this.aal806 = aal806 == null ? null : aal806.trim();
    }

    public String getAal807() {
        return aal807;
    }

    public void setAal807(String aal807) {
        this.aal807 = aal807 == null ? null : aal807.trim();
    }

    public String getAal808() {
        return aal808;
    }

    public void setAal808(String aal808) {
        this.aal808 = aal808 == null ? null : aal808.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", aal801=").append(aal801);
        sb.append(", aab101=").append(aab101);
        sb.append(", aae101s=").append(aae101s);
        sb.append(", aae601=").append(aae601);
        sb.append(", aal802=").append(aal802);
        sb.append(", aal803=").append(aal803);
        sb.append(", aal804=").append(aal804);
        sb.append(", aal805=").append(aal805);
        sb.append(", aal806=").append(aal806);
        sb.append(", aal807=").append(aal807);
        sb.append(", aal808=").append(aal808);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}