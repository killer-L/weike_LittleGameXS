import java.awt.Image;

import javax.swing.ImageIcon;

public class BaseImage {

	public Image loadeImage(String path){
		ImageIcon icon = new ImageIcon(getClass().getResource(path));
		Image img = icon.getImage();
		return img;
	}
 
}
