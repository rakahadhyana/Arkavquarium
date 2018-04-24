/**
 * This class implements Food and inherits Entity class and Interface.
 * @author Funtastic4
 * @version 1.0
 */

class Food extends Entity {
  /**
  * This constructs a food with a specified (x,y) position.
  * @param x the food's axis
  * @param y the food's ordinate
  */
  public Food(double x, double y) {
    super(x, y);
    this.x = x;
    this.y = y;
  }
  /**
   * This method is used to move the position of Food to
   * a greater y as long as the value of y is not at 4%
   * of the bottom of the aquarium.
   */
  
  /**
   * Override move method from Entity class.
   * It implements the food's move
   */
  @Override
  public void move() {
    y++;
  }
  
  /**
  * This method implements food's activity.
  * @param list of Food
  */
  public void lifeCycle(LinkedList<Food> listFood) {
    move();
    if (y > 95) {
      listFood.remove(this);
    }
  }
}