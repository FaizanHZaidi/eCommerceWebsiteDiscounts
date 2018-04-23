package impl;

import impl.Affiliate;
import impl.Bill;
import impl.Customer;
import impl.Employee;
import impl.RegularCustomer;

public class BillTest {

    public static void main (String[]args) throws Exception{ 
       
        int totalBill = Integer.parseInt(args[1]);
        Customer customer;
        Bill bill;
         
         
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
         
        bill = new Bill(customer, (float)totalBill);

        System.out.print("Payable Bill is: ");
        System.out.printf("%.2f\n", totalBill-bill.totalDiscount());
        System.out.print("Total discount: ");
        System.out.printf("%.2f\n", bill.totalDiscount());

        }

}
