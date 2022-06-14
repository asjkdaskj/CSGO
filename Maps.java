/**
* name: Henry
* date 2022-04-30
* description: Maps superclass for adding maps in the game
*/
public class Maps {
  
  //attributes
  
  /** map name */
  private String name;
  
  /** callouts */
  private String callout1;
  private String callout2;
  private String callout3;
  private String callout4;
  private String callout5;
  private String callout6;

  /** 
  * creating Map
  *
  * @param name, map name
  * @param callout 1, first callout
  * @param callout 2, second callout
  * @param callout 3, third callout
  * @param callout 4, forth callout
  * @param callout 5, fifth callout
  * @param callout 6, sixth callout
  */
  public Map (String name, String callout1, String callout2, String callout3, String callout4, String callout6) {
    this.name = name;
    this.callout1 = callout1; 
    this.callout2 = callout2; 
    this.callout3 = callout3; 
    this.callout4 = callout4; 
    this.callout5 = callout5; 
    this.callout6 = callout6; 
  }

  public double getName() {
    return this.name;
  }

  public double getCallout1() {
    return this.callout1;
  }

  public double getCallout2() {
    return this.callout2;
  }

  public double getCallout3() {
    return this.callout3;
  }

  public double getCallout4() {
    return this.callout4;
  }

  public double getCallout5() {
    return this.callout5;
  }

  public double getCallout6() {
    return this.callout6;
  }
}
