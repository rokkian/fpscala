



final class func_classes$u002Eworksheet$_ {
def args = func_classes$u002Eworksheet_sc.args$
def scriptPath = """func_classes.worksheet.sc"""
/*<script>*/
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
    var model1 : String = "S350"
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

/*</script>*/ /*<generated>*/
/*</generated>*/
}

object func_classes$u002Eworksheet_sc {
  private var args$opt0 = Option.empty[Array[String]]
  def args$set(args: Array[String]): Unit = {
    args$opt0 = Some(args)
  }
  def args$opt: Option[Array[String]] = args$opt0
  def args$: Array[String] = args$opt.getOrElse {
    sys.error("No arguments passed to this script")
  }

  lazy val script = new func_classes$u002Eworksheet$_

  def main(args: Array[String]): Unit = {
    args$set(args)
    script.hashCode() // hashCode to clear scalac warning about pure expression in statement position
  }
}

export func_classes$u002Eworksheet_sc.script as func_classes$u002Eworksheet

