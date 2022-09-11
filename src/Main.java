import java.util.Scanner;
/* Tools (import java.util.Scanner;) must be imported into file to allow for usage of additional data types.
   Scanner allows for user input. note that tools & imported packages are above all other code in file.
   following the import of the package, a Scanner object must be created.
   first declare the variable with type, then initialize the new Scanner object:
                Scanner scannerName = new Scanner(System.in);
   This statement prompts the user for input.

   To use this input, we must create a var to store the response in:
   String scanned = scannerName.next();
   scanned is var name, scannerName.next takes the input from user & stores it as a string



    */

public class Main {

    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);
        // class & data-type, scanner is declared with var name userInput.
        // a new scanner is initialized with the purpose of receiving input from user.

        String scanned = userInput.next();
        // a variable meant to store next user input from scanner is declared & initialized.
        // at this point the user will have a stored value of data type: String.
        // If program calls other data types from String var, an error will be given.

        /* other data type solutions:
            int scanned = userInput.nextInt(); 5, 10, etc.
            double scanned = userInput.nextDouble(); 5.0, 10.0, etc. (can receive int value)
            boolean scanned = userInput.nextBoolean(); true, false

            The above statements/methods are not necessary in most cases & best to use
            String as var data type because we can parse & filter user input as necessary.

         */

        // to get an integer value from user's string:

        int scannerInt = Integer.parseInt(scanned);
        boolean scannerBoolean = Boolean.parseBoolean(scanned); //pars & filter
        System.out.println(scanned);
        System.out.println(scannerInt);
        System.out.println(scannerBoolean);
        // without proper conditional statement, error is still the result.
        // but this is proper syntax for function.





        // First portion is scanner, second is focused on operators.

        int x, y, z = 56;
        //variables can be declared & initialized in-line,or declared then initialized
        // beneath the original declaration at a later time.

        x = 11;
        y = 2;
        int sumD = (x / y);
        int modulus = (x % y);
        double preciseDivision = ((double)x / y);
        // x has been type-cast to double in-line, but original assignment it still int.
        System.out.println(x); // output = int value because declared as int.
        // x only takes primitive type double in local statement.

        // even if both numbers are double with %, outputs are whole number remainder. 12.0/5.0 == 2.0

        /* Best to use parenthesis to clarify order of operations. all arithmetic works as expected aside
        from 2 operators: division & modulus (%): division from a variable int will only give
        the largest whole number dividend. ie 11/2 = 5 r1. output will only be 5. to get the remainder,
        use modulus to find whole number remainder.
        if looking for exact division, use double as var type. ie 11/2 = 5.5
         */
        System.out.println(sumD); // 5
        System.out.println(modulus); // r1
        System.out.println((double)sumD);
        //when searching for precise remainder with decimal value, at least one of
        // the operands must be var: double. attempting to output the solution with a cast-type
        // of double will only give integer value still.
        System.out.println(preciseDivision);
        // only 1 operand needs to be type double for precision decimal value.

        //exponent arithmetic in java is a bit different syntactically.
        // instead of ** .. command = Math.pow(x,y) x == base , y == exponent
        // exponents default to var type double unless otherwise cast in-line.
        int sumSquaredInt = (int) Math.pow(sumD,2); // == 25
        double sumSquared = Math.pow(sumD, 2); // == 25.0

        System.out.println(sumSquared);
        System.out.println(sumSquaredInt);
// if any var is double, resulting arithmetic will be double; thus, must be cast as such.
//

    }
}
