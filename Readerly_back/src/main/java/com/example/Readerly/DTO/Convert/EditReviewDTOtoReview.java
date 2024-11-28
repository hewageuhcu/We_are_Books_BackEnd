package com.example.Readerly.DTO.Convert;

import com.example.Readerly.DTO.EditReviewRequest;
import com.example.Readerly.Entities.Review;

public class EditReviewDTOtoReview {
    public static Review toReview(EditReviewRequest editReviewDTO,Review review) {
        Review newReview = new Review();
        newReview.setId(review.getId());
        newReview.setBookId(review.getBookId());
        newReview.setUserId(review.getUserId());
        newReview.setReview(editReviewDTO.review);
        newReview.setRate(editReviewDTO.rate);
        newReview.setDate(java.time.LocalDate.now().toString());
        return newReview;
    }
}
