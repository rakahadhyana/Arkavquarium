/**
 * This class implements the snail and it inherits Entity class.
 * @author Funtastic4
 * @version 1.0
 */
public class Snail extends Entity {
  /**
   * This constructs Snail object and initialize it's position (x,y) by calling it's 
   * parent constructor and set it's direction to right.
   */
  public Snail() {
    super(50, 100);
    setDirection(Direction.RIGHT);
  }
  
  /**
   * This return the distance from snail to @param c.
   * @param c the coin that want to get the distance
   * @return
   */
  public double distanceTo(Coins c) {
    return (Math.pow(Math.pow(c.getX() - x, 2) + Math.pow(c.getY() - y, 2), 0.5));
  }

  @Override
  public void move() {}
    
  /**
   * This make the snail move to @param c.
   * @param c the coin that want to move to
   */
  public void moveToCoins(Coins c) {
    if (x < Math.round(c.getX())) {
      setDirection(Direction.RIGHT);
      x += getSpeed();
    } else if (x > Math.round(c.getX())) {
      setDirection(Direction.LEFT);
      x -= getSpeed();
    }
  }

  /**
   * This make snail do it's activity.
   * @param listCoins list coin that affected from snail activity
   */
  public void lifeCycle(LinkedList<Coins> listCoins) {
    int idx = 0;
    if (!listCoins.isEmpty()) {
      Coins closeCoins = listCoins.get(idx);
      idx++;
      while (idx < listCoins.getIdx()) {
        if (distanceTo(closeCoins) > distanceTo(listCoins.get(idx))) {
          closeCoins = listCoins.get(idx);
        }
        idx++;
      }
      moveToCoins(closeCoins);
      if (Math.round(x) == Math.round(closeCoins.getX()) && y - 10 <= closeCoins.getY()) {
        Coins.money += closeCoins.getValue();
        listCoins.remove(closeCoins);
      }
    }
  }

  public Direction getDirection() {
    return direction;
  }

  public void setDirection(Direction direction) {
    this.direction = direction;
  }

  private Direction direction;
}