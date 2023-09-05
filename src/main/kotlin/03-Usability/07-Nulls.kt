package `03-Usability`

fun main() {
    val saraReview = CoffeeReview(name = "Sara", comment = "Amazing!", rating = 5)
    val tobyReview = CoffeeReview(name = "Toby", comment = "Loved It!", rating = 4)
    val lucyReview = CoffeeReview(name = "Lucy", comment = "Great!", null)
    println("\n------------------")
    println("Todays Reviews!!!")
    println("------------------")
    printReviews(saraReview)
    printReviews(tobyReview)
    printReviews(lucyReview)

}

class CoffeeReview (
    val name: String,
    val comment: String?,
    val rating: Int?,
)

fun printReviews(review: CoffeeReview) = println("${review.name} says '${review.comment}' and has given it ${review.rating} stars!")