package com.zamozon.service;

import java.util.List;

import com.zamozon.exception.ProductException;
import com.zamozon.modal.Rating;
import com.zamozon.modal.User;
import com.zamozon.request.RatingRequest;

public interface RatingServices {
	
	public Rating createRating(RatingRequest req,User user)throws ProductException;
	
	public List<Rating> getProductsRating(Long productId);

}
