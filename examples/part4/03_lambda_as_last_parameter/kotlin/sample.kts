//fun foo1(action: (Int) -> Unit, data: Int) {
//  action(data)
//}
//
//foo1({ e -> println(e) }, 5)

fun foo(data: Int, action: (Int) -> Unit) {
  action(data)
}

foo(5, { e -> println(e) })
foo(5) { e -> println(e) }