// package idealized.scala

// abstract class Boolean extends AnyVal:
//     def ifThenElse[T](t: => T, e: => T): T

//     def && (x: => Boolean): Boolean = ifThenElse(x, false)
//     def || (x: => Boolean): Boolean = ifThenElse(true, x)
//     def unary_!(): Boolean = ifThenElse(false, true)

//     def == (x: Boolean): Boolean = ifThenElse(x, x.unary_!())
//     def != (x: Boolean): Boolean = ifThenElse(x.unary_!(), x)

// object true extends Booolean:
//     def ifThenElse[T](t: => T, e: => T) = t

// object false extends Boolean:
//     def ifThenElse[T](t: => T, e: => T) = e