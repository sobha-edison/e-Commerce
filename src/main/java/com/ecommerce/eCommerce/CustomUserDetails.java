package com.ecommerce.eCommerce;

import com.ecommerce.eCommerce.model.Roles;
import com.ecommerce.eCommerce.model.User;
import com.ecommerce.eCommerce.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import java.util.*;

public class CustomUserDetails implements UserDetailsService {
    @Autowired
    UserRepository userDaoRepository;


    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        Set<GrantedAuthority> auths = new HashSet<>();
        User userDao = userDaoRepository.findByUsername(s);
        for(Roles role: userDao.getRoles())
            auths.add(new SimpleGrantedAuthority(role.getRoleName().toUpperCase()));
        return new User(userDao.getUserName(), userDao.getPassword(), userDao.getEnabled(), true,
                true, true, auths);
    }
}
