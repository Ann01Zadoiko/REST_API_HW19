package com.example.please.response;

import com.example.please.entity.Note;
import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class GetUserNotesResponse {

    private Error error;
    private List<Note> userNotes;

    public enum Error {
        ok,
        failed
    }


    public static GetUserNotesResponse success(List<Note> userNotes) {
        return builder().error(Error.ok).userNotes(userNotes).build();
    }

    public static GetUserNotesResponse failed() {
        return builder().error(Error.failed).userNotes(null).build();
    }
}
