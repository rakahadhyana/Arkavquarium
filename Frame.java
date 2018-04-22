import javax.swing.JFrame;
import java.awt.event.MouseListener;
import java.awt.event.MouseEvent;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;
/**
 * This class implements the frame of the game. It inherits JFrame class, interface MouseListener
 * and interface KeyListener
 * @author Funtastic4
 * @version 1.0
 */
public class Frame extends JFrame implements MouseListener, KeyListener{
	
	private static final long serialVersionUID = 1L;

	/**
	 * This constructs a frame and set the size of the frame to 1366x768
	 * the title to Akravquarium and call the init() method
	 */
	public Frame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(1366, 768);
		setResizable(false);
		setTitle("Arkavquarium");
		init();
	}
	
	/**
	 * This method 
	 */
	public void init() {
		setLocationRelativeTo(this);
		this.addMouseListener(this);
		this.addKeyListener(this);
	}

	public void mousePressed(MouseEvent e) {
		System.out.println("pressed");
    }
    
    public void mouseReleased(MouseEvent e) {
    	System.out.println("release");
    }
    
    public void mouseEntered(MouseEvent e) {
    	System.out.println("enter");
    }
    
    public void mouseExited(MouseEvent e) {
    	System.out.println("exit");
    }
    
    public void mouseClicked(MouseEvent e) {
    	System.out.println(e.getX());
    }

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyTyped(KeyEvent e) {
		System.out.println(e.getKeyChar());
		// TODO Auto-generated method stub
		
	}
    
    

}
