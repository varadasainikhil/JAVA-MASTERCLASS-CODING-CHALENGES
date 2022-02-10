public class LastDigitChecker{
    public static boolean hasSameLastDigit(int n1,int n2, int n3) {
        if (n1<10 || n1>1000 || n2<10 || n2>1000 || n3<10 || n3>1000) {
            return false;
        }
        int n1lastDigit = n1 %10;
        int n2lastDigit = n2 %10;
        int n3lastDigit = n3 %10;
        if (n1lastDigit == n2lastDigit || n1lastDigit == n3lastDigit || n2lastDigit == n3lastDigit) {
            return true;
        }
        return false;
    }

    public static boolean isValid(int number) {
        if (number >=10 && number <=1000) {
            return true;
        }
        return false;
    }
}
