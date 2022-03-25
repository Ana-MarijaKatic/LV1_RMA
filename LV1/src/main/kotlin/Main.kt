fun main(args: Array<String>) {
    val yahtzeeHand = YahtzeeHand()
    yahtzeeHand.rollAllDice()
    yahtzeeHand.showDice()
    repeat(2){
        yahtzeeHand.rollUnlockedDice(yahtzeeHand.lockDice())
        yahtzeeHand.showDice()
    }
    val yahtzeeResult = YahtzeeResult()
    val fourOfAKindResult = FourOfAKindResult()
    val fullHouseResult = FullHouseResult()
    val largeStraightResult = LargeStraightResult()
    val smallStraightResult = SmallStraightResult()

    if(yahtzeeResult.checkResult(yahtzeeHand)){
        println("You have a yahtzee!")
    }
    else if(fourOfAKindResult.checkResult(yahtzeeHand)){
        println("You have a four of a kind!")
    }
    else if(fullHouseResult.checkResult(yahtzeeHand)){
        println("You have a full house!")
    }
    else if(largeStraightResult.checkResult(yahtzeeHand)){
        println("You have a large straight!")
    }
    else if(smallStraightResult.checkResult(yahtzeeHand)){
        println("You have a small straight!")
    }
    else println("You have no winnings in the lower section.")




}
