public class MyLiter2Gallon {
    public static void main(String[] args) {

        // gallon = 3.79 * liter
        // actual ratio: gallon = 3.78541178 * liter

        int gallon, mod, lineCount, skipCount;
        float liter, conversion, gallonD;


        liter = 0.0f;
        conversion = 3.78541178f;
        lineCount = 0;
        skipCount = 5;
        mod = 0;


        for (gallon = 1; gallon <= 100; gallon += 4) {
            liter = conversion * gallon;
            gallonD = gallon;
            mod = lineCount % skipCount;

            if (mod == 0) {
                System.out.println();
            }

            System.out.printf("%.2f", liter);
            System.out.print(" Liters = ");
            System.out.printf("%.1f", gallonD);

            if (gallon == 1) {
                System.out.println(" Gallon");
            } else {
                System.out.println(" Gallons");
            }

            lineCount += 1;
        } // end of For loop
        System.out.println("");
        System.out.println("We are done!!!!");
    }
}
