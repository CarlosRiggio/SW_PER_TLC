package T13;

import java.util.Scanner;

public class EasyScannerPlus {
    public static void main(String[] args){
        int correct = 0;
        Scanner scan = new Scanner(System.in);
        while(correct != 2){
            try {
                System.out.println("Enter a non int value: ");
                int a = scan.nextInt();
                System.out.println("You had entered: " + a);
                correct = 2;
            } catch (Exception e) {
                System.out.println("Your exception was: " + e);
                scan.nextLine(); // Importante limpiar el scanner pq sino entra en un bucle
                correct = 1;
            }

        }

        scan.close();
    }

}
