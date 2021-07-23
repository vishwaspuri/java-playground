package javaAWT;
import java.awt.event.*;

public class Outer implements ActionListener{
    App3 obj;
    Outer(App3 obj){
        this.obj = obj;
    }
    public void actionPerformed(ActionEvent e){
        obj.tf.setText("YOooooooo");
    }

}
