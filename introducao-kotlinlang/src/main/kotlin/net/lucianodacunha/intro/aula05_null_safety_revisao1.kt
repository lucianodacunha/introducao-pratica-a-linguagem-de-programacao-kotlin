package net.lucianodacunha.intro

fun main(){
    // operador null safety
    val nome: String? = readln()

    // utilizando o operador elvis
    print(nome ?: "String nula")
}