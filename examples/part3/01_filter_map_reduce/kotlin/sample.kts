val numbers = listOf(1, 2, 3, 4, 5, 6)

//println(numbers.filter { e -> e % 2 == 0 })

println(numbers.filter { it % 2 == 0 }
  .map { it * 2 }
  .sum())