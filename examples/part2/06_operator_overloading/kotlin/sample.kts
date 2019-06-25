class MyClass {
  operator fun plus(other: MyClass): MyClass {
    println("called...")
    return this
  }
}

val obj = MyClass()
println(obj + obj)