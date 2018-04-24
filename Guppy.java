/**
 * This class implements the Guppy fish
 * and it inherits Fish class
 * @author Funtastic4
 * @version 1.0
 */
class Guppy extends Fish {
    public Guppy() {
        super();
        setSpeed(1);
        setPhase(1);
        setFoodCounter(0);
    }

    public void grow() {
        setPhase(getPhase() + 1);
    }

    public void makeCoins(LinkedList<Coins> listCoins) {
        Coins C = new Coins(getX(), getY(), getPhase() * 100);
        listCoins.add(C);
    }
    
    public double distanceTo(Food other) {
        return Math.pow((Math.pow(other.getX() - getX(), 2) + (Math.pow(other.getY() - getY(), 2))), 0.5);
    }

    public void moveToFood(Food other) {
        setSpeed(getSpeed() + 1);
        double a = Math.atan2(other.getY() - getY(), other.getX() - getX());
        if ((getSpeed() * Math.cos(a)) >= 0) {
            setDirection(Direction.RIGHT);
        } else {
            setDirection(Direction.LEFT);
        }
        setX(getX() + getSpeed() * Math.cos(a));
        setY(getY() + getSpeed() * Math.sin(a));
    }

    public void lifeCycle(LinkedList<Food> listFood, LinkedList<Coins> listCoins, LinkedList<Guppy> listGuppy) {
        int idx = 0;
    	if (!listFood.isEmpty() && !getIsFull()) {
    		Food closeFood = listFood.get(idx);
    		idx++;
    		while (idx < listFood.getIdx()) {
    			if (distanceTo(closeFood) > distanceTo(listFood.get(idx))) {
    				closeFood = listFood.get(idx);
    			}
    			idx++;
    		}
    		moveToFood(closeFood);
    		if (Math.abs(getX() - closeFood.getX()) < getRadius() && Math.abs(getY() - closeFood.getY()) < getRadius()) {
                setIsFull(true);
                setTime(0);
                setFoodCounter(getFoodCounter() + 1);
    			listFood.remove(closeFood);
    	        setSpeed(1);
    		}
    	} else {
            move();
        }
        if (time >= timeT){
            setIsFull(false);
            setSpeed(1);
        }
        if (time >= timetoDeath) {
            listGuppy.remove(this);
        }
        time++;
        if (time % timeC == 0 && isFull) {
            makeCoins(listCoins);
        }
        if (foodCounter > 0 && (foodCounter == 4 || foodCounter == 8) && getPhase() < getMaxPhase()) {
            grow();
            foodCounter++;
        }
    }

    // setter
    public void setPhase(int phase) {
    	this.phase = phase;
    }

    public void setFoodCounter(int foodCounter) {
    	this.foodCounter = foodCounter;
    }

    // getter
    public int getPhase() {
    	return this.phase;
    }

    public int getFoodCounter() {
    	return this.foodCounter;
    }

    public int getMaxPhase() {
    	return this.maxPhase;
    }

    public int getTimeC() {
        return this.timeC;
    }

    private int phase; // dimulai dari phase 1 hingga phase 3
    private int foodCounter;
    private final int maxPhase = 3; // phase 3
    protected final int timeC = 50;
}