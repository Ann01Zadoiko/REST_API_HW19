package com.example.please.request;

import lombok.Data;

@Data
public class CreateNoteRequest {
    private String title;
    private String content;
}
