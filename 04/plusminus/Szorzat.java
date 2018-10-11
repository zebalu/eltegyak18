package plusminus;

import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

import java.io.PrintWriter;


public class Szorzat {
	
	public static void main(String[] args) throws IOException {
		System.out.println("Adj meg 2 szamot:");
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String as = br.readLine();
		String bs = br.readLine();
		
		int a = Integer.parseInt(as);
		int b = Integer.parseInt(bs);
		
		System.out.println("Szorzat: "+(a*b));
		PrintWriter pw = new 
			PrintWriter("output.txt");
		pw.println("Szorzat: "+(a*b));
		pw.flush();
		pw.close();
	}
	
}