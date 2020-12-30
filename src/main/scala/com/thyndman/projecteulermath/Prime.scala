package com.thyndman.projecteulermath

object Prime {
  def is(i: Long): Boolean =
    if (i < 2) false
    else if (i == 2) true
    else if ((i & 1) == 0) false // efficient div by 2
    else isOddPrime(i)

  def primes: Stream[Long] = 2 #:: buildStreamOfOddPrimes

  private val buildStreamOfOddPrimes: Stream[Long] = {
    @annotation.tailrec
    def nextPrime(i: Long): Long =
      if (isOddPrime(i)) i else nextPrime(i + 2) // tail

    def next(i: Long): Stream[Long] =
      i #:: next(nextPrime(i + 2))

    3 #:: next(5)
  }

  private def isOddPrime(i: Long): Boolean = {
    val sqrt = math.sqrt(i)
    buildStreamOfOddPrimes.takeWhile(sqrt.>=).forall(i % _ != 0)
  }
}
