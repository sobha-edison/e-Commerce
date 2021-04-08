package com.ecommerce.eCommerce.serviceImp;

import com.ecommerce.eCommerce.dto.GenericResponse;
import com.ecommerce.eCommerce.model.Product;
import com.ecommerce.eCommerce.repository.ProductRepository;
import com.ecommerce.eCommerce.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImp implements UserService {
    @Autowired
    ProductRepository productRepository;

    @Override
    public GenericResponse getProductList() {
        GenericResponse genericResponse = new GenericResponse();
        List<Product> productList = productRepository.findAll();
        if(productList != null){
            genericResponse.setData(productList);
            genericResponse.setStatus(true);
        }else{
            genericResponse.setError("Failed");
            genericResponse.setStatus(false);
        }
        return genericResponse;
    }
}
