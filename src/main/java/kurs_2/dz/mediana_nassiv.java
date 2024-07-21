package kurs_2.dz;

import java.util.Arrays;

public class mediana_nassiv {
    public static void main(String[] args) {
        int[] nums1 = {1, 3};
        int[] nums2 = {2, 4};
        int[] nums = mediana_nassiv.sortedArrays(nums1, nums2);
        System.out.println(STR." объединенный массив = \{Arrays.toString(nums)}");
        System.out.println(STR."медиана равна   = \{ findMediana(nums)}");
    }

    private static int[] sortedArrays(int[] nums1, int[] nums2) {
        int[] nums = new int[nums1.length + nums2.length];
        int i = 0;
        int j = 0;
        int k = 0;
        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] < nums2[j]) {
                nums[k] = nums1[i];
                i++;
            } else {
                nums[k] = nums2[j];
                j++;
            }
            k++;
        }
        while (i < nums1.length) {
            nums[k] = nums1[i];
            i++;
            k++;
        }
        while (j < nums2.length) {
            nums[k] = nums2[j];
            j++;
            k++;
        }


        return nums;

    }

    static double findMediana(int[] nums) {
        double mediana = 0;
        if (nums.length % 2 == 0) {
            mediana = (double) (nums[nums.length / 2] + nums[nums.length / 2 - 1]) / 2;
        }
        else  {
            mediana = nums[nums.length / 2];
        }
        return  mediana;
    }


}

