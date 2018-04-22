/**
 * This class implements coins and inherit Entity class
 * @author Funtastic4
 * @version 1.0
 */
public class Coins extends Entity {
    public static int money;
    private int value;
    /**
     * This constructs a coin with a specified (x,y) position 
     * and value 
     * @param x
     * @param y
     * @param value
     */
	
	public Coins(double x, double y, int value) {
        super(x, y);
        setValue(value);
    }
	/**
	 * This is used to set the value of the coins
	 * @param value
	 */
    public void setValue(int value) {
        this.value = value;
    }
    /**
     * This method is used to move the coins to a greater y
     * as long as the value of y is not at 4% of the bottom of
     * the aquarium
     */
    public void move() {
        if (y != Aquarium.getBorder(4)) {
            y++;
        }
    }
    /**
     * This returns the current value of the coin
     * @return this coin's value
     */
    public int getValue() {
        return this.value;
    }

    public void draw() {

    }
}
