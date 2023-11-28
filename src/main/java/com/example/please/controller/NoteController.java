package com.example.please.controller;

import com.example.please.request.CreateNoteRequest;
import com.example.please.request.UpdateNoteRequest;
import com.example.please.response.CreateNoteResponse;
import com.example.please.response.DeleteNoteResponse;
import com.example.please.response.GetUserNotesResponse;
import com.example.please.response.UpdateNoteResponse;
import com.example.please.service.NoteService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.security.Principal;

@RestController
@RequiredArgsConstructor
@RequestMapping("/notes")
public class NoteController {

    private final NoteService noteService;

    @PostMapping
    public CreateNoteResponse create(Principal principal, @RequestBody CreateNoteRequest request) {
        return noteService.create(principal.getName(), request);
    }

    @GetMapping("/getUserNotes")
    public GetUserNotesResponse getUserNotes(Principal principal) {
        return noteService.getUserNotes(principal.getName());
    }

    @PatchMapping
    public UpdateNoteResponse update(Principal principal, @RequestBody UpdateNoteRequest request) {
        return noteService.update(principal.getName(), request);
    }

    @DeleteMapping
    public DeleteNoteResponse delete(Principal principal, @RequestParam(name = "id") Long id) {
        return noteService.delete(principal.getName(), id);
    }
}
