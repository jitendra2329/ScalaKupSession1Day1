package com.knoldus

//Defining a case class CalculateElectricityCharges

case class CalculateElectricityCharges(
                                        accountNumber: Int,
                                        accountUserName: String,
                                        address: String,
                                        previousUnit: Int,
                                        currentUnit: Int
                                      ) {

    //calaculating total units for bill calculation

    def calculateTotalUnits: Int = (currentUnit - previousUnit)

    val totalUnits: Int = calculateTotalUnits

  //Defining the method: calculateElectricityCharges for calculating the total amount of electricity bill

   def calculateElectricityCharges: Double = {
      if(totalUnits > 0 && totalUnits <= 250){
        val unitForCalculation: Int = totalUnits
        val totalAmount: Double = unitForCalculation * 5.25
        totalAmount

      } else if(totalUnits > 250 && totalUnits <= 450){
            val firstSlabOfUnits: Int = 250
            val secondSlabOfUnits: Int = totalUnits - firstSlabOfUnits
            val totalAmount: Double = (firstSlabOfUnits * 5.25) + (secondSlabOfUnits * 6.75)
            totalAmount

            } else {
                  val firstSlabOfUnits: Int = 250
                  val secondSlabOfUnits: Int = 200
                  val finalSlabOfUnits: Int = totalUnits - (firstSlabOfUnits + secondSlabOfUnits)
                  val totalAmount: Double = (firstSlabOfUnits * 5.25) + (secondSlabOfUnits * 6.75) + (finalSlabOfUnits * 8.50)
                  totalAmount

             }
      }
}
