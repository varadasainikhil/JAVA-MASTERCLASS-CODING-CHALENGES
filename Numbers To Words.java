public class NumberToWords {
    public static void numberToWords(int number) {
        int duplicate_number = reverse(number);
        int loopnumber = getDigitCount(number);
        //invalid case
        if (duplicate_number<0) {
            System.out.println("Invalid Value");
        }
        int a = 0;
        for (int i = 1; i <=loopnumber; i++) {
            a = duplicate_number % 10;
            switch (a) {
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
                case 9:
                    System.out.println("Nine");
                    break;
                default:
                    break;
                
                }
                duplicate_number = duplicate_number/10;
            
        }
        
    }
    public static int reverse(int b) {
        int x=0;
        while (b !=0) {
            x=x*10+b%10;
            b=b/10;
        }
        return x;       
    }
    public static int getDigitCount(int number) {
        //invalid case
        if(number<0){
            return -1;
        }
        int count = 0;
        int a=0;
        if (number == 0) {
            count =1;            
        }
        while (number>0) {
            a = number%10;
            number = number/10;
            count++;
        }
        return count;
        
    }
}
