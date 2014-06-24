class Employee(val firstName:String, val lastName:String)

object Employee {
   def unapply(x:Employee):Option[(String, String)] =
        Some((x.firstName, x.lastName))
   def unapply(x:String):Option[(String, String)] = {
        if(!x.contains(",")) None
        else {
          val items = x.split(",").map(_.trim)
          Some(items(1), items(0))
        }
   }
}

val employee = new Employee("Nancy", "Drew")

employee match {
   case Employee(fn, ln) => 
      println(s"We have an Employee named $fn with $ln as the last Name")
   case _ => println("What are talking about")
}

val stringEmployee = "Drew, Nancy"

stringEmployee match {
    case Employee("Nancy", _) => println("Hi Nancy, I'm a Nancy boy")
    case Employee(fn, ln) => 
         println(s"We have an Employee named $fn with $ln as the last Name")
    case _ => println("What are talking about")
}

val Employee(foo, bar) = "Drew, Nancy"
println(foo)
println(bar)

// val Employee(fum, bum) = "Cher"
// println(fum)
// println(bum)

