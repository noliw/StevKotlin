package `01-KotlinBasics`


// functions are a great way to organize code by splitting it into smaller pieces
fun main() {
    sumOfTwoNumbs()
    val result = sumOfTwoNumbs(3, 7)
    println(result)
}

fun sumOfTwoNumbs() {
    println(2 + 2)
}


// This is a block body function define with the curly braces
fun sumOfTwoNumbs(a: Int, b: Int): Int {
    return a + b
}


// this is expression body
fun expBdy (a: Int, b: Int) = a * b