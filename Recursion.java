//K Kanemoto
//10.24.24
//Recursive problems testing with JUnit

public class Recursion {
    public static void main(String[] args) {
        // Test cases
        System.out.println(count8(888888888));       // Expected output: 1
        System.out.println(count8(818));     // Expected output: 2
        System.out.println(count8(8818));    // Expected output: 3
        System.out.println(count8(123456));  // Expected output: 0
        System.out.println(count8(88888));   // Expected output: 5
        System.out.println(count8(80808));   // Expected output: 3
    }

    public static int count8(int n) {
        // Base case: if n is 0, there are no digits to count
        if (n == 0) {
            return 0;
        }

        // Check the rightmost digit
        int rightmostDigit = n % 10;

        // If the rightmost digit is 8
        if (rightmostDigit == 8) {
            return 1 + count8(n / 10);
    
        } else {
            // If the rightmost digit is not 8, just proceed to the next digit
            return count8(n / 10);
        }//end else
    }//end method

    //next problems
    public static int countHi(String str) {
        //check for null
        if(str == null)
            return 0;
        
        //base case
        if(str.length() < 2)
            return 0;
        
        char char1 = str.charAt(0);
        char char2 = str.charAt(1);

        //check if char1 is an h and char2 is an i
        if(char1 == 'h' && char2 == 'i')
            return 1 + countHi(str.substring(2));//send in the string minus the first 2 chars

        return countHi(str.substring(1));//send in the string minus the first 1 char
    }//end countHI 
}//end class