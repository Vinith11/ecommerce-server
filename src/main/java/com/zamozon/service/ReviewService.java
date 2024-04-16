package com.zamozon.service;

import java.util.List;

import com.zamozon.exception.ProductException;
import com.zamozon.modal.Review;
import com.zamozon.modal.User;
import com.zamozon.request.ReviewRequest;

public interface ReviewService {

	public Review createReview(ReviewRequest req,User user) throws ProductException;
	
	public List<Review> getAllReview(Long productId);
	
	
}
