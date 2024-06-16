object q3 extends App {
    println(s" The volume of the sphere is ${volumeOfSphere(5)}")
}

def volumeOfSphere(r: Double): Double = {
    val PI = 3.14
    (4.0/3)*PI*r*r*r
}