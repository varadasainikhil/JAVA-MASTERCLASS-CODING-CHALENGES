public class NumberPalindrome {
    
    public static boolean isPalindrome(int number) {
        int reverse = 0;
        int original_number =number;
        while (number !=0) {
        reverse = reverse*10 + number%10;
        number=number/10;  
        }
        System.out.println(reverse);
        System.out.println(original_number);
        if(original_number==reverse){
            System.out.println("True");
            return true;
        }
        else{
            System.out.println("False");
            return false;
        }
    }
    
}
