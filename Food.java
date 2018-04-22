/**
 * This class implements Food and inherits Entity class and Interface
 * @author Funtastic4
 * @version 1.0
 */

class Food extends Entity implements Interface {
    /**
     * This constructs a food with a specified (x,y) position
     * @param x
     * @param y
     */
	public Food(double x, double y) {
        super(x, y);
        this.x = x;
        this.y = y;
    }
	/**
	 * This method is used to move the position of Food to
	 * a greater y as long as the value of y is not at 4%
	 * of the bottom of the aquarium
	 */
    public void move() {
        if (y != Aquarium.getBorder(4)) {
            y++;
        }
    }

    public void draw() {

    }

    // public void lifeCycle(LinkedList<Food> listFood) {
    //     move();
    //     if (y == Aquarium.getBorder(4)) {
    //         listFood.remove(this);
    //     }
    // }
}
