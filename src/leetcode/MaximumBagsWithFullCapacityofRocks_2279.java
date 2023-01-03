package leetcode;

import java.util.Arrays;

public class MaximumBagsWithFullCapacityofRocks_2279 {
    public int maximumBags(int[] capacity, int[] rocks, int additionalRocks) {
        int [] vacancy = new int[capacity.length];
        for (int i = 0; i < vacancy.length; i++) {
            vacancy[i]= capacity[i]-rocks[i];
        }
        Arrays.sort(vacancy);
        int count =0;
        for (int i = 0; i < capacity.length; i++) {
            if (vacancy[i]==0){
                count++;
            }
            else {
                if (additionalRocks>=vacancy[i]){
                    additionalRocks -=vacancy[i];
                    count++;
                }
                else {
                    break;
                }
            }
        }
        return count;
    }
}
