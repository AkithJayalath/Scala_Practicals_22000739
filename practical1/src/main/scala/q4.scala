object q4 extends App {
    val cost = totalCost(60, 24.95, 40)
    println("Total cost is "+cost);
}

def initialCost(q: Int, unitPrice: Double): Double =
    q * unitPrice

def costAfterDiscount(cost: Double, rate: Int): Double = 
    cost - cost*(rate/100.0)

def shippingCost(q: Int): Double = 
    if (q > 50) 50*3 + (q-50)*0.75
    else q*3

def totalCost(q: Int,unitPrice: Double, rate: Int): Double = {
    costAfterDiscount(initialCost(q, unitPrice), rate) + shippingCost(q)
}