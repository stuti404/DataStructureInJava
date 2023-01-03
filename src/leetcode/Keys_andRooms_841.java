package leetcode;

import java.util.*;

public class Keys_andRooms_841 {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        Queue<Integer> queue = new LinkedList<>();
        boolean[] visted = new boolean[rooms.size()];

        visted[0]= true;
        for (int i:rooms.get(0)){
            queue.add(i);
            visted[i]= true;
        }

        while (!queue.isEmpty()){
            int temp = queue.poll();
            for (int i :rooms.get(temp)){
                if (visted[i]==false){
                    queue.add(i);
                    visted[i]=true;
                }
            }
        }
        for (int i = 0; i < visted.length; i++) {
            if (visted[i]==false){
                return false;
            }
        }
        return true;
    }
}
