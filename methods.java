import java.util.Scanner;

public class methods
{
    public static  void main(String[] args)
    {
        /* printing name and menu*/
        System.out.println("Hamilton Hamburgers");
        System.out.println("Menu for Hamilton Hamburgers");
        System.out.println("1.   Veggie Burger           $5.95");
        System.out.println("2.   Deluxe veggie burger    $7.95");
        System.out.println("3.   Chicken  burger         $6.45");
        System.out.println("4.   Cheese Chicken burger   $8.50");
        System.out.println("5.   Cheese Bacon burger     $9.25");
        System.out.println("6.   Deluxe Bacon burger     $10.95");
        System.out.println("7.   Healthy Organic burger  $12.45");
        System.out.println("8.    Quit");
        double total = 0.0;
        double order=0.0;

 /* first loop with int m data type is to take order from 5 customers and print sum of all orders in end.*/
        for(int m=1; m<=5;m++)
        {
            double sum = 0;
            /* Scanner class to get input and how many types of burger.*/
            Scanner input = new Scanner(System.in);
            System.out.println("How many types of burger order, you want to place(enter whole number)?");
               int number = input.nextInt();

/* second loop is to get order from one customer to place an order for more than one type of burger*/
            for (int n = 1; n <= number; n++)
            {
                System.out.println("Select " + n + " Item for " + m + " order is :-  ");
                try
                {
                    int select = input.nextInt();
                    if (select == 1) {
                        System.out.println("You have selected Veggie Burger.\n please tell quantity");
                        int quantity = input.nextInt();
                        total = quantity * 5.95;
                    } else if (select == 2) {
                        System.out.println("You have selected Deluxe Veggie Burger.\n please tell quantity");
                        int quantity = input.nextInt();
                        total = quantity * 7.95;
                    } else if (select == 3) {
                        System.out.println("You have selected Chicken Burger.\n please tell quantity");
                        int quantity = input.nextInt();
                        total = quantity * 6.45;
                    } else if (select == 4) {
                        System.out.println("You have selected Cheese Chicken Burger.\n please tell quantity");
                        int quantity = input.nextInt();
                        total = quantity * 8.50;
                    } else if (select == 5) {
                        System.out.println("You have selected Cheese Bacon  Burger.\n please tell quantity");
                        int quantity = input.nextInt();
                        total = quantity * 9.25;
                    } else if (select == 6) {
                        System.out.println("You have selected Deluxe bacon Burger.\n please tell quantity");
                        int quantity = input.nextInt();
                        total = quantity * 10.95;
                    } else if (select == 7) {
                        System.out.println("You have selected Healthy organic  Burger.\n please tell quantity");
                        int quantity = input.nextInt();
                        total = quantity * 12.45;
                    } else if (select == 8) {
                        System.out.println("You have just quit.");

                    } else {
                        System.out.println("you have entered any wrong number. Kindly enter number from 1 To 8.");
                    }
                } catch (Exception e){
                    System.out.println("please enter whole number from 1 to 8 as state in menu.");
                }
 /* this sum stores the value of total amount of one customer.*/
                sum = sum + total;
            }

            System.out.println("your total is:- "+ String.format("%.2f",sum));
            System.out.println("if you are done with selection please enter 8 to quit and check total amount.");

            try {
                int num = input.nextInt();
           /* tax*/
                if (num == 8)
                {
                    double tax = 0.13 * sum;
                    System.out.println("13% tax is :- "+"$" + String.format("%.2f",tax));
                    sum = sum + tax;
                    System.out.println("your total amount for  " + m + " order is :- " +"$"+ String.format("%.2f",sum));
                    /* 5% discount*/
                    if (sum > 50 && sum <= 100) {
                        double discount = 0.05 * sum;
                        sum = sum - discount;
                        System.out.println("your order is more than $50 so after 5% discount your total is:-  " +"$"+ String.format("%.2f",sum));
                    }
                    /*10% discount*/
                    if (sum > 100) {
                        double discount = 0.10 * sum;
                        sum = sum - discount;
                        System.out.println("Your order is more than $100 so after 10% discount your total is:- " +"$"+ String.format("%.2f",sum));
                    }
                } else {
                    System.out.println("you have entered number other than 8.Please place an order again.  ");
                }
            } catch (Exception e){
                System.out.println(" Error! Press whole number. Please place an order again.  ");

            }
            System.out.println("Thank you for ordering.");

            /*This order stores the addition of all 5 orders.*/
           order= order+sum;
        }
           System.out.println("sum of 5 orders is:-  "+"$"+ String.format("%.2f",order));
    }
  }

