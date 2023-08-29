package net.lucianodacunha.intro

/**
 * Demonstra como os Generics podem ser aplicados no conceito de funções.
 */
fun <E> mutableStack(vararg valores: E) = MutableStack(*valores)