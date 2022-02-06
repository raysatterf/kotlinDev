class Rectangle(var height: Double, var length: Double) {
    var perimeter = (height + length) * 2
}

fun main() {
    // function to handle adding two numbers
    fun sum(a: Int, b: Int): Int {
        return a + b
    }

    // variable initialization
    var fullName = "Ray Satterfield"
    var thisNum = 4
    var thatNum = 6
    var outputNum = sum(thisNum,thatNum)
    var myHeight = 5.0
    var myLength = 2.0
    val myRectangle = Rectangle(myHeight,myLength)
    val someNum: Int // declare a variable without initializing it to a string, int, etc
    someNum = 42 // initializing a variable

    // print details etc
    println("the sum of $thisNum and $thatNum is $outputNum")
    println("The perimeter is ${myRectangle.perimeter}")
    println(fullName.isEmpty())
}