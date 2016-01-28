/*
 * Reflection
 */

import java.lang.reflect.*;

public class Program7 {
	public static void main(String[] args) {
		try {
			Class c = Class.forName("java.util.Random");

			Method[] method = c.getMethods();
			for (int i = 0; i < method.length; i++) {
				System.out.println("-----------------");
				Method currentMethod = method[i];
				System.out.println(currentMethod.toString());
				Class[] parameters = currentMethod.getParameterTypes();
				for (int j = 0; j < parameters.length; j++) {
					System.out.println("    Parameter: " + j + " " + parameters[j]);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}