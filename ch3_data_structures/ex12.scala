/*
 * Write a function that returns the reverse of a list (given List(1,2,3) it
 * returns List(3,2,1)). See if you can write it using a fold.
 */

def reverse[A] (as: List[A]): List[A] =
  foldLeft(as, List[A]()) ((h, t) => Cons(h, t))
