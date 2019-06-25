import kotlinx.coroutines.*

fun task() {
  println("Running in ${Thread.currentThread()}")
}

runBlocking {
  launch { task() }
  println("started in ${Thread.currentThread()}")
}