public class myATM {

    public static void main(String[] args){
        int withdrawal, amount;
        withdrawal = 40;
        amount = 200;

        while(amount !=0){
            amount -= withdrawal;
//            amount = amount - withdrawal;
//            System.out.println("Your present amount after the withdrawal is " +amount +" dollars");

            if(amount ==0) {
                System.out.println("You have no money!!!");
                } else { // end of if
                System.out.println("Your present amount after the withdrawal is " +amount +" dollars.");
                } // end of else
            } //end of while
        } // end of public
} //end of ATM