package com.example.easynotes.controller;

import com.example.easynotes.exception.ResourceNotFoundException;
import com.example.easynotes.model.Note;
import com.example.easynotes.repository.NoteRepository;
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
public class NoteController {

    @Autowired
    NoteRepository noteRepository;

    @GetMapping("/notes")
    public List<Note> getAllNotes() {
        return noteRepository.findAll();
    }

    @GetMapping("/notes/selected/{id}")
    public List<Object[]> getSelectedNotesFields(@PathVariable(value = "id") Long noteId) {

        Iterator iter = noteRepository.findAll().iterator();

Object first = iter.next();
        System.out.println("HHHHHHHHHHHHHHHHHHHHH"+ noteRepository.findNotes().toString());
        // System.out.println("HHHHHHHHHHHHHHHHHHHHH"+ noteRepository.findNotesPlease().toString());
        System.out.println("HHHHHHHHHHHHHHHHHHHHH"+ first.toString());
        return noteRepository.findNotes();
    //     List<Object> list  = noteRepository.findNotes();
    // return list;


       // return noteRepository.findTitleById(noteId);
       // return noteRepository.findAll();
    }

     @GetMapping("/notes/selectedcolumns/{id}")
    public Object[] getSelectedNoFields(@PathVariable(value = "id") Long noteId) {
        return noteRepository.findNotesPlease(noteId);
        // return noteRepository.findNotes();
    //     List<Object> list  = noteRepository.findNotes();
    // return list;


       // return noteRepository.findTitleById(noteId);
       // return noteRepository.findAll();
    }

    @PostMapping("/notes")
    public Note createNote(@Valid @RequestBody Note note) {
        return noteRepository.save(note);
    }

    @GetMapping("/notes/{id}")
    public Note getNoteById(@PathVariable(value = "id") Long noteId) {
        return noteRepository.findById(noteId)
                .orElseThrow(() -> new ResourceNotFoundException("Note", "id", noteId));
    }

    @PutMapping("/notes/{id}")
    public Note updateNote(@PathVariable(value = "id") Long noteId,
                                           @Valid @RequestBody Note noteDetails) {

        Note note = noteRepository.findById(noteId)
                .orElseThrow(() -> new ResourceNotFoundException("Note", "id", noteId));

        note.setTitle(noteDetails.getTitle());
        note.setContent(noteDetails.getContent());

        Note updatedNote = noteRepository.save(note);
        return updatedNote;
    }

    @DeleteMapping("/notes/{id}")
    public ResponseEntity<?> deleteNote(@PathVariable(value = "id") Long noteId) {
        Note note = noteRepository.findById(noteId)
                .orElseThrow(() -> new ResourceNotFoundException("Note", "id", noteId));

        noteRepository.delete(note);

        return ResponseEntity.ok().build();
    }
}
