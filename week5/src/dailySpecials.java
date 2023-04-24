import java.util.Scanner;

public class dailySpecials {
    public static void main(String[] args) {

        String specials = "";
        Scanner input = new Scanner(System.in);

        specials = input.next();

        String coffee;
        double price = 0;
        double totalPrice = 0;
        int coffeeNumber = 0;


        boolean saturday = specials.equals("Saturday");
        boolean sunday = specials.equals("Sunday");


        System.out.println("Please enter a day of the week excluding weekends (Monday - Friday!)");
        specials = input.next();

        if(saturday || sunday) {
            System.out.println("Please enter a weekday, not a weekend");
            specials = input.next();
        }

        System.out.println("Please enter a day of the week excluding weekends (Monday - Friday!)");
        specials = input.next();

        // need to define coffee type and price

        switch (specials) {
            // my cases will be the day of the week
            case "Monday":
                coffee = "latte";
                price = 4.95;
                System.out.println(specials + "'s coffee of the day is a " + coffee + " and the price will be $" + price);
                break;

            case "Tuesday":
                coffee = "Frapp";
                price = 5.95;
                System.out.println(specials + "'s coffee of the day is a " + coffee + " and the price will be $" + price);
                break;

            case "Wednesday":
                coffee = "Cappucino";
                price = 4.35;
                System.out.println(specials + "'s coffee of the day is a " + coffee + " and the price will be $" + price);
                //                System.out.println("");
                break;

            case "Thursday":
                coffee = "Regular Joe";
                price = 2.95;
                System.out.println(specials + "'s coffee of the day is a " + coffee + " and the price will be $" + price);
                //                System.out.println("");
                break;

            case "Friday":
                coffee = "Green Tea Latte";
                price = 6.95;
                System.out.println(specials + "'s coffee of the day is a " + coffee + " and the price will be $" + price);
                //                System.out.println("");
                break;

            default:
                System.out.println("Please enter a valid day, or check your spelling!");



        }
    }

}


