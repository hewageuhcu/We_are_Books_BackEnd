package com.example.Readerly.Services;

import com.example.Readerly.DTO.Convert.EditReviewDTOtoReview;
import com.example.Readerly.DTO.Convert.ReviewDTOToReview;
import com.example.Readerly.DTO.EditReviewRequest;
import com.example.Readerly.DTO.ReviewRequest;
import com.example.Readerly.DTO.ReviewResponse;
import com.example.Readerly.Entities.Review;
import com.example.Readerly.Entities.User;
import com.example.Readerly.Repositories.ReviewRepository;
import com.example.Readerly.Repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Service
public class ReviewService {
    private final ReviewRepository reviewRepository;
    private final UserRepository userRepository;
    @Autowired
    public ReviewService(ReviewRepository reviewRepository, UserRepository userRepository) {
        this.reviewRepository = reviewRepository;
        this.userRepository = userRepository;
    }

    //Post a review
    public void postReview(ReviewRequest review) {
        reviewRepository.save(ReviewDTOToReview.toReview(review));
    }

    //edit a review
    public void editReview(String reviewId, EditReviewRequest review) {
        Review rw = reviewRepository.findById(reviewId)
                .orElseThrow(() -> new RuntimeException("Unexpected error occurred"));
        Review newRw = EditReviewDTOtoReview.toReview(review, rw);
        reviewRepository.save(newRw);
    }

    //Delete a review
    public void deleteReview(String reviewId) {
        try{
            reviewRepository.deleteById(reviewId);
        }catch (Exception e) {
            throw new RuntimeException("Unexpected error occurred");
        }
    }

    //Get all reviews for a book
    public List<ReviewResponse> getReviewsByBook(String bookId) {
        try{
            List<Review> reviews = reviewRepository.findByBookId(bookId);
            List<String> userIds = reviews.stream()
                    .map(Review::getUserId)
                    .distinct()
                    .toList();
            List<User> users = userRepository.findAllById(userIds);

            Map<String, String> userNameMap = users.stream()
                    .collect(Collectors.toMap(User::getId, User::getUserName));

            return reviews.stream()
                    .map(record -> {
                        ReviewResponse dto = new ReviewResponse();
                        dto.id=record.getId();
                        dto.bookId=record.getBookId();
                        dto.date=record.getDate();
                        dto.review=record.getReview();
                        dto.rate=record.getRate();
                        dto.userId=record.getUserId();
                        dto.user=userNameMap.get(record.getUserId());
                        return dto;
                    })
                    .collect(Collectors.toList());

        }catch (Exception e) {
            throw new RuntimeException("Unexpected error occurred");
        }
    }
}
