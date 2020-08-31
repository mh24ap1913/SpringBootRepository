/**
 * @author: Vikas Ghodke
 */
package com.kaamyapp.ex.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.kaamyaap.ex.service.ImageModelService;
import com.kaamyaap.ex.service.ShoppingCartService;
import com.kaamyapp.ex.model.ImageModel;
import com.kaamyapp.ex.model.ShoppingCart;

@Controller
public class ReportRestController {

	@Autowired
	ShoppingCartService service;
	
	@Autowired
	ImageModelService modelService;
	
	@PostMapping("/kaamyapp/shopping")
	public List<ShoppingCart> shpoppingPurchegeDate(@PathVariable String name){
		return service.purchageItem(name);
	}
	
	@PostMapping("/kaamyapp/imageData")
	public List<ImageModel> imageData(@PathVariable String name){
		return modelService.findByImageData(name);
	}
}
