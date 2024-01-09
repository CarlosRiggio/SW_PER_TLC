package T9;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Bank_Account {
    private String name;
    private int number;
    private int amount;


public Bank_Account(String inname, int innumber, int inamount){
    name = inname;
    number = innumber;
    amount = inamount;
}

public void add_amount(int add){
    amount = amount + add;
}

public String getName(){
    return name;
}

public int getNumber(){
    return number;
}

public int getAmount(){
    return amount;
}

public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    List<Bank_Account> lista = new ArrayList<>();
    String c="A";
    Bank_Account b1 = new Bank_Account("Pe", 1234, 100);
    Bank_Account b2 = new Bank_Account("Pa", 5678, 0);
    lista.add(b1);
    lista.add(b2);

    for(int i=0; i<lista.size();i++){
        Bank_Account bfor = lista.get(i);
        System.out.println("Name: "+bfor.getName() +" Number: "+bfor.getNumber() +" Amount: "+ bfor.getAmount());
    }

    do {
        System.out.print("Introduce a bank account number: ");
        int number_user = scan.nextInt();
        System.out.print("Introduce an amount to introduce to that account: ");
        int amount_user = scan.nextInt();

        for(int j=0; j<lista.size();j++ ){
            Bank_Account bfor2 = lista.get(j);
            if(bfor2.getNumber() == number_user){
                bfor2.add_amount(amount_user);
                System.out.println("Name: "+bfor2.getName() +" Number: "+bfor2.getNumber() +" Amount: "+ bfor2.getAmount());            
                System.out.println("Do you want to keep introducing?[Y/N]");
                c=scan.nextLine();c=scan.nextLine();

                break;
            }
        }
    } while (!(c.equals("N")));

scan.close();
}

}