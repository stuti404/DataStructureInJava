package Stack;

public class Sctacks {
    protected int[] arr;
    private int top;
    public Sctacks(){
        arr = new int[5];
        top = -1;
    }
    public Sctacks(int cap){
        arr = new int[cap];
        top =-1;
    }
    public boolean isEmpty(){
        return top== -1;
    }
    public boolean isFull(){
        return top == arr.length-1;
    }
    public void Push(int item) throws Exception{
        if (isFull()) {
            throw new Exception("Stack is full");
        }
        top++;
        arr[top] = item;
    }
    public int Pop()throws Exception{
        if(isEmpty()){
            throw new Exception("Stack is empty");
        }
        int val = arr[top];
        top--;
        return val;
    }
    public int peek() throws Exception{
        if(isEmpty()){
            throw new Exception("Stack is empty");
        }
        int val = arr[top];
        return val;
    }
    public int size (){
        return top+1;
    }
    public void Displap(){
        for (int i = 0; i <=top ; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
