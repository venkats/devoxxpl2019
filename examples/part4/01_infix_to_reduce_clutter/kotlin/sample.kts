class Pizza {
  infix fun spread(topping: String) {
    println("spread $topping")
  }
}

val pizza = Pizza()

pizza spread "sauce"
pizza spread "cheese"
