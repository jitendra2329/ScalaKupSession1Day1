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

    //Successfull conditions (test cases will pass in these conditions)

    assert(firstTestCase.calculateElectricityCharges == 7073.51)
    assert(secondTestCase.calculateElectricityCharges == 1239)
    assert(thirdTestCase.calculateElectricityCharges == 2345.25)
    assert(fourthTestCase.calculateElectricityCharges == 3643.25)
    assert(fifthTestCase.calculateElectricityCharges == 3062.1)
    assert(sixthTestCase.calculateElectricityCharges == 13071.45)

    //Unsuccessfull conditions(Test cases will fail in these condtions)

    assert(fifthTestCase.calculateElectricityCharges != 3062.1)
    assert(sixthTestCase.calculateElectricityCharges != 13071.45)

  }
}
