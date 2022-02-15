fun main () {
    val myFirstDice = Dice(6) // creating our first 'object instance' of our 'Dice' class
    println("Your ${myFirstDice.color} ${myFirstDice.numSides} sided dice rolled a ${myFirstDice.roll()}!")

    val mySecondDice = Dice(20)
    println("Your ${mySecondDice.color} ${mySecondDice.numSides} sided dice rolled a ${mySecondDice.roll()}!")

    val myCoin = Coin()
    println("You tossed the coin and it landed on ${myCoin.toss()}!")

}

class Dice(val numSides: Int) {
    // this 'method' performs a roll on our dice, we specify that the data returned will be an Int
    var colorNum = 1..6
    var colorList = arrayOf("red","orange","yellow","green","blue","black")
    var color = colorList.random()
    fun roll(): Int {
        return (1..numSides).random() // a return statement returns a value from a function
    }
}

class Coin() {
    var coinSide = arrayOf("Heads","Tails")
    fun toss(): String {
        return coinSide.random()
    }
}