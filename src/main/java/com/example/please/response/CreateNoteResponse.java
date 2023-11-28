package com.example.please.response;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class CreateNoteResponse {

    private Error error;
    private Long createdNoteId;

    public enum Error {
        ok,
        invalidTitle,
        invalidContent
    }

    public static CreateNoteResponse success(Long createdNoteId) {
        return builder().error(Error.ok).createdNoteId(createdNoteId).build();
    }

    public static CreateNoteResponse failed(Error error) {
        return builder().error(error).createdNoteId(-1L).build();
    }
}
