package com.insigma.business.persistent.mybatis.entity;

import java.io.Serializable;
import java.util.Date;

public class CjrrzData implements Serializable {
    private Long stId;

    private Date stDate;

    private String stLevyYear;

    private String stIdNumber;

    private String stUserName;

    private String stCreditCode;

    private String stCreditName;

    private String nmIsDisabilityStudent;

    private String stEducationLevel;

    private String stGraduationDate;

    private String nmIsLocalCensus;

    private String stDisabilityIdType;

    private String stDisabilityIdNumber;

    private String stDisabilityType;

    private String stDisabilityLevel;

    private String stOpeningDate;

    private Integer nmPayMonths;

    private Integer nmCheckNumber;

    private static final long serialVersionUID = 1L;

    public Long getStId() {
        return stId;
    }

    public void setStId(Long stId) {
        this.stId = stId;
    }

    public Date getStDate() {
        return stDate;
    }

    public void setStDate(Date stDate) {
        this.stDate = stDate;
    }

    public String getStLevyYear() {
        return stLevyYear;
    }

    public void setStLevyYear(String stLevyYear) {
        this.stLevyYear = stLevyYear == null ? null : stLevyYear.trim();
    }

    public String getStIdNumber() {
        return stIdNumber;
    }

    public void setStIdNumber(String stIdNumber) {
        this.stIdNumber = stIdNumber == null ? null : stIdNumber.trim();
    }

    public String getStUserName() {
        return stUserName;
    }

    public void setStUserName(String stUserName) {
        this.stUserName = stUserName == null ? null : stUserName.trim();
    }

    public String getStCreditCode() {
        return stCreditCode;
    }

    public void setStCreditCode(String stCreditCode) {
        this.stCreditCode = stCreditCode == null ? null : stCreditCode.trim();
    }

    public String getStCreditName() {
        return stCreditName;
    }

    public void setStCreditName(String stCreditName) {
        this.stCreditName = stCreditName == null ? null : stCreditName.trim();
    }

    public String getNmIsDisabilityStudent() {
        return nmIsDisabilityStudent;
    }

    public void setNmIsDisabilityStudent(String nmIsDisabilityStudent) {
        this.nmIsDisabilityStudent = nmIsDisabilityStudent == null ? null : nmIsDisabilityStudent.trim();
    }

    public String getStEducationLevel() {
        return stEducationLevel;
    }

    public void setStEducationLevel(String stEducationLevel) {
        this.stEducationLevel = stEducationLevel == null ? null : stEducationLevel.trim();
    }

    public String getStGraduationDate() {
        return stGraduationDate;
    }

    public void setStGraduationDate(String stGraduationDate) {
        this.stGraduationDate = stGraduationDate == null ? null : stGraduationDate.trim();
    }

    public String getNmIsLocalCensus() {
        return nmIsLocalCensus;
    }

    public void setNmIsLocalCensus(String nmIsLocalCensus) {
        this.nmIsLocalCensus = nmIsLocalCensus == null ? null : nmIsLocalCensus.trim();
    }

    public String getStDisabilityIdType() {
        return stDisabilityIdType;
    }

    public void setStDisabilityIdType(String stDisabilityIdType) {
        this.stDisabilityIdType = stDisabilityIdType == null ? null : stDisabilityIdType.trim();
    }

    public String getStDisabilityIdNumber() {
        return stDisabilityIdNumber;
    }

    public void setStDisabilityIdNumber(String stDisabilityIdNumber) {
        this.stDisabilityIdNumber = stDisabilityIdNumber == null ? null : stDisabilityIdNumber.trim();
    }

    public String getStDisabilityType() {
        return stDisabilityType;
    }

    public void setStDisabilityType(String stDisabilityType) {
        this.stDisabilityType = stDisabilityType == null ? null : stDisabilityType.trim();
    }

    public String getStDisabilityLevel() {
        return stDisabilityLevel;
    }

    public void setStDisabilityLevel(String stDisabilityLevel) {
        this.stDisabilityLevel = stDisabilityLevel == null ? null : stDisabilityLevel.trim();
    }

    public String getStOpeningDate() {
        return stOpeningDate;
    }

    public void setStOpeningDate(String stOpeningDate) {
        this.stOpeningDate = stOpeningDate == null ? null : stOpeningDate.trim();
    }

    public Integer getNmPayMonths() {
        return nmPayMonths;
    }

    public void setNmPayMonths(Integer nmPayMonths) {
        this.nmPayMonths = nmPayMonths;
    }

    public Integer getNmCheckNumber() {
        return nmCheckNumber;
    }

    public void setNmCheckNumber(Integer nmCheckNumber) {
        this.nmCheckNumber = nmCheckNumber;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", stId=").append(stId);
        sb.append(", stDate=").append(stDate);
        sb.append(", stLevyYear=").append(stLevyYear);
        sb.append(", stIdNumber=").append(stIdNumber);
        sb.append(", stUserName=").append(stUserName);
        sb.append(", stCreditCode=").append(stCreditCode);
        sb.append(", stCreditName=").append(stCreditName);
        sb.append(", nmIsDisabilityStudent=").append(nmIsDisabilityStudent);
        sb.append(", stEducationLevel=").append(stEducationLevel);
        sb.append(", stGraduationDate=").append(stGraduationDate);
        sb.append(", nmIsLocalCensus=").append(nmIsLocalCensus);
        sb.append(", stDisabilityIdType=").append(stDisabilityIdType);
        sb.append(", stDisabilityIdNumber=").append(stDisabilityIdNumber);
        sb.append(", stDisabilityType=").append(stDisabilityType);
        sb.append(", stDisabilityLevel=").append(stDisabilityLevel);
        sb.append(", stOpeningDate=").append(stOpeningDate);
        sb.append(", nmPayMonths=").append(nmPayMonths);
        sb.append(", nmCheckNumber=").append(nmCheckNumber);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}