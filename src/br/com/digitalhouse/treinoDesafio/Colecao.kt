package br.com.digitalhouse.treinoDesafio

class Colecao(
        override var codigo: Int,
        override var preco: Double,
        override var quantidadeEmEstoque: Int,
        var livro: MutableList<Livro>) : Item {
}