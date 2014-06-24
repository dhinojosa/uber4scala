//def gab(x: (String, Int) => Tuple3[String, Int, Double]):Int 

// or 

def gab(x: (String, Int) => (String, Int, Double)):Int = {
         x("Bob", 3)._2
      }
// gab: (x: (String, Int) => (String, Int, Double))Int

val f = (x:String, y:Int) => (x+" Hi", y + 4, y.toDouble + 10)
// f: (String, Int) => (String, Int, Double) = <function2>

gab(f)
//Int = 7

