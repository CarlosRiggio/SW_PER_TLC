import java.util.Scanner ; 

public class T6 {
    public static void main(String[] args)
    {
        DisplayStars4();
    }


    public static void DisplayStars4()
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Introduce the number of colums: ");
        int columns = scan.nextInt();
        scan.nextLine();

        System.out.print("Introduce the number of rows: ");
        int rows = scan.nextInt();
        scan.nextLine();

        for(int j = 0; j< rows;j++)
        {
            for(int i = 0 ; i<columns;i++)
                {
                    System.out.print("*");
                }
            System.out.println();
        }
        scan.close();
    }
}
