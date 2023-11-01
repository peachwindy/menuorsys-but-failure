import java.util.Scanner;

public class SweetsPos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double total = 0.0;

                System.out.println("WELCOME TO HAELLHA'S' BAKERY!");
        while (true) {
            System.out.println("Here are the Main Options!");
            
System.out.println("1. Cakes");
System.out.println("2. Drinks");
System.out.println("3. Breads");
System.out.println("4. Cookies");
System.out.println("5. Pies");
System.out.println("6. Milktea");

System.out.println(" ");
System.out.print("Enter your choice:");

            int choice = scanner.nextInt();

            if (choice < 1 || choice > 6) {
                System.out.println("//Invalid choice!//");
                System.out.println("//Please try again sweetie.//");
                continue;
            }

            double itemTotal = processCategory(choice, scanner);
            total += itemTotal;
            System.out.println("Subtotal: " + itemTotal);

            System.out.print("Do you want to purchase another sweet's? (Y/ N): ");
            String continueShopping = scanner.next();
            if (continueShopping.equalsIgnoreCase("n")) {
          
                              }              
                              
            {
                break;
            }
        }

        System.out.println("[Payment]");
        System.out.println("Total: " + total);
        processPayment(total, scanner);
    }

    public static double processCategory(int category, Scanner scanner) {
        double[] prices = {};
        String[] name = {};
        String[] names = {};

        switch (category) {
            case 1:
                prices = new double[]{10.00, 15.00, 10.00, 15.00, 15.00, 10.00, 15.00};                    
               
                names = new String[]{"Cakes", "Chocolate Cake", "Ube Cake", "Red Velvet Cake","Ice Cream Cake","Mocha Cake","CheeseCake"};
                break;
            case 2:
                prices = new double[]{1.00, 1.00, 1.00, 2.00, 2.00, 2.00, 1.00};
                names = new String[]{"Drinks","Water", "Yakult", "Coca-Cola", "Sprite", "Royal", "Zest-O" };
                break;
            case 3:
                prices = new double[]{3.00, 3.00, 5.00, 5.00, 3.00, 3.00};
                names = new String[]{"Breads","Panso", "Cinammonroll", "Baguette", "Pan au Chocola", "Waffle"};
                break;
            case 4:
                prices = new double[]{2.00, 3.00, 2.00, 2.00, 3.00};
                names = new String[]{"Cookies","Chocolate-y", "Ube-y", "Vanilla", "Fruit-y" };
                break;
            case 5:
                prices = new double[]{3.00, 3.00, 3.00, 4.00, 4.00};
                names = new String[]{"Pies","Buko", "Apple", "Cheese", "Egg"};
                break;
             case 6:
                prices = new double[]{5.00, 5.00, 6.00, 6.00, 6.00, 7.00, 7.00};
                names = new String[]{"Milktea","Chocolate Milktea", "Cookies and Cream Milktea", "Taro Milktea", "Okinawa Milktea", "Choco Kisses Milktea", " Fruity Milktea"};
                break;
                                  
         }
        System.out.println(names[0] + " Sub-Sec:");
        for (int i = 0; i < prices.length; i++) {
            System.out.println("[" + (i + 1) + "] " + names[i] + " : $" + prices[i]);
        }

        System.out.print("Enter your choice: ");
        int choice = scanner.nextInt();

        if (choice < 1 || choice > prices.length) {
            System.out.println("//Invalid choice :< //");
            System.out.println("//Please try again :< //");
             return 0.0;
        }

        System.out.print(names[choice - 1] + " Quantity: ");
        int quantity = scanner.nextInt();

        double itemTotal = prices[choice - 1] * quantity;
        return itemTotal;
    }

    public static void processPayment(double total, Scanner scanner) {
        double payment;
        while (true) {
        	System.out.print("Enter Payment (Cash): $");
            payment = scanner.nextDouble();
            if (payment >= total) {
                double change = payment - total;
                System.out.println("Change: $" + change);
                System.out.println("Thank you for purchasing Ahlleah's Bakery!");            
                generateReceipt(total, payment, change);
                break;
            } else {
                System.out.println("!! Insufficient Cash !!");
            }
        }
    }

    public static void generateReceipt(double total, double payment, double change) {
 
        System.out.println("--------------------------------------");
        System.out.println("Total Amount: $" + total);
        System.out.println("Payment: $" + payment);
        System.out.println("Change: $" + change);
        System.out.println("---------------------------------------");

        System.out.println("Thank you for buying to our dear Bakeshop!");
    }
