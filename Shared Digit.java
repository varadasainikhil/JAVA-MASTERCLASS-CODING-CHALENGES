public class SharedDigit {  
    public static boolean hasSharedDigit(int n1, int n2) {
        int number1 = n1;
        if (n1 <10 || n1>99 || n2 <10 || n2>99) {
            return false;
        }
        for (int i = 0; i < 2; i++) {
            int n1digit= number1%10;
            int number2 = n2;
            for (int j = 0; j < 2; j++) {
                int n2digit=number2%10;
                if (n1digit == n2digit) {
                    return true;
                }
                number2=number2/10;
            }
            number1=number1/10;
        }
        return false;
    }
}
