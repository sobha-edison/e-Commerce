package com.ecommerce.eCommerce.service;

import com.ecommerce.eCommerce.dto.GenericResponse;
import com.ecommerce.eCommerce.model.User;

public interface UserService {
    /**
     * get product list
     * @return
     */
    public GenericResponse getProductList();
}
