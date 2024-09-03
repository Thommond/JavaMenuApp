import java.util.Scanner;
public class VendingMachine {
    public static void main(String[] args) {
        Boolean exit = false;
        double balance = 0;
        double moneyAdded;
        int usersChoice;
        String lastPurchasedItem = ""; // For later display

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

        
            
            // Program acts
                // then gives output 
        // Goes back to main menu 
            // keeps on loop until 
            // A: Exit, B: invalid

        while (exit != true) {

            System.out.println(mainMenu); // Main menu shows first 
            
            System.out.print("Please select an option (1-5)");
         
            usersChoice = scnr.nextInt();

            if (usersChoice == 1) { // Could use a switch instead
              System.out.print(displayItems());  
            } else if (usersChoice == 2) { 
              // Adding money to the users balance
              System.out.println("Enter amount of money to add to balance.");
              moneyAdded = scnr.nextDouble();
              balance += moneyAdded;
              System.out.println("Added "+moneyAdded+" to your balance. \n your balance is now " + balance);
              moneyAdded = 0.0;
            } else if (usersChoice == 3) {

            } else if (usersChoice == 4) {

            } else if (usersChoice == 5) {
                // Exiting program by ending loop
                System.out.println("Exiting the vending machine. Enjoy your "+lastPurchasedItem+"!");
                exit = true;
            } else {
                System.out.println("Invalid option, please chose an option 1 through 5 from the menu.");
            }
        }
    } // End of Main method 

    public static String displayItems() {
        
        return """
        Available Items:

        1. Fizzy Pop - $2.50

        2. Crisp Kettle Chips - $2.25

        3. Crunchy choclolate bar - $1.75

        4. Osmosis bottled water - $2.00

        5. Homemade sugar cookies - 2.75
        """;
    } // End of displayItems method 

    public static double purchaseItems(int choice, double balance) {
        return 0.0;
    } // End of purchaseItems method

}