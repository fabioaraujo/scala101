case class Customer (first : String = "",
                     middle: Option[String] = None,
                     last:String = "")

def getMiddleName(value: Option[String]):String = {
  value match {
    case Some(middleName) => middleName
    case None => "No middle name"
  }
}

val martin = new Customer(first="Martin", last="Odersky")

getMiddleName(martin.middle)

val customer = new Customer(first="Martin", Option("Middle"), "Odersky")

getMiddleName(customer.middle)

val nome = Option("Martin")

nome.map(name => println("Yay, " + name))

nome.foreach(name => println("Yay, " + name))

None.foreach(name => println("Yay, " + name))



