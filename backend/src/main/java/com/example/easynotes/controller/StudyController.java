package com.example.easynotes.controller;

import com.example.easynotes.exception.ResourceNotFoundException;
import com.example.easynotes.model.Study;
import com.example.easynotes.repository.StudyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java. util.*;

/**
 * Created by rajeevkumarsingh on 27/06/17.
 */
@RestController
@RequestMapping("/api")
public class StudyController {

    @Autowired
    StudyRepository studyRepository;

    @CrossOrigin
    @GetMapping("/studies")
    public List<Study> getAllStudies() {
        return studyRepository.findAll();
    }

    @CrossOrigin
    @GetMapping("/study/ids")
    public String[] getStudyIds() {
        return studyRepository.getStudies();
    }

    @CrossOrigin
    @PostMapping("/studies")
    public Study createStudy(@Valid @RequestBody Study study) {
        return studyRepository.save(study);
    }
    
    @CrossOrigin
    @GetMapping("/studies/{id}")
    public Study getStudyById(@PathVariable(value = "id") String studyId) {
        return studyRepository.findById(studyId)
                .orElseThrow(() -> new ResourceNotFoundException("Study", "id", studyId));
    }

    @CrossOrigin
    @PutMapping("/studies/{id}")
    public Study updateStudy(@PathVariable(value = "id") String studyId,
                                           @Valid @RequestBody Study studyDetails) {

        Study study = studyRepository.findById(studyId)
                .orElseThrow(() -> new ResourceNotFoundException("Study", "id", studyId));

        study.setProtocolAmmendmentCreation(studyDetails.getProtocolAmmendmentCreation());
        study.setProtocolAmmendmentStatus(studyDetails.getProtocolAmmendmentStatus());
        study.setIcfCreation(studyDetails.getIcfCreation());
        study.setIcfStatus(studyDetails.getIcfStatus());
        study.setNoPhisChecklistCreation(studyDetails.getNoPhisChecklistCreation());
        study.setNoPhisChecklistStatus(studyDetails.getNoPhisChecklistStatus());
        study.setHqTmfTocCreation(studyDetails.getHqTmfTocCreation());
        study.setHqTmfTocStatus(studyDetails.getHqTmfTocStatus());
        study.setCTmfTocCreation(studyDetails.getCTmfTocCreation());
        study.setCTmfTocStatus(studyDetails.getCTmfTocStatus());
        study.setSTmfTocCreation(studyDetails.getSTmfTocCreation());
        study.setSTmfTocStatus(studyDetails.getSTmfTocStatus());
        study.setStudyLeadQCCheclistCreation(studyDetails.getStudyLeadQCCheclistCreation());
        study.setStudyLeadQCCheclistStatus(studyDetails.getStudyLeadQCCheclistStatus());
        study.setETMFtractingCreation(studyDetails.getETMFtractingCreation());
        study.setETMFtractingStatus(studyDetails.getETMFtractingStatus());
        study.setECTDtrackerCreation(studyDetails.getECTDtrackerCreation());
        study.setECTDtrackerStatus(studyDetails.getECTDtrackerStatus());
        study.setTmfFinalQCCreation(studyDetails.getTmfFinalQCCreation());
        study.setTmfFinalQCStatus(studyDetails.getTmfFinalQCStatus());

        Study updatedStudy = studyRepository.save(study);
        return updatedStudy;
    }

    @CrossOrigin
    @DeleteMapping("/studies/{id}")
    public ResponseEntity<?> deleteStudy(@PathVariable(value = "id") String studyId) {
        Study study = studyRepository.findById(studyId)
                .orElseThrow(() -> new ResourceNotFoundException("Study", "id", studyId));

        studyRepository.delete(study);

        return ResponseEntity.ok().build();
    }
}
