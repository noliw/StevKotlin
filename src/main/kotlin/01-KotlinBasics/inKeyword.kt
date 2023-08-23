package `01-KotlinBasics`

fun main() {
    val num = 101
    println(num in 0..100) // false

    println('t' in "Kotlin!") // true
    println('T' in "Kotlin!") // false

    println(isDigit(char = 'a')) // false
    println(isDigit(char = '2')) // true

    println(isNotDigit(char = 'a')) // true
    println(isNotDigit(char = '2')) // false

    println(isLowerCase('a')) // true
    println(isNotLowerCase('a')) // false


}

fun isDigit(char: Char) = char in '0'..'9'
fun isNotDigit(char: Char) = char !in '0'..'9'


fun isLowerCase(char: Char) = char in 'a'..'z'
fun isNotLowerCase(char: Char) = char in 'A'..'Z'
