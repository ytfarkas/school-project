import java.util.Scanner;
  
  public class ChangeCounter {
  
  public static void main(String[] args) {
    Scanner sc = new Scanner (System.in);
    System.out.println ("Enter purchase ammount: ");
    double purchaseAmmount = sc.nextDouble();
    System.out.println ("Enter the amount tendered: ");
    double tenderedAmmount = sc.nextDouble();
       int purchaseAmmount2 = (int) Math.round(purchaseAmmount*100);
    int tenderedAmmount2 = (int) Math.round(tenderedAmmount*100);
    double change = tenderedAmmount2 - purchaseAmmount2;
    
    
    if (purchaseAmmount > tenderedAmmount) {
      System.out.print ("Not enough money paid");
    }
    else {
        
   System.out.println("Your change is $" + (change/100.0));
      System.out.println ("Test");      
   int fives = (int)(change / 500);
   int remainder = (int)(change % 500);
   System.out.println(fives + " Five dollar bills");
   int dollar = remainder / 100;
   int remainder2 = remainder % 100;
   System.out.println(dollar + " One dollar bills");
   int quarter = remainder2 / 25;
   int remainder3 = remainder2 % 25;
   System.out.println(quarter + "  Quarters");
   int dimes = remainder3 / 10;
   int remainder4 = remainder3 % 10;
   System.out.println(dimes + "  Dimes");
   int nickels = remainder4 / 5;
   int remainder5 = remainder4 % 5;
   System.out.println(nickels + "  Nickels");
   int pennies = remainder5 / 1;
   int remainder6 = remainder5 % 1;
   System.out.println(pennies + "  Pennies");
   
    }  
    
  }
}