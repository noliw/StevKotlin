package `02-IntroToOBjects`


// Public: Classes by default are public when it comes to visibility modifiers
// private: hidden and only accessible for other members of the class
// protected: same as private but is visible in the subclasses
// internal: it is accessible only inside the module where it is defined
fun main() {
    val person = Sew(name = "Nolawi")
    person.getName()
}

private class Sew(private val name: String){
    private val nickname = "Nola"

    fun getName(){
        println("Public : $name")
    }
}