package com.ecommerce.eCommerce.repository;
import com.ecommerce.eCommerce.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface ProductRepository extends JpaRepository<Product, Long> {
    @Query("SELECT product FROM Product product WHERE product.id = :productId")
    public Product getProductById(@Param("productId") Integer productId);
}
