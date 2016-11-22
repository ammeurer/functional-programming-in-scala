/*
 * Write a function filter that removes elements from a list unless they satisfy
 * a given predicate. Use it to remove all odd numbers from a List[Int].
 */

def filter[A](as: List[A]) (f: A => Boolean): List[A] = {
  val buf = new collection.mutable.ListBuffer[A]

  def go(List[A]) = {
    as match {
      case Nil => ()
      case Cons (h, t) => if (f(h)) buf += h; go(t)
    }
  }
  go(as)

  List (buf.toList: _*) // converting from the standard Scala list to the list we've defined here

}
