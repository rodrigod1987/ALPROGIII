import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Program {

	public static void main(String[] args) throws IOException {

		ExtraFunctions of = new ExtraFunctions();

		/**
		 * Read the input file
		 */

		String path = new File(".").getCanonicalPath();

		FileReader file = new FileReader(path+"\\"+"file.txt");

		BufferedReader br = new BufferedReader(file);
		
		
		String line = null;

		//read the first line to define the nodes, edges and root
		of.ReadFirstLine(br.readLine());
		while( (line = br.readLine()) != null)
			of.AddToGraph(line);
		br.close();

		of.Execute();

	}

}
