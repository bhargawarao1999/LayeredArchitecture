package com.vm.session.client;

import com.vm.session.bean.Product;
import com.vm.session.service.ProductService;

public class Client {

	public static void main(String[] args) 
	{
		ProductService productservice= new ProductService();
		Product product=productservice.getByProductID(100);
		System.out.println("Product");
		System.out.println(product.getProductId()+" "+product.getProductName()+" "+product.getQuantity());
		
		System.out.println(productservice.getAllProducts());
		
	}

}
