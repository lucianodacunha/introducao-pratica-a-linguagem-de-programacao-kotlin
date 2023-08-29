package net.lucianodacunha.intro

/**
 * Demonstrando a utilização de funções com varargs.
 * Recurso que possibilita a declaração de apenas uma variável, mas a função,
 * aceitará um número variável de argumentos.
 */

fun printAll(vararg words: String) {
    for (word in words) println(word)
}

fun printAllWithPrefix(vararg words: String, prefix: String){
    for (word in words) println("${prefix} ${word}")
}

fun byPassVarArgs(vararg words: String) {
    printAll(*words)
}

fun main(){
    printAll("A", "B", "C")
    printAllWithPrefix("1", "2", "3", "4", prefix = "Number")
    byPassVarArgs("A", "B", "C")
}