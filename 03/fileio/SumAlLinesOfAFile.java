package fileio;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class SumAlLinesOfAFile {

	public static void main(String[] args) throws IOException {
		if (args.length != 1) {
			System.err.println("Start this program with exactly 1 filename");
			throw new IllegalStateException("Program was started incorrectly");
		}
		File f = new File(args[0]);
		if (!f.exists() || !f.isFile()) {
			System.err.println("Provide a filename to an exisiting file");
			throw new IllegalStateException("Program was started with an incorrect parameter");
		}
		try (BufferedReader bufferedReader = new BufferedReader(new FileReader(f))) {
			int result = 0;
			String readedLine = null;
			while ((readedLine = bufferedReader.readLine()) != null) {
				result += Integer.parseInt(readedLine);
			}
			System.out.println("Final sum is: " + result);
		}
	}
}