public class LastDigitChecker {
    public static boolean hasSameLastDigit(int n1,int n2,int n3) {
        if((10<=n1)&&(n1<=1000)&&(10<=n2)&&(n2<=1000)&&(10<=n3)&&(n3<=1000)){
            int a1 = n1%10;
            int a2 = n2%10;
            int a3 = n3%10;
            if((a1==a2)||(a1==a3)||(a2==a3)){
                System.out.println("true");
                return true;
            }
            else{
                System.out.println("false");
                return false;
            }
        }
        else{
            System.out.println("false");
            return false;
        }
        
    }
    public static boolean isValid(int number) {
        if((number>=10)&&(number<=1000)){
            System.out.println("true");
            return true;
        }
        else{
            System.out.println("false");
            return false;
        }
    }
    
}
