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
	private BufferedImage aquarium;
	private BufferedImage papan;
	private BufferedImage scroll;
	private BufferedImage ikanb2;
	private BufferedImage pir;
	private BufferedImage snail0;
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
			papan = ImageIO.read(getClass().getResourceAsStream("image/papan.png"));
			scroll = ImageIO.read(getClass().getResourceAsStream("image/scroll.png"));
			ikanb2 = ImageIO.read(getClass().getResourceAsStream("image/ikanb2.png"));
			pir = ImageIO.read(getClass().getResourceAsStream("image/pir.png"));
			snail0 = ImageIO.read(getClass().getResourceAsStream("image/snail0.png"));
		} catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	
	/**
	 * 
	 */
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
