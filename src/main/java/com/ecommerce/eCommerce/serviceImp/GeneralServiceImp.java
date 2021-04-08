package com.ecommerce.eCommerce.serviceImp;
import com.ecommerce.eCommerce.dto.GenericResponse;
import com.ecommerce.eCommerce.model.User;
import com.ecommerce.eCommerce.repository.GeneralRepository;
import com.ecommerce.eCommerce.service.GeneralService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GeneralServiceImp implements GeneralService {
    @Autowired
    GeneralRepository repository;

    @Override
    public GenericResponse registerUser(User user) {
        GenericResponse genericResponse = new GenericResponse();
        User saveUser = repository.save(user);
        if(saveUser != null){
            genericResponse.setData("Success");
            genericResponse.setStatus(true);
        }else{
            genericResponse.setError("Failed");
            genericResponse.setStatus(false);
        }
        return genericResponse;
    }
}
