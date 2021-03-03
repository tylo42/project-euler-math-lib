package com.thyndman.projecteulermath

object PolygonalNumbers {

  def triangle(n: Int): Int = (n * (n+1)) / 2
  def triangleStream: Stream [Int] = buildStream(triangle)

  def square(n: Int): Int = n * n
  def squareStream: Stream [Int] = buildStream(square)


  def pentagonal(n: Int): Int = (n * ((3 * n) - 1)) / 2
  def pentagonalStream: Stream [Int] = buildStream(pentagonal)

  def hexagonal(n: Int): Int = n * ((2 * n) - 1)
  def hexagonalStream: Stream [Int] = buildStream(hexagonal)

  def heptagonal(n: Int): Int = (n * ((5 * n) - 3)) / 2
  def heptagonalStream: Stream [Int] = buildStream(heptagonal)

  def octagonal(n: Int): Int = n * ((3 * n) - 2)
  def octagonalStream: Stream [Int] = buildStream(octagonal)

  private def buildStream(f: Int => Int) = Stream.from(1).map(f)
}
