fun main () {
    val myFirstDice = Dice() // creating our first 'object instance' of our 'Dice' class
    val diceRoll =  myFirstDice.roll() // initialize 'diceRoll' to the roll 'method' on the myFirstDice 'object'
    println("Your ${myFirstDice.sides} sided dice rolled a $diceRoll!")
    myFirstDice.sides = 20 // updating the number of sides on 'myFirstDice'
    println("Your ${myFirstDice.sides} sided dice rolled ${myFirstDice.roll()}!")
    // we need to call ANOTHER roll method because 'diceRoll' was initialized before the sides changed

    // val newCharacter = Seamus()
    // val printStats = newCharacter.getStats()
}

class Dice() {
    var sides = 6 // assigning a 'sides' property to our 'Dice' class

    // this 'method' performs a roll on our dice, we specify that the data returned will be an Int
    fun roll():Int {
        val randomNumber = (1..sides).random() // initialize randomNumber by calling the random function on a range
         return randomNumber // a return statement returns a value from a function
    }
}

class Seamus {
    var weight = 100..300
    var height = 4..8
    var name = "Seamus, The Salty"
    var perception = 1..10
    var strength = 1..10
    var manhood = 1..10

    fun getStats() {
        println("Character Name: $name")
        println("Height: ${height.random()} feet tall")
        println("Weight: ${weight.random()} lbs")
        println("Perception: ${perception.random()}")
        println("Strength: ${strength.random()}")
        println("Manhood: ${manhood.random()}")
    }
}