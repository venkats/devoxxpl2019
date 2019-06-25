class Car(val year: Int, initialMiles: Int = 0) {
  var miles: Int = initialMiles
    get() {
      println("called...")
      return field
    }             
    private set(value) {   
      println("set called...")
      if(value < miles) {
        throw RuntimeException("you are setting to a lower value, how dare, we will come burn your village")
      }
      field = value
    }
  
  infix fun drive(dist: Int) {
    miles += dist
  }
}

val car = Car(2019, 100)
println(car.miles)

car.drive(10) 

//car.miles = 3     //ERROR because setter is private

println(car.miles)