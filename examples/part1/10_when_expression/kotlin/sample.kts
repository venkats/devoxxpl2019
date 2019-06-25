fun process(input: Any) =
  when(input) { //when as an expression (preferred over statement)
    1 -> "one"
    in 12..19 -> "a teen"
    is String -> "got a string"
    else -> "whatever"
  }

println(process(1))
println(process(15))
println(process("hello"))