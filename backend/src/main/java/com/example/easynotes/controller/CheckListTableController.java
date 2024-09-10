package com.example.easynotes.controller;

import com.example.easynotes.exception.ResourceNotFoundException;
import com.example.easynotes.model.CheckListTable;
import com.example.easynotes.repository.CheckListTableRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java. util.*;

/**
 * Created by rajeevkumarsingh on 27/06/17.
 */
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequestMapping("/api")
public class CheckListTableController {

    @Autowired
    CheckListTableRepository checkListTableRepository;

    @CrossOrigin
    @GetMapping("/checkListDetails")
    public List<CheckListTable> getAllCheckListDetails() {
        return checkListTableRepository.findAll();
    }

    @CrossOrigin
    @GetMapping("/checklist/ids")
    public String[] getChecklistIds() {
        return checkListTableRepository.getChecklistIds();
    }


    @CrossOrigin
    @PostMapping("/checkListDetails")
    public CheckListTable createCheckListDetails(@Valid @RequestBody CheckListTable checkListDetails) {
        return checkListTableRepository.save(checkListDetails);
    }
    
    @CrossOrigin
    @GetMapping("/checkListDetails/{id}")
    public CheckListTable getCheckListDetailsByStudyId(@PathVariable(value = "id") String studyId) {
        return checkListTableRepository.findById(studyId)
                .orElseThrow(() -> new ResourceNotFoundException("Study", "id", studyId));
    }

    @CrossOrigin
    @PutMapping("/checkListDetails/{id}")
    public CheckListTable updateCheckListDetailsByStudyId(@PathVariable(value = "id") String studyId,
                                           @Valid @RequestBody CheckListTable checkListRequestDetails) {

        CheckListTable checkListDetails = checkListTableRepository.findById(studyId)
                .orElseThrow(() -> new ResourceNotFoundException("Study", "id", studyId));

                checkListDetails.setTmfSupport(checkListRequestDetails.getTmfSupport());
        checkListDetails.setAfterCsrComment(checkListRequestDetails.getAfterCsrComment());
         checkListDetails.setBeforeInitialFppComment1(checkListRequestDetails.getBeforeInitialFppComment1());
          checkListDetails.setBeforeInitialFppComment2(checkListRequestDetails.getBeforeInitialFppComment2());
           checkListDetails.setAfterInitialFppComment(checkListRequestDetails.getAfterInitialFppComment());
            checkListDetails.setBeforeRisComment(checkListRequestDetails.getBeforeRisComment());
             checkListDetails.setCountrySivComment(checkListRequestDetails.getCountrySivComment());
              checkListDetails.setFpfvComment(checkListRequestDetails.getFpfvComment());
               checkListDetails.setCommentBetweenSivLplv(checkListRequestDetails.getCommentBetweenSivLplv());
                checkListDetails.setYearlyFromInitialComment(checkListRequestDetails.getYearlyFromInitialComment());
                 checkListDetails.setSiteCoovComment(checkListRequestDetails.getSiteCoovComment());
         checkListDetails.setCountryLplvComment(checkListRequestDetails.getCountryLplvComment());
         checkListDetails.setLplvComment(checkListRequestDetails.getLplvComment());
          checkListDetails.setBeforePubCsrComment(checkListRequestDetails.getBeforePubCsrComment());
           checkListDetails.setAfterPubCsrComment(checkListRequestDetails.getAfterPubCsrComment());
            checkListDetails.setCommentBetweenFpLp(checkListRequestDetails.getCommentBetweenFpLp());
             checkListDetails.setBeforeCsrComment(checkListRequestDetails.getBeforeCsrComment());
              checkListDetails.setFpfvDate(checkListRequestDetails.getFpfvDate());
               checkListDetails.setRisDate(checkListRequestDetails.getRisDate());
                checkListDetails.setFppDate(checkListRequestDetails.getFppDate());
                 checkListDetails.setCrisDate(checkListRequestDetails.getCrisDate());
         checkListDetails.setSivDate(checkListRequestDetails.getSivDate());
         checkListDetails.setLplvDate(checkListRequestDetails.getLplvDate());
          checkListDetails.setSiteCovDates(checkListRequestDetails.getSiteCovDates());
           checkListDetails.setPubCsrDate(checkListRequestDetails.getPubCsrDate());
            checkListDetails.setCountryLplvDate(checkListRequestDetails.getCountryLplvDate());
             checkListDetails.setInitialHqToc(checkListRequestDetails.getInitialHqToc());
              checkListDetails.setPTmfSetup(checkListRequestDetails.getPTmfSetup());
               checkListDetails.setCTemplateToc(checkListRequestDetails.getCTemplateToc());
                checkListDetails.setCreateCsrTracker(checkListRequestDetails.getCreateCsrTracker());
                 checkListDetails.setHqCttTmf(checkListRequestDetails.getHqCttTmf());
         checkListDetails.setCreateCToc(checkListRequestDetails.getCreateCToc());
         checkListDetails.setAfterFppQcChecklist(checkListRequestDetails.getAfterFppQcChecklist());
          checkListDetails.setInitialSToc(checkListRequestDetails.getInitialSToc());
           checkListDetails.setUpdateCtocSiv(checkListRequestDetails.getUpdateCtocSiv());
            checkListDetails.setUpdateHqTocFpfv(checkListRequestDetails.getUpdateHqTocFpfv());
             checkListDetails.setCreateEtmf(checkListRequestDetails.getCreateEtmf());
              checkListDetails.setUpdateCtocBetweenSiv(checkListRequestDetails.getUpdateCtocBetweenSiv());
              checkListDetails.setUpdateCtocBetweenLplv(checkListRequestDetails.getUpdateCtocBetweenLplv());
               checkListDetails.setUpdateStocSiv(checkListRequestDetails.getUpdateStocSiv());
               checkListDetails.setUpdateStocLplv(checkListRequestDetails.getUpdateStocLplv());
                checkListDetails.setUpdateHqTocBetweenFpfv(checkListRequestDetails.getUpdateHqTocBetweenFpfv());
                checkListDetails.setUpdateHqTocBetweenLplv(checkListRequestDetails.getUpdateHqTocBetweenLplv());
                 checkListDetails.setYearlyQcChecklist(checkListRequestDetails.getYearlyQcChecklist());
         checkListDetails.setUpdateStocCov(checkListRequestDetails.getUpdateStocCov());
         checkListDetails.setQcGapAnalysis(checkListRequestDetails.getQcGapAnalysis());
          checkListDetails.setUpdateCtocLplv(checkListRequestDetails.getUpdateCtocLplv());
           checkListDetails.setUpdateHqTocLplv(checkListRequestDetails.getUpdateHqTocLplv());
            checkListDetails.setBeforeCsrQcChecklist(checkListRequestDetails.getBeforeCsrQcChecklist());
             checkListDetails.setUpdateHqTocBeforeCsr(checkListRequestDetails.getUpdateHqTocBeforeCsr());
              checkListDetails.setUpdateCtocBeforeCsr(checkListRequestDetails.getUpdateCtocBeforeCsr());
               checkListDetails.setUpdateStocBeforeCsr(checkListRequestDetails.getUpdateStocBeforeCsr());
                checkListDetails.setFinalizeHqToc(checkListRequestDetails.getFinalizeHqToc());
                 checkListDetails.setSubmitHqPTmf(checkListRequestDetails.getSubmitHqPTmf());
         checkListDetails.setFinalizeCToc(checkListRequestDetails.getFinalizeCToc());
         checkListDetails.setSubmitPTmf(checkListRequestDetails.getSubmitPTmf());
          checkListDetails.setFinalizeSToc(checkListRequestDetails.getFinalizeSToc());
           checkListDetails.setNoCrediDocuments(checkListRequestDetails.getNoCrediDocuments());
            checkListDetails.setNoDoctoVTOC(checkListRequestDetails.getNoDoctoVTOC());
             checkListDetails.setUploadAoRs(checkListRequestDetails.getUploadAoRs());

        CheckListTable updatedCheckListDetails = checkListTableRepository.save(checkListDetails);
        return updatedCheckListDetails;
    }

    @CrossOrigin
    @DeleteMapping("/checkListDetails/{id}")
    public ResponseEntity<?> deleteStudy(@PathVariable(value = "id") String studyId) {
        CheckListTable checkListDetails = checkListTableRepository.findById(studyId)
                .orElseThrow(() -> new ResourceNotFoundException("Study", "id", studyId));

        checkListTableRepository.delete(checkListDetails);

        return ResponseEntity.ok().build();
    }
}
