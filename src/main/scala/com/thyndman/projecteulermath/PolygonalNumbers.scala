package com.thyndman.projecteulermath

object PolygonalNumbers {

  def triangle: Int => Int = generic(3)
  def triangleStream: Stream [Int] = buildStream(triangle)

  def square: Int => Int = generic(4)
  def squareStream: Stream [Int] = buildStream(square)

  def pentagonal: Int => Int = generic(5)
  def pentagonalStream: Stream [Int] = buildStream(pentagonal)

  def hexagonal: Int => Int = generic(6)
  def hexagonalStream: Stream [Int] = buildStream(hexagonal)

  def heptagonal: Int => Int = generic(7)
  def heptagonalStream: Stream [Int] = buildStream(heptagonal)

  def octagonal: Int => Int = generic(8)
  def octagonalStream: Stream [Int] = buildStream(octagonal)

  private def generic(sides: Int)(n: Int) = {
    (sides - 2) * ((n * (n-1))/ 2) + n
  }

  private def buildStream(f: Int => Int) = Stream.from(1).map(f)
}
