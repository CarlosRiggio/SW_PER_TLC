import java.util.Scanner;
import java.util.Arrays;


public class T8 {
    public static void main(String[] args)
    {
        // ej2();
        // ej3();
        ej4();
    }

    public static void ej2()
    {   
        Scanner scan = new Scanner(System.in);
        int[] javaStudents = new int[5];
        int option = 0;
        do {
            
            System.out.println("[1] Enter marks");
            System.out.println("[2] Increase marks");
            System.out.println("[3] All passed");
            System.out.println("[4] Exit");
            System.out.print("Choose an option: ");
            option = scan.nextInt();

            switch(option)
                {
                    case 1:
                        javaStudents = enterExamMarks(javaStudents, scan);
                        String arraycomoString = Arrays.toString(javaStudents);
                        System.out.println("El array es = " + arraycomoString);
                        break;
                    case 2:
                        javaStudents = increaseMarks(javaStudents);
                        String arraycomoString2 = Arrays.toString(javaStudents);
                        System.out.println("El array es = " + arraycomoString2);
                        break;
                    case 3:
                        Boolean result = allHavePassed(javaStudents);
                        System.out.println("Result: "+ result);
                        break;
                    case 4:
                        break;

        }

        } while (option!=4);

    }

    public static int[] enterExamMarks(int[] javaStudents, Scanner scan)
    {   
        for(int i= 0; i<javaStudents.length;i++){
            System.out.print("Enter the mark for student number "+(i+1)+": ");
            int mark = scan.nextInt();
            javaStudents[i] = mark;
            
        }

        return javaStudents;
    }

    public static int[] increaseMarks(int[] javaStudents)
    {
        for( int i=0;i<javaStudents.length;i++)
        {
            javaStudents[i]=javaStudents[i]+5;
            if(javaStudents[i]>30)
            {
                javaStudents[i]=30;
            }
        }
        return javaStudents;
    }

    public static Boolean allHavePassed(int[] javaStudents)
    {
        int minimo = javaStudents[0];
        Boolean result;
        for (int i = 1; i<javaStudents.length;i++)
        {
            if(javaStudents[i]<minimo){
                minimo = javaStudents[i];
            }
        }

        if(minimo>=18)
        {
            result = true;
        }else{
            result = false;
        }

        return result;
    }

    public static void ej3()
    {
        Scanner scan = new Scanner(System.in);
        float[] dollar = new float[5];
        float[] euros = new float[5];
        for(int i = 0; i<dollar.length;i++)
        {
            System.out.print("Introduce dollar values: ");
            dollar[i] = scan.nextFloat();
        }

        System.out.print("Introduce the exchange rate (0.1-1.9): ");
        float rate = scan.nextFloat();

        for(int j = 0; j<dollar.length;j++)
        {
            euros[j] = dollar[j]*rate;
        }

        String dollaString = Arrays.toString(dollar);
        String euroString = Arrays.toString(euros);
        System.out.println("Dollar array: "+ dollaString);
        System.out.println("Rate: "+ rate);
        System.out.println("Euro array: "+ euroString);
        scan.close();
    }

    public static void ej4()
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Introduce how many product do yoy want to insert: ");
        int n = scan.nextInt();
        float[] dollar = new float[n];
        float[] euros = new float[n];
        for(int i = 0; i<dollar.length;i++)
        {
            System.out.print("Introduce dollar values: ");
            dollar[i] = scan.nextFloat();
        }

        System.out.print("Introduce the exchange rate (0.1-1.9): ");
        float rate = scan.nextFloat();

        for(int j = 0; j<dollar.length;j++)
        {
            euros[j] = dollar[j]*rate;
        }

        String dollaString = Arrays.toString(dollar);
        String euroString = Arrays.toString(euros);
        System.out.println("Dollar array: "+ dollaString);
        System.out.println("Rate: "+ rate);
        System.out.println("Euro array: "+ euroString);
        scan.close();
    }
}
