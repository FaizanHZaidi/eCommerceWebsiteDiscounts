import java.util.Scanner;

/*
*   This is our main class. It takes in two arguments: customer type
*   and total bill. It then displays the total discount availed and
*   the net payable bill.
*/

public class BillTest {

    public static void main (String[]args) throws Exception{ 
       
        // int totalBill = Integer.parseInt(args[1]);
        Customer customer;
        Bill bill;
        String userInput;
        int totalBill, groceryBill;
        Scanner reader = new Scanner(System.in);

        System.out.println("Enter total Bill: ");

        if(reader.hasNext() ) {
            userInput = reader.next();  // if there is another number  
        } else { 
            userInput = ""; // nothing added in the input 
        }
        
        totalBill = Integer.parseInt(userInput);
        
        
        System.out.println("Enter grocery Bill: ");

        if(reader.hasNext() ) {
            userInput = reader.next();  // if there is another number  
        } else { 
            userInput = ""; // nothing added in the input 
        }

        groceryBill = Integer.parseInt(userInput);

        reader.close();

         
        if (args.length>0){ 
            switch(args[0].toLowerCase()) {       
            case "employee":
                customer = new Employee();
                break;

            case "affiliate":
                customer = new Affiliate();
                break;
            case "regular":
                   customer = new RegularCustomer();
                   break;
            default:
             System.out.println("Wrong arguments");
             throw new IllegalArgumentException();           

            }
        } else {
            customer = new Customer();
        }

         
        bill = new Bill(customer, (float)totalBill, (float)groceryBill);

        System.out.print("Payable Bill is: ");
        System.out.printf("%.2f\n", totalBill-bill.totalDiscount());
        System.out.print("Total discount availed: ");
        System.out.printf("%.2f\n", bill.totalDiscount());
        
    }

}
