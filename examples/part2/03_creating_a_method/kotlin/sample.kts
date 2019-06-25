class Car(val year: Int, var miles: Int = 0) {
  infix fun drive(dist: Int) {
    miles += dist
  }
}

val car = Car(2019, 100)
println(car.miles)

car.drive(10)     

car drive 10

println(car.miles)