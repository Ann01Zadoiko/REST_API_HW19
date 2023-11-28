package com.example.please.response;


import com.example.please.entity.Note;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class UpdateNoteResponse {
    private Error error;

    private Note updatedNote;

    public enum Error {
        ok,
        insufficientPrivileges,
        invalidNoteId,
        invalidTitleLength,
        invalidContentLength
    }
    public static UpdateNoteResponse success(Note updatedNote) {
        return builder().error(Error.ok).updatedNote(updatedNote).build();
    }

    public static UpdateNoteResponse failed(Error error) {
        return builder().error(error).updatedNote(null).build();
    }
}
