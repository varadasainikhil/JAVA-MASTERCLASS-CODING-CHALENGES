public class SumOddRange {
    public static boolean isOdd(int number) {
        if(number<0){
            return false;
        }
        if(number %2==0){
            return false;
        }
        else{
            return true;
        }
    }
    public static int sumOdd(int start , int end) {
        int sum =0;
        if(start>end ){
            return -1;
        }
        if(start ==end){
            if(isOdd(start)){
                return start;
            }
            else{
                return 0;
            }
        }
        if(start<0 ){
            return -1;
        }
        for (int i=start ; i<=end;i++){
            if(isOdd(i)){
                sum+=i;
            }
            else{
                continue;
            }
        }
        return sum;
    }
    
}
