// /**
// * name: Henry
// * date 2022-05-03
// * description: Controls class
// */
public class Controls {
  
  //attribute
  
  /** player' location */
  private String playerLocation;
  
  /** 
  * creating Controls
  *
  * @param playerLocation, player's current location
  */
  public Controls (String playerLocation) {
    this.playerLocation = playerLocation;
  }

  //return method
  public String getPlayerLocation () {
    return this.playerLocation;
  }

  /**
  * move method to A site
  *
  */
  public void moveToASite () {
    if (playerLocation == "ABombsite") {
      System.out.println("You are staying in the A Bombsite");
      playerLocation = "ABombsite";
    } else {
      System.out.println("You have moved to the A Bombsite");
      playerLocation = "ABombsite";
    }
  }

  /**
  * move method to B site
  *
  */
  public void moveToBSite () {
    if (playerLocation == "BBombsite") {
      System.out.println("You are staying in the B Bombsite");
      playerLocation = "BBombsite";
    } else {
      System.out.println("You have moved to the B Bombsite");
      playerLocation = "BBombsite";
    }
  }

  /**
  * move method to mid
  *
  */
  public void moveToMid () {
    if (playerLocation == "Mid") {
      System.out.println("You are staying in mid");
      playerLocation = "Mid";
    } else {
      System.out.println("You have moved to mid");
      playerLocation = "Mid";
    }
  }

  /**
  * move method to T spawn
  *
  */
  public void moveToTSpawn () {
    if (playerLocation == "TSpawn") {
      System.out.println("You are staying in T Spawn");
      playerLocation = "";
    } else {
      System.out.println("You have moved to T Spawn");
      playerLocation = "TSpawn";
    }
  }

  /**
  * move method to CT spawn
  *
  */
  public void moveToCTSpawn () {
    if (playerLocation == "CTSpawn") {
      System.out.println("You are staying in CT Spawn");
      playerLocation = "";
    } else {
      System.out.println("You have moved to CT Spawn");
      playerLocation = "CTSpawn";
    }
  }

  /**
  * toString method
  * prints out the player's location
  * 
  */
  public String toString () {
    return "Player location: " + playerLocation + "\n";
  }
}
