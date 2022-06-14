// * name: Henry
// * date 2022-05-03
// * description: Coordinate class
// */
public class Coordinates 

  //attributes

  /** x-coordinate of position 1 */
  private int pos1x;

  /** y-coordinate of position 1 */
  private int pos1y;

  /** z-coordinate of position 1 */
  private int pos1z;

  /** x-coordinate of position 2 */
  private int pos2x;

  /** y-coordinate of position 2 */
  private int pos2y;

  /** z-coordinate of position 2 */
  private int pos2z; 

  /** 
  * creating Coordinates
  *
  * @param pos1x, x value of first coordinate
  * @param pos1y, y value of first coordinate
  * @param pos1z, z value of first coordinate
  * @param pos1x, x value of first coordinate
  * @param pos2y, y value of second coordinate
  * @param pos2z, z value of third coordinate
  */
  public Coordinates(int pos1x, int pos1y, int pos1z, int pos2x, int pos2y, int pos2z) {
    this.pos1x = pos1x;
    this.pos1y = pos1y;
    this.pos1z = pos1z;
    this.pos2x = pos2x;
    this.pos2y = pos2y;
    this.pos2z = pos2z;
  }

  public int getPos1x() {
    return this.pos1x;
  }

  public int getPos1y() {
    return this.pos1y;
  }

  public int getPos1z() {
    return this.pos1z;
  }

  public int getPos2x() {
    return this.pos2x;
  }

  public int getPos2y() {
    return this.pos2y;
  }

  public int getPos2z() {
    return this.pos2z;
  }

  /**
  * toString method
  * prints out the coordinates
  */
  public String toString () {
    return "Coordinate 1: (" + pos1x + "," + pos1y + "," + pos1z + ")" + "\nCoordinate 2: (" + pos2x + "," + pos2y + "," + pos2z + ")";
  }
}
