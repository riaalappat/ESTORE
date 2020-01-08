package com.deloitte.estore.application;

import java.util.ArrayList;
import java.util.List;

import com.deloitte.estore.model.Product;
import com.deloitte.estore.service.ProductService;
import com.deloitte.estore.service.ProductServicImpl;


public class DeloitteEStoreApp {
	public static void main(String[] args) {
		ProductService service=new ProductServicImpl();
		List<Product> products=new ArrayList<>();
		try {
			products=service.getAllProducts();
			System.out.println(products);
			}
			
		
		catch (Exception e) {
			e.printStackTrace();
		}
	}

}

