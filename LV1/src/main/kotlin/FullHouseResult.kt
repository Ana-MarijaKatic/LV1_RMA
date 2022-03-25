class FullHouseResult: Result {
    override fun checkResult(yahtzeeHand: YahtzeeHand): Boolean {
        var dice = yahtzeeHand.getYahtzeeHand().sorted()
        var pair = 0
        var triplet = 0
        for(d in 0..3){
            if(dice[d] == dice[d+1] && dice[d] == dice[d+2]) triplet++
        }
        for(d in 0..4){
            if(dice[d] == dice[d+1]) pair++
        }
        if (triplet >= 1 && (pair - 2 == 1 || pair - 3 == 1)){
            return true
        }
        return false
    }
}