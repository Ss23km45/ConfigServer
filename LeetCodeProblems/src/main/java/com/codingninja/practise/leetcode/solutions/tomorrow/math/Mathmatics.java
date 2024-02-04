package com.codingninja.practise.leetcode.solutions.tomorrow.math;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.stream.Stream;

public class Mathmatics {

	public static void main(String... args) {
		char[] arr = { 'g', 'e', 'e', 'k', 's', 'f', 'o',
                'r', 'g', 'e', 'e', 'k', 's' };
		
//	    Arrays.stream(arr);
		
		int[] arr1 = {1,2,3,1};

 // Storing it in a string
 // using copyValueOf() over string
// String str = String.copyValueOf(arr);
		
		containsDuplicate(arr1);
		System.out.println("This is Main MEthod Testing" + String.copyValueOf(arr));
		
		int[][] array = {{1,3},{2,6},{8,10},{15,18}};
		merge(array);
	}
	
	
	
    private static int[][] merge(int[][] intervals) {
        Arrays.sort(intervals,(a,b)->Integer.compare(a[0],b[0]));
        LinkedList<int[]> list=new LinkedList<>();
        for(int[] interval : intervals){
            if(list.isEmpty() || list.getLast()[1]<interval[0]){
                list.add(interval);
            }
            else{
                list.getLast()[1]=Math.max(list.getLast()[1],interval[1]);
            }
        } 
        return list.toArray(new int[list.size()][]);
    }
	
    public static boolean containsDuplicate(final int[] nums) {
        final int length = nums.length;
        if (length == 1) return false;
        if (length == 2) return nums[0] == nums[1];

        for (int i = 1; i < length; i++) {
            final int current = nums[i];
            int j = i - 1, jval = nums[j];
            if (current < jval) {
                while (true) {
                    nums[j + 1] = jval;
                    if (j-- == 0) break;
                    jval = nums[j];
                    if (current >= jval) break;
                }
                nums[j + 1] = current;
            }

            if (j > -1 && current == jval) return true;
        }

        return false;
    }
	
	private static void reverseString(char[] arr) {
		int left = 0;
		int right = arr.length-1;
		while(left < right) {
			swapElements(arr, left, right);
			left ++;
			right--;
		}
	}

	private static void swapElements(char[] arr, int left, int right) {
		// TODO Auto-generated method stub
		
		char temp = arr[left];
		arr[left] = arr[right];
		arr[right] = temp;
		
	}

	static int factorial(int n) {
		if (n == 0)
			return 1;
		else
			return (n * factorial(n - 1));
	}

	private static int trailingZeroes(int N) {
		// Write your code here

		int product = factorial(N);

		int count = 0;

		while (true) {
			if (product % 10 == 0) {
				count++;
				product = product / 10;
			} else {
				return count;

			}
		}

	}
}
