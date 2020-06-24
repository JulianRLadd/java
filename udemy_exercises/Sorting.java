package udemy_exercises;

import java.util.*;

class Sorting {

    private static Scanner scan = new Scanner(System.in);

    public static int[] sortIntegers(int[] nums) {
        int[] sortedArr = Arrays.copyOf(nums, nums.length);
        boolean sorted = true;
        int temp;
        do {
            sorted = false;
            for (int j = 0; j < sortedArr.length - 1; j++) {
                if (sortedArr[j] < sortedArr[j + 1]) {
                    temp = sortedArr[j];
                    sortedArr[j] = sortedArr[j + 1];
                    sortedArr[j + 1] = temp;
                    sorted = true;
                }
            }
        } while (sorted);
        return sortedArr;
    }

    static void printNums(int[] arrList) {
        for (int i : arrList) {
            System.out.println(i);
        }
    }

    public static int[] getNums(int num) {
        int[] arr = new int[num];
        for (int i = 0; i < num; i++) {
            arr[i] = scan.nextInt();
        }
        System.out.println(arr[3]);
        return arr;
    }

    static void reverse(int[] numbers) {
        // I think this function is impure
        for (int i = 0; i < numbers.length / 2; i++) {
            int temp = numbers[i];
            numbers[i] = numbers[numbers.length - i - 1];
            numbers[numbers.length - i - 1] = temp;
        }

    }

    public static void main(String[] args) {
        System.out.println("This is the Sorting Class");
        int[] arrList = getNums(5);
        System.out.println("*************");
        printNums(arrList);
        System.out.println("*************");
        int[] sortedArray = sortIntegers(arrList);
        printNums(sortedArray);
        reverse(sortedArray);
        printNums(sortedArray);
    }

}
