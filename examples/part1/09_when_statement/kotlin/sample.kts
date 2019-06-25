fun process(input: Any) {
  when(input) { //when as a Statement (least preferred)
    1 -> println("one")
    in 12..19 -> println("a teen")
    is String -> println("got a string")
  }
}

process(1)
process(15)
process("hello")