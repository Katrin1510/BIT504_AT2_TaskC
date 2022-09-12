import javax.swing.JFrame;



public class Pong1 extends JFrame {
	
	private final static String WINDOW_TITLE = "Pong";
	private final static int WINDOW_WIDTH = 800;
	private final static int WINDOW_HEIGHT = 600;
	
	public Pong1() {
		
	
	setTitle(WINDOW_TITLE);
    setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
	setResizable(true);
	add(new PongPanel1());
	setVisible(true);
	setDefaultCloseOperation(EXIT_ON_CLOSE);
	
    }
	
	public static void main(String[] args) {
		
		javax.swing.SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				new Pong1();
			}
		});
	}

}
