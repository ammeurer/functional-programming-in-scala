/*
 * Write a function flatMap that works like map except that the function
 * given will return a list instead of a single result, and that list should
 * be inserted into the final resulting list. Here is its signature:
 *
 * For instance, flatMap(List(1,2,3))(i => List(i,i)) should result in
 * List(1,1,2,2,3,3).
 */

def foldRight[A, B](as: List[A], z: B)(f: (A, B) => B): B =
  as match {
    case Nil => z
    case Cons(h,t) => f(h, foldRight(t, z)(f))
  }
def append[A](a1: List[A], a2: List[A]): List[A] =
  a1 match {
    case Nil => a2
    case Cons(h,t) => Cons(h, append(t, a2))
  }

def concat[A](l: List[List[A]]): List[A] =
  foldRight(l, Nil:List[A])(append)

def map[A,B](as: List[A])(f: List[A] => List[B]): List[B] =
  foldRight(as, Nil:List[B])((h,t) => Cons(f(h),t))

def flatMap[A,B](as: List[A])(f: A => List[B]): List[B] = {
  concat(map(as)(f))
}
