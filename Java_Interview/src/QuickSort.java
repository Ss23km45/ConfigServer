import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {5,2,4,8,1,6,3,9};
        Long time = System.currentTimeMillis();
        quickSort(arr,0, arr.length-1);
        Long time2 = System.currentTimeMillis();
        System.out.println("Time Taken to comlete " + (time2 - time) + "MS");
        System.out.println(Arrays.toString(arr));
    }
    
    Object method() {
    	return null;
    }

    static void quickSort(int[] arr, int low, int high){
        if(low>high){
            return;
        }

        int s = low;
        int e = high;
        int mid = (low + high) /2;
        int pivot = arr[mid];

        while (s <= e){
            while(arr[s] < pivot){
                s++;
            }

            while(arr[e] > pivot){
                e--;
            }

            if(s <= e){
                int temp = arr[e];
                arr[e] = arr[s];
                arr[s] = temp;
                s++;
                e--;
            }
        }
       quickSort(arr, s, high);
       quickSort(arr, low, e);
        

    }
}