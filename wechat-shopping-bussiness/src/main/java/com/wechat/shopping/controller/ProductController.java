package com.wechat.shopping.controller;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.wechat.shopping.api.ProductService;
import org.wechat.shopping.model.Product;

import com.dingsns.commons.lang.UtilJson;

@RestController
public class ProductController {
	protected final Logger logger = LogManager.getLogger(getClass());
	@Autowired
	ProductService productService;

	/**
	 * http://localhost:8080/listProduct?pageIndex=1
	 * 
	 * @return
	 * @throws Exception
	 */
	@RequestMapping(value = { "/listProduct" }, method = RequestMethod.GET)
	public List<Product> listProduct(int pageIndex) throws Exception {
		/* page参数作为第一个参数会被拦截器填充分页信息 */
		List<Product> products = productService.queryProductList();
		logger.info("page={}", UtilJson.writeValueAsString(products));
		return products;
	}
}
