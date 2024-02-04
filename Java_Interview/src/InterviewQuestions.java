import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class InterviewQuestions {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		//find Smallest element in the given array
		
//		int[] arr = {5,2,8,3,1};
		
//		int min = Arrays.stream(arr).distinct().sorted().skip(1).findFirst().orElseThrow(() -> new Exception("Numberformat exception"));
//		
//		System.out.println("Min Element " + min);
//		
////		int[] arr2 = {6,2,8,9,7,5,1,1,2,1,2,3,1,2,3,5,7,8,9,4,5,6,3};
//		
//		duplicateAndCount(arr2);
		/*
		 * String[] arr2Str = { "expect1", "expect2", "expect2", "expect3", "expect3",
		 * "expect3", "expect4", "expect4", "expect4", "expect4"};
		 * 
		 * duplicateAndCountStr(arr2Str);
		 * 
		 * String myStr = "Welcome to code decode and code decode welcomes you";
		 * 
		 * List<String> myList = Arrays.asList(myStr.split(" "));
		 * 
		 * Map<String, Long> map =
		 * myList.stream().collect(Collectors.groupingBy(Function.identity(),
		 * Collectors.counting()));
		 * 
		 * System.out.println(map);
		 */
		/*
		 * fetchCommonEmelents(arr, arr2); reverseArrayInPlace(arr);
		 */
		
		/*
		 * String[] strArr = {"One", "Two", "Three", "Four", "Five", "six",
		 * "FourtyEight"}; findLengthAgainstString(strArr);
		 */
		int[] arr = {1,2};
		int[] arr2 = {3,4};
		
		System.out.println(findMedianSortedArrays(arr, arr2));
	}
	
    private static double findMedianSortedArrays(int[] nums1, int[] nums2) {
		/*
		 * int nums[] = new int[nums1.length + nums2.length]; int i;
		 * for(i=0;i<Math.min(nums1.length,nums2.length);i++){ if(nums1[i] < nums2[i]){
		 * nums[i] = nums1[i]; }else{ nums[i] = nums2[i]; } }
		 * 
		 * if(i < nums1.length){ for( int j=i;j<nums1.length;j++){ nums[j] = nums1[j]; }
		 * }else if(i < nums2.length){ for( int j=i;j<nums2.length;j++){ nums[j] =
		 * nums2[j]; } }
		 */

    	int i=0,j=0,k=0;
    	int nums[] = new int[nums1.length + nums2.length];
    	while(i<nums1.length && j<nums2.length) {
    		
    		if(nums1[i] < nums2[j]) {
    			nums[k] = nums1[i];
    			i++;
    		}else if(nums1[i] > nums2[j]) {
    			nums[k] = nums2[j];
    			j++;
    		}
    		
    		k++;
    	}
    	
    	while(i<nums1.length) {
    		nums[k] = nums1[i];
    		i++;
    		k++;
    	}
    	
    	while(j<nums2.length) {
    		nums[k] = nums2[j];
    		j++;
    		k++;
    	}
    	
    	int mid = nums.length/2;
    	
    	if(nums.length%2 == 0) {
    		

            // System.out.println((numsl.get(mid) + "   "+ numsl.get(mid-1)));
    		double median = (nums[mid] + nums[mid-1]) / 2.0;
    		return median;
    	}else {
    		return nums[mid];
    	}

        
    }

    private static void duplicateAndCountStr(String[] arr2) {
		
		List<String> myList = Arrays.stream(arr2).collect(Collectors.toList());
		// TODO Auto-generated method stub
		
		Map<String, Long> map = myList.stream().collect(Collectors.groupingBy(k -> k, Collectors.counting()));
		
		System.out.println(map);
	}

	private static void duplicateAndCount(int[] arr2) {
		
		List<Integer> myList = Arrays.stream(arr2).boxed().collect(Collectors.toList());
		// TODO Auto-generated method stub
		
		Map<Integer, Long> map = myList.stream().collect(Collectors.groupingBy(k -> k, Collectors.counting()));
		
		System.out.println(map);
	}

	private static void findLengthAgainstString(String[] strArr) {
		// TODO Auto-generated method stub
		
		int abc = Arrays.stream(strArr).mapToInt(String::length).max().orElse(0);
		System.out.println(abc);
		
		Map<Integer, List<String>> myList = Arrays.stream(strArr).collect(Collectors.groupingBy(String::length, Collectors.toList()));
		System.out.println(myList);
	}

	private static void reverseArrayInPlace(int[] arr) {
		// TODO Auto-generated method stub
		IntStream.range(0, arr.length/2).forEach(ele -> {
			int temp = arr[ele];
			arr[ele] = arr[arr.length - ele -1];
			arr[arr.length - ele -1] = temp;
			
		});
		
		Arrays.stream(arr).forEach(System.out::print);
		
	}

	private static void fetchCommonEmelents(int[] arr, int[] arr2) {
		// TODO Auto-generated method stub
//		boxed to convert to Integer from int
		Long time = System.currentTimeMillis();
		Arrays.stream(arr).filter(num -> Arrays.stream(arr2).anyMatch(num2 -> num2==num)).boxed().forEach(System.out::println);
		System.out.println(System.currentTimeMillis() - time);
	}

}
