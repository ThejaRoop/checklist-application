package com.example.easynotes.repository;

import com.example.easynotes.model.Study;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.Query;

import org.springframework.data.repository.query.Param;

import java.util.*;
import javax.persistence.*;



@Repository
public interface StudyRepository extends JpaRepository<Study, String> {

    public static final String FIND_STUDIES = "SELECT trial_no FROM studies";


    @Query(value = FIND_STUDIES, nativeQuery = true)
public String[] getStudies();

}
