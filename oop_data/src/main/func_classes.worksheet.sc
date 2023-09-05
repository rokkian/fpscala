// functions as objects
// Scala numeric types and the boolean type can be implemented like normal classes
// what about functions?
// functions values are treated as objects in Scala
// the function type A => B is an abbreviation for the class scala

//package scala
trait Function1[A, B]:
    def apply(x: A): B

// => le funzioni sono oggetti con metodi apply 

// anonymous functions
(x: Int) => x * x
// equals
new Function1[Int, Int]:
    def apply(x: Int): Int = x * x

println("Compiles!")