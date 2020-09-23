package br.com.digitalhouse.treinoDesafio

fun main() {

    var livro1 = Livro("titulo", "autor", 1999, 123, 2.2, 2)
    var livro2 = Livro("titulo2", "autor2", 1998, 124, 2.4, 3)

    var lista = mutableListOf<Livro>()
    lista.add(livro1)

    var colecao = Colecao(123, 8.8, 1, lista)

    var listaColecao = mutableListOf<Colecao>(colecao)

    var sistema = Sistema(mutableListOf<Livro>(livro1), listaColecao)

    sistema.cadastrarLivro(livro2)


}