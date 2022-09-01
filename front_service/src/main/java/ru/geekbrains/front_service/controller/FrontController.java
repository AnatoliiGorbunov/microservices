package ru.geekbrains.front_service.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import ru.geekbrains.front_service.dto.ProductDto;


import java.util.List;

@RestController
@RequestMapping("/api/v1/")
public class FrontController {

    @Autowired
    private RestTemplate restTemplate;


    @GetMapping("/products")
    public List<ProductDto> findAllProducts(){
     List<ProductDto> productDto = restTemplate.getForObject("http://localhost:8190/api/v1/products", List.class);
      return productDto;


    }

    @GetMapping("/add")
    public String productAdd(){
        String data = restTemplate.getForObject("http://localhost:8190/api/v1/products/add", String.class);
        return data;
    }

}
