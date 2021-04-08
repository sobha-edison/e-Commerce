package com.ecommerce.eCommerce.controller;

import com.ecommerce.eCommerce.dto.GenericResponse;
import com.ecommerce.eCommerce.dto.UserDto;
import com.ecommerce.eCommerce.model.User;
import com.ecommerce.eCommerce.service.GeneralService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/general")
public class GeneralController {
    @Autowired
    GeneralService generalService;

    /**
     * register user
     * @param user
     * @return
     */
    @RequestMapping(value = "/registration", method = RequestMethod.POST)
    public GenericResponse registerAccount(@RequestBody User user){
        return generalService.registerUser(user);
    }
}
