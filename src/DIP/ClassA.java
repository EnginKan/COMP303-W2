package DIP;

public class ClassA {

    interfaceB classB;

    public ClassA(interfaceB b){
        this.classB=b;
    }

    void method(){
        classB.method();
    }
}
