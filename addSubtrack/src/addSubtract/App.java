package addSubtract;
import java.awt.*;
import java.awt.event.*;

public class App extends Frame implements ActionListener{
    TextField tf1, tf2, tf3;
    Button b1, b2;
    App(){
        addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent we){
                System.exit(0);
            }
        });
        Label l1 = new Label("First Number");
        l1.setBounds(30, 30, 40, 30);
        Label l2 = new Label("Second Number");
        l2.setBounds(30, 60, 40, 30);
        Label l3 = new Label("Result");
        l3.setBounds(30, 90, 60, 30);
        tf1 = new TextField();
        tf1.setBounds(100, 30, 30, 20);
        tf2 = new TextField();
        tf2.setBounds(100, 60, 30, 20);
        tf3 = new TextField();
        tf3.setBounds(100, 90, 30, 20);
        b1 = new Button("+");
        b1.setBounds(50, 130, 30, 30);
        b2 = new Button("-");
        b2.setBounds(90, 130, 30, 30);
        add(l1);add(l2);add(l3);
        add(tf1);add(tf2);add(tf3);
        add(b1);add(b2);
        b1.addActionListener(this);
        b2.addActionListener(this);
        setSize(400, 400);
        setLayout(null);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent ae){
        if(b1.hasFocus()){
            int n1 = Integer.parseInt(tf1.getText());
            int n2 = Integer.parseInt(tf2.getText());
            tf3.setText(Integer.toString(n1+n2));
        } else if(b2.hasFocus())    {
            int n1 = Integer.parseInt(tf1.getText());
            int n2 = Integer.parseInt(tf2.getText());
            tf3.setText(Integer.toString(n1-n2));
        }
    }
    public static void main(String ...args){
        new App();
    }
}
