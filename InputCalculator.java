import java.util.Scanner;

public class InputCalculator {
    public static void inputThenPrintSumAndAverage() {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int avg = 0;
        int number = 0;
        int count=0;
        while (true) {
            Boolean isInt = scanner.hasNextInt();
            if (isInt) {
                count++;
                number = scanner.nextInt();
                sum+= number;
            }
            else{
                break;
            }
        }
        avg =(int)Math.round((double)sum/count);
        System.out.println("SUM = "+sum+" AVG = "+avg);
        scanner.close();
    }
}
