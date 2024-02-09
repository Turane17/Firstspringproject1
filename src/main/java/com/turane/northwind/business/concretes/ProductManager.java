package com.turane.northwind.business.concretes;

import com.turane.northwind.business.abstracts.ProductService;
import com.turane.northwind.dataAccess.ProductDao;
import com.turane.northwind.entities.Product;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@AllArgsConstructor

public class ProductManager implements ProductService {
    private ProductDao productDao;

    @Override
    public List<Product> getAll() {
        List<Product> products=this. productDao.findAll();
        return products;
    }
}
