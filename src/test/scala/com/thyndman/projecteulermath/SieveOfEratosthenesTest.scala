package com.thyndman.projecteulermath

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers._

class SieveOfEratosthenesTest extends AnyFlatSpec {
  behavior of "primeStream"

  it should "find all the primes up to 10" in {
    SieveOfEratosthenes.primeStream().takeWhile(_ < 10) shouldBe
      Stream(2, 3, 5, 7)
  }

  it should "find all the primes up to 20" in {
    SieveOfEratosthenes.primeStream().takeWhile(_ < 20) shouldBe
      Stream(2, 3, 5, 7, 11, 13, 17, 19)
  }

  it should "find all the primes up to 100" in {
    SieveOfEratosthenes.primeStream().takeWhile(_ < 100) shouldBe
      Stream(2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97)
  }
}
