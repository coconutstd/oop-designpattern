package polymorphism;

public abstract class Pet {
    public abstract void talk();
}

// Pet을 상속받았으므로 talk를 구현해야 한다.
class Cat extends Pet {
    public void talk() {
        System.out.println("야옹");
    }
}

class Dog extends Pet {
    public void talk() {
        System.out.println("멍멍");
    }
}

class Parrot extends Pet {
    public void talk() {
        System.out.println("안녕");
    }
}

class Main {
    public static void groupTalk(Pet[] p){
        int i;
        for(i = 0; i < 3; ++i){
            p.talk();
        }
    }

    public static void main(String[] args) {
        Pet[] p = {new Cat(), new Dog(), new Parrot()};
        groupTalk(p);
    }
}
