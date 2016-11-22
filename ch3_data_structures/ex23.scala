/**
  * Generalize the function you just wrote so that it’s not specific to integers or addition.
  * Name your generalized function zipWith.
  * @param l1
  * @param l2
  * @param f
  * @tparam A
  * @return
  */

def zipWith[A,B,C](l1: List[A], l2: List[B])(f: (A, B) => C) = (l1, l2) match {
  case (Nil, _) => Nil
  case (_,Nil) => Nil
  case (Cons(h1, t1), Cons(h2, t2)) => Cons(f(h1, h2), zipWith(t1, t2))
}
