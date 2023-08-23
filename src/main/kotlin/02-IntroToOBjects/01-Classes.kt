package `02-IntroToOBjects`

// objects are used to store data using properties and perform operations with that data using functions

// classes are blueprints

fun main() {
    val house = House() // this variable represents an object of the house class
    val house2 = House()

    println(house) // IntroToOBjects.House@7b23ec81 this is the address where the object is located
    println(house2) // IntroToOBjects.House@6acbcfc0 notice how it is stored in different locations

    println(house.enter())


}

class House () {
    fun enter() = "Entering the house.."  // this is called a member function because it belongs to that class specifically
}