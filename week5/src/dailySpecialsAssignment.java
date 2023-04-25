import java.util.Scanner;

public class dailySpecialsAssignment {

    public static void main(String[] args) {

        String specials = "";
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter a day of the week excluding weekends (Monday - Friday!)");
        specials = input.next();

        // in the world of coffee, I need a name of a coffee beverage and a price
        String coffee;
        double price = 0;
        double totalPrice = 0;
        int coffeeNumber = 0;

        boolean saturday = specials.equals("Saturday");
        boolean sunday = specials.equals("Sunday");

        if (saturday || sunday) {
            System.out.println("Please enter a weekday, not a weekend");
            specials = input.next();
        }

        // need to define coffee type and price
        switch (specials) {
            // my cases will be the day of the week
            case "Monday":
                coffee = "Latte";
                price = 4.95;
                System.out.println(specials + "'s coffee of the day is a " + coffee + " and the price will be $" + price);

                System.out.println("How many " + coffee + "s would you like to order?");
                coffeeNumber = input.nextInt();

                totalPrice = coffeeNumber * price;

                if(coffeeNumber == 0) {
                    System.out.println("Looks like you don't like " + coffee + "s!  So sad!!!");
                } else if(coffeeNumber == 1){
                    System.out.println("Looks like you will be ordering only " + coffeeNumber + " " + coffee + " today!");
                } else if(coffeeNumber >1){
                    System.out.print(coffeeNumber + " " + coffee + "s have been ordered totalling $");
                    System.out.printf("%.2f", totalPrice);
                    System.out.println(" dollars");
                }
            break;

            case "Tuesday":
                coffee = "Frapp";
                price = 5.95;
                System.out.println(specials + "'s coffee of the day is a " + coffee + " and the price will be $" + price);

                System.out.println("How many " + coffee + "s would you like to order?");
                coffeeNumber = input.nextInt();

                totalPrice = coffeeNumber * price;

                if(coffeeNumber == 0) {
                    System.out.println("Looks like you don't like " + coffee + "s!  So sad!!!");
                } else if(coffeeNumber == 1){
                    System.out.println("Looks like you will be ordering only " + coffeeNumber + " " + coffee + " today!");
                } else if(coffeeNumber >1){
                    System.out.print(coffeeNumber + " " + coffee + "s have been ordered totalling $");
                    System.out.printf("%.2f", totalPrice);
                    System.out.println(" dollars");
                }

            break;

            case "Wednesday":
                coffee = "Cappucino";
                price = 4.35;
                System.out.println(specials + "'s coffee of the day is a " + coffee + " and the price will be $" + price);
                //                System.out.println("");

                System.out.println("How many " + coffee + "s would you like to order?");
                coffeeNumber = input.nextInt();

                totalPrice = coffeeNumber * price;

                if(coffeeNumber == 0) {
                    System.out.println("Looks like you don't like " + coffee + "s!  So sad!!!");
                } else if(coffeeNumber == 1){
                    System.out.println("Looks like you will be ordering only " + coffeeNumber + " " + coffee + " today!");
                } else if(coffeeNumber >1){
                    System.out.print(coffeeNumber + " " + coffee + "s have been ordered totalling $");
                    System.out.printf("%.2f", totalPrice);
                    System.out.println(" dollars");
                }

            break;

            case "Thursday":
                coffee = "Regular Joe";
                price = 2.95;
                System.out.println(specials + "'s coffee of the day is a " + coffee + " and the price will be $" + price);
                //                System.out.println("");

                System.out.println("How many " + coffee + "s would you like to order?");
                coffeeNumber = input.nextInt();

                totalPrice = coffeeNumber * price;

                if(coffeeNumber == 0) {
                    System.out.println("Looks like you don't like " + coffee + "s!  So sad!!!");
                } else if(coffeeNumber == 1){
                    System.out.println("Looks like you will be ordering only " + coffeeNumber + " " + coffee + " today!");
                } else if(coffeeNumber >1){
                    System.out.print(coffeeNumber + " " + coffee + "s have been ordered totalling $");
                    System.out.printf("%.2f", totalPrice);
                    System.out.println(" dollars");
                }

                break;

            case "Friday":
                coffee = "Green Tea Latte";
                price = 6.95;
                System.out.println(specials + "'s coffee of the day is a " + coffee + " and the price will be $" + price);

                System.out.println("How many " + coffee + "s would you like to order?");
                coffeeNumber = input.nextInt();

                totalPrice = coffeeNumber * price;

                if(coffeeNumber == 0) {
                    System.out.println("Looks like you don't like " + coffee + "s!  So sad!!!");
                } else if(coffeeNumber == 1){
                    System.out.println("Looks like you will be ordering only " + coffeeNumber + " " + coffee + " today!");
                } else if(coffeeNumber >1){
                    System.out.print(coffeeNumber + " " + coffee + "s have been ordered totalling $");
                    System.out.printf("%.2f", totalPrice);
                    System.out.println(" dollars");
                }

                break;

            default:
                System.out.println("Please enter a valid day, or check your spelling!");


        }


    }
}
