import kotlin.random.Random

class Die (private var value: Int = 0,private var rand: Random = Random, private var diceNum: Int = 0) {
    private fun roll(){
        value = rand.nextInt(1,7)
    }
    fun getValue():Int {
        roll()
        return value
    }
    fun setDiceNum(number: Int){
        diceNum = number
    }
    fun getDiceNum(): Int{
        return diceNum
    }
    fun setNewValue(newVal: Int){
        value = newVal
    }
    fun getNewValue(): Int{
        return value
    }
}