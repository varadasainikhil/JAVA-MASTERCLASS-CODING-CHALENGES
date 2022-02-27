import java.util.Scanner;

public class DescendingSortOnArray {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] array = getArray(5);
        printArray(sortArray(array));
    }

    public static int[] getArray(int n){
        int[] values =new int[n];
        System.out.println("Enter 5 numbers to sort in descending order ");
        for (int i = 0; i <n ; i++) {
            values[i]= scanner.nextInt();
            scanner.nextLine();
        }
        return values;
    }

    public static int[] sortArray(int[] array){
        for (int i = 0; i < array.length; i++) {
            for (int j = i+1; j < array.length; j++) {
                if (array[i] < array[j]){
                    int temp =0;
                    temp = array[i];
                    array[i]=array[j];
                    array[j]=temp;
                }
            }
        }
        return array;
    }

    public static void printArray(int[] array){
        System.out.println("Elements in descending order :");
        for (int i = 0; i < array.length ; i++) {
            System.out.println(array[i]);
        }
    }
}
