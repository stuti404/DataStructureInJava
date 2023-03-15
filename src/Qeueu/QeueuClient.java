package Qeueu;

public class QeueuClient {
    public static void main(String[] args) throws Exception {
        Queue qq = new Queue();
        qq.Enqueue(10);
        qq.Enqueue(2);
        qq.Enqueue(0);
        qq.Enqueue(9);
        qq.Enqueue(15);
        qq.Display();
        qq.Dequeue();
        qq.Dequeue();
        qq.Enqueue(25);
        qq.Display();
    }
}
