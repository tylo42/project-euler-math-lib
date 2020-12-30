package com.thyndman.projecteulermath

/**
  * A quick way to find primes (@see https://en.wikipedia.org/wiki/Sieve_of_Eratosthenes)
  */
object SieveOfEratosthenes {
  def primeStream(): Stream[Int] = {
    primeStreamRecursive(Stream.from(2))
  }

  private def primeStreamRecursive(stream: Stream[Int]): Stream[Int] = {
    stream.head #:: primeStreamRecursive(stream.tail)
      .filter(isDivisible(stream.head))
  }

  private def isDivisible(divisor: Int)(numerator: Int): Boolean = {
    numerator % divisor != 0
  }
}
