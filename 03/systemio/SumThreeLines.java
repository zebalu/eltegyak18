package systemio;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SumThreeLines {

	public static void main(String[] args) throws IOException {
		System.out.println("This program asks for 3 numbers in separate lines and sums them.");
		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
			int sum = 0;
			for(int i=0; i<3; ++i) {
				String line = br.readLine();
				sum += Integer.parseInt(line);
			}
			System.out.println("sum: "+sum);
		}
	}
	
}
