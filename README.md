# eCommerceWebsiteDiscounts

This program, written in Java, aims at calculating discounts for an online retail store customers, who are divided into three categories: Employee, Affiliate, Regular (i.e. customers for more than 2 years). Another category is therefore implicit in this, which is of customers who do not belong to any of these three categories. Each catefory, except for the implicit one, has a certain percent of discount they can avail, while a general discount is available to all who shop above a certain limit. Effort has been made to ensure best practices of Software Engineering and Object Oriented Programming.

### Setup and execution:  

After cloning the repository on your machine, go to the following directory ```eCommerceWebsiteDiscounts/src/impl``` from the terminal. Make sure to have the JDK installed (at least 1.8). Compile the BillTest.java file by running the command ```javac BillTest.java```. To run the code, enter ```java BillTest```. The code will create a text file in the same directory by the name of OutFile.txt, which contains the results from running the BillTest file.

### Understanding the Output

BillTest calculates a total of 40 bills, 10 for each customer type. There are four user types: Employee, Affiliate, Regular (customer for more than 2 years) or none of the above. There are 10 different amounts for total bill and **grocery bill (which is a part of the total bill but is mentioned separately to calculate the different discounts)**, which along with the customer type, are used to calculate the total payable bill. The OutFile.txt shows all of this: the customer type for whom the bills are being processed, the total initial bill, the grocery bill and the final payable bill along with the discount availed.  

### Understanding the structure of the program  

The BillTest class contains the main function, which calls upon the other classes in the package impl. There is a base Customer class, from which are extended Employee, Affiliate and Regular classes, each containing their unique discount amounts. The BillTest class passes Customer object as an argument to a Bill class, which then computes the total discount for that customer.  

An Android version of the application can be found [here](https://github.com/FaizanHZaidi/eCommerceWebsiteDiscountsApp/blob/master/README.md "eCommerceWebsiteDiscountsApp").
