/**
 * This is just a sandbox for testing misc Kotlin stuff
 *
 * Created 02/06/2022
 */

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
    val myRectangle = Rectangle(myHeight,myLength) // use Rectangle class to assign class output to variable
    val outputNum = sum(thisNum,thatNum) // use sum function to assign function output to variable
    val someNum: Int // declare a variable without initializing it to a string, int, etc
    someNum = 42 // initializing a variable

    // print details etc
    println("the sum of $thisNum and $thatNum is $outputNum.")
    println("The perimeter is ${myRectangle.perimeter}.") // here we access the perimeter variable from the Rectangle class
    println(fullName.isEmpty()) // this evaluates whether the string is empty or not
}
