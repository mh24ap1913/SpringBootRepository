package com.kaamyapp.ex.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.kaamyapp.ex.model.ShoppingCart;

@Repository
public interface ShoppingCartDao extends JpaRepository<ShoppingCart,Long>{

	List<ShoppingCart> purchageItem(String name);
}
