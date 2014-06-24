object Runner2 {
  def main(args:Array[String]) {
    Employee("Paul", "Hamm")
    Employee.apply("Paul", "Hamm")
    println(Employee.count)
  }
}
