
/**
  * Write a function that accepts two lists and constructs a new list by adding
  * correspond- ing elements. For example, List(1,2,3) and List(4,5,6) become List(5,7,9).
  * @param l1
  * @param l2
  * @tparam A
  * @return
  */

def addLists[A](l1: List[A], l2: List[A]): List[A] = (l1, l2) match {
  case (Nil, _) => Nil
  case (_, Nil) => Nil
  case (Cons(h1, t1), Cons(h2, t2)) => Cons(h1 + h2, addLists(t1, t2))
}
