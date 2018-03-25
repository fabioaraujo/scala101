val numeros = 1 to 5

numeros.map(n => n + 1)

numeros.map(_ + 1)

val lista = List("Scala", "Python", "R", "SQL")

lista.map(lang => lang + "#")

lista.flatMap(lang => lang + "#")

lista.filter(lang => lang.contains("S"))

lista.map(println)

lista.foreach(println)

lista.forall(lang => lang.contains("S"))

numeros.reduce((acc, cur) => acc + cur)

numeros.reduce(_ + _)

numeros.foldLeft(0){case (acc, cur) => acc + cur}

numeros.product

numeros.exists(num => num == 3)

numeros.exists(num => num == 6)

numeros.find(num => num == 3)

numeros.find(num => num == 6)

numeros.groupBy(num => num %2)

numeros.takeWhile(num => num < 3)

numeros.dropWhile(num => num < 3)

