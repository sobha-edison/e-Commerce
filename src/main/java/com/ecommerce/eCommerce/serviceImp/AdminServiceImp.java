package com.ecommerce.eCommerce.serviceImp;
import com.ecommerce.eCommerce.dto.GenericResponse;
import com.ecommerce.eCommerce.model.Product;
import com.ecommerce.eCommerce.repository.ProductRepository;
import com.ecommerce.eCommerce.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdminServiceImp implements AdminService {
    @Autowired
    ProductRepository repository;

    @Override
    public GenericResponse addProduct(Product product) {
        GenericResponse genericResponse = new GenericResponse();
        Product saveProduct = repository.save(product);
        if(saveProduct != null){
            genericResponse.setData("Success");
            genericResponse.setStatus(true);
        }else{
            genericResponse.setError("Failed");
            genericResponse.setStatus(false);
        }
        return genericResponse;
    }

    @Override
    public GenericResponse getProductDetails(Integer productId) {
        GenericResponse genericResponse = new GenericResponse();
        Product product = repository.getProductById(productId);
        if(product!=null){
            genericResponse.setData(product);
            genericResponse.setStatus(true);
        }else{
            genericResponse.setError("Failed");
            genericResponse.setStatus(false);
        }
        return genericResponse;
    }
}
