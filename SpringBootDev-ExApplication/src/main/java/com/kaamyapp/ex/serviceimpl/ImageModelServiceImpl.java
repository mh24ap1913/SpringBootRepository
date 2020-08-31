package com.kaamyapp.ex.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.kaamyaap.ex.service.ImageModelService;
import com.kaamyapp.ex.dao.ImageModelDao;
import com.kaamyapp.ex.model.ImageModel;

public class ImageModelServiceImpl implements ImageModelService{

	@Autowired
	ImageModelDao dao;
	@Override
	public List<ImageModel> findByImageData(String name) {
		
		return dao.findByImageData(name);
	}

}
