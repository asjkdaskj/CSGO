// /**
// * name: Henry
// * date 2022-05-01
// * description: Class for the stats of a match
// */
public class MatchStats 

  //attributes

  /** number of rounds the terrorists won so far */
  private int tRounds;

  /** number of rounds the counter-terrorists won so far */
  private int ctRounds;

  /** whether the terrorists have won the match */
  private boolean tsWinMatch; 

  /** whether the counter-terrorists have won the match */
  private boolean ctsWinMatch;

  /** whether the match is a tie */
  private boolean isaTie;

  /** number of rounds played so far */
  private int roundsPlayed;
  Round round1 = new Round();

  /** 
  * creating MatchStats
  *
  * @param tRounds, number of rounds terrorists won
  * @param ctRounds, number of rounds counter terrorists won
  * @param tsWinMatch, whether terrorists won 
  * @param ctsWinMatch, whether counter terrorists won 
  * @param isaTie, whether the game is a tie
  * @param roundsPlayed, number of rounds played so far 
  */
  public MatchStats() {
    this.tRounds = 0;
    this.ctRounds = 0;
    this.tsWinMatch = false;
    this.ctsWinMatch = false;
    this.isaTie = false;
    this.roundsPlayed = 0;
  }

  public boolean getTsWinMatch() {
    return this.tsWinMatch;
  }

  public boolean getCTsWinMatch() {
    return this.ctsWinMatch;
  }

  public boolean getIsaTie() {
    return this.isaTie;
  }

  public int getRoundsPlayed() {
    return this.roundsPlayed;
  }

  /**
  * round over method
  * gives a round win to whatever team that won the round
  *
  */
  public void roundOver() {
    if (tWin == true) {
      tRounds += 1;
      tWin = false;
      
    } else if (ctWin == true) {
      ctRounds += 1;
      ctWin = false;
    }

    else {
      this.tRounds = tRounds;
      this.ctRounds = ctRounds;
    }
  }

  /**
  * match over method
  * assigns the winner if one team reaches 16 rounds, or else the game is tied if there are 30 rounds with no winner
  *
  */
  public void matchOver() {
    if (tRounds == 16) {
      tsWinMatch = true;
    } else if (ctRounds == 16) {
      ctsWinMatch = true;
    } else {
      tsWinMatch = false;
      ctsWinMatch = false;
    }

    if ((roundsPlayed == 30) && (tsWinMatch == false) && (tsWinMatch == false)){
      isaTie = true;
    } else {
      isaTie = false; 
    }
  }

  /**
  * to string method
  * prints out the match stats
  *
  */
  public String toString() {
    String matchDetails;
    matchDetails = "T side: " + tRounds + "\nCT side: " + ctRounds + "\nRounds played: " + roundsPlayed;

    if (tWin == true) {
      matchDetails += "\nTerrorists win the match";
    } else if (ctWin == true) {
      matchDetails += "\nCounter-terrorists win the match";
    } else {
      matchDetails += "\nThe match resulted in a tie";
    }
  }
}
