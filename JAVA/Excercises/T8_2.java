import java.util.Scanner;

public class T8_2 {
    public static void main(String[] args) {
        //ej2();
        ej3();
    }   


    public static void ej2(){
        int[] javaStudents;
        javaStudents = enterExamMarks();
        // for (int i = 0; i < javaStudents.length; i++) {
        //     System.out.print(javaStudents[i] + " ");
        // }
        javaStudents=increaseMarks(javaStudents);
        for (int i = 0; i < javaStudents.length; i++) {
            System.out.println(javaStudents[i] + " ");
        }

        boolean decision = allHavePassed(javaStudents);
        System.out.println(decision);

    }

    public static int[] enterExamMarks(){
        Scanner scan = new Scanner(System.in);
        int[] marks = new int[5];
        int counter = 0;
        String stop = "Y";
        do {
            System.out.print("Introduce a mark: ");
            int mark = scan.nextInt();
            marks[counter]= mark;
            System.out.print("Do you want to continue introducing marks?[Y/N]: ");
            stop = scan.nextLine();stop = scan.nextLine();
            counter++;
            
        } while (!(stop.equals("N")));
        scan.close();
        return marks;
    }

    public static int[] increaseMarks(int[] marks){
        Scanner scan = new Scanner(System.in);
        for(int i=0;i<marks.length;i++){
            marks[i]=marks[i]+5;
            // System.out.println(marks[i]);
            if(marks[i]>30){
                marks[i]=30;
            }
        }
        scan.close();
        return marks;
    }

    public static boolean allHavePassed(int[] marks){
        boolean decision = false;

        for(int i=0;i<marks.length;i++){
            if(marks[i]>=18){
                decision = true;
            }else{
                break;
            }
        }
        return decision;
    }

    public static void ej3(){
        Scanner scan = new Scanner(System.in);
        System.out.print("How many itens you want to buy?: ");
        int cantidad = scan.nextInt();
        int[] products= new int[cantidad];
        double euros_total=0;
        double dollar_total=0;
        for(int i = 0;i<cantidad;i++){
            System.out.print("Introduce the value (Dollars) nº:"+(i+1)+": ");
            products[i]=scan.nextInt();
        }

        double rate=0;
        System.out.print("Introduce a rate for convert USD to EUR (0.91): ");
        rate = scan.nextDouble();
        double[] euros = new double[cantidad];
        for(int i = 0;i<cantidad;i++){
            euros[i]= products[i]*rate;
            System.out.println("Dollars: "+products[i]+" --> Euros: "+euros[i]);
            dollar_total=dollar_total+products[i];
            euros_total = euros_total +euros[i];
        }
        System.out.println("TOTAL ==> Dollars: "+dollar_total+" --> Euros: "+euros_total);
        scan.close();
    }


}