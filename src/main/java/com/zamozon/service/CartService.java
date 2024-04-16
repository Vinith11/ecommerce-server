package com.zamozon.service;

import com.zamozon.exception.ProductException;
import com.zamozon.modal.Cart;
import com.zamozon.modal.CartItem;
import com.zamozon.modal.User;
import com.zamozon.request.AddItemRequest;

public interface CartService {
	
	public Cart createCart(User user);
	
	public CartItem addCartItem(Long userId,AddItemRequest req) throws ProductException;
	
	public Cart findUserCart(Long userId);

}
