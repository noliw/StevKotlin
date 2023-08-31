package `05-Oop`

import java.sql.DriverManager.println

/*
Remember how we talked about a rule book (Interface) that says all robots should be able to "speak" and "move"?
Well, what if almost all robots also need to "dance," but dancing is a bit too tricky to put in the basic rule book?
Or what if some robots can "fly," but not all?

That's where "Inheritance" comes in. It's like a special rule book that only certain types of robots follow.

Imagine there's a SuperRobot rule book that says:

You must know how to "speak."
You must know how to "move."
You must also know how to "dance."
 */
fun main() {
    val dog: Ensesa = Wesha(dogName = "Comet")
    val lion = Anbesa(lionName = "Simba")

    dog.


    dog.showEnergy()
    lion.showEnergy()


}
//Every kt class inherits from the ANY super class

// by default every created class is final : means that you cannot inherit from that class unless you make it open

// open makes this class inheritable: other classes can inherit from this class
// basically saying: Anyone can use this rule book and add more rules.

open class Ensesa(val name: String) {
    protected var energy = 0
     fun eat(){
        energy += 1
    }
     fun run(){
        energy -= 1
    }
    fun showEnergy () {
        println("The current $name has an energy level of: $energy")
    }
}

class Wesha(dogName: String): Ensesa(name = dogName) {
//    override fun eat() {
//        energy += 5
//    }
//
//    override fun run() {
//        energy -= 5
//    }
}

class Anbesa (lionName: String): Ensesa(name = lionName) {
    override fun eat() {
        energy += 10
    }

    override fun run() {
        energy -= 10
    }
}


