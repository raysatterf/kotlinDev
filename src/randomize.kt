/**
 * Dice rolling jazz and other bizzzz
 * 02/2022
 */

fun main () {
    val myFirstDice = Dice(8)
    val rollResult = myFirstDice.roll()
    val luckyNumber = 4

    when (rollResult) {
        luckyNumber -> println("You win!")
        1 -> println("So sorry! You rolled a 1. Try again!")
        2 -> println("Sadly, you rolled a 2. Try again!")
        3 -> println("Unfortunately, you rolled a 3. Try again!")
        5 -> println("Don't cry! You rolled a 5. Try again!")
        6 -> println("Apologies! You rolled a 6. Try again!")
        7 -> println("Apologies! You rolled a 7. Try again!")
        8 -> println("Apologies! You rolled a 8. Try again!")
        // can use an else statement here, like so
        // else -> println("Apologies! You rolled a 8. Try again!")
    }
}

class Dice(val numSides: Int) {
    fun roll():Int {
        return (1..numSides).random()
    }
}

class Coin() {
    var coinSide = arrayOf("Heads","Tails")
    fun toss(): String {
        return coinSide.random()
    }
}