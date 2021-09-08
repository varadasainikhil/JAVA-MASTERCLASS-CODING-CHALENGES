public class MinutesToYearsDaysCalculator {
    public static void printYearsAndDays(long minutes) {
        if (minutes<0){
            System.out.println("Invalid Value");
        }
        else{
            long years = minutes/(60*24*365);
            long remainingMinutes = minutes - (years*60*24*365);
            long days = remainingMinutes %(60);
            if(days ==0 && minutes ==0){
                days=0;
            }
            else{
                days=remainingMinutes/(60*24);
            }
            System.out.println(minutes + " min = " + years +" y and " + days +" d");
        }
        
    }
}
