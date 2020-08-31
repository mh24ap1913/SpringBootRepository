package com.kaamyaap.ex.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.kaamyapp.ex.model.ImageModel;

@Service
public interface ImageModelService {

	List<ImageModel> findByImageData(String name);
}
