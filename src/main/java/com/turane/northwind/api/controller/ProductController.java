package com.turane.northwind.api.controller;

import com.turane.northwind.business.abstracts.ProductService;
import com.turane.northwind.entities.Product;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/products")
@AllArgsConstructor
public class ProductController {
    private ProductService productService;
    @GetMapping("/getAll")
    public List<Product>getAll(){
        return this.productService.getAll();

    }
}
