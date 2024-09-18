package org.example.productcatalogservice_sept2024.repos;

import org.example.productcatalogservice_sept2024.models.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepo extends JpaRepository<Product,Long> {
}