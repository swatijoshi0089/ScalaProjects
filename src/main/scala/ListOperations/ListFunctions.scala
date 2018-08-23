package ListOperations

object ListFunctions {
  def prettyPrintList(l: List[Any]) = {
    println("----------------")
    l.foreach(println)
  }

  def multiplyByTen(list: List[Int]): List[Int] =
    //list.map(Int => {Int * 10})
    list.map(_ * 10)

  //def isEven(number: List[Int]): Boolean = number % 2 == 0

  def multiplyByTenEven(list: List[Int]) : Unit ={
    val evens = list.filter(_% 2 == 0)
     println(evens)
    val result : List [Int] = evens.map(_ * 10)
    println(result)
    val odds = list.filterNot(_% 2 == 0)
    println(odds)
    val result2 : List [Int] = odds.map(_ * 100)
    println(result2)
    }
}
