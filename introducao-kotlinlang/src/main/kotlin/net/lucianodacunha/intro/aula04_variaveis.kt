package net.lucianodacunha.intro

/**
 * Exemplifica como trabalhar com variáveis.
 */
fun main(){
    var a: String = "Kotlin" // Não usamos a inferência de tipos.
    val b: Int = 1 // Variável não permite a reatribuição e não utiliza inteferência.
    val c = 3; // Utiliza inferência e não permite a reatribuição.

    println(a)
    println(b)
    println(c)

    // c = 4 // valore não pode ser reatribuído.
    a = "Hello World"

    println(a)

    var d: Int
    // println(d) // A variável precisa ser inicializada.

    if (true) {
        d = 42
    } else {
        d = 2
    }

    println(d)
}