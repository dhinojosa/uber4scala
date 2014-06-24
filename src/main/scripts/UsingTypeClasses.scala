import scala.xml._

case class MyJson(x:String)

implicit val stringToXML = (x:String) => <item>{x}</item>

implicit val stringAsJson = (x:String) => MyJson(s"{item:$x}")

//Overly pedestrian type class

def marshall[T](x:String)(implicit f: String => T) = {
   f(x)
}

println(marshall[Elem]("Hello"))
println(marshall[MyJson]("Hello"))
