object q5 extends App {
    val runTime = totalTime()
    println("Total run Time is " + runTime + " Mins.")
}

def timeToRunEasy(d: Int): Double = d*8.0
def timeToRunTempo(d: Int): Double = d*7.0

def totalTime(): Double = timeToRunEasy(4) + timeToRunTempo(3)