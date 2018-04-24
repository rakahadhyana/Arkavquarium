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
	public static boolean mainmenu = true;
	public static int egg;
	public static int eggPrice;
	public static boolean lose = false;
	public static boolean win = false;
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub\
		boolean running = true;
		boolean getCoin = false;
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
			while(mainmenu) {
				if(f.getInputMouse().size() != 0) { //New Game
					if ((f.getMouseX() < 490 && f.getMouseX() > 251) && (f.getMouseY() < 533 && f.getMouseY() > 395)) {
						System.out.println("Masuk");
						mainmenu = false;
						Coins.money = 50000;
						egg = 0;
						eggPrice = 10000;
					}
				}
				f.getInputMouse().clear();
				s.repaint();
				Thread.sleep(100);
			}
			while(lose) {
				
			}
			while(win) {
				
			}
			int j = 0;
			if(f.getInputKey().size() != 0) {
				if(f.getKeyChar() == 'c') {
					Coins coin = new Coins(rand.nextInt(100), 0, 100);
					ListCoin.add(coin);
				}else
				if(f.getKeyChar() == 'x') {
					mainmenu = true;
				}
				f.getInputKey().clear();
			}
			if(f.getInputMouse().size() != 0) {
				if ((f.getMouseX() < 932 && f.getMouseX() > 774) && (f.getMouseY() < 196 && f.getMouseY() > 116)) {
					if(Coins.money >= 200) {
						Coins.money -= 200;
						Guppy guppy = new Guppy();
						ListGuppy.add(guppy);
					}
				} else if ((f.getMouseX() < 1136 && f.getMouseX() > 974) && (f.getMouseY() < 196 && f.getMouseY() > 116)) {
					if(Coins.money >= 1000) {
						Coins.money -= 1000;
						Piranha piranha = new Piranha();
						ListPiranha.add(piranha);
					}
				} else if ((f.getMouseX() < 1328 && f.getMouseX() > 1173) && (f.getMouseY() < 196 && f.getMouseY() > 116)) {
					if(Coins.money >= eggPrice) {
						Coins.money -= eggPrice;
						egg ++;
						eggPrice += 5000;
					}
				} else {
					if(!ListCoin.isEmpty()) {
						int i = 0;
						while(i < ListCoin.getIdx() && !getCoin) {
							if(Math.abs(ListCoin.get(i).getX() - f.getMouseX()/13) <= 5 && Math.abs(ListCoin.get(i).getY() - f.getMouseY()/8) <= 5) {
								Coins.money += ListCoin.get(i).getValue();
								ListCoin.remove(ListCoin.get(i));
								getCoin = true;
							}
							i++;
						}
					}
					if(!getCoin) {
						if(Coins.money >= 20) {
							Coins.money -= 20;
							Food food = new Food(f.getMouseX()/13.66, f.getMouseY()/7.68);
							ListFood.add(food);
						}
					}
					getCoin = false;
				}
				f.getInputMouse().clear();
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
				ListFood.get(j).lifeCycle(ListFood);
				j++;
			}
			snail.lifeCycle(ListCoin);
			if(ListGuppy.isEmpty() && ListPiranha.isEmpty() && ListCoin.isEmpty() && Coins.money < 200) {
				lose = true;
			}
			if(egg == 3) {
				win = true;
			}
			s.repaint();
			Thread.sleep(100);
		}
	}
}
