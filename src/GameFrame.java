import javax.swing.JFrame;

public class GameFrame extends JFrame{
	
	GamePanel gp;
	
	GameFrame(){
		super("п║сно╥");
		gp = new GamePanel();
	}
	
	void init(){
		this.setSize(Const.WIDTH,Const.HEIGHT);
		this.setLocation(230,220);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		this.add(gp);
	}

	public static void main(String[] args) {
		new GameFrame().init();
	}

}
