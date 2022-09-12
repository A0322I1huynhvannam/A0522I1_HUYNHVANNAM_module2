package ss13_tim_kiem.bai_tap;

public class BinarySearch {
    public static int Search(int [] array, int value){
        int left = 0;
        int right = 0;
        while (left <= right){
            int mid = (left + right)/2;
            if(array[mid] == value){
                return mid;
            } else if(array[mid] > value){
                right = mid -1;
            } else {
                left = mid + 1;
            }
        } return -1;
    }

    public static void main(String[] args) {
        int [] myArray = {1,2,3,4,5,6,7,8,9,10};
        System.out.println(Search(myArray,5));
    }
}
