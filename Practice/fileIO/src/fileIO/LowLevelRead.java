package fileIO;
import java.io.*;

public class LowLevelRead {
    public static void main(String []args) throws IOException{
        File inFile = new File("sample1.dat");
        FileInputStream inStream = new FileInputStream(inFile);
        int fileSize = (int)inFile.length();
        System.out.println("File size: "+fileSize);
        byte[] byteArray = new byte[fileSize];
        inStream.read(byteArray);
        // Prints ascii values of the content
        for(int i=0; i<fileSize; i++){
            System.out.print(byteArray[i]);
        }
        inStream.close();
    }
}
