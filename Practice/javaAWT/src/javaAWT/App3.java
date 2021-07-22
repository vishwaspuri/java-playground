package javaAWT;
import java.awt.*;
import java.awt.event.*;

public class App3 extends Frame{
    TextField tf;
    Outer o;
    App3(){
        tf = new TextField();
        tf.setBounds(80, 100, 150, 150);
        Button b = new Button("Click");
        b.setBounds(100, 170, 20, 20);
        o = new Outer(this);
        b.addActionListener(o);
        add(b);
        add(tf);
        setSize(300, 300);
        setLayout(null);
        setVisible(true);
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }
        });
    }
    public static void main(String ...args) {
        new App3();
    }
    
}
