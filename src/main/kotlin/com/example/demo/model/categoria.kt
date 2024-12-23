package com.example.demo.model

import jakarta.persistence.*

// Anotação para indicar que esta classe representa uma entidade no banco de dados.
@Entity

// Especifica o nome da tabela no banco para essa entidade.
@Table(name = "categorias")
data class Categoria(
    // Define o campo "id" como chave primária da tabela, gerada automaticamente.
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long = 0,

    // Define o campo "nome" como obrigatório e único (não permite duplicatas).
    @Column(nullable = false, unique = true)
    val nome: String
)