package net.lucianodacunha.intro

/**
 * Exemplifica a utilização básica de funções, com e sem retorno, utilizando
 * parâmetros nomeados ou não.
 *
 */
fun printMessage(message: String) : Unit {
    println(message)
}

fun printMessageWithPrefix(message: String, prefix: String = "Info") {
    println("${prefix} ${message}")
}

fun sum(x: Int, y: Int): Int {
    return x + y
}

fun multiply(x: Int, y: Int) = x * y

fun main(){
    printMessage("Hello World")
    printMessageWithPrefix("Kotlin testing")
    printMessageWithPrefix(prefix = "Test", message = "Kotlin")
    printMessageWithPrefix("${sum(3, 3)}", "Sum: ")
    printMessageWithPrefix("${multiply(3, 3)}", "Mult: ")
}