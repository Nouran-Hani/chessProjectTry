package trying;

//import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JFrame;


public class Frame extends JFrame {
	
	Frame(){
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("chessGame");
		//this.setDefaultLookAndFeelDecorated(true);

		
		ImageIcon image = new ImageIcon("logo.jpg");
		this.setIconImage(image.getImage());
		
	}

}
