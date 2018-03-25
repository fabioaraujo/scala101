1 to 10

val lista = List(1, 2, 3, 4, 5)

lista :+ 0

6 +: lista

lista(1)

val listSet = Set(1,2 ,3, 4)

listSet.getClass

listSet(2)

listSet(4)

listSet(5)

val jamie = Option("Jamie")
jamie.get

val none = Option(null)

none.getOrElse("Foo")

val tuple = Tuple2(1, "a")

(1, "a", "2")

tuple._1

(2 -> "b")

(3 -> "b" -> 4)

val numeros = 1 to 6
val letras = 'a' to 'g'

letras(2)

numeros.zip(letras)

val map = Map (1 -> "a", 2 -> "b")

map.get(9)

map.getOrElse(1, "z")

map.getOrElse(9, "z")

map(9)