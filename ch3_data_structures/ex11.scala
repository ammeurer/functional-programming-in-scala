/*
 * Write sum, product, and a function to compute the length of a list using foldLeft.
 */

def sum (as: List[Int]) = foldLeft(as, 0) (_ + _)

def product(as: List[Int]) = foldLeft(as, 1) (_ * _)

def length[A](as: List[A]): Int = foldLeft(as, 0)((l, _) => l + 1)


