import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class Screen extends JPanel {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * All images used
	 */
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
	
	private Snail snail;
	
	public Snail getSnail() {
		return snail;
	}

	public void setSnail(Snail snail) {
		this.snail = snail;
	}

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
			PiranhaDeadLeft = ImageIO.read(getClass().getResourceAsStream("image/PiranhaDeadLeft.png"));
			PiranhaDeadRight = ImageIO.read(getClass().getResourceAsStream("image/PiranhaDeadRight.png"));
			PiranhaLeft = ImageIO.read(getClass().getResourceAsStream("image/PiranhaLeft.png"));
			PiranhaRight = ImageIO.read(getClass().getResourceAsStream("image/PiranhaDeadRight.png"));
			PiranhaSickLeft = ImageIO.read(getClass().getResourceAsStream("image/PiranhaSickLeft.png"));
			PiranhaSickRight = ImageIO.read(getClass().getResourceAsStream("image/PiranhaSickRight.png"));
			pir = ImageIO.read(getClass().getResourceAsStream("image/pir.png"));
			snail0 = ImageIO.read(getClass().getResourceAsStream("image/snail0.png"));
			snail1 = ImageIO.read(getClass().getResourceAsStream("image/snail1.png"));
			youlose = ImageIO.read(getClass().getResourceAsStream("image/youlose.png"));
			youwin = ImageIO.read(getClass().getResourceAsStream("image/YOUWIN.png"));
			coin = ImageIO.read(getClass().getResourceAsStream("image/coin.png"));
		} catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	
	public void paint(Graphics g) {
		g.drawImage(aquarium, 0, 0, this.getWidth(), this.getHeight(), null);
		g.drawImage(papan, 760, -25, papan.getWidth(), papan.getHeight(), null);
		g.drawImage(papan, 960, -25, papan.getWidth(), papan.getHeight(), null);
		g.drawImage(papan, 1160, -25, papan.getWidth(), papan.getHeight(), null);
		g.drawImage(scroll, 0, 0, scroll.getWidth(), scroll.getHeight(), null);
		g.drawImage(ikanb2, 800, 75, ikanb2.getWidth(), ikanb2.getHeight(), null);
		g.drawImage(pir, 970, 75, pir.getWidth(), pir.getHeight(), null);
		g.drawImage(snail0, (int)(snail.getX()*1366/100), (int)(snail.getY()*650/100), snail0.getWidth(), snail0.getHeight(), null);
	}

}
