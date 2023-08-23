package `01-KotlinBasics`

fun main() {
    // A string template is a programatic way of generating a string
    val number = 10
    val favNum = "My favorite number is : ${number.toFloat()}"
    println(favNum)

    val about = "dsrfhvskj kjsdvhsdhklv bhb\n " +
            "hbh bhfbdjljvebv jbhjelrehjbdshv bhfdjlfvbh\n " +
            "h bljfkdslfs lkfjrkfj jkjk "

    val about1= """skflhervfkb jkfdbvkfj 
        |dfjkvbfkdjvelfjvjf,f fojvvbdjk fdjkvhdjk 
        |jfkdhfvieuvfbd kdfj dfjkdjk""".trimMargin()
}

fun setAge(age: Int) {
    println(if (age < 18) "Minor" else "Adult")
}