package net.lucianodacunha.intro

/**
 * Nulidade, Segurança Nula.
 * Característica que permite ao Kotlin lidar com a possibilidade de execução
 * nula.
 */
fun main(){

    var neverNull: String = "Não pode ser null"
    // neverNull = null // O fato de declara a variável como String não permite
    // que seja atribuído o null.

    var nullable: String? = "Pode ser null"
    nullable = null
    // Agora, utilizando o operador de ?, é possível atribuir null posteriormente
    // mesmo a variável sendo inicialmente String.

    var inferredNonNull = "Somente mais um exemplo"
    // inferredNonNull = null

    fun testNull(notNull: String?){
        println(notNull)
    }

    testNull("Hello")
    // testNull(null) // Anteriormente, declaramos notNull como String.
    // Desta forma, não podemos passar um argumento null.
    // Para funcionar, a função dever ser declarada assim:
    // fun testNull(allowNull: String?)

    fun lengthNull(message: String?): Int {
        // String? necessário para garantir que a function aceitará null.
        return message?.length ?: 0
        // message? necessário para explicitar que message aceitará valor null
        // ?: utilizado como operador para caso message.length seja null.
    }

    println(lengthNull("Kotlin"))
    println(lengthNull(null))

    val p: String? = "Program"

    println("${ p!!.length }") // Operador !! que assumo o risco de ser null.
}