package com.ecommerce.eCommerce.repository;
import com.ecommerce.eCommerce.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GeneralRepository extends JpaRepository<User, Long> {

}
