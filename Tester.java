/* Can be new or used games, name, price to buy, price to sell, 
price to sell as used, price during sales... 400 plus per copy, 
sometimes accessories, different consoles, record sales, keep track of
how many games per console, 
*/ 
import java.io.*;
import java.util.*;
public class Tester
{
    private static void line()
    {
        System.out.println("-----------------------------------------");
    }
    static Thread thread = new Thread();
    public static void main(String args[]) throws InterruptedException
    {
        System.out.println("\n\nGame Store Inventory System Online");
        String[] items = new String[500];
        while(true)
        {
            Scanner kbReader = new Scanner(System.in);
            line();
            System.out.println("\nA: New item");
            System.out.println("\nB: Edit item");
            System.out.println("\nC: Delete item");
            System.out.println("\nD: Print out all items");
            String choice = kbReader.nextLine();
            line();
            System.out.println("");
            int x = 0;
            switch(choice)
            {
                case "a":
                case "A":
                    System.out.println("A New item huh?");
                    line();
                    x = 1;
                    break;
                case "b":
                case "B":
                    System.out.println("Edit an item huh?");
                    x = 2;
                    line();
                    break;
                case "c":
                case "C":
                    System.out.println("Delete an item huh?");
                    x = 3;
                    line();
                    break;
                case "d":
                case "D":
                    System.out.println("Print out all items huh?");
                    x = 4;
                    line();
                    break;
                default:
                    System.out.println("You didn't decide an available option");
            }
            switch(x)
            {
                case 1:
                    System.out.println("Is it a game or merchandise?");
                    choice = kbReader.nextLine();
                    if((choice.toLowerCase().equals("game")))
                    {
                        
                    }
                    else
                    {
                        if((choice.toLowerCase().equals("merchandise")))
                        {
                            
                        }
                    }
                    break;
                case 2:
                    
                    break;
                case 3:
                    
                    break;
                case 4:
                    Items.print();
                    break;
                default:
            }
                    
                
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            //Final Section
            System.out.println("\nAre you done?");
            System.out.println("\nYes/No");
            choice = kbReader.nextLine();
            switch(choice)
            {
                case "yes":
                case "Yes":
                    System.exit(0);
                    break;
                case "no":
                case "No":
                    continue;
                default:
                    System.out.println("\nI'll count that as you are done...");
                    thread.sleep(1000);
                    System.exit(0);
            }
        }
    }
}