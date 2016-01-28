/*
 * Text Streams and Buffers
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Program3 {
	public static void main(String[] args) {
		try {
			
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Please enter input, type 'exit' to quit program:");
			String s = br.readLine();
            
            
			while (!s.equalsIgnoreCase("exit")) {
				
				System.out.println("You entered: " + s);
				s = br.readLine();
			}

			System.out.println("Done.");
			br.close();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
