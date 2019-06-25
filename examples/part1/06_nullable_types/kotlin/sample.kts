fun nickName(name: String): String? {
  if(name == "Robert")
    return "Bob"
    
  return null
}

val robertsNickName = nickName("Robert")
println(robertsNickName)

val venkatsNickName = nickName("Venkat")
println(venkatsNickName)