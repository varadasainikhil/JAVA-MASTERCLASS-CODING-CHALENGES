public class FirstLastDigitSum {
    public static int sumFirstAndLastDigit(int number) {
        int count= 1;
        int sum = 0;
        int n =number;

        // INVALID CASE -if the number is less than the zero
        if (number <0) {
            return -1;
        }

        // if the number is single digit then the double of the number must be returned
        if (number<10) {
            return number+number;
        }
        
        // all the other normal cases
        else{
            //  to count the number of digits in the given number
            while (number/10 != 0) {
                count++;
                number = number/10;
            }
            int digit = 0;
            for (int i = 1; i <= count; i++) {
                digit = n%10;
                n=n/10;
                if (i==1 || i ==count) {
                    sum+=digit;
                }
                System.out.println(digit);
                
            }
            return sum;
    
        }
        
    }
    
}
