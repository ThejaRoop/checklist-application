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
@Table(name = "checkListTable")
@EntityListeners(AuditingEntityListener.class)
public class CheckListTable {

     @Id
    private String studyNo;

    private String tmfSupport;

    private String fppDate;
    private String risDate;
    private String crisDate;
    private String fpfvDate;
    private String sivDate;
    private String lplvDate;
    private String siteCovDates;
    private String pubCsrDate;
    private String countryLplvDate;
    private Boolean  initialHqToc;
    private Boolean  pTmfSetup;
    private Boolean  cTemplateToc;
    private Boolean  createCsrTracker;
    private Boolean  hqCttTmf;
    private Boolean  createCToc;
    private Boolean  afterFppQcChecklist;
    private Boolean  initialSToc;
    private Boolean  updateCtocSiv;
    private Boolean  updateHqTocFpfv;
    private Boolean  createEtmf;
    // private Boolean  updateCtocBetween;
    private String updateCtocBetweenSiv;
    private String updateCtocBetweenLplv;
    // private Boolean  updateStocBetween;
    private String updateStocSiv;
    private String updateStocLplv;
    // private Boolean  updateHqTocBetween;
    private String updateHqTocBetweenFpfv;
    private String updateHqTocBetweenLplv;
    private Boolean  yearlyQcChecklist;
    private Boolean  updateStocCov;
    private Boolean  qcGapAnalysis;
    private Boolean  updateCtocLplv;
    private Boolean  updateHqTocLplv;
    private Boolean  beforeCsrQcChecklist;
    private Boolean  updateHqTocBeforeCsr;
    private Boolean  updateCtocBeforeCsr;
    private Boolean  updateStocBeforeCsr;
    private Boolean  finalizeHqToc;
    private Boolean  submitHqPTmf;
    private Boolean  finalizeCToc;
    private Boolean  submitPTmf;
    private Boolean  finalizeSToc;
    private Boolean  noCrediDocuments;
    private Boolean  noDoctoVTOC;
    private Boolean  uploadAoRs;
    private String beforeInitialFppComment1;
private String beforeInitialFppComment2;
private String afterInitialFppComment;
private String beforeRisComment;
private String countrySivComment;
private String fpfvComment;
private String commentBetweenSivLplv;
private String commentBetweenFpLp;
private String yearlyFromInitialComment;
private String siteCoovComment;
private String countryLplvComment;
private String lplvComment;
private String beforePubCsrComment;
private String beforeCsrComment;
private String afterPubCsrComment;
private String afterCsrComment;



    public String getStudyNo() {
        return studyNo;
    }

    public void setStudyNo(String studyNo) {
        this.studyNo = studyNo;
    }

    public String getTmfSupport() {
        return tmfSupport;
    }

    public void setTmfSupport(String tmfSupport) {
        this.tmfSupport = tmfSupport;
    }
    
    public String getAfterCsrComment() {
    return afterCsrComment;
}
public void setAfterCsrComment(String afterCsrComment) {
        this.afterCsrComment = afterCsrComment;
    }

    public String getBeforeInitialFppComment1() {
    return beforeInitialFppComment1;
}
public void setBeforeInitialFppComment1(String beforeInitialFppComment1) {
        this.beforeInitialFppComment1 = beforeInitialFppComment1;
    }

    public String getBeforeInitialFppComment2() {
    return beforeInitialFppComment2;
}
public void setBeforeInitialFppComment2(String beforeInitialFppComment2) {
        this.beforeInitialFppComment2 = beforeInitialFppComment2;
    }

    public String getAfterInitialFppComment() {
    return afterInitialFppComment;
}
public void setAfterInitialFppComment(String afterInitialFppComment) {
        this.afterInitialFppComment = afterInitialFppComment;
    }

    public String getBeforeRisComment() {
    return beforeRisComment;
}
public void setBeforeRisComment(String beforeRisComment) {
        this.beforeRisComment = beforeRisComment;
    }

    public String getCountrySivComment() {
    return countrySivComment;
}
public void setCountrySivComment(String countrySivComment) {
        this.countrySivComment = countrySivComment;
    }

    public String getFpfvComment() {
    return fpfvComment;
}
public void setFpfvComment(String fpfvComment) {
        this.fpfvComment = fpfvComment;
    }

    public String getCommentBetweenSivLplv() {
    return commentBetweenSivLplv;
}
public void setCommentBetweenSivLplv(String commentBetweenSivLplv) {
        this.commentBetweenSivLplv = commentBetweenSivLplv;
    }

    public String getCommentBetweenFpLp() {
    return commentBetweenFpLp;
}
public void setCommentBetweenFpLp(String commentBetweenFpLp) {
        this.commentBetweenFpLp = commentBetweenFpLp;
    }

    public String getYearlyFromInitialComment() {
    return yearlyFromInitialComment;
}
public void setYearlyFromInitialComment(String yearlyFromInitialComment) {
        this.yearlyFromInitialComment = yearlyFromInitialComment;
    }

    public String getSiteCoovComment() {
    return siteCoovComment;
}
public void setSiteCoovComment(String siteCoovComment) {
        this.siteCoovComment = siteCoovComment;
    }

    public String getCountryLplvComment() {
    return countryLplvComment;
}
public void setCountryLplvComment(String countryLplvComment) {
        this.countryLplvComment = countryLplvComment;
    }

    public String getLplvComment() {
    return lplvComment;
}
public void setLplvComment(String lplvComment) {
        this.lplvComment = lplvComment;
    }

    public String getBeforePubCsrComment() {
    return beforePubCsrComment;
}
public void setBeforePubCsrComment(String beforePubCsrComment) {
        this.beforePubCsrComment = beforePubCsrComment;
    }

    public String getBeforeCsrComment() {
    return beforeCsrComment;
}
public void setBeforeCsrComment(String beforeCsrComment) {
        this.beforeCsrComment = beforeCsrComment;
    }

    public String getAfterPubCsrComment() {
    return afterPubCsrComment;
}
public void setAfterPubCsrComment(String afterPubCsrComment) {
        this.afterPubCsrComment = afterPubCsrComment;
    }

    public String getFppDate() {
        return fppDate;
    }

    public void setFppDate(String fppDate) {
        this.fppDate = fppDate;
    }

    public String getRisDate() {
        return risDate;
    }

    public void setRisDate(String risDate) {
        this.risDate = risDate;
    }

    public String getCrisDate() {
        return crisDate;
    }

    public void setCrisDate(String crisDate) {
        this.crisDate = crisDate;
    }

    public String getFpfvDate() {
        return fpfvDate;
    }

    public void setFpfvDate(String fpfvDate) {
        this.fpfvDate = fpfvDate;
    }

    public String getSivDate() {
        return sivDate;
    }

    public void setSivDate(String sivDate) {
        this.sivDate = sivDate;
    }

    public String getLplvDate() {
        return lplvDate;
    }

    public void setLplvDate(String lplvDate) {
        this.lplvDate = lplvDate;
    }

    public String getSiteCovDates() {
        return siteCovDates;
    }

    public void setSiteCovDates(String siteCovDates) {
        this.siteCovDates = siteCovDates;
    }

    public String getPubCsrDate() {
        return pubCsrDate;
    }

    public void setPubCsrDate(String pubCsrDate) {
        this.pubCsrDate = pubCsrDate;
    }

    public String getCountryLplvDate() {
        return countryLplvDate;
    }

    public void setCountryLplvDate(String countryLplvDate) {
        this.countryLplvDate = countryLplvDate;
    }

    public Boolean  getInitialHqToc() {
        return initialHqToc;
    }

    public void setInitialHqToc(Boolean  initialHqToc) {
        this.initialHqToc = initialHqToc;
    }

    public Boolean  getPTmfSetup() {
        return pTmfSetup;
    }

    public void setPTmfSetup(Boolean  pTmfSetup) {
        this.pTmfSetup = pTmfSetup;
    }

    public Boolean  getCTemplateToc() {
        return cTemplateToc;
    }

    public void setCTemplateToc(Boolean  cTemplateToc) {
        this.cTemplateToc = cTemplateToc;
    }

    public Boolean  getCreateCsrTracker() {
        return createCsrTracker;
    }

    public void setCreateCsrTracker(Boolean  createCsrTracker) {
        this.createCsrTracker = createCsrTracker;
    }

    public Boolean  getHqCttTmf() {
        return hqCttTmf;
    }

    public void setHqCttTmf(Boolean  hqCttTmf) {
        this.hqCttTmf = hqCttTmf;
    }

    public Boolean  getCreateCToc() {
        return createCToc;
    }

    public void setCreateCToc(Boolean  createCToc) {
        this.createCToc = createCToc;
    }

    public Boolean  getAfterFppQcChecklist() {
        return afterFppQcChecklist;
    }

    public void setAfterFppQcChecklist(Boolean  afterFppQcChecklist) {
        this.afterFppQcChecklist = afterFppQcChecklist;
    }

    public Boolean  getInitialSToc() {
        return initialSToc;
    }

    public void setInitialSToc(Boolean  initialSToc) {
        this.initialSToc = initialSToc;
    }

    public Boolean  getUpdateCtocSiv() {
        return updateCtocSiv;
    }

    public void setUpdateCtocSiv(Boolean  updateCtocSiv) {
        this.updateCtocSiv = updateCtocSiv;
    }

    public Boolean  getUpdateHqTocFpfv() {
        return updateHqTocFpfv;
    }

    public void setUpdateHqTocFpfv(Boolean  updateHqTocFpfv) {
        this.updateHqTocFpfv = updateHqTocFpfv;
    }

    public Boolean  getCreateEtmf() {
        return createEtmf;
    }

    public void setCreateEtmf(Boolean  createEtmf) {
        this.createEtmf = createEtmf;
    }

    // public Boolean  getUpdateCtocBetween() {
    //     return updateCtocBetween;
    // }

    // public void setUpdateCtocBetween(Boolean  updateCtocBetween) {
    //     this.updateCtocBetween = updateCtocBetween;
    // }

    public String  getUpdateCtocBetweenSiv() {
        return updateCtocBetweenSiv;
    }

    public void setUpdateCtocBetweenSiv(String  updateCtocBetweenSiv) {
        this.updateCtocBetweenSiv = updateCtocBetweenSiv;
    }

    public String  getUpdateCtocBetweenLplv() {
        return updateCtocBetweenLplv;
    }

    public void setUpdateCtocBetweenLplv(String  updateCtocBetweenLplv) {
        this.updateCtocBetweenLplv = updateCtocBetweenLplv;
    }

    // public Boolean  getUpdateStocBetween() {
    //     return updateStocBetween;
    // }

    // public void setUpdateStocBetween(Boolean  updateStocBetween) {
    //     this.updateStocBetween = updateStocBetween;
    // }

    public String  getUpdateStocSiv() {
        return updateStocSiv;
    }

    public void setUpdateStocSiv(String  updateStocSiv) {
        this.updateStocSiv = updateStocSiv;
    }

    public String  getUpdateStocLplv() {
        return updateStocLplv;
    }

    public void setUpdateStocLplv(String  updateStocLplv) {
        this.updateStocLplv = updateStocLplv;
    }

    // public Boolean  getUpdateHqTocBetween() {
    //     return updateHqTocBetween;
    // }

    // public void setUpdateHqTocBetween(Boolean  updateHqTocBetween) {
    //     this.updateHqTocBetween = updateHqTocBetween;
    // }

    public String  getUpdateHqTocBetweenFpfv() {
        return updateHqTocBetweenFpfv;
    }

    public void setUpdateHqTocBetweenFpfv(String  updateHqTocBetweenFpfv) {
        this.updateHqTocBetweenFpfv = updateHqTocBetweenFpfv;
    }

    public String  getUpdateHqTocBetweenLplv() {
        return updateHqTocBetweenLplv;
    }

    public void setUpdateHqTocBetweenLplv(String  updateHqTocBetweenLplv) {
        this.updateHqTocBetweenLplv = updateHqTocBetweenLplv;
    }

    public Boolean  getYearlyQcChecklist() {
        return yearlyQcChecklist;
    }

    public void setYearlyQcChecklist(Boolean  yearlyQcChecklist) {
        this.yearlyQcChecklist = yearlyQcChecklist;
    }

    public Boolean  getUpdateStocCov() {
        return updateStocCov;
    }

    public void setUpdateStocCov(Boolean  updateStocCov) {
        this.updateStocCov = updateStocCov;
    }

    public Boolean  getQcGapAnalysis() {
        return qcGapAnalysis;
    }

    public void setQcGapAnalysis(Boolean  qcGapAnalysis) {
        this.qcGapAnalysis = qcGapAnalysis;
    }

    public Boolean  getUpdateCtocLplv() {
        return updateCtocLplv;
    }

    public void setUpdateCtocLplv(Boolean  updateCtocLplv) {
        this.updateCtocLplv = updateCtocLplv;
    }

    public Boolean  getUpdateHqTocLplv() {
        return updateHqTocLplv;
    }

    public void setUpdateHqTocLplv(Boolean  updateHqTocLplv) {
        this.updateHqTocLplv = updateHqTocLplv;
    }

    public Boolean  getBeforeCsrQcChecklist() {
        return beforeCsrQcChecklist;
    }

    public void setBeforeCsrQcChecklist(Boolean  beforeCsrQcChecklist) {
        this.beforeCsrQcChecklist = beforeCsrQcChecklist;
    }

    public Boolean  getUpdateHqTocBeforeCsr() {
        return updateHqTocBeforeCsr;
    }

    public void setUpdateHqTocBeforeCsr(Boolean  updateHqTocBeforeCsr) {
        this.updateHqTocBeforeCsr = updateHqTocBeforeCsr;
    }

    public Boolean  getUpdateCtocBeforeCsr() {
        return updateCtocBeforeCsr;
    }

    public void setUpdateCtocBeforeCsr(Boolean  updateCtocBeforeCsr) {
        this.updateCtocBeforeCsr = updateCtocBeforeCsr;
    }

    public Boolean  getUpdateStocBeforeCsr() {
        return updateStocBeforeCsr;
    }

    public void setUpdateStocBeforeCsr(Boolean  updateStocBeforeCsr) {
        this.updateStocBeforeCsr = updateStocBeforeCsr;
    }

    public Boolean  getFinalizeHqToc() {
        return finalizeHqToc;
    }

    public void setFinalizeHqToc(Boolean  finalizeHqToc) {
        this.finalizeHqToc = finalizeHqToc;
    }

    public Boolean  getSubmitHqPTmf() {
        return submitHqPTmf;
    }

    public void setSubmitHqPTmf(Boolean  submitHqPTmf) {
        this.submitHqPTmf = submitHqPTmf;
    }

    public Boolean  getFinalizeCToc() {
        return finalizeCToc;
    }

    public void setFinalizeCToc(Boolean  finalizeCToc) {
        this.finalizeCToc = finalizeCToc;
    }

    public Boolean  getSubmitPTmf() {
        return submitPTmf;
    }

    public void setSubmitPTmf(Boolean  submitPTmf) {
        this.submitPTmf = submitPTmf;
    }

    public Boolean  getFinalizeSToc() {
        return finalizeSToc;
    }

    public void setFinalizeSToc(Boolean  finalizeSToc) {
        this.finalizeSToc = finalizeSToc;
    }

    public Boolean  getNoCrediDocuments() {
        return noCrediDocuments;
    }

    public void setNoCrediDocuments(Boolean  noCrediDocuments) {
        this.noCrediDocuments = noCrediDocuments;
    }

    public Boolean  getNoDoctoVTOC() {
        return noDoctoVTOC;
    }

    public void setNoDoctoVTOC(Boolean  noDoctoVTOC) {
        this.noDoctoVTOC = noDoctoVTOC;
    }

    public Boolean  getUploadAoRs() {
        return uploadAoRs;
    }

    public void setUploadAoRs(Boolean  uploadAoRs) {
        this.uploadAoRs = uploadAoRs;
    }
		 	 						
								

   
}