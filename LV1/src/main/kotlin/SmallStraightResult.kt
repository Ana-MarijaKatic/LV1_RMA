class SmallStraightResult: Result {
    override fun checkResult(yahtzeeHand: YahtzeeHand): Boolean {
        var dice = yahtzeeHand.getYahtzeeHand().sorted()
        var pair = 0
        for(d in 0..4){
            if(dice[d] == dice[d+1]) pair++
        }
        if (pair<=1 && dice[5] != 6 && dice[0] == 1 && (dice[4] == 5 || dice[5] == 5)){
            return true
        }
        return false
    }
}