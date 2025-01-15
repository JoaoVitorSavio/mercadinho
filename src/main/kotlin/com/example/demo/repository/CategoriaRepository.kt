package com.example.demo.repository

import com.example.demo.model.entity.Category
import org.springframework.data.jpa.repository.JpaRepository


interface CategoryRepository : JpaRepository<Category, Long>
