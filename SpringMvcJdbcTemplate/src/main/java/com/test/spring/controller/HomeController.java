package com.test.spring.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.test.spring.dao.EskartDAO;
import com.test.spring.model.Contact;
import com.test.spring.model.Product;

/**
 * This controller routes accesses to the application to the appropriate
 * hanlder methods. 
 * @author www.codejava.net
 *
 */
@RestController
public class HomeController {

	@Autowired
	private EskartDAO eskartDao;
	
	
	@RequestMapping(value="/")
	public ModelAndView getProducts() {
		List<Product> productList = eskartDao.getAllProducts();
		ModelAndView model = new ModelAndView("Product");

		model.addObject("productlist", productList);
		return model;
	}
	
	@RequestMapping(value="/getProducts",method = RequestMethod.GET, produces="application/json")
	public  @ResponseBody List<Product> getAllProducts() {
		List<Product> productList = eskartDao.getAllProducts();
	
		return productList;
	}
	@RequestMapping("/getString")
    public String getString()
    {
        return "Hello World";
    }
	
}
