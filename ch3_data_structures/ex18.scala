/*
 * Write a function map that generalizes modifying each element in a list while maintain-
 * ing the structure of the list. Here is its signature:
 */

def map[A,B](l: List[A])(f: A => B): List[B] = {
  val buf = new collection.mutable.ListBuffer[ B ]

  def go (l: List[ A ]): Unit = l match {
    case Nil => ()
    case Cons (h, t) => buf += f (h); go (t)
  }

  go (l)

  List (buf.toList: _*) // converting from the standard Scala list to the list we've defined here
}
