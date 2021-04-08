package com.ecommerce.eCommerce.service;

import com.ecommerce.eCommerce.dto.GenericResponse;
import com.ecommerce.eCommerce.model.User;

public interface GeneralService {
    /**
     * register user
     * @param user
     * @return
     */
    public GenericResponse registerUser(User user);
}
