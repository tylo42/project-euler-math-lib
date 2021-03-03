package com.thyndman.projecteulermath

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers._

class PolygonalNumbersTest extends AnyFlatSpec {

  behavior of "PolygonalNumbers.triangle"

  it should "return the first triangle number" in {
    PolygonalNumbers.triangle(1) shouldBe 1
  }

  it should "return the second triangle number" in {
    PolygonalNumbers.triangle(2) shouldBe 3
  }

  it should "return the third triangle number" in {
    PolygonalNumbers.triangle(3) shouldBe 6
  }


  behavior of "PolygonalNumbers.triangleStream"

  it should "return the first 0 numbers" in {
    PolygonalNumbers.triangleStream.take(0) shouldBe Stream()
  }

  it should "return the first number" in {
    PolygonalNumbers.triangleStream.take(1) shouldBe Stream(1)
  }

  it should "return the first 2 numbers" in {
    PolygonalNumbers.triangleStream.take(2) shouldBe Stream(1, 3)
  }

  it should "return the first 10 numbers" in {
    PolygonalNumbers.triangleStream.take(10) shouldBe Stream(1, 3, 6, 10, 15, 21, 28, 36, 45, 55)
  }


  behavior of "PolygonalNumbers.square"

  it should "return the first square number" in {
    PolygonalNumbers.square(1) shouldBe 1
  }

  it should "return the second square number" in {
    PolygonalNumbers.square(2) shouldBe 4
  }

  it should "return the third square number" in {
    PolygonalNumbers.square(3) shouldBe 9
  }


  behavior of "PolygonalNumbers.squareStream"

  it should "return the first number" in {
    PolygonalNumbers.squareStream.take(1) shouldBe Stream(1)
  }

  it should "return the first 2 numbers" in {
    PolygonalNumbers.squareStream.take(2) shouldBe Stream(1, 4)
  }

  it should "return the first 10 numbers" in {
    PolygonalNumbers.squareStream.take(10) shouldBe Stream(1, 4, 9, 16, 25, 36, 49, 64, 81, 100)
  }

  behavior of "PolygonalNumbers.pentagonal"

  it should "return the first pentagonal number" in {
    PolygonalNumbers.pentagonal(1) shouldBe 1
  }

  it should "return the second pentagonal number" in {
    PolygonalNumbers.pentagonal(2) shouldBe 5
  }

  it should "return the third pentagonal number" in {
    PolygonalNumbers.pentagonal(3) shouldBe 12
  }


  behavior of "PolygonalNumbers.pentagonalStream"

  it should "return the first number" in {
    PolygonalNumbers.pentagonalStream.take(1) shouldBe Stream(1)
  }

  it should "return the first 2 numbers" in {
    PolygonalNumbers.pentagonalStream.take(2) shouldBe Stream(1, 5)
  }

  it should "return the first 10 numbers" in {
    PolygonalNumbers.pentagonalStream.take(10) shouldBe Stream(1, 5, 12, 22, 35, 51, 70, 92, 117, 145)
  }

  behavior of "PolygonalNumbers.hexagonal"

  it should "return the first hexagonal number" in {
    PolygonalNumbers.hexagonal(1) shouldBe 1
  }

  it should "return the second hexagonal number" in {
    PolygonalNumbers.hexagonal(2) shouldBe 6
  }

  it should "return the third hexagonal number" in {
    PolygonalNumbers.hexagonal(3) shouldBe 15
  }


  behavior of "PolygonalNumbers.hexagonalStream"

  it should "return the first number" in {
    PolygonalNumbers.hexagonalStream.take(1) shouldBe Stream(1)
  }

  it should "return the first 2 numbers" in {
    PolygonalNumbers.hexagonalStream.take(2) shouldBe Stream(1, 6)
  }

  it should "return the first 10 numbers" in {
    PolygonalNumbers.hexagonalStream.take(10) shouldBe Stream(1, 6, 15,  28, 45, 66, 91, 120, 153, 190)
  }


  behavior of "PolygonalNumbers.heptagonal"

  it should "return the first heptagonal number" in {
    PolygonalNumbers.heptagonal(1) shouldBe 1
  }

  it should "return the second heptagonal number" in {
    PolygonalNumbers.heptagonal(2) shouldBe 7
  }

  it should "return the third heptagonal number" in {
    PolygonalNumbers.heptagonal(3) shouldBe 18
  }


  behavior of "PolygonalNumbers.heptagonalStream"

  it should "return the first number" in {
    PolygonalNumbers.heptagonalStream.take(1) shouldBe Stream(1)
  }

  it should "return the first 2 numbers" in {
    PolygonalNumbers.heptagonalStream.take(2) shouldBe Stream(1, 7)
  }

  it should "return the first 10 numbers" in {
    PolygonalNumbers.heptagonalStream.take(10) shouldBe Stream(1, 7, 18, 34, 55, 81, 112, 148, 189, 235)
  }


  behavior of "PolygonalNumbers.octagonal"

  it should "return the first octagonal number" in {
    PolygonalNumbers.octagonal(1) shouldBe 1
  }

  it should "return the second octagonal number" in {
    PolygonalNumbers.octagonal(2) shouldBe 8
  }

  it should "return the third octagonal number" in {
    PolygonalNumbers.octagonal(3) shouldBe 21
  }


  behavior of "PolygonalNumbers.octagonalStream"

  it should "return the first number" in {
    PolygonalNumbers.octagonalStream.take(1) shouldBe Stream(1)
  }

  it should "return the first 2 numbers" in {
    PolygonalNumbers.octagonalStream.take(2) shouldBe Stream(1, 8)
  }

  it should "return the first 10 numbers" in {
    PolygonalNumbers.octagonalStream.take(10) shouldBe Stream(1, 8, 21,  40, 65, 96, 133, 176, 225, 280)
  }
}
