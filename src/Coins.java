// TODO: Auto-generated Javadoc
/**
 * This class implements coins and inherit Entity class.
 * @author Funtastic4
 * @version 1.0
 */
public class Coins extends Entity {
  
  /** The money. */
  public static Integer money;
  
  /** The value. */
  private int value;
  
  /**
   * This constructs a coin with a specified (x,y) position.
   * and value 
   * @param x coin's axis
   * @param y coin's ordinate
   * @param value coin's value
   */
  public Coins(double x, double y, int value) {
    super(x, y);
    setValue(value);
  }

  /**
   * This method is used to move the coins to a greater y
   * as long as the value of y is not at 4% of the bottom of
   * the aquarium.
   */
  public void move() {
    if (y <= 90) {
      y += 2;
    }
  }
  
  /**
   * Sets the value.
   *
   * @param value the new value
   */
  public void setValue(int value) {
    this.value = value;
  }
  
  /**
   * Gets the value.
   *
   * @return the value
   */
  public int getValue() {
    return this.value;
  }
    
  /**
   * This method do coins activity.
   */
  public void lifeCycle() {
    move();
  }
}