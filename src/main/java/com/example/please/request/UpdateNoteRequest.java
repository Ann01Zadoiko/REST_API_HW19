package com.example.please.request;

import lombok.Data;

@Data
public class UpdateNoteRequest {
    private Long id;
    private String title;
    private String content;
}
