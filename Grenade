/**
* name: Stefany
* date 2022-04-29
* description: grenade class that extends to item. I dont know how the grenades functions so there's 3 grenades method overload
*/
public class Grenade extends Item {

  private int enemiesFlashed;
  private double damage;
  private double killAward;

  public Grenade (double cost, String name, double killAward, double damage) {
    super(cost, name);
    this.damage = damage;
    this.killAward = killAward;
  }
  
  public Grenade (double cost, String name) {
    super(cost, name);
  }
  
  public Grenade (double cost, String name, int enemiesFlashed) {
    super(cost, name);
    this.enemiesFlashed = enemiesFlashed;
  }
  
    public double getKillAward() {
    return this.killAward;
  }

  public int getEnemiesFlashed () {
    return this.enemiesFlashed;
  }
  
    public double getDamage() {
    return this.damage;
  }
  public String toString() {
		return "\nenemiesFlashed: " + enemiesFlashed + "\ndamage: " + damage + "\nkillAward" + killAward;
	}
}
