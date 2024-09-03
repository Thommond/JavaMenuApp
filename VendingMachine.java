import java.util.Scanner;
public class VendingMachine {
    public static void main(String[] args) {
        // Class Variables
        String lastPurchasedItem = ""; // For exit display
        Boolean exit = false;
        double balance = 0;
        double moneyAdded;
        int usersChoice;

        Scanner scnr = new Scanner(System.in);

        // Main menu
        String mainMenu = """
                          Menu: 
                          
                          1. Display Items 
                          
                          2. Add funds 
                          
                          3. Purchase Item 
                          
                          4. Check balance 
                          
                          5. Exit 
                          """;
        // Starts main program, only exits on user input
        while (exit != true) {
            System.out.println(mainMenu); // Main menu shows first 
            
            System.out.print("Please select an option (1-5)");
         
            usersChoice = scnr.nextInt();

            if (usersChoice == 1) { // Could use a switch instead
              System.out.print(displayItems());  
            } else if (usersChoice == 2) {// Adding money to the users balance
              System.out.println("Enter amount of money to add to balance.");
              moneyAdded = scnr.nextDouble();
              balance += moneyAdded;
              System.out.println("Added "+moneyAdded+" to your balance. \n your balance is now " + balance);
              moneyAdded = 0.0;
            } else if (usersChoice == 3) {// Item purchasing
                System.out.print("Which item would you like? (1-5):");
                usersChoice = scnr.nextInt();
                System.out.println("Your balance is now "+ purchaseItems(usersChoice, balance) +".");
            } else if (usersChoice == 4) {// Balance Inquiry
                System.out.println("Your balance is " + balance+".");
            } else if (usersChoice == 5) {// Exiting program by ending loop
                System.out.println("Exiting the vending machine. Enjoy your "+lastPurchasedItem+"!");
                exit = true;
            } else {// If invalid data is given
                System.out.println("Invalid option, please choose an option 1 through 5 from the menu.");
            }
        }
    } // End of Main method 

    public static String displayItems() {
        return """
        Available Items:

        1. Fizzy pop - $2.50

        2. Crisp kettle chips - $2.25

        3. Crunchy choclolate bar - $1.75

        4. Osmosis bottled water - $2.00

        5. Homemade sugar cookies - 2.75
        """;
    } // End of displayItems method 

    public static double purchaseItems(int choice, double balance) {

        if (choice == 1 && balance >= 2.50) { 
            balance -= 2.50;
            System.out.println("You successfully purchased Fizzy Pop.");
        } else if (choice == 2 && balance >= 2.25) {
            balance -= 2.25;
            System.out.println("You successfully purchased Crisp Kettle Chips.");
        } else if (choice == 3 && balance >= 1.75) {
            balance -= 2.50;
            System.out.println("You successfully purchased Crunchy choclolate bar.");
        } else if (choice == 4 && balance >= 2.00) {
            balance -= 2.50;
            System.out.println("You successfully purchased Osmosis bottled water.");
        } else if (choice == 5 && balance >= 2.75) {
            balance -= 2.50;
            System.out.println("You successfully purchased Homemade sugar cookie.");
        } else {
            System.out.println("Invalid choice or insufficent funds. Current balance is "+ balance + ".");
        }

        return balance;
    } // End of purchaseItems method

}