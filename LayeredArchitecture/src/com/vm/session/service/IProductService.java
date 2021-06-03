package com.vm.session.service;

import java.util.Map;

import com.vm.session.bean.Product;

public interface IProductService {
	Product getByProductID(int id);
	Map<Integer,Product> getAllProducts();
}
