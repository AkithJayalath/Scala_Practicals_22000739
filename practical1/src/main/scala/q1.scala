object q1 extends App {
    println(s"Area of the disc is ${diskArea(5)}")
}

def diskArea(r: Double): Double = {
    val PI = 3.14
    PI * r * r 
}