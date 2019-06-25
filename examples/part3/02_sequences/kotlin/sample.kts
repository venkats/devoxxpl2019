fun isEven(n: Int): Boolean {
  println("called for $n")
  return n % 2 == 0
}                  

val numbers = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)

//eager evaluation
println(
  numbers
    .filter { e -> isEven(e) }
    .first())
    
//lazy evaluation - efficient
println(
  numbers
    .asSequence()
    .filter { e -> isEven(e) }
    .first())

    