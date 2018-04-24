import org.junit.Test;

import static org.junit.Assert.*;

public class Piranha extends Fish {
    @Test
    public Piranha() {
        Piranha testP = new Piranha();
        assertEquals(2, testA.getSpeed());
    }
    @Test
    public void makeCoins(LinkedList<Coins> listCoins, Guppy guppy) {
        Piranha testP = new Piranha();
        LinkedList<Coins> listCoins = new LinkedList<>();
        testG.makeCoins(listCoins);
        assertEquals(1, listCoins.getIdx());
    }

    public double distanceTo() {
        Piranha testP = new Piranha();
        Guppy testG = new Guppy();
        testP.setX(testG.getX());
        testP.setY(testG.getY());
        assertEquals(0, testG.distanceTo(testP), 0);
    }

    public void moveToFood() {
        Piranha testP = new Piranha();
        Guppy testG = new Guppy();
        testG.moveToFood(testG);
        assertEquals(3, testG.getSpeed(), 0);
    }

    public void lifeCycle() {
        Piranha testP = new Piranha();
        LinkedList<Piranha> listPiranha = new LinkedList<>();
        Guppy testG = new Guppy();
        LinkedList<Guppy> listGuppy = new LinkedList<>();
        Coins testC = new Coins(13, 14, 100);
        LinkedList<Coins> listCoins = new LinkedList<>();
        testG.lifeCycle(listGuppy, listCoins, listPiranha);
        assertEquals(1, testP.getTime());
    }
}