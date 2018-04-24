import java.util.Comparator;

public abstract class Entity implements Comparator<Entity> {
    public Entity() {
        this.x = Math.random() * 90;
        this.y = Math.random() * 90;
        this.speed = 1;
    }

    public Entity(double x, double y) {
        this.x = x;
        this.y = y;
        this.speed = 1;
    }

    @Override
    public int compare(Entity e1, Entity e2) {
        return 0;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Entity) {
            Entity newE = (Entity)obj;
            return (x == newE.getX() && y == newE.getY());
        }
        return false;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public double getX() {
        return this.x;
    }

    public double getY() {
        return this.y;
    }

    public double getSpeed() {
        return this.speed;
    }

    protected double x;
    protected double y;
    protected double speed;
}
