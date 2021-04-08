package com.ecommerce.eCommerce.controller;

import com.ecommerce.eCommerce.dto.GenericResponse;
import com.ecommerce.eCommerce.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/user")
public class UserController {
    @Autowired
    UserService userService;
    /**
     * get product list
     * @return
     */
    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public GenericResponse getProductList(){
        return userService.getProductList();
    }

}
