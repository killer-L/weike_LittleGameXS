import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class GamePanel extends JPanel implements KeyListener{

	Person person;
	Map map;

	GamePanel() {
		person = new Person(1, 1);
		map = new Map();
		this.setFocusable(true);
		this.addKeyListener(this);
	}

	public void paint(Graphics g) {

		super.paint(g);
		map.draw(g, this);
		person.draw(g, this);

	}

	@Override
	public void keyPressed(KeyEvent e) {
		int keycode=e.getKeyCode();
		if(keycode==KeyEvent.VK_RIGHT){
			if(map.moveable(person.getX()+1, person.getY())){
				person.move(Const.RIGHT);
			}
		}
		else if(keycode==KeyEvent.VK_LEFT){
			if(map.moveable(person.getX()-1, person.getY())){
			person.move(Const.LEFT);
		}
		}else if(keycode==KeyEvent.VK_UP){
			if(map.moveable(person.getX(), person.getY()-1)){
		
			person.move(Const.UP);
}
		}else if(keycode==KeyEvent.VK_DOWN){
			if(map.moveable(person.getX(), person.getY()+1)){
		
			person.move(Const.DOWN);
}
		}this.repaint();
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

		


	
	

}
