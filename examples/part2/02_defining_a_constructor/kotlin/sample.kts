class Car(val year: Int, var miles: Int = 0)

//val means read-only property
//var means read-write property
//(blank) means it is a constructor parameter and an internally
//visible variable

val car = Car(2019, 100)
println(car.miles)