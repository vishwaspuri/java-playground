package fileIO;
import java.io.*;

public class LowLevelWrite {
    public static void main(String ...args) throws IOException{
        File outFile = new File("sample1.dat");
        FileOutputStream outStream = new FileOutputStream(outFile);
        byte[] ba = {'a', 'b', 'c', 'd'};
        outStream.write(ba);
        outStream.close();
    }
}
