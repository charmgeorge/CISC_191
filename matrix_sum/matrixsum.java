package exercise08_01;
import java.util.Scanner;

public class Exercise08_01 {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        int rows = 3;
        int columns = 4;
        double[][] m = new double[rows][columns];

        System.out.println("Enter a " + rows + "-by-" + columns + " matrix row by row:");

        for (int row = 0; row < m.length; row++){
            for (int column = 0; column < m[row].length; column++) {
                m[row][column] = keyboard.nextDouble();
          }
       }

        for(int i= 0; i < m[0].length; i++){
            System.out.println("Sum of elements at column " + i + " is " + sumColumn(m,i));

        }
    }

    public static double sumColumn(double[][] m, int columnIndex){

        double sum = 0;
            for(int i= 0; i <  m.length; i++){
               sum = sum + m[i][columnIndex];
            }
        return sum;
    }
}
