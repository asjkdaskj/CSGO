/**
Name: Ryan
Date: May 3, 2022
player class
*/
public class Player{
   
   private String username;
   private int kills;
   private int assists;
   private int deaths;
   private boolean isAlive;
   private double utilDamage;
   private double enemiesFlashed;
   private double adr;
   private boolean hasKit;
   private boolean isT;
   private boolean isCt;
   private double armorlvl;
   private boolean hasHelmut;
   private double hp;
   private double money;
   private double hsPercent;
   
   public Player(String username,int kills, int assists,boolean isAlive,double utilDamage,double enemiesFlashed, double adr, boolean hasKit, boolean isT, double armorlvl, boolean hasHelmut, double hp,double money, double hsPercent){
      this.kills=kills;
      this.username=username;
      this.assists=assists;
      this.deaths=deaths;
      this.isAlive=isAlive;
      this.utilDamage=utilDamage;
      this.enemiesFlashed=enemiesFlashed;
      this.adr=adr;
      this.hasKit=hasKit;
      this.isT=isT;
      this.isCt=isCt;
      this.armorlvl=armorlvl;
      this.hasHelmut=hasHelmut;
      this.hp=hp;
      this.money=money;
      this.hsPercent=hsPercent;
   }
   
   public String getUsername(){
      return this.username;
   }
   public int getKills(){
      return this.kills;
   }
   public int getAssists(){
      return this.assists;
   }
   public int getDeaths(){
      return this.deaths;
   }
   public double getUtilDamage(){
      return this.utilDamage;
   }
   public double getEnemiesFlashed(){
      return this.enemiesFlashed;
   }
   public double getAdr(){
      return this.adr;
   }
   public boolean getIsAlive(){
      return this.isAlive;
   }
   public boolean getHasKit(){
      return this.hasKit;
   }
   public boolean getIsT(){
      return this.isT;
   }
   public boolean getIsCt(){
      return this.isCt;
   }
   public boolean getHasHelmut(){
      return this.hasHelmut;
   }
   public double getHp(){
      return this.hp;
   }
   public double getMoney(){
      return this.money;
   }
   public double gethsPercent(){
      return this.hsPercent;
   }


   public void killEnemy(){
      this.kills=this.kills+1;
   }
   public void assistTeam(){
      this.assists=this.assists+1;
   }
   public void die(){
      this.deaths=this.deaths+1;
   }
   
   public String toString(){
      return "Username: "+this.username+"\nKills: "+this.kills+ "\nAssists: "+this.assists+"\nDeaths: "+this.deaths+"\nAlive?: "+this.isAlive+"\nutilDamage: "+this.utilDamage+"\nEnemies Flashed: "+this.enemiesFlashed+"\nadr:"+this.adr+"\nhasKit: "+this.hasKit+"\nisT: "+this.isT+"\nisCt: "+this.isCt+"\narmorlvl: "+this.armorlvl+"\nhas helmut: "+this.hasHelmut+"\nhp: "+this.hp+"\nmoney: "+this.money+"\nhsPercent: "+this.hsPercent;
   }

}