package com.example.demo.controller

import com.example.demo.model.entity.Product
import com.example.demo.repository.ProductRepository
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/products")
class ProductController(private val productRepository: ProductRepository) {


    @GetMapping("/list")
    fun listAll(): List<Product> = productRepository.findAll()


    @PostMapping("/create")
    fun create(@RequestBody product: Product): Product = productRepository.save(product)


    @DeleteMapping("/{id}")
    fun delete(@PathVariable id: Long) {
        productRepository.deleteById(id)
    }
}
