package systemio;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SimpleRead {
	
	public static void main(String[] args) throws IOException {
		System.out.println("Write in anything, this program echos it back!");
		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
			String line = br.readLine();
			System.out.println(line);
		}
	}
	
}