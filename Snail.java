/**
 * This class implements the snail and it inherits Entity class
 * @author Funtastic4
 * @version 1.0
 */
public class Snail extends Entity {
	
	/**
	 * 
	 */
	public Snail() {
        super(50, 100);
        setDirection(Direction.RIGHT);
    }
	
	/**
	 * 
	 * @param C
	 * @return
	 */
    public double distanceTo(Coins C) {
        return (Math.pow(Math.pow(C.getX() - x, 2) + Math.pow(C.getY() - y, 2), 0.5));
    }
    
    /**
     * 
     * @param C
     */
    public void moveToCoins(Coins C) {
        if (x < Math.round(C.getX())) {
            setDirection(Direction.RIGHT);
            x += getSpeed();
        } else if (x > Math.round(C.getX())) {
            setDirection(Direction.LEFT);
            x -= getSpeed();
        }
    }

    public void draw() {

    }

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

    public void setDirection(Direction direction){
        this.direction = direction;
    }

    public Direction getDirection() {
    	return direction;
    }
    
    private Direction direction;
}
