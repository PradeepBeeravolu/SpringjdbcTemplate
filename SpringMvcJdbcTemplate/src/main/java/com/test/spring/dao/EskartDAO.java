package com.test.spring.dao;

import java.util.List;

import com.test.spring.model.Contact;
import com.test.spring.model.Product;

/**
 * Defines DAO operations for the contact model.
 * @author www.codejava.net
 *
 */
public interface EskartDAO {
	
	public List<Product> getAllProducts();
		
}
