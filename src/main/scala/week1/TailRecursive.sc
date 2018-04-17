def abs(x: Double) = if (x < 0) -x else x

/* Uma função pode ter várias funções dentro de si,
  dessa forma as funções internas serão visiveis apenas dentro daquele escopo,
  organizando o código sem a obrigatoriedade de criar novas classes
 */
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

sqrt(2e60)