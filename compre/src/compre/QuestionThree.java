package compre;
import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class QuestionThree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			File file = new File("demo.txt");
			FileReader fr = new FileReader(file);
			BufferedReader br = new BufferedReader(fr);
			String content =  br.readLine();
			fr.close();
			String regex = "\\b(\\w+)(?:\\W+\\1\\b)+";
			Pattern p = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
			Matcher m = p.matcher(content);
			while(m.find())	{
				content = content.replaceAll(m.group(), m.group(1));
			}
			FileWriter fw = new FileWriter(file, false);
			fw.write(content);
			fw.close();
		} catch (IOException e) {
			System.out.println("Couldn't open file");
		}
	}

}
