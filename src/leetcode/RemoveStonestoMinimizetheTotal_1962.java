package leetcode;

import java.util.PriorityQueue;

public class RemoveStonestoMinimizetheTotal_1962 {
    public int minStoneSum(int[] piles, int k) {
        int sum =0;
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>((a,b)->b-a);
        for (int i = 0; i < piles.length; i++) {
            pq.add(piles[i]);
        }
        int t=0;
        while (t<k){
            int c = pq.poll();
            int r =Math.floorDiv(c,2);
            pq.offer(c-r);
            t++;
        }
        while (!pq.isEmpty()){
            sum +=pq.poll();
        }
        return sum;
    }
}
