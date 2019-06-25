import kotlinx.coroutines.*

fun task() {
  println("Running in ${Thread.currentThread()}")
}

runBlocking {
  task()
  println("started in ${Thread.currentThread()}")
}