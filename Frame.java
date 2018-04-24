import javax.swing.JFrame;
import java.awt.event.MouseListener;
import java.util.ArrayList;
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
	private ArrayList<Integer> inputKey = new ArrayList<Integer>();
	private ArrayList<Integer> inputMouse = new ArrayList<Integer>();
	private int mouseX;
	private int mouseY;
	private char keyChar;



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
	
	

	public ArrayList<Integer> getInputMouse() {
		return inputMouse;
	}

	public void setInputMouse(ArrayList<Integer> inputMouse) {
		this.inputMouse = inputMouse;
	}

	public int getMouseX() {
		return mouseX;
	}

	public void setMouseX(int mouseX) {
		this.mouseX = mouseX;
	}

	public int getMouseY() {
		return mouseY;
	}

	public void setMouseY(int mouseY) {
		this.mouseY = mouseY;
	}

	public void mousePressed(MouseEvent e) {
    	inputMouse.add(1);
    	System.out.println(e.getX());
    	System.out.println(e.getY());
    	mouseX = e.getX();
    	mouseY = e.getY();
    }
    
    public void mouseReleased(MouseEvent e) {
//    	System.out.println("release");
    }
    
    public void mouseEntered(MouseEvent e) {
//    	System.out.println("enter");
    }
    
    public void mouseExited(MouseEvent e) {
//    	System.out.println("exit");
    }
    
    public void mouseClicked(MouseEvent e) {

    }

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		inputKey.add(1);
		keyChar = e.getKeyChar();
	}

	public ArrayList<Integer> getInputKey() {
		return inputKey;
	}

	public void setInputKey(ArrayList<Integer> inputKey) {
		this.inputKey = inputKey;
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
	
	public char getKeyChar() {
		return keyChar;
	}
    
    

}
