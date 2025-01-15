package com.example.demo.controller

import com.example.demo.model.entity.Category
import com.example.demo.repository.CategoryRepository
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/categories")
class CategoryController(private val categoryRepository: CategoryRepository) {


    @GetMapping("/list")
    fun listAll(): List<Category> = categoryRepository.findAll()


    @PostMapping("/create")
    fun create(@RequestBody category: Category): Category = categoryRepository.save(category)


    @DeleteMapping("/{id}")
    fun delete(@PathVariable id: Long) {
        categoryRepository.deleteById(id)
    }
}
