def test(x: Int, y: Int) = x * x

test(2, 3)

test(3 + 4, 8)

test(7, 2 * 4)

test(3 + 4, 2 * 4)

def something() = {
  println("calling something")
  1 // return value
}

def callByValue(x: Int) = {
  println("x1=" + x)
  println("x2=" + x)
}

def callByName(x: => Int) = {
  println("x1=" + x)
  println("x2=" + x)
}

callByValue(something())

callByName(something())


def and(x: Boolean, y: => Boolean) = if (x) y /*return*/ else false /*return*/

and(false, true)

val t: Boolean =
  if (true)
    true //return
  else
    false //return

//var loop: Boolean = loop

//and(true, loop)

def abs(x: Double) = if (x < 0) -x else x

def sqrt(x: Double) = {
  def sqrtIter(guess: Double): Double =
    if (isGoodEnough(guess))
      guess //return
    else
      sqrtIter(improve(guess)) //return

  def isGoodEnough(guess: Double) = abs(guess * guess - x) / x < 0.001

  def improve(guess: Double) = abs(guess + x / guess) / 2

  sqrtIter(1.0)
}

sqrt(9)
"Teste"
sqrt(2e60)

