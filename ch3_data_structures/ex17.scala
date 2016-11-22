/*
 * Write a function that turns each value in a List[Double] into a String.
 * You can use the expression d.toString to convert some d: Double to a String.
 */

def doubleToString(ds: List[Double]) = foldRight(ds, Nil:List[String]) ((h, t) => Cons(h.toString(), t))
