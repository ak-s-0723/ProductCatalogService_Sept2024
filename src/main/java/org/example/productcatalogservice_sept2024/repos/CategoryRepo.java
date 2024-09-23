package org.example.productcatalogservice_sept2024.repos;

import org.example.productcatalogservice_sept2024.models.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepo extends JpaRepository<Category,Long> {
}
