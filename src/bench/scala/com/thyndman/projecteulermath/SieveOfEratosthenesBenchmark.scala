package com.thyndman.projecteulermath

import org.scalameter.api.{Bench, Gen}

object SieveOfEratosthenesBenchmark extends Bench.LocalTime {
  val sizes: Gen[Int] = Gen.range("size")(0, 1000, 100)

  performance of "SieveOfEratosthenes" in {
    measure method "primeStream" in {
      using(sizes) in { size =>
        SieveOfEratosthenes.primeStream().takeWhile(_ < size).sum
      }
    }
  }

}
