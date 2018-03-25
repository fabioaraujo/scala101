case class Customer (first: String = "")

val myNums = 1 to 3

myNums.map(i => (1 to i).map(j => i * j))

myNums.flatMap(i => (1 to i).map(j => i * j))

for {
  i <- myNums
  j <- 1 to i
} yield i * j

myNums.withFilter(i => i % 2 == 1).flatMap(i => (1 to i).map(j => i * j))

for {
  i <- myNums if i % 2 == 1
  j <- 1 to i
} yield i * j

def isCustomer(someValue : Any): Boolean = {
  someValue match {
    case cust : Customer => true
    case _ => false
  }
}

isCustomer("")

isCustomer(new Customer())

val tuple = (1, "a", 2, "b")

val (first, second, third, fourth) = tuple