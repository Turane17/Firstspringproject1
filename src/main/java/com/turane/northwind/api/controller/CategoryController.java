package com.turane.northwind.api.controller;

import com.turane.northwind.business.abstracts.CategoryService;
import com.turane.northwind.entities.Category;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/categories")
@AllArgsConstructor

public class CategoryController {
    private CategoryService categoryService;
    @GetMapping("getAll")
    public List<Category> getAll() {


        return this.categoryService.getAll();
    }
}
