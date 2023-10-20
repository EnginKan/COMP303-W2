package DIP;

public class Test {
    public static void main(String[] args) {
        ClassB b=new ClassB();
        ClassA clasA=new ClassA(b);
        clasA.method();
    }
}
