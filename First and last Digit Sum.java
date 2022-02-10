public class FirstLastDigitSum {
    public static int sumFirstAndLastDigit(int number) {
        int count= 1;
        int sum = 0;
        int digit = 0;

        // INVALID CASE -if the number is less than the zero
        if (number <0) {
            return -1;
        }

        // if the number is single digit then the double of the number must be returned
        if (number<10) {
            return number+number;
        }
            // For all the normal cases
            while (number!=0) {
                digit = number%10;
                number /=10;
                if (count==1 ) {
                    sum+=digit;
                }
                count++;
            }
            return sum+=digit;

    
        }
        
    }
    
