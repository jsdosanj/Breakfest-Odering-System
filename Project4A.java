//Jasvant Singh Dosanjh
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Project4A
{    
   private final static double bagel = 2.00;
   private final static double donut = 1.50;
   private final static double croissant = 3.00;
   private final static double latte = 1.50;
   private final static double coffee = 1.25;
   private final static double milk = 1.00;
   private final static double tea= 0.50;
   public static void main(String[] args)
   {
      Scanner breakfast = new Scanner(System.in);
      
      JOptionPane.showInputDialog(null, "Welcome to BeBe's Best Breakfast choose a breakfast item." + "\n 1 Bagel: $2.00" + "\n 2 Donut: $1.50" + "\n 3 Croissant: $3.00");
      JOptionPane.showInputDialog(null, "Choose one of the following beverages:" + "\n 4 Latte: $1.50" + "\n 5 Coffee: $1.25" + "\n 6 Milk: $1.00" + "\n 7 Tea: $0.50");
      int choice = breakfast.nextInt();
      double cost=0.00, cost1=0.00, extracost=0.00;
       if (choice == 1){
          JOptionPane.showMessageDialog(null, "Breakfast ordered: \nBagel @ $2.00");
          String inputStr = JOptionPane.showInputDialog(null, "Enter quantity: 1-5");
          cost = bagel;
      } 
         else if (choice == 2)
         {
            JOptionPane.showMessageDialog(null, "Breakfast ordered: \nDonut @ $1.50");
            String inputStr = JOptionPane.showInputDialog(null, "Enter quantity: 1-5");
            cost = donut;
      } 
         else if (choice == 3)
         {
            JOptionPane.showInputDialog(null, "Breakfast ordered: \nCroissant @ $3.00");
            String inputStr = JOptionPane.showInputDialog(null, "Enter quantity: 1-5");
            cost = croissant;
         }

      if (choice == 4){
         JOptionPane.showMessageDialog(null, "Beverage ordered: \nLatte @ $1.50");
         String inputStr = JOptionPane.showInputDialog(null, "Enter quantity: 1-5");
         cost1 = latte;
         } 
         else if(choice == 5)
         {
            JOptionPane.showMessageDialog(null, "Beverage ordered: \nCoffee @ $1.25");
            String inputStr = JOptionPane.showInputDialog(null, "Enter quantity: 1-5");
            cost1 = coffee;
         } 
         else if (choice == 6)
         {
            JOptionPane.showMessageDialog(null, "Beverage ordered: \nMilk @ $1.00");
            String inputStr = JOptionPane.showInputDialog(null, "Enter quantity: 1-5");
            cost1 = milk;
         } 
         else  if (choice == 7)
         {
            JOptionPane.showMessageDialog(null, "Beverage ordered: \nTea @ $0.50");
            String inputStr = JOptionPane.showInputDialog(null, "Enter quantity: 1-5");
            cost1 = tea;
         }
         double totCost = extracost + cost + cost1;
         JOptionPane.showMessageDialog(null,( "Breakfast ordered:" +cost +	"\nBeverage ordered: "+cost1 + "\nTotal cost: $"+totCost),"YOUR BILL",JOptionPane.INFORMATION_MESSAGE);
         
   }
}  
      