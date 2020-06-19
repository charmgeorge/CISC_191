package cisc_191_highlowsort;
import java.util.Scanner;
//import java.util.Arrays;
import java.util.*;

public class HighLowSort {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args){
        int maxEntries = 5;
        int array[] = new int[maxEntries];
        System.out.println("Please enter a total of "
                + maxEntries + " integers");

        for(int x = 0 ; x < maxEntries; x++){
            System.out.print("Integer "+ (x + 1) + " : ");
            int i = isValueInteger();
            array[x]=i;
        }

        Arrays.sort(array);
        int smallestNum = array[0];
        int largestNum = array[array.length - 1];
        System.out.println("The smallest number is " + smallestNum
                + " and the largest number is " + largestNum);
 }

    public static int isValueInteger(){
        while (true){
            try {
                return input.nextInt();
            }
            catch (InputMismatchException e){
                input.next();
                System.out.print("This is not an integer. "
                + "Please try again by entering an integer: ");

            }
        }
    }
}
