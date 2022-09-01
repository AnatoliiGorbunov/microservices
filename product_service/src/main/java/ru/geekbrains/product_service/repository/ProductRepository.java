package ru.geekbrains.product_service.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.geekbrains.product_service.entityes.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
