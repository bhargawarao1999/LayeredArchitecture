package com.vm.session.dao;

import java.util.Map;

import com.vm.session.bean.Product;

public interface IProductDAO 
{
	Product getProductByID(int id);
	Map<Integer,Product> getAllProducts();
}