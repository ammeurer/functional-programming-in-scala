/*
 * Compute the length of a list using foldRight.
 */

def length[A] (as: List[A]): Int = foldRight(as, 0) ((_, l) => l + 1)
