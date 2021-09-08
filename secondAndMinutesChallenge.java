public class secondAndMinutesChallenge {
    public static void main(String[] args) {
        getDurationString(61,0);
        getDurationString(130);
    }
    public static String getDurationString(int minutes, int seconds) {
        if( minutes >=0 && seconds>=0 && seconds<=59){
            int hours = minutes/60;
            int remainingMintues = minutes%60;
            System.out.println(hours + "h"+ remainingMintues +"m"+seconds+"s");
            return(hours + "h"+ remainingMintues +"m"+seconds+"s");
        }
        else{
            System.out.println("invalid values");
            return "invalid values";
        }
        
    }
    public static String getDurationString(int seconds) {
        if(seconds>=0){
            int minutes = seconds/60;
            int remainingSeconds = seconds%60;
            System.out.println(minutes + "m"+ remainingSeconds+"s");
            return (minutes + "m"+ remainingSeconds+"s");
        }
        else{
            System.out.println("invalid values");
            return "invalid values";
        }
        
    }
}
