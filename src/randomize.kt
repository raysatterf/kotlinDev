fun main () {
    val myFirstDice = Dice(6) // creating our first 'object instance' of our 'Dice' class
    println("Your ${myFirstDice.color} ${myFirstDice.numSides} sided dice rolled a ${myFirstDice.roll()}!")

    val mySecondDice = Dice(20)
    println("Your ${mySecondDice.color} ${mySecondDice.numSides} sided dice rolled a ${mySecondDice.roll()}!")

    val myCoin = Coin()
    println("You tossed the coin and it landed on ${myCoin.toss()}!")
     // val newCharacter = Connor()
     // val printStats = newCharacter.getStats()
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

class Connor {
    var weight = 100..300
    var height = 4..8
    var name = "Connor, The Cuddly"
    var perception = 1..10
    var strength = 1..10
    var manhood = -10..10
    var fingerLength = 1..10
    var forHeadHeight = 1..10

    fun getStats() {
        println("Character Name: $name")
        println("Height: ${height.random()} ft. tall")
        println("Weight: ${weight.random()} lbs")
        println("Forehead Height: ${forHeadHeight.random()} inches")
        println("Finger Length: ${fingerLength.random()} inches")
        println("Perception: ${perception.random()}")
        println("Strength: ${strength.random()}")
        println("Manhood: ${manhood.random()} inches")
    }
}