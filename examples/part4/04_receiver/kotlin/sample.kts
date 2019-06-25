val func: String.(String) -> String =
  { name: String -> "$this $name" }

println(func("Hello", "Sara")) //Just like call in JavaScript
println("Hello".func("Sara"))