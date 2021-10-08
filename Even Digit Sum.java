/**
 * EvenDigitSum
 */
public class EvenDigitSum {

    public static int getEvenDigitsum(int number) {
        //invalid option
        if(number < 0){
            return -1;
        }
        //variables 
        int sum = 0;
        int lastDigit =0;

        //calculations
        while (number > 0) {
            //to retrieve last digit
            lastDigit = number%10;

            //to check if its even
            if(lastDigit %2 ==0){
                sum = sum+ lastDigit;
                number = number /10;
            }   
            //if its an odd number         
            else{
                number = number /10;
                continue;
            }
        }
        System.out.println(sum);
        return sum;

    }
}
