package com.thyndman.projecteulermath

object Joiner {
  def join(num1: Int, num2: Int): Int = {
    (num1.toString + num2.toString).toInt
  }

  def join(num1: Long, num2: Long): Long = {
    (num1.toString + num2.toString).toLong
  }
}
