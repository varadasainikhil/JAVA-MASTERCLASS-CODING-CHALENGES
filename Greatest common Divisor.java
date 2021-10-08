public class GreatestCommonDivisor {
    public static int getGreatestCommonDivisor(int first , int second) {
        // for the invalid case
        if((first<10)||(second<10)){
            return -1;
        }
        else{
            int a=1;
            int gcd =0;
            while ((a<first)||(a<second)) {
                if((first%a ==0)&&(second%a==0)){
                    gcd =a;
                    a++;
                }       
                else{
                    a++;
                }  
            }
          //pritning the gcd
            System.out.println("GCD ="+gcd);
            return gcd;
        }
        
    }
    
}
