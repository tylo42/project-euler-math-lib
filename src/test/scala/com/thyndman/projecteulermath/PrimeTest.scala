package com.thyndman.projecteulermath

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers._

class PrimeTest extends AnyFlatSpec {
  behavior of "Prime.primes"

  it should "find all the primes up to 10" in {
    Prime.primes.takeWhile(_ < 10) shouldBe
      Stream(2, 3, 5, 7)
  }

  it should "find all the primes up to 20" in {
    Prime.primes.takeWhile(_ < 20) shouldBe
      Stream(2, 3, 5, 7, 11, 13, 17, 19)
  }

  it should "find all the primes up to 100" in {
    Prime.primes.takeWhile(_ < 100) shouldBe
      Stream(2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97)
  }

  behavior of "Prime.is"

  it should "return true for primes" in {
    Prime.is(2) shouldBe true
    Prime.is(3) shouldBe true
    Prime.is(5) shouldBe true
    Prime.is(7) shouldBe true
  }

  it should "return false for non-primes" in {
    Prime.is(1) shouldBe false
    Prime.is(4) shouldBe false
    Prime.is(6) shouldBe false
    Prime.is(8) shouldBe false
    Prime.is(9) shouldBe false
  }

  it should "return false for 0" in {
    Prime.is(0) shouldBe false
  }

  it should "return false for negative" in {
    Prime.is(-1) shouldBe false
    Prime.is(-2) shouldBe false
    Prime.is(-4) shouldBe false
    Prime.is(-8) shouldBe false
  }
}
