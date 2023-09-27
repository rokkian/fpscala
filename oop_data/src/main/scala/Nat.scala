package nat

abstract class Nat:
  def isZero: Boolean
  def predecessor: Nat
  def successor: Nat
  def + (that: Nat): Nat
  def - (that: Nat): Nat
end Nat

// object Zero extends Nat:
//     def isZero: Boolean = true
//     def predecessor: Nat = Unit
//     def successor: Nat = Unit

// class Succ(n: Nat) extends Nat:
    

