package com.kaamyapp.ex.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.kaamyaap.ex.service.ShoppingCartService;
import com.kaamyapp.ex.dao.ShoppingCartDao;
import com.kaamyapp.ex.model.ShoppingCart;

public class ShoppingCartServiceImpl implements ShoppingCartService {
	@Autowired
	ShoppingCartDao dao;
	
	@Override
	public List<ShoppingCart> purchageItem(String name) {
		
		return dao.purchageItem(name);
	}

}
