package `01-KotlinBasics`

fun main() {
    val element = listOf("A", "B")
    for (e in element){
        println("Current Element: $e")
    }

    for (number in 1..3){
        println("Current number: $number")
    }

    var range1 = 1..10
    var step = 1..10 step 2
    var range2 = 1 until 10
    var range3 = 10 downTo  0
    var chars = 'a'..'z'

}