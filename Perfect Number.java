public class PerfectNumber {
    public static boolean isPerfectNumber(int number) {
        //invalid case
        if(number&lt;1){
            System.out.println("Invalid input");
            return false;
        }
        //for the factors
        int divisor = 1;
        int sum = 0; 
        while (number &gt; divisor) {
            if (number % divisor == 0) {
                System.out.println(divisor);
                sum += divisor; 
                divisor++;               
            }
            else{
                divisor++;
            }
            
        }
        System.out.println(sum);
        if(number == sum){
            System.out.println("It is a perfect number");
            return true;
        }
        else{
            System.out.println("It is not a perfect number");
            return false;
        }
        
    }
    
}
