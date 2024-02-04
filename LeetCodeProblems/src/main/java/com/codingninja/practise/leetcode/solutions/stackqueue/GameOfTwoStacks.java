package com.codingninja.practise.leetcode.solutions.stackqueue;

import java.io.*;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class GameOfTwoStacks {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int g = Integer.parseInt(bufferedReader.readLine().trim());

        IntStream.range(0, g).forEach(gItr -> {
            try {
                String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

                int n = Integer.parseInt(firstMultipleInput[0]);

                int m = Integer.parseInt(firstMultipleInput[1]);

                int maxSum = Integer.parseInt(firstMultipleInput[2]);

                List<Integer> a = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                        .map(Integer::parseInt)
                        .collect(toList());

                List<Integer> b = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                        .map(Integer::parseInt)
                        .collect(toList());

                int result = GameOfTwoStacks.twoStacks(maxSum, a, b);

                System.out.println(result);
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        bufferedReader.close();
    }


    public static int twoStacks(int maxSum, List<Integer> a, List<Integer> b) {
        // Write your code here
        int al=0;
        int bl = 0;
        int currSum = 0;
        int countNumber = 0;
        while((bl != b.size()) || (al != a.size()))
        {

            if((al<a.size() && bl < b.size())){
                if((a.get(al) < b.get(bl))) {
                    currSum += a.get(al);
                    al += 1;
                }else{
                    currSum += b.get(bl);
                    bl +=1;
                }
            }else{
                if (bl < b.size()){
                    currSum += b.get(bl);
                    bl +=1;
                }

                if(al < a.size()){
                    currSum += a.get(al);
                    al += 1;
                }
            }



            if(currSum > maxSum){
                return countNumber;
            }

            countNumber +=1;
        }
        return countNumber;
    }
}
