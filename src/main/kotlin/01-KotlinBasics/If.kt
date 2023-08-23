package `01-KotlinBasics`

fun main() {
    ageRestriction(age = 18)
}

fun ageRestriction(age: Int){
    if (age < 18) println("Access Denied!")
    if (age >= 18) println("Access Approved!")
}

fun checkNumSign(number: Int): String {
    return if (number > 0){
        "positive"
    } else if (number < 0){
        "Negative"
    } else {
        "Zero"
    }
}