
public class Main {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub\
		boolean running = true;
		Snail snail = new Snail();
		Frame f = new Frame();
		Screen s = new Screen();
		s.setSnail(snail);
		f.add(s);
		f.setVisible(true);
		while(running) {
			snail.setX(snail.getX()+1);
			s.repaint();
			Thread.sleep(200);
		}
	}

}
