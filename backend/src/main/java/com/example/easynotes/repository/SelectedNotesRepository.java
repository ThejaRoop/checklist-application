// package com.example.easynotes.repository;

// import com.example.easynotes.model.Note;
// import org.springframework.data.jpa.repository.JpaRepository;
// // import org.springframework.stereotype.Repository;
// import org.springframework.data.jpa.repository.Query;

// import org.springframework.data.repository.query.Param;
// import org.springframework.data.repository.Repository;

// import java.util.*;
// import javax.persistence.*;

// // import java.util.List<com.example.easynotes.model.Note>;

// /**
//  * Created by rajeevkumarsingh on 27/06/17.
//  */

// @Repository
// public interface SelectedNotesRepository extends Repository<Note, Long> {

//     public static final String FIND_NOTES = "SELECT id, content, title FROM notes";

//     @Query("SELECT t.content FROM notes t where t.id= :id")
//      Object findTitById(@Param("id") Long id);

// // @Query(value = FIND_NOTES, nativeQuery = true)
// // public List<Note> findNotes();

// }
