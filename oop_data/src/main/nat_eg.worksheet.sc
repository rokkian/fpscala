
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