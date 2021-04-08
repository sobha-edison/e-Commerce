package com.ecommerce.eCommerce.service;

import com.ecommerce.eCommerce.dto.GenericResponse;
import com.ecommerce.eCommerce.model.Product;

public interface AdminService {
    /**
     * add product
     * @param product
     * @return
     */
    public GenericResponse addProduct(Product product);

    /**
     * get product details
     * @param productId
     * @return
     */
    public GenericResponse getProductDetails(Integer productId);
}
