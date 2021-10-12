public class LargestPrime {
    public static int getLargestPrime(int number) {
        int a =0;

        //invlaid case
        if (number<0) {
            System.out.println("Number is less than 0");
            return -1;
        }
        //for 0 and 1 values
        if (number == 0 || number ==1) {
            System.out.println("Number is 0 or 1");
            return -1;
        }
        //for checking the factor of the number
        for ( int i=1; i <= number; i++) {
            int count =0;
            if (number%i==0) {
                for (int j = 1; j <= i; j++) {
                    
                    if(i%j==0){
                        count++;
                    }
                }
                if (count==2) {
                    a=i;                   
                }
                else{
                    continue;
                }
                
            }
            
        }
        System.out.println("The largest prime number factor of "+number+" is "+a);
        return a;
        
    }            
}
