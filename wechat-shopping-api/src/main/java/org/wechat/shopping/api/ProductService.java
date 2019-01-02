package org.wechat.shopping.api;

import java.util.List;

import org.wechat.shopping.model.Product;

import com.baomidou.mybatisplus.plugins.Page;

public interface ProductService {
	List<Product> queryProductList();

	List<Product> queryProductPage(Page<Product> page);
}
