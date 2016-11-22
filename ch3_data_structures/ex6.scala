/*
 * Not everything works out so nicely. Implement a function, init, that returns
 * a List consisting of all but the last element of a List. So, given List(1,2,3,4),
 * init will return List(1,2,3). Why can’t this function be implemented in constant
 * time like tail?
 */

def init[A] (l: List[A]): List[A] =
  l match {
    case Nil => sys.error("Empty List!")
    case Cons(_, Nil) => Nil
    case Cons(h, t) => Cons(h, init(t))
  }

