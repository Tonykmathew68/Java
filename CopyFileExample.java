import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopyFileExample
{
	public static void main(String args[])
	{
		String sourceFile="/home/s2mcabatch2/Desktop/tony55/day/abc.txt";
		String destinationFile="/home/s2mcabatch2/Desktop/tony55/day/abcd.txt";
		
		try{
			FileReader reader=new FileReader(sourceFile);
			FileWriter writer=new FileWriter(destinationFile);
			int content;
			while((content=reader.read()) !=-1)
			{
				writer.write(content);
			}
		reader.close();
		writer.close();
		System.out.println("File copied successfully");
		}

		catch(IOException e){
			e.printStackTrace();
		}
	}
}
