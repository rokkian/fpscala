



final class nat_eg$u002Eworksheet$_ {
def args = nat_eg$u002Eworksheet_sc.args$
def scriptPath = """nat_eg.worksheet.sc"""
/*<script>*/

// Peano logic numbers
abstract class Nat:
  def isZero: Boolean
  def predecessor: Nat
  def successor: Nat
  def + (that: Nat): Nat
  def - (that: Nat): Nat
end Nat

object Zero extends Nat:
    def isZero: Boolean = true
    def predecessor: Nat = ???
    def successor: Nat = Succ(this)
    def + (that: Nat): Nat = that
    def -(that: Nat): Nat = if that.isZero then this else ???
    override def toString: String = "Zero"

class Succ(n: Nat) extends Nat:
    def isZero: Boolean = false
    def predecessor: Nat = n
    def successor: Nat = Succ(this)
    def +(that: Nat): Nat = Succ(n + that)
    def -(that: Nat): Nat = if that.isZero then this else n - that.predecessor
    override def toString(): String = s"Succ($n)"
end Succ
    
extension (n: Nat)
    def value(x: Int): Int = x

val two = Succ(Succ(Zero))
val one = Succ(Zero)
two + one
one.isZero
two - one
one - one
//one - two
/*</script>*/ /*<generated>*/
/*</generated>*/
}

object nat_eg$u002Eworksheet_sc {
  private var args$opt0 = Option.empty[Array[String]]
  def args$set(args: Array[String]): Unit = {
    args$opt0 = Some(args)
  }
  def args$opt: Option[Array[String]] = args$opt0
  def args$: Array[String] = args$opt.getOrElse {
    sys.error("No arguments passed to this script")
  }

  lazy val script = new nat_eg$u002Eworksheet$_

  def main(args: Array[String]): Unit = {
    args$set(args)
    script.hashCode() // hashCode to clear scalac warning about pure expression in statement position
  }
}

export nat_eg$u002Eworksheet_sc.script as nat_eg$u002Eworksheet

