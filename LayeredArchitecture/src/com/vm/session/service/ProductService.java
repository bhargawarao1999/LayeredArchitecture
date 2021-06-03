package com.vm.session.service;

import java.util.Map;

import com.vm.session.bean.Product;
import com.vm.session.dao.IProductDAO;
import com.vm.session.dao.ProductDAO;

public class ProductService implements IProductService {

	IProductDAO productDao=new ProductDAO();
	@Override
	public Product getByProductID(int id) 
	{
		
		return productDao.getProductByID(id);
	}
	@Override
	public Map<Integer, Product> getAllProducts() {
		// TODO Auto-generated method stub
		return productDao.getAllProducts();
	}

}
