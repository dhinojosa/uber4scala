class Employee private (val ssn:String,
                        val firstName:String, 
                        val lastName:String) {
    private def this(firstName:String, lastName:String) =
         this("000-00-0000", firstName, lastName)
}


//It has to be same file
object Employee {
  var count = 0
  // "static" calls
  // "static" variable
  // factories
  // special constructors
  // extractors

  def apply(firstName:String, lastName:String) = {
     count = count + 1
     new Employee(firstName,lastName)
  }

  def apply(ssn:String, firstName:String, lastName:String) = {
     count = count + 1
     new Employee(ssn, firstName, lastName)
  }
}
