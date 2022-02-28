import java.util.Scanner;

public class MinimumElement {

    private static int readInteger(){
         Scanner scanner =new Scanner(System.in);
        System.out.println("Enter the number of numbers needed in the array");
        int count = scanner.nextInt();
        scanner.nextLine();
        return  count;
    }

    private static int[] readElements(int count){
        Scanner scanner =new Scanner(System.in);
        int[] array = new int[count];
        System.out.println("Enter "+ count+" numbers");
        for (int i = 0; i < count; i++) {
            array[i] = scanner.nextInt();
            scanner.nextLine();
        }
        return array;
    }

    private static int findMin(int[] array){
        for (int i = 0; i < array.length; i++) {
            for (int j = i+1; j < array.length ; j++) {
                if (array[i] > array[j]){
                    int temp =0;
                    temp =array[j];
                    array[j] = array[i];
                    array[i] = temp;
                }
            }
        }
    return array[0];
    }
}
