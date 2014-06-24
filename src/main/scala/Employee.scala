class Employee(val firstName:String, val lastName:String)

object Employee {
   def unapply(x:Employee):Option[(String, String)] = Some((x.firstName, x.lastName))
}


