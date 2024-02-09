package com.turane.northwind.business.concretes;

import com.turane.northwind.business.abstracts.CategoryService;
import com.turane.northwind.dataAccess.CategoryDao;
import com.turane.northwind.entities.Category;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@AllArgsConstructor

public class CategoryManager implements CategoryService {
    private CategoryDao categoryDao;
    @Override
    public List<Category> getAll() {
        return null;
    }
}
