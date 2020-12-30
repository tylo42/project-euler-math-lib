package com.thyndman.projecteulermath

import org.scalameter.api.{Bench, Gen}
import org.scalameter.picklers.Implicits._

object PrimeBenchmark extends Bench.LocalTime {
  private val ONE_MILIION = 1000000
  private val ONE_HUNDRED_THOUSAND = 100000

  private val sizes: Gen[Int] = Gen.range("size")(0, ONE_MILIION, ONE_HUNDRED_THOUSAND)
  private val primeChecks: Gen[Int] = Gen.enumeration("primes")(
    104677, 104681, 104683, 104693, 104701, 104707, 104711, 104717, 104723, 104729
  )

  private val nonPrimeChecks: Gen[Int] = Gen.enumeration("nonprimes")(
    104679, 104685, 104687, 104689, 104691, 104695, 104697, 104699, 104703, 104705
  )

  performance of "Prime" in {
    measure method "primes" in {
      using(sizes) in { size =>
        Prime.primes.takeWhile(_ < size).sum
      }

      measure method "is" in {
        using(primeChecks) in {
          Prime.is(_)
        }

        using(nonPrimeChecks) in { size =>
          Prime.is(_)
        }
      }
    }
  }
}
