import static java.lang.Math.abs;

/**
 * This class implements the Fish and it inherits Entity class.
 * @author Funtastic4
 * @version 1.0
 */
public abstract class Fish extends Entity {
  /**
   * Fish Default constructor.
   */
  public Fish() {
    super();
    setTime(0);
    radius = Aquarium.getSize() * 2 / 100;
    setIsFull(true);
    setDest(Math.random() * Aquarium.getSize(), Math.random() * Aquarium.getSize());
    int dir = (int)(Math.random() * 2);
    if (dir == 0) {
      setDirection(Direction.RIGHT);
    } else {
      setDirection(Direction.LEFT);
    }
  }


  /**
   * Fish movement procedure.
   */
  @Override
  public void move() {
    double rangeX = abs(getX() - getDestX());
    double rangeY = abs(getY() - getDestY());
    if (rangeX < getRadius() && rangeY < getRadius()) {
      setDest(Math.random() * Aquarium.getSize(), Math.random() * Aquarium.getSize());
    }
    double a = Math.atan2(getDestY() - getY(), getDestX() - getX());
    if (getSpeed() * Math.cos(a) >= 0) {
      setDirection(Direction.RIGHT);
    } else {
      setDirection(Direction.LEFT);
    }
    setX(getX() + getSpeed() * Math.cos(a));
    setY(getY() + getSpeed() * Math.sin(a));
  }

  /**
   * IsFull setter.
   * @param full : updated isFull
   */
  public void setIsFull(boolean full) {
    this.isFull = full;
  }

  /**
   * Direction setter.
   * @param direction : updated direction.
   */
  public void setDirection(Direction direction) {
    this.direction = direction;
  }

  /**
   * Destination setter.
   * @param abscissa : x-axis
   * @param ordinate : y-axis
   */
  public void setDest(double abscissa, double ordinate) {
    this.destX = abscissa;
    this.destY = ordinate;
  }

  /**
   * Time setter.
   * @param time : updated time.
   */
  public void setTime(int time) {
    this.time = time;
  }

  /**
   * Direction getter.
   * @return current direction
   */
  public Direction getDirection() {
    return this.direction;
  }

  /**
   * Abscissa destination getter.
   * @return x-asix destination
   */
  public double getDestX() {
    return this.destX;
  }

  /**
   * Ordinate destination getter.
   * @return y-asix destination
   */
  public double getDestY() {
    return this.destY;
  }

  /**
   * IsFull getter.
   * @return current isFull
   */
  public boolean getIsFull() {
    return this.isFull;
  }

  /**
   * timeToDeath getter.
   * @return timeToDeath of Fish
   */
  public int getTimeToDeath() {
    return this.timetoDeath;
  }

  /**
   * Eat radius.
   * @return radius of Fish to eat
   */
  public int getRadius() {
    return this.radius;
  }

  /**
   * Current time getter.
   * @return Fish living time
   */
  public int getTime() {
    return this.time;
  }

  /**
   * Random movement time getter.
   * @return time to move other random destination
   */
  public int getTimeM() {
    return this.timeM;
  }

  /**
   * Time to find food getter.
   * @return seek time Fish
   */
  public int getTImeT() {
    return this.timeT;
  }

  protected Direction direction;
  private double destX;
  private double destY;
  protected boolean isFull;
  protected final int timetoDeath = 100;
  protected final int radius;
  protected int time;
  protected final int timeM = 75;
  protected final int timeT = 50;
}
