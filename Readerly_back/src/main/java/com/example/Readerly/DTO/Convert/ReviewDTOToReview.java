package com.example.Readerly.DTO.Convert;

import com.example.Readerly.DTO.ReviewRequest;
import com.example.Readerly.Entities.Review;

public class ReviewDTOToReview {
    public static Review toReview(ReviewRequest reviewDTO) {
        Review review = new Review();
        review.setBookId(reviewDTO.bookId);
        review.setUserId(reviewDTO.userId);
        review.setReview(reviewDTO.review);
        review.setRate(reviewDTO.rate);
        review.setDate(java.time.LocalDate.now().toString());
        return review;
    }
}
