package com.example.demo.model

import jakarta.persistence.*

// Anotação para indicar que esta classe representa uma entidade no banco de dados.
@Entity

// Especifica o nome da tabela no banco para essa entidade.
@Table(name = "produtos")
data class Produto(
    // Define o campo "id" como chave primária da tabela, gerada automaticamente.
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long = 0,

    // Define o campo "nome" como obrigatório (não nulo).
    @Column(nullable = false)
    val nome: String,

    // Relaciona "Produto" a "Categoria" com uma relação muitos-para-um.
    @ManyToOne
    @JoinColumn(name = "categoria_id", nullable = false)
    val categoria: Categoria,

    // Define o campo "preco" como obrigatório.
    @Column(nullable = false)
    val preco: Double,

    // Define o campo "estoque" como obrigatório.
    @Column(nullable = false)
    val estoque: Int,

    // Campo opcional (pode ser nulo) para a descrição do produto.
    @Column(nullable = true)
    val descricao: String)