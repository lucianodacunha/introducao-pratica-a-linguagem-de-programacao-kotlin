package net.lucianodacunha.intro

/**
 * Demonstra a utilização de classes no desenvolvimento, para criar estruturas
 * de dados.
 */

class Customer

class Contact(val id: Int, var email: String)

fun main(){
    val customer = Customer()
    val contact = Contact(1, "email@email.com")

    println("Id: ${ contact.id }, E-mail: ${contact.email}")

    contact.email = "e@email.com"

    println("Id: ${ contact.id }, E-mail: ${contact.email}")
}
