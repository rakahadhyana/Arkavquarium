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
        super(0, 100);
        int dir = (int)(Math.random() * 2);
        if (dir == 0) {
            setDirection(Direction.RIGHT);
        } else {
            setDirection(Direction.LEFT);
        }
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
        if (x < C.getX()) {
            setDirection(Direction.RIGHT);
            x += getSpeed();
        } else if (x > C.getX()) {
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
            	System.out.println("index Coin : " +  idx);
                    if (distanceTo(closeCoins) > distanceTo(listCoins.get(idx))) {
                        closeCoins = listCoins.get(idx);
                    }
                idx++;
            }
            moveToCoins(closeCoins);
            if (Math.round(x) == (long) closeCoins.getX() && y - 10 <= closeCoins.getY()) {
                Coins.money += closeCoins.getValue();
                listCoins.remove(closeCoins);
            }
        }
    }

    public void setDirection(Direction direction){
        this.direction = direction;
    }

    private Direction direction;
}
