package com.kaamyapp.ex.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.kaamyapp.ex.model.ImageModel;
@Repository
public interface ImageModelDao extends JpaRepository<ImageModel, Long>{

	List<ImageModel> findByImageData(String name);
}
