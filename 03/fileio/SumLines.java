package fileio;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class SumLines {

	public static void main(String args[]) throws IOException {
		try(BufferedReader lineReader = new BufferedReader(new FileReader(new File("multinums.txt")))) {
			String line = null;
			int bigSum = 0;
			int counter = 0;
			while((line = lineReader.readLine()) != null) {
				++counter;
				String[] numsInLine = line.split(" ");
				int lineSum = 0;
				for(String num : numsInLine) {
					lineSum += Integer.parseInt(num);
				}
				System.out.println(counter+". line adds together to: "+lineSum);
				bigSum += lineSum;
			}
			System.out.println("all nums add together to: "+bigSum);
		}
	}

}
