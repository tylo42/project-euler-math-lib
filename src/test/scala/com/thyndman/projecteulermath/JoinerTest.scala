package com.thyndman.projecteulermath

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers._

class JoinerTest extends AnyFlatSpec {
  behavior of "Joiner.join"

  it should "join two single digit Ints" in {
    Joiner.join(1, 2) shouldBe 12
  }

  it should "join two double digit Ints" in {
    Joiner.join(12, 98) shouldBe 1298
  }

  it should "join two Longs" in {
    Joiner.join(123456789L, 987654321L) shouldBe 123456789987654321L
  }
}
