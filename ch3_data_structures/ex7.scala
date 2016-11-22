/*
 * Can product, implemented using foldRight, immediately halt the recursion and
 * return 0.0 if it encounters a 0.0? Why or why not? Consider how any
 * short-circuiting might work if you call foldRight with a large list.
 * This is a deeper question that we’ll return to in chapter 5.
 */

def product[A] (as: List[A]): A = foldRight(as, 1.0) (_ * _)

// No, cannot halt recursion in the case of a 0.0 present in the list
