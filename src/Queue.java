public class Queue {
    private int[]arr;
    private int size; // top
    private int front;// element kaha rkhna h
    public Queue(){
        arr = new int[5];
        size =0;
        front =0;
    }
    public Queue(int cap){
        arr = new int[cap];
        size =0;
        front =0;
    }
    public boolean isEmpty(){
        return size==0;
    }
    public boolean isFull(){
        return size==arr.length;
    }
    public int size(){
        return size;
    }
    public void Enqueue(int item)throws Exception{
        if (isFull()){
            throw new Exception("Queue is full");
        }
        int idx = (front+size)%arr.length;
        arr[idx]=item;
        size++;
    }
    public int Dequeue() throws Exception{
        if (isEmpty()){
            throw new Exception("Queue is empty");
        }
        int val = arr[front];
        front = (front+1)%arr.length;
        size--;
        return val;
    }
    public int GetFront() throws Exception{
        if (isEmpty()){
            throw new Exception("Queue is empty");
        }
        int val = arr[front];
        return val;
    }
    public void Display(){
        for (int i = 0; i <size ; i++) {
            int idx =(front+i)% arr.length;
            System.out.print(arr[idx]+" ");
        }
        System.out.println();
    }

}
