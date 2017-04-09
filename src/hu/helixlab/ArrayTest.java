package hu.helixlab;

import java.util.Random;

/**
 * Created by Hp_Workplace on 2017.04.09..
 */
public class ArrayTest {
    private int[] array = new int[20];

    public void initArray(){
        Random random = new Random();
       for (int i = 0; i < array.length; ++i){
           array[i] = random.nextInt(30) + (-10);
           System.out.print(array[i] + ", ");
       }
    }
    public void getSecondHighest(){
        int highest = 0;
        int secondHighest = 0;
        for (int i = 0; i < array.length; ++i){
            if (array[i] > highest){
                secondHighest = highest;
                highest = array[i];
            } else if (array[i] > secondHighest){
                secondHighest = array[i];
            }
        }
        System.out.println("\nA második legnagyobb elem: " + secondHighest);
    }

}
