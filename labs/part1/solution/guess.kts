fun playGuess(target: Int, attempts: Int = 1) {
  print("Your guess:")
  System.out.flush()
  val guess = readLine()?.toInt() ?: 0
  
  when {
    guess < target -> println("Aim high")
    guess > target -> println("Aim low")
    else -> println("You got it in $attempts attempts!")
  }
  
  if(guess != target) playGuess(target, attempts + 1)
}
                                        
println("I've picked a number beween 0 and 100, can you guess it?")
playGuess((Math.random() * 100).toInt())