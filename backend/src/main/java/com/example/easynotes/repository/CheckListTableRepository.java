package com.example.easynotes.repository;

import com.example.easynotes.model.CheckListTable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.Query;

import org.springframework.data.repository.query.Param;

import java.util.*;
import javax.persistence.*;



@Repository
public interface CheckListTableRepository extends JpaRepository<CheckListTable, String> {

  public static final String FIND_IDS = "SELECT study_no FROM check_list_table";


    @Query(value = FIND_IDS, nativeQuery = true)
public String[] getChecklistIds();

}
