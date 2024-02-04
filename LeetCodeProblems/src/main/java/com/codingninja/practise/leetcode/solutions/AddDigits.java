package com.codingninja.practise.leetcode.solutions;

class AddDigits {

    public static void main(String[] args) {
        System.out.println(addDigits(544));
    }
    public static int addDigits(int num) {
        if(num < 10){
            return num;
        }
        int sum = 0;
        while(num != 0){
            int temp = num %10;
            sum += temp;

            num = num /10;
        }

        if(sum >10){
            sum = addDigits(sum);
        }

        return sum;
    }
}