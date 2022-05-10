/**
* name: Stefany, Chris
* date 2022-04-29
* description: weapon class extends to items. This consists of guns
*/
public class Weapon extends Item {
  private double damage;
  private double killAward;
  private int fireate;
  private double headshotMulti;
  private boolean shotgun;
  private boolean isBought;

  //weapons
  public Weapon (double cost, String name, double killAward, double damage, int fireate, double headshotMulti, boolean shotgun, boolean isBought) {
    super(cost, name, isBought);
    this.killAward = killAward;
    this.damage = damage;
    this.fireate = fireate;
    this.headshotMulti = headshotMulti;
    this.shotgun = false;
    this.isBought = false;
  }

  //getters
    public double getDamage() {
    return this.damage;
  }
  public double getKillAward() {
    return this.killAward;
  }
  public int fireate() {
    return this.fireate;
  }
  public double headshotMulti() {
    return this.headshotMulti;
  }
  public boolean shotgun() {
    return this.shotgun;
  }
  public boolean isBought() {
    return this.isBought; 
  }
  
  //shooting the other team
  
   public void shoot() {
     get.enemyHP = get.enemyHP - getDamage;
   }

   public void headshot() {
     get.enemyHP = get.enemyHP - getDamage * headshotMulti;
   }
  
  public String toString() {
		return "\ndamage: " + damage + "\nkillAward: " + killAward + "\nfireate: " + fireate + "\nheadshotMulti: " + headshotMulti + "\nshotgun: " + shotgun;
	}

}
