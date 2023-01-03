package leetcode;

import java.lang.reflect.Array;
import java.util.*;

public class SingleThreadedCPU_1834 {
    public int[] getOrder(int[][] tasks) {
        int n =tasks.length;

        Task [] arr = new Task[n];
        for (int i = 0; i < n; i++) {
            arr[i] =new Task (i,tasks[i][0],tasks[i][1]);
        }
        Arrays.sort(arr,(a,b) -> {
            return Integer.compare(a.enqueueTime,b.enqueueTime);
        });
        PriorityQueue<Task> pq = new PriorityQueue<>((a,b)->{
            if (a.processTime == b.processTime){
                return Integer.compare(a.index, b.index);
            }
            return Integer.compare(a.processTime,b.processTime);
        });
        int [] ans =new int[n];
        int ansIndex= 0;
        int taskIndex =0;
        int curTime =0;
        while (ansIndex<n){
            while (taskIndex <n && arr[taskIndex].enqueueTime <=curTime){
                pq.offer(arr[taskIndex++]);
            }
            if (pq.isEmpty()){
                curTime =arr[taskIndex].enqueueTime;
            }
            else {
                curTime+= pq.peek().processTime;
                ans[ansIndex++] =pq.poll().index;
            }
        }
        return ans;
    }
    class Task{
        int index;
        int enqueueTime;
        int processTime;

        Task(int index,int en,int pro){
            this.index = index;
            this.enqueueTime= en;
            this.processTime=pro;
        }
    }
}
