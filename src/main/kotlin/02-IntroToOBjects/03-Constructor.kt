package `02-IntroToOBjects`

// a constructor is used to construct something. A constroctor is a special member function
// that initializes a new object

/*
they are used to pass some information like we used with function parameters
 */
fun main() {
    val person = People(name = "Noli")
    println(person.toString())
}


class People (val name: String = "UNKNOWN") {
    fun getName(){
        println(name)
    }

    override fun toString(): String {
        return name
    }
}

