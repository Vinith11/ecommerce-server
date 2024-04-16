package com.zamozon.service;

import com.zamozon.exception.CartItemException;
import com.zamozon.exception.UserException;
import com.zamozon.modal.Cart;
import com.zamozon.modal.CartItem;
import com.zamozon.modal.Product;

public interface CartItemService {
	
	public CartItem createCartItem(CartItem cartItem);
	
	public CartItem updateCartItem(Long userId, Long id,CartItem cartItem) throws CartItemException, UserException;
	
	public CartItem isCartItemExist(Cart cart,Product product,String size, Long userId);
	
	public void removeCartItem(Long userId,Long cartItemId) throws CartItemException, UserException;
	
	public CartItem findCartItemById(Long cartItemId) throws CartItemException;
	
}
