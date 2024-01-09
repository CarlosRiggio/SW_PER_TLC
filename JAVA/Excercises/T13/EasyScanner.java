package T13;

import java.io.IOException;
import java.util.Scanner;

public class EasyScanner {
    public static int nextInt() throws IOException
	{
		try (Scanner keyboard = new Scanner(System.in)) {
            int i = keyboard.nextInt();
            return i;
        }
        
	}

	public static double nextDouble() throws IOException
	{
		Scanner keyboard = new Scanner(System.in);
		double d = keyboard.nextDouble();
        keyboard.close();
		return d;

	}

    public static void main(String[] args) {

        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter a non int value:");
            int non_int = scanner.nextInt();
            System.out.println(non_int);
            scanner.close();
        } catch (Exception e) {
            System.out.println("Exceptionh received = " + e);
        }
    }
}
