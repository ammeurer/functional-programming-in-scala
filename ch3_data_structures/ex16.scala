/*
 * Write a function that transforms a list of integers by adding 1 to each element.
 * (Reminder: this should be a pure function that returns a new List!)
 */

def addOne(l: List[Int]): List[Int] = l.foldLeft(List[Int]())((_, _) => List(_, _ + 1)
