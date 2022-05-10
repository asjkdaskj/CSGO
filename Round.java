/**
* name: Ryan
* date: April 30, 2022
* description: rounds class for csgo
*/
public class Round{
  private boolean isBombPlanted;
  private boolean isBombDefused;
  private boolean isTimeRunOut;
  private boolean ctWin;
  private boolean tWin;
  private int tsAlive;
  private int ctsAlive;

  public Round() {
    this.isBombPlanted=false;
    this.isBombDefused=false;
    this.isTimeRunOut=false;
    this.ctWin=false;
    this.tWin=false;
    this.tsAlive=5;
    this.ctsAlive=5;
  }

  public boolean getIsBombPlanted(){
    return this.isBombPlanted;
  }
  public boolean getIsBombDefused(){
    return this.isBombPlanted;
  }
  public boolean getIsTimeRunOut(){
    return this.isTimeRunOut;
  }
  public boolean getCtWin(){
    return this.ctWin;
  }
  public boolean getTWin(){
    return this.tWin;
  }
  public int getTsAlive(){
    return this.tsAlive;
  }
  public int getCtsAlive(){
    return this.ctsAlive;
  }

  public void plant(){
    this.isBombPlanted=true;
  }
  public void defuse(){
    this.isBombDefused=true;
  }
  public String toString(){
    return "Bomb Planted: "+ this.isBombPlanted+"\n Bomb Defused: "+ this.isBombDefused+"\n Time RunOut: "+this.isTimeRunOut+ "\nctWin: "+this.ctWin+"\ntWin: "+this.tWin+"\ntsAlive: "+this.tsAlive+"\nctsAlive: "+this.ctsAlive;
  }
}
