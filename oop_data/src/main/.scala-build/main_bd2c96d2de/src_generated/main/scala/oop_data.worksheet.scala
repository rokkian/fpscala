
package scala



final class oop_data$u002Eworksheet$_ {
def args = oop_data$u002Eworksheet_sc.args$
def scriptPath = """scala/oop_data.worksheet.sc"""
/*<script>*/
val a = 3

// off topic: anonymous objects from traits:
trait SayHello(){
  def greet(): Unit = println("Hellooo!")
}

val helloInstance = new SayHello {} // creates an anonymous class extending SayHello and then instatitates it
helloInstance.greet()

// mixing classes
trait Logger{
  def log(msg: String): Unit = println(s"Log: $msg")
}

class Service
val serviceWithLogger = new Service with Logger
serviceWithLogger.log("service started!")

  // mixing object
object MyApp extends App with Logger{
  log("Application is running.")
}

// companion objects
trait Calculator {
  def add(a: Int, b: Int): Int = a + b
}

object Calculator extends Calculator
Calculator.add(3, 4)

// abs classes contains members which are missing implementtation
// those are called abstract members
// it's not possible to implent objects from abstract classes!
abstract class IntSet:
  // IntSet: Set of integers

  // put x in the set
  def incl(x: Int): IntSet

  // if the set contains the Int
  def contains(x: Int): Boolean

// class extensions
// implementiamo sets come binary trees, ci sono trees empty e trees non-empty
class Empty() extends IntSet:
  def contains(x: Int): Boolean = false
  def incl(x: Int): IntSet = NonEmpty(x, Empty(), Empty())
  def union(s: IntSet): IntSet = s
end Empty

class NonEmpty(elem: Int, left: IntSet, right: IntSet) extends IntSet:
  def contains(x: Int): Boolean =
    if x < elem then left.contains(x)
    else if x> elem then right.contains(x)
    else true

  def incl(x: Int): IntSet =
    if x< elem then NonEmpty(elem, left.incl(x), right)
    else if x > elem then NonEmpty(elem, left, right.incl(elem))
    else this

  // def union(s: IntSet): IntSet = {
  //   left.union(right).union(s).incl(elem)
  // }
end NonEmpty

// eg of implement and override
abstract class Base:
  def foo = 1
  def bar: Int

class Sub extends Base:
  override def foo: Int = 2
  def bar: Int = 3 

val sub = Sub()
sub.foo
sub.bar

// object definition - Singleton
// basta creare una sola istanza di emptySet dato che tutte le istanze della classe sarebbero uguali
// si puo' definire un singleton object
// se una classe e un oggetto hanno lo stesso nome nello stesso sourcefile vengono chiamati companions
object Empty extends IntSet:
  def contains(x: Int): Boolean = false
  def incl(x: Int): IntSet = NonEmpty(x, Empty, Empty)
end Empty

Empty

val b = Empty()
b
b == Empty

// companion object di IntSet
object IntSet:
  def singleton(x: Int) = NonEmpty(x, Empty, Empty)

IntSet.singleton(5).contains(5)

// ----- polimorphism

// immutable linked list (data structure for functional langs)
// made of two building blocks:
//  Nil: empty list
//  Cons: cell containing an element and the remainder of the list
// costruite ricorsivamente aggiungendo cons e Nil
List(1,2,3)
List(List(true, false), List(3))
/*</script>*/ /*<generated>*/
/*</generated>*/
}

object oop_data$u002Eworksheet_sc {
  private var args$opt0 = Option.empty[Array[String]]
  def args$set(args: Array[String]): Unit = {
    args$opt0 = Some(args)
  }
  def args$opt: Option[Array[String]] = args$opt0
  def args$: Array[String] = args$opt.getOrElse {
    sys.error("No arguments passed to this script")
  }

  lazy val script = new oop_data$u002Eworksheet$_

  def main(args: Array[String]): Unit = {
    args$set(args)
    script.hashCode() // hashCode to clear scalac warning about pure expression in statement position
  }
}

export oop_data$u002Eworksheet_sc.script as oop_data$u002Eworksheet

