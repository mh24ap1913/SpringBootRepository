package com.kaamyaap.ex.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.kaamyapp.ex.model.ShoppingCart;

@Service
public interface ShoppingCartService {

	List<ShoppingCart> purchageItem(String name);
		
	
}
