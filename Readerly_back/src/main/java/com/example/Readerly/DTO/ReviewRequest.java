package com.example.Readerly.DTO;

import org.springframework.data.annotation.Id;

public class ReviewRequest {
    public String bookId;
    public String userId;
    public String review;
    public Short rate;
}
