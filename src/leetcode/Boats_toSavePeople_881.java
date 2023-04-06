package leetcode;

import java.util.Arrays;

public class Boats_toSavePeople_881 {
    public static void main(String[] args) {
        int []people = {2,1,2,3};
        int limit = 3;
        System.out.println(numRescueBoats(people,limit));
    }
    public static int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        int i =0;
        int j =people.length-1;
        int count=0;
        while (i<=j){
            if (people[i]+people[j]<=limit){
                count++;
                i++;
                j--;
            }
            else {
                count++;
                j--;
            }
        }
        return count;
    }
}
