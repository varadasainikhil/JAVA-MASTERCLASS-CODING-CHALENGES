public class FirstLastDigitSum {
    // write your code here
     public static int sumFirstAndLastDigit(int number) {
        //invalid option
        if(number&lt;0){
            return -1;
        }
        //variables
        int lastdigit = 0;
        int firstdigit=0;
        int sum=0;
        //lasdigit calculation
        lastdigit = number%10;
        //exception case for number sless than 10
        if(number &lt;10 &amp;&amp; number&gt;0){
            sum = 2*number;

        }
        else{
        //while loop
        while (number &gt;=10) {
        firstdigit = number/10;
        number = number/10;            
        }
        //sum of the firstdigit and the lastdigit
        sum = firstdigit+ lastdigit;
    }
        System.out.println("Sum ="+sum);
        return sum;        
    }
}
