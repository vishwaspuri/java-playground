package fileIO;
import java.io.*;

public class HighLevelRead {
    public static void main(String ...args) throws FileNotFoundException, IOException{
        File inFile = new File("sample2.dat");
        FileInputStream inputStream = new FileInputStream(inFile);
        DataInputStream dataInputStream = new DataInputStream(inputStream);
        System.out.println(dataInputStream.readInt());
        dataInputStream.close();
        inputStream.close();
    }
}
