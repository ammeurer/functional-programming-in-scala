/*
 * Hard: Write a function that concatenates a list of lists into a single list.
 * Its runtime should be linear in the total length of all lists.
 * Try to use functions we have already defined.
 */

def append[A] (as: List[A], newA: List[A]): List[A] = foldRight(as, newA) (Cons(_,_))

def concat[A] (aOfAs: List[List[A]]): List[A] = foldRight(aOfAs, Nil:List[A]) (append)

