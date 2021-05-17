package delegation;

import java.util.*;

// Stack is kind of ArrayList 는 성립하지 않는다. 왜냐하면 대부분의 프로그램에서는 배열을 스택으로 대체할 수 없기 때문
// 이를 위임으로 해결하는 과정

public class MyStack<String>{

    // 자식클래스에 부모클래스를 참조하는 속성을 만들고 이 필드를 this로 초기화한다.
    private ArrayList<String> arList = new ArrayList<String>();

    // 서브클래스에 정의된 각 메서드에 this로 초기화 한 필드를 참조하도록 변경
    public void push(String element) {
        arList.add(element);
    }

    public String pop() {
        return arList.remove(arList.size() - 1);
    }

    public boolean isEmpty() {
        return arList.isEmpty();
    }

    public int size() {
        return arList.size();
    }
}

class Main{
    public static void main(String[] args) {
        MyStack<String> ms = new MyStack<>();
        ms.push("a");
        System.out.println(ms.pop());
    }
}
