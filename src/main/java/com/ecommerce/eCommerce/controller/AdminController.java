package com.ecommerce.eCommerce.controller;

import com.ecommerce.eCommerce.dto.GenericResponse;
import com.ecommerce.eCommerce.model.Product;
import com.ecommerce.eCommerce.model.User;
import com.ecommerce.eCommerce.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/admin")
public class AdminController {
    @Autowired
    AdminService adminService;

    /**
     * add product
     * @param product
     * @return
     */
    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public GenericResponse addProduct(@RequestBody Product product){
        return adminService.addProduct(product);
    }

    /**
     * get product details
     * @param productId
     * @return
     */
    @RequestMapping(value = "/productDetails", method = RequestMethod.GET)
    public GenericResponse getProductDetails(@RequestParam Integer productId){
        return adminService.getProductDetails(productId);
    }
}
