package coupling;

class ArrayStack{
    public int top;
    public int[] itemArray;
    public int stackSize;

    public ArrayStack(int stackSize) {
        itemArray = new int[stackSize];
        top = -1;
        this.stackSize = stackSize;
    }

    public boolean isEmpty() {
        return (top == - 1);
    }

    public boolean isFull() {
        return (top == this.stackSize - 1);
    }

    public void push(int item) {
        if(isFull()) {
            System.out.println("Inserting fail! Array Stack is full!!");
        } else {
            itemArray[++top] = item;
            System.out.println("Inserted Item : " + item);
        }
    }

    public int pop() {
        if(isEmpty()) {
            System.out.println("Deleting fail! Array Stack is empty!");
            return -1;
        } else {
            return itemArray[top--];
        }
    }

    public int peek() {
        if(isEmpty()) {
            System.out.println("Peeking fail! Array Stack is empty");
            return -1;
        } else {
            return itemArray[top];
        }
    }
}

public class StackClient {
    public static void main(String[] args) {
        ArrayStack st = new ArrayStack(10);
        // ArrayStack의 itemArray와 top가 public으로 설정되어있기에 정보은닉이 이루어지지 않았다
        // 그래서 ArrayStack과 StackClient간의 강한결합이 발생한 상태
        // 이후 ArrayStack의 스펙이 변경된다면 ..?
        st.itemArray[++st.top] = 20;
        System.out.println(st.itemArray[st.top]);
    }
}
