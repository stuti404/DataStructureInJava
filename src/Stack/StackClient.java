package Stack;

public class StackClient {
    public static void main(String[] args) throws Exception {
        Sctacks st = new Sctacks(6);
        st.Push(1);
        st.Push(2);
        st.Push(3);
        st.Push(4);
        st.Push(9);
//        st.Push(6);
        System.out.println(st.peek());
        st.Displap();
        st.Pop();
        st.Displap();
        st.Push(88);
        st.Displap();
        System.out.println(st.size());
    }
}
