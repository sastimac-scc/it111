public class CelciusFarConverter {
    public static void main(String[] args) {
        // far = (cel * 9/5) + 32

        int cel, far;

        for(cel = 0; cel <= 100; cel= cel + 2) {
            far = (cel * 9/5) + 32;
            if(cel <100){
                System.out.println(" " +cel + " degrees Celcius is equal to " +far +" degrees Farenheit");
            } else {
                System.out.println(cel + " degrees Celcius is equal to " + far + " degrees Farenheit");
//            System.out.print(far + " ");
            }
        } // end for loop
//        System.out.println("");
        System.out.println("All done!");
    }
}
