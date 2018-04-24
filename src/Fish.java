/**
 * This class implements the Fish and it inherits Entity class
 * @author Funtastic4
 * @version 1.0
 */
public abstract class Fish extends Entity {
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

    public Fish(double x, double y) {
        super(x, y);
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

    @Override
    public void move() {
        if (Math.abs(getX() - getDestX()) < getRadius() && Math.abs(getY() - getDestY()) < getRadius()) {
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

    public void setIsFull(boolean full) {
        this.isFull = full;
    }

    public void setDirection(Direction direction) {
        this.direction = direction;
    }

    public void setDest(double x, double y) {
        this.destX = x;
        this.destY = y;
    }

    public void setTime(int time) {
    	this.time = time;
    }

    public Direction getDirection() {
        return this.direction;
    }

    public double getDestX() {
        return this.destX;
    }

    public double getDestY() {
        return this.destY;
    }

    public boolean getIsFull() {
        return this.isFull;
    }

    public int getTimeToDeath() {
        return this.timetoDeath;
    }

    public int getRadius() {
        return this.radius;
    }

    public int getTime() {
        return this.time;
    }

    public int getTimeM() {
        return this.timeM;
    }

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