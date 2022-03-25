class YahtzeeHand {
    private val dice = mutableListOf<Die>()
    private val diceValue = mutableListOf<Int>()
    private val die = Die()

    fun rollAllDice(){
        var number = 1
        repeat(6) {
            dice.add(die)
            diceValue.add(die.getValue())
            die.setDiceNum(number)
            number++
        }
    }
    fun lockDice(): List<Int>{
        var lockedDiceValue = mutableListOf<Int>()
        println("Enter die number of dice you want to change (separate numbers by space): ")
        val lockedDice = readln()
        for( i in lockedDice.split(" ")){
            lockedDiceValue.add(i.toInt())
        }
        lockedDiceValue.sort()
        return lockedDiceValue
    }

    fun rollUnlockedDice(lockedDice:  List<Int>){
        for(l in lockedDice){
            var index = l-1
            for(d in dice){
                if(d.getDiceNum() != index) {
                    d.setNewValue(die.getValue())
                    diceValue[index] = d.getNewValue()
                }
            }
        }
    }

    fun getYahtzeeHand(): List<Int>{
        return diceValue
    }

    fun showDice(){
        val diceNumber = listOf(1,2,3,4,5,6)
        println("Dice:  "+ diceNumber)
        println("Value: "+ diceValue)
    }
}