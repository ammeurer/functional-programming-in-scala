/*
 * Using the same idea, implement the function setHead for replacing the first element
 * of a List with a different value.
 */

def setHead[A] (newHead: A, list: List[A]): List[A] =
  list match {
    case Nil: sys.error("can't set new head on empty list!")
    case Cons(_, t): Cons(newHead, t)
  }
