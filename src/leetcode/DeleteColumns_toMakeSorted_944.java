package leetcode;

public class DeleteColumns_toMakeSorted_944 {
    public int minDeletionSize(String[] strs) {
        int coount =0;
        for (int i = 0; i < strs[0].length(); i++) {
            for (int j = 1; j < strs.length; j++) {
                if (strs[j].charAt(i)<strs[j-1].charAt(i)){
                    coount++;
                    break;
                }
            }
        }
        return coount;
    }
}
