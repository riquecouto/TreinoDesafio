package br.com.digitalhouse.treinoDesafio

class Livro(val titulo: String, val autor: String, val anoDeLancamento: Int, override var codigo: Int, override var preco: Double, override var quantidadeEmEstoque: Int) : Item {

}