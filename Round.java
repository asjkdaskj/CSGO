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

  public Round(boolean isBombPlanted,boolean isBombDefused, boolean isTimeRunOut,boolean ctWin, boolean tWin,int tsAlive, int ctsAlive){
    this.isBombPlanted=isBombPlanted;
    this.isBombDefused=isBombDefused;
    this.isTimeRunOut=isTimeRunOut;
    this.ctWin=ctWin;
    this.tWin=tWin;
    this.tsAlive=tsAlive;
    this.ctsAlive=ctsAlive;
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
}
