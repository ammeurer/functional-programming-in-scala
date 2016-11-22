/*
 * Write a function to get the th Fibonacci number. The n
 * first two Fibonacci numbers are 0 and 1, and the next number is always the sum of
 * the previous two. Your definition should use a local tail-recursive function.
 */

def getNthFibonacci(n: Int): Int = {
  @annotation.tailrec
  def fib(n: Int, a: Int, b: Int): Int = 
    if (n == 0) a
    else fib(n - 1, b, a + b)
  
  fib(n, 0, 1)
}

def getFib(n: Int): Int = n match {
  case 0 => 0
  case 1 => 1
  case n => getFib(n -1) + getFib(n-2)
}
