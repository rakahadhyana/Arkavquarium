import java.util.Comparator;

public abstract class Entity implements Comparator<Entity>, Interface {
    /**
     * This Construct abstract object entity with random position.
     */
    public Entity() {
        this.abscissa = Math.random() * Aquarium.getSize();
        this.ordinate = Math.random() * Aquarium.getSize();
        this.speed = 1;
    }

    /**
     * This Construct abstract object entity with specified position.
     * @param abscissa entity's axis
     * @param ordinate entity's ordinate
     */
    public Entity(double abscissa, double ordinate) {
        this.abscissa = abscissa;
        this.ordinate = ordinate;
        this.speed = 1;
    }

    @Override
    public abstract void move();

    @Override
    public int compare(Entity e1, Entity e2) {
        return 0;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Entity) {
            Entity newE = (Entity)obj;
            return (abscissa == newE.getX() && ordinate == newE.getY());
        }
        return false;
    }

    public void setX(double abscissa) {
        this.abscissa = abscissa;
    }

    public void setY(double ordinate) {
        this.ordinate = ordinate;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public double getX() {
        return this.abscissa;
    }

    public double getY() {
        return this.ordinate;
    }

    public double getSpeed() {
        return this.speed;
    }

    protected double abscissa;
    protected double ordinate;
    protected double speed;
}