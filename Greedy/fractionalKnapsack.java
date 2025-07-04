/* 
'n' items has some weight ans value repectively, select 'w' weight of items such that their sum of value  is maximum
Note: Fraction of item can be selected  
*/

import java.util.*;

public class fractionalKnapsack {
    public static void main(String[] args) {
        int val[] = { 60, 100, 120 };
        int weight[] = { 10, 20, 30 };
        int w = 50;

        double ratio[][] = new double[val.length][2];
        // 0th col => idx , 1st col => ratio

        for (int i = 0; i < val.length; i++) {
            ratio[i][0] = i;
            ratio[i][1] = val[i] / (double) weight[i];
        }

        Arrays.sort(ratio, Comparator.comparingDouble(o -> o[1]));

        int capacity = w;
        int finalVal = 0;
        for (int i = ratio.length-1; i >= 0; i--) {
            int idx = (int) ratio[i][0];
            if (capacity >= weight[idx]) {   // include whole item
                finalVal += val[idx];
                capacity -= weight[idx];
            } else {
                // include fraction of item 
                finalVal += (ratio[i][1] * capacity);
                capacity = 0;
                break;
            }
        }
        System.out.println("Final value: " + finalVal);
    }
}