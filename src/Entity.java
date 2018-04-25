// TODO: Auto-generated Javadoc
/**
 * This class implements coins and inherit Entity class.
 * @author Funtastic4
 * @version 1.0
 */

import java.util.Comparator;

public abstract class Entity implements Comparator<Entity>, Interface {
    /**
     * This constructs an entity with a random (abscissa,ordinate) position.
     * and specified speed
     */
    public Entity() {
        this.abscissa = Math.random() * Aquarium.getSize();
        this.ordinate = Math.random() * Aquarium.getSize();
        this.speed = 1;
    }

    /**
     * This constructs a coin with a specified (abscissa,y) position.
     * and value
     * @param abscissa coin's axis
     * @param ordinate coin's ordinate
     * @param value coin's value
     */
    public Entity(double abscissa, double ordinate) {
        this.abscissa = abscissa;
        this.ordinate = ordinate;
        this.speed = 1;
    }

    /**
     * Entity move procedure.
     */
    @Override
    public abstract void move();

    /**
     * Entity compare procedure.
     * @param e1 first Entity to compare
     * @param e2 second Entity to compare
     * @return 0
     */
    @Override
    public int compare(Entity e1, Entity e2) {
        return 0;
    }

    /**
     *
     * @param Object to equal
     * @return boolean
     */
    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Entity) {
            Entity newE = (Entity)obj;
            return (abscissa == newE.getX() && ordinate == newE.getY());
        }
        return false;
    }

    /**
     * set Entity's abscissa value procedure
     * @param new abscissa value
     */
    public void setX(double abscissa) {
        this.abscissa = abscissa;
    }

    /**
     * set Entity's ordinate value procedure
     * @param new ordinate value
     */
    public void setY(double ordinate) {
        this.ordinate = ordinate;
    }

    /**
     * set Entity's speed value procedure
     * @param new speed value
     */
    public void setSpeed(double speed) {
        this.speed = speed;
    }

    /**
     * get Entity's abscissa function
     * @return abscissa value
     */
    public double getX() {
        return this.abscissa;
    }

    /**
     * get Entity's ordinate function
     * @return ordinate value
     */
    public double getY() {
        return this.ordinate;
    }

    /**
     * get Entity's speed function
     * @return speed value
     */
    public double getSpeed() {
        return this.speed;
    }

    protected double abscissa;
    protected double ordinate;
    protected double speed;
}
