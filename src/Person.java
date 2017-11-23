import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.ImageObserver;

public class Person extends BaseImage{
	
	private int x,y;
	private Image person;
	
	public Person(){
		super();
		this.x=0;
		this.y=0;
		person=loadeImage(Const.PERSONPATH);
	}
	
	public Person(int x,int y){
		super();
		this.x=x;
		this.y=y;
		person=loadeImage(Const.PERSONPATH);
	}
	public void draw(Graphics g,ImageObserver io){
		g.drawImage(person, x*Const.BLOCK, y*Const.BLOCK, Const.BLOCK,Const.BLOCK,io);
	}
	public void move(int direction){
		if(direction == Const.LEFT){
			this.x--;
		}else if(direction == Const.RIGHT){
			this.x++;
		}else if(direction == Const.UP){
			this.y--;
		}else if(direction == Const.DOWN){
			this.y++;
		}
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}
	
	
	
}
