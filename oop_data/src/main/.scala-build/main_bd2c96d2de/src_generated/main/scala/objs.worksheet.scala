
package scala



final class objs$u002Eworksheet$_ {
def args = objs$u002Eworksheet_sc.args$
def scriptPath = """scala/objs.worksheet.sc"""
/*<script>*/
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
/*</script>*/ /*<generated>*/
/*</generated>*/
}

object objs$u002Eworksheet_sc {
  private var args$opt0 = Option.empty[Array[String]]
  def args$set(args: Array[String]): Unit = {
    args$opt0 = Some(args)
  }
  def args$opt: Option[Array[String]] = args$opt0
  def args$: Array[String] = args$opt.getOrElse {
    sys.error("No arguments passed to this script")
  }

  lazy val script = new objs$u002Eworksheet$_

  def main(args: Array[String]): Unit = {
    args$set(args)
    script.hashCode() // hashCode to clear scalac warning about pure expression in statement position
  }
}

export objs$u002Eworksheet_sc.script as objs$u002Eworksheet

