package br.com.digitalhouse.treinoDesafio

class Sistema(var livros: ArrayList<Livro>, var colecoes: ArrayList<Colecao>) {

    fun cadastrarLivro(livro: Livro): Int {
        livros.add(livro)
        println("O livro foi adicionado na lista")
        println(livros)
        return 0
    }

    fun cadastrarColecao(colecao: Colecao): Int {
        colecoes.add(colecao)
        println("A colecao foi adicionada")
        println(colecoes)
        return 0
    }

    fun consultarLivro(codigo: Int): Int {
        println(livros.get(codigo))
        return 0
    }

    fun consultarColecao(codigo: Int): Int {
        println(livros[codigo])
        return 0
    }

    fun efetuarVenda(codigo: Int): Int {
        return 0
    }
}