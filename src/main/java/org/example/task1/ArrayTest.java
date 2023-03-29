package org.example.task1;


public class ArrayTest {
    static int[] numbers = new int[20];

    public static void printArray(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (i != nums.length - 1) {
                System.out.print(nums[i] + ", ");
            } else {
                System.out.println(nums[i] + ". ");
            }
        }
    }

    public static int generateNumber(int minRange, int maxRange) {
        return ((int) (Math.random() * (maxRange - minRange + 1)) + minRange);
        // minRange = -10; maxRange = 10; (10 - (-10) + 1) + (-10) = 21-10 =
    }

    public static void fillArray(int[] nums, int minRange, int maxRange) {

        for (int i = 0; i < nums.length; i++) {
            nums[i] = generateNumber(minRange, maxRange);
        }
    }

    public static void tripleValues(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] > 0) {
                if (nums[i + 1] < 0) {
                    nums[i] *= 3;
                }
            }
        }
    }


    public static void main(String[] args) {
        fillArray(numbers, -10, 10);
        System.out.println("Initial Array: ");
        printArray(numbers);

        tripleValues(numbers);
        System.out.println("Updated Array: ");

        printArray(numbers);


    }
}









