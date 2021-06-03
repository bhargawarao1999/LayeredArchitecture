package com.vm.session.dao;

import java.util.Map;

import com.vm.session.bean.Product;
import com.vm.session.util.CollectionUtil;

public class ProductDAO implements IProductDAO
{
	
	//CollectionUtil collectionutil= new CollectionUtil();
	@Override
	public Product getProductByID(int id) 
	{
		Map <Integer,Product> hashmap= CollectionUtil.getProducts();
		Product product = hashmap.get(id);
		return product;
	}

	@Override
	public Map getAllProducts() {
		
		return CollectionUtil.getProducts();
	}
	
}
