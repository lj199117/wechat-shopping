package com.wechat.shopping.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.wechat.shopping.api.ProductService;
import org.wechat.shopping.model.Product;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.dingsns.commons.lang.UtilJson;
import com.wechat.shopping.mapper.ProductDao;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
@Service
public class ProductServiceImpl implements ProductService {
	private final Logger log = LogManager.getLogger(getClass());
	
	@Autowired private ProductDao productDao;
	@Override
	public List<Product> queryProductList() {
		List<Product> selectList = productDao.selectList(new EntityWrapper<>());
		log.info("queryProductList={}", UtilJson.writeValueAsString(selectList));
		return selectList;
	}
	@Override
	public List<Product> queryProductPage(Page<Product> page) {
		// TODO Auto-generated method stub
		return null;
	}
}
