package Stack;

public class Dynamic_Stacks extends Sctacks {
    @Override
    public void Push (int item)throws Exception{
        if (this.isFull()){
            int [] newarr = new int[2*arr.length];
            for (int i = 0; i < this.arr.length; i++) {
                newarr[i] = arr[i];
            }
            arr = newarr;
        }
        super.Push(item); // to use parent class push we need to use super otherwise it will access itself function
    }
}
