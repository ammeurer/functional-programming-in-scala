/*
 * Use flatMap to implement filter.
 */

def filter[A](as: List[A])(f: A => Boolean) =
  flatMap(as)((a => if (f(a)) List(a)) else Nil)
