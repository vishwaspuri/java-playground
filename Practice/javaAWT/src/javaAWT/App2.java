package javaAWT;
import java.awt.*;
import java.awt.event.*;

public class App2 extends Frame implements ActionListener{
    TextField tf;
    App2(){
        tf = new TextField();
        tf.setBounds(80, 100, 50, 50);
        Button b = new Button("Click");
        b.setBounds(100, 150, 20, 20);
        add(tf);
        add(b);
        b.addActionListener(this);
        setSize(300, 300);
        setLayout(null);
        setVisible(true);
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }
        });
    }
    public void actionPerformed(ActionEvent ae){
        tf.setText("NEW AWT");
    }
    public static void main(String ...args){
        App2 a = new App2();
    }
}
