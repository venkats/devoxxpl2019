fun nickName(name: String): String? {
  if(name == "Robert")
    return "Bob"
    
  return null
}

fun printIt(name: String, nickName: String?) {
  println("$name's nick name is $nickName has length ${nickName?.length ?: 0}")
}

printIt("Robert", nickName("Robert"))
printIt("Venkat", nickName("Venkat"))
