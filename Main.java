import java.util.Random;
import javax.swing.JFrame;
import java.awt.event.MouseListener;
import java.awt.event.MouseEvent;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;
public class Main{
	
	private static LinkedList<Coins> ListCoin = new LinkedList<Coins>();
	private static LinkedList<Food> ListFood = new LinkedList<Food>();
	private static LinkedList<Guppy> ListGuppy = new LinkedList<Guppy>();
	private static LinkedList<Piranha> ListPiranha = new LinkedList<Piranha>();
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub\
		boolean running = true;
		Snail snail = new Snail();
		Frame f = new Frame();
		Screen s = new Screen();
		Random rand = new Random();
		s.setListCoin(ListCoin);
		s.setSnail(snail);
		s.setListFood(ListFood);
		s.setListGuppy(ListGuppy);
		s.setListPiranha(ListPiranha);
		f.add(s);
		f.setVisible(true);
		while(running) {
			int j = 0;
			if(f.getInputKey().size() != 0) {
				Coins coin = new Coins(rand.nextInt(100), 0, 100);
				ListCoin.add(coin);
			}
			if(f.getInputMouse().size() != 0) {
				if ((f.getMouseX() < 932 && f.getMouseX() > 774) && (f.getMouseY() < 196 && f.getMouseY() > 116)) {
					Guppy guppy = new Guppy();
					ListGuppy.add(guppy);
				} else if ((f.getMouseX() < 1136 && f.getMouseX() > 974) && (f.getMouseY() < 196 && f.getMouseY() > 116)) {
					Piranha piranha = new Piranha();
					ListPiranha.add(piranha);
				} else {
					Food food = new Food(f.getMouseX()/14, f.getMouseY()/8);
					ListFood.add(food);
				}
			}
			while (!ListCoin.isEmpty() && j < ListCoin.getIdx()) {
				ListCoin.get(j).lifeCycle();
				j++;
			}
			j = 0;
			while (!ListPiranha.isEmpty() && j < ListPiranha.getIdx()) {
				ListPiranha.get(j).lifeCycle(ListGuppy, ListCoin, ListPiranha);
				j++;
			}
			j = 0;
			while (!ListGuppy.isEmpty() && j < ListGuppy.getIdx()) {
				ListGuppy.get(j).lifeCycle(ListFood, ListCoin, ListGuppy);
				j++;
			}
			j = 0;
			while (!ListFood.isEmpty() && j < ListFood.getIdx()) {
				System.out.println("index food j :" + j);
				ListFood.get(j).lifeCycle(ListFood);
				j++;
			}
			snail.lifeCycle(ListCoin);
			f.getInputKey().clear();
			f.getInputMouse().clear();
			s.repaint();
			Thread.sleep(100);
		}
	}
}
