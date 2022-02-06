class Rectangle(var height: Double, var length: Double) {
    var perimeter = (height + length) * 2
}

fun main() {
    // function to handle adding two numbers
    fun sum(a: Int, b: Int): Int {
        return a + b
    }

    // variable initialization
    val fullName = "Ray Satterfield"
    val thisNum = 4
    val thatNum = 6
    val myHeight = 5.0
    val myLength = 2.0
    val myRectangle = Rectangle(myHeight,myLength)
    val outputNum = sum(thisNum,thatNum)
    val someNum: Int // declare a variable without initializing it to a string, int, etc
    someNum = 42 // initializing a variable

    // print details etc
    println("the sum of $thisNum and $thatNum is $outputNum")
    println("The perimeter is ${myRectangle.perimeter}")
    println(fullName.isEmpty())
}