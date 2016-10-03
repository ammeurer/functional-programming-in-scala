/*
* Implement isSorted, which checks whether an Array[A] is
* sorted according to a given comparison function.
*/

def isSorted[A](as: Array[A], gt: (A, A) => Boolean): Boolean = {
  @annotation.tailrec
  def sorted(iter: Int): Boolean = {
    if (iter == 0) true
    else {
      if (gt(as(iter), as(iter - 1))) sorted(iter - 1)
      else false
    }
  }
  sorted(as.length - 1)
}

def isSorted2[A](as: Array[A], gt: (A, A) => Boolean): (Boolean, A) = {
  as.foldLeft((true, None)((mem, a) => (mem._1 && mem._2 map gt(a, _) getOrElse true, a)
