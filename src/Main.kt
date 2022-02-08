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

    // dealing with NULL and null expressions
    var thisCanBeNull: String? = "something" // initializing a string with a value, but allowing the variable to be NULL
    var stringLength = thisCanBeNull?.length // because this var can be null, we must invoke a 'safe call' on the length function so we do not get null point exceptions
    val thatCanBeNullLength: Int = if (thisCanBeNull != null) thisCanBeNull.length else -1
    // simplify null expression with Elvis operator
    // val thatCanBeNullLength = thisCanBeNull?.length ?: -1

    val someNum: Int // declare a variable without initializing it to a string, int, etc
    someNum = 42 // initializing a variable
    val `woah space` = "there is a space in my boot!" // declaring a var with a space in the name
    println("this var contains a space: $`woah space`")
    print("Enter loop max: ")
    var loopMax: Int = readln().toInt()
    var txIndex: Int = 0
    val txComment = buildString {
        while (txIndex < loopMax) {
            txIndex++
            append(txIndex.toString())
        }
    }

    fun printDetails() {
        // print details etc
        println("the sum of $thisNum and $thatNum is $outputNum.")
        println("The perimeter is ${myRectangle.perimeter}.") // here we access the perimeter variable from the Rectangle class
        println(fullName.isEmpty()) // this evaluates whether the string is empty or not
        println("Transaction comment = $txComment")
    }
    printDetails()

    val specialChar = '%'
    val repeatCount = 5
    fun repeatThisChar(x: Char, y: Int) {
        // simple function to repeat action(s) a specified number of times, nested tests
        repeat(2) {
            repeat(y) {
                print(x)
            }
            println()
        }

    }
    repeatThisChar(specialChar,repeatCount)
}
