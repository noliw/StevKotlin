package `02-IntroToOBjects`


// a property maintains a state within a class
fun main() {
    val person1 = Person()
    println(person1.personAge)
    person1.setAge(age = 14)
    println(person1.personAge)

    println("--------------------------------")

    val person2 = Person()
    println(person1.personAge)
    person1.setAge(age = 24)
    println(person1.personAge)

    println("--------------------------------")

    val person3 = Person()
    val person4 = person3

    println(person3.personAge)
    println(person4.personAge)
    person3.setAge(age = 22)
    println(person3.personAge)
    println(person4.personAge)
    println(person3)
    println(person4)


}

class Person {
    var personAge = 0 // this is a property
    fun setAge (age: Int) {
        personAge = age
    }
}