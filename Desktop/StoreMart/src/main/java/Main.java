import entities.*;
import enums.Role;
import services.serviceImplementation.CashierServiceImplementation;
import services.serviceImplementation.CustomerServiceImplementation;
import services.serviceImplementation.ManagerServiceImplementation;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);
    private static GroceryList groceryList = new GroceryList();
    public static void main(String[] args) {

        Store store = new Store();
//       store.setYearOfExperience(3);



        Applicant applicant = new Applicant("isaac", 1, 2);

        Staff staff1 = new Staff(1, "Abraham", "male", 7, Role.CASHIER);
        Staff staff2 = new Staff(2, "loveth", "female", 5, Role.MANAGER);

        ManagerServiceImplementation man = new ManagerServiceImplementation();

        man.hireApplicant(applicant, staff2.getRole());

        System.out.println(man.hireApplicant(applicant, staff2.getRole()));
//
        System.out.println(man.fireCashier(staff1, staff2.getRole()));

        // #############################################

        List<Product> productList = new ArrayList<>();


          productList.add(new Product("Charger", 1, 30.0));
          productList.add(new Product("pen", 3, 100.0));
//        productList.add(new Product("Monitor", 56, 30.0));
//        productList.add(new Product("Computer", 123, 2000));
//        productList.add(new Product("Laptop", 912, 3000));

        Scanner sc = new Scanner(System.in);
//        System.out.println("Product " );
//        String choice = sc.next("product");

        Customer customer1 = new Customer(1, "James", productList);
        System.out.println(customer1.getCarts());

        CustomerServiceImplementation customerServiceImplementation = new CustomerServiceImplementation();
//
        System.out.println(customerServiceImplementation.buyProducts(customer1.getCarts()));

//       System.out.println(customerServiceImplementation.buyProducts(productList));

//        ####################################################################
//        CASHIER SERVICES

        CashierServiceImplementation cashierServiceImpl = new CashierServiceImplementation();

        System.out.println(cashierServiceImpl.sellProducts(customer1.getCarts()));

        boolean exit = false;
        int choice = 0;

        printInstructions(); // we will make this method in some time

        while (!exit){
            System.out.println("Enter your choice");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice){
                case 0:
                    printInstructions();
                    break;
                case 1:
                    groceryList.printGroceryList();
                    break;
                case 2:
                    addItem();
                    break;
                case 3:
                    modifyItem();
                    break;
                case 4:
                    removeItem();
                    break;
                case 5:
                    searchForItem();
                    break;
                case 6:
                    exit = true;
                    break;
            }
        }
    }
    public static void printInstructions() {

        System.out.println("\nPress ");
        System.out.println("\t 0 - to print choice options");
        System.out.println("\t 1 - to print the list of grocery items");
        System.out.println("\t 2 - to add an item to the List");
        System.out.println("\t 3 - to modify an item in the List");
        System.out.println("\t 4 - to remove an item from the list");
        System.out.println("\t 5 - to search for an item in the list");
        System.out.println("\t 6 - to exit the store");
    }

    public static void addItem(){
        System.out.println("Please enter the grocery item: ");
        groceryList.addGroceryItem(scanner.nextLine());
    }
    public static void modifyItem(){
        System.out.println("Enter item number: ");
        int itemNo = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter replacement item: ");
        String newItem = scanner.nextLine();
        groceryList.modifyGroceryList(itemNo - 1, newItem);
    }

     public static void removeItem(){
         System.out.println("Enter item number: ");
         int itemNo = scanner.nextInt();
         scanner.nextLine();
         groceryList.removeGroceryList(itemNo - 1);
     }

     public static void searchForItem(){
         System.out.println("Item to search for: ");
         String searchItem = scanner.nextLine();

         if(groceryList.findItem(searchItem) != null){
             System.out.println("Item Available in stock");
         }
         else {
             System.out.println(searchItem + " Out of Stock");
         }
     }
}

