package com.example.easynotes.repository;

import com.example.easynotes.model.Note;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.Query;

import org.springframework.data.repository.query.Param;

import java.util.*;
import javax.persistence.*;

// import java.util.List<com.example.easynotes.model.Note>;

/**
 * Created by rajeevkumarsingh on 27/06/17.
 */

@Repository
public interface NoteRepository extends JpaRepository<Note, Long> {


//     public static final String FIND_PROJECTS = "SELECT projectId, projectName FROM projects";

// @Query(value = FIND_PROJECTS, nativeQuery = true)
// public List<Object[]> findProjects();

    public static final String FIND_NOTES = "SELECT id, content, title FROM notes";
    public static final String FIND_NOTES1 = "SELECT t.content, t.title FROM notes t where t.id= :noteId";

    // @Query("SELECT t.content FROM notes t where t.id= :id")
    //  Object findTitleById(@Param("id") Long id);

@Query(value = FIND_NOTES, nativeQuery = true)
public List<Object[]> findNotes();

@Query(value = FIND_NOTES1, nativeQuery = true)
public Object[] findNotesPlease(@Param("noteId") Long noteId);

}
