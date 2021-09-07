public class TeenNumberChecker {
    public static boolean hasTeen(int i1, int i2, int i3) {
        if ( i1 == 0 && i2==0&&i3==0){
            return false;
        }
        else if ( (i1 >= 13 && i1<= 19 || i1 == 0 )&&(i2 >= 13 && i2<= 19 || i2 == 0 )&& (i3 >= 13 && i3<= 19 || i3 == 0)){
            return true;
        }
        else{
            return false;
        }
    }
    public static boolean isTeen(int d1) {
        if(d1>=13 && d1<=19){
            return true;
        }
        else{
            return false;
        }
        
    }
    
}
