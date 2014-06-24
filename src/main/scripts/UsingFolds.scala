
val res35 = List(1,2,3,4).foldRight(0){(total, next) =>
       println(s"total: $total, next: $next");
       total + next}
// total: 4, next: 0
// total: 3, next: 4
// total: 2, next: 7
// total: 1, next: 9
// res35: Int = 10

val res36 = List(1,2,3,4).foldRight(0){(next, total) =>
            println(s"total: $total, next: $next");
            total + next}

// total: 0, next: 4
// total: 4, next: 3
// total: 7, next: 2
// total: 9, next: 1
// res36: Int = 10
