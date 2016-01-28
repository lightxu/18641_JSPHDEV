/*
 * Binary Streams and buffers
 */

import java.io.*;

public class Program4 {
	public static void main(String[] args) {

		File f;
		FileOutputStream fos = null;
		String s = "The quick brown fox jumped over the sleeping orange cat";

		try {
			f = new File("binary.txt");
			fos = new FileOutputStream(f);
			fos.write(s.getBytes());
			
			fos.flush();
			fos.close();
			System.out.println("Done writing to file binary.txt");
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (fos != null) {
					fos.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}