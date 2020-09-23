package br.com.digitalhouse.treinoDesafio

class Livro(
    override var codigo: Int,
    override var preco: Double,
    override var quantidadeEmEstoque: Int,
    val titulo: String,
    val autor: String,
    val anoDeLancamento: Int) : Item {
}