object Truck {
  private val actions = StringBuilder()
  
  val left = "left"
  val right = "right"
  val straight = "straight"
  
  infix fun turns(dir: String) {
    actions.append(" turned $dir")
  }
  
  infix fun drives(dir: String) {
    actions.append(" went $dir")
  } 
  
  infix fun operate(block: Truck.(Truck) -> Unit) {
    this.block(this)
    println("Truck$actions")
  }
}
  
Truck operate {        
  it turns left
  it drives straight
  it turns right
}

//Truck turned left went straight turned right