package `02-IntroToOBjects`

import `01-KotlinBasics`.sumOfTwoNumbs
import kotlin.random.Random


// lists are ordered collection of items

fun main() {
    val number = listOf(1,2,3,4,5)
    println(number) // Prints the list -> [1, 2, 3, 4, 5]
    println(number[0]) // Prints element at index 0 -> 1
    println(number.first()) // Prints the first element -> 1
    println(number.last()) // Prints the last element -> 5
    println(number.take(n = 3)) // Prints part of a list -> [1,2,3]

    println(count(list = number, number =2))

    println("\n ============== MUTABLE LISTS ========== \n")
    // Mutable list
    val num2 = mutableListOf<Int>()
    println(num2)

    num2.addAll(listOf(1,2,3,4,5)) // adds a new list to the num2 variable
    println(num2)

    num2.add(element = 6) // adds the value of  the end of the list
    println(num2)

    num2.remove(3) // removes the element with the value of 3
    println(num2)

    num2.add(index = 0, element = 101) // adds 101 at index 0
    println(num2)

    num2.clear() // removes everything from the list
    println(num2)

    val result = createList()
    println(result)


    var myList = listOf(1,2,3)
    println(myList)
    myList += 4
    println(myList)
}


fun count(list: List<Int>, number: Int): Int {
    var occurrences = 0
    for(e in list){
        if (number == e) {
            occurrences++
        }
    }
    return occurrences
}


fun createList (): List<Int> {
    val numbers = mutableListOf<Int>()
    for (num in 0 until 10){
        numbers.add(element = Random.nextInt(from = 0, until = 100))
    }
    return numbers
}