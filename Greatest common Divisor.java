public class GreatestCommonDivisor {
    public static int getGreatestCommonDivisor(int first,int second) {
        int a=1;
            int gcd=1;
        if (first<10 || second <10) {
            return -1;
        }
        while (a<=first && a<=second) {
            a++;
            if (first%a==0 && second%a==0) {
                gcd=a;
            }
        }
        return gcd;
    }
}
