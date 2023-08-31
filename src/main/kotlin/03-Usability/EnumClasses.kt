package `03-Usability`

import java.awt.Color

// An enum class is a special class that represents a set of possible values
// they can easily be transformed into a string

/*
Imagine you have a sticker book, and this book is only for "Weather" stickers.
You can't just put any sticker in there; you can only put stickers that represent different types of weather like
"Sunny," "Rainy," "Cloudy," and so on
 */

// No Mistakes: Because you can only use the "stickers" in your special sticker book, you won't accidentally set a mood that doesn't exist.
// Easy to Read
fun main() {
    var priority = Priority.LOW
    println(priority)

    var priority2 = Priority2.HIGH
    println(priority2.color)

    val priority3 = Priority2.valueOf(value = "LOW")
    println(priority3)

    for (pri in Priority2.values()) {
        println(pri.color)
    }
}


enum class Priority {
    LOW,
    MEDIUM,
    HIGH
}

enum class Priority2 (val color: String) {
    LOW(color = "green"),
    MEDIUM(color = "orange"),
    HIGH(color = "red"),
}