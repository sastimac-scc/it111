import java.sql.SQLOutput;

public class MyForLoop {

    public static void main(String[] args){

        int count;

        for(count = 0; count <= 20; count = count+2) {
            System.out.print(count +" ");
        }
        System.out.println("");
        System.out.println("________________________");

        for(count = 0; count <= 30; count = count+3) {
            System.out.print(count +" ");
        }
        System.out.println("All Done");

        System.out.println("________________________");

        int newCount;

        for(newCount = 40; newCount >0; newCount = newCount-2) {
            System.out.print(newCount + " ");
        } // end of loop

        System.out.println("");
        System.out.println("________________________");

        for(newCount = 30; newCount >0; newCount = newCount-1) {
            System.out.print(newCount + " ");
        } // end of loop
        System.out.println("");
        System.out.println("Blast Off");


        System.out.println("________________________");


        for(newCount = 30; newCount >0; newCount = newCount-1) {
            if(newCount <= 10) {
                System.out.println("");
                System.out.print("We are almost at blast off!  Only " +newCount +" seconds away!");
            } else {
                System.out.print(newCount + " ");
            }
        } // end of loop

        System.out.println("");
        System.out.print("Blast Off");

        System.out.println("");
        System.out.println("________________________");

    }
}
