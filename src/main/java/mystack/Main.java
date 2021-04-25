package mystack;

public class Main {
    public static void main(String[] args) {
        MyStack<String> st = new MyStack<String>();

        st.push("1");
        st.push("2");
        // 무결성에 어긋나는 메소드
        st.set(0, "3");
        System.out.println(st.pop());
        System.out.println(st.pop());
    }
}
