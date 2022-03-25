class FourOfAKindResult: Result {
    override fun checkResult(yahtzeeHand: YahtzeeHand): Boolean {
        var dice = yahtzeeHand.getYahtzeeHand().sorted()
        if (dice[0] == dice[3] || dice[1] == dice[4] || dice[2] == dice[5]){
            return true
        }
        return false
    }
}