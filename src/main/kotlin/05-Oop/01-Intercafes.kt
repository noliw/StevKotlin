package `05-Oop`

// an interfaces describes what a class should do but not how it should do
// it specifies and objects action without much details on how those actions are formed

/*  Alright, let's imagine you have a bunch of toy robots.
 All these robots can do different things: some can walk, some can talk, and some can even dance!
Now, let's say you want to make sure that every robot you build in the future can at least do some basic things like "speak" or "move."
How do you make sure of that? You could create a list of actions that every robot has to follow, right?

In programming, especially in Kotlin, this list is called an "Interface."
An Interface is like a rule book that says, "Hey, if you're a robot, you have to know how to do these things!"*/


fun main() {
    val dog = Dog()
    val cat = Cat(color = "White")
}




interface Animal {
    val legs: Int

    //    val color: String get() = "Black"
    val color: String
    fun speak(): String
    fun walk(): Int {
        var steps = 0
        for (step in 0..20) {
            steps += step
        }
        return steps
    }
}


class Dog : Animal {
    override val legs: Int =
        4 // override? That mean Dog is saying, "Okay, I know the rules from the Robot Interface, and here's how I do them!"
    override val color: String = "Black"
    override fun speak(): String = "Wof!!"

}

class Cat(override val color: String) : Animal {
    override val legs: Int = 4
    override fun speak(): String = "MEOWWW!!"
}

// SAM single abstract method
// Functional interface

fun interface Person {
    fun eyeColor(): String // fun interfaces must have exactly one abstract method
}