package com.test
import com.knoldus.CalculateElectricityCharges
import org.scalatest.funsuite.AnyFunSuite
object ElectricityCalculationTest

class CodeTest extends AnyFunSuite {

  val firstTestCase  = CalculateElectricityCharges(123451, "Jitendra", "Gorakhpur", 5062, 5904)
  val secondTestCase = CalculateElectricityCharges(123452, "Jitendra", "Gorakhpur", 0, 200)
  val thirdTestCase  = CalculateElectricityCharges(123453, "Jitendra", "Gorakhpur", 0, 350)
  val fourthTestCase = CalculateElectricityCharges(123454, "Jitendra", "Gorakhpur", 0, 500)
  val fifthTestCase  = CalculateElectricityCharges(123455, "Jitendra", "Gorakhpur", 5060, 5500)
  val sixthTestCase  = CalculateElectricityCharges(123456, "Jitendra", "Gorakhpur", 4060, 5500)

  test("Electricity bill calculation is being done "){
    assert(firstTestCase.calculateElectricityCharges == 5994.5)
    assert(secondTestCase.calculateElectricityCharges == 1050.0)
    assert(thirdTestCase.calculateElectricityCharges == 1987.50)
    assert(fourthTestCase.calculateElectricityCharges == 3087.50)
    assert(fifthTestCase.calculateElectricityCharges == 2595.0)
    assert(sixthTestCase.calculateElectricityCharges == 11077.50)

  }
}
