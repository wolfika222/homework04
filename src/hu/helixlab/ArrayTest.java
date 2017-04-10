package hu.helixlab;

import java.util.Arrays;
import java.util.Random;

/**
 * Created by Hp_Workplace on 2017.04.09..
 */
public class ArrayTest {
    private int[] array = new int[20];
    private int[][] matrix = new int[5][5];

    public void initArray() {
        Random random = new Random();
        for (int i = 0; i < array.length; ++i) {
            array[i] = random.nextInt(30) + (-10);
            System.out.print(array[i] + ", ");
        }
    }

    public void getSecondHighest() {
        int highest = 0;
        int secondHighest = 0;
        for (int i = 0; i < array.length; ++i) {
            if (array[i] > highest) {
                secondHighest = highest;
                highest = array[i];
            } else if (array[i] > secondHighest) {
                secondHighest = array[i];
            }
        }
        System.out.println("\nA második legnagyobb elem: " + secondHighest);
    }

    public void initMatrix() {
        Random random = new Random();
        for (int i = 0; i < matrix.length; ++i) {
            for (int j = 0; j < matrix.length; ++j) {
                matrix[i][j] = random.nextInt(2);
                System.out.print(matrix[i][j] + ", ");
            }
            System.out.println();
        }
    }

    public void searchNotNullRows() {
        String[] result = new String[5];
        int number = 0;
        for (int i = 0; i < matrix.length; ++i) {
            for (int j = 0; j < matrix.length; ++j) {
                result[i] = Arrays.toString(matrix[i]);
            }
        }
        for (int i = 0; i < result.length ; i++) {

            if (result[1].indexOf("0") == number){
                System.out.println("Nincs ilyen szám!");
            } else{

            }
        }
    }


}
