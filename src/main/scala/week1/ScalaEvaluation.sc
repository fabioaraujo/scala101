def test(x: Int, y: Int) = x * x

test(2, 3)

test(3 + 4, 8)

test(7, 2 * 4)

test(3 + 4, 2 * 4)

//Exemplo pratico da diferença entre o callByValue e callByName
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
//Aqui a função something é chamada e passamos o seu resultado para o método
callByValue(something())
//Aqui a função something é passada como parâmetro e dentro do código será chamada duas vezes
callByName(something())



//Função que substitui a utilização do && em validações de boleanos
def and(x: Boolean, y: => Boolean) = if (x) y /*return*/ else false /*return*/

and(false, true)

val t: Boolean =
  if (true)
    true //return
  else
    false //return

//var loop: Boolean = loop

//and(true, loop)

