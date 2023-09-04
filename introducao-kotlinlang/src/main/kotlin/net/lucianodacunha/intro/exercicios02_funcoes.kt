package net.lucianodacunha.intro

/**
 * Exercícios abrangendo funções
 *
 * 1. Escreva uma função que seja capaz de rceber a quantidade de anos e
 * transformar em meses, dias, horas, minutos e segundos. Saída desejada:
 *
 * 2. Escreva uma função capaz de receber uma string e retorna a quantidade de
 * caracteres.
 *
 * 3. Escreva uma função capaz de calcular o cubo de um número inteiro (cubo =
 * n * n * n).
 *
 * 4. Escreva uma função capaz de receber milhas e converter em km
 * (1 milha = 1.6km).
 *
 * 5. Escreva um programa que seja capaz de receber uma string e fazer a troca
 * de todas as letras a ou A por x.
 * a. Não deve existir lógica dentro da função main. Deve ser usada somente como
 * ponto de entrada.
 * b. Escreve uma função para a troca de letras e impressão do valor final.
 * c. String final deve estar com todas as letras minúsculas.
 *
 * 6. Sobre as funções criadas nos exercícios 2, 3 e 4. É possível
 * transformá-las em funções de uma única linha? Se sim, transforme-as.
 */

// 1
fun conversorDeTempo(anos: Int){
    val anos = anos
    val meses = anos * 12
    val dias = anos * 365
    val horas = 24 * dias
    val minutos = horas * 60
    val segundos = minutos * 60

    println("${365 / 12}")
    println("$anos equivalem a: \n$meses meses\n$dias dias\n$horas horas\n" +
            "$minutos minutos\n$segundos segundos"
    )
}

// 2
fun caracteresString(str: String): Int {
    return str.length
}

// 3
fun cubo(num: Int): Int{
    return num * num * num
}

// 4
fun converteDistancias(milhas: Float): Float{
    return milhas * 1.6f
}

// 5
fun trocaLetras(str: String): Unit {
    val regex = "[a|A]".toRegex()
    println(str.replace(regex, "x").toUpperCase())
}

// 6
fun caracteresString2(str: String) = str.length
fun cubo2(num: Int) = num * num * num
fun converteDistancias2(milhas: Float) = milhas * 1.6f


fun main(){
    conversorDeTempo(2)
    val str: String = "Kotlin"
    println("Quantidade de caracteres na String $str: ${ caracteresString(str) }.")
    println("Cubo do valor: 5: ${cubo(5)}.")
    println("8 milhas => ${converteDistancias(8f)}.")
    trocaLetras("ProgramAção")

    println("Quantidade de caracteres na String $str: ${ caracteresString2(str) }.")
    println("Cubo do valor: 5: ${cubo2(5)}.")
    println("8 milhas => ${converteDistancias2(8f)}.")

}