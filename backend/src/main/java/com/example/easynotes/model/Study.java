package com.example.easynotes.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.util.Date;

/**
 * Created by rajeevkumarsingh on 27/06/17.
 */
@Entity
@Table(name = "studies")
@EntityListeners(AuditingEntityListener.class)
public class Study {

     @Id
    private String trialNo;

    private String protocolAmmendmentCreation;
    private String protocolAmmendmentStatus;
    private String icfCreation;
    private String icfStatus;
    private String noPhisChecklistCreation;
    private String noPhisChecklistStatus;
    private String hqTmfTocCreation;
    private String hqTmfTocStatus;
    private String cTmfTocCreation;
    private String cTmfTocStatus;
    private String sTmfTocCreation;
    private String sTmfTocStatus;
    private String studyLeadQCCheclistCreation;
    private String studyLeadQCCheclistStatus;
    private String eTMFtractingCreation;
    private String eTMFtractingStatus;
    private String eCTDtrackerCreation;
    private String eCTDtrackerStatus;
    private String tmfFinalQCCreation;
    private String tmfFinalQCStatus;

    public String getTrialNo() {
        return trialNo;
    }

    public void setTrialNo(String trialNo) {
        this.trialNo = trialNo;
    }

     public String getProtocolAmmendmentCreation() {
        return protocolAmmendmentCreation;
    }

    public void setProtocolAmmendmentCreation(String protocolAmmendmentCreation) {
        this.protocolAmmendmentCreation = protocolAmmendmentCreation;
    }
     public String getProtocolAmmendmentStatus() {
        return protocolAmmendmentStatus;
    }

    public void setProtocolAmmendmentStatus(String protocolAmmendmentStatus) {
        this.protocolAmmendmentStatus = protocolAmmendmentStatus;
    }
     public String getIcfCreation() {
        return icfCreation;
    }

    public void setIcfCreation(String icfCreation) {
        this.icfCreation = icfCreation;
    }
     public String getIcfStatus() {
        return icfStatus;
    }

    public void setIcfStatus(String icfStatus) {
        this.icfStatus = icfStatus;
    }
     public String getNoPhisChecklistCreation() {
        return noPhisChecklistCreation;
    }

    public void setNoPhisChecklistCreation(String noPhisChecklistCreation) {
        this.noPhisChecklistCreation = noPhisChecklistCreation;
    }
     public String getNoPhisChecklistStatus() {
        return noPhisChecklistStatus;
    }

    public void setNoPhisChecklistStatus(String noPhisChecklistStatus) {
        this.noPhisChecklistStatus = noPhisChecklistStatus;
    }
     public String getHqTmfTocCreation() {
        return hqTmfTocCreation;
    }

    public void setHqTmfTocCreation(String hqTmfTocCreation) {
        this.hqTmfTocCreation = hqTmfTocCreation;
    }
     public String getHqTmfTocStatus() {
        return hqTmfTocStatus;
    }

    public void setHqTmfTocStatus(String hqTmfTocStatus) {
        this.hqTmfTocStatus = hqTmfTocStatus;
    }
     public String getCTmfTocCreation() {
        return cTmfTocCreation;
    }

    public void setCTmfTocCreation(String cTmfTocCreation) {
        this.cTmfTocCreation = cTmfTocCreation;
    }
     public String getCTmfTocStatus() {
        return cTmfTocStatus;
    }

    public void setCTmfTocStatus(String cTmfTocStatus) {
        this.cTmfTocStatus = cTmfTocStatus;
    }
     public String getSTmfTocCreation() {
        return sTmfTocCreation;
    }

    public void setSTmfTocCreation(String sTmfTocCreation) {
        this.sTmfTocCreation = sTmfTocCreation;
    }
     public String getSTmfTocStatus() {
        return sTmfTocStatus;
    }

    public void setSTmfTocStatus(String sTmfTocStatus) {
        this.sTmfTocStatus = sTmfTocStatus;
    }
     public String getStudyLeadQCCheclistCreation() {
        return studyLeadQCCheclistCreation;
    }

    public void setStudyLeadQCCheclistCreation(String studyLeadQCCheclistCreation) {
        this.studyLeadQCCheclistCreation = studyLeadQCCheclistCreation;
    }
     public String getStudyLeadQCCheclistStatus() {
        return studyLeadQCCheclistStatus;
    }

    public void setStudyLeadQCCheclistStatus(String studyLeadQCCheclistStatus) {
        this.studyLeadQCCheclistStatus = studyLeadQCCheclistStatus;
    }
     public String getETMFtractingCreation() {
        return eTMFtractingCreation;
    }

    public void setETMFtractingCreation(String eTMFtractingCreation) {
        this.eTMFtractingCreation = eTMFtractingCreation;
    }
     public String getETMFtractingStatus() {
        return eTMFtractingStatus;
    }

    public void setETMFtractingStatus(String eTMFtractingStatus) {
        this.eTMFtractingStatus = eTMFtractingStatus;
    }
     public String getECTDtrackerCreation() {
        return eCTDtrackerCreation;
    }

    public void setECTDtrackerCreation(String eCTDtrackerCreation) {
        this.eCTDtrackerCreation = eCTDtrackerCreation;
    }
     public String getECTDtrackerStatus() {
        return eCTDtrackerStatus;
    }

    public void setECTDtrackerStatus(String eCTDtrackerStatus) {
        this.eCTDtrackerStatus = eCTDtrackerStatus;
    }
     public String getTmfFinalQCCreation() {
        return tmfFinalQCCreation;
    }

    public void setTmfFinalQCCreation(String tmfFinalQCCreation) {
        this.tmfFinalQCCreation = tmfFinalQCCreation;
    }
     public String getTmfFinalQCStatus() {
        return tmfFinalQCStatus;
    }

    public void setTmfFinalQCStatus(String tmfFinalQCStatus) {
        this.tmfFinalQCStatus = tmfFinalQCStatus;
    }


    

}
