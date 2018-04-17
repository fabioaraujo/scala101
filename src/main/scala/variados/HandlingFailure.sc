import scala.util.{Failure, Success, Try}

def toInt(s: String): Int =
try{
  s.toInt
}catch{
  case _: NumberFormatException => 0
}

toInt("10")

toInt("a")

Try("100".toInt)

Try("Martin".toInt)

def makeInt(s: String): Int = Try(s.toInt) match {
  case Success(n) => n
  case Failure(_) => 0
}

makeInt("35")

makeInt("James")

for{
  language <- Success("Scala")
  behavior <- Success("rocks")
} yield s"$language $behavior"

for{
  language <- Success("Scala")
  behavior <- Success("rocks")
} yield s"$language $behavior"

Success("Scala").map(s => s.reverse)

def getOuch: Try[String] = Failure(new Exception("Ouch"))

val ouch = getOuch

ouch.map(s => s.reverse)


