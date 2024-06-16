file:///D:/UCSC/Year%202/Semester%201/Functional%20Programming/Scala/practical1/src/main/scala/q5.scala
### dotty.tools.dotc.core.TypeError$$anon$1: Toplevel definition diskArea is defined in
  D:/UCSC/Year 2/Semester 1/Functional Programming/Scala/practical1/src/main/scala/Q1.scala
and also in
  D:/UCSC/Year 2/Semester 1/Functional Programming/Scala/practical1/src/main/scala/q1.scala
One of these files should be removed from the classpath.

occurred in the presentation compiler.

presentation compiler configuration:
Scala version: 3.3.3
Classpath:
<HOME>\AppData\Local\Coursier\cache\v1\https\repo1.maven.org\maven2\org\scala-lang\scala3-library_3\3.3.3\scala3-library_3-3.3.3.jar [exists ], <HOME>\AppData\Local\Coursier\cache\v1\https\repo1.maven.org\maven2\org\scala-lang\scala-library\2.13.12\scala-library-2.13.12.jar [exists ]
Options:



action parameters:
offset: 120
uri: file:///D:/UCSC/Year%202/Semester%201/Functional%20Programming/Scala/practical1/src/main/scala/q5.scala
text:
```scala
object q5 extends App {
    val runTime = totalTime()
    println("Total run Time is " + runTime + " Mins.")
}

def@@ timeToRunEasy(d: Int): Double = 
    d*8.0
def timeToRunTempo(d: Int): Double = 
    d*7.0

def totalTime(): Double = 
    timeToRunEasy(4) + timeToRunTempo(3)
```



#### Error stacktrace:

```

```
#### Short summary: 

dotty.tools.dotc.core.TypeError$$anon$1: Toplevel definition diskArea is defined in
  D:/UCSC/Year 2/Semester 1/Functional Programming/Scala/practical1/src/main/scala/Q1.scala
and also in
  D:/UCSC/Year 2/Semester 1/Functional Programming/Scala/practical1/src/main/scala/q1.scala
One of these files should be removed from the classpath.