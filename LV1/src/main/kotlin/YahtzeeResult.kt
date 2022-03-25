class YahtzeeResult : Result{
    override fun checkResult(yahtzeeHand: YahtzeeHand): Boolean {
        var dice = yahtzeeHand.getYahtzeeHand().sorted()
        if (dice[0] == dice[4] || dice[1] == dice[5]){
            return true
        }
        return false
    }
}