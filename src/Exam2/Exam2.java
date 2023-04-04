package Exam2;

import java.util.ArrayList;

public class Exam2 {
    public static int moal (ArrayList<Integer> arr, int i){
        int largest = arr.get(i);
        if (arr.isEmpty())
            return 0;
        else if (arr.get(i + 1).compareTo(arr.get(i)) > 0){
            largest = arr.get(i + 1);
            return moal(arr, i + 1);

        }


        return largest;
    }


    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(4);
        nums.add(0);
        nums.add(-99);
        nums.add(23);
        nums.add(15);
        nums.add(6);



        System.out.println(moal(nums,2));
    }


}
