package fileIO;
import java.io.*;

public class HighLevelWrite{
    public static void main(String ...args) throws IOException{
        File outFile = new File("sample2.dat");
        FileOutputStream outStream = new FileOutputStream(outFile);
        DataOutputStream outDataStream = new DataOutputStream(outStream);
        // Writing primitive data types to output stream
        outDataStream.writeInt(987654321);
        outDataStream.writeUTF("hello world");
        outDataStream.writeFloat(222222222F);
        outDataStream.writeBoolean(true);
        outDataStream.close();
        outStream.close();
    }
}