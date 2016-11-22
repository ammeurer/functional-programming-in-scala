/*
 * Our implementation of foldRight is not tail-recursive and will result in
 * a StackOver- flowError for large lists (we say it’s not stack-safe).
 * Convince yourself that this is the case, and then write another general
 * list-recursion function, foldLeft, that is tail-recursive, using the techniques we discussed in the previous chapter.
  * Here is its signature:
 */


def foldLeft[A,B](as: List[A], z: B)(f: (B, A) => B): B =
  as match {
    case Nil => z
    case Cons(h, t) => foldLeft (t, f(z, h)) (f)
  }
