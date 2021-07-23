package abstractWT;
import java.awt.event.*;
import java.awt.*;

public class GraphicsDemo extends Frame{
	public GraphicsDemo() {
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent we) {
				System.exit(0);
			}
		});
	}
	
	public void paint(Graphics g) {
		g.drawLine(20, 40, 100, 90);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GraphicsDemo appwin = new GraphicsDemo();
		appwin.setSize(new Dimension(370, 700));
		appwin.setTitle("Graphics Demo");
		appwin.setVisible(true);
	}

}
