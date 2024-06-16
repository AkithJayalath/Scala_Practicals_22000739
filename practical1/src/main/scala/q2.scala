object q2 extends App {
    println(s"The temperature in F is ${convertToFarenhite(35)} F");
}

def convertToFarenhite(c: Double): Double = 
    (c * 1.8)+ 32