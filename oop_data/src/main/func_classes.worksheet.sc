import fansi.Str
// functions as objects
// Scala numeric types and the boolean type can be implemented like normal classes
// what about functions?
// functions values are treated as objects in Scala
// the function type A => B is an abbreviation for the class scala


//package scala
trait Function1[A, B]{def apply(x: A): B}
// => le funzioni sono oggetti con metodi apply 

// anonymous functions
(x: Int) => x * x
// equals
new Function1[Int, Int]:
    def apply(x: Int): Int = x * x

println("Compiles!")





// Classes and traits base eg
trait BMW{
    var make: String = "BMW"
    var model: String = "X7"
    var fuel: Int = 40

    def Display()={
        println(this.make)
        println(this.model)
        println(this.fuel)
    }
}

class Car extends BMW{
    var make1: String = "Mercedes Benz"
    var model1 : Str = "S350"
    var fuel1: Int = 50
    def mercSpecs()={
        println(this.make)
        println(this.model1)
        println(this.fuel1)

    }
}

var obj = new Car()
obj.mercSpecs()
obj.Display()
