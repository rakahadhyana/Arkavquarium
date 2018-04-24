import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JPanel;
import java.awt.Font;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;

/**
 * Attributes/objects that want to be shown in the screen
 */
public class Screen extends JPanel {
	
	private static final long serialVersionUID = 1L;
	private BufferedImage aquarium;
	private BufferedImage mainMenu;
	private BufferedImage foodie;
	private BufferedImage diamond;
	private BufferedImage eggos1;
	private BufferedImage eggos2;
	private BufferedImage eggos3;
	private BufferedImage papan;
	private BufferedImage scroll;
	private BufferedImage ikanb;
	private BufferedImage ikanb1;
	private BufferedImage ikanb2;
	private BufferedImage ikanbflip;
	private BufferedImage ikanb1flip;
	private BufferedImage ikanb2flip;
	private BufferedImage ikanlaper;
	private BufferedImage ikanlaper1;
	private BufferedImage ikanlaper2;
	private BufferedImage ikanlaperflip;
	private BufferedImage ikanlaper1flip;
	private BufferedImage ikanlaper2flip;
	private BufferedImage PiranhaDeadLeft;
	private BufferedImage PiranhaDeadRight;
	private BufferedImage PiranhaLeft;
	private BufferedImage PiranhaRight;
	private BufferedImage PiranhaSickLeft;
	private BufferedImage PiranhaSickRight;
	private BufferedImage pir;
	private BufferedImage snail0;
	private BufferedImage snail1;
	private BufferedImage youlose;
	private BufferedImage youwin;
	private BufferedImage coin;
	private BufferedImage background;
	private Snail snail;
	private LinkedList<Coins> ListCoin = new LinkedList<Coins>();
	private LinkedList<Guppy> ListGuppy = new LinkedList<Guppy>();
	private LinkedList<Piranha> ListPiranha = new LinkedList<Piranha>();
	private LinkedList<Food> ListFood = new LinkedList<Food>();
	/**
	 * This method returns the current list of coins
	 * @return List of coins
	 */	
	public LinkedList<Coins> getListCoin() {
		return ListCoin;
	}
	/**
	 * This method sets this' list of coin to the input parameter
	 * @param listCoin
	 */
	public void setListCoin(LinkedList<Coins> listCoin) {
		ListCoin = listCoin;
	}
	/**
	 * This method returns the current list of guppy 
	 * @return List of guppy
	 */
	public LinkedList<Guppy> getListGuppy() {
		return ListGuppy;
	}
	/**
	 * This method sets this' list of guppy to the input parameter
	 * @param listGuppy
	 */
	public void setListGuppy(LinkedList<Guppy> listGuppy) {
		ListGuppy = listGuppy;
	}
	/**
	 * This method returns the current list of piranha
	 * @return List of piranha
	 */
	public LinkedList<Piranha> getListPiranha() {
		return ListPiranha;
	}
	/**
	 * This method sets this' list of piranha to the input parameter
	 * @param listPiranha
	 */
	public void setListPiranha(LinkedList<Piranha> listPiranha) {
		ListPiranha = listPiranha;
	}
	/**
	 * This method returns the current list of food
	 * @return List of food
	 */
	public LinkedList<Food> getListFood() {
		return ListFood;
	}
	/**
	 * This method sets this' list of food to the input parameter
	 * @param listFood
	 */	
	public void setListFood(LinkedList<Food> listFood) {
		ListFood = listFood;
	}
	/**
	 * This method returns this' snail object
	 * @return snail
	 */
	public Snail getSnail() {
		return snail;
	}
	/**
	 * This method sets this' snail object to the input parameter
	 * @param snail
	 */
	public void setSnail(Snail snail) {
		this.snail = snail;
	}
	/**
	 * This method initiates each attribute with the corresponding image
	 */
	public Screen() {
		try {
			aquarium = ImageIO.read(getClass().getResourceAsStream("image/aquarium1.jpg"));
			mainMenu = ImageIO.read(getClass().getResourceAsStream("image/MainMenu.png"));
			diamond = ImageIO.read(getClass().getResourceAsStream("image/Diamond.png"));
			foodie = ImageIO.read(getClass().getResourceAsStream("image/foodie.png"));
			eggos1 = ImageIO.read(getClass().getResourceAsStream("image/eggos1.png"));
			eggos2 = ImageIO.read(getClass().getResourceAsStream("image/eggos2.png"));
			eggos3 = ImageIO.read(getClass().getResourceAsStream("image/eggos3.png"));
			papan = ImageIO.read(getClass().getResourceAsStream("image/papan.png"));
			scroll = ImageIO.read(getClass().getResourceAsStream("image/scroll.png"));
			ikanb = ImageIO.read(getClass().getResourceAsStream("image/ikanb.png"));
			ikanb1 = ImageIO.read(getClass().getResourceAsStream("image/ikanb1.png"));
			ikanb2 = ImageIO.read(getClass().getResourceAsStream("image/ikanb2.png"));
			ikanbflip = ImageIO.read(getClass().getResourceAsStream("image/ikanbflip.png"));
			ikanb1flip = ImageIO.read(getClass().getResourceAsStream("image/ikanb1flip.png"));
			ikanb2flip = ImageIO.read(getClass().getResourceAsStream("image/ikanb2flip.png"));
			ikanlaper = ImageIO.read(getClass().getResourceAsStream("image/ikanlaper.png"));
			ikanlaper1 = ImageIO.read(getClass().getResourceAsStream("image/ikanlaper1.png"));
			ikanlaper2 = ImageIO.read(getClass().getResourceAsStream("image/ikanlaper2.png"));
			ikanlaperflip = ImageIO.read(getClass().getResourceAsStream("image/ikanlaperflip.png"));
			ikanlaper1flip = ImageIO.read(getClass().getResourceAsStream("image/ikanlaper1flip.png"));
			ikanlaper2flip = ImageIO.read(getClass().getResourceAsStream("image/ikanlaper2flip.png"));
			PiranhaLeft = ImageIO.read(getClass().getResourceAsStream("image/PiranhaLeft.png"));
			PiranhaRight = ImageIO.read(getClass().getResourceAsStream("image/PiranhaRight.png"));
			PiranhaSickLeft = ImageIO.read(getClass().getResourceAsStream("image/PiranhaSickLeft.png"));
			PiranhaSickRight = ImageIO.read(getClass().getResourceAsStream("image/PiranhaSickRight.png"));
			pir = ImageIO.read(getClass().getResourceAsStream("image/pir.png"));
			snail0 = ImageIO.read(getClass().getResourceAsStream("image/snail0.png"));
			snail1 = ImageIO.read(getClass().getResourceAsStream("image/snail1.png"));
			youlose = ImageIO.read(getClass().getResourceAsStream("image/youlose.png"));
			youwin = ImageIO.read(getClass().getResourceAsStream("image/YOUWIN.png"));
			coin = ImageIO.read(getClass().getResourceAsStream("image/coin.png"));
			background = ImageIO.read(getClass().getResourceAsStream("image/aquarium.jpg"));
		} catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	/**
	 * This method displays all the images that have been initiated to the screen
	 */
	public void paint(Graphics g) {
		if(Main.mainmenu == true) {
			g.drawImage(background, 0, 0, this.getWidth(), this.getHeight(), null);
			g.drawImage(mainMenu, 0, 0, null);
		}else if(Main.lose){
			g.drawImage(background, 0, 0, this.getWidth(), this.getHeight(), null);
			g.drawImage(youlose, 0, 0, null);
		}else if(Main.win) {
			g.drawImage(background, 0, 0, this.getWidth(), this.getHeight(), null);
			g.drawImage(youwin, 0, 0, null);
		}
		else{
			g.drawImage(aquarium, 0, 0, this.getWidth(), this.getHeight(), null);
			g.drawImage(papan, 760, -25, papan.getWidth(), papan.getHeight(), null);
			g.drawImage(papan, 960, -25, papan.getWidth(), papan.getHeight(), null);
			g.drawImage(papan, 1160, -25, papan.getWidth(), papan.getHeight(), null);
			g.drawImage(scroll, 0, 0, scroll.getWidth(), scroll.getHeight(), null);
			g.drawImage(ikanb2, 800, 75, ikanb2.getWidth(), ikanb2.getHeight(), null);
			g.drawImage(pir, 970, 75, pir.getWidth(), pir.getHeight(), null);
			if(snail.getDirection() == Direction.RIGHT ) {
				g.drawImage(snail0, (int)(snail.getX()*1366/100 - snail0.getWidth()/2), (int)(snail.getY()*650/100), snail0.getWidth(), snail0.getHeight(), null);
			}else {
				g.drawImage(snail1, (int)(snail.getX()*1366/100 - snail1.getWidth()/2), (int)(snail.getY()*650/100), snail1.getWidth(), snail1.getHeight(), null);
			}
			
			if (Main.egg == 0) {
				g.drawImage(eggos1, 1217, 87, eggos1.getWidth(), eggos1.getHeight(), null);
			} else if (Main.egg == 1) {
				g.drawImage(eggos2, 1217, 87, eggos1.getWidth(), eggos2.getHeight(), null);
			} else {
				g.drawImage(eggos3, 1217, 87, eggos1.getWidth(), eggos3.getHeight(), null);
			}
			
			
			int i = 0;
			while (!ListCoin.isEmpty() && i < ListCoin.getIdx()) {
				g.drawImage(coin, (int)(ListCoin.get(i).getX()*1366/100 - coin.getWidth()/2), (int)(ListCoin.get(i).getY()*768/100 - coin.getHeight()/2), coin.getWidth(), coin.getHeight(), null);
				i++;
			}
			
			
			i =0;
			while (!ListFood.isEmpty() && i < ListFood.getIdx()) {
				if(ListFood.get(i) != null) {
					g.drawImage(foodie, (int)(ListFood.get(i).getX()*1366/100 - foodie.getWidth()/2), (int)(ListFood.get(i).getY()*768/100 - foodie.getHeight()/2), foodie.getWidth(), foodie.getHeight(), null);
				}
				i++;
			}
			
			i =0;
			while (!ListGuppy.isEmpty() && i < ListGuppy.getIdx()) {
				if (ListGuppy.get(i).getDirection() == Direction.RIGHT) {
			        if(!ListGuppy.get(i).getIsFull()){
			            if (ListGuppy.get(i).getPhase() == 1){
			            	g.drawImage(ikanlaper2flip, (int)(ListGuppy.get(i).getX()*1300/100), (int)(ListGuppy.get(i).getY()*700/100), ikanlaper2flip.getWidth(), ikanlaper2flip.getHeight(), null);
			            } else 
			            if (ListGuppy.get(i).getPhase() == 2) {
			            	g.drawImage(ikanlaper1flip, (int)(ListGuppy.get(i).getX()*1300/100), (int)(ListGuppy.get(i).getY()*700/100), ikanlaper1flip.getWidth(), ikanlaper1flip.getHeight(), null);              
			            } else  {
			            	g.drawImage(ikanlaperflip, (int)(ListGuppy.get(i).getX()*1300/100), (int)(ListGuppy.get(i).getY()*700/100), ikanlaperflip.getWidth(), ikanlaperflip.getHeight(), null);
			            }
			        }else{
			            if (ListGuppy.get(i).getPhase() == 1) {
			            	g.drawImage(ikanb2flip, (int)(ListGuppy.get(i).getX()*1300/100), (int)(ListGuppy.get(i).getY()*700/100), ikanb2flip.getWidth(), ikanb2flip.getHeight(), null);
			            } else
			            if (ListGuppy.get(i).getPhase() == 2) {
			            	g.drawImage(ikanb1flip, (int)(ListGuppy.get(i).getX()*1300/100), (int)(ListGuppy.get(i).getY()*700/100), ikanb1flip.getWidth(), ikanb1flip.getHeight(), null);
			            } else {
			            	g.drawImage(ikanbflip, (int)(ListGuppy.get(i).getX()*1300/100), (int)(ListGuppy.get(i).getY()*700/100), ikanbflip.getWidth(), ikanbflip.getHeight(), null);               
			            }
			        }
				} else {
					if(!ListGuppy.get(i).getIsFull()){
			            if (ListGuppy.get(i).getPhase() == 1){
			            	g.drawImage(ikanlaper2, (int)(ListGuppy.get(i).getX()*1300/100), (int)(ListGuppy.get(i).getY()*700/100), ikanlaper2.getWidth(), ikanlaper2.getHeight(), null);
			            } else 
			            if (ListGuppy.get(i).getPhase() == 2) {
			            	g.drawImage(ikanlaper1, (int)(ListGuppy.get(i).getX()*1300/100), (int)(ListGuppy.get(i).getY()*700/100), ikanlaper1.getWidth(), ikanlaper1.getHeight(), null);               
			            } else  {
			            	g.drawImage(ikanlaper, (int)(ListGuppy.get(i).getX()*1300/100), (int)(ListGuppy.get(i).getY()*700/100), ikanlaper.getWidth(), ikanlaper.getHeight(), null);
			            }
			        }else{
			            if (ListGuppy.get(i).getPhase() == 1) {
			            	g.drawImage(ikanb2, (int)(ListGuppy.get(i).getX()*1300/100), (int)(ListGuppy.get(i).getY()*700/100), ikanb2.getWidth(), ikanb2.getHeight(), null);
			            } else
			            if (ListGuppy.get(i).getPhase() == 2) {
			            	g.drawImage(ikanb1, (int)(ListGuppy.get(i).getX()*1300/100), (int)(ListGuppy.get(i).getY()*700/100), ikanb1.getWidth(), ikanb1.getHeight(), null);               
			            } else {
			            	g.drawImage(ikanb, (int)(ListGuppy.get(i).getX()*1300/100), (int)(ListGuppy.get(i).getY()*700/100), ikanb.getWidth(), ikanb.getHeight(), null);               
			            }
			        }
				}
				i++;
			}
			
			
			i =0;
			while (!ListPiranha.isEmpty() && i < ListPiranha.getIdx()) {
				if (ListPiranha.get(i).getDirection() == Direction.RIGHT) {
			        if(!ListPiranha.get(i).getIsFull()){
			        	g.drawImage(PiranhaSickRight, (int)(ListPiranha.get(i).getX()*1366/100), (int)(ListPiranha.get(i).getY()*700/100), PiranhaRight.getWidth(), PiranhaRight.getHeight(), null);
			        }else{
			        	g.drawImage(PiranhaRight, (int)(ListPiranha.get(i).getX()*1366/100), (int)(ListPiranha.get(i).getY()*700/100), PiranhaRight.getWidth(), PiranhaRight.getHeight(), null);
			        }
				} else {
					if(!ListPiranha.get(i).getIsFull()){
						g.drawImage(PiranhaSickLeft, (int)(ListPiranha.get(i).getX()*1366/100), (int)(ListPiranha.get(i).getY()*700/100), PiranhaRight.getWidth(), PiranhaRight.getHeight(), null);
			        }else{
			        	g.drawImage(PiranhaLeft, (int)(ListPiranha.get(i).getX()*1366/100), (int)(ListPiranha.get(i).getY()*700/100), PiranhaRight.getWidth(), PiranhaRight.getHeight(), null);
			        }
				}
				i++;
			}
			
			Graphics2D g2 = (Graphics2D)g;
			Graphics2D g5 = (Graphics2D)g;
			Graphics2D g6 = (Graphics2D)g;
			g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
	        g5.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
	        g6.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
	        Font fontmoney = new Font("Monospaced", Font.BOLD, 38);
	        Font fontmoneyred = new Font("Monospaced", Font.BOLD, 38);
	        Font fontpiranha = new Font("Monospaced", Font.BOLD, 20);
	        Font fontguppy = new Font("Monospaced", Font.BOLD, 20);
	        Font fonteggos = new Font("Monospaced", Font.BOLD, 20);
	        Font fontpressX = new Font("Plain", Font.BOLD, 14);
	        g2.setFont(fontmoney);
	        g6.setFont(fontmoneyred);
	        if(Main.moneyLess) {
	        	g6.setColor(Color.RED);
	        	g6.drawString("MONEY", 110, 61);
		        g6.drawString(Coins.money.toString(), 120, 100);
	        	Main.moneyLess = false;
	        	g6.setColor(Color.BLACK);
	        }else {
		        g2.drawString("MONEY", 110, 61);
		        g2.drawString(Coins.money.toString(), 120, 100);
	        }
	        g2.setFont(fontpiranha);
	        g2.drawString("1000", 1024, 170);
	        g2.setFont(fontguppy);
	        g2.drawString("500", 833, 170);
	        g2.setFont(fonteggos);
	        g2.drawString(Main.eggPrice.toString(), 1221, 170);
	        g5.setFont(fontpressX);
	        g5.drawString("Press X to exit", 107, 124);

		}
	}
}