package fileIO;
import javax.swing.JFileChooser;
import java.io.*;

public class Main {
    public static void main(String ...args){
        JFileChooser chooser = new JFileChooser();
        File file, directory;
        int status;
        status = chooser.showOpenDialog(null);
        if(status == JFileChooser.APPROVE_OPTION){
            file = chooser.getSelectedFile();
            directory = chooser.getCurrentDirectory();
            System.out.println("Directory: "+directory.getName());
            System.out.println("File selected to be opened: "+file.getName());
            System.out.println("Full path: "+file.getAbsolutePath());
        } else {
            System.out.println("Couldn't open file");
        }
    }
}
