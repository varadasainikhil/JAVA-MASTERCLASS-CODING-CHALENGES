public class EvenDigitSum {
    public static int getEvenDigitSum(int number){
        // For the invalid case
        if (number < 0) {
            return -1;
        }
        int digit=0;
        int sum=0;
        while (number!=0) {
            digit =number%10;
            number/=10;
            if (digit %2 ==0) {
                sum+=digit;
            }
        }
        return sum;
    }
}
