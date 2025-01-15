package com.example.demo.model.entity

import jakarta.persistence.*


@Entity


@Table(name = "products")
data class Product(

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long = 0,


    @Column(nullable = false)
    val name: String,


    @ManyToOne
    @JoinColumn(name = "category_id", nullable = false)
    val category: Category,


    @Column(nullable = false)
    val price: Double,


    @Column(nullable = false)
    val stock: Int,


    @Column(nullable = true)
    val description: String?
)
