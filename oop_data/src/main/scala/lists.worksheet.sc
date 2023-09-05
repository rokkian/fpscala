//package week3 // deifne a package including this file code

// immutable linked lists
// generics made with the [T]
trait LIST[T]:
    def isEmpty: Boolean
    def head: T
    def tail: LIST[T]

class CONS[T](val head: T, val tail: LIST[T]) extends LIST[T]:
    def isEmpty: Boolean = false

class NIL[T] extends LIST[T]:
    def isEmpty: Boolean = true
    def head = throw new NoSuchElementException("Nil.head")
    def tail = throw new NoSuchElementException("Nil.tail")

// funct che ritorna un singleton del tipo speci 
def singleton[T](elem: T)= CONS[T](elem, NIL[T])

// basically the compiler can induce even if not specified
singleton[Int](1)
singleton(1)
singleton[Boolean](true)
singleton(true)

/**esempio di polimorfismo in FP
    * 
    *
    * @param xs List to be queried
    * @param n Index value of the element to be ectracted
    * @return the element at the given index value
    */
def nth[T](xs: LIST[T], n: Int): T = 
    if xs.isEmpty then throw IndexOutOfBoundsException()
    else if n == 0 then xs.head
    else nth(xs.tail, n-1)

nth(CONS(1, CONS(2, CONS(3, NIL()))), 0)




println("compiles")