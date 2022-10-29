package ru.geekbrains.product_service.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.geekbrains.product_service.dto.ProductDto;
import ru.geekbrains.product_service.entityes.Product;
import ru.geekbrains.product_service.service.ProductService;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/v1/products")
@RequiredArgsConstructor

public class ProductController {

    private final ProductService productService;

    private static final Function<Product, ProductDto> mapper = p -> new ProductDto(p.getId(), p.getTitle(), p.getPrice());

    @GetMapping
    public List<ProductDto> findAll(){
        return productService.findAll().stream().map(mapper).collect(Collectors.toList());
    }

    @GetMapping("/add")
    public String addProducts(){
        return "продукт добавлен";
    }

}
