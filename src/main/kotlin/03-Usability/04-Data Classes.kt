package `03-Usability`

/*
Imagine you have a small backpack that you use only for carrying your pencils, erasers, and a ruler.
This backpack is special because it has just the right pockets and zippers made especially for these items.
You don't use this backpack for anything else—just for these specific things.

In the same way, a "data class" in Kotlin is a special type of class made just for holding data.
It doesn't have fancy actions or behaviors; it just carries data neatly, like how your small backpack neatly holds your pencils,
erasers, and ruler
 */

// the primary goal of a data class is to hold data
// Rules for data classes:
        // the primary constructor needs to have at least one parameter
        // the params need to be declared with val || vars
        // data classes cannot be open, inner, abstract or sealed
fun main() {
    val person = Person(name = "Noli", age = 27)
    val person2 = Person(name = "Noli", age = 27)
    println(person == person2)
    val person3 = person.copy( age = 30)
    println(person3.toString())

}

data class Person (
    val name: String,
    val age: Int
)