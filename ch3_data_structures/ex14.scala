/*
 * Implement append in terms of either foldLeft or foldRight.
 */

def append[A] (as: List[A], newA: List[A]): List[A] = foldLeft(as, newA) (Cons(_,_))
