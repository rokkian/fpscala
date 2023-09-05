println(util.Properties.versionNumberString)

// the primary constructor by default runs all the needed functions and methods in the body (eg requires, vals, defs..)
// auxiliary constructors are created with methods named 'this'
class Rational(x: Int, y: Int):
    require(y > 0, s"denom must be positive!! was $x/$y")

    private def gcd(a: Int, b: Int): Int =
        if b == 0 then a else gcd(b, a % b)

    def this(x: Int) = this(x, 1) // auxiliary constructor
    val numer = x
    val denom = y // ricorda che la differenza tra def e val e' che val viene caolcolato una volta sola, mentre def viene ricalcolato ogni volta chiamato

    def value: Double = x.toDouble / y.toDouble

    def add(r: Rational)=
        new Rational(((numer * r.denom)+(r.numer * denom)),  (denom * r.denom))

    def mul(r: Rational)=
        new Rational(numer * r.numer, denom * r.denom)

    def neg =
        new Rational(- numer, denom)
    def sub(r: Rational) =
        add(r.neg)

    def less(that: Rational): Boolean =
        numer * that.denom < that.numer * denom

    def max(that: Rational): Rational =
        if this.less(that) then that else this

    override def toString: String = s"${numer/ gcd(x.abs, y)}/${denom/ gcd(x.abs, y)}"
end Rational

// extension methods:
// aggiunge un pezzo di codice con metodi alla classe indicata
// si possono aggiungere in moduli diversi, in modo indipendente
// sono visibili quando in scope
// possono solo aggiungere nuovi metodi, no overrides
// non possono riferirsi agli altri class menmers using 'this'
extension (r: Rational)
    def min(s: Rational): Rational = if s.less(r) then s else r
    def abs: Rational = Rational(r.numer.abs, r.denom)

extension (r: Rational)
    def + (y: Rational): Rational = x.add(y)
    def - (y: Rational): Rational = x.sub(y)
    def * (y: Rational): Rational = x.mul(y)

// infix notation
extension (x: Rational)
    infix def <(that: Rational): Boolean = x.less(that)
    infix def lesser(that: Rational): Boolean = x.less(that)

new Rational(-2, 3).abs

assert(3 > 0, "not ok!!") // asserts are for assurance of good implementation of functions, require are for assurance on inputs

new Rational(1,2).add(new Rational(1,2)).toString
new Rational(1,2).mul(new Rational(1,2)).toString
new Rational(45,2).mul(new Rational(1,2)).toString

val x = new Rational(1,3)
val y = new Rational(5,7)
val z = new Rational(3,2)

// same infixi operation
y < z
y.<(z)
y lesser z

new Rational(6, 3).numer
new Rational(6, 3).denom
new Rational(6, 3).toString

x.sub(y).sub(z)
x.less(y)
x.max(y)


z.neg
z.sub(x)
x.sub(y).sub(z)

x.add(y).mul(z)

// functions of Rationals
def addRational(x: Rational, y: Rational): Rational =
    new Rational(((x.numer * y.denom)+(y.numer * x.denom)),  (x.denom * y.denom))

def subRational(x: Rational, y: Rational): Rational =
    new Rational(((x.numer * y.denom)-(y.numer * x.denom)),  (x.denom * y.denom))

val ar = new Rational(1, 2)
val br = new Rational(2,3)

ar.value
ar.numer
ar.toString
(addRational(ar, br).numer, addRational(ar, br).denom, addRational(ar, br).value)

val s = 4
s.toDouble

print("daje")
val j = new Rational(3,2)


