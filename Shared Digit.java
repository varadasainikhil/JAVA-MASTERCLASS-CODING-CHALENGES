public class SharedDigit {
    public static boolean hasSharedDigit(int number1, int number2) {
        if((number1<=99)&&(number1>=10)&&(number2<=99)&&(number2>=10)){

            int a1= number1%10;
            int a2= number1/10;
            int b1= number2%10;
            int b2= number2/10;

            if ((a1==b2)||(a1==b1)||(a2==b1)||(a2==b2)) {
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
}
