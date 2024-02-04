package com.codingninja.practise.leetcode.solutions.array;

class MaxSubArray {
    public static void main(String[] args) {
        System.out.println(maxSubArray(new int[]{-2,1,-3,4,-1,2,1,-5,4}));
        System.out.println(maxProduct(new int[]{-2,3,-4}));
        System.out.println(maxProfit(new int[]{7,7}));

    }
    private static int maxSubArray(int[] nums) {
        int sum = 0;
        int maxsum = nums[0];

        for (int i = 0; i < nums.length; i++) {
            if(sum < 0){
                sum = 0;
            }
            sum = sum + nums[i];
            maxsum = Math.max(sum, maxsum);
        }

        return maxsum;
        
    }

    private static int maxProduct(int[] nums) {
        int maxPro = nums[0];
        int max = 1, min=1;

        for(int i=0;i<nums.length;i++){
            int k = nums[i];
            int temp = k *  max;
            max = Math.max(Math.max(k* max,k*min), k);
            min = Math.min(Math.min(temp,k*min), k);
            maxPro = Math.max(max, maxPro);

        }

        return maxPro;
    }

    private static int maxProfit(int[] prices) {

        int maxProfit = 0;

        int left = 0;
        int right =1;

        while(right < prices.length){
            if(prices[left] > prices[right]){
                left = right;
            }else if(prices[left] < prices[right]){
                int temp = prices[right] - prices[left];
                maxProfit = Math.max(maxProfit, temp);
                right++;
            }else{
                right++;
            }
        }

        return maxProfit;
    }
}