fun greet(): String { 
  val name = "Joe"
  return "Hello $name" 
}

println(greet())

//return type and return are required for
//multiline function.
//If you don't specify return type, then it is
//Unit (void) and return not needed then.