package `01-KotlinBasics`

fun main() {
    var chars = printEachLetter("NOlawi")
    println(chars)
}


fun printEachLetter(string: String) {
    var i = 0
    while (i < string.length){
        println(string[i])
        i++
    }
}