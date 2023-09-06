// a list is ordered, it goes from first to last
// items in a list are called elements
// In kotlin, once a list is created, it can't be changed ==> its called an immutable list
// they can have duplicates

fun main() {
    var booksToRead = listOf(
        "Tea with Agatha",
        "Mystery on first ave",
        "THe Ravine of Sorrows",
        "Among the Aliens",
        "The king",

        )

    // this just makes a new list without modifying the original
    // one, basically like making a new list with a new name that contains the elements
     val newBooks = booksToRead + "Beyond the Expanse"

    // by changing from val to var, it does the same thing as the line above,
    // this  is basically like trashing the old paper and giving the new list the same name as the old one
    booksToRead += "Beyond the Expanse"

    // this removes this book, we can chain this line of code to the one above
     booksToRead -= "Among the Aliens"







// we can use mutable lists instead
    val booksToRead2 = mutableListOf(
        "Tea with Agatha",
        "Mystery on first ave",
        "The Ravine of Sorrows",
        "Among the Aliens",
        "The king",

        )

    // to add an element
    booksToRead2.add("Beyond the Expanse")
    // to remove an element
    booksToRead2.remove("Among the Aliens")
    // to get an element
    val thirdBook = booksToRead2[2] // alternatively we can use .get(2)

    // iterating over lists use the forEach and change this list
    booksToRead2.forEach { book -> println(book) } // alternatively we can use it booksToRead2.forEach { println(it) }
    // or even booksToRead2.forEach(::println)
    println("\n+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++")
    println("Collection operation")
    // mapping collections: Converting Elements
    println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++\n")


    val booksForNolan = booksToRead2
        .map { book -> book.removePrefix("The ") }// using map() to make a copy of the list and make edits
        .sorted() // sorted() sorts a list in alphabetical order
        .filter { book -> book.contains("Mystery") } // filter() filters out the elements you want,also makes a new copy
        .forEach(::println)




}

