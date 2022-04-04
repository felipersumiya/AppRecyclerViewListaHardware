package br.com.felipersumiya.listahardwarerecyclerview.model

data class Produto(
    val foto: Int, // quando a foto está na pasta dentro no app, utiliza-se Int. Se fossemos pegar de uma URL colocaríamos String
    val nome:String,
    val descricao:String,
    val preco: String
    ) {
}