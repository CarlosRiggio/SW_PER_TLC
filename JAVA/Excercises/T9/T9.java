package T9;
import java.util.Scanner;

public class T9 {
    
    public static void main(String[] args)
    {
        ej1();
    }
    
    public static void ej1(){
        Scanner scan = new Scanner(System.in);
        String name;

        do {
            System.out.print("Insert a name (+6 char): ");
            name = scan.nextLine();
            if (name.length()<6) {
                System.out.println("INVALID CODENAME");
            }
        } while (name.length()<6);

        System.out.print("To confirm name introduce it again: ");
        String confirm = scan.nextLine();
        if(confirm.equals(name)){
            System.out.println("NAME CONFIRMED");
        }else{
            System.out.println("CODE NAME MIS-MATCH");
        }

        char final_char = name.charAt(name.length()-1);
        if(final_char != 'X'){
            System.out.println("NO END X");
        }else{
            System.out.println("END X");
        }

        if(name.startsWith("Agente")){
            System.out.println("Empieza por agente");
        }else{
            System.out.println("No empieza por agente");
        }


        scan.close();
    }




}
