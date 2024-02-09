package com.turane.northwind.business.abstracts;

import com.turane.northwind.entities.Product;

import java.util.List;

public interface ProductService {
    List<Product> getAll();
}
