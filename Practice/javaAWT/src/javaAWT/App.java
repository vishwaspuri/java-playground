package javaAWT;
import java.awt.*;

public class App{
	App(){
		Frame f = new Frame();
		Button b = new Button("Submit");
		b.setBounds(100, 100, 50, 50);
		f.add(b);
		f.setSize(300, 300);
		f.setLayout(null);
		f.setVisible(true);
	}
	public static void main(String ...args) {
		App f = new App();
	}
}
