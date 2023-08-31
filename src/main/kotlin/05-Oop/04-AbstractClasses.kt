package `05-Oop`

import com.sun.org.apache.xalan.internal.xsltc.compiler.util.Util.println

/* Think of an abstract class as a cookie cutter for making cookies, but the cookie cutter is missing some parts. 🍪

Imagine you have an abstract cookie cutter that only shapes the edges of the cookie but doesn't put any pattern or
design in the middle. That's what an "abstract class" is like in programming.
It gives you some parts of what every cookie (or object) should have, but it leaves some parts unfinished.
 */
fun main() {

}

abstract class Animaux { // abs classes are alway open
    abstract val name: String
    protected var energy = 0
    open fun speak() = "Wof!"
    abstract fun eat ()
}
class Chien: Animaux(){
    override val name = "Rex"
    override fun speak() = "Wof Wof!"
    override fun eat() {
        energy += 5
    }
}

abstract class PersonA(private val name: String) {
    open fun name(){
        println(name)
    }
}

interfac
}

}