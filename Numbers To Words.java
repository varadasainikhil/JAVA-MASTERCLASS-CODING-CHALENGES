public class NumberToWords {
    public static void numberToWords(int number) {
        int digits = 0;
        int count = 0;
        int noOfDigits = getDigitCount(number);
        number = reverse(number);
        if (number < 0) {
            System.out.println("Invalid Value");
        }
        else{
            while (count != noOfDigits) {
                count++;
                digits = number % 10;
                number /= 10;
                switch (digits) {
                    case 0:
                        System.out.println("Zero");
                        break;
                    case 1:
                        System.out.println("One");
                        break;
                    case 2:
                        System.out.println("Two");
                        break;
                    case 3:
                        System.out.println("Three");
                        break;
                    case 4:
                        System.out.println("Four");
                        break;
                    case 5:
                        System.out.println("Five");
                        break;
                    case 6:
                        System.out.println("Six");
                        break;
                    case 7:
                        System.out.println("Seven");
                        break;
                    case 8:
                        System.out.println("Eight");
                        break;
                    default:
                        System.out.println("Nine");
                        break;
                }
            }
        }
    }
    public static int reverse(int number) {
        int reversenumber = 0;
        int digits=0;
        while (number != 0) {
            digits = number%10;
            reversenumber= reversenumber*10+digits;
            number/=10;
        }
        return reversenumber;
    }
    public static int getDigitCount(int number) {
        int count=0;
        if (number<0) {
            return -1;
        }
        if (number<10) {
            return 1;
        }
        while (number>0) {
            count++;
            number/=10;
        }
        return count;
    }
}
