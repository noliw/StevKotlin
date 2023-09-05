import kotlin.math.pow

fun main() {
    val smallCircle = Circle(5.2)
    val rad = smallCircle.radius // prints 5.2
    val circ = smallCircle.circumference()
    val area = smallCircle.area()
    val diameter = smallCircle.diameter()

    println(
        "\nThe Circle has a radius of ${rad}, a circumference of %.3f, a diameter of $diameter and an area of %.2f".format(
            circ,
            area
        )
    )

    println("\n===========================================================================================================================================\n")
    // ENUMS
    val breed = SchnauzerBreed.GIANT
    println(breed.height)


}

class Circle(var radius: Double) { // circle is a property
    private val pi = 3.14

    fun circumference() = diameter() * pi
    fun area() = 2 * radius.pow(2)
    fun diameter() = 2 * radius

}

enum class SchnauzerBreed (val height: Int) {
    MINIATURE(33),
    STANDARD(47),
    GIANT(65);

    val family = "Schnauzer"

    fun isShorterThan(cm: Int) = height < cm
}

fun describe(breed: SchnauzerBreed) = when (breed) {
    SchnauzerBreed.GIANT     -> "Large"
    SchnauzerBreed.STANDARD  -> "Medium"
    SchnauzerBreed.MINIATURE -> "Small"
}