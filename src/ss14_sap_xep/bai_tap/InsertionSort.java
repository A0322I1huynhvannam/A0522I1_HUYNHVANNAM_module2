package ss14_sap_xep.bai_tap;

import java.util.Arrays;

import static java.util.Arrays.sort;

public class InsertionSort {
    public static void Sort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int curruntElement = array[i];
            int k = i -1;
            for(;k>=0 && array[k]>curruntElement;k--){
                array[k+1]=array[k];
            }
            array[k+1]=curruntElement;
        }
    }

    public static void main(String[] args) {
        int [] myArray = {2,3,4,6,8,2,9};
        sort(myArray);
        System.out.println(Arrays.toString(myArray));
    }
}
