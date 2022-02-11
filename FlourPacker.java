public class FlourPacker {
    public static boolean canPack(int bigCount, int smallCount, int goal) {
        if (bigCount<0 || smallCount<0||goal<0 ) {
            return false;
        }
        int bigCountTotal = 0;
        bigCountTotal = 5 * bigCount;
        int sum = bigCountTotal+smallCount;
        int rem = goal -bigCountTotal;
        if (goal == sum) {
            return true;
        }
        if (goal>sum){
        return false;
        }
        else if(sum>goal){
            if (goal == bigCountTotal) {
                return true;
            }
            else if(bigCountTotal>0 && (goal%bigCountTotal ==0 || bigCountTotal%goal==0)){
                return true;
            }
            else if(rem>0 && smallCount-rem >0){
                return true;
            }
            else if(bigCountTotal<sum && smallCount<sum){
                for (int i = 0; i < bigCount; i++) {
                    goal -= 5;
                    if (goal<0) {
                        return false;
                    }
                    else if (smallCount-goal>=0) {
                        return true;
                    }
                }
            }
            return false;
        }
        return false;
    }
}