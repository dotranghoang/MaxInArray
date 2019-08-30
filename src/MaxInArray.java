import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class MaxInArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = 0;

        try {
            System.out.println("Insert Length of array:");
            size = scanner.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Error Datatype!");
        } catch (Exception e) {
            System.out.println("Error!");
        }

        double array[] = new double[size];
        try {
            System.out.println("Insert value of array (number):");
            for (int i = 0; i < size; i++) {
                array[i] = scanner.nextDouble();
            }
            System.out.println("This array: " + Arrays.toString(array));
            double max = array[0];
            int position = 0;
            for(int j = 0 ; j < array.length ; j++) {
                if (array[j] > max) {
                    max = array[j];
                    position = j ;
                }
            }
            System.out.println("Max in array is: " + max + " position: " + (position + 1)  );
        } catch (InputMismatchException e) {
            System.out.println("Error Datatype!");
        } catch (Exception e) {
            System.out.println("Error!");
        }

    }
}
